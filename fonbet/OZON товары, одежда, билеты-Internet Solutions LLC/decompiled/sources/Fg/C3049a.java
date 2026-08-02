package Fg;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: Fg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3049a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f9459a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());

    /* renamed from: b, reason: collision with root package name */
    private static final long f9460b = SystemClock.elapsedRealtimeNanos();

    public static final long a() {
        return (SystemClock.elapsedRealtimeNanos() + f9459a) - f9460b;
    }
}
