package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionConfigBuilder;", "", "<init>", "()V", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lkotlin/Function1;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "section", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "build", "()Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
@com.paypal.oslo.core.companion.domain.CompanionAppDsl
/* loaded from: classes10.dex */
public final class CompanionConfigBuilder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    public static /* synthetic */ void section$default(com.paypal.oslo.core.companion.domain.CompanionConfigBuilder companionConfigBuilder, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        companionConfigBuilder.section(str, str2, str3, function1);
    }

    public final void section(java.lang.String id, java.lang.String name2, java.lang.String description, @com.paypal.oslo.core.companion.domain.CompanionAppDsl kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.companion.domain.ConfigSectionBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighSpeedVideoFpsRangesFor.add(com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section(id, name2, description, block));
    }

    public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration build() {
        return new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration(this.getHighSpeedVideoFpsRangesFor);
    }
}
