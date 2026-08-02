package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z32 implements InterfaceC0387k8 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ z32 f9597b = new z32(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z32 f9598c = new z32(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9599a;

    public /* synthetic */ z32(int i) {
        this.f9599a = i;
    }

    @Override // p000.InterfaceC0387k8
    public final ListenableFuture apply(Object obj) {
        switch (this.f9599a) {
            case 0:
                C0642r4 c0642r4 = (C0642r4) obj;
                throw new y32(c0642r4.f6704j.f1341j, c0642r4.getMessage(), c0642r4);
            case 1:
                throw null;
            default:
                return k70.m2993d("");
        }
    }
}
