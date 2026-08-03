package com.ironsource;

/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3033f0 implements com.ironsource.InterfaceC3051g0 {
    public static final com.ironsource.C3033f0.a b = new com.ironsource.C3033f0.a(null);
    private static final java.lang.String c = "ext_";

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f6235a = new java.util.HashMap();

    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC3051g0
    public void a(java.util.HashMap<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        this.f6235a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC3051g0
    public void b(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.f6235a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC3051g0
    public java.util.Map<java.lang.String, java.lang.String> get() {
        return this.f6235a;
    }

    @Override // com.ironsource.InterfaceC3051g0
    public void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.f6235a.put(key, value);
    }
}
