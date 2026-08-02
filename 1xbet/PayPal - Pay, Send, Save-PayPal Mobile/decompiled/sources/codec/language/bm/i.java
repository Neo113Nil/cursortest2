package codec.language.bm;

/* loaded from: classes7.dex */
public final class i extends codec.language.bm.Rule {
    public final int f;
    public final java.lang.String g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, codec.language.bm.Rule.PhonemeExpr phonemeExpr, int i, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        super(str, str2, str3, phonemeExpr);
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.f = i;
        this.g = str4;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rule{line=");
        sb.append(this.f);
        sb.append(", loc='");
        sb.append(this.g);
        sb.append("', pat='");
        sb.append(this.h);
        sb.append("', lcon='");
        sb.append(this.i);
        sb.append("', rcon='");
        sb.append(this.j);
        sb.append("'}");
        return sb.toString();
    }
}
