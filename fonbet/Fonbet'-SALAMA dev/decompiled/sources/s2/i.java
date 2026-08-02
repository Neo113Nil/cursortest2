package s2;

import A1.C0045t0;
import C1.C0095a;
import Y4.D;
import android.text.TextUtils;
import android.util.Log;
import j2.AbstractC1308e;
import j2.C1311h;
import j2.InterfaceC1309f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.AbstractC1664a;
import v2.AbstractC1665b;
import v2.t;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class i extends AbstractC1308e {

    /* renamed from: D, reason: collision with root package name */
    public final C0095a f16142D = new C0095a(4, false);

    /* renamed from: E, reason: collision with root package name */
    public final C1587a f16143E = new C1587a();

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0114, code lost:
    
        r1 = r4;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0394, code lost:
    
        r6.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0105, code lost:
    
        if (")".equals(s2.C1587a.b(r8, r11)) == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.AbstractC1308e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        int i8;
        int i9;
        C1589c d7;
        String str;
        int i10;
        String sb;
        int i11;
        char c3;
        i iVar = this;
        int i12 = 2;
        boolean z7 = false;
        int i13 = -1;
        int i14 = 1;
        C0095a c0095a = iVar.f16142D;
        c0095a.B(i7, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            j.d(c0095a);
            while (!TextUtils.isEmpty(c0095a.h())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i15 = z7 ? 1 : 0;
                int i16 = i13;
                while (i16 == i13) {
                    i15 = c0095a.f1463a;
                    String h6 = c0095a.h();
                    i16 = h6 == null ? z7 ? 1 : 0 : "STYLE".equals(h6) ? i12 : h6.startsWith("NOTE") ? i14 : 3;
                }
                c0095a.D(i15);
                if (i16 == 0) {
                    return new C1759x1(arrayList2);
                }
                if (i16 == i14) {
                    while (!TextUtils.isEmpty(c0095a.h())) {
                    }
                } else {
                    String str2 = null;
                    if (i16 != i12) {
                        i8 = i12;
                        i9 = i14;
                        if (i16 == 3) {
                            Pattern pattern = h.f16138a;
                            String h7 = c0095a.h();
                            if (h7 == null) {
                                d7 = null;
                            } else {
                                Pattern pattern2 = h.f16138a;
                                Matcher matcher = pattern2.matcher(h7);
                                if (matcher.matches()) {
                                    d7 = h.d(null, matcher, c0095a, arrayList);
                                } else {
                                    String h8 = c0095a.h();
                                    if (h8 != null) {
                                        Matcher matcher2 = pattern2.matcher(h8);
                                        if (matcher2.matches()) {
                                            d7 = h.d(h7.trim(), matcher2, c0095a, arrayList);
                                        }
                                    }
                                    d7 = null;
                                }
                            }
                            if (d7 != null) {
                                arrayList2.add(d7);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new C1311h("A style block was found after the first cue.");
                        }
                        c0095a.h();
                        C1587a c1587a = iVar.f16143E;
                        StringBuilder sb2 = c1587a.f16100b;
                        sb2.setLength(z7 ? 1 : 0);
                        int i17 = c0095a.f1463a;
                        while (!TextUtils.isEmpty(c0095a.h())) {
                        }
                        byte[] bArr2 = (byte[]) c0095a.f1465c;
                        int i18 = c0095a.f1463a;
                        C0095a c0095a2 = c1587a.f16099a;
                        c0095a2.B(i18, bArr2);
                        c0095a2.D(i17);
                        ArrayList arrayList3 = new ArrayList();
                        boolean z8 = z7;
                        while (true) {
                            C1587a.c(c0095a2);
                            if (c0095a2.d() >= 5 && "::cue".equals(c0095a2.r(5, D3.f.f1719c))) {
                                int i19 = c0095a2.f1463a;
                                String b7 = C1587a.b(c0095a2, sb2);
                                if (b7 != null) {
                                    if ("{".equals(b7)) {
                                        c0095a2.D(i19);
                                        str = "";
                                    } else if ("(".equals(b7)) {
                                        int i20 = c0095a2.f1463a;
                                        int i21 = c0095a2.f1464b;
                                        int i22 = z8 ? 1 : 0;
                                        while (i20 < i21 && i22 == 0) {
                                            int i23 = i20 + 1;
                                            int i24 = ((char) ((byte[]) c0095a2.f1465c)[i20]) == ')' ? i14 : z8 ? 1 : 0;
                                            i20 = i23;
                                            i22 = i24;
                                        }
                                        str = c0095a2.r((i20 + i13) - c0095a2.f1463a, D3.f.f1719c).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null && "{".equals(C1587a.b(c0095a2, sb2))) {
                                        C1588b c1588b = new C1588b();
                                        c1588b.f16101a = "";
                                        c1588b.f16102b = "";
                                        c1588b.f16103c = Collections.emptySet();
                                        c1588b.f16104d = "";
                                        c1588b.f16105e = str2;
                                        c1588b.f16107g = z8;
                                        c1588b.f16109i = z8;
                                        c1588b.j = i13;
                                        c1588b.f16110k = i13;
                                        c1588b.f16111l = i13;
                                        c1588b.f16112m = i13;
                                        c1588b.f16114o = i13;
                                        c1588b.f16115p = z8;
                                        if (!"".equals(str)) {
                                            int indexOf = str.indexOf(91);
                                            if (indexOf != i13) {
                                                Matcher matcher3 = C1587a.f16097c.matcher(str.substring(indexOf));
                                                if (matcher3.matches()) {
                                                    String group = matcher3.group(i14);
                                                    group.getClass();
                                                    c1588b.f16104d = group;
                                                }
                                                str = str.substring(z8 ? 1 : 0, indexOf);
                                            }
                                            int i25 = t.f17153a;
                                            String[] split = str.split("\\.", i13);
                                            String str3 = split[z8 ? 1 : 0];
                                            int indexOf2 = str3.indexOf(35);
                                            if (indexOf2 != i13) {
                                                c1588b.f16102b = str3.substring(z8 ? 1 : 0, indexOf2);
                                                c1588b.f16101a = str3.substring(indexOf2 + i14);
                                            } else {
                                                c1588b.f16102b = str3;
                                            }
                                            if (split.length > i14) {
                                                int length = split.length;
                                                AbstractC1664a.f(length <= split.length ? i14 : z8 ? 1 : 0);
                                                c1588b.f16103c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i14, length)));
                                            }
                                        }
                                        int i26 = z8 ? 1 : 0;
                                        String str4 = null;
                                        int i27 = z8;
                                        while (i26 == 0) {
                                            int i28 = c0095a2.f1463a;
                                            str4 = C1587a.b(c0095a2, sb2);
                                            int i29 = (str4 == null || "}".equals(str4)) ? i14 : i27;
                                            if (i29 == 0) {
                                                c0095a2.D(i28);
                                                C1587a.c(c0095a2);
                                                String a2 = C1587a.a(c0095a2, sb2);
                                                if (!"".equals(a2) && ":".equals(C1587a.b(c0095a2, sb2))) {
                                                    C1587a.c(c0095a2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z9 = false;
                                                    while (true) {
                                                        if (z9) {
                                                            sb = sb3.toString();
                                                        } else {
                                                            int i30 = c0095a2.f1463a;
                                                            boolean z10 = z9;
                                                            String b8 = C1587a.b(c0095a2, sb2);
                                                            if (b8 == null) {
                                                                sb = null;
                                                            } else if ("}".equals(b8) || ";".equals(b8)) {
                                                                c0095a2.D(i30);
                                                                z9 = true;
                                                            } else {
                                                                sb3.append(b8);
                                                                z9 = z10;
                                                            }
                                                        }
                                                    }
                                                    if (sb != null && !"".equals(sb)) {
                                                        int i31 = c0095a2.f1463a;
                                                        String b9 = C1587a.b(c0095a2, sb2);
                                                        if (!";".equals(b9)) {
                                                            if ("}".equals(b9)) {
                                                                c0095a2.D(i31);
                                                            }
                                                        }
                                                        if ("color".equals(a2)) {
                                                            i11 = 1;
                                                            c1588b.f16106f = AbstractC1665b.a(sb, true);
                                                            c1588b.f16107g = true;
                                                        } else {
                                                            i11 = 1;
                                                            if ("background-color".equals(a2)) {
                                                                c1588b.f16108h = AbstractC1665b.a(sb, true);
                                                                c1588b.f16109i = true;
                                                            } else if ("ruby-position".equals(a2)) {
                                                                if ("over".equals(sb)) {
                                                                    c1588b.f16114o = 1;
                                                                } else if ("under".equals(sb)) {
                                                                    c1588b.f16114o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(a2)) {
                                                                c1588b.f16115p = "all".equals(sb) || sb.startsWith("digits");
                                                            } else if ("text-decoration".equals(a2)) {
                                                                if ("underline".equals(sb)) {
                                                                    c1588b.j = 1;
                                                                }
                                                            } else if ("font-family".equals(a2)) {
                                                                c1588b.f16105e = D.a0(sb);
                                                            } else {
                                                                if (!"font-weight".equals(a2)) {
                                                                    i11 = 1;
                                                                    if ("font-style".equals(a2)) {
                                                                        if ("italic".equals(sb)) {
                                                                            c1588b.f16111l = 1;
                                                                        }
                                                                    } else if ("font-size".equals(a2)) {
                                                                        Matcher matcher4 = C1587a.f16098d.matcher(D.a0(sb));
                                                                        if (matcher4.matches()) {
                                                                            String group2 = matcher4.group(2);
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case 37:
                                                                                    if (group2.equals("%")) {
                                                                                        c3 = 0;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3240:
                                                                                    if (group2.equals("em")) {
                                                                                        c3 = 1;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3592:
                                                                                    if (group2.equals("px")) {
                                                                                        c3 = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            c3 = 65535;
                                                                            switch (c3) {
                                                                                case 0:
                                                                                    i10 = 1;
                                                                                    c1588b.f16112m = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i10 = 1;
                                                                                    c1588b.f16112m = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i10 = 1;
                                                                                    c1588b.f16112m = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String group3 = matcher4.group(i10);
                                                                            group3.getClass();
                                                                            c1588b.f16113n = Float.parseFloat(group3);
                                                                            i14 = i10;
                                                                            i26 = i29;
                                                                            i27 = 0;
                                                                        } else {
                                                                            Log.w("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(sb)) {
                                                                    i11 = 1;
                                                                    c1588b.f16110k = 1;
                                                                }
                                                                i14 = i10;
                                                                i26 = i29;
                                                                i27 = 0;
                                                            }
                                                        }
                                                        i10 = i11;
                                                        i14 = i10;
                                                        i26 = i29;
                                                        i27 = 0;
                                                    }
                                                    i10 = 1;
                                                    i14 = i10;
                                                    i26 = i29;
                                                    i27 = 0;
                                                }
                                            }
                                            i10 = i14;
                                            i14 = i10;
                                            i26 = i29;
                                            i27 = 0;
                                        }
                                        int i32 = i14;
                                        if ("}".equals(str4)) {
                                            arrayList3.add(c1588b);
                                        }
                                        i14 = i32;
                                        z8 = 0;
                                        i13 = -1;
                                        str2 = null;
                                    }
                                }
                            }
                            str = str2;
                            if (str == null) {
                            }
                        }
                    }
                    i14 = i9;
                    i12 = i8;
                    z7 = false;
                    i13 = -1;
                    iVar = this;
                }
            }
        } catch (C0045t0 e7) {
            throw new C1311h(e7);
        }
    }
}
