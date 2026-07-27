package sg.bigo.ads.s0;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.K0.H;

/* loaded from: classes3.dex */
public final class t {
    public static final AtomicInteger c = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final q f13299a;
    public final r b;

    public t() {
        AtomicInteger atomicInteger = c;
        this.f13299a = new q(atomicInteger.get());
        this.b = new r(atomicInteger.get());
    }

    public final void a() {
        this.f13299a.evictAll();
    }

    public final sg.bigo.ads.U.c b(String str) {
        return (sg.bigo.ads.U.c) this.b.get(str);
    }

    public final void c(String str) {
        this.f13299a.remove(str);
    }

    public final void d(String str) {
        this.b.remove(str);
    }

    public final sg.bigo.ads.U.c a(String str) {
        return (sg.bigo.ads.U.c) this.f13299a.get(str);
    }

    public final void b(String str, sg.bigo.ads.U.c cVar) {
        if (cVar.f12561a.isRecycled()) {
            return;
        }
        this.b.put(str, cVar);
        c.get();
        this.f13299a.size();
    }

    public static t a(Context context) {
        AtomicInteger atomicInteger = c;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(H.b(context));
            atomicInteger.get();
        }
        return s.f13298a;
    }

    public final void a(String str, sg.bigo.ads.U.c cVar) {
        if (cVar.f12561a.isRecycled()) {
            return;
        }
        this.f13299a.put(str, cVar);
        c.get();
        this.f13299a.size();
    }
}
