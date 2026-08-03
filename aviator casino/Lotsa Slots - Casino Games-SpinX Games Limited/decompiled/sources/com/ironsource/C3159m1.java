package com.ironsource;

/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3159m1 implements com.ironsource.InterfaceC3177n1 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6380a;
    private final java.lang.String b;
    private final com.ironsource.mediationsdk.IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: com.ironsource.m1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3159m1.a f6381a = new com.ironsource.C3159m1.a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public C3159m1(java.lang.String version, java.lang.String instanceId, com.ironsource.mediationsdk.IronSource.a adFormat, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f6380a = version;
        this.b = instanceId;
        this.c = adFormat;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.ironsource.InterfaceC3177n1
    public java.util.ArrayList<com.ironsource.InterfaceC3213p1> a() {
        java.util.ArrayList<com.ironsource.InterfaceC3213p1> arrayList = new java.util.ArrayList<>();
        arrayList.add(new com.ironsource.C3195o1.v(this.f6380a));
        arrayList.add(new com.ironsource.C3195o1.x(this.b));
        arrayList.add(new com.ironsource.C3195o1.a(this.c));
        if (this.d) {
            arrayList.add(new com.ironsource.C3195o1.p(1));
        }
        if (this.e) {
            arrayList.add(new com.ironsource.C3195o1.e(1));
        }
        if (this.f) {
            arrayList.add(new com.ironsource.C3195o1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C3159m1(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
