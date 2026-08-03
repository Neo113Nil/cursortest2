package com.ironsource;

/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3341w4 implements com.ironsource.O8, com.ironsource.N8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3344w7 f6800a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3341w4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.N8
    public void a(android.content.Context context, com.ironsource.EnumC3323v4 source, java.lang.String key, java.lang.String value) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.ironsource.B4 a2 = this.f6800a.a(context, source);
        if (a2 != null) {
            a2.b(key, value);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C3341w4(com.ironsource.InterfaceC3344w7 sharedSignalsStorageFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f6800a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.O8
    public java.lang.String a(android.content.Context context, com.ironsource.EnumC3323v4 source, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.ironsource.B4 a2 = this.f6800a.a(context, source);
        if (a2 != null) {
            return com.ironsource.B4.CC.a(a2, key, null, 2, null);
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C3341w4(com.ironsource.InterfaceC3344w7 interfaceC3344w7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.C3395z4() : interfaceC3344w7);
    }
}
