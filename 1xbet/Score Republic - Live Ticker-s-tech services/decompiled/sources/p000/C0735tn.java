package p000;

import android.content.Context;

/* JADX INFO: renamed from: tn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735tn implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7533a;

    /* JADX INFO: renamed from: b */
    public final Object f7534b;

    public /* synthetic */ C0735tn(int i, Object obj) {
        this.f7533a = i;
        this.f7534b = obj;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f7533a;
        Object obj = this.f7534b;
        switch (i) {
            case 0:
                return new qd0((Context) ((C0735tn) obj).f7534b, new aa0(20), new x80(18), 10);
            default:
                return obj;
        }
    }
}
