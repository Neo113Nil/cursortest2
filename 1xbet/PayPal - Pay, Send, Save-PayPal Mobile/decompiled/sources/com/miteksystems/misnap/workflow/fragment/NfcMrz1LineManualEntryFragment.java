package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0015\u0010\u0017\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001f"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "Camera2StreamConfigurationMap", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/h;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/h;", "binding", "", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "getOutputFormats", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NfcMrz1LineManualEntryFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    public static final java.lang.String HELP_DIALOGUE_LAYOUT_ID = "helpDialogueLayoutId";
    public static final java.lang.String SHOW_SKIP_BUTTON = "showSkipButton";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener getHighSpeedVideoFpsRanges;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrz1lineManualEntryBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion(null);

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010J1\u0010\u0011\u001a\u00020\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$Companion;", "", "()V", "HANDLE_ORIENTATION", "", "HELP_DIALOGUE_LAYOUT_ID", "LOG_TAG", "ORIENTATION_KEY", "SHOW_SKIP_BUTTON", "buildFragmentArguments", "Landroid/os/Bundle;", "helpDialogueLayoutId", "", "showSkipButton", "", "handleOrientation", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;", "settings", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments() {
            return buildFragmentArguments$default(this, null, null, null, 7, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings() {
            return buildWorkflowSettings$default(this, null, null, null, 7, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings() {
            return getDefaultWorkflowSettings$default(this, null, 1, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer num) {
            return buildFragmentArguments$default(this, num, null, null, 6, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer num) {
            return buildWorkflowSettings$default(this, num, null, null, 6, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings settings) {
            java.lang.Object m23436constructorimpl;
            int i;
            int i2;
            java.lang.Integer valueOf;
            com.miteksystems.misnap.core.MiSnapSettings.Nfc nfc;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType requireDocType = (settings == null || (nfc = settings.nfc) == null) ? null : com.miteksystems.misnap.nfc.NfcSettings.requireDocType(nfc);
                i = requireDocType == null ? -1 : com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion.a.f4193a[requireDocType.ordinal()];
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (i == 1) {
                i2 = com.miteksystems.misnap.workflow.R.layout.misnap_nfc_manual_entry_help_eudl;
            } else if (i == 2) {
                i2 = com.miteksystems.misnap.workflow.R.layout.misnap_nfc_manual_entry_help_id;
            } else {
                if (i != 3) {
                    valueOf = null;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(valueOf);
                    return new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings((java.lang.Integer) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
                }
                i2 = com.miteksystems.misnap.workflow.R.layout.misnap_nfc_manual_entry_help_passport;
            }
            valueOf = java.lang.Integer.valueOf(i2);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(valueOf);
            return new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings((java.lang.Integer) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool) {
            return buildFragmentArguments$default(this, num, bool, null, 4, null);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool) {
            return buildWorkflowSettings$default(this, num, bool, null, 4, null);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle buildFragmentArguments(java.lang.Integer helpDialogueLayoutId, java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (helpDialogueLayoutId != null) {
                bundle.putInt("helpDialogueLayoutId", helpDialogueLayoutId.intValue());
            }
            if (showSkipButton != null) {
                bundle.putBoolean("showSkipButton", showSkipButton.booleanValue());
            }
            if (handleOrientation != null) {
                bundle.putBoolean("handleOrientation", handleOrientation.booleanValue());
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String buildWorkflowSettings(java.lang.Integer helpDialogueLayoutId, java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings(helpDialogueLayoutId, showSkipButton, handleOrientation).toString();
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion companion, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                miSnapSettings = null;
            }
            return companion.getDefaultWorkflowSettings(miSnapSettings);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                bool2 = null;
            }
            return companion.buildWorkflowSettings(num, bool, bool2);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4193a;

            static {
                int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.values().length];
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.EU_DL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.ID.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType.PASSPORT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f4193a = iArr;
            }
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                bool2 = null;
            }
            return companion.buildFragmentArguments(num, bool, bool2);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001b"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;", "", "", "helpDialogueLayoutId", "", "showSkipButton", "handleOrientation", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getHelpDialogueLayoutId", util.h.xy.cb.b.f1091, "Ljava/lang/Boolean;", "getShowSkipButton", "c", "getHandleOrientation", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.Integer helpDialogueLayoutId;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.Boolean showSkipButton;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.lang.Boolean handleOrientation;

        public WorkflowSettings() {
            this((java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ WorkflowSettings(int i, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.helpDialogueLayoutId = null;
            } else {
                this.helpDialogueLayoutId = num;
            }
            if ((i & 2) == 0) {
                this.showSkipButton = null;
            } else {
                this.showSkipButton = bool;
            }
            if ((i & 4) == 0) {
                this.handleOrientation = null;
            } else {
                this.handleOrientation = bool2;
            }
        }

        public WorkflowSettings(java.lang.Integer num) {
            this(num, (java.lang.Boolean) null, (java.lang.Boolean) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool) {
            this(num, bool, (java.lang.Boolean) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.helpDialogueLayoutId = num;
            this.showSkipButton = bool;
            this.handleOrientation = bool2;
        }

        public /* synthetic */ WorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
        }

        public final java.lang.String toString() {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            return companion.encodeToString(INSTANCE.serializer(), this);
        }

        public final int hashCode() {
            java.lang.Integer num = this.helpDialogueLayoutId;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.Boolean bool = this.showSkipButton;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.handleOrientation;
            return (((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final java.lang.Boolean getShowSkipButton() {
            return this.showSkipButton;
        }

        public final java.lang.Integer getHelpDialogueLayoutId() {
            return this.helpDialogueLayoutId;
        }

        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings)) {
                return false;
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.helpDialogueLayoutId, workflowSettings.helpDialogueLayoutId) && kotlin.jvm.internal.Intrinsics.areEqual(this.showSkipButton, workflowSettings.showSkipButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, workflowSettings.handleOrientation);
        }

        public final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings copy(java.lang.Integer helpDialogueLayoutId, java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings(helpDialogueLayoutId, showSkipButton, handleOrientation);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getHandleOrientation() {
            return this.handleOrientation;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getShowSkipButton() {
            return this.showSkipButton;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getHelpDialogueLayoutId() {
            return this.helpDialogueLayoutId;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.helpDialogueLayoutId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.helpDialogueLayoutId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.showSkipButton != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showSkipButton);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.handleOrientation != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.handleOrientation);
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = workflowSettings.helpDialogueLayoutId;
            }
            if ((i & 2) != 0) {
                bool = workflowSettings.showSkipButton;
            }
            if ((i & 4) != 0) {
                bool2 = workflowSettings.handleOrientation;
            }
            return workflowSettings.copy(num, bool, bool2);
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
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
    }

    private final void Camera2StreamConfigurationMap() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.getHighSpeedVideoFpsRangesFor) == null) {
            return;
        }
        requireActivity().setRequestedOrientation(num.intValue());
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
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
        return INSTANCE.getDefaultWorkflowSettings(miSnapSettings);
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
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildFragmentArguments(num, bool, bool2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildWorkflowSettings(num, bool, bool2);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.h> {
        public static final com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.a getHighResolutionOutputSizeshNQ4ISI = new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.h invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.h.a(view2);
        }

        a() {
            super(1, com.miteksystems.misnap.workflow.a.h.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrz1lineManualEntryBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        c() {
            super(0);
        }
    }

    /* renamed from: $r8$lambda$E0K-rDOVC0qCmio4-iaZaGdBAXo, reason: not valid java name */
    public static /* synthetic */ void m10944$r8$lambda$E0KrDOVC0qCmio4iaZaGdBAXo(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, android.view.View view) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrz1LineManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        com.miteksystems.misnap.core.Mrz1Line mrz1Line = new com.miteksystems.misnap.core.Mrz1Line(java.lang.String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()));
        java.lang.String str = null;
        if (!com.miteksystems.misnap.core.ValidationUtil.isValidMrz(mrz1Line)) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = nfcMrz1LineManualEntryFragment.getBinding$workflow_release().d;
            if (com.miteksystems.misnap.core.ValidationUtil.areFieldsEmpty(java.lang.String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorEmptyField;
            } else {
                if (!com.miteksystems.misnap.core.ValidationUtil.isMrzLengthIncorrect(java.lang.String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                    if (com.miteksystems.misnap.core.ValidationUtil.containsIllegalMrzCharacters(java.lang.String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                        i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorMrzStringInvalid;
                    }
                    textInputLayout.setError(str);
                    return;
                }
                i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorMrzStringLengthIncorrect;
            }
            str = nfcMrz1LineManualEntryFragment.getString(i);
            textInputLayout.setError(str);
            return;
        }
        nfcMrz1LineManualEntryFragment.getBinding$workflow_release().d.setError(null);
        android.content.Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        if (!com.miteksystems.misnap.nfc.util.NfcDocumentUtil.isDocumentNfcEnabled(requireContext, mrz1Line)) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrz1LineManualEntryFragment.getHighSpeedVideoSizes.getValue();
            android.content.Context requireContext2 = nfcMrz1LineManualEntryFragment.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
            miSnapWorkflowViewModel.postError$workflow_release(requireContext2, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
            return;
        }
        miSnapSettings.nfc.setMrz(mrz1Line);
        ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrz1LineManualEntryFragment.getHighSpeedVideoSizes.getValue()).updateState$workflow_release(miSnapSettings);
        try {
            androidx.view.fragment.FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateContinue);
        } catch (java.lang.Exception e) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrz1LineManualEntryFragment.getHighSpeedVideoSizes.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.class, nfcMrz1LineManualEntryFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateContinue.INSTANCE));
        }
    }

    /* renamed from: $r8$lambda$KCd8wFaszemZwINPZF_8-807jJY, reason: not valid java name */
    public static /* synthetic */ void m10945$r8$lambda$KCd8wFaszemZwINPZF_8807jJY(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, android.view.View view) {
        java.lang.Object obj;
        java.lang.Integer d2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrz1LineManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        java.lang.String str2 = (java.lang.String) nfcMrz1LineManualEntryFragment.Camera2StreamConfigurationMap.getValue();
        if (str2 == null || (str = miSnapSettings.workflow.get(str2)) == null) {
            obj = null;
        } else {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str);
        }
        com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings) obj;
        java.lang.Integer helpDialogueLayoutId = ((workflowSettings == null || (d2 = workflowSettings.getHelpDialogueLayoutId()) == null) && (d2 = com.miteksystems.misnap.workflow.a.s.d("helpDialogueLayoutId", nfcMrz1LineManualEntryFragment.getArguments())) == null) ? INSTANCE.getDefaultWorkflowSettings(miSnapSettings).getHelpDialogueLayoutId() : d2;
        if (helpDialogueLayoutId != null) {
            int intValue = helpDialogueLayoutId.intValue();
            android.content.Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            new com.miteksystems.misnap.workflow.a.q(requireContext, intValue).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$PDPwOJomco_LYNwI1rCZGMgqles(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrz1LineManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) nfcMrz1LineManualEntryFragment.Camera2StreamConfigurationMap.getValue())) {
            return;
        }
        nfcMrz1LineManualEntryFragment.Camera2StreamConfigurationMap();
    }

    /* renamed from: $r8$lambda$xztTb-B6dj41P82hHnUkXJjCYVE, reason: not valid java name */
    public static /* synthetic */ void m10946$r8$lambda$xztTbB6dj41P82hHnUkXJjCYVE(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrz1LineManualEntryFragment, "");
        try {
            androidx.view.fragment.FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateSkip);
        } catch (java.lang.Exception e) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrz1LineManualEntryFragment.getHighSpeedVideoSizes.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.class, nfcMrz1LineManualEntryFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateSkip.INSTANCE));
        }
        com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrz1LineManualEntryFragment.getHighSpeedVideoSizes.getValue();
        android.content.Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
    }

    public static /* synthetic */ boolean $r8$lambda$ynqrMOHA52CSjKqG8j6qXvNh55E(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrz1LineManualEntryFragment, "");
        if ((keyEvent == null || 66 != keyEvent.getKeyCode()) && 6 != i) {
            return true;
        }
        nfcMrz1LineManualEntryFragment.getBinding$workflow_release().g.callOnClick();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        java.lang.Object obj;
        java.lang.Boolean b2;
        int intValue;
        java.lang.Object obj2;
        java.lang.Boolean b3;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("orientationKey")) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(savedInstanceState.getInt("orientationKey"));
        }
        final com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoSizes.getValue()).getSettings().getValue();
        kotlin.Unit unit = null;
        if (value != null) {
            java.lang.String str3 = (java.lang.String) this.Camera2StreamConfigurationMap.getValue();
            if (str3 == null || (str2 = value.workflow.get(str3)) == null) {
                obj = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str2);
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings(value).getHandleOrientation();
            }
            if (b2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = b2.booleanValue();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                try {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    androidx.view.fragment.FragmentKt.findNavController(this).addOnDestinationChangedListener(this.getHighSpeedVideoFpsRanges);
                    kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Integer forcedOrientation = com.miteksystems.misnap.workflow.WorkflowSettings.getForcedOrientation(value.workflow, value.getUseCase());
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            java.lang.String str4 = (java.lang.String) this.Camera2StreamConfigurationMap.getValue();
            if (str4 == null || (str = value.workflow.get(str4)) == null) {
                obj2 = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion4 = kotlinx.serialization.json.Json.INSTANCE;
                companion4.getSerializersModule();
                obj2 = companion4.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings2 = (com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b3 = workflowSettings2.getShowSkipButton()) == null) && (b3 = com.miteksystems.misnap.workflow.a.s.b("showSkipButton", getArguments())) == null) {
                b3 = INSTANCE.getDefaultWorkflowSettings(value).getShowSkipButton();
            }
            if (b3 != null && b3.booleanValue()) {
                com.google.android.material.button.MaterialButton materialButton = getBinding$workflow_release().f;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.m10946$r8$lambda$xztTbB6dj41P82hHnUkXJjCYVE(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this, view2);
                    }
                });
            }
            getBinding$workflow_release().e.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.m10945$r8$lambda$KCd8wFaszemZwINPZF_8807jJY(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this, value, view2);
                }
            });
            com.miteksystems.misnap.core.Mrz mrz = value.nfc.getCom.miteksystems.misnap.core.MiSnapSettings.KEY_NFC_MRZ java.lang.String();
            if (mrz != null) {
                if (mrz instanceof com.miteksystems.misnap.core.Mrz1Line) {
                    com.google.android.material.textfield.TextInputEditText textInputEditText = getBinding$workflow_release().c;
                    java.lang.String obj3 = kotlin.text.StringsKt.trim(((com.miteksystems.misnap.core.Mrz1Line) mrz).getMrzString()).toString();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = obj3.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    textInputEditText.setText(upperCase);
                } else {
                    getBinding$workflow_release().h.setText(com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentTitle);
                }
                unit = kotlin.Unit.INSTANCE;
            }
            if (unit == null) {
                getBinding$workflow_release().h.setText(com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentTitle);
            }
            getBinding$workflow_release().c.addTextChangedListener(new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.d());
            getBinding$workflow_release().c.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda3
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.$r8$lambda$ynqrMOHA52CSjKqG8j6qXvNh55E(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this, textView, i, keyEvent);
                }
            });
            getBinding$workflow_release().g.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.m10944$r8$lambda$E0KrDOVC0qCmio4iaZaGdBAXo(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this, value, view2);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.getHighSpeedVideoSizes.getValue();
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
        com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
        android.widget.TextView textView = getBinding$workflow_release().h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "");
        accessibilityUtil.adjustScalingForAccessibility$workflow_release(textView);
        com.miteksystems.misnap.workflow.util.TextUtil textUtil = com.miteksystems.misnap.workflow.util.TextUtil.INSTANCE;
        com.google.android.material.textfield.TextInputLayout textInputLayout = getBinding$workflow_release().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        java.util.Iterator it = textUtil.getTextViews$workflow_release(textInputLayout).iterator();
        while (it.hasNext()) {
            com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE.adjustScalingForAccessibility$workflow_release((android.widget.TextView) it.next());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$d;", "Landroid/text/TextWatcher;", "", lib.android.paypal.com.magnessdk.g.n2, "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged"}, k = 1, mv = {1, 8, 0})
    public static final class d implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public final void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
            java.lang.String valueOf = java.lang.String.valueOf(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this.getBinding$workflow_release().c.getText());
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = valueOf.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, upperCase)) {
                return;
            }
            int selectionEnd = com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this.getBinding$workflow_release().c.getSelectionEnd();
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this.getBinding$workflow_release().c.setText(upperCase);
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this.getBinding$workflow_release().c.setSelection(selectionEnd);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable s) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        d() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
        if (num != null) {
            outState.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.getHighSpeedVideoFpsRanges);
            } catch (java.lang.Exception unused) {
                Camera2StreamConfigurationMap();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public java.lang.String invoke() {
            java.lang.Object m23436constructorimpl;
            java.lang.CharSequence label;
            com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).getCurrentDestination();
                m23436constructorimpl = kotlin.Result.m23436constructorimpl((currentDestination == null || (label = currentDestination.getLabel()) == null) ? null : label.toString());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        }

        b() {
            super(0);
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.h getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.h) this.binding.getValue2((androidx.fragment.app.Fragment) this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public NfcMrz1LineManualEntryFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_nfc_mrz1line_manual_entry);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.a.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.b());
        this.getHighSpeedVideoFpsRanges = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda0
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.$r8$lambda$PDPwOJomco_LYNwI1rCZGMgqles(com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.this, navController, navDestination, bundle);
            }
        };
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment.c());
    }
}
