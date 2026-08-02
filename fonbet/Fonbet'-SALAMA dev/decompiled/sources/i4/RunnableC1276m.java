package i4;

import n4.AbstractC1472f;
import n4.C1479m;

/* renamed from: i4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1276m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1472f f14007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D3.j f14008c;

    public /* synthetic */ RunnableC1276m(D3.j jVar, AbstractC1472f abstractC1472f, int i7) {
        this.f14006a = i7;
        this.f14008c = jVar;
        this.f14007b = abstractC1472f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14006a) {
            case 0:
                ((C1479m) this.f14008c.f1723b).o(this.f14007b);
                break;
            default:
                ((C1479m) this.f14008c.f1723b).f(this.f14007b);
                break;
        }
    }
}
