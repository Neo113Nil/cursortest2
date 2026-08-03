package F;

/* loaded from: classes.dex */
public final class Y implements F.InterfaceC0002b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f417a;

    /* renamed from: b, reason: collision with root package name */
    public final F.j0 f418b;

    /* renamed from: c, reason: collision with root package name */
    public final F.U f419c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f420d;

    /* renamed from: e, reason: collision with root package name */
    public final H1.d f421e;

    public Y(java.io.File file, F.j0 coordinator, F.U u2) {
        kotlin.jvm.internal.i.e(coordinator, "coordinator");
        this.f417a = file;
        this.f418b = coordinator;
        this.f419c = u2;
        this.f420d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f421e = H1.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:21:0x0078, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [F.Y] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [F.W, m1.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [F.Y] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [F.s] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(F.C0018s c0018s, m1.AbstractC0931b abstractC0931b) {
        ?? r02;
        int i2;
        F.S s2;
        java.lang.Throwable th;
        F.Y y2;
        boolean z2;
        try {
            if (abstractC0931b instanceof F.W) {
                F.W w2 = (F.W) abstractC0931b;
                int i3 = w2.f409i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    w2.f409i = i3 - Integer.MIN_VALUE;
                    r02 = w2;
                    java.lang.Object obj = r02.f407g;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = r02.f409i;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        if (this.f420d.get()) {
                            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d2 = this.f421e.d(null);
                        try {
                            F.S s3 = new F.S(this.f417a);
                            try {
                                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d2);
                                r02.f404d = this;
                                r02.f405e = s3;
                                r02.f406f = d2;
                                r02.f409i = 1;
                                java.lang.Object i4 = c0018s.i(s3, valueOf, r02);
                                if (i4 == enumC0927a) {
                                    return enumC0927a;
                                }
                                y2 = this;
                                s2 = s3;
                                obj = i4;
                                z2 = d2;
                            } catch (java.lang.Throwable th2) {
                                r02 = this;
                                s2 = s3;
                                th = th2;
                                c0018s = d2;
                                s2.close();
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            r02 = this;
                            th = th3;
                            c0018s = d2;
                            if (c0018s != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0018s = r02.f406f;
                        s2 = r02.f405e;
                        r02 = r02.f404d;
                        try {
                            a.AbstractC0059a.A(obj);
                            y2 = r02;
                            z2 = c0018s;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                s2.close();
                            } catch (java.lang.Throwable th5) {
                                Q1.d.b(th, th5);
                            }
                            throw th;
                        }
                    }
                    s2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        y2.f421e.e(null);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            s2.close();
            th = null;
            if (th == null) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            if (c0018s != 0) {
                r02.f421e.e(null);
            }
            throw th;
        }
        r02 = new F.W(this, abstractC0931b);
        java.lang.Object obj2 = r02.f407g;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = r02.f409i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(6:(2:3|(10:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(4:64|(2:66|(2:68|69))|70|(1:72)(1:73))(2:74|75))|45|46|47|48|49|(1:51)(5:52|14|15|16|(0)(0))))|46|47|48|49|(0)(0))|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x0116, IOException -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0118, blocks: (B:18:0x00db, B:20:0x00e1, B:22:0x00e9, B:25:0x00f5, B:26:0x0115, B:28:0x00ee, B:31:0x0123, B:38:0x0130, B:41:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(F.O o2, m1.AbstractC0931b abstractC0931b) {
        F.X x2;
        l1.EnumC0927a enumC0927a;
        ?? r3;
        java.io.File file;
        F.Y y2;
        H1.a aVar;
        s1.p pVar;
        F.a0 a0Var;
        java.lang.Throwable th;
        F.a0 a0Var2;
        java.io.File file2;
        F.Y y3;
        try {
            try {
                try {
                    if (abstractC0931b instanceof F.X) {
                        x2 = (F.X) abstractC0931b;
                        int i2 = x2.f416j;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            x2.f416j = i2 - Integer.MIN_VALUE;
                            java.lang.Object obj = x2.f414h;
                            enumC0927a = l1.EnumC0927a.f8017a;
                            r3 = x2.f416j;
                            if (r3 != 0) {
                                a.AbstractC0059a.A(obj);
                                if (this.f420d.get()) {
                                    throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
                                }
                                java.io.File file3 = this.f417a;
                                java.io.File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new java.io.IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                x2.f410d = this;
                                x2.f411e = o2;
                                H1.d dVar = this.f421e;
                                x2.f412f = dVar;
                                x2.f416j = 1;
                                if (dVar.c(x2) == enumC0927a) {
                                    return enumC0927a;
                                }
                                y2 = this;
                                aVar = dVar;
                                pVar = o2;
                            } else {
                                if (r3 != 1) {
                                    if (r3 != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a0Var2 = x2.f413g;
                                    file2 = (java.io.File) x2.f412f;
                                    aVar = (H1.a) x2.f411e;
                                    y3 = x2.f410d;
                                    try {
                                        a.AbstractC0059a.A(obj);
                                        try {
                                            a0Var2.close();
                                            th = null;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists()) {
                                            java.io.File file4 = y3.f417a;
                                            if (!(android.os.Build.VERSION.SDK_INT >= 26 ? F.AbstractC0001a.a(file2, file4) : file2.renameTo(file4))) {
                                                throw new java.io.IOException("Unable to rename " + file2 + " to " + y3.f417a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                            }
                                        }
                                        ((H1.d) aVar).e(null);
                                        return h1.C0177i.f3302a;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        try {
                                            a0Var2.close();
                                        } catch (java.lang.Throwable th4) {
                                            Q1.d.b(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                H1.a aVar2 = (H1.a) x2.f412f;
                                s1.p pVar2 = (s1.p) x2.f411e;
                                y2 = x2.f410d;
                                a.AbstractC0059a.A(obj);
                                aVar = aVar2;
                                pVar = pVar2;
                            }
                            file = new java.io.File(y2.f417a.getAbsolutePath() + ".tmp");
                            a0Var = new F.a0(file);
                            x2.f410d = y2;
                            x2.f411e = aVar;
                            x2.f412f = file;
                            x2.f413g = a0Var;
                            x2.f416j = 2;
                            if (pVar.invoke(a0Var, x2) != enumC0927a) {
                                return enumC0927a;
                            }
                            file2 = file;
                            y3 = y2;
                            a0Var2 = a0Var;
                            a0Var2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                    }
                    x2.f410d = y2;
                    x2.f411e = aVar;
                    x2.f412f = file;
                    x2.f413g = a0Var;
                    x2.f416j = 2;
                    if (pVar.invoke(a0Var, x2) != enumC0927a) {
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    a0Var2 = a0Var;
                    a0Var2.close();
                    throw th;
                }
                a0Var = new F.a0(file);
            } catch (java.io.IOException e2) {
                e = e2;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r3 != 0) {
            }
            file = new java.io.File(y2.f417a.getAbsolutePath() + ".tmp");
        } catch (java.lang.Throwable th6) {
            ((H1.d) r3).e(null);
            throw th6;
        }
        x2 = new F.X(this, abstractC0931b);
        java.lang.Object obj2 = x2.f414h;
        enumC0927a = l1.EnumC0927a.f8017a;
        r3 = x2.f416j;
    }

    @Override // F.InterfaceC0002b
    public final void close() {
        this.f420d.set(true);
        this.f419c.invoke();
    }
}
