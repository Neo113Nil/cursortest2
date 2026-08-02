package com.plaid.internal;

/* loaded from: classes16.dex */
public abstract class V<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5945a;

    public static final class a extends com.plaid.internal.V<com.plaid.internal.X6> {
        public static final com.plaid.internal.V.a b = new com.plaid.internal.V.a();

        public a() {
            super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.X6.class));
        }
    }

    public V(kotlin.reflect.KClass kClass) {
        java.lang.String simpleName = kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass).getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.f5945a = simpleName;
    }
}
