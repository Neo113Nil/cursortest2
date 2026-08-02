package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\u0017\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0015\u0010'\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010 R\u001a\u0010-\u001a\u00020(8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "Camera2StreamConfigurationMap", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/l;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/l;", "binding", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "", "Ljava/lang/Integer;", "Lcom/miteksystems/misnap/core/MibiData$Session;", "getHighSpeedVideoFpsRangesFor", "Lcom/miteksystems/misnap/core/MibiData$Session;", "", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "getOutputFormats", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", "Landroidx/activity/OnBackPressedCallback;", "h", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback$workflow_release", "()Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReviewFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    private java.lang.Integer Camera2StreamConfigurationMap;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private final com.miteksystems.misnap.core.MibiData.Session getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: h, reason: from kotlin metadata */
    private final /* synthetic */ androidx.view.OnBackPressedCallback onBackPressedCallback;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.ReviewFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentReviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.ReviewFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.ReviewFragment.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$Companion;", "", "()V", "HANDLE_ORIENTATION", "", "LOG_TAG", "ORIENTATION_KEY", "buildFragmentArguments", "Landroid/os/Bundle;", "handleOrientation", "", "(Ljava/lang/Boolean;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Boolean;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments() {
            return buildFragmentArguments$default(this, null, 1, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings() {
            return buildWorkflowSettings$default(this, null, 1, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Boolean handleOrientation) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (handleOrientation != null) {
                bundle.putBoolean("handleOrientation", handleOrientation.booleanValue());
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings(handleOrientation).toString();
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings getDefaultWorkflowSettings() {
            return new com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings(java.lang.Boolean.TRUE);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.ReviewFragment.Companion companion, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            return companion.buildWorkflowSettings(bool);
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.ReviewFragment.Companion companion, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            return companion.buildFragmentArguments(bool);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;", "", "", "handleOrientation", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getHandleOrientation", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.Boolean handleOrientation;

        /* JADX WARN: Multi-variable type inference failed */
        public WorkflowSettings() {
            this((java.lang.Boolean) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ WorkflowSettings(int i, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.handleOrientation = null;
            } else {
                this.handleOrientation = bool;
            }
        }

        public WorkflowSettings(java.lang.Boolean bool) {
            this.handleOrientation = bool;
        }

        public /* synthetic */ WorkflowSettings(java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final java.lang.String toString() {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return companion.encodeToString(INSTANCE.serializer(), this);
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.handleOrientation;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, ((com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings) other).handleOrientation);
        }

        public final com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings copy(java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings(handleOrientation);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.ReviewFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.handleOrientation != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.handleOrientation);
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings workflowSettings, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = workflowSettings.handleOrientation;
            }
            return workflowSettings.copy(bool);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments() {
        return INSTANCE.buildFragmentArguments();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings() {
        return INSTANCE.buildWorkflowSettings();
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Boolean bool) {
        return INSTANCE.buildFragmentArguments(bool);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Boolean bool) {
        return INSTANCE.buildWorkflowSettings(bool);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.l> {
        public static final com.miteksystems.misnap.workflow.fragment.ReviewFragment.b getHighSpeedVideoFpsRanges = new com.miteksystems.misnap.workflow.fragment.ReviewFragment.b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.l invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.l.a(view2);
        }

        b() {
            super(1, com.miteksystems.misnap.workflow.a.l.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentReviewBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.ReviewFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        d() {
            super(0);
        }
    }

    public static /* synthetic */ void $r8$lambda$72tFy7w5Sh_neDwfgATWRe0F_E8(com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewFragment, "");
        reviewFragment.onBackPressedCallback.setEnabled(false);
        reviewFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public static /* synthetic */ void $r8$lambda$HJV5N_zAaFlqs2XhQth6NH_Hf4w(com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewFragment, "");
        com.miteksystems.misnap.core.MibiData.Session session = reviewFragment.getHighSpeedVideoFpsRangesFor;
        session.addUxpEvent("SRFRA", new java.lang.String[0]);
        session.reset(true);
        try {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).setReviewFinalResult(null);
            androidx.view.fragment.FragmentKt.findNavController(reviewFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateRetake);
        } catch (java.lang.Exception e2) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.ReviewFragment.class, reviewFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateRetake.INSTANCE));
        }
    }

    public static /* synthetic */ void $r8$lambda$iuCEAkIGInCedAnn3XRNfWWAl9Y(com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) reviewFragment.getHighSpeedVideoSizes.getValue())) {
            return;
        }
        reviewFragment.Camera2StreamConfigurationMap();
    }

    /* renamed from: $r8$lambda$q1QVYqZq-RR7fLEyfsVRHylmgKE, reason: not valid java name */
    public static /* synthetic */ void m10957$r8$lambda$q1QVYqZqRR7fLEyfsVRHylmgKE(com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewFragment, "");
        try {
            com.miteksystems.misnap.workflow.MiSnapFinalResult reviewFinalResult = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).getReviewFinalResult();
            if (reviewFinalResult != null) {
                ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).setReviewFinalResult(null);
                ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).postResults$workflow_release(reviewFinalResult);
            }
            androidx.view.fragment.FragmentKt.findNavController(reviewFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateSatisfied);
        } catch (java.lang.Exception e2) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) reviewFragment.getInputSizeshNQ4ISI.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.ReviewFragment.class, reviewFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateSatisfied.INSTANCE));
        }
    }

    public static final /* synthetic */ void access$showExitConfirmationDialog(final com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment) {
        new com.google.android.material.dialog.MaterialAlertDialogBuilder(reviewFragment.requireContext(), com.miteksystems.misnap.workflow.R.style.MiSnapTheme_Dialog).setTitle(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle).setMessage(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage).setPositiveButton(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, new android.content.DialogInterface.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.miteksystems.misnap.workflow.fragment.ReviewFragment.$r8$lambda$72tFy7w5Sh_neDwfgATWRe0F_E8(com.miteksystems.misnap.workflow.fragment.ReviewFragment.this, dialogInterface, i);
            }
        }).setNegativeButton(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, new android.content.DialogInterface.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setCancelable(true).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        int i;
        java.lang.Boolean b2;
        int intValue;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("orientationKey")) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
        }
        com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getInputSizeshNQ4ISI.getValue()).getSettings().getValue();
        java.lang.Object obj = null;
        if (value != null) {
            switch (com.miteksystems.misnap.workflow.fragment.ReviewFragment.a.f4206a[value.getUseCase().ordinal()]) {
                case 1:
                case 2:
                    i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowReviewFragmentCheckPreviewContentDescription;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowReviewFragmentDocumentPreviewContentDescription;
                    break;
                case 7:
                    i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowReviewFragmentBarcodePreviewContentDescription;
                    break;
                case 8:
                    i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowReviewFragmentSelfiePreviewContentDescription;
                    break;
                case 9:
                case 10:
                    i = 0;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            if (i != 0) {
                getBinding$workflow_release().l.setContentDescription(getString(i));
            }
            if (com.miteksystems.misnap.workflow.WorkflowSettings.shouldShowExitConfirmationDialog(value.workflow, value.getUseCase())) {
                requireActivity().getOnBackPressedDispatcher().addCallback(requireActivity(), this.onBackPressedCallback);
            }
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoSizes.getValue();
            if (str2 != null && (str = value.workflow.get(str2)) != null) {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings().getHandleOrientation();
            }
            if (b2 != null) {
                this.getHighSpeedVideoFpsRanges = b2.booleanValue();
            }
            if (this.getHighSpeedVideoFpsRanges) {
                try {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    androidx.view.fragment.FragmentKt.findNavController(this).addOnDestinationChangedListener(this.getHighResolutionOutputSizeshNQ4ISI);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(value.workflow, value.getUseCase());
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            getBinding$workflow_release().f4156o.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.ReviewFragment.m10957$r8$lambda$q1QVYqZqRR7fLEyfsVRHylmgKE(com.miteksystems.misnap.workflow.fragment.ReviewFragment.this, view2);
                }
            });
            getBinding$workflow_release().m.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.ReviewFragment.$r8$lambda$HJV5N_zAaFlqs2XhQth6NH_Hf4w(com.miteksystems.misnap.workflow.fragment.ReviewFragment.this, view2);
                }
            });
            com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
            com.google.android.material.textview.MaterialTextView materialTextView = getBinding$workflow_release().n;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialTextView, "");
            accessibilityUtil.adjustScalingForAccessibility$workflow_release(materialTextView);
            obj = kotlin.Unit.INSTANCE;
        }
        if (obj == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getInputSizeshNQ4ISI.getValue();
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
        com.miteksystems.misnap.workflow.MiSnapFinalResult reviewFinalResult = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getInputSizeshNQ4ISI.getValue()).getReviewFinalResult();
        if (reviewFinalResult != null) {
            if (reviewFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession) {
                byte[] jpegImage = ((com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession) reviewFinalResult).getJpegImage();
                getBinding$workflow_release().l.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(jpegImage, 0, jpegImage.length));
            } else if (reviewFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) {
                byte[] jpegImage2 = ((com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) reviewFinalResult).getJpegImage();
                getBinding$workflow_release().l.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(jpegImage2, 0, jpegImage2.length));
            } else if (reviewFinalResult instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession) {
                byte[] jpegImage3 = ((com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession) reviewFinalResult).getJpegImage();
                getBinding$workflow_release().l.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(jpegImage3, 0, jpegImage3.length));
            }
        }
        com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil2 = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
        android.content.Context requireContext2 = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
        if (accessibilityUtil2.isScreenReaderEnabled(requireContext2)) {
            getBinding$workflow_release().n.sendAccessibilityEvent(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.onBackPressedCallback.remove();
        if (this.getHighSpeedVideoFpsRanges) {
            try {
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (java.lang.Exception unused) {
                Camera2StreamConfigurationMap();
            }
        }
    }

    /* renamed from: getOnBackPressedCallback$workflow_release, reason: from getter */
    public final androidx.view.OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.l getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.l) this.binding.getValue2((androidx.fragment.app.Fragment) this, getHighSpeedVideoSizes[0]);
    }

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.workflow.fragment.ReviewFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.String invoke() {
            java.lang.Object m23436constructorimpl;
            java.lang.CharSequence label;
            com.miteksystems.misnap.workflow.fragment.ReviewFragment reviewFragment = com.miteksystems.misnap.workflow.fragment.ReviewFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(reviewFragment).getCurrentDestination();
                m23436constructorimpl = kotlin.Result.m23436constructorimpl((currentDestination == null || (label = currentDestination.getLabel()) == null) ? null : label.toString());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/ReviewFragment$e;", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "()V"}, k = 1, mv = {1, 8, 0})
    public static final class e extends androidx.view.OnBackPressedCallback {
        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            com.miteksystems.misnap.workflow.fragment.ReviewFragment.access$showExitConfirmationDialog(com.miteksystems.misnap.workflow.fragment.ReviewFragment.this);
        }

        e() {
            super(true);
        }
    }

    private final void Camera2StreamConfigurationMap() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.Camera2StreamConfigurationMap) == null) {
            return;
        }
        requireActivity().setRequestedOrientation(num.intValue());
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4206a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.GENERIC_DOCUMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.VOICE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            f4206a = iArr;
        }
    }

    public ReviewFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_review);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.ReviewFragment.b.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoFpsRangesFor = com.miteksystems.misnap.core.MibiData.INSTANCE.bindSession();
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.ReviewFragment.c());
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.ReviewFragment$$ExternalSyntheticLambda4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.ReviewFragment.$r8$lambda$iuCEAkIGInCedAnn3XRNfWWAl9Y(com.miteksystems.misnap.workflow.fragment.ReviewFragment.this, navController, navDestination, bundle);
            }
        };
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.ReviewFragment.d());
        this.onBackPressedCallback = new com.miteksystems.misnap.workflow.fragment.ReviewFragment.e();
    }
}
