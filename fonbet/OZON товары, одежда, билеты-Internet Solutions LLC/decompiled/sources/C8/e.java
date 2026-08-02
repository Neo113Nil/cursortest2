package C8;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f4491d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f4492e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final h f4493a = h.b();

    /* renamed from: b, reason: collision with root package name */
    private long f4494b;

    /* renamed from: c, reason: collision with root package name */
    private int f4495c;

    e() {
    }

    public final synchronized boolean a() {
        boolean z11;
        if (this.f4495c != 0) {
            z11 = this.f4493a.a() > this.f4494b;
        }
        return z11;
    }

    public final synchronized void b(int i11) {
        long min;
        if ((i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404) {
            synchronized (this) {
                this.f4495c = 0;
            }
            return;
        }
        this.f4495c++;
        synchronized (this) {
            if (i11 == 429 || (i11 >= 500 && i11 < 600)) {
                double pow = Math.pow(2.0d, this.f4495c);
                this.f4493a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f4492e);
            } else {
                min = f4491d;
            }
            this.f4494b = this.f4493a.a() + min;
        }
        return;
    }
}
