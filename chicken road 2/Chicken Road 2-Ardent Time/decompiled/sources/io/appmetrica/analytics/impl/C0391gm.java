package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391gm implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0849ye f5999a = new io.appmetrica.analytics.impl.C0849ye();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0353fa f6000b = new io.appmetrica.analytics.impl.C0353fa();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hm f6001c = new io.appmetrica.analytics.impl.Hm();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0346f3 f6002d = new io.appmetrica.analytics.impl.C0346f3();

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0552n2 f6003e = new io.appmetrica.analytics.impl.C0552n2();

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0789w6 f6004f = new io.appmetrica.analytics.impl.C0789w6();

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dm f6005g = new io.appmetrica.analytics.impl.Dm();

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0615pd f6006h = new io.appmetrica.analytics.impl.C0615pd();

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C9 f6007i = new io.appmetrica.analytics.impl.C9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0805wm fromModel(io.appmetrica.analytics.impl.C0468jm c0468jm) {
        io.appmetrica.analytics.impl.C0805wm c0805wm = new io.appmetrica.analytics.impl.C0805wm();
        c0805wm.f7057s = c0468jm.f6234u;
        c0805wm.t = c0468jm.f6235v;
        java.lang.String str = c0468jm.f6215a;
        if (str != null) {
            c0805wm.f7039a = str;
        }
        java.util.List list = c0468jm.f6220f;
        if (list != null) {
            c0805wm.f7044f = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
        }
        java.util.List list2 = c0468jm.f6221g;
        if (list2 != null) {
            c0805wm.f7045g = (java.lang.String[]) list2.toArray(new java.lang.String[list2.size()]);
        }
        java.util.List list3 = c0468jm.f6216b;
        if (list3 != null) {
            c0805wm.f7041c = (java.lang.String[]) list3.toArray(new java.lang.String[list3.size()]);
        }
        java.util.List list4 = c0468jm.f6222h;
        if (list4 != null) {
            c0805wm.f7053o = (java.lang.String[]) list4.toArray(new java.lang.String[list4.size()]);
        }
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map = c0468jm.f6223i;
        if (map != null) {
            c0805wm.f7046h = this.f6004f.fromModel(map);
        }
        io.appmetrica.analytics.impl.C0823xe c0823xe = c0468jm.f6233s;
        if (c0823xe != null) {
            c0805wm.f7059v = this.f5999a.fromModel(c0823xe);
        }
        java.lang.String str2 = c0468jm.f6224j;
        if (str2 != null) {
            c0805wm.f7048j = str2;
        }
        java.lang.String str3 = c0468jm.f6217c;
        if (str3 != null) {
            c0805wm.f7042d = str3;
        }
        java.lang.String str4 = c0468jm.f6218d;
        if (str4 != null) {
            c0805wm.f7043e = str4;
        }
        java.lang.String str5 = c0468jm.f6219e;
        if (str5 != null) {
            c0805wm.f7056r = str5;
        }
        c0805wm.f7047i = this.f6000b.fromModel(c0468jm.f6227m);
        java.lang.String str6 = c0468jm.f6225k;
        if (str6 != null) {
            c0805wm.f7049k = str6;
        }
        java.lang.String str7 = c0468jm.f6226l;
        if (str7 != null) {
            c0805wm.f7050l = str7;
        }
        c0805wm.f7051m = c0468jm.f6230p;
        c0805wm.f7040b = c0468jm.f6228n;
        c0805wm.f7055q = c0468jm.f6229o;
        io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig = c0468jm.t;
        c0805wm.f7060w = retryPolicyConfig.maxIntervalSeconds;
        c0805wm.f7061x = retryPolicyConfig.exponentialMultiplier;
        java.lang.String str8 = c0468jm.f6231q;
        if (str8 != null) {
            c0805wm.f7052n = str8;
        }
        io.appmetrica.analytics.impl.Gm gm = c0468jm.f6232r;
        if (gm != null) {
            this.f6001c.getClass();
            io.appmetrica.analytics.impl.C0779vm c0779vm = new io.appmetrica.analytics.impl.C0779vm();
            c0779vm.f6985a = gm.f4352a;
            c0805wm.f7054p = c0779vm;
        }
        c0805wm.f7058u = c0468jm.f6236w;
        io.appmetrica.analytics.impl.C0295d3 c0295d3 = c0468jm.f6237x;
        if (c0295d3 != null) {
            this.f6002d.getClass();
            io.appmetrica.analytics.impl.C0598om c0598om = new io.appmetrica.analytics.impl.C0598om();
            c0598om.f6604a = c0295d3.f5692a;
            c0805wm.f7062y = c0598om;
        }
        io.appmetrica.analytics.impl.C0526m2 c0526m2 = c0468jm.f6238y;
        if (c0526m2 != null) {
            c0805wm.f7063z = this.f6003e.fromModel(c0526m2);
        }
        c0805wm.f7036A = this.f6005g.fromModel(c0468jm.f6239z);
        c0805wm.f7037B = this.f6006h.fromModel(c0468jm.f6213A);
        c0805wm.f7038C = this.f6007i.fromModel(c0468jm.f6214B);
        return c0805wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0468jm toModel(io.appmetrica.analytics.impl.C0805wm c0805wm) {
        io.appmetrica.analytics.impl.C0442im c0442im = new io.appmetrica.analytics.impl.C0442im(this.f6000b.toModel(c0805wm.f7047i));
        c0442im.f6112a = c0805wm.f7039a;
        c0442im.f6121j = c0805wm.f7048j;
        c0442im.f6114c = c0805wm.f7042d;
        c0442im.f6113b = java.util.Arrays.asList(c0805wm.f7041c);
        c0442im.f6118g = java.util.Arrays.asList(c0805wm.f7045g);
        c0442im.f6117f = java.util.Arrays.asList(c0805wm.f7044f);
        c0442im.f6115d = c0805wm.f7043e;
        c0442im.f6116e = c0805wm.f7056r;
        c0442im.f6119h = java.util.Arrays.asList(c0805wm.f7053o);
        c0442im.f6122k = c0805wm.f7049k;
        c0442im.f6123l = c0805wm.f7050l;
        c0442im.f6128q = c0805wm.f7051m;
        c0442im.f6126o = c0805wm.f7040b;
        c0442im.f6127p = c0805wm.f7055q;
        c0442im.t = c0805wm.f7057s;
        c0442im.f6131u = c0805wm.t;
        c0442im.f6129r = c0805wm.f7052n;
        c0442im.f6132v = c0805wm.f7058u;
        c0442im.f6133w = new io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig(c0805wm.f7060w, c0805wm.f7061x);
        c0442im.f6120i = this.f6004f.toModel(c0805wm.f7046h);
        io.appmetrica.analytics.impl.C0727tm c0727tm = c0805wm.f7059v;
        if (c0727tm != null) {
            this.f5999a.getClass();
            c0442im.f6125n = new io.appmetrica.analytics.impl.C0823xe(c0727tm.f6865a, c0727tm.f6866b);
        }
        io.appmetrica.analytics.impl.C0779vm c0779vm = c0805wm.f7054p;
        if (c0779vm != null) {
            this.f6001c.getClass();
            c0442im.f6130s = new io.appmetrica.analytics.impl.Gm(c0779vm.f6985a);
        }
        io.appmetrica.analytics.impl.C0598om c0598om = c0805wm.f7062y;
        if (c0598om != null) {
            this.f6002d.getClass();
            c0442im.f6134x = new io.appmetrica.analytics.impl.C0295d3(c0598om.f6604a);
        }
        io.appmetrica.analytics.impl.C0572nm c0572nm = c0805wm.f7063z;
        if (c0572nm != null) {
            c0442im.f6135y = this.f6003e.toModel(c0572nm);
        }
        io.appmetrica.analytics.impl.C0753um c0753um = c0805wm.f7036A;
        if (c0753um != null) {
            this.f6005g.getClass();
            c0442im.f6136z = new io.appmetrica.analytics.impl.Cm(c0753um.f6934a);
        }
        c0442im.f6110A = this.f6006h.toModel(c0805wm.f7037B);
        io.appmetrica.analytics.impl.C0650qm c0650qm = c0805wm.f7038C;
        if (c0650qm != null) {
            this.f6007i.getClass();
            c0442im.f6111B = new io.appmetrica.analytics.impl.B9(c0650qm.f6700a);
        }
        return new io.appmetrica.analytics.impl.C0468jm(c0442im);
    }
}
