package j$.time.format;

/* loaded from: classes6.dex */
public final class m implements e {
    public final String a;

    public m(String str) {
        this.a = str;
    }

    @Override // j$.time.format.e
    public final boolean o(s sVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.e
    public final int v(p pVar, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.a;
        return !pVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
