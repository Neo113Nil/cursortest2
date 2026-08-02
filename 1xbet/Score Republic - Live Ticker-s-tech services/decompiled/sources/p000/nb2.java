package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum nb2 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* JADX INFO: renamed from: o */
    public static final nb2[] f5361o = new nb2[26];

    /* JADX INFO: renamed from: j */
    public final char f5363j;

    /* JADX INFO: renamed from: k */
    public final int f5364k;

    /* JADX INFO: renamed from: l */
    public final int f5365l;

    /* JADX INFO: renamed from: m */
    public final String f5366m;

    static {
        for (nb2 nb2Var : values()) {
            f5361o[(nb2Var.f5363j | ' ') - 97] = nb2Var;
        }
    }

    nb2(char c, int i, String str, boolean z) {
        this.f5363j = c;
        this.f5364k = i;
        pb2 pb2Var = pb2.f6076e;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iCharAt = ((int) ((pb2.f6075d >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                C0270h1.m2190f("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.f5365l = i2;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1);
        sb.append("%");
        sb.append(c);
        this.f5366m = sb.toString();
    }
}
