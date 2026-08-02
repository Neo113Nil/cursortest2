package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIlIIlIll {
    public final com.microblink.blinkid.secured.IIlIIIlIIl IlIllIlIIl;
    public final boolean IllIIIIllI;
    public final boolean IllIIIllII;
    public final boolean llIIIlllll;
    public final com.microblink.blinkid.secured.IIlIIIlIIl llIIlIlIIl;

    public IlIlIIlIll(java.lang.String str) {
        this.llIIlIlIIl = null;
        this.IlIllIlIIl = null;
        this.IllIIIllII = false;
        this.llIIIlllll = true;
        this.IllIIIIllI = true;
        if (str == null || str.length() == 0) {
            throw new java.lang.NullPointerException("Interval expression cannot be null nor empty!");
        }
        java.lang.String trim = str.trim();
        if ("*".equals(trim)) {
            this.IllIIIllII = true;
            return;
        }
        if (trim.charAt(0) == '[') {
            this.llIIIlllll = true;
        } else {
            if (trim.charAt(0) != '<') {
                throw new java.lang.IllegalArgumentException("Invalid version interval: ".concat(trim));
            }
            this.llIIIlllll = false;
        }
        int length = trim.length() - 1;
        if (trim.charAt(length) == ']') {
            this.IllIIIIllI = true;
        } else {
            if (trim.charAt(length) != '>') {
                throw new java.lang.IllegalArgumentException("Invalid version interval: ".concat(trim));
            }
            this.IllIIIIllI = false;
        }
        java.lang.String[] split = trim.substring(1, length).split(",");
        if (split.length != 2) {
            throw new java.lang.IllegalArgumentException("Invalid version interval: ".concat(trim));
        }
        if (!"*".equals(split[0])) {
            this.llIIlIlIIl = new com.microblink.blinkid.secured.IIlIIIlIIl(split[0]);
        }
        if ("*".equals(split[1])) {
            return;
        }
        this.IlIllIlIIl = new com.microblink.blinkid.secured.IIlIIIlIIl(split[1]);
    }

    public final boolean llIIlIlIIl(com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl) {
        if (this.IllIIIllII) {
            return true;
        }
        com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl2 = this.llIIlIlIIl;
        if (iIlIIIlIIl2 != null && (!this.llIIIlllll ? iIlIIIlIIl.IlIllIlIIl(iIlIIIlIIl2) : iIlIIIlIIl.llIIlIlIIl(iIlIIIlIIl2))) {
            return false;
        }
        com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl3 = this.IlIllIlIIl;
        return iIlIIIlIIl3 == null || (!this.IllIIIIllI ? !iIlIIIlIIl3.IlIllIlIIl(iIlIIIlIIl) : !iIlIIIlIIl3.llIIlIlIIl(iIlIIIlIIl));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.IllIIIllII) {
            sb.append('*');
        } else {
            if (this.llIIIlllll) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            } else {
                sb.append(kotlin.text.Typography.less);
            }
            com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl = this.llIIlIlIIl;
            if (iIlIIIlIIl != null) {
                sb.append(iIlIIIlIIl.toString());
            } else {
                sb.append('*');
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            com.microblink.blinkid.secured.IIlIIIlIIl iIlIIIlIIl2 = this.IlIllIlIIl;
            if (iIlIIIlIIl2 != null) {
                sb.append(iIlIIIlIIl2.toString());
            } else {
                sb.append('*');
            }
            if (this.IllIIIIllI) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(kotlin.text.Typography.greater);
            }
        }
        return sb.toString();
    }
}
