package F;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f498a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f499b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f500c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f501d;

    public C0014n(int i2) {
        switch (i2) {
            case 5:
                f1.L l2 = new f1.L();
                f1.L l3 = new f1.L();
                this.f498a = new java.util.HashSet();
                this.f499b = l2;
                this.f500c = l3;
                break;
            default:
                this.f499b = new java.util.ArrayDeque();
                this.f500c = new java.util.ArrayDeque();
                this.f501d = new java.util.ArrayDeque();
                break;
        }
    }

    public android.text.SpannableString a() {
        if (((java.lang.String) this.f498a) == null) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString((java.lang.String) this.f498a);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f499b;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.k kVar = (io.flutter.view.k) it.next();
                int b2 = H.j.b(kVar.f7909c);
                if (b2 == 0) {
                    spannableString.setSpan(new android.text.style.TtsSpan.Builder("android.type.verbatim").build(), kVar.f7907a, kVar.f7908b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag(((io.flutter.view.i) kVar).f7906d)), kVar.f7907a, kVar.f7908b, 0);
                }
            }
        }
        java.lang.String str = (java.lang.String) this.f501d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new android.text.style.URLSpan((java.lang.String) this.f501d), 0, ((java.lang.String) this.f498a).length(), 0);
        }
        java.lang.String str2 = (java.lang.String) this.f500c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag((java.lang.String) this.f500c)), 0, ((java.lang.String) this.f498a).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(m1.AbstractC0931b abstractC0931b) {
        F.C0010j c0010j;
        int i2;
        F.C0014n c0014n;
        F.C0004d c0004d;
        if (abstractC0931b instanceof F.C0010j) {
            c0010j = (F.C0010j) abstractC0931b;
            int i3 = c0010j.f470g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0010j.f470g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0010j.f468e;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = c0010j.f470g;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    java.util.List list = (java.util.List) this.f500c;
                    F.P p2 = (F.P) this.f501d;
                    if (list == null || list.isEmpty()) {
                        c0010j.f467d = this;
                        c0010j.f470g = 1;
                        obj = F.P.f(p2, false, c0010j);
                        if (obj == enumC0927a) {
                            return enumC0927a;
                        }
                        c0014n = this;
                        c0004d = (F.C0004d) obj;
                    } else {
                        F.j0 g2 = p2.g();
                        F.C0013m c0013m = new F.C0013m(p2, this, null);
                        c0010j.f467d = this;
                        c0010j.f470g = 2;
                        obj = g2.b(c0013m, c0010j);
                        if (obj == enumC0927a) {
                            return enumC0927a;
                        }
                        c0014n = this;
                        c0004d = (F.C0004d) obj;
                    }
                } else if (i2 == 1) {
                    c0014n = c0010j.f467d;
                    a.AbstractC0059a.A(obj);
                    c0004d = (F.C0004d) obj;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0014n = c0010j.f467d;
                    a.AbstractC0059a.A(obj);
                    c0004d = (F.C0004d) obj;
                }
                ((F.P) c0014n.f501d).f385h.p(c0004d);
                return h1.C0177i.f3302a;
            }
        }
        c0010j = new F.C0010j(this, abstractC0931b);
        java.lang.Object obj2 = c0010j.f468e;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = c0010j.f470g;
        if (i2 != 0) {
        }
        ((F.P) c0014n.f501d).f385h.p(c0004d);
        return h1.C0177i.f3302a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(M1.i call) {
        kotlin.jvm.internal.i.e(call, "call");
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) this.f501d;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new java.lang.AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            byte[] bArr = J1.b.f932a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this) {
                try {
                    java.util.Iterator it = ((java.util.ArrayDeque) this.f499b).iterator();
                    kotlin.jvm.internal.i.d(it, "readyAsyncCalls.iterator()");
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        int size = ((java.util.ArrayDeque) this.f500c).size();
                        synchronized (this) {
                            if (size < 64) {
                                throw null;
                            }
                        }
                        if (arrayList.size() <= 0) {
                            if (arrayList.get(0) != null) {
                                throw new java.lang.ClassCastException();
                            }
                            synchronized (this) {
                                try {
                                    if (((java.util.concurrent.ThreadPoolExecutor) this.f498a) == null) {
                                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                                        java.util.concurrent.SynchronousQueue synchronousQueue = new java.util.concurrent.SynchronousQueue();
                                        java.lang.String name = kotlin.jvm.internal.i.h(" Dispatcher", J1.b.f937f);
                                        kotlin.jvm.internal.i.e(name, "name");
                                        this.f498a = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new J1.a(name, false));
                                    }
                                    kotlin.jvm.internal.i.b((java.util.concurrent.ThreadPoolExecutor) this.f498a);
                                } finally {
                                }
                            }
                            throw null;
                        }
                        return;
                    }
                    synchronized (this) {
                        ((java.util.ArrayDeque) this.f500c).size();
                        ((java.util.ArrayDeque) this.f501d).size();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (arrayList.size() <= 0) {
            }
        }
        byte[] bArr2 = J1.b.f932a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        synchronized (this) {
        }
    }

    public java.io.File d(android.content.Context context) {
        ((f1.L) this.f499b).getClass();
        return new java.io.File(context.getDir("lib", 0), java.lang.System.mapLibraryName(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER));
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, str, objArr);
        if (((H0.b) this.f501d) != null) {
            io.flutter.embedding.engine.FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [H1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object f(m1.AbstractC0931b abstractC0931b) {
        F.e0 e0Var;
        int i2;
        H1.d dVar;
        F.C0014n c0014n;
        H1.a aVar;
        java.lang.Throwable th;
        F.C0014n c0014n2;
        try {
            if (abstractC0931b instanceof F.e0) {
                e0Var = (F.e0) abstractC0931b;
                int i3 = e0Var.f442h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e0Var.f442h = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = e0Var.f440f;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = e0Var.f442h;
                    h1.C0177i c0177i = h1.C0177i.f3302a;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        if (!(((z1.C1059l) this.f499b).D() instanceof z1.L)) {
                            return c0177i;
                        }
                        e0Var.f438d = this;
                        dVar = (H1.d) this.f498a;
                        e0Var.f439e = dVar;
                        e0Var.f442h = 1;
                        if (dVar.c(e0Var) == enumC0927a) {
                            return enumC0927a;
                        }
                        c0014n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = e0Var.f439e;
                            c0014n2 = e0Var.f438d;
                            try {
                                a.AbstractC0059a.A(obj);
                                ((z1.C1059l) c0014n2.f499b).J(c0177i);
                                ((H1.d) aVar).e(null);
                                return c0177i;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                ((H1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = e0Var.f439e;
                        c0014n = e0Var.f438d;
                        a.AbstractC0059a.A(obj);
                        dVar = r2;
                    }
                    if (((z1.C1059l) c0014n.f499b).D() instanceof z1.L) {
                        dVar.e(null);
                        return c0177i;
                    }
                    e0Var.f438d = c0014n;
                    e0Var.f439e = dVar;
                    e0Var.f442h = 2;
                    if (c0014n.b(e0Var) == enumC0927a) {
                        return enumC0927a;
                    }
                    aVar = dVar;
                    c0014n2 = c0014n;
                    ((z1.C1059l) c0014n2.f499b).J(c0177i);
                    ((H1.d) aVar).e(null);
                    return c0177i;
                }
            }
            if (((z1.C1059l) c0014n.f499b).D() instanceof z1.L) {
            }
        } catch (java.lang.Throwable th3) {
            aVar = dVar;
            th = th3;
            ((H1.d) aVar).e(null);
            throw th;
        }
        e0Var = new F.e0(this, abstractC0931b);
        java.lang.Object obj2 = e0Var.f440f;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = e0Var.f442h;
        h1.C0177i c0177i2 = h1.C0177i.f3302a;
        if (i2 != 0) {
        }
    }

    public void g(java.io.Serializable serializable, a1.InterfaceC0063c interfaceC0063c) {
        ((a1.f) this.f498a).c((java.lang.String) this.f499b, ((a1.j) this.f500c).encodeMessage(serializable), interfaceC0063c == null ? null : new a1.C0061a(0, this, interfaceC0063c));
    }

    public void h(a1.InterfaceC0062b interfaceC0062b) {
        java.lang.String str = (java.lang.String) this.f499b;
        a1.f fVar = (a1.f) this.f498a;
        m0.j jVar = (m0.j) this.f501d;
        if (jVar != null) {
            fVar.j(str, interfaceC0062b != null ? new x0.e(this, interfaceC0062b, 18, false) : null, jVar);
        } else {
            fVar.h(str, interfaceC0062b != null ? new x0.e(this, interfaceC0062b, 18, false) : null);
        }
    }

    public C0014n(a1.f fVar, java.lang.String str, a1.j jVar, m0.j jVar2) {
        this.f498a = fVar;
        this.f499b = str;
        this.f500c = jVar;
        this.f501d = jVar2;
    }
}
