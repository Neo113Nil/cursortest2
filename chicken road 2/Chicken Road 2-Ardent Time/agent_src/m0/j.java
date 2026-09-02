package m0;

/* loaded from: classes.dex */
public final class j implements N.d, a1.k {

    /* renamed from: b, reason: collision with root package name */
    public static m0.j f8059b;

    /* renamed from: c, reason: collision with root package name */
    public static m0.j f8060c;

    /* renamed from: d, reason: collision with root package name */
    public static m0.j f8061d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8062a;

    public /* synthetic */ j(int i2, java.lang.Object obj) {
        this.f8062a = i2;
    }

    public static final java.lang.String b(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6 = -1;
        byte[] bArr3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f8203e;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > i6 && bArr[i8] != 10) {
                i8 += i6;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i3 = i9 + i10;
                if (bArr[i3] == 10) {
                    break;
                }
                i10++;
            }
            int i11 = i3 - i9;
            int i12 = i2;
            boolean z3 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i12][i13];
                    byte[] bArr4 = J1.b.f932a;
                    int i15 = b2 & 255;
                    z2 = z3;
                    i4 = i15;
                }
                byte b3 = bArr[i9 + i14];
                byte[] bArr5 = J1.b.f932a;
                i5 = i4 - (b3 & 255);
                if (i5 != 0) {
                    break;
                }
                i14++;
                i13++;
                if (i14 == i11) {
                    break;
                }
                if (bArr2[i12].length != i13) {
                    z3 = z2;
                } else {
                    if (i12 == bArr2.length - 1) {
                        break;
                    }
                    i12++;
                    z3 = true;
                    i13 = -1;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i16 = i11 - i14;
                    int length2 = bArr2[i12].length - i13;
                    int length3 = bArr2.length;
                    for (int i17 = i12 + 1; i17 < length3; i17++) {
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                            kotlin.jvm.internal.i.d(UTF_8, "UTF_8");
                            return new java.lang.String(bArr, i9, i11, UTF_8);
                        }
                    }
                }
                i7 = i3 + 1;
                i6 = -1;
            }
            length = i8;
            i6 = -1;
        }
        return null;
    }

    public static java.util.ArrayList c(java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : protocols) {
            if (((I1.t) obj) != I1.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((I1.t) it.next()).f827a);
        }
        return arrayList2;
    }

    public static byte[] e(java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        V1.g gVar = new V1.g();
        java.util.Iterator it = c(protocols).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gVar.u(str.length());
            gVar.x(str);
        }
        return gVar.j(gVar.f1764b);
    }

    public static V1.j g(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (W1.b.a(str.charAt(i3 + 1)) + (W1.b.a(str.charAt(i3)) << 4));
        }
        return new V1.j(bArr);
    }

    public static V1.j j(java.lang.String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(y1.a.f8486a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        V1.j jVar = new V1.j(bytes);
        jVar.f1768c = str;
        return jVar;
    }

    public static boolean k() {
        return "Dalvik".equals(java.lang.System.getProperty("java.vm.name"));
    }

    public static final m0.n o(android.content.pm.PackageInfo packageInfo, m0.n... nVarArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m0.o oVar = new m0.o(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].equals(oVar)) {
                    return nVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(android.content.pm.PackageInfo packageInfo) {
        android.content.pm.PackageInfo packageInfo2;
        boolean z2;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z2 ? o(packageInfo2, m0.p.f8070a) : o(packageInfo2, m0.p.f8070a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z2 = true;
        if (packageInfo != null) {
            if ((!z2 ? o(packageInfo2, m0.p.f8070a) : o(packageInfo2, m0.p.f8070a[0])) == null) {
            }
        }
        return false;
    }

    @Override // N.d
    public void a(int i2, java.io.Serializable serializable) {
        java.lang.String str;
        switch (this.f8062a) {
            case 8:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    android.util.Log.d("ProfileInstaller", str);
                    break;
                } else {
                    android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // N.d
    public void d() {
        switch (this.f8062a) {
            case 8:
                break;
            default:
                android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public java.util.List f(java.lang.String listString) {
        switch (this.f8062a) {
            case 28:
                try {
                    return (java.util.List) new f1.N(new java.io.ByteArrayInputStream(android.util.Base64.decode(listString, 0))).readObject();
                } catch (java.io.IOException | java.lang.ClassNotFoundException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            default:
                kotlin.jvm.internal.i.e(listString, "listString");
                java.lang.Object readObject = new f1.N(new java.io.ByteArrayInputStream(android.util.Base64.decode(listString, 0))).readObject();
                kotlin.jvm.internal.i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : (java.util.List) readObject) {
                    if (obj instanceof java.lang.String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public java.lang.String h(java.util.List list) {
        switch (this.f8062a) {
            case 28:
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (java.io.IOException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            default:
                kotlin.jvm.internal.i.e(list, "list");
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                kotlin.jvm.internal.i.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    @Override // a1.k
    public void i(x0.e eVar, Z0.j jVar) {
        switch (this.f8062a) {
            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                jVar.c(null);
                break;
            default:
                jVar.c(null);
                break;
        }
    }

    public java.lang.CharSequence n(androidx.preference.Preference preference) {
        switch (this.f8062a) {
            case 6:
                androidx.preference.EditTextPreference editTextPreference = (androidx.preference.EditTextPreference) preference;
                editTextPreference.getClass();
                if (android.text.TextUtils.isEmpty(null)) {
                    return editTextPreference.f2421a.getString(com.watchfacestudio.huasi_urx110.R.string.not_set);
                }
                return null;
            default:
                androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) preference;
                listPreference.getClass();
                if (android.text.TextUtils.isEmpty(null)) {
                    return listPreference.f2421a.getString(com.watchfacestudio.huasi_urx110.R.string.not_set);
                }
                return null;
        }
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f8062a = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(I0.b fragmentManager, int i2) {
        this(4);
        this.f8062a = i2;
        switch (i2) {
            case 4:
                break;
            default:
                kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
                new java.util.concurrent.CopyOnWriteArrayList();
                break;
        }
    }

    public j(int i2) {
        this.f8062a = i2;
        switch (i2) {
            case 17:
                new l.C0924b();
                new l.e();
                break;
            default:
                new java.util.concurrent.CopyOnWriteArrayList();
                break;
        }
    }

    public j(R0.b bVar) {
        this.f8062a = 26;
        new I0.b(bVar, "flutter/deferredcomponent", a1.o.f1949b, 9).M(new C.j(24, this));
        I0.b.F().getClass();
        new java.util.HashMap();
    }

    private final void l() {
    }

    private final void m(int i2, java.io.Serializable serializable) {
    }
}
