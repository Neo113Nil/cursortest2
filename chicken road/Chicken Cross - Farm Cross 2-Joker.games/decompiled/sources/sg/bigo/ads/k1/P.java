package sg.bigo.ads.k1;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class P {
    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "PORTRAIT";
        }
        if (i == 2) {
            return "LANDSCAPE";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NONE" : "LANDSCAPE" : "PORTRAIT";
    }
}
