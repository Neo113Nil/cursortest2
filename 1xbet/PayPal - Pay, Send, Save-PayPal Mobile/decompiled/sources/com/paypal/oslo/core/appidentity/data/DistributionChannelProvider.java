package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/DistributionChannelProvider;", "Lcom/paypal/oslo/core/appidentity/domain/DistributionChannel;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "Lcom/paypal/oslo/core/appidentity/domain/DistributionChannelType;", "distributionChannel$delegate", "Lkotlin/Lazy;", "getDistributionChannel", "()Lcom/paypal/oslo/core/appidentity/domain/DistributionChannelType;", "distributionChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistributionChannelProvider implements com.paypal.oslo.core.appidentity.domain.DistributionChannel {
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: distributionChannel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy distributionChannel;

    @javax.inject.Inject
    public DistributionChannelProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
        this.distributionChannel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.DistributionChannelProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.appidentity.data.DistributionChannelProvider.$r8$lambda$pnmrZQsyCJY8jJjq97qHlXKUNfE(com.paypal.oslo.core.appidentity.data.DistributionChannelProvider.this);
            }
        });
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DistributionChannel
    public final com.paypal.oslo.core.appidentity.domain.DistributionChannelType getDistributionChannel() {
        return (com.paypal.oslo.core.appidentity.domain.DistributionChannelType) this.distributionChannel.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.core.appidentity.domain.DistributionChannelType $r8$lambda$pnmrZQsyCJY8jJjq97qHlXKUNfE(com.paypal.oslo.core.appidentity.data.DistributionChannelProvider distributionChannelProvider) {
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(distributionChannelProvider.Camera2StreamConfigurationMap, com.paypal.oslo.core.di.entrypoints.ApplicationBuildTypeEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String packageName = distributionChannelProvider.Camera2StreamConfigurationMap.getPackageName();
        java.lang.String applicationBuildType = ((com.paypal.oslo.core.di.entrypoints.ApplicationBuildTypeEntryPoint) obj).getApplicationBuildType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(packageName);
        java.lang.String str = packageName;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ".demo", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.core.appidentity.domain.DistributionChannelType.DEVELOPMENT;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ".daily", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.core.appidentity.domain.DistributionChannelType.ENTERPRISE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(applicationBuildType, "release")) {
            return com.paypal.oslo.core.appidentity.domain.DistributionChannelType.DEVELOPMENT;
        }
        return com.paypal.oslo.core.appidentity.domain.DistributionChannelType.PLAYSTORE;
    }
}
