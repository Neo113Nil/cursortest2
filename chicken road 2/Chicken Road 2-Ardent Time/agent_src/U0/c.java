package U0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1732a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1733b;

    /* renamed from: c, reason: collision with root package name */
    public m0.j f1734c;

    /* renamed from: d, reason: collision with root package name */
    public long f1735d;

    /* renamed from: e, reason: collision with root package name */
    public M1.e f1736e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterJNI f1737f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f1738g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.Future f1739h;

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + java.io.File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return canonicalPath;
            }
            android.util.Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (java.io.IOException unused) {
            android.util.Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public static void c(android.content.Context context, java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.String str2;
        try {
            str2 = b(context, str);
        } catch (java.io.IOException e2) {
            android.util.Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e2);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, Q0.d.f1586a.f1583a + str2);
            return;
        }
        android.util.Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(android.content.Context context, java.lang.String[] strArr) {
        boolean z2;
        boolean z3;
        java.util.Iterator it;
        if (this.f1733b) {
            return;
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f1734c == null) {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            g1.AbstractC0130a.b("FlutterLoader#ensureInitializationComplete");
            try {
                U0.b bVar = (U0.b) this.f1739h.get();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((java.lang.String) this.f1736e.f1041e) + java.io.File.separator + "libflutter.so");
                android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (java.util.Iterator it2 = Q0.d.f1596k.iterator(); it2.hasNext(); it2 = it) {
                        Q0.c cVar = (Q0.c) it2.next();
                        java.lang.String str = cVar.f1584b;
                        if (bundle.containsKey(str)) {
                            if (cVar == Q0.d.f1594i) {
                                android.util.Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (Q0.d.f1597l.contains(cVar)) {
                                    throw new java.lang.IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                P0.C c2 = Q0.d.f1598m;
                                if (((Q0.c) c2.get(cVar)) != null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((Q0.c) c2.get(cVar)).f1584b);
                                    android.util.Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!cVar.f1585c) {
                                        android.util.Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (cVar == Q0.d.f1590e) {
                                    z2 = true;
                                } else if (cVar == Q0.d.f1595j) {
                                    z3 = true;
                                } else {
                                    Q0.c cVar2 = Q0.d.f1593h;
                                    if (cVar == cVar2) {
                                        this.f1732a = bundle.getBoolean(cVar2.f1584b, false);
                                    } else {
                                        if (cVar != Q0.d.f1586a) {
                                            if (cVar == Q0.d.f1587b) {
                                            }
                                        }
                                        java.lang.String string = bundle.getString(str);
                                        if (string == null) {
                                            android.util.Log.e("FlutterLoader", "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                        } else {
                                            c(context, string, arrayList);
                                        }
                                    }
                                }
                                java.lang.String str2 = cVar.f1583a;
                                if (str2.endsWith("=")) {
                                    java.lang.Object obj = bundle.get(str);
                                    java.lang.String obj2 = obj != null ? obj.toString() : null;
                                    if (obj2 == null) {
                                        android.util.Log.e("FlutterLoader", "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                    } else {
                                        arrayList.add(str2 + obj2);
                                    }
                                } else if (bundle.getBoolean(str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        it = it2;
                    }
                } else {
                    z2 = false;
                    z3 = false;
                }
                if (strArr != null) {
                    for (java.lang.String str3 : strArr) {
                        Q0.c a2 = Q0.d.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(Q0.d.f1594i)) {
                            android.util.Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            Q0.c cVar3 = Q0.d.f1586a;
                            if (!a2.equals(cVar3) && !a2.equals(Q0.d.f1587b)) {
                                if (a2.f1585c) {
                                    arrayList.add(str3);
                                } else {
                                    android.util.Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(cVar3.f1583a.length()), arrayList);
                        }
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                Q0.c cVar4 = Q0.d.f1586a;
                sb2.append(cVar4.f1583a);
                sb2.append((java.lang.String) this.f1736e.f1038b);
                arrayList.add(sb2.toString());
                arrayList.add(cVar4.f1583a + ((java.lang.String) this.f1736e.f1041e) + java.io.File.separator + ((java.lang.String) this.f1736e.f1038b));
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(bVar.f1731b);
                arrayList.add(sb3.toString());
                java.lang.Object obj3 = this.f1736e.f1040d;
                arrayList.add("--domain-network-policy=" + ((java.lang.String) this.f1736e.f1040d));
                this.f1734c.getClass();
                if (!z2) {
                    ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
                    arrayList.add(Q0.d.f1590e.f1583a + java.lang.String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(Q0.d.f1595j.f1583a + "true");
                }
                this.f1737f.init(context, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, bVar.f1730a, bVar.f1731b, android.os.SystemClock.uptimeMillis() - this.f1735d, android.os.Build.VERSION.SDK_INT);
                this.f1733b = true;
                android.os.Trace.endSection();
            } finally {
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final void d(android.content.Context context) {
        m0.j jVar = new m0.j(22, false);
        if (this.f1734c != null) {
            return;
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("startInitialization must be called on the main thread");
        }
        g1.AbstractC0130a.b("FlutterLoader#startInitialization");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            this.f1734c = jVar;
            this.f1735d = android.os.SystemClock.uptimeMillis();
            this.f1736e = Q1.d.s(applicationContext);
            M1.l b2 = M1.l.b((android.hardware.display.DisplayManager) applicationContext.getSystemService("display"), this.f1737f);
            ((io.flutter.embedding.engine.FlutterJNI) b2.f1088b).setAsyncWaitForVsyncDelegate((io.flutter.view.b) b2.f1090d);
            this.f1739h = this.f1738g.submit(new U0.a(this, applicationContext));
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
