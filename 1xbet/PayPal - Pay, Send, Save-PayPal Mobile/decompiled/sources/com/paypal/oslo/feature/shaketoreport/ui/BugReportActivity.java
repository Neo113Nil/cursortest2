package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\n\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportFlowViewModel;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes14.dex */
public final class BugReportActivity extends com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity {
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.Companion INSTANCE = new com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.Companion(null);
    public static final int $stable = 8;

    public BugReportActivity() {
        final com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity bugReportActivity = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.getHighSpeedVideoSizes = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.view.ComponentActivity.this.getGetHighSpeedVideoSizes();
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return androidx.view.ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                return (function02 == null || (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) == null) ? bugReportActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportActivity$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "screenshotPath", "agileTeamKey", "Landroid/content/Intent;", "getIntent", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.content.Intent getIntent(android.app.Activity activity, java.lang.String screenshotPath, java.lang.String agileTeamKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agileTeamKey, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.class);
            intent.putExtra("screen_shot_file_path_key", screenshotPath);
            intent.putExtra("screen_activity_name_key", activity.getClass().getSimpleName());
            intent.putExtra("agile_team_key", agileTeamKey);
            return intent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        byte[] bArr;
        super.onCreate(savedInstanceState);
        com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity bugReportActivity = this;
        androidx.view.EdgeToEdge.enable$default(bugReportActivity, null, null, 3, null);
        final java.lang.String stringExtra = getIntent().getStringExtra("screen_activity_name_key");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("agile_team_key");
        if (stringExtra2 == null) {
            stringExtra2 = "Oslo-Mobile";
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
        java.lang.String stringExtra3 = intent.getStringExtra("screen_shot_file_path_key");
        if (stringExtra3 == null || (bArr = com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.loadBitmapAsByteArray(stringExtra3)) == null) {
            bArr = null;
        } else {
            com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.cleanupTempFile(stringExtra3);
        }
        ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) this.getHighSpeedVideoSizes.getValue()).initializeWithScreenshot(bArr);
        androidx.view.compose.ComponentActivityKt.setContent$default(bugReportActivity, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1853494838, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.m19326$r8$lambda$kLq2DmaTzgeEKxPLpih38vwKug(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.this, stringExtra, stringExtra2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1fHfSkxvGsSdJhMhqtX_awLcS0g(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity bugReportActivity) {
        bugReportActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$P-n4PQjzajaL6-3NyRnEq_-9o1w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19325$r8$lambda$Pn4PQjzajaL63NyRnEq_9o1w(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity bugReportActivity) {
        bugReportActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kLq2DmaTzge-EKxPLpih38vwKug, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19326$r8$lambda$kLq2DmaTzgeEKxPLpih38vwKug(final com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity bugReportActivity, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1853494838, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.onCreate.<anonymous> (BugReportActivity.kt:73)");
            }
            com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel = (com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) bugReportActivity.getHighSpeedVideoSizes.getValue();
            java.lang.String route = ((com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel) bugReportActivity.getHighSpeedVideoSizes.getValue()).getStartDestination().getRoute();
            boolean changedInstance = composer.changedInstance(bugReportActivity);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.m19325$r8$lambda$Pn4PQjzajaL63NyRnEq_9o1w(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(bugReportActivity);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.$r8$lambda$1fHfSkxvGsSdJhMhqtX_awLcS0g(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.BugReportNavHost(bugReportFlowViewModel, str, str2, route, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.paypal.oslo.feature.shaketoreport.ui.Hilt_BugReportActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
