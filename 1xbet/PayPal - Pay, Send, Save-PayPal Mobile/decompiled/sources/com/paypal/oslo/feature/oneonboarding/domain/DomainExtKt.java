package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000b\u001a\u00020\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "T", "", "findViewComponentConfigOrNull", "(Ljava/util/Collection;)Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "findCollectedItemOrNull", "(Ljava/util/Collection;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lkotlin/Function1;", "", "block", "withViewComponentConfig", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DomainExtKt {
    public static final /* synthetic */ <T extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> T findViewComponentConfigOrNull(java.util.Collection<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> collection) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = (T) it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
            if (t != null) {
                break;
            }
        }
        return t;
    }

    public static final /* synthetic */ <T extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> T findCollectedItemOrNull(java.util.Collection<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> collection) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = (T) it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
            if (t != null) {
                break;
            }
        }
        return t;
    }

    public static final /* synthetic */ <T extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> void withViewComponentConfig(java.util.Collection<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> collection, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                viewComponentConfig = null;
                break;
            }
            viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
            if (viewComponentConfig != null) {
                break;
            }
        }
        if (viewComponentConfig != null) {
            function1.invoke(viewComponentConfig);
        }
    }
}
