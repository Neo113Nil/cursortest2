package P70;

import B30.f;
import java.util.concurrent.CountDownLatch;
import k5.C7556q0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21943d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11) {
        this.f21940a = i11;
        this.f21941b = obj;
        this.f21942c = obj2;
        this.f21943d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21940a) {
            case 0:
                h.f0((f.d) this.f21941b, (h) this.f21942c, (String) this.f21943d);
                break;
            default:
                int[] iArr = (int[]) this.f21942c;
                Qm0.a aVar = (Qm0.a) this.f21941b;
                ((zone.bi.mobile.fingerprint.impl.cs.b) aVar).b(new C7556q0(iArr, aVar, (CountDownLatch) this.f21943d));
                break;
        }
    }
}
