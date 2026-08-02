package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NameViewComponentContentKt$NameViewComponentContent$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameLayout getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass, java.lang.String str) {
        kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass2 = kClass;
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.access$NameViewComponentContent$onFieldChange(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, kClass2, str2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NameViewComponentContentKt$NameViewComponentContent$3$1(kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, kotlin.Unit> function1, com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function12, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> mutableState) {
        super(2, kotlin.jvm.internal.Intrinsics.Kotlin.class, "onFieldChange", "NameViewComponentContent$onFieldChange(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;Landroidx/compose/runtime/MutableState;Lkotlin/reflect/KClass;Ljava/lang/String;)V", 0);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = nameLayout;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.Camera2StreamConfigurationMap = nameViewComponentConfig;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
