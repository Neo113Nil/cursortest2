package w1;

import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class A2 extends C2 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f17280e = new AtomicInteger(0);

    public static void c(int i7, String str, String str2) {
        d(str, str2 == null ? Collections.emptyList() : Collections.singletonList(str2), i7);
    }

    public static void d(String str, List list, int i7) {
        C1759x1.z().A(new A2(new B2(f17280e.incrementAndGet(), SystemClock.elapsedRealtime(), str, list, i7)));
    }

    @Override // w1.C2
    public final D2 a() {
        return D2.USER_PROPERTY;
    }
}
