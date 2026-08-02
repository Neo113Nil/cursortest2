package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\fR\u0015\u0010\u0007\u001a\u00020\u000f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00148CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/miteksystems/misnap/core/MiSnapSettings;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler$CombinedViewModel;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "Ljava/lang/Integer;", "Companion", "Result"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class MiSnapWorkflowActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Companion(null);
    public static final /* synthetic */ java.lang.String WORKFLOW_ACTIVITY_SETTINGS = "WORKFLOW_SETTINGS";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Integer Camera2StreamConfigurationMap;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.b());

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.d());

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.c());

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(com.miteksystems.misnap.core.MiSnapSettings p0) {
        kotlin.Unit unit;
        java.lang.Integer num;
        java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(p0.workflow, p0.getUseCase());
        if (forcedOrientation != null) {
            int intValue = forcedOrientation.intValue();
            if (getRequestedOrientation() != intValue) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(getRequestedOrientation());
                }
                setRequestedOrientation(intValue);
            }
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || isChangingConfigurations() || (num = this.Camera2StreamConfigurationMap) == null) {
            return;
        }
        setRequestedOrientation(num.intValue());
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler;", "a", "()Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler invoke() {
            return new com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this, com.miteksystems.misnap.workflow.R.id.fragmentContainer);
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler$CombinedViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/util/CombinedWorkflowHandler$CombinedViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel invoke() {
            return (com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel) new androidx.view.ViewModelProvider(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this).get(com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel.class);
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        d() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.util.List<? extends com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result>, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result> list) {
            java.util.List<? extends com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result> list2 = list;
            if (list2 != null) {
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity miSnapWorkflowActivity = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this;
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.setResults$workflow_release(list2);
                com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result result = (com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result) kotlin.collections.CollectionsKt.last((java.util.List) list2);
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.access$exitActivity(miSnapWorkflowActivity, ((result instanceof com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error) && (((com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error) result).getErrorResult().getError() instanceof com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow)) ? 0 : -1);
            }
            return kotlin.Unit.INSTANCE;
        }

        e() {
            super(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.miteksystems.misnap.workflow.MiSnapWorkflowStep, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.miteksystems.misnap.workflow.MiSnapWorkflowStep miSnapWorkflowStep) {
            com.miteksystems.misnap.workflow.MiSnapWorkflowStep miSnapWorkflowStep2 = miSnapWorkflowStep;
            if (miSnapWorkflowStep2 != null) {
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this.getHighSpeedVideoFpsRanges(miSnapWorkflowStep2.getSettings());
            }
            return kotlin.Unit.INSTANCE;
        }

        f() {
            super(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "finalResult", "", "a", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.miteksystems.misnap.workflow.MiSnapFinalResult, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.miteksystems.misnap.workflow.MiSnapFinalResult miSnapFinalResult) {
            com.miteksystems.misnap.workflow.MiSnapFinalResult miSnapFinalResult2 = miSnapFinalResult;
            if (miSnapFinalResult2 != null) {
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity miSnapWorkflowActivity = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this;
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.setResults$workflow_release(kotlin.collections.CollectionsKt.listOf(new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Success(miSnapFinalResult2)));
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.access$exitActivity(miSnapWorkflowActivity, -1);
            }
            return kotlin.Unit.INSTANCE;
        }

        g() {
            super(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;", "error", "", "a", "(Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.miteksystems.misnap.workflow.MiSnapErrorResult, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.miteksystems.misnap.workflow.MiSnapErrorResult miSnapErrorResult) {
            com.miteksystems.misnap.workflow.MiSnapErrorResult miSnapErrorResult2 = miSnapErrorResult;
            if (miSnapErrorResult2 != null) {
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity miSnapWorkflowActivity = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this;
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.setResults$workflow_release(kotlin.collections.CollectionsKt.listOf(new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error(miSnapErrorResult2)));
                com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.access$exitActivity(miSnapWorkflowActivity, 0);
            }
            return kotlin.Unit.INSTANCE;
        }

        h() {
            super(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "a", "(Landroidx/activity/OnBackPressedCallback;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.view.OnBackPressedCallback, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.view.OnBackPressedCallback onBackPressedCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.access$handleBackPressed(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.this);
            return kotlin.Unit.INSTANCE;
        }

        i() {
            super(1);
        }
    }

    public static /* synthetic */ void $r8$lambda$KRm2lAW5PmfoTO68WmfXytwOslo(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    public static /* synthetic */ void $r8$lambda$PxZlaWI_CpOPDchfLCgYc2iTmcc(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    /* renamed from: $r8$lambda$qpBdq1QZfc3AZp1VPPA-i-Vkv8Y, reason: not valid java name */
    public static /* synthetic */ void m10925$r8$lambda$qpBdq1QZfc3AZp1VPPAiVkv8Y(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    /* renamed from: $r8$lambda$sL6uF1ttmu1o7uR_-UFPlENz-hM, reason: not valid java name */
    public static /* synthetic */ void m10926$r8$lambda$sL6uF1ttmu1o7uR_UFPlENzhM(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    public static final /* synthetic */ void access$exitActivity(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity miSnapWorkflowActivity, int i2) {
        miSnapWorkflowActivity.setResult(i2);
        com.miteksystems.misnap.core.MibiData.setSessionOwner(null);
        miSnapWorkflowActivity.finish();
    }

    public static final /* synthetic */ void access$handleBackPressed(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity miSnapWorkflowActivity) {
        miSnapWorkflowActivity.setResult(0);
        android.content.Context applicationContext = miSnapWorkflowActivity.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData = com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(applicationContext);
        com.miteksystems.misnap.core.MibiData.setSessionOwner(null);
        if (((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel) miSnapWorkflowActivity.getHighSpeedVideoFpsRangesFor.getValue()).isCombinedWorkflowConfigured()) {
            ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel) miSnapWorkflowActivity.getHighSpeedVideoFpsRangesFor.getValue()).addCombinedWorkflowStepResult(new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error(new com.miteksystems.misnap.workflow.MiSnapErrorResult(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled.INSTANCE, miSnapMibiData)));
            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.setResults$workflow_release(((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler) miSnapWorkflowActivity.getHighSpeedVideoFpsRanges.getValue()).getCollectedResults());
            ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler) miSnapWorkflowActivity.getHighSpeedVideoFpsRanges.getValue()).clean();
        } else {
            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.setResults$workflow_release(kotlin.collections.CollectionsKt.listOf(new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error(new com.miteksystems.misnap.workflow.MiSnapErrorResult(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled.INSTANCE, miSnapMibiData))));
        }
        miSnapWorkflowActivity.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        kotlin.Unit unit;
        com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result result;
        com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error error;
        com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel;
        android.content.Context applicationContext;
        com.miteksystems.misnap.workflow.MiSnapWorkflowError miSnapWorkflowError;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("orientationKey")) {
                this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
            }
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.clearResults();
        }
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra(WORKFLOW_ACTIVITY_SETTINGS);
        if (getIntent().getBooleanExtra("WORKFLOW_ACTIVITY_DISABLE_SCREENSHOTS", true)) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(com.miteksystems.misnap.workflow.R.layout.misnap_activity_root);
        if (stringArrayExtra != null && stringArrayExtra.length != 0) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList(stringArrayExtra.length);
                for (java.lang.String str : stringArrayExtra) {
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    companion.getSerializersModule();
                    arrayList.add((com.miteksystems.misnap.workflow.MiSnapWorkflowStep) companion.decodeFromString(com.miteksystems.misnap.workflow.MiSnapWorkflowStep.INSTANCE.serializer(), str));
                }
                if (arrayList.size() > 1) {
                    androidx.view.LiveData<java.util.List<com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result>> combinedWorkflowResults = ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler) this.getHighSpeedVideoFpsRanges.getValue()).getCombinedWorkflowResults();
                    final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.e eVar = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.e();
                    combinedWorkflowResults.observe(this, new androidx.view.Observer() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowActivity$$ExternalSyntheticLambda0
                        @Override // androidx.view.Observer
                        public final void onChanged(java.lang.Object obj) {
                            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.m10925$r8$lambda$qpBdq1QZfc3AZp1VPPAiVkv8Y(kotlin.jvm.functions.Function1.this, obj);
                        }
                    });
                    androidx.view.LiveData<com.miteksystems.misnap.workflow.MiSnapWorkflowStep> combinedWorkflowNextStep = ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler) this.getHighSpeedVideoFpsRanges.getValue()).getCombinedWorkflowNextStep();
                    final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.f fVar = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.f();
                    combinedWorkflowNextStep.observe(this, new androidx.view.Observer() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowActivity$$ExternalSyntheticLambda1
                        @Override // androidx.view.Observer
                        public final void onChanged(java.lang.Object obj) {
                            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.m10926$r8$lambda$sL6uF1ttmu1o7uR_UFPlENzhM(kotlin.jvm.functions.Function1.this, obj);
                        }
                    });
                    if (savedInstanceState == null) {
                        ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler) this.getHighSpeedVideoFpsRanges.getValue()).startCombinedWorkflow(kotlin.collections.CollectionsKt.toList(arrayList));
                    }
                } else {
                    com.miteksystems.misnap.core.MiSnapSettings settings = ((com.miteksystems.misnap.workflow.MiSnapWorkflowStep) kotlin.collections.CollectionsKt.first((java.util.List) arrayList)).getSettings();
                    java.lang.Integer navGraphId = ((com.miteksystems.misnap.workflow.MiSnapWorkflowStep) kotlin.collections.CollectionsKt.first((java.util.List) arrayList)).getNavGraphId();
                    int intValue = navGraphId != null ? navGraphId.intValue() : -1;
                    if (intValue == -1) {
                        int i2 = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.a.f4145a[settings.getUseCase().ordinal()];
                        intValue = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? com.miteksystems.misnap.workflow.R.navigation.document_session_flow : com.miteksystems.misnap.workflow.R.navigation.voice_session_flow : com.miteksystems.misnap.workflow.R.navigation.nfc_reader_flow : com.miteksystems.misnap.workflow.R.navigation.face_session_flow : com.miteksystems.misnap.workflow.R.navigation.barcode_session_flow;
                    }
                    getHighSpeedVideoFpsRanges(settings);
                    androidx.view.LiveData<com.miteksystems.misnap.workflow.MiSnapFinalResult> results = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getResults();
                    final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.g gVar = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.g();
                    results.observe(this, new androidx.view.Observer() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowActivity$$ExternalSyntheticLambda2
                        @Override // androidx.view.Observer
                        public final void onChanged(java.lang.Object obj) {
                            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.$r8$lambda$KRm2lAW5PmfoTO68WmfXytwOslo(kotlin.jvm.functions.Function1.this, obj);
                        }
                    });
                    androidx.view.LiveData<com.miteksystems.misnap.workflow.MiSnapErrorResult> error2 = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getError();
                    final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.h hVar = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.h();
                    error2.observe(this, new androidx.view.Observer() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowActivity$$ExternalSyntheticLambda3
                        @Override // androidx.view.Observer
                        public final void onChanged(java.lang.Object obj) {
                            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.$r8$lambda$PxZlaWI_CpOPDchfLCgYc2iTmcc(kotlin.jvm.functions.Function1.this, obj);
                        }
                    });
                    if (savedInstanceState == null) {
                        if (settings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC) {
                            if (com.miteksystems.misnap.nfc.util.NfcUtil.isNfcSupported(this)) {
                                com.miteksystems.misnap.core.Mrz mrz = settings.nfc.getCom.miteksystems.misnap.core.MiSnapSettings.KEY_NFC_MRZ java.lang.String();
                                if (mrz != null && !com.miteksystems.misnap.nfc.util.NfcDocumentUtil.isDocumentNfcEnabled(this, mrz)) {
                                    miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                                    applicationContext = getApplicationContext();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                                    miSnapWorkflowError = com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE;
                                }
                            } else {
                                miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                                applicationContext = getApplicationContext();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                                miSnapWorkflowError = com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE;
                            }
                            miSnapWorkflowViewModel.postError$workflow_release(applicationContext, miSnapWorkflowError);
                            return;
                        }
                        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).applySettings(settings);
                        androidx.view.fragment.NavHostFragment create$default = androidx.view.fragment.NavHostFragment.Companion.create$default(androidx.view.fragment.NavHostFragment.INSTANCE, intValue, null, 2, null);
                        getSupportFragmentManager().beginTransaction().replace(com.miteksystems.misnap.workflow.R.id.fragmentContainer, create$default).setPrimaryNavigationFragment(create$default).commit();
                    }
                }
            } catch (java.lang.Exception unused) {
                result = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE;
                com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState settingState = com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE;
                android.content.Context applicationContext2 = getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                error = new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error(new com.miteksystems.misnap.workflow.MiSnapErrorResult(settingState, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(applicationContext2)));
            }
            androidx.view.OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
            androidx.view.OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.i(), 2, null);
        }
        result = com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE;
        com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState settingState2 = com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE;
        android.content.Context applicationContext3 = getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
        error = new com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error(new com.miteksystems.misnap.workflow.MiSnapErrorResult(settingState2, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(applicationContext3)));
        result.setResults$workflow_release(kotlin.collections.CollectionsKt.listOf(error));
        setResult(0);
        com.miteksystems.misnap.core.MibiData.setSessionOwner(null);
        finish();
        androidx.view.OnBackPressedDispatcher onBackPressedDispatcher2 = getOnBackPressedDispatcher();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher2, "");
        androidx.view.OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher2, this, false, new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.i(), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowActivity$Result;", "", "<init>", "()V", "", "clearResults", "", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result;", "<set-?>", "a", "Ljava/util/List;", "getResults", "()Ljava/util/List;", "setResults$workflow_release", "(Ljava/util/List;)V", "results"}, k = 1, mv = {1, 8, 0})
    public static final class Result {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private static java.util.List<? extends com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result> results = kotlin.collections.CollectionsKt.emptyList();

        public final /* synthetic */ void setResults$workflow_release(java.util.List list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            results = list;
        }

        public final java.util.List<com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result> getResults() {
            return results;
        }

        public final void clearResults() {
            results = kotlin.collections.CollectionsKt.emptyList();
        }

        private Result() {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000e\"\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowActivity$Companion;", "", "()V", "ORIENTATION_KEY", "", "WORKFLOW_ACTIVITY_DISABLE_SCREENSHOTS", "WORKFLOW_ACTIVITY_SETTINGS", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "misnapWorkflowStep", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;", "misnapWorkflowSteps", "", "disableScreenshots", "", "(Landroid/content/Context;Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;[Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;Z)Landroid/content/Intent;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final android.content.Intent buildIntent(android.content.Context context, com.miteksystems.misnap.workflow.MiSnapWorkflowStep misnapWorkflowStep, com.miteksystems.misnap.workflow.MiSnapWorkflowStep[] misnapWorkflowSteps, boolean disableScreenshots) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(misnapWorkflowStep, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(misnapWorkflowSteps, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.class);
            java.util.List<com.miteksystems.misnap.workflow.MiSnapWorkflowStep> mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(misnapWorkflowStep);
            kotlin.collections.CollectionsKt.addAll(mutableListOf, misnapWorkflowSteps);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(mutableListOf, 10));
            for (com.miteksystems.misnap.workflow.MiSnapWorkflowStep miSnapWorkflowStep : mutableListOf) {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                arrayList.add(companion.encodeToString(com.miteksystems.misnap.workflow.MiSnapWorkflowStep.INSTANCE.serializer(), miSnapWorkflowStep));
            }
            intent.putExtra(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.WORKFLOW_ACTIVITY_SETTINGS, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            intent.putExtra("WORKFLOW_ACTIVITY_DISABLE_SCREENSHOTS", disableScreenshots);
            return intent;
        }

        public static /* synthetic */ android.content.Intent buildIntent$default(com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Companion companion, android.content.Context context, com.miteksystems.misnap.workflow.MiSnapWorkflowStep miSnapWorkflowStep, com.miteksystems.misnap.workflow.MiSnapWorkflowStep[] miSnapWorkflowStepArr, boolean z, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = true;
            }
            return companion.buildIntent(context, miSnapWorkflowStep, miSnapWorkflowStepArr, z);
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.content.Intent buildIntent(android.content.Context context, com.miteksystems.misnap.workflow.MiSnapWorkflowStep miSnapWorkflowStep, com.miteksystems.misnap.workflow.MiSnapWorkflowStep[] miSnapWorkflowStepArr, boolean z) {
        return INSTANCE.buildIntent(context, miSnapWorkflowStep, miSnapWorkflowStepArr, z);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4145a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.VOICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f4145a = iArr;
        }
    }
}
