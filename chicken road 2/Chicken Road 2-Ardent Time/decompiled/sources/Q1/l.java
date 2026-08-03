package Q1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static long f1634a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f1635b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f1636c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f1637d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f1638e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f1639f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f1640g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f1641h;

    public static java.lang.String A(java.lang.String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int B(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        int u2 = u(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new E1.A("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(readInt))), parcel);
        }
        int i2 = u2 + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new E1.A(B1.a.h("Size read is invalid start=", dataPosition, i2, " end="), parcel);
        }
        return i2;
    }

    public static android.view.ActionMode.Callback C(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof C.r) || callback == null) ? callback : new C.r(callback, textView);
    }

    public static java.util.ArrayList D(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        return arrayList;
    }

    public static void E(android.os.Parcel parcel, int i2, int i3) {
        int u2 = u(parcel, i2);
        if (u2 == i3) {
            return;
        }
        java.lang.String hexString = java.lang.Integer.toHexString(u2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(u2);
        sb.append(" (0x");
        throw new E1.A(B1.a.j(sb, hexString, ")"), parcel);
    }

    public static void c(long j2, V1.g gVar, int i2, java.util.ArrayList arrayList, int i3, int i4, java.util.ArrayList arrayList2) {
        int i5;
        int i6;
        int i7;
        int i8;
        V1.g gVar2;
        int i9 = i2;
        if (i3 >= i4) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        for (int i10 = i3; i10 < i4; i10++) {
            if (((V1.j) arrayList.get(i10)).a() < i9) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
        }
        V1.j jVar = (V1.j) arrayList.get(i3);
        V1.j jVar2 = (V1.j) arrayList.get(i4 - 1);
        int i11 = -1;
        if (i9 == jVar.a()) {
            int intValue = ((java.lang.Number) arrayList2.get(i3)).intValue();
            int i12 = i3 + 1;
            V1.j jVar3 = (V1.j) arrayList.get(i12);
            i5 = i12;
            i6 = intValue;
            jVar = jVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (jVar.d(i9) == jVar2.d(i9)) {
            int min = java.lang.Math.min(jVar.a(), jVar2.a());
            int i13 = 0;
            for (int i14 = i9; i14 < min && jVar.d(i14) == jVar2.d(i14); i14++) {
                i13++;
            }
            long j3 = 4;
            long j4 = (gVar.f1764b / j3) + j2 + 2 + i13 + 1;
            gVar.w(-i13);
            gVar.w(i6);
            int i15 = i13 + i9;
            while (i9 < i15) {
                gVar.w(jVar.d(i9) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                i9++;
            }
            if (i5 + 1 == i4) {
                if (i15 != ((V1.j) arrayList.get(i5)).a()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                gVar.w(((java.lang.Number) arrayList2.get(i5)).intValue());
                return;
            } else {
                V1.g gVar3 = new V1.g();
                gVar.w(((int) ((gVar3.f1764b / j3) + j4)) * (-1));
                c(j4, gVar3, i15, arrayList, i5, i4, arrayList2);
                gVar.t(gVar3);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i5 + 1; i17 < i4; i17++) {
            if (((V1.j) arrayList.get(i17 - 1)).d(i9) != ((V1.j) arrayList.get(i17)).d(i9)) {
                i16++;
            }
        }
        long j5 = 4;
        long j6 = (gVar.f1764b / j5) + j2 + 2 + (i16 * 2);
        gVar.w(i16);
        gVar.w(i6);
        for (int i18 = i5; i18 < i4; i18++) {
            int d2 = ((V1.j) arrayList.get(i18)).d(i9);
            if (i18 == i5 || d2 != ((V1.j) arrayList.get(i18 - 1)).d(i9)) {
                gVar.w(d2 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        V1.g gVar4 = new V1.g();
        int i19 = i5;
        while (i19 < i4) {
            byte d3 = ((V1.j) arrayList.get(i19)).d(i9);
            int i20 = i19 + 1;
            int i21 = i20;
            while (true) {
                if (i21 >= i4) {
                    i7 = i4;
                    break;
                } else {
                    if (d3 != ((V1.j) arrayList.get(i21)).d(i9)) {
                        i7 = i21;
                        break;
                    }
                    i21++;
                }
            }
            if (i20 == i7 && i9 + 1 == ((V1.j) arrayList.get(i19)).a()) {
                gVar.w(((java.lang.Number) arrayList2.get(i19)).intValue());
                i8 = i7;
                gVar2 = gVar4;
            } else {
                gVar.w(((int) ((gVar4.f1764b / j5) + j6)) * i11);
                i8 = i7;
                gVar2 = gVar4;
                c(j6, gVar4, i9 + 1, arrayList, i19, i7, arrayList2);
            }
            gVar4 = gVar2;
            i19 = i8;
            i11 = -1;
        }
        gVar.t(gVar4);
    }

    public static void d(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new java.lang.IllegalArgumentException(B1.a.h("fromIndex: ", i2, i3, " > toIndex: "));
            }
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static android.os.Parcelable f(android.os.Parcel parcel, int i2, android.os.Parcelable.Creator creator) {
        int u2 = u(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (u2 == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + u2);
        return parcelable;
    }

    public static java.lang.String g(android.os.Parcel parcel, int i2) {
        int u2 = u(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (u2 == 0) {
            return null;
        }
        java.lang.String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + u2);
        return readString;
    }

    public static java.lang.Object[] h(android.os.Parcel parcel, int i2, android.os.Parcelable.Creator creator) {
        int u2 = u(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (u2 == 0) {
            return null;
        }
        java.lang.Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + u2);
        return createTypedArray;
    }

    public static boolean i(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return java.util.Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return java.util.Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return java.util.Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
            if (objArr.length == objArr2.length) {
                java.lang.Iterable c1002c = new v1.C1002c(0, objArr.length - 1, 1);
                if ((c1002c instanceof java.util.Collection) && ((java.util.Collection) c1002c).isEmpty()) {
                    return true;
                }
                java.util.Iterator it = c1002c.iterator();
                while (((v1.C1001b) it).f8392c) {
                    int a2 = ((v1.C1001b) it).a();
                    if (!i(objArr[a2], objArr2[a2])) {
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof java.util.List) && (obj2 instanceof java.util.List)) {
            java.util.List list = (java.util.List) obj;
            java.util.List list2 = (java.util.List) obj2;
            if (list.size() == list2.size()) {
                java.util.Collection collection = (java.util.Collection) obj;
                kotlin.jvm.internal.i.e(collection, "<this>");
                java.lang.Iterable c1002c2 = new v1.C1002c(0, collection.size() - 1, 1);
                if ((c1002c2 instanceof java.util.Collection) && ((java.util.Collection) c1002c2).isEmpty()) {
                    return true;
                }
                java.util.Iterator it2 = c1002c2.iterator();
                while (((v1.C1001b) it2).f8392c) {
                    int a3 = ((v1.C1001b) it2).a();
                    if (!i(list.get(a3), list2.get(a3))) {
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof java.util.Map) || !(obj2 instanceof java.util.Map)) {
            return kotlin.jvm.internal.i.a(obj, obj2);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.Map map2 = (java.util.Map) obj2;
        if (map.size() == map2.size()) {
            if (map.isEmpty()) {
                return true;
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (map2.containsKey(entry.getKey()) && i(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public static void j(android.os.Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new E1.A(B1.a.f(i2, "Overread allowed size end="), parcel);
        }
    }

    public static java.lang.String k(androidx.datastore.preferences.protobuf.C0071g c0071g) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(c0071g.size());
        for (int i2 = 0; i2 < c0071g.size(); i2++) {
            byte a2 = c0071g.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static I1.B l(java.lang.String javaName) {
        kotlin.jvm.internal.i.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return I1.B.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return I1.B.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return I1.B.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return I1.B.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return I1.B.SSL_3_0;
        }
        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(javaName, "Unexpected TLS version: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static I1.k m(javax.net.ssl.SSLSession sSLSession) {
        java.util.List list;
        java.security.cert.Certificate[] localCertificates;
        java.security.cert.Certificate[] peerCertificates;
        java.util.List list2 = i1.C0199r.f3325a;
        java.lang.String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new java.lang.IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new java.io.IOException(kotlin.jvm.internal.i.h(cipherSuite, "cipherSuite == "));
        }
        I1.g c2 = I1.g.f704b.c(cipherSuite);
        java.lang.String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new java.lang.IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new java.io.IOException("tlsVersion == NONE");
        }
        I1.B l2 = l(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = J1.b.l(java.util.Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = J1.b.l(java.util.Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new I1.k(l2, c2, list2, new F.U(2, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new I1.k(l2, c2, list2, new F.U(2, list));
    }

    public static w.C1004b n(h.C0161t c0161t) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new w.C1004b(C.q.c(c0161t));
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(c0161t.getPaint());
        android.text.TextDirectionHeuristic textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = C.o.a(c0161t);
        int d2 = C.o.d(c0161t);
        if (c0161t.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0161t.getInputType() & 15) != 3) {
                boolean z2 = c0161t.getLayoutDirection() == 1;
                switch (c0161t.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = java.lang.Character.getDirectionality(C.q.b(C.p.a(c0161t.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
            }
        }
        return new w.C1004b(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void o(java.lang.String str, java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = exc.getCause();
            if (!(cause instanceof java.lang.RuntimeException)) {
                throw new java.lang.RuntimeException(cause);
            }
            throw ((java.lang.RuntimeException) cause);
        }
        android.util.Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean p(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (f1638e == null) {
            f1638e = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f1638e.booleanValue();
        if (f1639f == null) {
            f1639f = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f1639f.booleanValue()) {
            return false;
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        return i2 < 26 || i2 >= 30;
    }

    public static h1.C0175g q(s1.InterfaceC0991a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        return new h1.C0175g(initializer);
    }

    public static final boolean r(java.lang.String method) {
        kotlin.jvm.internal.i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static boolean s(android.os.Parcel parcel, int i2) {
        E(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static int t(android.os.Parcel parcel, int i2) {
        E(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int u(android.os.Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void v(android.view.Window window, boolean z2) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            y.D.a(window, z2);
            return;
        }
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void w(android.widget.TextView textView, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            C.q.d(textView, i2);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > java.lang.Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void x(android.widget.TextView textView, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > java.lang.Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static java.util.Set y(java.lang.Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return i1.C0201t.f3327a;
        }
        if (length != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(i1.AbstractC0203v.E(objArr.length));
            i1.AbstractC0189h.Q(objArr, linkedHashSet);
            return linkedHashSet;
        }
        java.util.Set singleton = java.util.Collections.singleton(objArr[0]);
        kotlin.jvm.internal.i.d(singleton, "singleton(...)");
        return singleton;
    }

    public static void z(android.os.Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + u(parcel, i2));
    }

    public n0.InterfaceC0939c a(android.content.Context context, android.os.Looper looper, P1.h hVar, java.lang.Object obj, n0.g gVar, n0.h hVar2) {
        return b(context, looper, hVar, obj, (o0.m) gVar, (o0.m) hVar2);
    }

    public n0.InterfaceC0939c b(android.content.Context context, android.os.Looper looper, P1.h hVar, java.lang.Object obj, o0.m mVar, o0.m mVar2) {
        throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract java.util.List e(java.lang.String str, java.util.List list);
}
