package u0;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0995a {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f8357a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f8358b;

    public static void A(android.content.res.XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B(s1.p pVar, z1.AbstractC1048a abstractC1048a, z1.AbstractC1048a abstractC1048a2) {
        try {
            E1.AbstractC0000a.h(o(((m1.AbstractC0931b) pVar).b(abstractC1048a, abstractC1048a2)), h1.C0177i.f3302a, null);
        } catch (java.lang.Throwable th) {
            abstractC1048a2.l(a.AbstractC0059a.i(th));
            throw th;
        }
    }

    public static v1.C1000a C(v1.C1002c c1002c, int i2) {
        kotlin.jvm.internal.i.e(c1002c, "<this>");
        boolean z2 = i2 > 0;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
        if (z2) {
            if (c1002c.f8389c <= 0) {
                i2 = -i2;
            }
            return new v1.C1000a(c1002c.f8387a, c1002c.f8388b, i2);
        }
        throw new java.lang.IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final h1.C0172d D(java.lang.String str, java.lang.String str2) {
        return new h1.C0172d(str, str2);
    }

    public static final java.lang.String E(java.lang.String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!y1.g.M(str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            try {
                java.lang.String ascii = java.net.IDN.toASCII(str);
                kotlin.jvm.internal.i.d(ascii, "toASCII(host)");
                java.util.Locale US = java.util.Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                java.lang.String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char charAt = lowerCase.charAt(i4);
                    if (kotlin.jvm.internal.i.f(charAt, 31) <= 0 || kotlin.jvm.internal.i.f(charAt, 127) >= 0 || y1.g.Q(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                    i4 = i5;
                }
                return lowerCase;
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        java.net.InetAddress i6 = (y1.o.K(str, "[", false) && y1.o.F(str, "]")) ? i(str, 1, str.length() - 1) : i(str, 0, str.length());
        if (i6 == null) {
            return null;
        }
        byte[] address = i6.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return i6.getHostAddress();
            }
            throw new java.lang.AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < address.length) {
            int i9 = i7;
            while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i3 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        V1.g gVar = new V1.g();
        while (i2 < address.length) {
            if (i2 == i3) {
                gVar.u(58);
                i2 += i8;
                if (i2 == 16) {
                    gVar.u(58);
                }
            } else {
                if (i2 > 0) {
                    gVar.u(58);
                }
                byte b2 = address[i2];
                byte[] bArr = J1.b.f932a;
                gVar.v(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return gVar.n(gVar.f1764b, y1.a.f8486a);
    }

    public static v1.C1002c F(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new v1.C1002c(i2, i3 - 1, 1);
        }
        v1.C1002c c1002c = v1.C1002c.f8394d;
        return v1.C1002c.f8394d;
    }

    public static java.lang.Object G(java.lang.Object obj) {
        if (obj == null) {
            return org.json.JSONObject.NULL;
        }
        if ((obj instanceof org.json.JSONArray) || (obj instanceof org.json.JSONObject)) {
            return obj;
        }
        if (obj.equals(org.json.JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof java.util.Collection) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(G(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            int length = java.lang.reflect.Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(G(java.lang.reflect.Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof java.util.Map) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), G(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static V1.e a() {
        V1.e eVar = V1.e.f1757l;
        kotlin.jvm.internal.i.b(eVar);
        V1.e eVar2 = eVar.f1759f;
        if (eVar2 == null) {
            long nanoTime = java.lang.System.nanoTime();
            V1.e.f1754i.await(V1.e.f1755j, java.util.concurrent.TimeUnit.MILLISECONDS);
            V1.e eVar3 = V1.e.f1757l;
            kotlin.jvm.internal.i.b(eVar3);
            if (eVar3.f1759f != null || java.lang.System.nanoTime() - nanoTime < V1.e.f1756k) {
                return null;
            }
            return V1.e.f1757l;
        }
        long nanoTime2 = eVar2.f1760g - java.lang.System.nanoTime();
        if (nanoTime2 > 0) {
            V1.e.f1754i.await(nanoTime2, java.util.concurrent.TimeUnit.NANOSECONDS);
            return null;
        }
        V1.e eVar4 = V1.e.f1757l;
        kotlin.jvm.internal.i.b(eVar4);
        eVar4.f1759f = eVar2.f1759f;
        eVar2.f1759f = null;
        return eVar2;
    }

    public static void b(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new java.lang.IllegalArgumentException("radix " + i2 + " was not in valid range " + new v1.C1002c(2, 36, 1));
        }
    }

    public static void c(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static int d(P.E e2, L.b bVar, android.view.View view, android.view.View view2, P.v vVar, boolean z2) {
        if (vVar.p() == 0 || e2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z2) {
            return java.lang.Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((P.w) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int e(P.E e2, L.b bVar, android.view.View view, android.view.View view2, P.v vVar, boolean z2) {
        if (vVar.p() == 0 || e2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return e2.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((P.w) view.getLayoutParams()).getClass();
        throw null;
    }

    public static final long f(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i2) {
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static boolean g(java.io.File file, android.content.res.Resources resources, int i2) {
        java.io.InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean h2 = h(file, inputStream);
                c(inputStream);
                return h2;
            } catch (java.lang.Throwable th) {
                th = th;
                c(inputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean h(java.io.File file, java.io.InputStream inputStream) {
        java.io.FileOutputStream fileOutputStream;
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    c(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r7 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.net.InetAddress i(java.lang.String str, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i8 = i2;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            if (i8 >= i3) {
                i4 = i7;
                break;
            }
            if (i9 != i7) {
                int i12 = i8 + 2;
                if (i12 <= i3 && y1.o.J(i8, str, "::", z2)) {
                    if (i10 == -1) {
                        i9 += 2;
                        if (i12 != i3) {
                            i10 = i9;
                            i11 = i12;
                            i8 = i11;
                            int i13 = 0;
                            while (i8 < i3) {
                            }
                            i6 = i8 - i11;
                            if (i6 == 0) {
                                break;
                            }
                            break;
                        }
                        i4 = i7;
                        i10 = i9;
                        break;
                    }
                    return null;
                }
                if (i9 != 0) {
                    if (!y1.o.J(i8, str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, z2)) {
                        if (y1.o.J(i8, str, ".", z2)) {
                            int i14 = i9 - 2;
                            int i15 = i14;
                            loop2: while (true) {
                                if (i11 < i3) {
                                    if (i15 == i7) {
                                        break;
                                    }
                                    if (i15 != i14) {
                                        if (str.charAt(i11) != '.') {
                                            break;
                                        }
                                        i11++;
                                    }
                                    ?? r14 = z2;
                                    int i16 = i11;
                                    while (i16 < i3) {
                                        char charAt = str.charAt(i16);
                                        if (kotlin.jvm.internal.i.f(charAt, 48) < 0 || kotlin.jvm.internal.i.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i11 != i16) || (i5 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i16++;
                                        r14 = i5;
                                    }
                                    if (i16 - i11 == 0) {
                                        break;
                                    }
                                    bArr[i15] = (byte) r14;
                                    i15++;
                                    i11 = i16;
                                    i7 = 16;
                                    z2 = false;
                                } else if (i15 == i9 + 2) {
                                    i9 += 2;
                                    i4 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i8++;
                }
                i11 = i8;
                i8 = i11;
                int i132 = 0;
                while (i8 < i3) {
                    int r2 = J1.b.r(str.charAt(i8));
                    if (r2 == -1) {
                        break;
                    }
                    i132 = (i132 << 4) + r2;
                    i8++;
                }
                i6 = i8 - i11;
                if (i6 == 0 || i6 > 4) {
                    break;
                }
                int i17 = i9 + 1;
                bArr[i9] = (byte) ((i132 >>> 8) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                i9 += 2;
                bArr[i17] = (byte) (i132 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                i7 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static final boolean l(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c2);
        char upperCase2 = java.lang.Character.toUpperCase(c3);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }

    public static I1.q m() {
        java.util.regex.Matcher matcher = I1.q.f770a.matcher("application/x-protobuf");
        if (!matcher.lookingAt()) {
            throw new java.lang.IllegalArgumentException("No subtype found for: \"application/x-protobuf\"".toString());
        }
        java.lang.String group = matcher.group(1);
        kotlin.jvm.internal.i.d(group, "typeSubtype.group(1)");
        java.util.Locale US = java.util.Locale.US;
        kotlin.jvm.internal.i.d(US, "US");
        kotlin.jvm.internal.i.d(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        java.lang.String group2 = matcher.group(2);
        kotlin.jvm.internal.i.d(group2, "typeSubtype.group(2)");
        kotlin.jvm.internal.i.d(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher2 = I1.q.f771b.matcher("application/x-protobuf");
        int end = matcher.end();
        while (end < 22) {
            matcher2.region(end, 22);
            if (!matcher2.lookingAt()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter is not formatted correctly: \"");
                java.lang.String substring = "application/x-protobuf".substring(end);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"application/x-protobuf\"");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                java.lang.String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (y1.o.K(group4, "'", false) && y1.o.F(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    kotlin.jvm.internal.i.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return new I1.q();
    }

    public static java.io.File n(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            java.io.File file = new java.io.File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static k1.d o(k1.d dVar) {
        kotlin.jvm.internal.i.e(dVar, "<this>");
        m1.AbstractC0931b abstractC0931b = dVar instanceof m1.AbstractC0931b ? (m1.AbstractC0931b) dVar : null;
        if (abstractC0931b == null) {
            return dVar;
        }
        k1.d dVar2 = abstractC0931b.f8077c;
        if (dVar2 != null) {
            return dVar2;
        }
        k1.f fVar = (k1.f) abstractC0931b.getContext().m(k1.e.f7950a);
        k1.d hVar = fVar != null ? new E1.h((z1.AbstractC1065s) fVar, abstractC0931b) : abstractC0931b;
        abstractC0931b.f8077c = hVar;
        return hVar;
    }

    public static final boolean p(char c2) {
        return java.lang.Character.isWhitespace(c2) || java.lang.Character.isSpaceChar(c2);
    }

    public static java.util.List q(java.lang.Object obj) {
        java.util.List singletonList = java.util.Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static void r(java.lang.String str) {
        if (android.util.Log.isLoggable("InstallReferrerClient", 2)) {
            android.util.Log.v("InstallReferrerClient", str);
        }
    }

    public static void s(java.lang.String str) {
        if (android.util.Log.isLoggable("InstallReferrerClient", 5)) {
            android.util.Log.w("InstallReferrerClient", str);
        }
    }

    public static java.nio.MappedByteBuffer t(android.content.Context context, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static q.InterfaceC0977b u(android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), n.AbstractC0936a.f8081a);
            java.lang.String string = obtainAttributes.getString(0);
            java.lang.String string2 = obtainAttributes.getString(4);
            java.lang.String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            java.lang.String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    A(xmlResourceParser);
                }
                return new q.e(new I1.u(string, string2, string3, y(resources, resourceId)), integer, integer2, string4);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        android.content.res.TypedArray obtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), n.AbstractC0936a.f8082b);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        java.lang.String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        java.lang.String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            A(xmlResourceParser);
                        }
                        arrayList.add(new q.C0979d(i2, i4, resourceId2, string6, string5, z2));
                    } else {
                        A(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new q.C0978c((q.C0979d[]) arrayList.toArray(new q.C0979d[0]));
            }
        } else {
            A(xmlResourceParser);
        }
        return null;
    }

    public static java.lang.String v(java.security.cert.X509Certificate certificate) {
        kotlin.jvm.internal.i.e(certificate, "certificate");
        V1.j jVar = V1.j.f1765d;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.i.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i2 = 0;
        a.AbstractC0059a.f(encoded.length, 0, length);
        byte[] M2 = i1.AbstractC0189h.M(encoded, 0, length);
        V1.j jVar2 = new V1.j(M2);
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(M2, 0, jVar2.a());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.i.d(digestBytes, "digestBytes");
        new V1.j(digestBytes);
        byte[] map = V1.a.f1746a;
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr = new byte[((digestBytes.length + 2) / 3) * 4];
        int length2 = digestBytes.length - (digestBytes.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = digestBytes[i2];
            int i4 = i2 + 2;
            byte b3 = digestBytes[i2 + 1];
            i2 += 3;
            byte b4 = digestBytes[i4];
            bArr[i3] = map[(b2 & 255) >> 2];
            bArr[i3 + 1] = map[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr[i3 + 2] = map[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr[i5] = map[b4 & 63];
        }
        int length3 = digestBytes.length - length2;
        if (length3 == 1) {
            byte b5 = digestBytes[i2];
            bArr[i3] = map[(b5 & 255) >> 2];
            bArr[1 + i3] = map[(b5 & 3) << 4];
            bArr[2 + i3] = 61;
            bArr[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = digestBytes[i2];
            byte b7 = digestBytes[i6];
            bArr[i3] = map[(b6 & 255) >> 2];
            bArr[1 + i3] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr[i3 + 2] = map[(b7 & 15) << 2];
            bArr[i3 + 3] = 61;
        }
        return kotlin.jvm.internal.i.h(new java.lang.String(bArr, y1.a.f8486a), "sha256/");
    }

    public static void w(T0.d dVar, android.media.MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                java.lang.String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = dVar.f1716g;
                    int i4 = dVar.f1715f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    dVar.f1711b = i3;
                    dVar.f1710a = i4;
                    dVar.f1712c = integer;
                    return;
                }
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static final byte[] x(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        f(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.i.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static java.util.List y(android.content.res.Resources resources, int i2) {
        if (i2 == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (q.AbstractC0976a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void z(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        h.p0 p0Var = h.p0.f3226j;
        if (p0Var != null && p0Var.f3228a == view) {
            h.p0.b(null);
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            new h.p0(view, charSequence);
            return;
        }
        h.p0 p0Var2 = h.p0.f3227k;
        if (p0Var2 != null && p0Var2.f3228a == view) {
            p0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract java.lang.String j(byte[] bArr, int i2, int i3);

    public abstract int k(java.lang.String str, byte[] bArr, int i2, int i3);
}
