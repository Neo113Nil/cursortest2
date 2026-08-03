package com.ironsource;

/* renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3262rf implements com.ironsource.B3 {
    public static final com.ironsource.C3262rf.a d = new com.ironsource.C3262rf.a(null);
    public static final int e = -1;
    public static final long f = -1;

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f6584a;
    private final java.lang.String b;
    private final com.ironsource.J8 c;

    /* renamed from: com.ironsource.rf$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3262rf(android.content.Context context, java.lang.String baseName, com.ironsource.J8 sdkSharedPref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseName, "baseName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f6584a = context;
        this.b = baseName;
        this.c = sdkSharedPref;
    }

    @Override // com.ironsource.B3
    public void a(java.lang.String identifier, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".show_count_show_counter").a(), i);
    }

    @Override // com.ironsource.B3
    public java.lang.Long b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Long.valueOf(this.c.b(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.B3
    public java.lang.Integer c(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Integer.valueOf(this.c.b(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.B3
    public void a(java.lang.String identifier, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".pacing_last_show_time").a(), j);
    }

    @Override // com.ironsource.B3
    public void b(java.lang.String identifier, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".show_count_threshold").a(), j);
    }

    public /* synthetic */ C3262rf(android.content.Context context, java.lang.String str, com.ironsource.J8 j8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new com.ironsource.Me() : j8);
    }

    @Override // com.ironsource.B3
    public java.lang.Long a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Long.valueOf(this.c.b(this.f6584a, new com.ironsource.C3280sf(identifier, this.b + ".show_count_threshold").a(), -1L)));
    }

    private final java.lang.Long a(java.lang.Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final java.lang.Integer a(java.lang.Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
