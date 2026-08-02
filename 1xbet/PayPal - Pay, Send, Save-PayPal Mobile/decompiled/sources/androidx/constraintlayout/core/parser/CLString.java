package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLString extends androidx.constraintlayout.core.parser.CLElement {
    public CLString(char[] cArr) {
        super(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLString(cArr);
    }

    public static androidx.constraintlayout.core.parser.CLString from(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLString cLString = new androidx.constraintlayout.core.parser.CLString(str.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str.length() - 1);
        return cLString;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(content());
        sb.append("'");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        sb.append("'");
        sb.append(content());
        sb.append("'");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof androidx.constraintlayout.core.parser.CLString) && content().equals(((androidx.constraintlayout.core.parser.CLString) obj).content())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }
}
