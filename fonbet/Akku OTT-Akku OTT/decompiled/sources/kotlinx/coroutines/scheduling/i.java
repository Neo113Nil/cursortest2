package kotlinx.coroutines.scheduling;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.bumptech.glide.load.engine.q;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.y;

/* loaded from: classes5.dex */
public final class i {

    @JvmField
    public static final String a;

    @JvmField
    public static final long b;

    @JvmField
    public static final int c;

    @JvmField
    public static final int d;

    @JvmField
    public static final long e;

    @JvmField
    public static final e f;

    static {
        String str;
        int i = y.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = q.b(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        c = q.c(RangesKt.coerceAtLeast(y.a, 2), 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = q.c(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(q.b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = e.a;
    }
}
