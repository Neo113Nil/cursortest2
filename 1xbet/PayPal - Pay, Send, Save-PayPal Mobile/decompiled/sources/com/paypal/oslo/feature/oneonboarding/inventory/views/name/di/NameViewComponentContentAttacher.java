package com.paypal.oslo.feature.oneonboarding.inventory.views.name.di;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u00ad\u0001\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\b2&\u0010\u001c\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u000e\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentContentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "nameLayout", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "", "onNameChange", "", "nationality", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoMap", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "onRegisterValidateTrigger", "", "onValidationComplete", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "onFieldErrors", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameViewComponentContentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.model.NameLayout getHighSpeedVideoFpsRanges;

    public NameViewComponentContentAttacher(com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameLayout, "");
        this.getHighSpeedVideoFpsRanges = nameLayout;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher
    public final void Attach(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function1, java.lang.String str, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function14, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        composer.startReplaceGroup(-291537349);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-291537349, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentContentAttacher.Attach (NameViewComponentAttacher.kt:97)");
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.NameViewComponentContent(nameViewComponentConfig, this.getHighSpeedVideoFpsRanges, function1, modifier, null, null, null, composer, (i & 14) | ((i << 3) & 896) | ((i >> 3) & 7168), 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
