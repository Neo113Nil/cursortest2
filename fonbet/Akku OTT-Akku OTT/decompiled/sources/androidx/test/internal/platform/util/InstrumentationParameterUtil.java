package androidx.test.internal.platform.util;

import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class InstrumentationParameterUtil {
    public static long getTimeoutMillis(String str, long j) {
        Checks.checkArgument(j != 0, "default timeout value cannot be zero");
        long parseLong = Long.parseLong(InstrumentationRegistry.getArguments().getString(str, SessionDescription.SUPPORTED_SDP_VERSION));
        if (parseLong != 0) {
            j = parseLong;
        }
        return j < 0 ? TimeUnit.DAYS.toMillis(1L) : j;
    }
}
