package kotlinx.serialization.json.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n1863#3,2:134\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n109#1:134,2\n*E\n"})
/* loaded from: classes5.dex */
public class F {

    @JvmField
    public int a;

    @JvmField
    public final r b;
    public String c;
    public final StringBuilder d;
    public final String e;

    public F(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        r rVar = new r();
        rVar.a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        rVar.b = iArr;
        rVar.c = -1;
        this.b = rVar;
        this.d = new StringBuilder();
        this.e = source;
    }

    public static /* synthetic */ void m(F f, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = f.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        f.l(i, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (o(charSequence, i + 3) + (o(charSequence, i) << 12) + (o(charSequence, i + 1) << 8) + (o(charSequence, i + 2) << 4)));
            return i2;
        }
        this.a = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.a);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        if (p().length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (p().charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public final String d() {
        int indexOf$default;
        g(Typography.quote);
        int i = this.a;
        String source = this.e;
        indexOf$default = StringsKt__StringsKt.indexOf$default(source, Typography.quote, i, false, 4, (Object) null);
        if (indexOf$default == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < indexOf$default) {
            if (source.charAt(i2) == '\\') {
                int i3 = this.a;
                Intrinsics.checkNotNullParameter(source, "source");
                char charAt = source.charAt(i2);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        this.d.append((CharSequence) p(), i3, i2);
                        int t = t(i2 + 1);
                        if (t == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i4 = t + 1;
                        char charAt2 = source.charAt(t);
                        if (charAt2 == 'u') {
                            i4 = a(source, i4);
                        } else {
                            char c = charAt2 < 'u' ? C1181e.a[charAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.d.append(c);
                        }
                        i3 = t(i4);
                        if (i3 == -1) {
                            m(this, "Unexpected EOF", i3, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= source.length()) {
                            this.d.append((CharSequence) p(), i3, i2);
                            i3 = t(i2);
                            if (i3 == -1) {
                                m(this, "Unexpected EOF", i3, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = source.charAt(i2);
                        }
                    }
                    i2 = i3;
                    z = true;
                    charAt = source.charAt(i2);
                }
                String obj = !z ? p().subSequence(i3, i2).toString() : k(i3, i2);
                this.a = i2 + 1;
                return obj;
            }
            i2++;
        }
        this.a = indexOf$default + 1;
        String substring = source.substring(i, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        String str;
        int i = this.a;
        while (true) {
            str = this.e;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                return com.bumptech.glide.load.data.mediastore.b.a(charAt);
            }
            i = i2;
        }
        this.a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b) {
        byte e = e();
        if (e == b) {
            return e;
        }
        n(b, true);
        throw null;
    }

    public void g(char c) {
        int i = this.a;
        if (i == -1) {
            w(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                w(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.a = i2;
                if (charAt == c) {
                    return;
                }
                w(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        m(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ca, code lost:
    
        m(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        m(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (p().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        m(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        m(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        r21.a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h() {
        boolean z;
        boolean z2;
        boolean z3;
        int t = t(u());
        int i = 0;
        if (t < p().length() && t != -1) {
            if (p().charAt(t) == '\"') {
                t++;
                if (t == p().length()) {
                    m(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i2 = t;
            int i3 = 0;
            boolean z4 = false;
            boolean z5 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i2 == p().length()) {
                    z2 = z;
                    z3 = z4;
                    break;
                }
                char charAt = p().charAt(i2);
                if ((charAt != 'e' && charAt != 'E') || z4) {
                    z2 = z;
                    if (charAt == '-' && z4) {
                        if (i2 == t) {
                            m(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        i3 = i;
                        z = z2;
                    } else if (charAt != '+' || !z4) {
                        z3 = z4;
                        if (charAt != '-') {
                            if (com.bumptech.glide.load.data.mediastore.b.a(charAt) != 0) {
                                break;
                            }
                            i2++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + i4;
                                z = z2;
                                z4 = z3;
                            } else {
                                j2 = (j2 * 10) - i4;
                                if (j2 > 0) {
                                    m(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z = z2;
                                z4 = z3;
                                i = 0;
                            }
                        } else {
                            if (i2 != t) {
                                m(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                                throw null;
                            }
                            i2++;
                            z = z2;
                            z4 = z3;
                            z5 = true;
                        }
                    } else {
                        if (i2 == t) {
                            m(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        z = z2;
                        i3 = 1;
                    }
                } else {
                    if (i2 == t) {
                        m(this, "Unexpected symbol " + charAt + " in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    i3 = 1;
                    z4 = true;
                }
            }
        } else {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String i() {
        String str = this.c;
        if (str == null) {
            return d();
        }
        Intrinsics.checkNotNull(str);
        this.c = null;
        return str;
    }

    public final String j() {
        String k;
        String str = this.c;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.c = null;
            return str;
        }
        int u = u();
        if (u >= p().length() || u == -1) {
            m(this, "EOF", u, null, 4);
            throw null;
        }
        byte a = com.bumptech.glide.load.data.mediastore.b.a(p().charAt(u));
        if (a == 1) {
            return i();
        }
        if (a != 0) {
            m(this, "Expected beginning of the string, but got " + p().charAt(u), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (com.bumptech.glide.load.data.mediastore.b.a(p().charAt(u)) == 0) {
            u++;
            if (u >= p().length()) {
                this.d.append((CharSequence) p(), this.a, u);
                int t = t(u);
                if (t == -1) {
                    this.a = u;
                    return k(0, 0);
                }
                u = t;
                z = true;
            }
        }
        if (z) {
            k = k(this.a, u);
        } else {
            k = p().subSequence(this.a, u).toString();
        }
        this.a = u;
        return k;
    }

    public final String k(int i, int i2) {
        this.d.append((CharSequence) p(), i, i2);
        StringBuilder sb = this.d;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public final void l(int i, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder d = androidx.browser.browseractions.a.d(message, " at path: ");
        d.append(this.b.a());
        d.append(concat);
        throw o.e(d.toString(), p(), i);
    }

    public final void n(byte b, boolean z) {
        String d = com.bumptech.glide.load.data.mediastore.b.d(b);
        int i = z ? this.a - 1 : this.a;
        m(this, androidx.core.database.a.d("Expected ", d, ", but had '", (this.a == p().length() || i < 0) ? "EOF" : String.valueOf(p().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int o(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String p() {
        return this.e;
    }

    public final String q(String keyToMatch) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.a;
        try {
            if (e() == 6 && Intrinsics.areEqual(s(), keyToMatch)) {
                this.c = null;
                if (e() == 5) {
                    return s();
                }
            }
            return null;
        } finally {
            this.a = i;
            this.c = null;
        }
    }

    public byte r() {
        String p = p();
        int i = this.a;
        while (true) {
            int t = t(i);
            if (t == -1) {
                this.a = t;
                return (byte) 10;
            }
            char charAt = p.charAt(t);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.a = t;
                return com.bumptech.glide.load.data.mediastore.b.a(charAt);
            }
            i = t + 1;
        }
    }

    public final String s() {
        if (r() != 1) {
            return null;
        }
        String i = i();
        this.c = i;
        return i;
    }

    public final int t(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) p());
        sb.append("', currentPosition=");
        return androidx.collection.i.c(sb, this.a, ')');
    }

    public int u() {
        char charAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    public final boolean v() {
        int u = u();
        String p = p();
        if (u >= p.length() || u == -1 || p.charAt(u) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final void w(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String j = j();
                this.a = i;
                if (Intrinsics.areEqual(j, "null")) {
                    l(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        n(com.bumptech.glide.load.data.mediastore.b.a(c), true);
        throw null;
    }
}
