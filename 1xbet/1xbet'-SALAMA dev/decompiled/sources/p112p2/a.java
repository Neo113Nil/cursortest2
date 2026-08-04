package p112p2;

import C1.C0095a;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p068j2.b;
import p068j2.e;
import p068j2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Pattern f15679F = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Pattern f15680G = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final StringBuilder f15681D = new StringBuilder();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f15682E = new ArrayList();

    public static long h(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j3 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j7 = (Long.parseLong(strGroup3) * 1000) + j3;
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j7 += Long.parseLong(strGroup4);
        }
        return j7 * 1000;
    }

    @Override // p068j2.e
    public final f e(byte[] bArr, int i7, boolean z4) {
        String str;
        byte b7;
        int i8;
        byte b8;
        int i9;
        int i10;
        int i11;
        float f7;
        float f8;
        b bVar;
        this = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        C0095a c0095a = new C0095a(bArr, i7);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String strH = c0095a.h();
            if (strH != null) {
                if (strH.length() != 0) {
                    try {
                        Integer.parseInt(strH);
                        String strH2 = c0095a.h();
                        if (strH2 == null) {
                            Log.w("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f15679F.matcher(strH2);
                            if (matcher.matches()) {
                                long jH = h(matcher, 1);
                                if (i13 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13 * 2);
                                }
                                int i14 = i13 + 1;
                                jArrCopyOf[i13] = jH;
                                long jH2 = h(matcher, 6);
                                if (i14 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14 * 2);
                                }
                                i13 += 2;
                                jArrCopyOf[i14] = jH2;
                                StringBuilder sb = this.f15681D;
                                sb.setLength(i12);
                                ArrayList arrayList2 = this.f15682E;
                                arrayList2.clear();
                                String strH3 = c0095a.h();
                                while (!TextUtils.isEmpty(strH3)) {
                                    if (sb.length() > 0) {
                                        sb.append("<br>");
                                    }
                                    String strTrim = strH3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f15680G.matcher(strTrim);
                                    int i15 = i12;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i15;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i15 += length;
                                    }
                                    sb.append(sb2.toString());
                                    strH3 = c0095a.h();
                                    i12 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i16 = 0;
                                while (true) {
                                    if (i16 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i16);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i16++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    bVar = new b(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str) {
                                        case "{\an1}":
                                            b7 = 0;
                                            break;
                                        case "{\an2}":
                                            b7 = 6;
                                            break;
                                        case "{\an3}":
                                            b7 = 3;
                                            break;
                                        case "{\an4}":
                                            b7 = 1;
                                            break;
                                        case "{\an5}":
                                            b7 = 7;
                                            break;
                                        case "{\an6}":
                                            b7 = 4;
                                            break;
                                        case "{\an7}":
                                            b7 = 2;
                                            break;
                                        case "{\an8}":
                                            b7 = 8;
                                            break;
                                        case "{\an9}":
                                            b7 = 5;
                                            break;
                                        default:
                                            b7 = -1;
                                            break;
                                    }
                                    if (b7 == 0 || b7 == 1 || b7 == 2) {
                                        i8 = 0;
                                    } else {
                                        i8 = (b7 == 3 || b7 == 4 || b7 == 5) ? 2 : 1;
                                    }
                                    switch (str) {
                                        case "{\an1}":
                                            b8 = 0;
                                            break;
                                        case "{\an2}":
                                            b8 = 1;
                                            break;
                                        case "{\an3}":
                                            b8 = 2;
                                            break;
                                        case "{\an4}":
                                            b8 = 6;
                                            break;
                                        case "{\an5}":
                                            b8 = 7;
                                            break;
                                        case "{\an6}":
                                            b8 = 8;
                                            break;
                                        case "{\an7}":
                                            b8 = 3;
                                            break;
                                        case "{\an8}":
                                            b8 = 4;
                                            break;
                                        case "{\an9}":
                                            b8 = 5;
                                            break;
                                        default:
                                            b8 = -1;
                                            break;
                                    }
                                    if (b8 == 0 || b8 == 1 || b8 == 2) {
                                        i9 = 2;
                                    } else {
                                        i9 = (b8 == 3 || b8 == 4 || b8 == 5) ? 0 : 1;
                                    }
                                    if (i8 != 0) {
                                        i10 = 1;
                                        if (i8 != 1) {
                                            i11 = 2;
                                            if (i8 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f7 = 0.92f;
                                        } else {
                                            i11 = 2;
                                            f7 = 0.5f;
                                        }
                                    } else {
                                        i10 = 1;
                                        i11 = 2;
                                        f7 = 0.08f;
                                    }
                                    if (i9 == 0) {
                                        f8 = 0.08f;
                                    } else if (i9 == i10) {
                                        f8 = 0.5f;
                                    } else {
                                        if (i9 != i11) {
                                            throw new IllegalArgumentException();
                                        }
                                        f8 = 0.92f;
                                    }
                                    bVar = new b(spannedFromHtml, null, null, null, f8, 0, i9, f7, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(bVar);
                                arrayList.add(b.f14573I);
                                jArrCopyOf = jArrCopyOf;
                            } else {
                                Log.w("SubripDecoder", "Skipping invalid timing: ".concat(strH2));
                            }
                            c0095a = c0095a;
                            i12 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        Log.w("SubripDecoder", "Skipping invalid index: ".concat(strH));
                    }
                }
            }
        }
        return new w(15, (b[]) arrayList.toArray(new b[i12]), Arrays.copyOf(jArrCopyOf, i13));
    }
}
