package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NameViewComponentContentKt$NameViewComponent$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel) this.receiver).clearFieldError(kClass);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> kClass) {
        getHighSpeedVideoFpsRanges(kClass);
        return kotlin.Unit.INSTANCE;
    }

    NameViewComponentContentKt$NameViewComponent$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel.class, "clearFieldError", "clearFieldError(Lkotlin/reflect/KClass;)V", 0);
    }
}
