package X0;

import F6.p;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements O.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7447b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f7446a = i7;
        this.f7447b = obj;
    }

    @Override // O.a
    public final void accept(Object obj) {
        switch (this.f7446a) {
            case 0:
                ((F6.o) ((p) this.f7447b)).e((l) obj);
                break;
            default:
                ((q5.m) this.f7447b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}
