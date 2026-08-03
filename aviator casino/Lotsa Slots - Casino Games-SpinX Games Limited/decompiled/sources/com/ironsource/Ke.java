package com.ironsource;

/* loaded from: classes5.dex */
public final class Ke implements com.ironsource.Je {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.J8 f5804a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Ke.a f5805a = new com.ironsource.Ke.a();
        public static final java.lang.String b = "sessionNumber";
        public static final java.lang.String c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ke() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Le
    public void a(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5804a.a(context, com.ironsource.Ke.a.b, i);
    }

    @Override // com.ironsource.Le
    public int b(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.f5804a.b(context, com.ironsource.Ke.a.b, i);
    }

    public Ke(com.ironsource.J8 sdkSharedPref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f5804a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC3244qe
    public long a(android.content.Context context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.f5804a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC3244qe
    public void b(android.content.Context context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5804a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ Ke(com.ironsource.J8 j8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.Me() : j8);
    }
}
