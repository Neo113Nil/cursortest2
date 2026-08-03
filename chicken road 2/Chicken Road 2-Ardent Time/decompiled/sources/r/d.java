package r;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a.AbstractC0059a f8330a;

    /* renamed from: b, reason: collision with root package name */
    public static final l.f f8331b;

    static {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f8330a = new r.i();
        } else if (i2 >= 28) {
            f8330a = new r.h();
        } else if (i2 >= 26) {
            f8330a = new r.g();
        } else {
            java.lang.reflect.Method method = r.f.f8339c;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f8330a = new r.f();
            } else {
                f8330a = new r.e();
            }
        }
        f8331b = new l.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Typeface a(android.content.Context context, q.InterfaceC0977b interfaceC0977b, android.content.res.Resources resources, int i2, java.lang.String str, int i3, int i4, P1.B b2) {
        android.graphics.Typeface j2;
        android.graphics.Typeface typeface;
        android.graphics.Typeface typeface2;
        int i5 = 8;
        int i6 = 1;
        int i7 = 9;
        boolean z2 = false;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        if (interfaceC0977b instanceof q.e) {
            q.e eVar = (q.e) interfaceC0977b;
            java.lang.String str2 = eVar.f8322d;
            j2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = android.graphics.Typeface.create(str2, 0);
                android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new F0.c(i7, b2, typeface));
                return typeface;
            }
            java.lang.Object[] objArr3 = eVar.f8321c == 0;
            int i8 = eVar.f8320b;
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            Z0.h hVar = new Z0.h();
            hVar.f1903b = b2;
            I1.u uVar = eVar.f8319a;
            o0.i iVar = new o0.i(hVar, handler);
            if (objArr3 == true) {
                l.f fVar = v.f.f8371a;
                java.lang.String str3 = ((java.lang.String) uVar.f833f) + "-" + i4;
                typeface2 = (android.graphics.Typeface) v.f.f8371a.a(str3);
                if (typeface2 != null) {
                    handler.post(new D0.f(hVar, typeface2, i5, z2));
                } else if (i8 == -1) {
                    v.e a2 = v.f.a(str3, context, uVar, i4);
                    iVar.b(a2);
                    j2 = a2.f8369a;
                } else {
                    try {
                        try {
                            v.e eVar2 = (v.e) v.f.f8372b.submit(new v.c(str3, context, uVar, i4, 0)).get(i8, java.util.concurrent.TimeUnit.MILLISECONDS);
                            iVar.b(eVar2);
                            j2 = eVar2.f8369a;
                        } catch (java.lang.InterruptedException e2) {
                            throw e2;
                        } catch (java.util.concurrent.ExecutionException e3) {
                            throw new java.lang.RuntimeException(e3);
                        } catch (java.util.concurrent.TimeoutException unused) {
                            throw new java.lang.InterruptedException("timeout");
                        }
                    } catch (java.lang.InterruptedException unused2) {
                        ((android.os.Handler) iVar.f8149c).post(new C.b((Z0.h) iVar.f8148b, -3));
                    }
                }
            } else {
                l.f fVar2 = v.f.f8371a;
                java.lang.String str4 = ((java.lang.String) uVar.f833f) + "-" + i4;
                typeface2 = (android.graphics.Typeface) v.f.f8371a.a(str4);
                if (typeface2 != null) {
                    handler.post(new D0.f(hVar, typeface2, i5, objArr2 == true ? 1 : 0));
                } else {
                    v.d dVar = new v.d(objArr == true ? 1 : 0, iVar);
                    synchronized (v.f.f8373c) {
                        try {
                            l.k kVar = v.f.f8374d;
                            java.util.ArrayList arrayList = (java.util.ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(dVar);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(dVar);
                                kVar.put(str4, arrayList2);
                                v.c cVar = new v.c(str4, context, uVar, i4, 1);
                                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = v.f.f8372b;
                                v.d dVar2 = new v.d(i6, str4);
                                android.os.Handler handler2 = android.os.Looper.myLooper() == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : new android.os.Handler();
                                v.j jVar = new v.j();
                                jVar.f8383a = cVar;
                                jVar.f8384b = dVar2;
                                jVar.f8385c = handler2;
                                threadPoolExecutor.execute(jVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            j2 = typeface2;
        } else {
            j2 = f8330a.j(context, (q.C0978c) interfaceC0977b, resources, i4);
            if (j2 != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new F0.c(i7, b2, j2));
            } else {
                b2.a();
            }
        }
        if (j2 != null) {
            f8331b.b(b(resources, i2, str, i3, i4), j2);
        }
        return j2;
    }

    public static java.lang.String b(android.content.res.Resources resources, int i2, java.lang.String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
