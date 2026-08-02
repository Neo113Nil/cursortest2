package com.paypal.oslo.core.telemetry.analytics.context;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/reflect/KClass;", "contextClasses", "", "warmupContextKeyCache", "([Lkotlin/reflect/KClass;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ContextKeyCacheKt {
    public static final void warmupContextKeyCache(kotlin.reflect.KClass<?>... kClassArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassArr, "");
        com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache.INSTANCE.warmup((kotlin.reflect.KClass[]) java.util.Arrays.copyOf(kClassArr, kClassArr.length));
    }
}
