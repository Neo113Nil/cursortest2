package X0;

import F6.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements O.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
                ((p121q5.m) this.f7447b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}
