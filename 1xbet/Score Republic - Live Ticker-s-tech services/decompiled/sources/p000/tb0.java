package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 {

    /* JADX INFO: renamed from: a */
    public final String f7403a;

    /* JADX INFO: renamed from: b */
    public final int f7404b;

    /* JADX INFO: renamed from: c */
    public final String f7405c;

    public tb0(C0163e6 c0163e6) {
        String str = (String) c0163e6.f1965l;
        this.f7403a = (String) c0163e6.f1966m;
        int i = c0163e6.f1964k;
        this.f7404b = i == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i;
        this.f7405c = c0163e6.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m4781a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tb0) && ((tb0) obj).f7405c.equals(this.f7405c);
    }

    public final int hashCode() {
        return this.f7405c.hashCode();
    }

    public final String toString() {
        return this.f7405c;
    }
}
