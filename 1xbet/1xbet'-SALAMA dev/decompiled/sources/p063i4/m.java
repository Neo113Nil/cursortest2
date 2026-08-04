package p063i4;

import D3.j;
import p098n4.AbstractC0933f;
import p098n4.C0940m;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0933f f14013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14014c;

    public /* synthetic */ m(j jVar, AbstractC0933f abstractC0933f, int i7) {
        this.f14012a = i7;
        this.f14014c = jVar;
        this.f14013b = abstractC0933f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14012a) {
            case 0:
                ((C0940m) this.f14014c.f1723b).o(this.f14013b);
                break;
            default:
                ((C0940m) this.f14014c.f1723b).f(this.f14013b);
                break;
        }
    }
}
