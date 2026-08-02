package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.C0692d;
import com.facebook.appevents.ondeviceprocessing.c;
import com.facebook.internal.n;
import com.facebook.internal.p;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class b {
    public static final b a = new b();

    @JvmStatic
    public static final Bundle a(c.a eventType, String applicationId, List<C0692d> appEvents) {
        if (!com.facebook.internal.instrument.crashshield.a.b(b.class)) {
            try {
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_EVENT, eventType.a);
                bundle.putString("app_id", applicationId);
                if (c.a.CUSTOM_APP_EVENTS != eventType) {
                    return bundle;
                }
                JSONArray b = a.b(applicationId, appEvents);
                if (b.length() != 0) {
                    bundle.putString("custom_events", b.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, b.class);
                return null;
            }
        }
        return null;
    }

    public final JSONArray b(String str, List list) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C0692d> mutableList = CollectionsKt.toMutableList((Collection) list);
            com.facebook.appevents.eventdeactivation.a.b(mutableList);
            boolean z = false;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    n k = p.k(str, false);
                    if (k != null) {
                        z = k.a;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
            for (C0692d c0692d : mutableList) {
                boolean z2 = c0692d.c;
                if (!z2 || (z2 && z)) {
                    jSONArray.put(c0692d.a);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }
}
