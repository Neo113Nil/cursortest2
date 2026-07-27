package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.ads.video.vast.VASTResource$Type;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: i, reason: collision with root package name */
    public static final List f3469i = Arrays.asList("video/mp4", "video/3gpp");

    /* renamed from: a, reason: collision with root package name */
    public final int f3470a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3471b;

    /* renamed from: c, reason: collision with root package name */
    public zi f3472c;

    /* renamed from: d, reason: collision with root package name */
    public VASTErrorCodes f3473d;

    /* renamed from: e, reason: collision with root package name */
    public int f3474e;
    public int f = 10;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f3475g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final String f3476h;

    public aj(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        f = f <= 0.0f ? 1.0f : f;
        float f3 = i3;
        this.f3471b = f3 / i4;
        this.f3470a = (int) (f3 / f);
        this.f3476h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ec A[LOOP:5: B:138:0x02e6->B:140:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ui a(String str, ArrayList arrayList, vi viVar) {
        Iterator it;
        String str2;
        String a3;
        ui a4;
        Iterator it2;
        Iterator it3;
        ui uiVar;
        yi a5;
        Integer num;
        float f;
        if (viVar != null && str != null) {
            viVar.f4535c.put(str);
        }
        ui uiVar2 = 0;
        try {
            yi yiVar = new yi(str);
            if ((yiVar.f4734b ? yiVar.f("Error") : null) != null) {
                arrayList.add(yiVar.f4734b ? yiVar.f("Error") : null);
            }
            ArrayList a6 = yiVar.a("Ad", null, null);
            if (a6.isEmpty() && !arrayList.isEmpty()) {
                a(arrayList, this.f3474e > 0 ? VASTErrorCodes.WrapperNoReponse : VASTErrorCodes.FileNotFound);
                return null;
            }
            Iterator it4 = a6.iterator();
            while (it4.hasNext()) {
                yi yiVar2 = (yi) it4.next();
                String a7 = yiVar2.a("sequence");
                char c3 = 2;
                if (!TextUtils.isEmpty(a7)) {
                    if (Integer.parseInt(a7) >= 2) {
                        continue;
                    }
                }
                yi a8 = yiVar2.a("InLine", uiVar2);
                String str3 = "Linear";
                if (a8 != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = a8.a("Creative", "Creatives", uiVar2, uiVar2).iterator();
                    while (it5.hasNext()) {
                        yi a9 = ((yi) it5.next()).a("Linear", uiVar2);
                        if (a9 != null) {
                            arrayList2.add(a9);
                        }
                    }
                    Iterator it6 = arrayList2.iterator();
                    ?? r4 = uiVar2;
                    while (true) {
                        if (!it6.hasNext()) {
                            it = it4;
                            str2 = str3;
                            a(arrayList, VASTErrorCodes.FileNotFound);
                            uiVar = null;
                            break;
                        }
                        yi yiVar3 = (yi) it6.next();
                        char c4 = c3;
                        Iterator it7 = yiVar3.a("MediaFile", "MediaFiles", r4, r4).iterator();
                        float f3 = Float.NEGATIVE_INFINITY;
                        yi yiVar4 = r4;
                        while (true) {
                            it = it4;
                            Iterator it8 = it7;
                            if (!it7.hasNext()) {
                                break;
                            }
                            Iterator it9 = it6;
                            yi yiVar5 = (yi) it8.next();
                            float f4 = f3;
                            String a10 = yiVar5.a("type");
                            String b3 = yiVar5.b();
                            String str4 = str3;
                            if (!f3469i.contains(a10) || b3 == null) {
                                it8.remove();
                            } else {
                                Integer b4 = yiVar5.b("width");
                                Integer b5 = yiVar5.b("height");
                                Integer b6 = yiVar5.b("bitrate");
                                if (b6 != null) {
                                    num = b5;
                                } else {
                                    b6 = yiVar5.b("minBitrate");
                                    num = b5;
                                    Integer b7 = yiVar5.b("maxBitrate");
                                    if (b6 != null && b7 != null) {
                                        b6 = Integer.valueOf((b7.intValue() + b6.intValue()) / 2);
                                    } else if (b6 == null) {
                                        b6 = b7;
                                    }
                                }
                                if (b4 != null && b4.intValue() > 0 && num != null && num.intValue() > 0) {
                                    int intValue = b4.intValue();
                                    int intValue2 = num.intValue();
                                    Integer num2 = b6;
                                    float abs = Math.abs(this.f3471b - (intValue / intValue2));
                                    int i3 = this.f3470a;
                                    float abs2 = abs + Math.abs((i3 - intValue) / i3);
                                    int intValue3 = (num2 == null || num2.intValue() < 0) ? 0 : num2.intValue();
                                    float min = (700 > intValue3 || intValue3 > 1500) ? Math.min(Math.abs(700 - intValue3) / 700.0f, Math.abs(1500 - intValue3) / 1500.0f) : 0.0f;
                                    if (a10 == null) {
                                        a10 = "";
                                    }
                                    int hashCode = a10.hashCode();
                                    float f5 = min;
                                    if (hashCode == -1664118616) {
                                        a10.equals("video/3gpp");
                                    } else if (hashCode == 1331848029 && a10.equals("video/mp4")) {
                                        f = 1.5f;
                                        f3 = (1.0f / ((abs2 + 1.0f) + f5)) * f;
                                        if (f3 > f4) {
                                            yiVar4 = yiVar5;
                                            it4 = it;
                                            it7 = it8;
                                            it6 = it9;
                                            str3 = str4;
                                            yiVar4 = yiVar4;
                                        }
                                    }
                                    f = 1.0f;
                                    f3 = (1.0f / ((abs2 + 1.0f) + f5)) * f;
                                    if (f3 > f4) {
                                    }
                                }
                            }
                            f3 = f4;
                            it4 = it;
                            it7 = it8;
                            it6 = it9;
                            str3 = str4;
                            yiVar4 = yiVar4;
                        }
                        str2 = str3;
                        Iterator it10 = it6;
                        if (yiVar4 == null || yiVar4.b() == null) {
                            c3 = c4;
                            it4 = it;
                            it6 = it10;
                            str3 = str2;
                            r4 = 0;
                        } else {
                            uiVar = new ui();
                            uiVar.f4478b.addAll(a8.c("Impression"));
                            a(yiVar3, uiVar);
                            yi a11 = yiVar3.a("VideoClicks", null);
                            uiVar.f4494s = (a11 == null || (a5 = a11.a("ClickThrough", null)) == null) ? null : a5.b();
                            uiVar.f4491p = yiVar4.b();
                            uiVar.f4492q = yiVar4.b("width");
                            uiVar.f4493r = yiVar4.b("height");
                            this.f3475g.addAll(a(a8.a()));
                            arrayList.addAll(a8.c("Error"));
                            uiVar.f4477a.addAll(arrayList);
                        }
                    }
                    if (uiVar != null) {
                        uiVar.f4495t.addAll(a(a8));
                        return uiVar;
                    }
                } else {
                    it = it4;
                    str2 = "Linear";
                }
                yi a12 = yiVar2.a("Wrapper", null);
                if (a12 != null) {
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    arrayList3.addAll(a12.c("Error"));
                    String f6 = a12.f("VASTAdTagURI");
                    if (f6 != null) {
                        try {
                            a3 = a(f6);
                        } catch (SocketTimeoutException unused) {
                            if (!arrayList3.isEmpty()) {
                                a(arrayList3, VASTErrorCodes.WrapperTimeout);
                            }
                        } catch (Exception unused2) {
                            if (!arrayList3.isEmpty()) {
                                a(arrayList3, VASTErrorCodes.WrapperNoReponse);
                            }
                        }
                        if (a3 != null && (a4 = a(a3, arrayList3, viVar)) != null) {
                            a4.f4478b.addAll(a12.c("Impression"));
                            ArrayList arrayList4 = new ArrayList();
                            String str5 = null;
                            it2 = a12.a("Creative", "Creatives", null, null).iterator();
                            while (it2.hasNext()) {
                                String str6 = str2;
                                yi a13 = ((yi) it2.next()).a(str6, str5);
                                if (a13 != null) {
                                    arrayList4.add(a13);
                                }
                                str2 = str6;
                                str5 = null;
                            }
                            it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                a((yi) it3.next(), a4);
                            }
                            if (this.f3475g.isEmpty()) {
                                Iterator it11 = this.f3475g.iterator();
                                while (it11.hasNext()) {
                                    ti tiVar = (ti) it11.next();
                                    Iterator it12 = a12.a().iterator();
                                    while (it12.hasNext()) {
                                        yi yiVar6 = (yi) it12.next();
                                        if (TextUtils.isEmpty(yiVar6.f("StaticResource")) && TextUtils.isEmpty(yiVar6.f("IFrameResource")) && TextUtils.isEmpty(yiVar6.f("HTMLResource"))) {
                                            tiVar.f4398e.addAll(yiVar6.c("CompanionClickTracking"));
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it13 = yiVar6.d("creativeView").iterator();
                                            while (it13.hasNext()) {
                                                String b8 = ((yi) it13.next()).b();
                                                if (!TextUtils.isEmpty(b8)) {
                                                    arrayList5.add(b8);
                                                }
                                            }
                                            tiVar.f.addAll(arrayList5);
                                        }
                                    }
                                }
                            } else {
                                this.f3475g.addAll(a(a12.a()));
                            }
                            a4.f4495t.addAll(a(a12));
                            return a4;
                        }
                    }
                    a3 = null;
                    if (a3 != null) {
                        a4.f4478b.addAll(a12.c("Impression"));
                        ArrayList arrayList42 = new ArrayList();
                        String str52 = null;
                        it2 = a12.a("Creative", "Creatives", null, null).iterator();
                        while (it2.hasNext()) {
                        }
                        it3 = arrayList42.iterator();
                        while (it3.hasNext()) {
                        }
                        if (this.f3475g.isEmpty()) {
                        }
                        a4.f4495t.addAll(a(a12));
                        return a4;
                    }
                }
                it4 = it;
                uiVar2 = 0;
            }
            return uiVar2;
        } catch (Exception unused3) {
            a(arrayList, VASTErrorCodes.XMLParsingError);
            return null;
        }
    }

    public final ui a(String str, vi viVar, String str2, Integer num) {
        VASTErrorCodes vASTErrorCodes;
        List unmodifiableList;
        this.f3475g.clear();
        ui a3 = a(str, new ArrayList(), viVar);
        if (a3 != null) {
            int i3 = str2 != null ? 1 : 0;
            int min = Math.min(this.f3475g.size() + i3, (num == null || num.intValue() <= 0) ? Integer.MAX_VALUE : num.intValue());
            if (min < 1) {
                unmodifiableList = null;
            } else {
                ArrayList arrayList = new ArrayList(min);
                Iterator it = this.f3475g.iterator();
                while (it.hasNext() && arrayList.size() < min - i3) {
                    arrayList.add((ti) it.next());
                }
                if (str2 != null) {
                    arrayList.add(new ti(300, 250, new cj(str2, VASTResource$Type.HTML_RESOURCE, VASTResource$CreativeType.NONE, 300, 250), null, new ArrayList(), new ArrayList()));
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            a3.f4490o = unmodifiableList;
            ArrayList arrayList2 = new ArrayList(a3.f4477a);
            VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
            a(arrayList2, vASTErrorCodes2);
            if (viVar != null) {
                viVar.a(vASTErrorCodes2);
                return a3;
            }
        } else if (viVar != null && (vASTErrorCodes = this.f3473d) != null) {
            viVar.a(vASTErrorCodes);
        }
        return a3;
    }

    public final String a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        int i3 = this.f3474e;
        BufferedInputStream bufferedInputStream = null;
        if (i3 >= this.f) {
            return null;
        }
        this.f3474e = i3 + 1;
        try {
            httpURLConnection = qf.a(str, this.f3476h);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    String next = new Scanner(bufferedInputStream2).useDelimiter("\\A").next();
                    si.a(bufferedInputStream2);
                    httpURLConnection.disconnect();
                    return next;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    si.a(bufferedInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    public static void a(yi yiVar, ui uiVar) {
        int i3;
        yi a3;
        Integer num;
        yiVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = yiVar.d("start").iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String b3 = ((yi) it.next()).b();
            if (!TextUtils.isEmpty(b3)) {
                arrayList.add(new bj(b3, 0));
            }
        }
        Iterator it2 = yiVar.d("progress").iterator();
        while (it2.hasNext()) {
            yi yiVar2 = (yi) it2.next();
            String a4 = yiVar2.a("offset");
            if (!TextUtils.isEmpty(a4)) {
                String trim = a4.trim();
                if (bj.f3508c.matcher(trim).matches()) {
                    String b4 = yiVar2.b();
                    Integer a5 = bj.a(trim);
                    if (a5 != null && a5.intValue() >= 0 && !TextUtils.isEmpty(b4)) {
                        arrayList.add(new bj(b4, a5));
                    }
                }
            }
        }
        Iterator it3 = yiVar.d("creativeView").iterator();
        while (it3.hasNext()) {
            String b5 = ((yi) it3.next()).b();
            if (!TextUtils.isEmpty(b5)) {
                arrayList.add(new bj(b5, 0));
            }
        }
        uiVar.f4479c.addAll(arrayList);
        Collections.sort(uiVar.f4479c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = yiVar.d("firstQuartile").iterator();
        while (it4.hasNext()) {
            String b6 = ((yi) it4.next()).b();
            if (!TextUtils.isEmpty(b6)) {
                arrayList2.add(new bj(b6, Float.valueOf(0.25f)));
            }
        }
        Iterator it5 = yiVar.d("midpoint").iterator();
        while (it5.hasNext()) {
            String b7 = ((yi) it5.next()).b();
            if (!TextUtils.isEmpty(b7)) {
                arrayList2.add(new bj(b7, Float.valueOf(0.5f)));
            }
        }
        Iterator it6 = yiVar.d("thirdQuartile").iterator();
        while (it6.hasNext()) {
            String b8 = ((yi) it6.next()).b();
            if (!TextUtils.isEmpty(b8)) {
                arrayList2.add(new bj(b8, Float.valueOf(0.75f)));
            }
        }
        Iterator it7 = yiVar.d("progress").iterator();
        while (it7.hasNext()) {
            yi yiVar3 = (yi) it7.next();
            String a6 = yiVar3.a("offset");
            if (!TextUtils.isEmpty(a6)) {
                String trim2 = a6.trim();
                if (bj.f3509d.matcher(trim2).matches()) {
                    String b9 = yiVar3.b();
                    try {
                        float parseFloat = Float.parseFloat(trim2.replace("%", "")) / 100.0f;
                        if (parseFloat >= 0.0f && !TextUtils.isEmpty(b9)) {
                            arrayList2.add(new bj(b9, Float.valueOf(parseFloat)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        uiVar.f4480d.addAll(arrayList2);
        Collections.sort(uiVar.f4480d);
        uiVar.f4481e.addAll(yiVar.e("pause"));
        uiVar.f.addAll(yiVar.e("resume"));
        uiVar.f4482g.addAll(yiVar.e("complete"));
        ArrayList e3 = yiVar.e("close");
        e3.addAll(yiVar.e("closeLinear"));
        uiVar.f4483h.addAll(e3);
        uiVar.f4486k.addAll(yiVar.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        wi wiVar = null;
        Iterator it8 = yiVar.a("ClickTracking", "VideoClicks", null, null).iterator();
        while (it8.hasNext()) {
            String b10 = ((yi) it8.next()).b();
            if (!TextUtils.isEmpty(b10)) {
                arrayList3.add(b10);
            }
        }
        uiVar.f4487l.addAll(arrayList3);
        uiVar.f4484i.addAll(yiVar.e("mute"));
        uiVar.f4485j.addAll(yiVar.e("unmute"));
        if (uiVar.f4488m == null) {
            String a7 = yiVar.a("skipoffset");
            if (a7 == null || TextUtils.isEmpty(a7.trim()) || !bj.f3508c.matcher(a7).matches() || (num = bj.a(a7)) == null || num.intValue() < 0) {
                num = null;
            }
            uiVar.f4488m = num;
        }
        if (uiVar.f4489n == null) {
            ArrayList a8 = yiVar.a("Icon", "Icons", null, null);
            VASTResource$Type[] values = VASTResource$Type.values();
            int length = values.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                VASTResource$Type vASTResource$Type = values[i3];
                if (vASTResource$Type != VASTResource$Type.IFRAME_RESOURCE && vASTResource$Type != VASTResource$Type.HTML_RESOURCE) {
                    Iterator it9 = a8.iterator();
                    while (it9.hasNext()) {
                        yi yiVar4 = (yi) it9.next();
                        Integer b11 = yiVar4.b("assetWidth");
                        if (b11 == null) {
                            b11 = yiVar4.b("width");
                        }
                        Integer b12 = yiVar4.b("assetHeight");
                        if (b12 == null) {
                            b12 = yiVar4.b("height");
                        }
                        if (b11 != null && b11.intValue() > 0 && b11.intValue() <= 300 && b12 != null && b12.intValue() > 0 && b12.intValue() <= 300 && cj.a(yiVar4, vASTResource$Type, b11.intValue(), b12.intValue()) != null) {
                            String a9 = yiVar4.a("offset");
                            if (a9 != null && bj.f3508c.matcher(a9).matches()) {
                                bj.a(a9);
                            }
                            String a10 = yiVar4.a("duration");
                            if (a10 != null && bj.f3508c.matcher(a10).matches()) {
                                bj.a(a10);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it10 = yiVar4.a("IconClickTracking", "IconClicks", null, null).iterator();
                            while (it10.hasNext()) {
                                String b13 = ((yi) it10.next()).b();
                                if (!TextUtils.isEmpty(b13)) {
                                    arrayList4.add(b13);
                                }
                            }
                            yi a11 = yiVar4.a("IconClicks", null);
                            if (a11 != null && (a3 = a11.a("IconClickThrough", null)) != null) {
                                a3.b();
                            }
                            yiVar4.c("IconViewTracking");
                            wiVar = new wi();
                        }
                    }
                }
                i3++;
            }
            uiVar.f4489n = wiVar;
        }
    }

    public final void a(ArrayList arrayList, VASTErrorCodes vASTErrorCodes) {
        this.f3473d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        zi ziVar = this.f3472c;
        if (ziVar != null) {
            ziVar.a(arrayList2, vASTErrorCodes);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        VASTResource$Type vASTResource$Type;
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yi yiVar = (yi) it.next();
            if (!TextUtils.isEmpty(yiVar.f("StaticResource")) || !TextUtils.isEmpty(yiVar.f("IFrameResource")) || !TextUtils.isEmpty(yiVar.f("HTMLResource"))) {
                if (yiVar.f("StaticResource") != null) {
                    vASTResource$Type = VASTResource$Type.STATIC_RESOURCE;
                } else if (yiVar.f("IFrameResource") != null) {
                    vASTResource$Type = VASTResource$Type.IFRAME_RESOURCE;
                } else {
                    vASTResource$Type = yiVar.f("HTMLResource") != null ? VASTResource$Type.HTML_RESOURCE : null;
                }
                if (vASTResource$Type != null) {
                    Integer b3 = yiVar.b("assetWidth");
                    if (b3 == null) {
                        b3 = yiVar.b("width");
                    }
                    Integer b4 = yiVar.b("assetHeight");
                    if (b4 == null) {
                        b4 = yiVar.b("height");
                    }
                    if (vASTResource$Type != VASTResource$Type.STATIC_RESOURCE) {
                        if (b3 == null) {
                            b3 = 300;
                        }
                        if (b4 == null) {
                            b4 = 250;
                        }
                    } else {
                        if (b3 == null) {
                            b3 = 1;
                        }
                        if (b4 == null) {
                            b4 = 1;
                        }
                    }
                    int intValue = b3.intValue();
                    int intValue2 = b4.intValue();
                    Point point = new Point(intValue, intValue2);
                    int i3 = this.f3470a;
                    float f = i3;
                    int i4 = (int) (f / this.f3471b);
                    if (intValue > i3 || intValue2 > i4) {
                        if (vASTResource$Type == VASTResource$Type.HTML_RESOURCE) {
                            point.x = Math.min(i3, intValue);
                            point.y = Math.min(i4, intValue2);
                        } else {
                            float f3 = intValue;
                            float f4 = f3 / f;
                            float f5 = intValue2;
                            float f6 = f5 / i4;
                            if (f4 > f6) {
                                point.x = i3;
                                point.y = (int) (f5 / f4);
                            } else {
                                point.x = (int) (f3 / f6);
                                point.y = i4;
                            }
                        }
                    }
                    int i5 = point.x;
                    if (i5 >= 300 || point.y >= 250) {
                        cj a3 = cj.a(yiVar, vASTResource$Type, i5, point.y);
                        if (a3 != null) {
                            int i6 = point.x;
                            int i7 = point.y;
                            String f7 = yiVar.f("CompanionClickThrough");
                            ArrayList c3 = yiVar.c("CompanionClickTracking");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = yiVar.d("creativeView").iterator();
                            while (it2.hasNext()) {
                                String b5 = ((yi) it2.next()).b();
                                if (!TextUtils.isEmpty(b5)) {
                                    arrayList2.add(b5);
                                }
                            }
                            hashSet.add(new ti(i6, i7, a3, f7, c3, arrayList2));
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(yi yiVar) {
        String f;
        String f3;
        ArrayList a3 = yiVar.a("Verification", "AdVerifications", null, null);
        Iterator it = yiVar.a("Extension", "Extensions", "type", Collections.singletonList("AdVerifications")).iterator();
        while (it.hasNext()) {
            a3.addAll(((yi) it.next()).a("Verification", "AdVerifications", null, null));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a3.iterator();
        while (it2.hasNext()) {
            yi yiVar2 = (yi) it2.next();
            String a4 = yiVar2.a("vendor");
            if (a4 != null && (f = yiVar2.f("JavaScriptResource")) != null && (f3 = yiVar2.f("VerificationParameters")) != null) {
                yi a5 = yiVar2.a("JavaScriptResource", "apiFramework");
                String a6 = a5 == null ? null : a5.a("apiFramework");
                if (a6 != null && a6.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(a4, f, f3));
                }
            }
        }
        return arrayList;
    }
}
