package com.ironsource;

/* loaded from: classes5.dex */
public final class Ie implements com.ironsource.I8, com.ironsource.I8.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Je f5759a;
    private final com.ironsource.InterfaceC3387ye b;
    private final com.ironsource.InterfaceC3216p4 c;
    private int d;
    private long e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Ie.a f5760a = new com.ironsource.Ie.a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public Ie(com.ironsource.Je storage, com.ironsource.InterfaceC3387ye initResponseStorage, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f5759a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(android.content.Context context, com.ironsource.Je je) {
        int b = je.b(context, 0) + 1;
        je.a(context, b);
        return b;
    }

    @Override // com.ironsource.I8.a
    public void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.f5759a);
        this.e = a(context, this.f5759a);
    }

    @Override // com.ironsource.I8
    public int c() {
        return this.d;
    }

    private final long a(android.content.Context context, com.ironsource.Je je) {
        long a2 = je.a(context, -1L);
        if (this.b.a(context) || a2 != -1) {
            return a2;
        }
        long a3 = this.c.a();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("set first session timestamp = " + a3);
        je.b(context, a3);
        return a3;
    }

    @Override // com.ironsource.I8
    public java.lang.String b() {
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        return d;
    }

    public /* synthetic */ Ie(com.ironsource.Je je, com.ironsource.InterfaceC3387ye interfaceC3387ye, com.ironsource.InterfaceC3216p4 interfaceC3216p4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(je, (i & 2) != 0 ? new com.ironsource.C3405ze() : interfaceC3387ye, (i & 4) != 0 ? new com.ironsource.InterfaceC3216p4.a() : interfaceC3216p4);
    }

    @Override // com.ironsource.I8
    public long a() {
        return this.e;
    }
}
