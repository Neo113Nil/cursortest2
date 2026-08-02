package W5;

import U5.AbstractC0442i;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7318a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f7319b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7320c;

    public r(C0537s c0537s, long j) {
        this.f7320c = c0537s;
        this.f7319b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7318a) {
            case 0:
                R4.c cVar = new R4.c(10);
                C0537s c0537s = (C0537s) this.f7320c;
                c0537s.j.d(cVar);
                long j = this.f7319b;
                long abs = Math.abs(j);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long nanos = abs / timeUnit.toNanos(1L);
                long abs2 = Math.abs(j) % timeUnit.toNanos(1L);
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j < 0) {
                    sb.append('-');
                }
                sb.append(nanos);
                Locale locale = Locale.US;
                sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
                sb.append("s. ");
                sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) c0537s.f7333i.a(AbstractC0442i.f6506a)) == null ? 0.0d : r3.longValue() / C0537s.f7324r)));
                sb.append(cVar);
                c0537s.j.f(U5.l0.f6539h.a(sb.toString()));
                break;
            default:
                FlutterJNI flutterJNI = (FlutterJNI) this.f7320c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(this.f7319b);
                    break;
                }
                break;
        }
    }

    public r(long j, FlutterJNI flutterJNI) {
        this.f7319b = j;
        this.f7320c = flutterJNI;
    }
}
