package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0015\u0010\u001a\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001e"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/miteksystems/misnap/workflow/a/i;", "a", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "getBinding$workflow_release", "()Lcom/miteksystems/misnap/workflow/a/i;", "binding", "", "getHighSpeedVideoFpsRangesFor", "Z", "", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "getHighSpeedVideoSizes", "Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "getInputFormats", "Companion", "WorkflowSettings"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NfcMrzDataManualEntryFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String HANDLE_ORIENTATION = "handleOrientation";
    public static final java.lang.String HELP_DIALOGUE_LAYOUT_ID = "helpDialogueLayoutId";
    public static final java.lang.String SHOW_SKIP_BUTTON = "showSkipButton";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate binding;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.navigation.NavController.OnDestinationChangedListener getHighSpeedVideoSizes;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrzdataManualEntryBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion(null);

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0012J1\u0010\u0013\u001a\u00020\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$Companion;", "", "()V", "DOCUMENT_CODE_MAX_LENGTH", "", "HANDLE_ORIENTATION", "", "HELP_DIALOGUE_LAYOUT_ID", "ISSUING_COUNTRY_MAX_LENGTH", "LOG_TAG", "ORIENTATION_KEY", "SHOW_SKIP_BUTTON", "buildFragmentArguments", "Landroid/os/Bundle;", "helpDialogueLayoutId", "showSkipButton", "", "handleOrientation", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Landroid/os/Bundle;", "buildWorkflowSettings", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "getDefaultWorkflowSettings", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;", "settings", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        public final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings() {
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
        public final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings settings) {
            java.lang.Object m23436constructorimpl;
            int i;
            int i2;
            java.lang.Integer valueOf;
            com.miteksystems.misnap.core.MiSnapSettings.Nfc nfc;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.miteksystems.misnap.core.MiSnapSettings.Nfc.Advanced.DocType requireDocType = (settings == null || (nfc = settings.nfc) == null) ? null : com.miteksystems.misnap.nfc.NfcSettings.requireDocType(nfc);
                i = requireDocType == null ? -1 : com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion.a.f4196a[requireDocType.ordinal()];
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
                    return new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings((java.lang.Integer) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
                }
                i2 = com.miteksystems.misnap.workflow.R.layout.misnap_nfc_manual_entry_help_passport;
            }
            valueOf = java.lang.Integer.valueOf(i2);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(valueOf);
            return new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings((java.lang.Integer) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
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
            return new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings(helpDialogueLayoutId, showSkipButton, handleOrientation).toString();
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion companion, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                miSnapSettings = null;
            }
            return companion.getDefaultWorkflowSettings(miSnapSettings);
        }

        public static /* synthetic */ java.lang.String buildWorkflowSettings$default(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
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
            public static final /* synthetic */ int[] f4196a;

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
                f4196a = iArr;
            }
        }

        public static /* synthetic */ android.os.Bundle buildFragmentArguments$default(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.Companion companion, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001b"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;", "", "", "helpDialogueLayoutId", "", "showSkipButton", "handleOrientation", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getHelpDialogueLayoutId", util.h.xy.cb.b.f1091, "Ljava/lang/Boolean;", "getShowSkipButton", "c", "getHandleOrientation", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class WorkflowSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings.Companion(null);

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
            if (!(other instanceof com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings)) {
                return false;
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.helpDialogueLayoutId, workflowSettings.helpDialogueLayoutId) && kotlin.jvm.internal.Intrinsics.areEqual(this.showSkipButton, workflowSettings.showSkipButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.handleOrientation, workflowSettings.handleOrientation);
        }

        public final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings copy(java.lang.Integer helpDialogueLayoutId, java.lang.Boolean showSkipButton, java.lang.Boolean handleOrientation) {
            return new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings(helpDialogueLayoutId, showSkipButton, handleOrientation);
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

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings> serializer() {
                return com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$WorkflowSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
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

        public static /* synthetic */ com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings copy$default(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
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
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return INSTANCE.getDefaultWorkflowSettings();
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
    public static final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings getDefaultWorkflowSettings(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
        return INSTANCE.getDefaultWorkflowSettings(miSnapSettings);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Integer num;
        if (requireActivity().isChangingConfigurations() || (num = this.getHighSpeedVideoFpsRangesFor) == null) {
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
    public static final android.os.Bundle buildFragmentArguments(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildFragmentArguments(num, bool, bool2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String buildWorkflowSettings(java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2) {
        return INSTANCE.buildWorkflowSettings(num, bool, bool2);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.View, com.miteksystems.misnap.workflow.a.i> {
        public static final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.a getHighSpeedVideoFpsRangesFor = new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.miteksystems.misnap.workflow.a.i invoke(android.view.View view) {
            android.view.View view2 = view;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
            return com.miteksystems.misnap.workflow.a.i.a(view2);
        }

        a() {
            super(1, com.miteksystems.misnap.workflow.a.i.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrzdataManualEntryBinding;", 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;", "a", "()Lcom/miteksystems/misnap/workflow/fragment/MiSnapWorkflowViewModel;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel invoke() {
            androidx.fragment.app.FragmentActivity requireActivity = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
            return (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) new androidx.view.ViewModelProvider(requireActivity).get(com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel.class);
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
            java.lang.Long l2 = l;
            com.google.android.material.textfield.TextInputEditText textInputEditText = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l2, "");
            textInputEditText.setText(com.miteksystems.misnap.core.DateUtil.getFormattedDate(l2.longValue(), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT));
            return kotlin.Unit.INSTANCE;
        }

        d() {
            super(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
            java.lang.Long l2 = l;
            com.google.android.material.textfield.TextInputEditText textInputEditText = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l2, "");
            textInputEditText.setText(com.miteksystems.misnap.core.DateUtil.getFormattedDate(l2.longValue(), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT));
            return kotlin.Unit.INSTANCE;
        }

        h() {
            super(1);
        }
    }

    public static /* synthetic */ void $r8$lambda$4BwEbxvFrWu9gOc2uc1Yuj54Iko(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, android.view.View view) {
        java.lang.Object obj;
        java.lang.Integer d2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        java.lang.String str2 = (java.lang.String) nfcMrzDataManualEntryFragment.getHighSpeedVideoFpsRanges.getValue();
        if (str2 == null || (str = miSnapSettings.workflow.get(str2)) == null) {
            obj = null;
        } else {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            companion.getSerializersModule();
            obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str);
        }
        com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings) obj;
        java.lang.Integer helpDialogueLayoutId = ((workflowSettings == null || (d2 = workflowSettings.getHelpDialogueLayoutId()) == null) && (d2 = com.miteksystems.misnap.workflow.a.s.d("helpDialogueLayoutId", nfcMrzDataManualEntryFragment.getArguments())) == null) ? INSTANCE.getDefaultWorkflowSettings(miSnapSettings).getHelpDialogueLayoutId() : d2;
        if (helpDialogueLayoutId != null) {
            int intValue = helpDialogueLayoutId.intValue();
            android.content.Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            new com.miteksystems.misnap.workflow.a.q(requireContext, intValue).show();
        }
    }

    /* renamed from: $r8$lambda$Aq26SNUL3DR0SsmPejNM7W4-2nI, reason: not valid java name */
    public static /* synthetic */ void m10947$r8$lambda$Aq26SNUL3DR0SsmPejNM7W42nI(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getLabel(), (java.lang.String) nfcMrzDataManualEntryFragment.getHighSpeedVideoFpsRanges.getValue())) {
            return;
        }
        nfcMrzDataManualEntryFragment.getHighResolutionOutputSizeshNQ4ISI();
    }

    public static /* synthetic */ void $r8$lambda$GJcoAxy7GZDW8FdSnSPyndjkkys(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    public static /* synthetic */ void $r8$lambda$JTAUhxH9jv1iqoZlSk3U0GR4v_o(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        try {
            androidx.view.fragment.FragmentKt.findNavController(nfcMrzDataManualEntryFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateSkip);
        } catch (java.lang.Exception e2) {
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrzDataManualEntryFragment.Camera2StreamConfigurationMap.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.class, nfcMrzDataManualEntryFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateSkip.INSTANCE));
        }
        com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrzDataManualEntryFragment.Camera2StreamConfigurationMap.getValue();
        android.content.Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0252  */
    /* renamed from: $r8$lambda$LkDaQ8EczzYeUsE4kW844rTmg-M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m10948$r8$lambda$LkDaQ8EczzYeUsE4kW844rTmgM(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, android.view.View view) {
        int i;
        java.lang.String str;
        android.text.Editable text;
        int i2;
        java.lang.String str2;
        android.text.Editable text2;
        int i3;
        java.lang.String str3;
        android.text.Editable text3;
        int i4;
        java.lang.String str4;
        android.text.Editable text4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        com.miteksystems.misnap.core.MrzData mrzData = new com.miteksystems.misnap.core.MrzData(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText()), com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, false, true, 8, null), com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText()), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, false, true, 8, null), kotlin.text.StringsKt.padEnd(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()), 3, kotlin.text.Typography.less), kotlin.text.StringsKt.padEnd(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()), 2, kotlin.text.Typography.less), (java.lang.String) null, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.lang.String str5 = null;
        if (com.miteksystems.misnap.core.ValidationUtil.isValidMrz(mrzData)) {
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().h.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().d.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().j.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().l.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().f.setError(null);
            android.content.Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            if (!com.miteksystems.misnap.nfc.util.NfcDocumentUtil.isDocumentNfcEnabled(requireContext, mrzData)) {
                com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrzDataManualEntryFragment.Camera2StreamConfigurationMap.getValue();
                android.content.Context requireContext2 = nfcMrzDataManualEntryFragment.requireContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
                miSnapWorkflowViewModel.postError$workflow_release(requireContext2, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
                return;
            }
            miSnapSettings.nfc.setMrz(mrzData);
            ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrzDataManualEntryFragment.Camera2StreamConfigurationMap.getValue()).updateState$workflow_release(miSnapSettings);
            try {
                androidx.view.fragment.FragmentKt.findNavController(nfcMrzDataManualEntryFragment).navigate(com.miteksystems.misnap.workflow.R.id.navigateContinue);
                return;
            } catch (java.lang.Exception e2) {
                ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) nfcMrzDataManualEntryFragment.Camera2StreamConfigurationMap.getValue()).postNavigationError$workflow_release(new com.miteksystems.misnap.workflow.fragment.NavigationError(e2, (java.lang.Class<androidx.fragment.app.Fragment>) com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.class, nfcMrzDataManualEntryFragment.hashCode(), com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateContinue.INSTANCE));
                return;
            }
        }
        com.google.android.material.textfield.TextInputLayout textInputLayout = nfcMrzDataManualEntryFragment.getBinding$workflow_release().h;
        android.text.Editable text5 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText();
        if (text5 == null || kotlin.text.StringsKt.isBlank(text5)) {
            i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
        } else if (com.miteksystems.misnap.core.ValidationUtil.isDocumentNumberLengthIncorrect(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText()), java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()))) {
            i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentNumberLengthIncorrect;
        } else {
            if (!com.miteksystems.misnap.core.ValidationUtil.containsIllegalMrzCharacters(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText()))) {
                str = null;
                textInputLayout.setError(str);
                com.google.android.material.textfield.TextInputLayout textInputLayout2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().d;
                text = nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText();
                if (text != null || kotlin.text.StringsKt.isBlank(text)) {
                    i2 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                } else {
                    if (!com.miteksystems.misnap.core.ValidationUtil.isDobInFuture(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                        str2 = null;
                        textInputLayout2.setError(str2);
                        com.google.android.material.textfield.TextInputLayout textInputLayout3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().j;
                        text2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText();
                        if (text2 != null || kotlin.text.StringsKt.isBlank(text2)) {
                            i3 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                        } else {
                            if (!com.miteksystems.misnap.core.ValidationUtil.isDobAfterDoe(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()), java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText()))) {
                                str3 = null;
                                textInputLayout3.setError(str3);
                                com.google.android.material.textfield.TextInputLayout textInputLayout4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().l;
                                text3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText();
                                if (text3 != null || kotlin.text.StringsKt.isBlank(text3)) {
                                    i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                                } else if (com.miteksystems.misnap.core.ValidationUtil.isIssuingCountryLengthIncorrect(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()))) {
                                    i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorIssuingCountryLengthIncorrect;
                                } else {
                                    if (!com.miteksystems.misnap.core.ValidationUtil.containsIllegalCountryCharacters(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()))) {
                                        str4 = null;
                                        textInputLayout4.setError(str4);
                                        com.google.android.material.textfield.TextInputLayout textInputLayout5 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
                                        text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
                                        if (text4 != null || kotlin.text.StringsKt.isBlank(text4)) {
                                            i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                                        } else {
                                            if (!com.miteksystems.misnap.core.ValidationUtil.isDocumentCodeLengthIncorrect(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()))) {
                                                if (com.miteksystems.misnap.core.ValidationUtil.containsIllegalCountryCharacters(java.lang.String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()))) {
                                                    i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentCodeInvalid;
                                                }
                                                textInputLayout5.setError(str5);
                                            }
                                            i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentCodeLengthIncorrect;
                                        }
                                        str5 = nfcMrzDataManualEntryFragment.getString(i5);
                                        textInputLayout5.setError(str5);
                                    }
                                    i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorIssuingCountryInvalid;
                                }
                                str4 = nfcMrzDataManualEntryFragment.getString(i4);
                                textInputLayout4.setError(str4);
                                com.google.android.material.textfield.TextInputLayout textInputLayout52 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
                                text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
                                if (text4 != null) {
                                }
                                i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                                str5 = nfcMrzDataManualEntryFragment.getString(i5);
                                textInputLayout52.setError(str5);
                            }
                            i3 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDoeIsNotAfterDob;
                        }
                        str3 = nfcMrzDataManualEntryFragment.getString(i3);
                        textInputLayout3.setError(str3);
                        com.google.android.material.textfield.TextInputLayout textInputLayout42 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().l;
                        text3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText();
                        if (text3 != null) {
                        }
                        i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                        str4 = nfcMrzDataManualEntryFragment.getString(i4);
                        textInputLayout42.setError(str4);
                        com.google.android.material.textfield.TextInputLayout textInputLayout522 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
                        text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
                        if (text4 != null) {
                        }
                        i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                        str5 = nfcMrzDataManualEntryFragment.getString(i5);
                        textInputLayout522.setError(str5);
                    }
                    i2 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDobIsInFuture;
                }
                str2 = nfcMrzDataManualEntryFragment.getString(i2);
                textInputLayout2.setError(str2);
                com.google.android.material.textfield.TextInputLayout textInputLayout32 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().j;
                text2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText();
                if (text2 != null) {
                }
                i3 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                str3 = nfcMrzDataManualEntryFragment.getString(i3);
                textInputLayout32.setError(str3);
                com.google.android.material.textfield.TextInputLayout textInputLayout422 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().l;
                text3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText();
                if (text3 != null) {
                }
                i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                str4 = nfcMrzDataManualEntryFragment.getString(i4);
                textInputLayout422.setError(str4);
                com.google.android.material.textfield.TextInputLayout textInputLayout5222 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
                text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
                if (text4 != null) {
                }
                i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
                str5 = nfcMrzDataManualEntryFragment.getString(i5);
                textInputLayout5222.setError(str5);
            }
            i = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentNumberInvalid;
        }
        str = nfcMrzDataManualEntryFragment.getString(i);
        textInputLayout.setError(str);
        com.google.android.material.textfield.TextInputLayout textInputLayout22 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().d;
        text = nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText();
        if (text != null) {
        }
        i2 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
        str2 = nfcMrzDataManualEntryFragment.getString(i2);
        textInputLayout22.setError(str2);
        com.google.android.material.textfield.TextInputLayout textInputLayout322 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().j;
        text2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText();
        if (text2 != null) {
        }
        i3 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
        str3 = nfcMrzDataManualEntryFragment.getString(i3);
        textInputLayout322.setError(str3);
        com.google.android.material.textfield.TextInputLayout textInputLayout4222 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().l;
        text3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText();
        if (text3 != null) {
        }
        i4 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
        str4 = nfcMrzDataManualEntryFragment.getString(i4);
        textInputLayout4222.setError(str4);
        com.google.android.material.textfield.TextInputLayout textInputLayout52222 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
        text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
        if (text4 != null) {
        }
        i5 = com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField;
        str5 = nfcMrzDataManualEntryFragment.getString(i5);
        textInputLayout52222.setError(str5);
    }

    public static /* synthetic */ void $r8$lambda$fk2Pk3xGon4p6uL26uy17NLoMoY(com.google.android.material.datepicker.MaterialDatePicker materialDatePicker, com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(materialDatePicker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "dob_date_picker");
    }

    /* renamed from: $r8$lambda$u7XQgjeHycLlcI3ppixK-kse9MY, reason: not valid java name */
    public static /* synthetic */ void m10949$r8$lambda$u7XQgjeHycLlcI3ppixKkse9MY(com.google.android.material.datepicker.MaterialDatePicker materialDatePicker, com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(materialDatePicker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcMrzDataManualEntryFragment, "");
        materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "doe_date_picker");
    }

    /* renamed from: $r8$lambda$v-jzCC_OjPyQgVE7kcgK5DjcrQU, reason: not valid java name */
    public static /* synthetic */ void m10950$r8$lambda$vjzCC_OjPyQgVE7kcgK5DjcrQU(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
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
        final com.miteksystems.misnap.core.MiSnapSettings value = ((com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue()).getSettings().getValue();
        kotlin.Unit unit = null;
        if (value != null) {
            java.lang.String str3 = (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue();
            if (str3 == null || (str2 = value.workflow.get(str3)) == null) {
                obj = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                obj = companion.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str2);
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings = (com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.getHandleOrientation()) == null) && (b2 = com.miteksystems.misnap.workflow.a.s.b("handleOrientation", getArguments())) == null) {
                b2 = INSTANCE.getDefaultWorkflowSettings(value).getHandleOrientation();
            }
            if (b2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = b2.booleanValue();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
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
                    this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            java.lang.String str4 = (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue();
            if (str4 == null || (str = value.workflow.get(str4)) == null) {
                obj2 = null;
            } else {
                kotlinx.serialization.json.Json.Companion companion4 = kotlinx.serialization.json.Json.INSTANCE;
                companion4.getSerializersModule();
                obj2 = companion4.decodeFromString(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings.INSTANCE.serializer(), str);
            }
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings2 = (com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b3 = workflowSettings2.getShowSkipButton()) == null) && (b3 = com.miteksystems.misnap.workflow.a.s.b("showSkipButton", getArguments())) == null) {
                b3 = INSTANCE.getDefaultWorkflowSettings(value).getShowSkipButton();
            }
            if (b3 != null && b3.booleanValue()) {
                com.google.android.material.button.MaterialButton materialButton = getBinding$workflow_release().f4155o;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.$r8$lambda$JTAUhxH9jv1iqoZlSk3U0GR4v_o(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this, view2);
                    }
                });
            }
            getBinding$workflow_release().n.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.$r8$lambda$4BwEbxvFrWu9gOc2uc1Yuj54Iko(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this, value, view2);
                }
            });
            com.miteksystems.misnap.core.Mrz mrz = value.nfc.getCom.miteksystems.misnap.core.MiSnapSettings.KEY_NFC_MRZ java.lang.String();
            if (mrz != null) {
                if (mrz instanceof com.miteksystems.misnap.core.MrzData) {
                    com.google.android.material.textfield.TextInputEditText textInputEditText = getBinding$workflow_release().g;
                    com.miteksystems.misnap.core.MrzData mrzData = (com.miteksystems.misnap.core.MrzData) mrz;
                    java.lang.String obj3 = kotlin.text.StringsKt.trim(mrzData.getDocumentNumber()).toString();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = obj3.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    textInputEditText.setText(upperCase);
                    getBinding$workflow_release().c.setText(com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(kotlin.text.StringsKt.trim(mrzData.getDateOfBirth()).toString(), com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, true, false, 16, null));
                    getBinding$workflow_release().i.setText(com.miteksystems.misnap.core.DateUtil.getFormattedDate$default(kotlin.text.StringsKt.trim(mrzData.getDateOfExpiry()).toString(), com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, true, false, 16, null));
                    com.google.android.material.textfield.TextInputEditText textInputEditText2 = getBinding$workflow_release().k;
                    java.lang.String obj4 = kotlin.text.StringsKt.trim(mrzData.getCountry()).toString();
                    java.util.Locale locale2 = java.util.Locale.getDefault();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                    java.lang.String upperCase2 = obj4.toUpperCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    textInputEditText2.setText(upperCase2);
                    com.google.android.material.textfield.TextInputEditText textInputEditText3 = getBinding$workflow_release().e;
                    java.lang.String obj5 = kotlin.text.StringsKt.trim(mrzData.getDocumentCode()).toString();
                    java.util.Locale locale3 = java.util.Locale.getDefault();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                    java.lang.String upperCase3 = obj5.toUpperCase(locale3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    textInputEditText3.setText(upperCase3);
                } else {
                    getBinding$workflow_release().q.setText(com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentTitle);
                }
                unit = kotlin.Unit.INSTANCE;
            }
            if (unit == null) {
                getBinding$workflow_release().q.setText(com.miteksystems.misnap.workflow.R.string.misnapWorkflowNfcMrzDataManualEntryFragmentTitle);
            }
            getBinding$workflow_release().g.addTextChangedListener(new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.g());
            com.google.android.material.datepicker.MaterialDatePicker.Builder<java.lang.Long> datePicker = com.google.android.material.datepicker.MaterialDatePicker.Builder.datePicker();
            long parseDate$default = com.miteksystems.misnap.core.DateUtil.parseDate$default(java.lang.String.valueOf(getBinding$workflow_release().c.getText()), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, false, true, 4, null);
            long timeInMillis = com.miteksystems.misnap.core.DateUtil.getUtcCalendar().getTimeInMillis();
            com.google.android.material.datepicker.CalendarConstraints build = new com.google.android.material.datepicker.CalendarConstraints.Builder().setValidator(new com.miteksystems.misnap.workflow.fragment.a(timeInMillis)).setEnd(timeInMillis).setOpenAt(parseDate$default).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            datePicker.setSelection(java.lang.Long.valueOf(parseDate$default));
            datePicker.setCalendarConstraints(build);
            final com.google.android.material.datepicker.MaterialDatePicker<java.lang.Long> build2 = datePicker.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
            final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.h hVar = new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.h();
            build2.addOnPositiveButtonClickListener(new com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2
                @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
                public final void onPositiveButtonClick(java.lang.Object obj6) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.m10950$r8$lambda$vjzCC_OjPyQgVE7kcgK5DjcrQU(kotlin.jvm.functions.Function1.this, obj6);
                }
            });
            getBinding$workflow_release().c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.$r8$lambda$fk2Pk3xGon4p6uL26uy17NLoMoY(com.google.android.material.datepicker.MaterialDatePicker.this, this, view2);
                }
            });
            com.google.android.material.datepicker.MaterialDatePicker.Builder<java.lang.Long> datePicker2 = com.google.android.material.datepicker.MaterialDatePicker.Builder.datePicker();
            long parseDate$default2 = com.miteksystems.misnap.core.DateUtil.parseDate$default(java.lang.String.valueOf(getBinding$workflow_release().i.getText()), com.miteksystems.misnap.core.DateUtil.DISPLAY_DATE_FORMAT, false, false, 12, null);
            com.google.android.material.datepicker.CalendarConstraints build3 = new com.google.android.material.datepicker.CalendarConstraints.Builder().setOpenAt(parseDate$default2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "");
            datePicker2.setSelection(java.lang.Long.valueOf(parseDate$default2));
            datePicker2.setCalendarConstraints(build3);
            final com.google.android.material.datepicker.MaterialDatePicker<java.lang.Long> build4 = datePicker2.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "");
            final com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.d dVar = new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.d();
            build4.addOnPositiveButtonClickListener(new com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda4
                @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
                public final void onPositiveButtonClick(java.lang.Object obj6) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.$r8$lambda$GJcoAxy7GZDW8FdSnSPyndjkkys(kotlin.jvm.functions.Function1.this, obj6);
                }
            });
            getBinding$workflow_release().i.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.m10949$r8$lambda$u7XQgjeHycLlcI3ppixKkse9MY(com.google.android.material.datepicker.MaterialDatePicker.this, this, view2);
                }
            });
            getBinding$workflow_release().k.addTextChangedListener(new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.e());
            getBinding$workflow_release().e.addTextChangedListener(new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.f());
            getBinding$workflow_release().p.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.m10948$r8$lambda$LkDaQ8EczzYeUsE4kW844rTmgM(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this, value, view2);
                }
            });
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel miSnapWorkflowViewModel = (com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel) this.Camera2StreamConfigurationMap.getValue();
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            miSnapWorkflowViewModel.postError$workflow_release(requireContext, com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE);
        }
        com.miteksystems.misnap.workflow.util.AccessibilityUtil accessibilityUtil = com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE;
        android.widget.TextView textView = getBinding$workflow_release().q;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "");
        accessibilityUtil.adjustScalingForAccessibility$workflow_release(textView);
        com.miteksystems.misnap.workflow.util.TextUtil textUtil = com.miteksystems.misnap.workflow.util.TextUtil.INSTANCE;
        android.widget.LinearLayout linearLayout = getBinding$workflow_release().m;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        java.util.Iterator it = textUtil.getTextViews$workflow_release(linearLayout).iterator();
        while (it.hasNext()) {
            com.miteksystems.misnap.workflow.util.AccessibilityUtil.INSTANCE.adjustScalingForAccessibility$workflow_release((android.widget.TextView) it.next());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$e;", "Landroid/text/TextWatcher;", "", lib.android.paypal.com.magnessdk.g.n2, "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged"}, k = 1, mv = {1, 8, 0})
    public static final class e implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public final void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
            java.lang.String valueOf = java.lang.String.valueOf(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().k.getText());
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = valueOf.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, upperCase)) {
                return;
            }
            int selectionEnd = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().k.getSelectionEnd();
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().k.setText(upperCase);
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().k.setSelection(selectionEnd);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable s) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        e() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$f;", "Landroid/text/TextWatcher;", "", lib.android.paypal.com.magnessdk.g.n2, "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged"}, k = 1, mv = {1, 8, 0})
    public static final class f implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public final void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
            java.lang.String valueOf = java.lang.String.valueOf(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().e.getText());
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = valueOf.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, upperCase)) {
                return;
            }
            int selectionEnd = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().e.getSelectionEnd();
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().e.setText(upperCase);
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().e.setSelection(selectionEnd);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable s) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        f() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$g;", "Landroid/text/TextWatcher;", "", lib.android.paypal.com.magnessdk.g.n2, "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged"}, k = 1, mv = {1, 8, 0})
    public static final class g implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public final void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
            java.lang.String valueOf = java.lang.String.valueOf(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().g.getText());
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = valueOf.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, upperCase)) {
                return;
            }
            int selectionEnd = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().g.getSelectionEnd();
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().g.setText(upperCase);
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this.getBinding$workflow_release().g.setSelection(selectionEnd);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable s) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        }

        g() {
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
                androidx.view.fragment.FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.getHighSpeedVideoSizes);
            } catch (java.lang.Exception unused) {
                getHighResolutionOutputSizeshNQ4ISI();
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
            com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.view.NavDestination currentDestination = androidx.view.fragment.FragmentKt.findNavController(nfcMrzDataManualEntryFragment).getCurrentDestination();
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

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.i getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.i) this.binding.getValue2((androidx.fragment.app.Fragment) this, getHighSpeedVideoSizes[0]);
    }

    public NfcMrzDataManualEntryFragment() {
        super(com.miteksystems.misnap.workflow.R.layout.misnap_fragment_nfc_mrzdata_manual_entry);
        this.binding = com.miteksystems.misnap.workflow.util.ViewBindingUtil.INSTANCE.viewBinding(this, com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.a.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.b());
        this.getHighSpeedVideoSizes = new androidx.navigation.NavController.OnDestinationChangedListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda7
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public final void onDestinationChanged(androidx.view.NavController navController, androidx.view.NavDestination navDestination, android.os.Bundle bundle) {
                com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.m10947$r8$lambda$Aq26SNUL3DR0SsmPejNM7W42nI(com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.this, navController, navDestination, bundle);
            }
        };
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment.c());
    }
}
