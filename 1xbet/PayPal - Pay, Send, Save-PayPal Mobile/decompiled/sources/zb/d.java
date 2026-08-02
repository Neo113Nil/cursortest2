package zb;

/* loaded from: classes18.dex */
public enum d {
    RID_EFTPOS("A000000384"),
    RID_AMEX("A000000025"),
    RID_VISA("A000000003"),
    RID_UPI("A000000333"),
    RID_JCB("A000000065");

    public final java.lang.String g;

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.g;
    }

    d(java.lang.String str) {
        this.g = str;
    }
}
