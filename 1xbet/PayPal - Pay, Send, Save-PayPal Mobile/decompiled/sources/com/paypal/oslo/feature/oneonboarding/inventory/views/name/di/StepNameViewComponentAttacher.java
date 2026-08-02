package com.paypal.oslo.feature.oneonboarding.inventory.views.name.di;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u00ad\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00062&\u0010\u001a\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\f\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/StepNameViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "", "onNameChange", "", "nationality", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoMap", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "onRegisterValidateTrigger", "", "onValidationComplete", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "onFieldErrors", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepNameViewComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher();

    private StepNameViewComponentAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher
    public final void Attach(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function1, java.lang.String str, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function14, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        composer.startReplaceGroup(-1978167014);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1978167014, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher.Attach (NameViewComponentAttacher.kt:63)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.NameViewComponent(nameViewComponentConfig, function1, (com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0), modifier, str, function12, function13, map, function14, composer, (i & 126) | ((i >> 3) & 7168) | ((i << 6) & 57344) | (458752 & i) | (3670016 & i) | ((i << 12) & 29360128) | (234881024 & (i << 3)), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
