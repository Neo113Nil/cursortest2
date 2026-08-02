package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "<init>", "()V", "BarcodeAnalysis", "DocumentAnalysis", "FaceAnalysis", "Failover", "Help", "MrzManualEntry", "NavigateBarcodeSession", "NavigateDocumentSession", "NavigateFaceSession", "NavigateNfcSession", "NavigateVoiceSession", "NfcReader", "NfcSelection", "Review", "VoicePhraseSelection", "VoiceProcessor", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$BarcodeAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Help;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateBarcodeSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateDocumentSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateFaceSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateNfcSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateVoiceSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcReader;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoicePhraseSelection;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class NavigationAction {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$BarcodeAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateHelp", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$BarcodeAnalysis$NavigateHelp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class BarcodeAnalysis extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private BarcodeAnalysis() {
            super(null);
        }

        public /* synthetic */ BarcodeAnalysis(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$BarcodeAnalysis$NavigateHelp;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$BarcodeAnalysis;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateHelp extends com.miteksystems.misnap.workflow.fragment.NavigationAction.BarcodeAnalysis {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.BarcodeAnalysis.NavigateHelp INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.BarcodeAnalysis.NavigateHelp();

            private NavigateHelp() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateFailover", "NavigateHelp", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis$NavigateFailover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis$NavigateHelp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class DocumentAnalysis extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private DocumentAnalysis() {
            super(null);
        }

        public /* synthetic */ DocumentAnalysis(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis$NavigateFailover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateFailover extends com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis.NavigateFailover INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis.NavigateFailover();

            private NavigateFailover() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis$NavigateHelp;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$DocumentAnalysis;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateHelp extends com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis.NavigateHelp INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.DocumentAnalysis.NavigateHelp();

            private NavigateHelp() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateFailover", "NavigateHelp", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis$NavigateFailover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis$NavigateHelp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FaceAnalysis extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private FaceAnalysis() {
            super(null);
        }

        public /* synthetic */ FaceAnalysis(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis$NavigateFailover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateFailover extends com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis.NavigateFailover INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis.NavigateFailover();

            private NavigateFailover() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis$NavigateHelp;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$FaceAnalysis;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateHelp extends com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis.NavigateHelp INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.FaceAnalysis.NavigateHelp();

            private NavigateHelp() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateRetryAuto", "NavigateRetryManual", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover$NavigateRetryAuto;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover$NavigateRetryManual;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Failover extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private Failover() {
            super(null);
        }

        public /* synthetic */ Failover(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover$NavigateRetryAuto;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateRetryAuto extends com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryAuto INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryAuto();

            private NavigateRetryAuto() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover$NavigateRetryManual;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Failover;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateRetryManual extends com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryManual INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.Failover.NavigateRetryManual();

            private NavigateRetryManual() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Help;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateContinue", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Help$NavigateContinue;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Help extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private Help() {
            super(null);
        }

        public /* synthetic */ Help(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Help$NavigateContinue;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Help;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateContinue extends com.miteksystems.misnap.workflow.fragment.NavigationAction.Help {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.Help.NavigateContinue INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.Help.NavigateContinue();

            private NavigateContinue() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateContinue", "NavigateSkip", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry$NavigateContinue;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry$NavigateSkip;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MrzManualEntry extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private MrzManualEntry() {
            super(null);
        }

        public /* synthetic */ MrzManualEntry(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry$NavigateContinue;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateContinue extends com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateContinue INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateContinue();

            private NavigateContinue() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry$NavigateSkip;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$MrzManualEntry;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateSkip extends com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateSkip INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.MrzManualEntry.NavigateSkip();

            private NavigateSkip() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcReader;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateSkip", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcReader$NavigateSkip;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class NfcReader extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private NfcReader() {
            super(null);
        }

        public /* synthetic */ NfcReader(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcReader$NavigateSkip;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcReader;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateSkip extends com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcReader {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcReader.NavigateSkip INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcReader.NavigateSkip();

            private NavigateSkip() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateMrz1LineManualEntry", "NavigateMrzDataManualEntry", "NavigateNfc", "NavigateSkip", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateMrz1LineManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateMrzDataManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateNfc;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateSkip;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class NfcSelection extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private NfcSelection() {
            super(null);
        }

        public /* synthetic */ NfcSelection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateMrz1LineManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateMrz1LineManualEntry extends com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrz1LineManualEntry INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrz1LineManualEntry();

            private NavigateMrz1LineManualEntry() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateMrzDataManualEntry;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateMrzDataManualEntry extends com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrzDataManualEntry INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateMrzDataManualEntry();

            private NavigateMrzDataManualEntry() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateNfc;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateNfc extends com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateNfc INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateNfc();

            private NavigateNfc() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection$NavigateSkip;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NfcSelection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateSkip extends com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateSkip INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.NfcSelection.NavigateSkip();

            private NavigateSkip() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateRetake", "NavigateSatisfied", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review$NavigateRetake;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review$NavigateSatisfied;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Review extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private Review() {
            super(null);
        }

        public /* synthetic */ Review(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review$NavigateRetake;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateRetake extends com.miteksystems.misnap.workflow.fragment.NavigationAction.Review {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateRetake INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateRetake();

            private NavigateRetake() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review$NavigateSatisfied;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$Review;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateSatisfied extends com.miteksystems.misnap.workflow.fragment.NavigationAction.Review {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateSatisfied INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.Review.NavigateSatisfied();

            private NavigateSatisfied() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoicePhraseSelection;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateContinue", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoicePhraseSelection$NavigateContinue;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class VoicePhraseSelection extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private VoicePhraseSelection() {
            super(null);
        }

        public /* synthetic */ VoicePhraseSelection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoicePhraseSelection$NavigateContinue;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoicePhraseSelection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateContinue extends com.miteksystems.misnap.workflow.fragment.NavigationAction.VoicePhraseSelection {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.VoicePhraseSelection.NavigateContinue INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.VoicePhraseSelection.NavigateContinue();

            private NavigateContinue() {
                super(null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "<init>", "()V", "NavigateHelp", "NavigateSkip", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor$NavigateHelp;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor$NavigateSkip;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class VoiceProcessor extends com.miteksystems.misnap.workflow.fragment.NavigationAction {
        private VoiceProcessor() {
            super(null);
        }

        public /* synthetic */ VoiceProcessor(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor$NavigateHelp;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateHelp extends com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor.NavigateHelp INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor.NavigateHelp();

            private NavigateHelp() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor$NavigateSkip;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$VoiceProcessor;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateSkip extends com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor {
            public static final com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor.NavigateSkip INSTANCE = new com.miteksystems.misnap.workflow.fragment.NavigationAction.VoiceProcessor.NavigateSkip();

            private NavigateSkip() {
                super(null);
            }
        }
    }

    public /* synthetic */ NavigationAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateBarcodeSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "navGraphId", "<init>", "(I)V", "a", com.visa.cbp.getEncExpo.warmup, "getNavGraphId", "()I"}, k = 1, mv = {1, 8, 0})
    public static final class NavigateBarcodeSession extends com.miteksystems.misnap.workflow.fragment.NavigationAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int navGraphId;

        public final int getNavGraphId() {
            return this.navGraphId;
        }

        public NavigateBarcodeSession(int i) {
            super(null);
            this.navGraphId = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateDocumentSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "navGraphId", "<init>", "(I)V", "a", com.visa.cbp.getEncExpo.warmup, "getNavGraphId", "()I"}, k = 1, mv = {1, 8, 0})
    public static final class NavigateDocumentSession extends com.miteksystems.misnap.workflow.fragment.NavigationAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int navGraphId;

        public final int getNavGraphId() {
            return this.navGraphId;
        }

        public NavigateDocumentSession(int i) {
            super(null);
            this.navGraphId = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateFaceSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "navGraphId", "<init>", "(I)V", "a", com.visa.cbp.getEncExpo.warmup, "getNavGraphId", "()I"}, k = 1, mv = {1, 8, 0})
    public static final class NavigateFaceSession extends com.miteksystems.misnap.workflow.fragment.NavigationAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int navGraphId;

        public final int getNavGraphId() {
            return this.navGraphId;
        }

        public NavigateFaceSession(int i) {
            super(null);
            this.navGraphId = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateNfcSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "navGraphId", "<init>", "(I)V", "a", com.visa.cbp.getEncExpo.warmup, "getNavGraphId", "()I"}, k = 1, mv = {1, 8, 0})
    public static final class NavigateNfcSession extends com.miteksystems.misnap.workflow.fragment.NavigationAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int navGraphId;

        public final int getNavGraphId() {
            return this.navGraphId;
        }

        public NavigateNfcSession(int i) {
            super(null);
            this.navGraphId = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NavigationAction$NavigateVoiceSession;", "Lcom/miteksystems/misnap/workflow/fragment/NavigationAction;", "", "navGraphId", "<init>", "(I)V", "a", com.visa.cbp.getEncExpo.warmup, "getNavGraphId", "()I"}, k = 1, mv = {1, 8, 0})
    public static final class NavigateVoiceSession extends com.miteksystems.misnap.workflow.fragment.NavigationAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int navGraphId;

        public final int getNavGraphId() {
            return this.navGraphId;
        }

        public NavigateVoiceSession(int i) {
            super(null);
            this.navGraphId = i;
        }
    }

    private NavigationAction() {
    }
}
