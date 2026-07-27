package I1;

import g0.C0311j;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f635b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f634a = i3;
        this.f635b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f634a) {
            case 0:
                ((q) this.f635b).setWindowInfoListenerDisplayFeatures((C0311j) obj);
                break;
            default:
                ((y2.n) ((y2.o) this.f635b)).j((C0311j) obj);
                break;
        }
    }
}
