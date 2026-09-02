package f1;

/* loaded from: classes.dex */
public final class L implements g.o, o0.h {
    public static void b(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static x0.e d(android.content.Context context, java.lang.String[] strArr, java.lang.String str, F.C0014n c0014n) {
        java.lang.String[] g2 = g(context);
        int length = g2.length;
        int i2 = 0;
        while (true) {
            java.util.zip.ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            java.lang.String str2 = g2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new java.util.zip.ZipFile(new java.io.File(str2), 1);
                    break;
                } catch (java.io.IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (java.lang.String str3 : strArr) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("lib");
                            char c2 = java.io.File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            java.lang.String sb2 = sb.toString();
                            c0014n.e("Looking for %s in APK %s...", sb2, str2);
                            java.util.zip.ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                x0.e eVar = new x0.e(23, false);
                                eVar.f8409b = zipFile;
                                eVar.f8410c = entry;
                                return eVar;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static java.lang.String[] f(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lib");
        char c2 = java.io.File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(sb.toString());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : g(context)) {
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = new java.util.zip.ZipFile(new java.io.File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    java.util.regex.Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (java.io.IOException unused) {
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]);
    }

    public static java.lang.String[] g(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new java.lang.String[]{applicationInfo.sourceDir};
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // o0.h
    public void c(java.lang.Object obj, java.lang.Object obj2) {
        x0.c cVar = (x0.c) ((x0.C1012b) obj).q();
        x0.f fVar = new x0.f((D0.d) obj2);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = x0.AbstractC1011a.f8403a;
        obtain.writeInt(1);
        a.AbstractC0059a.H(obtain, a.AbstractC0059a.G(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            cVar.f8404a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // g.o
    public boolean e(g.t tVar) {
        return false;
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
    }
}
