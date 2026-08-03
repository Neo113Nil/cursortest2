package com.ironsource;

/* loaded from: classes5.dex */
public final class E3 implements com.ironsource.InterfaceC3219p7, com.ironsource.InterfaceC3219p7.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Wc f5678a;
    private final com.ironsource.C3352wf b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5679a;

        static {
            int[] iArr = new int[com.ironsource.I3.values().length];
            try {
                iArr[com.ironsource.I3.Pacing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.I3.ShowCount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.I3.Delivery.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5679a = iArr;
        }
    }

    public E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC3219p7
    public synchronized com.ironsource.G3 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.ironsource.G3 a2 = this.f5678a.a(identifier);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public synchronized void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f5678a.b(identifier);
        this.b.b(identifier);
    }

    public E3(com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.I7 pacingDataRepository, com.ironsource.P8 showCountDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f5678a = new com.ironsource.Wc(currentTimeProvider, pacingDataRepository);
        this.b = new com.ironsource.C3352wf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC3219p7.a
    public synchronized java.lang.Object a(java.lang.String identifier, com.ironsource.I3 cappingType, com.ironsource.InterfaceC3183n7 cappingConfig) {
        java.lang.Object a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = com.ironsource.E3.a.f5679a[cappingType.ordinal()];
        if (i == 1) {
            a2 = this.f5678a.a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            a2 = this.b.a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a2 = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        return a2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ E3(com.ironsource.InterfaceC3216p4 interfaceC3216p4, com.ironsource.I7 i7, com.ironsource.P8 p8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3216p4, i7, p8);
        interfaceC3216p4 = (i & 1) != 0 ? new com.ironsource.InterfaceC3216p4.a() : interfaceC3216p4;
        if ((i & 2) != 0) {
            android.content.Context applicationContext = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            i7 = new com.ironsource.Yc(new com.ironsource.C3262rf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            android.content.Context applicationContext2 = com.ironsource.environment.ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            p8 = new com.ironsource.C3316uf(new com.ironsource.C3262rf(applicationContext2, "capping_service", null, 4, null));
        }
    }
}
