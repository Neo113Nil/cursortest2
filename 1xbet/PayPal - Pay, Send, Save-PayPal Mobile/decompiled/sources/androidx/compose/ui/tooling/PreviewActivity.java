package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewActivity extends androidx.view.ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges = "PreviewActivity";

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(androidx.view.compose.ComposeNavigator.NAME)) == null) {
            return;
        }
        final java.lang.String substringBeforeLast$default = kotlin.text.StringsKt.substringBeforeLast$default(stringExtra, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null);
        final java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(stringExtra, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-840626948, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.PreviewActivity.m8512$r8$lambda$8L8lXCy99H67Fo1WTKvaQj9opM(substringBeforeLast$default, substringAfterLast$default, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }), 1, null);
            return;
        }
        final java.lang.Object[] previewProviderParameters = androidx.compose.ui.tooling.PreviewUtils_androidKt.getPreviewProviderParameters(androidx.compose.ui.tooling.PreviewUtils_androidKt.asPreviewProviderClass(stringExtra2), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-861939235, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.PreviewActivity.$r8$lambda$3h6Pkf89VgF8wNC8rAZRByrC7KU(previewProviderParameters, substringBeforeLast$default, substringAfterLast$default, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }), 1, null);
        } else {
            androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.PreviewActivity.$r8$lambda$lUqsftxT_T5YpdSbP55CWWbq5wE(substringBeforeLast$default, substringAfterLast$default, previewProviderParameters, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3h6Pkf89VgF8wNC8rAZRByrC7KU(final java.lang.Object[] objArr, final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-861939235, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
            androidx.compose.material.ScaffoldKt.m2719Scaffold27mzLpw(null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(958604965, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.PreviewActivity.$r8$lambda$KPF3ExuVmwcbLmeNzxtdfQ9jzhs(objArr, mutableIntState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(57310875, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.ui.tooling.PreviewActivity.$r8$lambda$tGneqyXrP1uOJD5LacwlDLETgw8(str, str2, objArr, mutableIntState, (androidx.compose.foundation.layout.PaddingValues) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 12582912, 131039);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8L8lXCy99H67Fo1WTKvaQ-j9opM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m8512$r8$lambda$8L8lXCy99H67Fo1WTKvaQj9opM(java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-840626948, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
            }
            androidx.compose.ui.tooling.ComposableInvoker.INSTANCE.invokeComposable(str, str2, composer, new java.lang.Object[0]);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KPF3ExuVmwcbLmeNzxtdfQ9jzhs(final java.lang.Object[] objArr, final androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(958604965, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m8506getLambda$426398407$ui_tooling = androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.INSTANCE.m8506getLambda$426398407$ui_tooling();
            boolean changedInstance = composer.changedInstance(objArr);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.ui.tooling.PreviewActivity.m8513$r8$lambda$O8CxgYAEJdvf6QoO3mkJZSui8c(androidx.compose.runtime.MutableIntState.this, objArr);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material.FloatingActionButtonKt.m2645ExtendedFloatingActionButtonwqdebIU(m8506getLambda$426398407$ui_tooling, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, 0L, 0L, null, composer, 6, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$O8CxgYAEJdv-f6QoO3mkJZSui8c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m8513$r8$lambda$O8CxgYAEJdvf6QoO3mkJZSui8c(androidx.compose.runtime.MutableIntState mutableIntState, java.lang.Object[] objArr) {
        mutableIntState.setIntValue((mutableIntState.getIntValue() + 1) % objArr.length);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lUqsftxT_T5YpdSbP55CWWbq5wE(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1901447514, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
            }
            androidx.compose.ui.tooling.ComposableInvoker.INSTANCE.invokeComposable(str, str2, composer, java.util.Arrays.copyOf(objArr, objArr.length));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tGneqyXrP1uOJD5LacwlDLETgw8(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(paddingValues) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(57310875, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
            }
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, padding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.tooling.ComposableInvoker.INSTANCE.invokeComposable(str, str2, composer, objArr[mutableIntState.getIntValue()]);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
