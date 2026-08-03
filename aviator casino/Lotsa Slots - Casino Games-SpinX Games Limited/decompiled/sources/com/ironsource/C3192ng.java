package com.ironsource;

/* renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3192ng implements com.ironsource.InterfaceC3156lg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3192ng f6503a = new com.ironsource.C3192ng();
    private static final kotlin.Lazy b = kotlin.LazyKt.lazy(com.ironsource.C3192ng.a.f6504a);

    /* renamed from: com.ironsource.ng$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3192ng.a f6504a = new com.ironsource.C3192ng.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            try {
                java.lang.Object invoke = java.lang.Class.forName(com.ironsource.C3174mg.f6472a).getMethod("getVersion", null).invoke(null, null);
                if (invoke instanceof java.lang.String) {
                    return (java.lang.String) invoke;
                }
                return null;
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C3192ng() {
    }

    @Override // com.ironsource.InterfaceC3156lg
    public java.lang.String a() {
        return (java.lang.String) b.getValue();
    }
}
