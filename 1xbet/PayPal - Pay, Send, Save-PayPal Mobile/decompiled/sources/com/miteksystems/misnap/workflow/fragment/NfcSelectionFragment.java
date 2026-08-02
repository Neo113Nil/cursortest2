package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0017\u0010\"\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0005\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0015\u0010\u001c\u001a\u00020\u00068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010!"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "getHighSpeedVideoSizes", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/k;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/k;", "binding", "", "Camera2StreamConfigurationMap", "Z", "", "Ljava/lang/Integer;", "", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "getInputFormats", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NfcSelectionFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    public static final java.lang.String SHOW_SKIP_BUTTON = "showSkipButton";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;
    private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcSelectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$Companion;", "", "()V", "HANDLE_ORIENTATION", "", "LOG_TAG", "ORIENTATION_KEY", "SHOW_SKIP_BUTTON", "buildFragmentArguments", "Landroid/os/Bundle;", "showSkipButton", "", "handleOrientation", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments() {
            return buildFragmentArguments$default(this, null, null, 3, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings() {
            return buildWorkflowSettings$default(this, null, null, 3, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Boolean bool) {
            return buildFragmentArguments$default(this, bool, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Boolean bool) {
            return buildWorkflowSettings$default(this, bool, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (showSkipButton != null) {
                bundle.putBoolean("showSkipButton", showSkipButton.booleanValue());
            }
            if (handleOrientation != null) {
                bundle.putBoolean("handleOrientation", handleOrientation.booleanValue());
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings(showSkipButton, handleOrientation).toString();
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings getDefaultWorkflowSettings() {
            return new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.Companion companion, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                bool2 = null;
            }
            return companion.buildWorkflowSettings(bool, bool2);
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.Companion companion, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                bool2 = null;
            }
            return companion.buildFragmentArguments(bool, bool2);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0018"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;", "", "", "showSkipButton", "handleOrientation", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getShowSkipButton", util.h.xy.cb.b.f1091, "getHandleOrientation", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.Boolean showSkipButton;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.Boolean handleOrientation;

        /* JADX WARN: Multi-variable type inference failed */
        public WorkflowSettings() {
            this((java.lang.Boolean) null, (java.lang.Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ WorkflowSettings(int i, java.lang.Boolean bool, java.lang.Boolean bool2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.showSkipButton = null;
            } else {
                this.showSkipButton = bool;
            }
            if ((i & 2) == 0) {
                this.handleOrientation = null;
            } else {
                this.handleOrientation = bool2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WorkflowSettings(java.lang.Boolean bool) {
            this(bool, (java.lang.Boolean) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public WorkflowSettings(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.showSkipButton = bool;
            this.handleOrientation = bool2;
        }

        public /* synthetic */ WorkflowSettings(java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
        }

        public final java.lang.String toString() {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return companion.encodeToString(INSTANCE.serializer(), this);
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.showSkipButton;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.handleOrientation;
            return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final java.lang.Boolean getShowSkipButton() {
            return this.showSkipButton;
        }

        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings)) {
                return false;
            }
            com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.showSkipButton, workflowSettings.showSkipButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, workflowSettings.handleOrientation);
        }

        public final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings copy(java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings(showSkipButton, handleOrientation);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getShowSkipButton() {
            return this.showSkipButton;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showSkipButton != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showSkipButton);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.handleOrientation != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.handleOrientation);
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings workflowSettings, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = workflowSettings.showSkipButton;
            }
            if ((i & 2) != 0) {
                bool2 = workflowSettings.handleOrientation;
            }
            return workflowSettings.copy(bool, bool2);
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

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildFragmentArguments(bool, bool2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildWorkflowSettings(bool, bool2);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel p0) {
        try {
            androidx.view.fragment.FragmentKt.findNavController(this).navigate(com.miteksystems.misnap.workflow.R.id.navigateMrzDataManualEntry);
        } catch (java.lang.Exception e) {
            p0.postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.class, hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrzDataManualEntry.INSTANCE));
        }
    }

    private final void getHighSpeedVideoSizes() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            return;
        }
        requireActivity().setRequestedOrientation(num.intValue());
    }

    private final void getHighSpeedVideoFpsRangesFor(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel p0) {
        try {
            androidx.view.fragment.FragmentKt.findNavController(this).navigate(com.miteksystems.misnap.workflow.R.id.navigateMrz1LineManualEntry);
        } catch (java.lang.Exception e) {
            p0.postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.class, hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrz1LineManualEntry.INSTANCE));
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.k> {
        public static final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.b getHighResolutionOutputSizeshNQ4ISI = new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.k invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.k.a(view2);
        }

        b() {
            super(1, com.miteksystems.misnap.workflow.a.k.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcSelectionBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        d() {
            super(0);
        }
    }

    /* renamed from: $r8$lambda$BK3rAnxYpHPN3W_Tv-k6MS4n3Ic, reason: not valid java name */
    public static /* synthetic */ void m10954$r8$lambda$BK3rAnxYpHPN3W_Tvk6MS4n3Ic(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcSelectionFragment, "");
        miSnapSettings.nfc.advanced.setDocType(com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.ID);
        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue()).updateState$workflow_release(miSnapSettings);
        nfcSelectionFragment.getHighResolutionOutputSizeshNQ4ISI((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue());
    }

    /* renamed from: $r8$lambda$NOIGy6Vq4haYOy8Kn2vWb-A6VSo, reason: not valid java name */
    public static /* synthetic */ void m10955$r8$lambda$NOIGy6Vq4haYOy8Kn2vWbA6VSo(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcSelectionFragment, "");
        miSnapSettings.nfc.advanced.setDocType(com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.PASSPORT);
        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue()).updateState$workflow_release(miSnapSettings);
        nfcSelectionFragment.getHighResolutionOutputSizeshNQ4ISI((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue());
    }

    public static /* synthetic */ void $r8$lambda$hqwwzs7pq7rb3DwhpRDPptwVtxI(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcSelectionFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) nfcSelectionFragment.getHighSpeedVideoFpsRanges.getValue())) {
            return;
        }
        nfcSelectionFragment.getHighSpeedVideoSizes();
    }

    public static /* synthetic */ void $r8$lambda$nVlxciIueN3gchiBH6jQEBJJcSk(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcSelectionFragment, "");
        miSnapSettings.nfc.advanced.setDocType(com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.EU_DL);
        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue()).updateState$workflow_release(miSnapSettings);
        nfcSelectionFragment.getHighSpeedVideoFpsRangesFor((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue());
    }

    public static /* synthetic */ void $r8$lambda$r7jIbL_0r25LqZGufypCOqsZIAA(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcSelectionFragment, "");
        try {
            androidx.view.fragment.FragmentKt.findNavController(nfcSelectionFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateSkip);
        } catch (java.lang.Exception e) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.class, nfcSelectionFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateSkip.INSTANCE));
        }
        com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcSelectionFragment.Camera2StreamConfigurationMap.getValue();
        android.content.Context requireContext = nfcSelectionFragment.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        java.lang.Object obj;
        java.lang.Boolean b2;
        int intValue;
        java.lang.Boolean b3;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("orientationKey")) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
        }
        final com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue()).getSettings().getValue();
        java.lang.Object obj2 = null;
        if (value != null) {
            java.lang.String str3 = (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue();
            if (str3 == null || (str2 = value.workflow.get(str3)) == null) {
                obj = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings.INSTANCE.serializer(), str2);
            }
            com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings().getHandleOrientation();
            }
            if (b2 != null) {
                this.getHighSpeedVideoFpsRangesFor = b2.booleanValue();
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                try {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    androidx.view.fragment.FragmentKt.findNavController(this).addOnDestinationChangedListener(this.getHighSpeedVideoSizes);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(value.workflow, value.getUseCase());
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            com.miteksystems.misnap.core.Mrz mrz = value.nfc.getCom.miteksystems.misnap.core.MiSnapSettings.KEY_NFC_MRZ java.lang.String();
            if (mrz != null && com.miteksystems.misnap.core.ValidationUtil.isValidMrz(mrz)) {
                com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue();
                try {
                    androidx.view.fragment.FragmentKt.findNavController(this).navigate(com.miteksystems.misnap.workflow.R.id.navigateNfc);
                } catch (java.lang.Exception e) {
                    miSnapWorkflowViewModel.postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.class, hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateNfc.INSTANCE));
                }
            }
            com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType docType = value.nfc.advanced.getDocType();
            if (docType != null) {
                int i = com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.a.f4203a[docType.ordinal()];
                if (i == 1 || i == 2) {
                    getHighResolutionOutputSizeshNQ4ISI((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue());
                } else if (i == 3) {
                    getHighSpeedVideoFpsRangesFor((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue());
                }
            }
            java.lang.String str4 = (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue();
            if (str4 != null && (str = value.workflow.get(str4)) != null) {
                kotlinx.serialization.json.Json.Companion companion4 = kotlinx.serialization.json.Json.INSTANCE;
                companion4.getSerializersModule();
                obj2 = companion4.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings workflowSettings2 = (com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b3 = workflowSettings2.getShowSkipButton()) == null) && (b3 = com.miteksystems.misnap.workflow.a.s.b("showSkipButton", getArguments())) == null) {
                b3 = INSTANCE.getDefaultWorkflowSettings().getShowSkipButton();
            }
            if (b3 != null && b3.booleanValue()) {
                com.google.android.material.button.MaterialButton materialButton = getBinding$workflow_release().e;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.$r8$lambda$r7jIbL_0r25LqZGufypCOqsZIAA(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.this, view2);
                    }
                });
            }
            getBinding$workflow_release().c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.m10954$r8$lambda$BK3rAnxYpHPN3W_Tvk6MS4n3Ic(com.miteksystems.misnap.core.MiSnapSettings.this, this, view2);
                }
            });
            getBinding$workflow_release().b.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.$r8$lambda$nVlxciIueN3gchiBH6jQEBJJcSk(com.miteksystems.misnap.core.MiSnapSettings.this, this, view2);
                }
            });
            getBinding$workflow_release().d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.m10955$r8$lambda$NOIGy6Vq4haYOy8Kn2vWbA6VSo(com.miteksystems.misnap.core.MiSnapSettings.this, this, view2);
                }
            });
            obj2 = kotlin.Unit.INSTANCE;
        }
        if (obj2 == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue();
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            miSnapWorkflowViewModel2.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.getHighSpeedVideoFpsRangesFor) {
            try {
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.getHighSpeedVideoSizes);
            } catch (java.lang.Exception unused) {
                getHighSpeedVideoSizes();
            }
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.k getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.k) this.binding.getValue2((androidx.fragment.app.Fragment) this, getHighSpeedVideoFpsRanges[0]);
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.String invoke() {
            java.lang.Object m23436constructorimpl;
            java.lang.CharSequence label;
            com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment nfcSelectionFragment = com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(nfcSelectionFragment).getCurrentDestination();
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

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4203a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.PASSPORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.EU_DL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f4203a = iArr;
        }
    }

    public NfcSelectionFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_nfc_selection);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.b.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.c());
        this.getHighSpeedVideoSizes = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.$r8$lambda$hqwwzs7pq7rb3DwhpRDPptwVtxI(com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.this, navController, navDestination, bundle);
            }
        };
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment.d());
    }
}
