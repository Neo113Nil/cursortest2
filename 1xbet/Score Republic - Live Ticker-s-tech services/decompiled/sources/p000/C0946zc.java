package p000;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0946zc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9731a;

    /* JADX INFO: renamed from: a */
    public final int m5873a(Object obj) {
        switch (this.f9731a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5874b() {
        switch (this.f9731a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5875c() {
        switch (this.f9731a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
