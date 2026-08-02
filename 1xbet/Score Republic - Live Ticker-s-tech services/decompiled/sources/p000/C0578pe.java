package p000;

import java.io.File;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0578pe implements InterfaceC0254gm, nw0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6102j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0652re f6103k;

    public /* synthetic */ C0578pe(C0652re c0652re, int i) {
        this.f6102j = i;
        this.f6103k = c0652re;
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        switch (this.f6102j) {
            case 0:
                this.f6103k.f6829d = (C0599pz) obj;
                break;
            default:
                this.f6103k.f6829d = null;
                break;
        }
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        C0652re c0652re = this.f6103k;
        c0652re.getClass();
        long jM4012p = ((C0599pz) obj).m4012p();
        c0652re.f6828c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(c0652re.f6827b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (jM4012p != 0) {
            return jCurrentTimeMillis < jM4012p;
        }
        return !file.exists() || jCurrentTimeMillis < file.lastModified() + 86400000;
    }
}
