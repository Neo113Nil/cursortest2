package p2;

import C1.C0095a;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import j2.AbstractC1308e;
import j2.C1305b;
import j2.InterfaceC1309f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534a extends AbstractC1308e {

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f15673F = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f15674G = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f15675D = new StringBuilder();

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f15676E = new ArrayList();

    public static long h(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // j2.AbstractC1308e
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        C0095a c0095a;
        String h6;
        String str;
        long[] jArr;
        char c3;
        char c4;
        int i8;
        int i9;
        float f7;
        float f8;
        C1305b c1305b;
        C1534a c1534a = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        C0095a c0095a2 = new C0095a(bArr, i7);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String h7 = c0095a2.h();
            if (h7 != null) {
                if (h7.length() != 0) {
                    try {
                        Integer.parseInt(h7);
                        h6 = c0095a2.h();
                    } catch (NumberFormatException unused) {
                        c0095a = c0095a2;
                        Log.w("SubripDecoder", "Skipping invalid index: ".concat(h7));
                    }
                    if (h6 == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f15673F.matcher(h6);
                        if (matcher.matches()) {
                            long h8 = h(matcher, 1);
                            if (i11 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i11 * 2);
                            }
                            int i12 = i11 + 1;
                            jArr2[i11] = h8;
                            long h9 = h(matcher, 6);
                            if (i12 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i12 * 2);
                            }
                            i11 += 2;
                            jArr2[i12] = h9;
                            StringBuilder sb = c1534a.f15675D;
                            sb.setLength(i10);
                            ArrayList arrayList2 = c1534a.f15676E;
                            arrayList2.clear();
                            String h10 = c0095a2.h();
                            while (!TextUtils.isEmpty(h10)) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = h10.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = f15674G.matcher(trim);
                                int i13 = i10;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i13;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i13 += length;
                                }
                                sb.append(sb2.toString());
                                h10 = c0095a2.h();
                                i10 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i14);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i14++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                c1305b = new C1305b(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                jArr = jArr2;
                                c0095a = c0095a2;
                            } else {
                                jArr = jArr2;
                                c0095a = c0095a2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                int i15 = (c3 == 0 || c3 == 1 || c3 == 2) ? 0 : (c3 == 3 || c3 == 4 || c3 == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c4 = '\b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                int i16 = (c4 == 0 || c4 == 1 || c4 == 2) ? 2 : (c4 == 3 || c4 == 4 || c4 == 5) ? 0 : 1;
                                if (i15 != 0) {
                                    i8 = 1;
                                    if (i15 != 1) {
                                        i9 = 2;
                                        if (i15 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f7 = 0.92f;
                                    } else {
                                        i9 = 2;
                                        f7 = 0.5f;
                                    }
                                } else {
                                    i8 = 1;
                                    i9 = 2;
                                    f7 = 0.08f;
                                }
                                if (i16 == 0) {
                                    f8 = 0.08f;
                                } else if (i16 == i8) {
                                    f8 = 0.5f;
                                } else {
                                    if (i16 != i9) {
                                        throw new IllegalArgumentException();
                                    }
                                    f8 = 0.92f;
                                }
                                c1305b = new C1305b(fromHtml, null, null, null, f8, 0, i16, f7, i15, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(c1305b);
                            arrayList.add(C1305b.f14567I);
                            c1534a = this;
                            jArr2 = jArr;
                            c0095a2 = c0095a;
                            i10 = 0;
                        } else {
                            c0095a = c0095a2;
                            Log.w("SubripDecoder", "Skipping invalid timing: ".concat(h6));
                            c1534a = this;
                            c0095a2 = c0095a;
                            i10 = 0;
                        }
                    }
                }
            }
        }
        return new w(15, (C1305b[]) arrayList.toArray(new C1305b[i10]), Arrays.copyOf(jArr2, i11));
    }
}
