package com.google.android.gms.internal.ads;

import Q2.C0375o;
import Q2.C0387u0;
import T2.C0438p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.InterfaceC2092b;
import n.AbstractC2107A;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1390oj implements P1, Y2, InterfaceC1680v3, J3, InterfaceC2092b, W2.c, Xu, Jw, Cif, InterfaceC1165jj, Br {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14826k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14827l;

    /* renamed from: m, reason: collision with root package name */
    public Object f14828m;

    public /* synthetic */ C1390oj(int i, Object obj, Object obj2) {
        this.f14826k = i;
        this.f14827l = obj;
        this.f14828m = obj2;
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
        ((C0634Ld) this.f14827l).c(new RuntimeException(AbstractC2107A.q("onConnectionSuspended: ", i)));
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        try {
            ((C0634Ld) this.f14827l).b((L9) ((C1414p6) ((P9) this.f14828m).f11072l).t());
        } catch (DeadObjectException e3) {
            ((C0634Ld) this.f14827l).c(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Xu
    /* renamed from: a */
    public InterfaceC1402ov mo19a() {
        C0614Ie c0614Ie = (C0614Ie) this.f14827l;
        c0614Ie.getClass();
        InterfaceC1402ov mo19a = ((Xu) this.f14828m).mo19a();
        Mt mt = new Mt(13, c0614Ie);
        return new C0585Ee(c0614Ie.f9551k, mo19a, c0614Ie.f9564x, c0614Ie.f9565y, c0614Ie, mt);
    }

    @Override // com.google.android.gms.internal.ads.Y2
    public void c(C1617tm c1617tm) {
        if (c1617tm.v() != 0 || (c1617tm.v() & 128) == 0) {
            return;
        }
        c1617tm.k(6);
        int o5 = c1617tm.o() / 4;
        int i = 0;
        while (true) {
            C0740a3 c0740a3 = (C0740a3) this.f14828m;
            if (i >= o5) {
                c0740a3.f.remove(0);
                return;
            }
            C0826c0 c0826c0 = (C0826c0) this.f14827l;
            c1617tm.f(c0826c0.f12943b, 0, 4);
            c0826c0.s(0);
            int f = c0826c0.f(16);
            c0826c0.u(3);
            if (f == 0) {
                c0826c0.u(13);
            } else {
                int f5 = c0826c0.f(13);
                if (c0740a3.f.get(f5) == null) {
                    c0740a3.f.put(f5, new Z2(new C1245lH(c0740a3, f5)));
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a1 A[LOOP:0: B:2:0x0010->B:60:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bf A[EDGE_INSN: B:61:0x02bf->B:62:0x02bf BREAK  A[LOOP:0: B:2:0x0010->B:60:0x02a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1815y3 d(A3 a32) {
        int i;
        M0.e eVar;
        byte[] bArr;
        C0709Wb c0709Wb;
        String str;
        int i5;
        int i6;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        C1390oj c1390oj = this;
        E.H0 h02 = a32.f7530v;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                C1456q3 c1456q3 = a32.f7528t;
                if (c1456q3 == null) {
                    map = Collections.EMPTY_MAP;
                    i = 2;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = c1456q3.f15088b;
                    if (str2 != null) {
                        i = 2;
                        hashMap.put("If-None-Match", str2);
                    } else {
                        i = 2;
                    }
                    long j5 = c1456q3.f15090d;
                    if (j5 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j5)));
                    }
                    map = hashMap;
                }
            } catch (IOException e3) {
                e = e3;
                i = 2;
            }
            try {
                ((C1543s1) c1390oj.f14827l).getClass();
                M0.e n5 = C1543s1.n(a32, map);
                try {
                    int i7 = n5.f3590b;
                    List unmodifiableList = Collections.unmodifiableList((ArrayList) n5.f3592d);
                    if (i7 == 304) {
                        SystemClock.elapsedRealtime();
                        C1456q3 c1456q32 = a32.f7528t;
                        if (c1456q32 == null) {
                            return new C1815y3(304, null, true, unmodifiableList);
                        }
                        TreeSet treeSet = new TreeSet(comparator);
                        if (!unmodifiableList.isEmpty()) {
                            Iterator it = unmodifiableList.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((C1635u3) it.next()).f15790a);
                            }
                        }
                        ArrayList arrayList = new ArrayList(unmodifiableList);
                        List list = c1456q32.f15093h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (C1635u3 c1635u3 : c1456q32.f15093h) {
                                    if (!treeSet.contains(c1635u3.f15790a)) {
                                        arrayList.add(c1635u3);
                                    }
                                }
                            }
                        } else if (!c1456q32.f15092g.isEmpty()) {
                            for (Map.Entry entry : c1456q32.f15092g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new C1635u3((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new C1815y3(304, c1456q32.f15087a, true, arrayList);
                    }
                    L3 l32 = (L3) n5.f3593e;
                    if (l32 == null) {
                        l32 = null;
                    }
                    if (l32 != null) {
                        int i8 = n5.f3591c;
                        G3 g32 = (G3) c1390oj.f14828m;
                        M3 m32 = new M3(g32, i8);
                        try {
                            bArr3 = g32.j(1024);
                            while (true) {
                                try {
                                    int read = l32.read(bArr3);
                                    if (read == -1) {
                                        break;
                                    }
                                    m32.write(bArr3, 0, read);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        l32.close();
                                        break;
                                    } catch (IOException unused) {
                                        F3.c("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    g32.g(bArr3);
                                    m32.close();
                                    throw th;
                                }
                            }
                            byte[] byteArray = m32.toByteArray();
                            try {
                                l32.close();
                            } catch (IOException unused2) {
                                F3.c("Error occurred when closing InputStream", new Object[0]);
                            }
                            g32.g(bArr3);
                            m32.close();
                            bArr2 = byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            bArr3 = null;
                        }
                    } else {
                        bArr2 = new byte[0];
                    }
                    try {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (F3.f8650a || elapsedRealtime2 > 3000) {
                            Long valueOf = Long.valueOf(elapsedRealtime2);
                            String valueOf2 = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            Integer valueOf3 = Integer.valueOf(i7);
                            Integer valueOf4 = Integer.valueOf(h02.f1042b);
                            Object[] objArr = new Object[5];
                            objArr[0] = a32;
                            objArr[1] = valueOf;
                            objArr[i] = valueOf2;
                            objArr[3] = valueOf3;
                            objArr[4] = valueOf4;
                            F3.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (i7 < 200 || i7 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new C1815y3(i7, bArr2, false, unmodifiableList);
                    } catch (IOException e5) {
                        e = e5;
                        bArr = bArr2;
                        eVar = n5;
                        if (e instanceof SocketTimeoutException) {
                        }
                        str = (String) c0709Wb.f12040l;
                        i5 = h02.f1041a;
                        try {
                            C3 c32 = (C3) c0709Wb.f12041m;
                            i6 = h02.f1042b + 1;
                            h02.f1042b = i6;
                            h02.f1041a = i5 + i5;
                            if (i6 > 1) {
                            }
                        } catch (C3 e6) {
                            a32.d(str + "-timeout-giveup [timeout=" + i5 + "]");
                            throw e6;
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    eVar = n5;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                        c0709Wb = new C0709Wb(6, "socket", new C1770x3());
                    } else {
                        boolean z3 = e instanceof MalformedURLException;
                        String str3 = a32.f7521m;
                        if (z3) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(str3)), e);
                        }
                        if (eVar == null) {
                            throw new C1860z3(e);
                        }
                        int i9 = eVar.f3590b;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = Integer.valueOf(i9);
                        objArr2[1] = str3;
                        F3.b("Unexpected response code %d for %s", objArr2);
                        if (bArr != null) {
                            List<C1635u3> unmodifiableList2 = Collections.unmodifiableList((ArrayList) eVar.f3592d);
                            SystemClock.elapsedRealtime();
                            if (unmodifiableList2 != null) {
                                if (unmodifiableList2.isEmpty()) {
                                    Map map2 = Collections.EMPTY_MAP;
                                } else {
                                    TreeMap treeMap = new TreeMap(comparator);
                                    for (C1635u3 c1635u32 : unmodifiableList2) {
                                        treeMap.put(c1635u32.f15790a, c1635u32.f15791b);
                                    }
                                }
                            }
                            if (unmodifiableList2 != null) {
                                Collections.unmodifiableList(unmodifiableList2);
                            }
                            if (i9 != 401 && i9 != 403) {
                                if (i9 < 400 || i9 > 499) {
                                    throw new C1770x3();
                                }
                                throw new C1545s3();
                            }
                            c0709Wb = new C0709Wb(6, "auth", new C1411p3());
                        } else {
                            c0709Wb = new C0709Wb(6, "network", new C1770x3());
                        }
                    }
                    str = (String) c0709Wb.f12040l;
                    i5 = h02.f1041a;
                    C3 c322 = (C3) c0709Wb.f12041m;
                    i6 = h02.f1042b + 1;
                    h02.f1042b = i6;
                    h02.f1041a = i5 + i5;
                    if (i6 > 1) {
                        throw c322;
                    }
                    a32.d(str + "-retry [timeout=" + i5 + "]");
                    c1390oj = this;
                }
            } catch (IOException e8) {
                e = e8;
                eVar = null;
                bArr = null;
                if (e instanceof SocketTimeoutException) {
                }
                str = (String) c0709Wb.f12040l;
                i5 = h02.f1041a;
                C3 c3222 = (C3) c0709Wb.f12041m;
                i6 = h02.f1042b + 1;
                h02.f1042b = i6;
                h02.f1041a = i5 + i5;
                if (i6 > 1) {
                }
            }
            a32.d(str + "-retry [timeout=" + i5 + "]");
            c1390oj = this;
        }
    }

    public F e(Object... objArr) {
        Constructor a5;
        synchronized (((AtomicBoolean) this.f14828m)) {
            if (!((AtomicBoolean) this.f14828m).get()) {
                try {
                    a5 = ((C) this.f14827l).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f14828m).set(true);
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            a5 = null;
        }
        if (a5 == null) {
            return null;
        }
        try {
            return (F) a5.newInstance(objArr);
        } catch (Exception e5) {
            throw new IllegalStateException("Unexpected error creating extractor", e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03aa, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0122, code lost:
    
        if (")".equals(com.google.android.gms.internal.ads.C1455q2.a(r7, r9)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f9  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(byte[] bArr, int i, int i5, Q1 q12) {
        C1544s2 c1544s2;
        String str;
        int i6;
        String sb;
        int i7;
        char c5;
        C1390oj c1390oj = this;
        int i8 = -1;
        int i9 = 1;
        C1617tm c1617tm = (C1617tm) c1390oj.f14827l;
        c1617tm.h(i + i5, bArr);
        c1617tm.j(i);
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = c1617tm.f15725b;
            Charset charset = StandardCharsets.UTF_8;
            String H5 = c1617tm.H(charset);
            String str2 = null;
            if (H5 == null || !H5.startsWith("WEBVTT")) {
                c1617tm.j(i10);
                throw B7.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(c1617tm.H(charset))));
            }
            while (!TextUtils.isEmpty(c1617tm.H(StandardCharsets.UTF_8))) {
                c1390oj = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r6 = 0;
                int i11 = i8;
                int i12 = 0;
                while (i11 == i8) {
                    i12 = c1617tm.f15725b;
                    String H6 = c1617tm.H(StandardCharsets.UTF_8);
                    i11 = H6 == null ? 0 : "STYLE".equals(H6) ? 2 : H6.startsWith("NOTE") ? i9 : 3;
                }
                c1617tm.j(i12);
                if (i11 == 0) {
                    AbstractC1668us.p(new C0905dr(arrayList2), q12);
                    return;
                }
                if (i11 == i9) {
                    while (!TextUtils.isEmpty(c1617tm.H(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (i11 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        c1617tm.H(StandardCharsets.UTF_8);
                        C1455q2 c1455q2 = (C1455q2) c1390oj.f14828m;
                        StringBuilder sb2 = c1455q2.f15086b;
                        sb2.setLength(0);
                        int i13 = c1617tm.f15725b;
                        while (!TextUtils.isEmpty(c1617tm.H(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = c1617tm.f15724a;
                        int i14 = c1617tm.f15725b;
                        C1617tm c1617tm2 = c1455q2.f15085a;
                        c1617tm2.h(i14, bArr2);
                        c1617tm2.j(i13);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            C1455q2.b(c1617tm2);
                            if (c1617tm2.o() >= 5 && "::cue".equals(c1617tm2.b(5, StandardCharsets.UTF_8))) {
                                int i15 = c1617tm2.f15725b;
                                String a5 = C1455q2.a(c1617tm2, sb2);
                                if (a5 != null) {
                                    if ("{".equals(a5)) {
                                        c1617tm2.j(i15);
                                        str = "";
                                    } else if ("(".equals(a5)) {
                                        int i16 = c1617tm2.f15725b;
                                        int i17 = c1617tm2.f15726c;
                                        int i18 = r6 == true ? 1 : 0;
                                        while (i16 < i17 && i18 == 0) {
                                            int i19 = i16 + 1;
                                            int i20 = ((char) c1617tm2.f15724a[i16]) == ')' ? i9 : r6 == true ? 1 : 0;
                                            i16 = i19;
                                            i18 = i20;
                                        }
                                        str = c1617tm2.b((i16 + i8) - c1617tm2.f15725b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null || !"{".equals(C1455q2.a(c1617tm2, sb2))) {
                                        break;
                                    }
                                    C1499r2 c1499r2 = new C1499r2();
                                    c1499r2.f15244a = "";
                                    c1499r2.f15245b = "";
                                    c1499r2.f15246c = Collections.EMPTY_SET;
                                    c1499r2.f15247d = "";
                                    c1499r2.f15248e = str2;
                                    c1499r2.f15249g = r6;
                                    c1499r2.i = r6;
                                    c1499r2.f15251j = i8;
                                    c1499r2.f15252k = i8;
                                    c1499r2.f15253l = i8;
                                    c1499r2.f15254m = i8;
                                    c1499r2.f15256o = i8;
                                    c1499r2.f15257p = r6;
                                    if ("".equals(str)) {
                                        i6 = r6 == true ? 1 : 0;
                                    } else {
                                        int indexOf = str.indexOf(91);
                                        if (indexOf != i8) {
                                            Matcher matcher = C1455q2.f15083c.matcher(str.substring(indexOf));
                                            if (matcher.matches()) {
                                                String group = matcher.group(i9);
                                                group.getClass();
                                                c1499r2.f15247d = group;
                                            }
                                            str = str.substring(r6 == true ? 1 : 0, indexOf);
                                        }
                                        int i21 = AbstractC1260lo.f14419a;
                                        String[] split = str.split("\\.", i8);
                                        String str3 = split[r6 == true ? 1 : 0];
                                        int indexOf2 = str3.indexOf(35);
                                        if (indexOf2 != i8) {
                                            c1499r2.f15245b = str3.substring(r6 == true ? 1 : 0, indexOf2);
                                            c1499r2.f15244a = str3.substring(indexOf2 + i9);
                                        } else {
                                            c1499r2.f15245b = str3;
                                        }
                                        int length = split.length;
                                        if (length > i9) {
                                            c1499r2.f15246c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i9, length)));
                                        }
                                        i6 = r6 == true ? 1 : 0;
                                        str2 = null;
                                    }
                                    while (i6 == 0) {
                                        int i22 = c1617tm2.f15725b;
                                        String a6 = C1455q2.a(c1617tm2, sb2);
                                        int i23 = (a6 == null || "}".equals(a6)) ? i9 : r6;
                                        if (i23 == 0) {
                                            c1617tm2.j(i22);
                                            C1455q2.b(c1617tm2);
                                            String c6 = C1455q2.c(c1617tm2, sb2);
                                            if (!"".equals(c6) && ":".equals(C1455q2.a(c1617tm2, sb2))) {
                                                C1455q2.b(c1617tm2);
                                                StringBuilder sb3 = new StringBuilder();
                                                boolean z3 = false;
                                                while (true) {
                                                    if (z3) {
                                                        sb = sb3.toString();
                                                        break;
                                                    }
                                                    int i24 = c1617tm2.f15725b;
                                                    boolean z5 = z3;
                                                    String a7 = C1455q2.a(c1617tm2, sb2);
                                                    if (a7 == null) {
                                                        sb = null;
                                                        break;
                                                    } else if ("}".equals(a7) || ";".equals(a7)) {
                                                        c1617tm2.j(i24);
                                                        z3 = true;
                                                    } else {
                                                        sb3.append(a7);
                                                        z3 = z5;
                                                    }
                                                }
                                                if (sb != null && !"".equals(sb)) {
                                                    int i25 = c1617tm2.f15725b;
                                                    String a8 = C1455q2.a(c1617tm2, sb2);
                                                    if (!";".equals(a8)) {
                                                        if ("}".equals(a8)) {
                                                            c1617tm2.j(i25);
                                                        }
                                                    }
                                                    if ("color".equals(c6)) {
                                                        i7 = 1;
                                                        c1499r2.f = AbstractC1479qi.a(sb, true);
                                                        c1499r2.f15249g = true;
                                                    } else {
                                                        i7 = 1;
                                                        if ("background-color".equals(c6)) {
                                                            c1499r2.f15250h = AbstractC1479qi.a(sb, true);
                                                            c1499r2.i = true;
                                                        } else if ("ruby-position".equals(c6)) {
                                                            if ("over".equals(sb)) {
                                                                c1499r2.f15256o = 1;
                                                            } else if ("under".equals(sb)) {
                                                                c1499r2.f15256o = 2;
                                                            }
                                                        } else if ("text-combine-upright".equals(c6)) {
                                                            c1499r2.f15257p = "all".equals(sb) || sb.startsWith("digits");
                                                        } else if ("text-decoration".equals(c6)) {
                                                            if ("underline".equals(sb)) {
                                                                c1499r2.f15251j = 1;
                                                            }
                                                        } else if ("font-family".equals(c6)) {
                                                            c1499r2.f15248e = AbstractC0952et.n(sb);
                                                        } else {
                                                            if (!"font-weight".equals(c6)) {
                                                                i7 = 1;
                                                                if ("font-style".equals(c6)) {
                                                                    if ("italic".equals(sb)) {
                                                                        c1499r2.f15253l = 1;
                                                                    }
                                                                } else if ("font-size".equals(c6)) {
                                                                    Matcher matcher2 = C1455q2.f15084d.matcher(AbstractC0952et.n(sb));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        int hashCode = group2.hashCode();
                                                                        if (hashCode == 37) {
                                                                            if (group2.equals("%")) {
                                                                                c5 = 2;
                                                                                if (c5 == 0) {
                                                                                }
                                                                                String group3 = matcher2.group(i9);
                                                                                group3.getClass();
                                                                                c1499r2.f15255n = Float.parseFloat(group3);
                                                                            }
                                                                            c5 = 65535;
                                                                            if (c5 == 0) {
                                                                            }
                                                                            String group32 = matcher2.group(i9);
                                                                            group32.getClass();
                                                                            c1499r2.f15255n = Float.parseFloat(group32);
                                                                        } else if (hashCode != 3240) {
                                                                            if (hashCode == 3592 && group2.equals("px")) {
                                                                                c5 = 0;
                                                                                if (c5 == 0) {
                                                                                    i9 = 1;
                                                                                    if (c5 == 1) {
                                                                                        c1499r2.f15254m = 2;
                                                                                    } else {
                                                                                        if (c5 != 2) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        c1499r2.f15254m = 3;
                                                                                    }
                                                                                } else {
                                                                                    i9 = 1;
                                                                                    c1499r2.f15254m = 1;
                                                                                }
                                                                                String group322 = matcher2.group(i9);
                                                                                group322.getClass();
                                                                                c1499r2.f15255n = Float.parseFloat(group322);
                                                                            }
                                                                            c5 = 65535;
                                                                            if (c5 == 0) {
                                                                            }
                                                                            String group3222 = matcher2.group(i9);
                                                                            group3222.getClass();
                                                                            c1499r2.f15255n = Float.parseFloat(group3222);
                                                                        } else {
                                                                            if (group2.equals("em")) {
                                                                                c5 = 1;
                                                                                if (c5 == 0) {
                                                                                }
                                                                                String group32222 = matcher2.group(i9);
                                                                                group32222.getClass();
                                                                                c1499r2.f15255n = Float.parseFloat(group32222);
                                                                            }
                                                                            c5 = 65535;
                                                                            if (c5 == 0) {
                                                                            }
                                                                            String group322222 = matcher2.group(i9);
                                                                            group322222.getClass();
                                                                            c1499r2.f15255n = Float.parseFloat(group322222);
                                                                        }
                                                                    } else {
                                                                        JB.l("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                    }
                                                                }
                                                            } else if ("bold".equals(sb)) {
                                                                i7 = 1;
                                                                c1499r2.f15252k = 1;
                                                            }
                                                            str2 = a6;
                                                            i6 = i23;
                                                            r6 = 0;
                                                        }
                                                    }
                                                    i9 = i7;
                                                }
                                                i9 = 1;
                                                str2 = a6;
                                                i6 = i23;
                                                r6 = 0;
                                            }
                                        }
                                        str2 = a6;
                                        i6 = i23;
                                        r6 = 0;
                                    }
                                    if ("}".equals(str2)) {
                                        arrayList3.add(c1499r2);
                                    }
                                    i8 = -1;
                                    r6 = 0;
                                    str2 = null;
                                }
                            }
                            str = str2;
                            if (str == null) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    Pattern pattern = AbstractC1814y2.f16382a;
                    Charset charset2 = StandardCharsets.UTF_8;
                    String H7 = c1617tm.H(charset2);
                    if (H7 != null) {
                        Pattern pattern2 = AbstractC1814y2.f16382a;
                        Matcher matcher3 = pattern2.matcher(H7);
                        if (matcher3.matches()) {
                            c1544s2 = AbstractC1814y2.c(null, matcher3, c1617tm, arrayList);
                        } else {
                            String H8 = c1617tm.H(charset2);
                            if (H8 != null) {
                                Matcher matcher4 = pattern2.matcher(H8);
                                if (matcher4.matches()) {
                                    c1544s2 = AbstractC1814y2.c(H7.trim(), matcher4, c1617tm, arrayList);
                                }
                            }
                        }
                        if (c1544s2 != null) {
                            arrayList2.add(c1544s2);
                        }
                    }
                    c1544s2 = null;
                    if (c1544s2 != null) {
                    }
                    c1390oj = this;
                    i8 = -1;
                    str2 = null;
                }
            }
        } catch (B7 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public void g(Ar ar) {
        S4 s42 = new S4(5, (Lm) this.f14827l);
        Qw qw = (Qw) this.f14828m;
        E3.a d5 = ((C0606Hd) qw).d(s42);
        d5.a(new Kw(0, d5, new Om(ar, 0)), qw);
    }

    public synchronized String j() {
        return (String) this.f14828m;
    }

    public void k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f14827l).put(str, str2);
    }

    public void l(Lq lq) {
        k("aai", lq.f10531w);
        k("request_id", lq.f10514n0);
        k("ad_format", Lq.a(lq.f10491b));
    }

    public Set m(C1837yh c1837yh) {
        return Collections.singleton(new Si(c1837yh, AbstractC0613Id.f9544g));
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public void n(String str, int i, String str2, boolean z3) {
        Wj wj = (Wj) this.f14827l;
        wj.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) ((Map) this.f14828m).get("id"));
        wj.f12065b.b(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        Bundle bundle;
        switch (this.f14826k) {
            case 14:
                String str = (String) obj;
                C1342ng c1342ng = (C1342ng) this.f14828m;
                c1342ng.f14672r.a(c1342ng.f14671q.b(c1342ng.f14669o, c1342ng.f14670p, false, (String) this.f14827l, str, c1342ng.d()));
                return;
            case 15:
            case 17:
            case 19:
            case 20:
            case 22:
            default:
                InterfaceC0814bo interfaceC0814bo = (InterfaceC0814bo) obj;
                synchronized (((G7) this.f14828m)) {
                    ((Tn) ((G7) this.f14828m).f9175g).c(interfaceC0814bo, (Lq) this.f14827l);
                    Lq a5 = ((Tn) ((G7) this.f14828m).f9175g).a();
                    if (a5 != null) {
                        ((G7) this.f14828m).q(a5);
                    }
                }
                return;
            case 16:
                List list = ((C0940eh) obj).f13324a;
                C0375o c0375o = (C0375o) this.f14827l;
                C1075hh c1075hh = (C1075hh) this.f14828m;
                Qw qw = c1075hh.f13777a;
                if (list == null || list.isEmpty()) {
                    qw.execute(new RunnableC0985fh(c0375o, 0));
                    return;
                }
                E3.a aVar = Mw.f10750l;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aVar = AbstractC1400ot.j0(AbstractC1400ot.X(aVar, Throwable.class, new N9(3, c0375o), qw), new C1030gh(c1075hh, c0375o, (E3.a) it.next(), 0), qw);
                }
                aVar.a(new Kw(0, aVar, new C0709Wb(16, c1075hh, c0375o, false)), qw);
                return;
            case 18:
                ((Cj) this.f14828m).u((View) this.f14827l, (C1169jn) obj);
                return;
            case C1639u7.zzm /* 21 */:
                ((InterfaceC0677Re) obj).r((String) this.f14827l, (InterfaceC1821y9) this.f14828m);
                return;
            case 23:
                ((Ol) obj).f10987x = true;
                ((BinderC0767am) this.f14828m).f12706n.b((String) this.f14827l);
                return;
            case 24:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    A7 a7 = F7.f8805b2;
                    Q2.r rVar = Q2.r.f5053d;
                    boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
                    InterfaceC1293mc interfaceC1293mc = (InterfaceC1293mc) this.f14828m;
                    if (!booleanValue) {
                        interfaceC1293mc.h0(parcelFileDescriptor);
                        return;
                    }
                    boolean booleanValue2 = ((Boolean) rVar.f5056c.a(F7.f8810c2)).booleanValue();
                    C1428pc c1428pc = (C1428pc) this.f14827l;
                    if (booleanValue2 && (bundle = c1428pc.f15007w) != null) {
                        P2.o.f4767B.f4776j.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    interfaceC1293mc.M2(parcelFileDescriptor, c1428pc);
                    return;
                } catch (RemoteException e3) {
                    T2.G.n("Service can't call client", e3);
                    return;
                }
        }
    }

    public Set p(C1837yh c1837yh) {
        return Collections.singleton(new Si(c1837yh, AbstractC0613Id.f9544g));
    }

    public void q() {
        ((C1482ql) this.f14828m).f15166b.execute(new RunnableC1437pl(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f14826k) {
            case 14:
                C1342ng c1342ng = (C1342ng) this.f14828m;
                c1342ng.f14672r.a(c1342ng.f14671q.b(c1342ng.f14669o, c1342ng.f14670p, false, (String) this.f14827l, null, c1342ng.d()));
                return;
            case 15:
            case 17:
            case 19:
            case 20:
            case 22:
            default:
                synchronized (((G7) this.f14828m)) {
                    try {
                        ((Tn) ((G7) this.f14828m).f9175g).b((Lq) this.f14827l);
                        Lq a5 = ((Tn) ((G7) this.f14828m).f9175g).a();
                        if (((Lq) this.f14827l).f10530v0) {
                            while (a5 != null) {
                                ((G7) this.f14828m).q(a5);
                                a5 = ((Tn) ((G7) this.f14828m).f9175g).a();
                            }
                        } else if (a5 != null) {
                            ((G7) this.f14828m).q(a5);
                        }
                    } finally {
                    }
                }
                return;
            case 16:
                ((C0375o) this.f14827l).u(th);
                AbstractC0613Id.f.execute(new K4(22, (C1075hh) this.f14828m));
                return;
            case 18:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a5)).booleanValue()) {
                    P2.o.f4767B.f4774g.h("omid native display exp", th);
                    return;
                }
                return;
            case C1639u7.zzm /* 21 */:
            case 23:
                return;
            case 24:
                try {
                    InterfaceC1293mc interfaceC1293mc = (InterfaceC1293mc) this.f14828m;
                    C0387u0 d5 = AbstractC1803xs.d(th);
                    interfaceC1293mc.C2(new C0438p(AbstractC0952et.u(th.getMessage()) ? d5.f5059l : th.getMessage(), d5.f5058k));
                    return;
                } catch (RemoteException e3) {
                    T2.G.n("Service can't call client", e3);
                    return;
                }
        }
    }

    @Override // W2.c
    public void w(J2.b bVar) {
        InterfaceC0659Pa interfaceC0659Pa = (InterfaceC0659Pa) this.f14827l;
        try {
            String canonicalName = ((W2.a) this.f14828m).getClass().getCanonicalName();
            int i = bVar.f2695b;
            String str = (String) bVar.f2696c;
            U2.j.d(canonicalName + "failed to load mediation ad: ErrorCode = " + i + ". ErrorMessage = " + str + ". ErrorDomain = " + ((String) bVar.f2697d));
            interfaceC0659Pa.a3(bVar.m());
            interfaceC0659Pa.D2(str, i);
            interfaceC0659Pa.B(i);
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
        C0634Ld c0634Ld = (C0634Ld) this.f14828m;
        Fn fn = (Fn) this.f14827l;
        fn.getClass();
        try {
            Q1.j jVar = P2.o.f4767B.f4770b;
            Q1.j.g(context, (AdOverlayInfoParcel) c0634Ld.f10334k.get(), true, (C1482ql) fn.f);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C1390oj(int i, Object obj, Object obj2, boolean z3) {
        this.f14826k = i;
        this.f14827l = obj2;
        this.f14828m = obj;
    }

    @Override // com.google.android.gms.internal.ads.J3
    public File a() {
        if (((File) this.f14827l) == null) {
            this.f14827l = new File(((Context) this.f14828m).getCacheDir(), "volley");
        }
        return (File) this.f14827l;
    }

    public C1390oj(Context context) {
        this.f14826k = 6;
        this.f14828m = context;
        this.f14827l = null;
    }

    @Override // com.google.android.gms.internal.ads.Br
    /* renamed from: a, reason: collision with other method in class */
    public void mo20a() {
        N7 n7 = (N7) ((C1395oo) this.f14827l).f14854d;
        M7 m7 = (M7) this.f14828m;
        Parcel N5 = n7.N();
        F5.e(N5, m7);
        n7.d1(N5, 1);
    }

    public C1390oj(C0740a3 c0740a3) {
        this.f14826k = 4;
        this.f14828m = c0740a3;
        this.f14827l = new C0826c0(4, new byte[4]);
    }

    public C1390oj(int i) {
        this.f14826k = i;
        switch (i) {
            case 3:
                this.f14827l = new C1617tm();
                this.f14828m = new C1455q2();
                break;
            case 11:
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14827l = byteArrayOutputStream;
                this.f14828m = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public C1390oj(C c5) {
        this.f14826k = 1;
        this.f14827l = c5;
        this.f14828m = new AtomicBoolean(false);
    }

    public C1390oj(C1543s1 c1543s1) {
        this.f14826k = 5;
        G3 g32 = new G3(0, (byte) 0);
        this.f14827l = c1543s1;
        this.f14828m = g32;
    }

    public C1390oj(L7 l7) {
        this.f14826k = 7;
        this.f14828m = l7;
        this.f14827l = new HashMap();
    }

    public C1390oj(I8 i8) {
        this.f14826k = 10;
        this.f14827l = i8;
        Drawable drawable = null;
        try {
            InterfaceC2360a c5 = i8.c();
            if (c5 != null) {
                drawable = (Drawable) BinderC2361b.t1(c5);
            }
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
        this.f14828m = drawable;
        try {
            ((I8) this.f14827l).b();
        } catch (RemoteException e5) {
            U2.j.g("", e5);
        }
        try {
            ((I8) this.f14827l).d();
        } catch (RemoteException e6) {
            U2.j.g("", e6);
        }
        try {
            ((I8) this.f14827l).j();
        } catch (RemoteException e7) {
            U2.j.g("", e7);
        }
        try {
            ((I8) this.f14827l).i();
        } catch (RemoteException e8) {
            U2.j.g("", e8);
        }
    }

    public /* synthetic */ C1390oj(C0554Af c0554Af, Context context, String str) {
        this.f14826k = 13;
        ED a5 = ED.a(context);
        CD cd = c0554Af.f7619F0;
        Bn bn = new Bn(a5, cd, c0554Af.f7621G0, 5);
        CD b3 = CD.b(new C1796xl(cd, 18));
        CD b5 = CD.b(JB.f9884M);
        CD b6 = CD.b(new C1118ig(a5, c0554Af.f7648c, c0554Af.f7610A, bn, b3, b5));
        this.f14827l = CD.b(new C1302ml(b6, b3, b5, 4));
        this.f14828m = CD.b(new Qj(ED.b(str), b6, a5, b3, b5, c0554Af.f7660j, c0554Af.f7613C, c0554Af.f7688x));
    }

    public C1390oj(C1482ql c1482ql) {
        this.f14826k = 22;
        this.f14828m = c1482ql;
        this.f14827l = new ConcurrentHashMap();
    }

    private final void h(Throwable th) {
    }

    private final void i(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.Y2
    public void b(Kn kn, H h3, C0829c3 c0829c3) {
    }
}
