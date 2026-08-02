package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0003&\u0015'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u001d\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0015\u0010%\u001a\u00020\u00068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010!"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "p0", "Camera2StreamConfigurationMap", "(Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/m;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/m;", "binding", "", "Z", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "getHighSpeedVideoSizes", "", "Lkotlin/Lazy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRanges", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VoicePhraseSelectionFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoicePhraseSelectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$Companion;", "", "()V", "HANDLE_ORIENTATION", "", "LOG_TAG", "ORIENTATION_KEY", "buildFragmentArguments", "Landroid/os/Bundle;", "handleOrientation", "", "(Ljava/lang/Boolean;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Boolean;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings(handleOrientation).toString();
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings getDefaultWorkflowSettings() {
            return new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings(java.lang.Boolean.TRUE);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.Companion companion, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            return companion.buildWorkflowSettings(bool);
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.Companion companion, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            return companion.buildFragmentArguments(bool);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;", "", "", "handleOrientation", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getHandleOrientation", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings.Companion(null);

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
            return (other instanceof com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, ((com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings) other).handleOrientation);
        }

        public final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings copy(java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings(handleOrientation);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.handleOrientation != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.handleOrientation);
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings workflowSettings, java.lang.Boolean bool, int i, java.lang.Object obj) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel p0) {
        try {
            androidx.view.fragment.FragmentKt.findNavController(this).navigate(com.miteksystems.misnap.workflow.R.id.navigateContinue);
        } catch (java.lang.Exception e) {
            p0.postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.class, hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.VoicePhraseSelection.NavigateContinue.INSTANCE));
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.m> {
        public static final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.b getHighSpeedVideoFpsRanges = new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.m invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.m.a(view2);
        }

        b() {
            super(1, com.miteksystems.misnap.workflow.a.m.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoicePhraseSelectionBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        d() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$a$a;", "Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment;", "", "", "p0", "<init>", "(Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment;Ljava/util/List;)V", "", "getItemCount", "()I", "Camera2StreamConfigurationMap", "Ljava/util/List;", "a"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes10.dex */
    final class a extends androidx.recyclerview.widget.RecyclerView.Adapter<com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a> {
        private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$a$a;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/miteksystems/misnap/workflow/a/p;", "binding", "<init>", "(Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$a;Lcom/miteksystems/misnap/workflow/a/p;)V", "", "item", "", "a", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lcom/miteksystems/misnap/workflow/a/p;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$a$a, reason: collision with other inner class name */
        public final class C0098a extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final /* synthetic */ com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a getHighSpeedVideoFpsRangesFor;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final com.miteksystems.misnap.workflow.a.p getHighSpeedVideoFpsRanges;

            public final void a(java.lang.String item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                this.getHighSpeedVideoFpsRanges.b.setText(item);
            }

            public static /* synthetic */ void $r8$lambda$T8jfH_UOkDKNcnUyDLeEMMKXhf8(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment, com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a c0098a, android.view.View view) {
                com.miteksystems.misnap.core.MiSnapSettings.Voice voice;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicePhraseSelectionFragment, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0098a, "");
                com.miteksystems.misnap.core.MiSnapSettings value = com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.access$getMisnapWorkflowViewModel(voicePhraseSelectionFragment).getSettings().getValue();
                if (value == null || (voice = value.voice) == null) {
                    return;
                }
                voice.setPhrase(c0098a.getHighSpeedVideoFpsRanges.b.getText().toString());
                if (voice.getCom.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW java.lang.String() != null) {
                    voicePhraseSelectionFragment.Camera2StreamConfigurationMap(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.access$getMisnapWorkflowViewModel(voicePhraseSelectionFragment));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0098a(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a aVar, com.miteksystems.misnap.workflow.a.p pVar) {
                super(pVar.getRoot());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "");
                this.getHighSpeedVideoFpsRangesFor = aVar;
                this.getHighSpeedVideoFpsRanges = pVar;
                android.widget.FrameLayout root = pVar.getRoot();
                final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment = aVar.getHighSpeedVideoSizes;
                root.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$a$a$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a.$r8$lambda$T8jfH_UOkDKNcnUyDLeEMMKXhf8(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.this, this, view);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ void onBindViewHolder(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a c0098a, int i) {
            com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a c0098a2 = c0098a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0098a2, "");
            c0098a2.a(this.Camera2StreamConfigurationMap.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
            com.miteksystems.misnap.workflow.a.p a2 = com.miteksystems.misnap.workflow.a.p.a(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
            com.google.android.material.textview.MaterialTextView materialTextView = a2.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialTextView, "");
            accessibilityUtil.adjustScalingForAccessibility$workflow_release(materialTextView);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
            return new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a.C0098a(this, a2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.Camera2StreamConfigurationMap.size();
        }

        public a(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment, java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoSizes = voicePhraseSelectionFragment;
            this.Camera2StreamConfigurationMap = list;
        }
    }

    public static /* synthetic */ void $r8$lambda$wSxLVC9L0tD0wzcqoXEUJSI8Veo(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicePhraseSelectionFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) voicePhraseSelectionFragment.getHighResolutionOutputSizeshNQ4ISI.getValue())) {
            return;
        }
        voicePhraseSelectionFragment.getHighResolutionOutputSizeshNQ4ISI();
    }

    public static final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel access$getMisnapWorkflowViewModel(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment) {
        return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) voicePhraseSelectionFragment.getHighSpeedVideoFpsRanges.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        java.lang.Boolean b2;
        int intValue;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("orientationKey")) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
        }
        com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoFpsRanges.getValue()).getSettings().getValue();
        androidx.recyclerview.widget.RecyclerView recyclerView = null;
        r6 = null;
        java.lang.Object obj = null;
        if (value != null) {
            java.lang.String str2 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (str2 != null && (str = value.workflow.get(str2)) != null) {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings().getHandleOrientation();
            }
            if (b2 != null) {
                this.Camera2StreamConfigurationMap = b2.booleanValue();
            }
            if (this.Camera2StreamConfigurationMap) {
                try {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    androidx.view.fragment.FragmentKt.findNavController(this).addOnDestinationChangedListener(this.getHighSpeedVideoFpsRangesFor);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(value.workflow, value.getUseCase());
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            if (value.voice.getCom.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW java.lang.String() == null) {
                com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoFpsRanges.getValue();
                android.content.Context requireContext = requireContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
                miSnapWorkflowViewModel.postError$workflow_release(requireContext, new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason.Flow));
            }
            java.lang.String phrase = value.voice.getPhrase();
            if (phrase != null && phrase.length() != 0) {
                Camera2StreamConfigurationMap((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoFpsRanges.getValue());
            } else if (value.voice.getCom.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW java.lang.String() == com.miteksystems.misnap.core.MiSnapSettings.Voice.Flow.VERIFICATION) {
                com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoFpsRanges.getValue();
                android.content.Context requireContext2 = requireContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
                miSnapWorkflowViewModel2.postError$workflow_release(requireContext2, new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason.Phrase));
            }
            recyclerView = getBinding$workflow_release().g;
            java.lang.String[] stringArray = recyclerView.getResources().getStringArray(com.miteksystems.misnap.workflow.R.array.misnapWorkflowVoicePhraseSelectionFragmentPhrases);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringArray, "");
            recyclerView.setAdapter(new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.a(this, kotlin.collections.ArraysKt.asList(stringArray)));
            recyclerView.addItemDecoration(new androidx.recyclerview.widget.DividerItemDecoration(recyclerView.getContext(), 1));
        }
        if (recyclerView == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel3 = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoFpsRanges.getValue();
            android.content.Context requireContext3 = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext3, "");
            miSnapWorkflowViewModel3.postError$workflow_release(requireContext3, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
        com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
        com.google.android.material.textview.MaterialTextView materialTextView = getBinding$workflow_release().f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        accessibilityUtil.adjustScalingForAccessibility$workflow_release(materialTextView);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.lang.Integer num = this.getHighSpeedVideoSizes;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.Camera2StreamConfigurationMap) {
            try {
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.getHighSpeedVideoFpsRangesFor);
            } catch (java.lang.Exception unused) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.m getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.m) this.binding.getValue2((androidx.fragment.app.Fragment) this, getHighSpeedVideoFpsRanges[0]);
    }

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.getHighSpeedVideoSizes) == null) {
            return;
        }
        requireActivity().setRequestedOrientation(num.intValue());
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.String invoke() {
            java.lang.Object m23436constructorimpl;
            java.lang.CharSequence label;
            com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment voicePhraseSelectionFragment = com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(voicePhraseSelectionFragment).getCurrentDestination();
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

    public VoicePhraseSelectionFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_voice_phrase_selection);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.b.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap = true;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.c());
        this.getHighSpeedVideoFpsRangesFor = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment$$ExternalSyntheticLambda0
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.$r8$lambda$wSxLVC9L0tD0wzcqoXEUJSI8Veo(com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.this, navController, navDestination, bundle);
            }
        };
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.VoicePhraseSelectionFragment.d());
    }
}
