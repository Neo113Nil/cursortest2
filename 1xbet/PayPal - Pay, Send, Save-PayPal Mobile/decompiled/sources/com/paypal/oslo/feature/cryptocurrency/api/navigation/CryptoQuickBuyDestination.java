package com.paypal.oslo.feature.cryptocurrency.api.navigation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/api/navigation/CryptoQuickBuyDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/deeplink/DeepLinkBackstackProvider;", "<init>", "()V", "", "getIntermediateDestinations", "()Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes12.dex */
public final /* data */ class CryptoQuickBuyDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider {
    public static final com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination INSTANCE = new com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination.m13733$r8$lambda$U2u4iZROjCsnD47KKO8En0tuDs();
        }
    });

    public final int hashCode() {
        return 1120187289;
    }

    private CryptoQuickBuyDestination() {
    }

    @Override // com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider
    public final java.util.List<androidx.navigation3.runtime.NavKey> getIntermediateDestinations() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE);
    }

    /* renamed from: $r8$lambda$U2u4iZR-OjCsnD47KKO8En0tuDs, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m13733$r8$lambda$U2u4iZROjCsnD47KKO8En0tuDs() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final java.lang.String toString() {
        return "CryptoQuickBuyDestination";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination)) {
            return false;
        }
        return true;
    }
}
