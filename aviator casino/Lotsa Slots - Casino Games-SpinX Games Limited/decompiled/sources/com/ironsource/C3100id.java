package com.ironsource;

/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3100id implements com.ironsource.J7, com.ironsource.J7.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.E3 f6312a;
    private final com.ironsource.N4 b;

    /* renamed from: com.ironsource.id$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6313a;

        static {
            int[] iArr = new int[com.ironsource.I3.values().length];
            try {
                iArr[com.ironsource.I3.Delivery.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.I3.Pacing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.I3.ShowCount.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6313a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3100id() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.J7
    public synchronized com.ironsource.G3 a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.lang.String a2 = new com.ironsource.C3207od(placementName, adFormat).a();
        com.ironsource.G3 a3 = this.b.a(a2);
        if (a3.d()) {
            return a3;
        }
        return this.f6312a.a(a2);
    }

    @Override // com.ironsource.J7.a
    public synchronized void b(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.lang.String a2 = new com.ironsource.C3207od(placementName, adFormat).a();
        if (!this.b.a(a2).d()) {
            this.f6312a.b(a2);
        }
    }

    public C3100id(com.ironsource.E3 cappingService, com.ironsource.N4 deliveryHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f6312a = cappingService;
        this.b = deliveryHandler;
    }

    public /* synthetic */ C3100id(com.ironsource.E3 e3, com.ironsource.N4 n4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.E3(null, null, null, 7, null) : e3, (i & 2) != 0 ? new com.ironsource.N4() : n4);
    }

    @Override // com.ironsource.J7.a
    public synchronized java.lang.Object a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.I3 cappingType, com.ironsource.InterfaceC3183n7 cappingConfig) {
        java.lang.Object a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.String a3 = new com.ironsource.C3207od(placementName, adFormat).a();
        int i = com.ironsource.C3100id.a.f6313a[cappingType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            a2 = this.f6312a.a(a3, cappingType, cappingConfig);
        } else {
            a2 = this.b.a(a3, cappingType, cappingConfig);
        }
        return a2;
    }
}
