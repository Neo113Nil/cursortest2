package androidx.work.impl.foreground;

import androidx.work.impl.C;
import g5.C6627B;
import g5.S;

/* loaded from: classes8.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45444a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f45445b;

    a(b bVar, String str) {
        this.f45445b = bVar;
        this.f45444a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c11;
        c11 = this.f45445b.f45447a;
        C6627B d11 = c11.k().d(this.f45444a);
        if (d11 == null || !d11.e()) {
            return;
        }
        synchronized (this.f45445b.f45449c) {
            this.f45445b.f45452f.put(S.a(d11), d11);
            this.f45445b.f45453g.add(d11);
            b bVar = this.f45445b;
            bVar.f45454h.d(bVar.f45453g);
        }
    }
}
