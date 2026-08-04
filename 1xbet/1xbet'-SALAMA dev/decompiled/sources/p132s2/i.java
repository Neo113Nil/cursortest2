package p132s2;

import A1.C0045t0;
import C1.C0095a;
import Y4.D;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p068j2.e;
import p068j2.f;
import p068j2.h;
import p151v2.a;
import p151v2.b;
import p151v2.t;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0095a f16148D = new C0095a(4, false);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f16149E = new a();

    /* JADX WARN: Code duplicated, block: B:128:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0257  */
    /* JADX WARN: Code duplicated, block: B:133:0x0260  */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:137:0x0270  */
    /* JADX WARN: Code duplicated, block: B:138:0x0274  */
    /* JADX WARN: Code duplicated, block: B:140:0x027c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0281  */
    /* JADX WARN: Code duplicated, block: B:143:0x0289  */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:174:0x031d  */
    /* JADX WARN: Code duplicated, block: B:175:0x031f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0330  */
    /* JADX WARN: Code duplicated, block: B:181:0x0339  */
    /* JADX WARN: Code duplicated, block: B:182:0x033b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0344  */
    /* JADX WARN: Code duplicated, block: B:186:0x0346  */
    /* JADX WARN: Code duplicated, block: B:189:0x034f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0359  */
    /* JADX WARN: Code duplicated, block: B:194:0x035e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0363  */
    /* JADX WARN: Code duplicated, block: B:197:0x0376  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:238:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0305, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p068j2.e
    public final f e(byte[] bArr, int i7, boolean z4) throws h {
        char c3;
        int i8;
        c cVarD;
        String strTrim;
        int i9;
        String string;
        int i10;
        Matcher matcher;
        String strGroup;
        byte b7;
        boolean z7;
        i iVar = this;
        char c4 = 2;
        boolean z8 = false;
        int i11 = -1;
        int i12 = 1;
        C0095a c0095a = iVar.f16148D;
        c0095a.B(i7, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            j.d(c0095a);
            while (!TextUtils.isEmpty(c0095a.h())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i13 = z8 ? 1 : 0;
                int i14 = i11;
                while (i14 == i11) {
                    i13 = c0095a.f1463a;
                    String strH = c0095a.h();
                    if (strH == null) {
                        i14 = z8 ? 1 : 0;
                    } else if ("STYLE".equals(strH)) {
                        i14 = c4;
                    } else {
                        i14 = strH.startsWith("NOTE") ? i12 : 3;
                    }
                }
                c0095a.D(i13);
                if (i14 == 0) {
                    return new C1050x1(arrayList2);
                }
                if (i14 == i12) {
                    while (!TextUtils.isEmpty(c0095a.h())) {
                    }
                } else {
                    String str = null;
                    if (i14 != c4) {
                        c3 = c4;
                        i8 = i12;
                        if (i14 == 3) {
                            Pattern pattern = h.f16144a;
                            String strH2 = c0095a.h();
                            if (strH2 == null) {
                                cVarD = null;
                            } else {
                                Pattern pattern2 = h.f16144a;
                                Matcher matcher2 = pattern2.matcher(strH2);
                                if (matcher2.matches()) {
                                    cVarD = h.d(null, matcher2, c0095a, arrayList);
                                } else {
                                    String strH3 = c0095a.h();
                                    if (strH3 == null) {
                                        cVarD = null;
                                    } else {
                                        Matcher matcher3 = pattern2.matcher(strH3);
                                        if (matcher3.matches()) {
                                            cVarD = h.d(strH2.trim(), matcher3, c0095a, arrayList);
                                        } else {
                                            cVarD = null;
                                        }
                                    }
                                }
                            }
                            if (cVarD != null) {
                                arrayList2.add(cVarD);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new h("A style block was found after the first cue.");
                        }
                        c0095a.h();
                        a aVar = iVar.f16149E;
                        StringBuilder sb = aVar.f16106b;
                        sb.setLength(z8 ? 1 : 0);
                        int i15 = c0095a.f1463a;
                        while (!TextUtils.isEmpty(c0095a.h())) {
                        }
                        byte[] bArr2 = (byte[]) c0095a.f1465c;
                        int i16 = c0095a.f1463a;
                        C0095a c0095a2 = aVar.f16105a;
                        c0095a2.B(i16, bArr2);
                        c0095a2.D(i15);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            a.c(c0095a2);
                            if (c0095a2.d() >= 5 && "::cue".equals(c0095a2.r(5, D3.f.f1719c))) {
                                int i17 = c0095a2.f1463a;
                                String strB = a.b(c0095a2, sb);
                                if (strB == null) {
                                    strTrim = str;
                                } else if ("{".equals(strB)) {
                                    c0095a2.D(i17);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i18 = c0095a2.f1463a;
                                        int i19 = c0095a2.f1464b;
                                        int i20 = z8 ? 1 : 0;
                                        while (i18 < i19 && i20 == 0) {
                                            int i21 = i18 + 1;
                                            int i22 = ((char) ((byte[]) c0095a2.f1465c)[i18]) == ')' ? i12 : z8 ? 1 : 0;
                                            i18 = i21;
                                            i20 = i22;
                                        }
                                        strTrim = c0095a2.r((i18 + i11) - c0095a2.f1463a, D3.f.f1719c).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!")".equals(a.b(c0095a2, sb))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim != null && "{".equals(a.b(c0095a2, sb))) {
                                b bVar = new b();
                                bVar.f16107a = "";
                                bVar.f16108b = "";
                                bVar.f16109c = Collections.emptySet();
                                bVar.f16110d = "";
                                bVar.f16111e = str;
                                bVar.f16113g = z8;
                                bVar.f16115i = z8;
                                bVar.j = i11;
                                bVar.f16116k = i11;
                                bVar.f16117l = i11;
                                bVar.f16118m = i11;
                                bVar.f16120o = i11;
                                bVar.f16121p = z8;
                                if (!"".equals(strTrim)) {
                                    int iIndexOf = strTrim.indexOf(91);
                                    if (iIndexOf != i11) {
                                        Matcher matcher4 = a.f16103c.matcher(strTrim.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            String strGroup2 = matcher4.group(i12);
                                            strGroup2.getClass();
                                            bVar.f16110d = strGroup2;
                                        }
                                        strTrim = strTrim.substring(z8 ? 1 : 0, iIndexOf);
                                    }
                                    int i23 = t.f17159a;
                                    String[] strArrSplit = strTrim.split("\\.", i11);
                                    String str2 = strArrSplit[z8 ? 1 : 0];
                                    int iIndexOf2 = str2.indexOf(35);
                                    if (iIndexOf2 != i11) {
                                        bVar.f16108b = str2.substring(z8 ? 1 : 0, iIndexOf2);
                                        bVar.f16107a = str2.substring(iIndexOf2 + i12);
                                    } else {
                                        bVar.f16108b = str2;
                                    }
                                    if (strArrSplit.length > i12) {
                                        int length = strArrSplit.length;
                                        a.f(length <= strArrSplit.length ? i12 : z8 ? 1 : 0);
                                        bVar.f16109c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i12, length)));
                                    }
                                }
                                ?? r7 = z8 ? 1 : 0;
                                String strB2 = null;
                                while (r7 == 0) {
                                    int i24 = c0095a2.f1463a;
                                    strB2 = a.b(c0095a2, sb);
                                    ?? r14 = (strB2 == null || "}".equals(strB2)) ? i12 : z8;
                                    if (r14 == 0) {
                                        c0095a2.D(i24);
                                        a.c(c0095a2);
                                        String strA = a.a(c0095a2, sb);
                                        if (!"".equals(strA) && ":".equals(a.b(c0095a2, sb))) {
                                            a.c(c0095a2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z9 = false;
                                            while (true) {
                                                if (z9) {
                                                    string = sb2.toString();
                                                } else {
                                                    int i25 = c0095a2.f1463a;
                                                    boolean z10 = z9;
                                                    String strB3 = a.b(c0095a2, sb);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                        c0095a2.D(i25);
                                                        z9 = true;
                                                    } else {
                                                        sb2.append(strB3);
                                                        z9 = z10;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i9 = 1;
                                            } else {
                                                int i26 = c0095a2.f1463a;
                                                String strB4 = a.b(c0095a2, sb);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        i10 = 1;
                                                        bVar.f16112f = b.a(string, true);
                                                        bVar.f16113g = true;
                                                    } else {
                                                        i10 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            bVar.f16114h = b.a(string, true);
                                                            bVar.f16115i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    bVar.f16120o = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f16120o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z7 = true;
                                                                } else {
                                                                    z7 = true;
                                                                }
                                                                bVar.f16121p = z7;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    bVar.j = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                bVar.f16111e = D.a0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i10 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        bVar.f16117l = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = a.f16104d.matcher(D.a0(string));
                                                                    if (matcher.matches()) {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b7 = 0;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i9);
                                                                                strGroup3.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b7 = 1;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i9);
                                                                                strGroup4.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b7 = 2;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i9);
                                                                                strGroup5.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b7 = -1;
                                                                        switch (b7) {
                                                                            case 0:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 3;
                                                                                break;
                                                                            case 1:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 2;
                                                                                break;
                                                                            case 2:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i9);
                                                                        strGroup6.getClass();
                                                                        bVar.f16119n = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        Log.w("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i10 = 1;
                                                                bVar.f16116k = 1;
                                                            }
                                                            i9 = 1;
                                                        }
                                                    }
                                                    i9 = i10;
                                                } else if ("}".equals(strB4)) {
                                                    c0095a2.D(i26);
                                                    if ("color".equals(strA)) {
                                                        i10 = 1;
                                                        bVar.f16112f = b.a(string, true);
                                                        bVar.f16113g = true;
                                                    } else {
                                                        i10 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            bVar.f16114h = b.a(string, true);
                                                            bVar.f16115i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    bVar.f16120o = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f16120o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z7 = true;
                                                                } else {
                                                                    z7 = false;
                                                                }
                                                                bVar.f16121p = z7;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    bVar.j = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                bVar.f16111e = D.a0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i10 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        bVar.f16117l = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = a.f16104d.matcher(D.a0(string));
                                                                    if (matcher.matches()) {
                                                                        Log.w("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    } else {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b7 = 0;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup7 = matcher.group(i9);
                                                                                strGroup7.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup7);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b7 = 1;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup8 = matcher.group(i9);
                                                                                strGroup8.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup8);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b7 = 2;
                                                                                }
                                                                                switch (b7) {
                                                                                    case 0:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i9 = 1;
                                                                                        bVar.f16118m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup9 = matcher.group(i9);
                                                                                strGroup9.getClass();
                                                                                bVar.f16119n = Float.parseFloat(strGroup9);
                                                                                break;
                                                                        }
                                                                        b7 = -1;
                                                                        switch (b7) {
                                                                            case 0:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 3;
                                                                                break;
                                                                            case 1:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 2;
                                                                                break;
                                                                            case 2:
                                                                                i9 = 1;
                                                                                bVar.f16118m = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup10 = matcher.group(i9);
                                                                        strGroup10.getClass();
                                                                        bVar.f16119n = Float.parseFloat(strGroup10);
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i10 = 1;
                                                                bVar.f16116k = 1;
                                                            }
                                                            i9 = 1;
                                                        }
                                                    }
                                                    i9 = i10;
                                                } else {
                                                    i9 = 1;
                                                }
                                            }
                                        } else {
                                            i9 = i12;
                                        }
                                    } else {
                                        i9 = i12;
                                    }
                                    i12 = i9;
                                    r7 = r14;
                                    z8 = false;
                                }
                                int i27 = i12;
                                if ("}".equals(strB2)) {
                                    arrayList3.add(bVar);
                                }
                                i12 = i27;
                                z8 = false;
                                i11 = -1;
                                str = null;
                            }
                        }
                        i8 = i12;
                        c3 = 2;
                        arrayList.addAll(arrayList3);
                    }
                    i12 = i8;
                    c4 = c3;
                    z8 = false;
                    i11 = -1;
                    iVar = this;
                }
            }
        } catch (C0045t0 e7) {
            throw new h(e7);
        }
    }
}
