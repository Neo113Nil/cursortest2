package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u000223B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u001b\u0010\u001c\u001a\u00020\u00178AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0017\u0010\u001f\u001a\u0004\u0018\u00010\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0015\u0010(\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010&R\u001a\u00101\u001a\u00020,8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "getHighSpeedVideoFpsRangesFor", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "p0", "", "p1", "", "Camera2StreamConfigurationMap", "(Lcom/miteksystems/misnap/core/MiSnapSettings;Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/f;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/f;", "binding", "", "Lcom/miteksystems/misnap/core/UserAction;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes", "", "Z", "Ljava/lang/Integer;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "getOutputFormats", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "getHighSpeedVideoSizesFor", "Landroidx/activity/OnBackPressedCallback;", "h", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback$workflow_release", "()Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FailoverFragment extends androidx.fragment.app.Fragment {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.FailoverFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFailoverBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.FailoverFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.FailoverFragment.Companion(null);
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    public static final java.lang.String HEADER_LAYOUT_ID = "headerLayoutId";
    public static final java.lang.String MAX_REASONS = "maxReasons";
    public static final java.lang.String MIN_REASON_PERCENTAGE = "minReasonPercentage";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<? extends com.miteksystems.misnap.core.UserAction> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener Camera2StreamConfigurationMap;

    /* renamed from: h, reason: from kotlin metadata */
    private final /* synthetic */ androidx.view.OnBackPressedCallback onBackPressedCallback;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0013J=\u0010\u0014\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$Companion;", "", "()V", "FAILOVER_REASONS_LIST_STATE_KEY", "", "HANDLE_ORIENTATION", "HEADER_LAYOUT_ID", "LOG_TAG", "MAX_REASONS", "MIN_REASON_PERCENTAGE", "ORIENTATION_KEY", "buildFragmentArguments", "Landroid/os/Bundle;", com.miteksystems.misnap.workflow.fragment.FailoverFragment.HEADER_LAYOUT_ID, "", "handleOrientation", "", com.miteksystems.misnap.workflow.fragment.FailoverFragment.MAX_REASONS, com.miteksystems.misnap.workflow.fragment.FailoverFragment.MIN_REASON_PERCENTAGE, "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;", "settings", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments() {
            return buildFragmentArguments$default(this, null, null, null, null, 15, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings() {
            return buildWorkflowSettings$default(this, null, null, null, null, 15, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings getDefaultWorkflowSettings() {
            return getDefaultWorkflowSettings$default(this, null, 1, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer num) {
            return buildFragmentArguments$default(this, num, null, null, null, 14, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer num) {
            return buildWorkflowSettings$default(this, num, null, null, null, 14, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings settings) {
            return new com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings(java.lang.Integer.valueOf((settings != null ? settings.getUseCase() : null) == com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE ? com.miteksystems.misnap.workflow.R.layout.misnap_failover_header_face : com.miteksystems.misnap.workflow.R.layout.misnap_failover_header_document), java.lang.Boolean.TRUE, 2, 25);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool) {
            return buildFragmentArguments$default(this, num, bool, null, null, 12, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool) {
            return buildWorkflowSettings$default(this, num, bool, null, null, 12, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
            return buildFragmentArguments$default(this, num, bool, num2, null, 8, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
            return buildWorkflowSettings$default(this, num, bool, num2, null, 8, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer headerLayoutId, java.lang.Boolean handleOrientation, java.lang.Integer maxReasons, java.lang.Integer minReasonPercentage) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (headerLayoutId != null) {
                bundle.putInt(com.miteksystems.misnap.workflow.fragment.FailoverFragment.HEADER_LAYOUT_ID, headerLayoutId.intValue());
            }
            if (handleOrientation != null) {
                bundle.putBoolean("handleOrientation", handleOrientation.booleanValue());
            }
            if (maxReasons != null) {
                bundle.putInt(com.miteksystems.misnap.workflow.fragment.FailoverFragment.MAX_REASONS, maxReasons.intValue());
            }
            if (minReasonPercentage != null) {
                bundle.putInt(com.miteksystems.misnap.workflow.fragment.FailoverFragment.MIN_REASON_PERCENTAGE, minReasonPercentage.intValue());
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer headerLayoutId, java.lang.Boolean handleOrientation, java.lang.Integer maxReasons, java.lang.Integer minReasonPercentage) {
            return new com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings(headerLayoutId, handleOrientation, maxReasons, minReasonPercentage).toString();
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings getDefaultWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.FailoverFragment.Companion companion, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                miSnapSettings = null;
            }
            return companion.getDefaultWorkflowSettings(miSnapSettings);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.FailoverFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            if ((i & 8) != 0) {
                num3 = null;
            }
            return companion.buildWorkflowSettings(num, bool, num2, num3);
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.FailoverFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            if ((i & 8) != 0) {
                num3 = null;
            }
            return companion.buildFragmentArguments(num, bool, num2, num3);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;", "", "", com.miteksystems.misnap.workflow.fragment.FailoverFragment.HEADER_LAYOUT_ID, "", "handleOrientation", com.miteksystems.misnap.workflow.fragment.FailoverFragment.MAX_REASONS, com.miteksystems.misnap.workflow.fragment.FailoverFragment.MIN_REASON_PERCENTAGE, "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getHeaderLayoutId", util.h.xy.cb.b.f1091, "Ljava/lang/Boolean;", "getHandleOrientation", "c", "getMaxReasons", "d", "getMinReasonPercentage", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.Integer headerLayoutId;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.Boolean handleOrientation;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.lang.Integer maxReasons;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.lang.Integer minReasonPercentage;

        public WorkflowSettings() {
            this((java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ WorkflowSettings(int i, java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.headerLayoutId = null;
            } else {
                this.headerLayoutId = num;
            }
            if ((i & 2) == 0) {
                this.handleOrientation = null;
            } else {
                this.handleOrientation = bool;
            }
            if ((i & 4) == 0) {
                this.maxReasons = null;
            } else {
                this.maxReasons = num2;
            }
            if ((i & 8) == 0) {
                this.minReasonPercentage = null;
            } else {
                this.minReasonPercentage = num3;
            }
        }

        public WorkflowSettings(java.lang.Integer num) {
            this(num, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool) {
            this(num, bool, (java.lang.Integer) null, (java.lang.Integer) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
            this(num, bool, num2, (java.lang.Integer) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3) {
            this.headerLayoutId = num;
            this.handleOrientation = bool;
            this.maxReasons = num2;
            this.minReasonPercentage = num3;
        }

        public /* synthetic */ WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
        }

        public final java.lang.String toString() {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return companion.encodeToString(INSTANCE.serializer(), this);
        }

        public final int hashCode() {
            java.lang.Integer num = this.headerLayoutId;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.Boolean bool = this.handleOrientation;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Integer num2 = this.maxReasons;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.Integer num3 = this.minReasonPercentage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
        }

        public final java.lang.Integer getMinReasonPercentage() {
            return this.minReasonPercentage;
        }

        public final java.lang.Integer getMaxReasons() {
            return this.maxReasons;
        }

        public final java.lang.Integer getHeaderLayoutId() {
            return this.headerLayoutId;
        }

        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings)) {
                return false;
            }
            com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.headerLayoutId, workflowSettings.headerLayoutId) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, workflowSettings.handleOrientation) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxReasons, workflowSettings.maxReasons) && kotlin.jvm.internal.Intrinsics.areEqual(this.minReasonPercentage, workflowSettings.minReasonPercentage);
        }

        public final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings copy(java.lang.Integer headerLayoutId, java.lang.Boolean handleOrientation, java.lang.Integer maxReasons, java.lang.Integer minReasonPercentage) {
            return new com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings(headerLayoutId, handleOrientation, maxReasons, minReasonPercentage);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getMinReasonPercentage() {
            return this.minReasonPercentage;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getMaxReasons() {
            return this.maxReasons;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getHeaderLayoutId() {
            return this.headerLayoutId;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.FailoverFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.headerLayoutId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.headerLayoutId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.handleOrientation != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.handleOrientation);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.maxReasons != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.maxReasons);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.minReasonPercentage != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.minReasonPercentage);
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings, java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = workflowSettings.headerLayoutId;
            }
            if ((i & 2) != 0) {
                bool = workflowSettings.handleOrientation;
            }
            if ((i & 4) != 0) {
                num2 = workflowSettings.maxReasons;
            }
            if ((i & 8) != 0) {
                num3 = workflowSettings.minReasonPercentage;
            }
            return workflowSettings.copy(num, bool, num2, num3);
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
    public static final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
    }

    private final java.lang.Integer Camera2StreamConfigurationMap(com.miteksystems.misnap.core.MiSnapSettings p0, java.lang.String p1) {
        java.lang.Object obj;
        java.lang.Integer headerLayoutId;
        java.lang.String str;
        if (p1 == null || (str = p0.workflow.get(p1)) == null) {
            obj = null;
        } else {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.INSTANCE.serializer(), str);
        }
        com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings) obj;
        if (workflowSettings != null && (headerLayoutId = workflowSettings.getHeaderLayoutId()) != null) {
            return headerLayoutId;
        }
        java.lang.Integer d2 = com.miteksystems.misnap.workflow.a.s.d(HEADER_LAYOUT_ID, getArguments());
        return d2 == null ? INSTANCE.getDefaultWorkflowSettings(p0).getHeaderLayoutId() : d2;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num) {
        return INSTANCE.buildFragmentArguments(num);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num) {
        return INSTANCE.buildWorkflowSettings(num);
    }

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
        return INSTANCE.getDefaultWorkflowSettings(miSnapSettings);
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.getHighSpeedVideoFpsRanges) == null) {
            return;
        }
        requireActivity().setRequestedOrientation(num.intValue());
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool) {
        return INSTANCE.buildFragmentArguments(num, bool);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool) {
        return INSTANCE.buildWorkflowSettings(num, bool);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
        return INSTANCE.buildFragmentArguments(num, bool, num2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
        return INSTANCE.buildWorkflowSettings(num, bool, num2);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3) {
        return INSTANCE.buildFragmentArguments(num, bool, num2, num3);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2, java.lang.Integer num3) {
        return INSTANCE.buildWorkflowSettings(num, bool, num2, num3);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.f> {
        public static final com.miteksystems.misnap.workflow.fragment.FailoverFragment.b getHighSpeedVideoSizes = new com.miteksystems.misnap.workflow.fragment.FailoverFragment.b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.f invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.f.a(view2);
        }

        b() {
            super(1, com.miteksystems.misnap.workflow.a.f.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFailoverBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.FailoverFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        d() {
            super(0);
        }
    }

    public static /* synthetic */ void $r8$lambda$C9ipETZWGGMZ_F4nMmjurO0VLpY(com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failoverFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) failoverFragment.getHighResolutionOutputSizeshNQ4ISI.getValue())) {
            return;
        }
        failoverFragment.getHighSpeedVideoFpsRangesFor();
    }

    public static /* synthetic */ void $r8$lambda$CqFeWjqEwICaIecm0XxyxFahxuI(com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failoverFragment, "");
        failoverFragment.onBackPressedCallback.setEnabled(false);
        failoverFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public static /* synthetic */ void $r8$lambda$PvcLPIdg_3JrYxixFIRa0VCg928(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failoverFragment, "");
        if (miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE) {
            miSnapSettings.analysis.face.setTrigger(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL);
        } else {
            miSnapSettings.analysis.document.setTrigger(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL);
        }
        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) failoverFragment.getOutputFormats.getValue()).updateState$workflow_release(miSnapSettings);
        try {
            androidx.view.fragment.FragmentKt.findNavController(failoverFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateManualSession);
        } catch (java.lang.Exception e2) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) failoverFragment.getOutputFormats.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.FailoverFragment.class, failoverFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryManual.INSTANCE));
        }
    }

    /* renamed from: $r8$lambda$UkFjJcVTitT0-TcZWYq_f-nC5OE, reason: not valid java name */
    public static /* synthetic */ void m10941$r8$lambda$UkFjJcVTitT0TcZWYq_fnC5OE(com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failoverFragment, "");
        try {
            androidx.view.fragment.FragmentKt.findNavController(failoverFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateAutoSession);
        } catch (java.lang.Exception e2) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) failoverFragment.getOutputFormats.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.FailoverFragment.class, failoverFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryAuto.INSTANCE));
        }
    }

    public static final /* synthetic */ void access$showExitConfirmationDialog(final com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment) {
        new com.google.android.material.dialog.MaterialAlertDialogBuilder(failoverFragment.requireContext(), com.miteksystems.misnap.workflow.R.style.MiSnapTheme_Dialog).setTitle(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle).setMessage(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage).setPositiveButton(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, new android.content.DialogInterface.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.FailoverFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.miteksystems.misnap.workflow.fragment.FailoverFragment.$r8$lambda$CqFeWjqEwICaIecm0XxyxFahxuI(com.miteksystems.misnap.workflow.fragment.FailoverFragment.this, dialogInterface, i);
            }
        }).setNegativeButton(com.miteksystems.misnap.workflow.R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, new android.content.DialogInterface.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.FailoverFragment$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setCancelable(true).show();
    }

    /* JADX WARN: Type inference failed for: r6v65, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        java.lang.Object obj;
        java.lang.Boolean b2;
        int intValue;
        java.lang.Object obj2;
        java.lang.Integer d2;
        java.lang.Integer d3;
        int i;
        java.lang.String str;
        java.lang.String str2;
        int intValue2;
        java.lang.String str3;
        java.util.List<? extends com.miteksystems.misnap.core.UserAction> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("failoverReasonsListStateKey")) {
                java.lang.String[] stringArray = savedInstanceState.getStringArray("failoverReasonsListStateKey");
                if (stringArray != null) {
                    emptyList = new java.util.ArrayList<>(stringArray.length);
                    for (java.lang.String str4 : stringArray) {
                        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                        kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction> serializer = com.miteksystems.misnap.core.UserAction.INSTANCE.serializer();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                        emptyList.add((com.miteksystems.misnap.core.UserAction) companion.decodeFromString(serializer, str4));
                    }
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                this.getHighSpeedVideoSizes = emptyList;
            }
            if (savedInstanceState.containsKey("orientationKey")) {
                this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
            }
        }
        final com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getOutputFormats.getValue()).getSettings().getValue();
        java.lang.Object obj3 = null;
        if (value != null) {
            if (com.miteksystems.misnap.workflow.WorkflowSettings.shouldShowExitConfirmationDialog(value.workflow, value.getUseCase())) {
                requireActivity().getOnBackPressedDispatcher().addCallback(requireActivity(), this.onBackPressedCallback);
            }
            java.lang.String str5 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (str5 == null || (str3 = value.workflow.get(str5)) == null) {
                obj = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
                companion2.getSerializersModule();
                obj = companion2.decodeFromString(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.INSTANCE.serializer(), str3);
            }
            com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings(value).getHandleOrientation();
            }
            if (b2 != null) {
                this.getHighSpeedVideoFpsRangesFor = b2.booleanValue();
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                try {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    androidx.view.fragment.FragmentKt.findNavController(this).addOnDestinationChangedListener(this.Camera2StreamConfigurationMap);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(value.workflow, value.getUseCase());
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            getBinding$workflow_release().b.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.FailoverFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.FailoverFragment.m10941$r8$lambda$UkFjJcVTitT0TcZWYq_fnC5OE(com.miteksystems.misnap.workflow.fragment.FailoverFragment.this, view2);
                }
            });
            getBinding$workflow_release().n.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.FailoverFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.FailoverFragment.$r8$lambda$PvcLPIdg_3JrYxixFIRa0VCg928(com.miteksystems.misnap.core.MiSnapSettings.this, this, view2);
                }
            });
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = "";
            java.lang.Integer Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(value, (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue());
            if (Camera2StreamConfigurationMap2 != null && (intValue2 = Camera2StreamConfigurationMap2.intValue()) != 0) {
                android.view.View inflate = android.view.LayoutInflater.from(requireActivity()).inflate(intValue2, (android.view.ViewGroup) getBinding$workflow_release().c, false);
                getBinding$workflow_release().c.addView(inflate);
                objectRef.element = java.lang.String.valueOf(inflate.getContentDescription());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append((java.lang.Object) inflate.getContentDescription());
                sb2.append('\n');
                sb.append(sb2.toString());
            }
            java.lang.String str6 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (str6 == null || (str2 = value.workflow.get(str6)) == null) {
                obj2 = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion5 = kotlinx.serialization.json.Json.INSTANCE;
                companion5.getSerializersModule();
                obj2 = companion5.decodeFromString(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.INSTANCE.serializer(), str2);
            }
            com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings2 = (com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d2 = workflowSettings2.getMaxReasons()) == null) && (d2 = com.miteksystems.misnap.workflow.a.s.d(MAX_REASONS, getArguments())) == null) {
                d2 = INSTANCE.getDefaultWorkflowSettings(value).getMaxReasons();
            }
            java.lang.String str7 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
            if (str7 != null && (str = value.workflow.get(str7)) != null) {
                kotlinx.serialization.json.Json.Companion companion6 = kotlinx.serialization.json.Json.INSTANCE;
                companion6.getSerializersModule();
                obj3 = companion6.decodeFromString(com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings workflowSettings3 = (com.miteksystems.misnap.workflow.fragment.FailoverFragment.WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d3 = workflowSettings3.getMinReasonPercentage()) == null) && (d3 = com.miteksystems.misnap.workflow.a.s.d(MIN_REASON_PERCENTAGE, getArguments())) == null) {
                d3 = INSTANCE.getDefaultWorkflowSettings(value).getMinReasonPercentage();
            }
            if (d2 != null && d3 != null) {
                java.util.List<com.miteksystems.misnap.core.UserAction> topFailedReasons = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getOutputFormats.getValue()).getFailoverReasonsHandler().getTopFailedReasons(d2.intValue(), d3.intValue());
                if (this.getHighSpeedVideoSizes.isEmpty()) {
                    this.getHighSpeedVideoSizes = topFailedReasons;
                }
                ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getOutputFormats.getValue()).getFailoverReasonsHandler().reset();
                for (com.miteksystems.misnap.core.UserAction userAction : this.getHighSpeedVideoSizes) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentNotFoundReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentMrzConfidenceReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentGlareReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentBadAngleReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentMaxBrightnessReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentMinPaddingReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentMinBrightnessReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentMinHorizontalFillReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentLowContrastReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentBusyBackgroundReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE)) {
                        int i2 = com.miteksystems.misnap.workflow.fragment.FailoverFragment.a.f4177a[value.getUseCase().ordinal()];
                        i = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentGenericReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentCheckBackReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentCheckFrontReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentIdBackReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentIdFrontReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentWrongDocumentPassportReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceNotFoundReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceEyesOpenReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceMinPaddingReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceMinFillReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceMultipleFacesReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceBadAngleReason;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction, com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE)) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentBarcodeNotFoundReason;
                    } else {
                        int i3 = com.miteksystems.misnap.workflow.fragment.FailoverFragment.a.f4177a[value.getUseCase().ordinal()];
                        i = i3 != 6 ? i3 != 7 ? com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentDocumentDefaultReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentFaceDefaultReason : com.miteksystems.misnap.workflow.R.string.misnapWorkflowFailoverFragmentBarcodeDefaultReason;
                    }
                    java.lang.String string = getString(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(string);
                    sb3.append('\n');
                    sb.append(sb3.toString());
                    android.widget.LinearLayout linearLayout = getBinding$workflow_release().e;
                    android.view.View inflate2 = getLayoutInflater().inflate(com.miteksystems.misnap.workflow.R.layout.misnap_failover_reason, (android.view.ViewGroup) getBinding$workflow_release().e, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(inflate2, "");
                    com.google.android.material.textview.MaterialTextView materialTextView = (com.google.android.material.textview.MaterialTextView) inflate2;
                    materialTextView.setText(string);
                    linearLayout.addView(materialTextView);
                }
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append((java.lang.Object) getBinding$workflow_release().d.getContentDescription());
            sb4.append('\n');
            sb.append(sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append((java.lang.Object) getBinding$workflow_release().n.getContentDescription());
            sb5.append('\n');
            sb.append(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) getBinding$workflow_release().b.getContentDescription());
            sb6.append('\n');
            sb.append(sb6.toString());
            if (kotlin.jvm.internal.Intrinsics.areEqual(Camera2StreamConfigurationMap(value, (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue()), INSTANCE.getDefaultWorkflowSettings(value).getHeaderLayoutId())) {
                android.widget.FrameLayout frameLayout = getBinding$workflow_release().c;
                androidx.core.view.ViewCompat.setAccessibilityDelegate(frameLayout, new com.miteksystems.misnap.workflow.fragment.FailoverFragment.f(frameLayout, objectRef));
                getBinding$workflow_release().c.setContentDescription(sb);
            }
            com.miteksystems.misnap.workflow.util.TextUtil textUtil = com.miteksystems.misnap.workflow.util.TextUtil.INSTANCE;
            android.widget.LinearLayout linearLayout2 = getBinding$workflow_release().e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            java.util.Iterator it = textUtil.getTextViews$workflow_release(linearLayout2).iterator();
            while (it.hasNext()) {
                com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE.adjustScalingForAccessibility$workflow_release((android.widget.TextView) it.next());
            }
            com.miteksystems.misnap.workflow.util.TextUtil textUtil2 = com.miteksystems.misnap.workflow.util.TextUtil.INSTANCE;
            android.widget.FrameLayout frameLayout2 = getBinding$workflow_release().c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            java.util.Iterator it2 = textUtil2.getTextViews$workflow_release(frameLayout2).iterator();
            while (it2.hasNext()) {
                com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE.adjustScalingForAccessibility$workflow_release((android.widget.TextView) it2.next());
            }
            com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
            com.google.android.material.textview.MaterialTextView materialTextView2 = getBinding$workflow_release().d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialTextView2, "");
            accessibilityUtil.adjustScalingForAccessibility$workflow_release(materialTextView2);
            obj3 = kotlin.Unit.INSTANCE;
        }
        if (obj3 == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getOutputFormats.getValue();
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.util.List<? extends com.miteksystems.misnap.core.UserAction> list = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.Json.INSTANCE.encodeToString(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer(), (com.miteksystems.misnap.core.UserAction) it.next()));
        }
        outState.putStringArray("failoverReasonsListStateKey", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        java.lang.Integer num = this.getHighSpeedVideoFpsRanges;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.onBackPressedCallback.remove();
        if (this.getHighSpeedVideoFpsRangesFor) {
            try {
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.Camera2StreamConfigurationMap);
            } catch (java.lang.Exception unused) {
                getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    /* renamed from: getOnBackPressedCallback$workflow_release, reason: from getter */
    public final androidx.view.OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.String invoke() {
            java.lang.Object m23436constructorimpl;
            java.lang.CharSequence label;
            com.miteksystems.misnap.workflow.fragment.FailoverFragment failoverFragment = com.miteksystems.misnap.workflow.fragment.FailoverFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(failoverFragment).getCurrentDestination();
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

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$e;", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "()V"}, k = 1, mv = {1, 8, 0})
    public static final class e extends androidx.view.OnBackPressedCallback {
        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            com.miteksystems.misnap.workflow.fragment.FailoverFragment.access$showExitConfirmationDialog(com.miteksystems.misnap.workflow.fragment.FailoverFragment.this);
        }

        e() {
            super(true);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FailoverFragment$f;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/view/View;", com.datadog.android.log.LogAttributes.HOST, "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V"}, k = 1, mv = {1, 8, 0})
    public static final class f extends androidx.core.view.AccessibilityDelegateCompat {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ android.widget.FrameLayout getHighSpeedVideoSizes;

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            super.onInitializeAccessibilityEvent(host, event);
            if (event.getEventType() == 65536) {
                this.getHighSpeedVideoSizes.setContentDescription(this.Camera2StreamConfigurationMap.element);
            }
        }

        f(android.widget.FrameLayout frameLayout, kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef) {
            this.getHighSpeedVideoSizes = frameLayout;
            this.Camera2StreamConfigurationMap = objectRef;
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.f getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.f) this.binding.getValue2((androidx.fragment.app.Fragment) this, Camera2StreamConfigurationMap[0]);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4177a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            f4177a = iArr;
        }
    }

    public FailoverFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_failover);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.FailoverFragment.b.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.emptyList();
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.FailoverFragment.c());
        this.Camera2StreamConfigurationMap = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.FailoverFragment$$ExternalSyntheticLambda2
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.FailoverFragment.$r8$lambda$C9ipETZWGGMZ_F4nMmjurO0VLpY(com.miteksystems.misnap.workflow.fragment.FailoverFragment.this, navController, navDestination, bundle);
            }
        };
        this.getOutputFormats = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.FailoverFragment.d());
        this.onBackPressedCallback = new com.miteksystems.misnap.workflow.fragment.FailoverFragment.e();
    }
}
