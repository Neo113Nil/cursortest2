package a;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0059a {
    public AbstractC0059a() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static final void A(java.lang.Object obj) {
        if (obj instanceof h1.C0173e) {
            throw ((h1.C0173e) obj).f3297a;
        }
    }

    public static final boolean B(java.lang.String str, s1.InterfaceC0991a interfaceC0991a) {
        try {
            boolean booleanValue = ((java.lang.Boolean) interfaceC0991a.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                android.util.Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (java.lang.ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            android.util.Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (java.lang.NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            android.util.Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void C(android.os.Parcel parcel, int i2, android.os.Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int G = G(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        H(parcel, G);
    }

    public static void D(android.os.Parcel parcel, int i2, java.lang.String str) {
        if (str == null) {
            return;
        }
        int G = G(parcel, i2);
        parcel.writeString(str);
        H(parcel, G);
    }

    public static void E(android.os.Parcel parcel, int i2, android.os.Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int G = G(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (android.os.Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        H(parcel, G);
    }

    public static void F(android.os.Parcel parcel, int i2, java.util.List list) {
        if (list == null) {
            return;
        }
        int G = G(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        H(parcel, G);
    }

    public static int G(android.os.Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void H(android.os.Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void I(android.os.Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(java.util.List list, F.C0012l c0012l, m1.AbstractC0931b abstractC0931b) {
        F.C0006f c0006f;
        int i2;
        java.util.List list2;
        kotlin.jvm.internal.p pVar;
        java.util.Iterator it;
        java.lang.Throwable th;
        if (abstractC0931b instanceof F.C0006f) {
            c0006f = (F.C0006f) abstractC0931b;
            int i3 = c0006f.f446g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0006f.f446g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0006f.f445f;
                java.lang.Object obj2 = l1.EnumC0927a.f8017a;
                i2 = c0006f.f446g;
                if (i2 != 0) {
                    A(obj);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    F.C0008h c0008h = new F.C0008h(list, arrayList, null);
                    c0006f.f443d = arrayList;
                    c0006f.f446g = 1;
                    if (c0012l.a(c0008h, c0006f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0006f.f444e;
                        pVar = (kotlin.jvm.internal.p) c0006f.f443d;
                        try {
                            A(obj);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Object obj3 = pVar.f7960a;
                            if (obj3 == null) {
                                pVar.f7960a = th2;
                            } else {
                                Q1.d.b((java.lang.Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            s1.l lVar = (s1.l) it.next();
                            c0006f.f443d = pVar;
                            c0006f.f444e = it;
                            c0006f.f446g = 2;
                            if (lVar.invoke(c0006f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (java.lang.Throwable) pVar.f7960a;
                        if (th == null) {
                            return h1.C0177i.f3302a;
                        }
                        throw th;
                    }
                    list2 = (java.util.List) c0006f.f443d;
                    A(obj);
                }
                pVar = new kotlin.jvm.internal.p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (java.lang.Throwable) pVar.f7960a;
                if (th == null) {
                }
            }
        }
        c0006f = new F.C0006f(abstractC0931b);
        java.lang.Object obj4 = c0006f.f445f;
        java.lang.Object obj22 = l1.EnumC0927a.f8017a;
        i2 = c0006f.f446g;
        if (i2 != 0) {
        }
        pVar = new kotlin.jvm.internal.p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (java.lang.Throwable) pVar.f7960a;
        if (th == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static android.graphics.Bitmap b(android.graphics.Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else {
                        if (i2 != 5) {
                            return bitmap;
                        }
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                default:
                    android.util.Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
        }
        return bitmap;
    }

    public static final boolean c(int i2, int i3, int i4, byte[] a2, byte[] b2) {
        kotlin.jvm.internal.i.e(a2, "a");
        kotlin.jvm.internal.i.e(b2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static void d(android.content.Context context, g1.InterfaceC0131b interfaceC0131b) {
        android.graphics.Rect rect;
        y.Q _windowInsetsCompat;
        android.view.WindowMetrics maximumWindowMetrics;
        android.app.Activity q2 = q(context);
        if (q2 != null) {
            Z.l.f1864a.getClass();
            int i2 = Z.m.f1865b;
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((android.view.WindowManager) q2.getSystemService(android.view.WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                kotlin.jvm.internal.i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                java.lang.Object systemService = q2.getSystemService("window");
                kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                android.view.Display display = ((android.view.WindowManager) systemService).getDefaultDisplay();
                kotlin.jvm.internal.i.d(display, "display");
                android.graphics.Point point = new android.graphics.Point();
                display.getRealSize(point);
                rect = new android.graphics.Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                _windowInsetsCompat = (i3 >= 30 ? new y.H() : i3 >= 29 ? new y.G() : new y.F()).b();
                kotlin.jvm.internal.i.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new java.lang.Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = d0.C0107a.f2738a.a(q2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new java.lang.IllegalArgumentException(B1.a.h("Left must be less than or equal to right, left: ", i4, i6, ", right: ").toString());
            }
            if (i5 > i7) {
                throw new java.lang.IllegalArgumentException(B1.a.h("top must be less than or equal to bottom, top: ", i5, i7, ", bottom: ").toString());
            }
            kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((io.flutter.embedding.engine.FlutterEngine) interfaceC0131b).f7615a.updateDisplayMetrics(0, new android.graphics.Rect(i4, i5, i6, i7).width(), new android.graphics.Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void e(java.lang.String str) {
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(J1.b.i("Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i2), str).toString());
            }
            i2 = i3;
        }
    }

    public static final void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(J1.b.q(str2) ? "" : kotlin.jvm.internal.i.h(str, ": "), J1.b.i("Unexpected char %#04x at %d in %s value", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i2), str2)).toString());
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(java.io.Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final h1.C0173e i(java.lang.Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new h1.C0173e(exception);
    }

    public static boolean n(java.lang.reflect.Method method, kotlin.jvm.internal.d dVar) {
        java.lang.Class a2 = dVar.a();
        kotlin.jvm.internal.i.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static k1.g p(k1.g gVar, k1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static android.app.Activity q(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return q(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final int r(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static boolean s(byte b2) {
        return b2 > -65;
    }

    public static k1.i t(k1.g gVar, k1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(gVar.getKey(), key) ? k1.j.f7951a : gVar;
    }

    public static I1.m u(java.lang.String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Expected alternating header names and values");
        }
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            java.lang.String str = strArr2[i3];
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i3] = y1.g.c0(str).toString();
            i3 = i4;
        }
        int r2 = r(0, strArr2.length - 1, 2);
        if (r2 >= 0) {
            while (true) {
                int i5 = i2 + 2;
                java.lang.String str2 = strArr2[i2];
                java.lang.String str3 = strArr2[i2 + 1];
                e(str2);
                g(str3, str2);
                if (i2 == r2) {
                    break;
                }
                i2 = i5;
            }
        }
        return new I1.m(strArr2);
    }

    public static N1.h v(java.lang.String statusLine) {
        int i2;
        java.lang.String str;
        kotlin.jvm.internal.i.e(statusLine, "statusLine");
        boolean K2 = y1.o.K(statusLine, "HTTP/1.", false);
        I1.t tVar = I1.t.HTTP_1_0;
        if (K2) {
            i2 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
                }
                tVar = I1.t.HTTP_1_1;
            }
        } else {
            if (!y1.o.K(statusLine, "ICY ", false)) {
                throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (statusLine.length() < i3) {
            throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
        }
        try {
            java.lang.String substring = statusLine.substring(i2, i3);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = java.lang.Integer.parseInt(substring);
            if (statusLine.length() <= i3) {
                str = "";
            } else {
                if (statusLine.charAt(i3) != ' ') {
                    throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
                }
                str = statusLine.substring(i2 + 4);
                kotlin.jvm.internal.i.d(str, "this as java.lang.String).substring(startIndex)");
            }
            return new N1.h(tVar, parseInt, str);
        } catch (java.lang.NumberFormatException unused) {
            throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(statusLine, "Unexpected status line: "));
        }
    }

    public static void w(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        try {
            io.flutter.plugins.GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.FlutterEngine.class).invoke(null, flutterEngine);
        } catch (java.lang.Exception e2) {
            android.util.Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            android.util.Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static boolean z(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public abstract android.graphics.Typeface j(android.content.Context context, q.C0978c c0978c, android.content.res.Resources resources, int i2);

    public abstract android.graphics.Typeface k(android.content.Context context, v.g[] gVarArr, int i2);

    public android.graphics.Typeface l(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File n2 = u0.AbstractC0995a.n(context);
        if (n2 == null) {
            return null;
        }
        try {
            if (u0.AbstractC0995a.h(n2, inputStream)) {
                return android.graphics.Typeface.createFromFile(n2.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            n2.delete();
        }
    }

    public android.graphics.Typeface m(android.content.Context context, android.content.res.Resources resources, int i2, java.lang.String str, int i3) {
        java.io.File n2 = u0.AbstractC0995a.n(context);
        if (n2 == null) {
            return null;
        }
        try {
            if (u0.AbstractC0995a.g(n2, resources, i2)) {
                return android.graphics.Typeface.createFromFile(n2.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            n2.delete();
        }
    }

    public v.g o(v.g[] gVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        v.g gVar = null;
        int i4 = Integer.MAX_VALUE;
        for (v.g gVar2 : gVarArr) {
            int abs = (java.lang.Math.abs(gVar2.f8377c - i3) * 2) + (gVar2.f8378d == z2 ? 0 : 1);
            if (gVar == null || i4 > abs) {
                gVar = gVar2;
                i4 = abs;
            }
        }
        return gVar;
    }

    public abstract void y(boolean z2);

    public void x(boolean z2) {
    }
}
