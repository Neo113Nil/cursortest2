package com.paypal.oslo.feature.bnplservicing.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/navigation/BnplServicingDeepLinkBackstackProvider;", "Lcom/paypal/oslo/core/deeplink/DeepLinkBackstackProvider;", "", "Landroidx/navigation3/runtime/NavKey;", "getIntermediateDestinations", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BnplServicingDeepLinkBackstackProvider extends com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations(com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider bnplServicingDeepLinkBackstackProvider) {
            return com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingDeepLinkBackstackProvider.super.getIntermediateDestinations();
        }
    }

    @Override // com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider
    default java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }
}
