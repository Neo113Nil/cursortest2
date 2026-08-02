package org.betup.utils;

import android.content.Context;
import android.widget.Toast;
import com.google.common.net.HttpHeaders;
import okhttp3.Headers;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* loaded from: classes4.dex */
public final class Profiler {
    private Profiler() {
    }

    public static void showHeaders(Context context, Headers headers) {
        String str;
        if (SharedPrefs.getProfilerEnabled(context)) {
            try {
                str = String.valueOf(Long.valueOf(headers.get("OkHttp-Received-Millis")).longValue() - Long.valueOf(headers.get("OkHttp-Sent-Millis")).longValue());
            } catch (Exception e) {
                e.printStackTrace();
                str = TypeDescription.Generic.OfWildcardType.SYMBOL;
            }
            Toast.makeText(context, ((((("Date: " + headers.get(HttpHeaders.DATE) + "\n") + "X-Debug-Token: " + headers.get("X-Debug-Token") + "\n") + "X-Debug-Token-Link: " + headers.get("X-Debug-Token-Link") + "\n") + "OkHttp-Received-Millis: " + headers.get("OkHttp-Received-Millis") + "\n") + "OkHttp-Sent-Millis: " + headers.get("OkHttp-Sent-Millis") + "\n") + "Time-Took-Millis: " + str, 1).show();
        }
    }

    public static void change(Context context) {
        if (SharedPrefs.getProfilerEnabled(context)) {
            SharedPrefs.setProfilerEnabled(context, false);
            Toast.makeText(context, "Profiler disabled!", 0).show();
        } else {
            SharedPrefs.setProfilerEnabled(context, true);
            Toast.makeText(context, "Profiler enabled!", 0).show();
        }
    }
}
