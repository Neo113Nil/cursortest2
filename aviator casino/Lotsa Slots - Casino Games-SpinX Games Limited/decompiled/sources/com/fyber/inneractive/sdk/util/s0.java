package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class s0 {
    public static final com.fyber.inneractive.sdk.util.s0 b;
    public static final com.fyber.inneractive.sdk.util.s0 c;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.r0 f4311a = new com.fyber.inneractive.sdk.util.r0();

    static {
        java.lang.String[][] strArr = {new java.lang.String[]{"quot", "34"}, new java.lang.String[]{"amp", "38"}, new java.lang.String[]{"lt", "60"}, new java.lang.String[]{"gt", "62"}};
        java.lang.String[][] strArr2 = {new java.lang.String[]{"apos", "39"}};
        java.lang.String[][] strArr3 = {new java.lang.String[]{"nbsp", "160"}, new java.lang.String[]{"iexcl", "161"}, new java.lang.String[]{"cent", "162"}, new java.lang.String[]{"pound", "163"}, new java.lang.String[]{"curren", "164"}, new java.lang.String[]{"yen", "165"}, new java.lang.String[]{"brvbar", "166"}, new java.lang.String[]{"sect", "167"}, new java.lang.String[]{"uml", "168"}, new java.lang.String[]{"copy", "169"}, new java.lang.String[]{"ordf", "170"}, new java.lang.String[]{"laquo", "171"}, new java.lang.String[]{"not", "172"}, new java.lang.String[]{"shy", "173"}, new java.lang.String[]{"reg", "174"}, new java.lang.String[]{"macr", "175"}, new java.lang.String[]{"deg", "176"}, new java.lang.String[]{"plusmn", "177"}, new java.lang.String[]{"sup2", "178"}, new java.lang.String[]{"sup3", "179"}, new java.lang.String[]{"acute", "180"}, new java.lang.String[]{"micro", "181"}, new java.lang.String[]{"para", "182"}, new java.lang.String[]{"middot", "183"}, new java.lang.String[]{"cedil", "184"}, new java.lang.String[]{"sup1", "185"}, new java.lang.String[]{"ordm", "186"}, new java.lang.String[]{"raquo", "187"}, new java.lang.String[]{"frac14", "188"}, new java.lang.String[]{"frac12", "189"}, new java.lang.String[]{"frac34", "190"}, new java.lang.String[]{"iquest", "191"}, new java.lang.String[]{"Agrave", "192"}, new java.lang.String[]{"Aacute", "193"}, new java.lang.String[]{"Acirc", "194"}, new java.lang.String[]{"Atilde", "195"}, new java.lang.String[]{"Auml", "196"}, new java.lang.String[]{"Aring", "197"}, new java.lang.String[]{"AElig", "198"}, new java.lang.String[]{"Ccedil", "199"}, new java.lang.String[]{"Egrave", "200"}, new java.lang.String[]{"Eacute", "201"}, new java.lang.String[]{"Ecirc", "202"}, new java.lang.String[]{"Euml", "203"}, new java.lang.String[]{"Igrave", "204"}, new java.lang.String[]{"Iacute", "205"}, new java.lang.String[]{"Icirc", "206"}, new java.lang.String[]{"Iuml", "207"}, new java.lang.String[]{"ETH", "208"}, new java.lang.String[]{"Ntilde", "209"}, new java.lang.String[]{"Ograve", "210"}, new java.lang.String[]{"Oacute", "211"}, new java.lang.String[]{"Ocirc", "212"}, new java.lang.String[]{"Otilde", "213"}, new java.lang.String[]{"Ouml", "214"}, new java.lang.String[]{"times", "215"}, new java.lang.String[]{"Oslash", "216"}, new java.lang.String[]{"Ugrave", "217"}, new java.lang.String[]{"Uacute", "218"}, new java.lang.String[]{"Ucirc", "219"}, new java.lang.String[]{"Uuml", "220"}, new java.lang.String[]{"Yacute", "221"}, new java.lang.String[]{"THORN", "222"}, new java.lang.String[]{"szlig", "223"}, new java.lang.String[]{"agrave", "224"}, new java.lang.String[]{"aacute", "225"}, new java.lang.String[]{"acirc", "226"}, new java.lang.String[]{"atilde", "227"}, new java.lang.String[]{"auml", "228"}, new java.lang.String[]{"aring", "229"}, new java.lang.String[]{"aelig", "230"}, new java.lang.String[]{"ccedil", "231"}, new java.lang.String[]{"egrave", "232"}, new java.lang.String[]{"eacute", "233"}, new java.lang.String[]{"ecirc", "234"}, new java.lang.String[]{"euml", "235"}, new java.lang.String[]{"igrave", "236"}, new java.lang.String[]{"iacute", "237"}, new java.lang.String[]{"icirc", "238"}, new java.lang.String[]{"iuml", "239"}, new java.lang.String[]{"eth", "240"}, new java.lang.String[]{"ntilde", "241"}, new java.lang.String[]{"ograve", "242"}, new java.lang.String[]{"oacute", "243"}, new java.lang.String[]{"ocirc", "244"}, new java.lang.String[]{"otilde", "245"}, new java.lang.String[]{"ouml", "246"}, new java.lang.String[]{"divide", "247"}, new java.lang.String[]{"oslash", "248"}, new java.lang.String[]{"ugrave", "249"}, new java.lang.String[]{"uacute", "250"}, new java.lang.String[]{"ucirc", "251"}, new java.lang.String[]{"uuml", "252"}, new java.lang.String[]{"yacute", "253"}, new java.lang.String[]{"thorn", "254"}, new java.lang.String[]{"yuml", "255"}};
        java.lang.String[][] strArr4 = {new java.lang.String[]{"fnof", "402"}, new java.lang.String[]{"Alpha", "913"}, new java.lang.String[]{"Beta", "914"}, new java.lang.String[]{androidx.exifinterface.media.ExifInterface.TAG_GAMMA, "915"}, new java.lang.String[]{"Delta", "916"}, new java.lang.String[]{"Epsilon", "917"}, new java.lang.String[]{"Zeta", "918"}, new java.lang.String[]{"Eta", "919"}, new java.lang.String[]{"Theta", "920"}, new java.lang.String[]{"Iota", "921"}, new java.lang.String[]{"Kappa", "922"}, new java.lang.String[]{"Lambda", "923"}, new java.lang.String[]{"Mu", "924"}, new java.lang.String[]{"Nu", "925"}, new java.lang.String[]{"Xi", "926"}, new java.lang.String[]{"Omicron", "927"}, new java.lang.String[]{"Pi", "928"}, new java.lang.String[]{"Rho", "929"}, new java.lang.String[]{"Sigma", "931"}, new java.lang.String[]{"Tau", "932"}, new java.lang.String[]{"Upsilon", "933"}, new java.lang.String[]{"Phi", "934"}, new java.lang.String[]{"Chi", "935"}, new java.lang.String[]{"Psi", "936"}, new java.lang.String[]{"Omega", "937"}, new java.lang.String[]{"alpha", "945"}, new java.lang.String[]{"beta", "946"}, new java.lang.String[]{"gamma", "947"}, new java.lang.String[]{"delta", "948"}, new java.lang.String[]{"epsilon", "949"}, new java.lang.String[]{"zeta", "950"}, new java.lang.String[]{"eta", "951"}, new java.lang.String[]{"theta", "952"}, new java.lang.String[]{"iota", "953"}, new java.lang.String[]{"kappa", "954"}, new java.lang.String[]{"lambda", "955"}, new java.lang.String[]{"mu", "956"}, new java.lang.String[]{"nu", "957"}, new java.lang.String[]{"xi", "958"}, new java.lang.String[]{"omicron", "959"}, new java.lang.String[]{"pi", "960"}, new java.lang.String[]{"rho", "961"}, new java.lang.String[]{"sigmaf", "962"}, new java.lang.String[]{"sigma", "963"}, new java.lang.String[]{"tau", "964"}, new java.lang.String[]{"upsilon", "965"}, new java.lang.String[]{"phi", "966"}, new java.lang.String[]{"chi", "967"}, new java.lang.String[]{"psi", "968"}, new java.lang.String[]{"omega", "969"}, new java.lang.String[]{"thetasym", "977"}, new java.lang.String[]{"upsih", "978"}, new java.lang.String[]{"piv", "982"}, new java.lang.String[]{"bull", "8226"}, new java.lang.String[]{"hellip", "8230"}, new java.lang.String[]{"prime", "8242"}, new java.lang.String[]{"Prime", "8243"}, new java.lang.String[]{"oline", "8254"}, new java.lang.String[]{"frasl", "8260"}, new java.lang.String[]{"weierp", "8472"}, new java.lang.String[]{"image", "8465"}, new java.lang.String[]{"real", "8476"}, new java.lang.String[]{"trade", "8482"}, new java.lang.String[]{"alefsym", "8501"}, new java.lang.String[]{"larr", "8592"}, new java.lang.String[]{"uarr", "8593"}, new java.lang.String[]{"rarr", "8594"}, new java.lang.String[]{"darr", "8595"}, new java.lang.String[]{"harr", "8596"}, new java.lang.String[]{"crarr", "8629"}, new java.lang.String[]{"lArr", "8656"}, new java.lang.String[]{"uArr", "8657"}, new java.lang.String[]{"rArr", "8658"}, new java.lang.String[]{"dArr", "8659"}, new java.lang.String[]{"hArr", "8660"}, new java.lang.String[]{"forall", "8704"}, new java.lang.String[]{"part", "8706"}, new java.lang.String[]{"exist", "8707"}, new java.lang.String[]{"empty", "8709"}, new java.lang.String[]{"nabla", "8711"}, new java.lang.String[]{"isin", "8712"}, new java.lang.String[]{"notin", "8713"}, new java.lang.String[]{"ni", "8715"}, new java.lang.String[]{com.ironsource.B5.t, "8719"}, new java.lang.String[]{"sum", "8721"}, new java.lang.String[]{"minus", "8722"}, new java.lang.String[]{"lowast", "8727"}, new java.lang.String[]{"radic", "8730"}, new java.lang.String[]{"prop", "8733"}, new java.lang.String[]{"infin", "8734"}, new java.lang.String[]{"ang", "8736"}, new java.lang.String[]{"and", "8743"}, new java.lang.String[]{"or", "8744"}, new java.lang.String[]{"cap", "8745"}, new java.lang.String[]{"cup", "8746"}, new java.lang.String[]{"int", "8747"}, new java.lang.String[]{"there4", "8756"}, new java.lang.String[]{"sim", "8764"}, new java.lang.String[]{"cong", "8773"}, new java.lang.String[]{"asymp", "8776"}, new java.lang.String[]{"ne", "8800"}, new java.lang.String[]{"equiv", "8801"}, new java.lang.String[]{"le", "8804"}, new java.lang.String[]{com.facebook.appevents.UserDataStore.GENDER, "8805"}, new java.lang.String[]{com.facebook.AuthenticationTokenClaims.JSON_KEY_SUB, "8834"}, new java.lang.String[]{"sup", "8835"}, new java.lang.String[]{"sube", "8838"}, new java.lang.String[]{"supe", "8839"}, new java.lang.String[]{"oplus", "8853"}, new java.lang.String[]{"otimes", "8855"}, new java.lang.String[]{"perp", "8869"}, new java.lang.String[]{"sdot", "8901"}, new java.lang.String[]{"lceil", "8968"}, new java.lang.String[]{"rceil", "8969"}, new java.lang.String[]{"lfloor", "8970"}, new java.lang.String[]{"rfloor", "8971"}, new java.lang.String[]{com.ironsource.M6.q, "9001"}, new java.lang.String[]{"rang", "9002"}, new java.lang.String[]{"loz", "9674"}, new java.lang.String[]{"spades", "9824"}, new java.lang.String[]{"clubs", "9827"}, new java.lang.String[]{"hearts", "9829"}, new java.lang.String[]{"diams", "9830"}, new java.lang.String[]{"OElig", "338"}, new java.lang.String[]{"oelig", "339"}, new java.lang.String[]{"Scaron", "352"}, new java.lang.String[]{"scaron", "353"}, new java.lang.String[]{"Yuml", "376"}, new java.lang.String[]{"circ", "710"}, new java.lang.String[]{"tilde", "732"}, new java.lang.String[]{"ensp", "8194"}, new java.lang.String[]{"emsp", "8195"}, new java.lang.String[]{"thinsp", "8201"}, new java.lang.String[]{"zwnj", "8204"}, new java.lang.String[]{"zwj", "8205"}, new java.lang.String[]{"lrm", "8206"}, new java.lang.String[]{"rlm", "8207"}, new java.lang.String[]{"ndash", "8211"}, new java.lang.String[]{"mdash", "8212"}, new java.lang.String[]{"lsquo", "8216"}, new java.lang.String[]{"rsquo", "8217"}, new java.lang.String[]{"sbquo", "8218"}, new java.lang.String[]{"ldquo", "8220"}, new java.lang.String[]{"rdquo", "8221"}, new java.lang.String[]{"bdquo", "8222"}, new java.lang.String[]{"dagger", "8224"}, new java.lang.String[]{"Dagger", "8225"}, new java.lang.String[]{"permil", "8240"}, new java.lang.String[]{"lsaquo", "8249"}, new java.lang.String[]{"rsaquo", "8250"}, new java.lang.String[]{"euro", "8364"}};
        com.fyber.inneractive.sdk.util.s0 s0Var = new com.fyber.inneractive.sdk.util.s0();
        b = s0Var;
        s0Var.a(strArr);
        s0Var.a(strArr2);
        com.fyber.inneractive.sdk.util.s0 s0Var2 = new com.fyber.inneractive.sdk.util.s0();
        s0Var2.a(strArr);
        s0Var2.a(strArr3);
        com.fyber.inneractive.sdk.util.s0 s0Var3 = new com.fyber.inneractive.sdk.util.s0();
        c = s0Var3;
        s0Var3.a(strArr);
        s0Var3.a(strArr3);
        s0Var3.a(strArr4);
        s0Var3.a(strArr2);
    }

    public final void a(java.lang.String[][] strArr) {
        char c2 = 0;
        int i = 0;
        while (i < strArr.length) {
            java.lang.String[] strArr2 = strArr[i];
            java.lang.String str = strArr2[c2];
            int parseInt = java.lang.Integer.parseInt(strArr2[1]);
            com.fyber.inneractive.sdk.util.r0 r0Var = this.f4311a;
            r0Var.f4309a.put(str, java.lang.Integer.valueOf(parseInt));
            com.fyber.inneractive.sdk.util.u0 u0Var = r0Var.b;
            com.fyber.inneractive.sdk.util.t0[] t0VarArr = u0Var.f4315a;
            int i2 = Integer.MAX_VALUE;
            int i3 = parseInt & Integer.MAX_VALUE;
            int length = i3 % t0VarArr.length;
            com.fyber.inneractive.sdk.util.t0 t0Var = t0VarArr[length];
            while (true) {
                if (t0Var == null) {
                    if (u0Var.b >= u0Var.c) {
                        com.fyber.inneractive.sdk.util.t0[] t0VarArr2 = u0Var.f4315a;
                        int length2 = t0VarArr2.length;
                        int i4 = (length2 * 2) + 1;
                        com.fyber.inneractive.sdk.util.t0[] t0VarArr3 = new com.fyber.inneractive.sdk.util.t0[i4];
                        u0Var.c = (int) (i4 * 0.75f);
                        u0Var.f4315a = t0VarArr3;
                        while (true) {
                            int i5 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            com.fyber.inneractive.sdk.util.t0 t0Var2 = t0VarArr2[i5];
                            while (t0Var2 != null) {
                                com.fyber.inneractive.sdk.util.t0 t0Var3 = t0Var2.c;
                                int i6 = (t0Var2.f4313a & i2) % i4;
                                t0Var2.c = t0VarArr3[i6];
                                t0VarArr3[i6] = t0Var2;
                                t0Var2 = t0Var3;
                                i2 = Integer.MAX_VALUE;
                            }
                            length2 = i5;
                        }
                        t0VarArr = u0Var.f4315a;
                        length = i3 % t0VarArr.length;
                    }
                    t0VarArr[length] = new com.fyber.inneractive.sdk.util.t0(parseInt, str, t0VarArr[length]);
                    u0Var.b++;
                } else {
                    if (t0Var.f4313a == parseInt) {
                        t0Var.b = str;
                        break;
                    }
                    t0Var = t0Var.c;
                }
            }
            i++;
            c2 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r2 > 65535) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.io.StringWriter stringWriter, java.lang.String str, int i) {
        int i2;
        stringWriter.write(str, 0, i);
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                int i3 = i + 1;
                int indexOf = str.indexOf(59, i3);
                if (indexOf == -1) {
                    stringWriter.write(charAt);
                } else {
                    int indexOf2 = str.indexOf(38, i3);
                    if (indexOf2 != -1 && indexOf2 < indexOf) {
                        stringWriter.write(charAt);
                    } else {
                        java.lang.String substring = str.substring(i3, indexOf);
                        int length2 = substring.length();
                        if (length2 > 0) {
                            if (substring.charAt(0) != '#') {
                                java.lang.Object obj = this.f4311a.f4309a.get(substring);
                                if (obj != null) {
                                    i2 = ((java.lang.Integer) obj).intValue();
                                }
                            } else if (length2 > 1) {
                                char charAt2 = substring.charAt(1);
                                if (charAt2 != 'X' && charAt2 != 'x') {
                                    try {
                                        i2 = java.lang.Integer.parseInt(substring.substring(1), 10);
                                    } catch (java.lang.NumberFormatException unused) {
                                    }
                                } else {
                                    i2 = java.lang.Integer.parseInt(substring.substring(2), 16);
                                }
                            }
                            if (i2 != -1) {
                                stringWriter.write(38);
                                stringWriter.write(substring);
                                stringWriter.write(59);
                            } else {
                                stringWriter.write(i2);
                            }
                            i = indexOf;
                        }
                        i2 = -1;
                        if (i2 != -1) {
                        }
                        i = indexOf;
                    }
                }
            } else {
                stringWriter.write(charAt);
            }
            i++;
        }
    }
}
