package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.O;
import i4.InterfaceC2015a;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0524c implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7319k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7320l;

    public /* synthetic */ C0524c(AbstractActivityC0531j abstractActivityC0531j, int i) {
        this.f7319k = i;
        this.f7320l = abstractActivityC0531j;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f7319k) {
            case 0:
                this.f7320l.reportFullyDrawn();
                return W3.o.f6046a;
            case 1:
                AbstractActivityC0531j abstractActivityC0531j = this.f7320l;
                return new v(abstractActivityC0531j.f7344p, new C0524c(abstractActivityC0531j, 0));
            case 2:
                I1.a aVar = new I1.a();
                this.f7320l.c().e(aVar);
                return aVar;
            case 3:
                AbstractActivityC0531j abstractActivityC0531j2 = this.f7320l;
                return new O(abstractActivityC0531j2.getApplication(), abstractActivityC0531j2, abstractActivityC0531j2.getIntent() != null ? abstractActivityC0531j2.getIntent().getExtras() : null);
            default:
                AbstractActivityC0531j abstractActivityC0531j3 = this.f7320l;
                C0519F c0519f = new C0519F(new RunnableC0523b(abstractActivityC0531j3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0531j3.getClass();
                        abstractActivityC0531j3.f16854k.a(new C0525d(c0519f, abstractActivityC0531j3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Q3.g(1, abstractActivityC0531j3, c0519f));
                    }
                }
                return c0519f;
        }
    }
}
