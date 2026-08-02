package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddressCollectionHalfSheetKt$AddressFlowRouter$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel) this.receiver).onFieldValueChanged(kClass, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass, java.lang.String str) {
        Camera2StreamConfigurationMap(kClass, str);
        return kotlin.Unit.INSTANCE;
    }

    AddressCollectionHalfSheetKt$AddressFlowRouter$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.class, "onFieldValueChanged", "onFieldValueChanged(Lkotlin/reflect/KClass;Ljava/lang/String;)V", 0);
    }
}
