package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:,\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001,6789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`a"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadSettings", "SettingsLoaded", "SettingsLoadFailed", "RetryLoadSettings", "UnlinkEmail", "UnlinkSuccess", "UnlinkFailed", "LinkEmail", "OAuthUrlRetrieved", "OAuthUrlFailed", "LinkSuccess", "LinkFailed", "LinkCancelled", "DismissLinkSuccess", "DismissUnlinkSuccess", "DismissErrorBanner", "DismissUnlinkSheet", "LinkedEmailInfo", "AmazonPreferencesInfo", "OpenWebView", "CloseWebView", "DeeplinkDataReceived", "DeeplinkStateResolved", "DeepLinkRelinkCheck", "AlreadyRelinked", "RequiresRelink", "ShowRelinkSheet", "DismissAlreadyRelinked", "DismissRelinkSheet", "RelinkSheetLinkClicked", com.paypal.oslo.feature.packagetracking.graphql.DeleteImportedDataMutation.OPERATION_NAME, "DeleteImportedDataSuccess", "DeleteImportedDataFailed", "DismissDeleteImportedDataSuccess", "DismissDeleteImportedDataSheet", "DeauthorizeAll", "DeauthorizeAllSuccess", "DeauthorizeAllFailed", "DismissDeauthorizeAllSuccess", "DismissDeauthorizeAllSheet", "AmazonTrackingPreferenceLoaded", "AmazonTrackingToggled", "AmazonTrackingToggleSuccess", "AmazonTrackingToggleFailed", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AlreadyRelinked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingPreferenceLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggled;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$CloseWebView;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAllFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAllSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeepLinkRelinkCheck;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkDataReceived;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkStateResolved;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedDataFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedDataSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissAlreadyRelinked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeauthorizeAllSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeauthorizeAllSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeleteImportedDataSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeleteImportedDataSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissErrorBanner;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissLinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissRelinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissUnlinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissUnlinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkCancelled;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LoadSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlRetrieved;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OpenWebView;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RelinkSheetLinkClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RequiresRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RetryLoadSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoadFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$ShowRelinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageSettingsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageSettingsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LoadSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadSettings extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LoadSettings INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LoadSettings();

        public final int hashCode() {
            return -2003563213;
        }

        private LoadSettings() {
            super("LoadSettings", null);
        }

        public final java.lang.String toString() {
            return "LoadSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LoadSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "linkedEmailAccounts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinkedEmailAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SettingsLoaded extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedEmailAccounts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingsLoaded(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list) {
            super("SettingsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.linkedEmailAccounts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> getLinkedEmailAccounts() {
            return this.linkedEmailAccounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.linkedEmailAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingsLoaded(linkedEmailAccounts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.linkedEmailAccounts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedEmailAccounts, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded) other).linkedEmailAccounts);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded copy(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedEmailAccounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedEmailAccounts, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded(linkedEmailAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> component1() {
            return this.linkedEmailAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded settingsLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = settingsLoaded.linkedEmailAccounts;
            }
            return settingsLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoadFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$SettingsLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SettingsLoadFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingsLoadFailed(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("SettingsLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingsLoadFailed(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed settingsLoadFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, settingsLoadFailed.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, settingsLoadFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed(errorTitle, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed settingsLoadFailed, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = settingsLoadFailed.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = settingsLoadFailed.errorMessage;
            }
            return settingsLoadFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RetryLoadSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoadSettings extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RetryLoadSettings INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RetryLoadSettings();

        public final int hashCode() {
            return -1254415833;
        }

        private RetryLoadSettings() {
            super("RetryLoadSettings", null);
        }

        public final java.lang.String toString() {
            return "RetryLoadSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RetryLoadSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "UnlinkClicked", "ConfirmUnlink", "CancelUnlink", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$CancelUnlink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$ConfirmUnlink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$UnlinkClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UnlinkEmail extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private UnlinkEmail(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$UnlinkClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$UnlinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnlinkClicked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnlinkClicked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
                super("UnlinkEmail.UnlinkClicked", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                this.emailProvider = emailProvider;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlinkClicked(emailProvider=");
                sb.append(emailProvider);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.emailProvider.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked) other).emailProvider;
            }

            public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked(emailProvider);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.UnlinkClicked unlinkClicked, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    emailProvider = unlinkClicked.emailProvider;
                }
                return unlinkClicked.copy(emailProvider);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$ConfirmUnlink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "deleteImportedData", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$ConfirmUnlink;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider", "Z", "getDeleteImportedData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmUnlink extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail {
            public static final int $stable = 0;
            private final boolean deleteImportedData;
            private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmUnlink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z) {
                super("UnlinkEmail.ConfirmUnlink", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                this.emailProvider = emailProvider;
                this.deleteImportedData = z;
            }

            public /* synthetic */ ConfirmUnlink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(emailProvider, (i & 2) != 0 ? false : z);
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public final boolean getDeleteImportedData() {
                return this.deleteImportedData;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
                boolean z = this.deleteImportedData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmUnlink(emailProvider=");
                sb.append(emailProvider);
                sb.append(", deleteImportedData=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.emailProvider.hashCode() * 31) + java.lang.Boolean.hashCode(this.deleteImportedData);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink)) {
                    return false;
                }
                com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink confirmUnlink = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink) other;
                return this.emailProvider == confirmUnlink.emailProvider && this.deleteImportedData == confirmUnlink.deleteImportedData;
            }

            public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean deleteImportedData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink(emailProvider, deleteImportedData);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getDeleteImportedData() {
                return this.deleteImportedData;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink confirmUnlink, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    emailProvider = confirmUnlink.emailProvider;
                }
                if ((i & 2) != 0) {
                    z = confirmUnlink.deleteImportedData;
                }
                return confirmUnlink.copy(emailProvider, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail$CancelUnlink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkEmail;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CancelUnlink extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.CancelUnlink INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.CancelUnlink();

            public final int hashCode() {
                return -170293028;
            }

            private CancelUnlink() {
                super("UnlinkEmail.CancelUnlink", null);
            }

            public final java.lang.String toString() {
                return "CancelUnlink";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.CancelUnlink)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ UnlinkEmail(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkSuccess();

        public final int hashCode() {
            return 1380349350;
        }

        private UnlinkSuccess() {
            super("UnlinkSuccess", null);
        }

        public final java.lang.String toString() {
            return "UnlinkSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$UnlinkFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlinkFailed(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("UnlinkFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlinkFailed(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed unlinkFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, unlinkFailed.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, unlinkFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed(errorTitle, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed unlinkFailed, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = unlinkFailed.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = unlinkFailed.errorMessage;
            }
            return unlinkFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "LinkClicked", "OAuthFlowCompleted", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$LinkClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$OAuthFlowCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LinkEmail extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private LinkEmail(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$LinkClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$LinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LinkClicked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkClicked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
                super("LinkEmail.LinkClicked", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                this.emailProvider = emailProvider;
            }

            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkClicked(emailProvider=");
                sb.append(emailProvider);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.emailProvider.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked) other).emailProvider;
            }

            public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
                return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
                return this.emailProvider;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked linkClicked, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    emailProvider = linkClicked.emailProvider;
                }
                return linkClicked.copy(emailProvider);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$OAuthFlowCompleted;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkEmail$OAuthFlowCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OAuthFlowCompleted extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OAuthFlowCompleted(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult oAuthFlowResult) {
                super("LinkEmail.OAuthFlowCompleted", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthFlowResult, "");
                this.result = oAuthFlowResult;
            }

            public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult oAuthFlowResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthFlowCompleted(result=");
                sb.append(oAuthFlowResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted) other).result);
            }

            public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted copy(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted oAuthFlowCompleted, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult oAuthFlowResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oAuthFlowResult = oAuthFlowCompleted.result;
                }
                return oAuthFlowCompleted.copy(oAuthFlowResult);
            }
        }

        public /* synthetic */ LinkEmail(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlRetrieved;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "authUrl", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlRetrieved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider", "Ljava/lang/String;", "getAuthUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OAuthUrlRetrieved extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final java.lang.String authUrl;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthUrlRetrieved(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str) {
            super("OAuthUrlRetrieved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.provider = emailProvider;
            this.authUrl = str;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String getAuthUrl() {
            return this.authUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.String str = this.authUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthUrlRetrieved(provider=");
            sb.append(emailProvider);
            sb.append(", authUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.authUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved oAuthUrlRetrieved = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved) other;
            return this.provider == oAuthUrlRetrieved.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.authUrl, oAuthUrlRetrieved.authUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String authUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authUrl, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved(provider, authUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAuthUrl() {
            return this.authUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved oAuthUrlRetrieved, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = oAuthUrlRetrieved.provider;
            }
            if ((i & 2) != 0) {
                str = oAuthUrlRetrieved.authUrl;
            }
            return oAuthUrlRetrieved.copy(emailProvider, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/LinkingFailed;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "errorMessage", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OAuthUrlFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider", "Ljava/lang/String;", "getErrorMessage", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OAuthUrlFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent, com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthUrlFailed(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2) {
            super("OAuthUrlFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.provider = emailProvider;
            this.errorMessage = str;
            this.errorCode = str2;
        }

        public /* synthetic */ OAuthUrlFailed(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(emailProvider, str, (i & 4) != 0 ? null : str2);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        @Override // com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthUrlFailed(provider=");
            sb.append(emailProvider);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.provider.hashCode();
            int hashCode2 = this.errorMessage.hashCode();
            java.lang.String str = this.errorCode;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed oAuthUrlFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed) other;
            return this.provider == oAuthUrlFailed.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, oAuthUrlFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, oAuthUrlFailed.errorCode);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String errorMessage, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed(provider, errorMessage, errorCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlFailed oAuthUrlFailed, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = oAuthUrlFailed.provider;
            }
            if ((i & 2) != 0) {
                str = oAuthUrlFailed.errorMessage;
            }
            if ((i & 4) != 0) {
                str2 = oAuthUrlFailed.errorCode;
            }
            return oAuthUrlFailed.copy(emailProvider, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkSuccess(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("LinkSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.provider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkSuccess(provider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.provider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess) && this.provider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess) other).provider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess(provider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess linkSuccess, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = linkSuccess.provider;
            }
            return linkSuccess.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/LinkingFailed;", "", "errorMessage", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent, com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkFailed(java.lang.String str, java.lang.String str2) {
            super("LinkFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.errorCode = str2;
        }

        public /* synthetic */ LinkFailed(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.feature.packagetracking.ui.settings.LinkingFailed
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkFailed(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorMessage.hashCode();
            java.lang.String str = this.errorCode;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed linkFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, linkFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, linkFailed.errorCode);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed copy(java.lang.String errorMessage, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed(errorMessage, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed linkFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = linkFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                str2 = linkFailed.errorCode;
            }
            return linkFailed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkCancelled;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkCancelled extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkCancelled INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkCancelled();

        public final int hashCode() {
            return 1526089133;
        }

        private LinkCancelled() {
            super("LinkCancelled", null);
        }

        public final java.lang.String toString() {
            return "LinkCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissLinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissLinkSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissLinkSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissLinkSuccess();

        public final int hashCode() {
            return -105630647;
        }

        private DismissLinkSuccess() {
            super("DismissLinkSuccess", null);
        }

        public final java.lang.String toString() {
            return "DismissLinkSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissLinkSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissUnlinkSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissUnlinkSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSuccess();

        public final int hashCode() {
            return 952849424;
        }

        private DismissUnlinkSuccess() {
            super("DismissUnlinkSuccess", null);
        }

        public final java.lang.String toString() {
            return "DismissUnlinkSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissErrorBanner;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissErrorBanner extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissErrorBanner INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissErrorBanner();

        public final int hashCode() {
            return 2137108724;
        }

        private DismissErrorBanner() {
            super("DismissErrorBanner", null);
        }

        public final java.lang.String toString() {
            return "DismissErrorBanner";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissErrorBanner)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissUnlinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissUnlinkSheet extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSheet();

        public final int hashCode() {
            return -2059726676;
        }

        private DismissUnlinkSheet() {
            super("DismissUnlinkSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissUnlinkSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissUnlinkSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Confirm", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo$Confirm;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo$Dismiss;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LinkedEmailInfo extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private LinkedEmailInfo(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo$Confirm;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Confirm extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Confirm INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Confirm();

            public final int hashCode() {
                return 919482809;
            }

            private Confirm() {
                super("LinkedEmailInfo.Confirm", null);
            }

            public final java.lang.String toString() {
                return "Confirm";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Confirm)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo$Dismiss;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$LinkedEmailInfo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Dismiss extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Dismiss INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Dismiss();

            public final int hashCode() {
                return 1640037763;
            }

            private Dismiss() {
                super("LinkedEmailInfo.Dismiss", null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkedEmailInfo.Dismiss)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ LinkedEmailInfo(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Confirm", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo$Confirm;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo$Dismiss;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AmazonPreferencesInfo extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private AmazonPreferencesInfo(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo$Confirm;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Confirm extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Confirm INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Confirm();

            public final int hashCode() {
                return 472930570;
            }

            private Confirm() {
                super("AmazonPreferencesInfo.Confirm", null);
            }

            public final java.lang.String toString() {
                return "Confirm";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Confirm)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo$Dismiss;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonPreferencesInfo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Dismiss extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Dismiss INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Dismiss();

            public final int hashCode() {
                return 1193485524;
            }

            private Dismiss() {
                super("AmazonPreferencesInfo.Dismiss", null);
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonPreferencesInfo.Dismiss)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ AmazonPreferencesInfo(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OpenWebView;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$OpenWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenWebView extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenWebView(java.lang.String str) {
            super("OpenWebView", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenWebView(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OpenWebView openWebView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openWebView.url;
            }
            return openWebView.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$CloseWebView;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseWebView extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.CloseWebView INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.CloseWebView();

        public final int hashCode() {
            return -548622069;
        }

        private CloseWebView() {
            super("CloseWebView", null);
        }

        public final java.lang.String toString() {
            return "CloseWebView";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.CloseWebView)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkDataReceived;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DEEP_LINK_DATA_KEY, "<init>", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkDataReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "getDeeplinkData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeeplinkDataReceived extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplinkDataReceived(com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData) {
            super("DeeplinkDataReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkData, "");
            this.deeplinkData = deeplinkData;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData getDeeplinkData() {
            return this.deeplinkData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData = this.deeplinkData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeeplinkDataReceived(deeplinkData=");
            sb.append(deeplinkData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deeplinkData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkData, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived) other).deeplinkData);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived copy(com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkData, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived(deeplinkData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData getDeeplinkData() {
            return this.deeplinkData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived deeplinkDataReceived, com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deeplinkData = deeplinkDataReceived.deeplinkData;
            }
            return deeplinkDataReceived.copy(deeplinkData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkStateResolved;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "deeplinkState", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeeplinkStateResolved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "getDeeplinkState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeeplinkStateResolved extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState deeplinkState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeeplinkStateResolved(com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState) {
            super("DeeplinkStateResolved", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDeeplinkState, "");
            this.deeplinkState = settingsDeeplinkState;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState getDeeplinkState() {
            return this.deeplinkState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState = this.deeplinkState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeeplinkStateResolved(deeplinkState=");
            sb.append(settingsDeeplinkState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deeplinkState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkState, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved) other).deeplinkState);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved copy(com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState deeplinkState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkState, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved(deeplinkState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState getDeeplinkState() {
            return this.deeplinkState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved deeplinkStateResolved, com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                settingsDeeplinkState = deeplinkStateResolved.deeplinkState;
            }
            return deeplinkStateResolved.copy(settingsDeeplinkState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J>\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeepLinkRelinkCheck;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "linkedEmailAccounts", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "showErrorBanner", "isNativePushReminder", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZZ)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeepLinkRelinkCheck;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinkedEmailAccounts", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider", "Z", "getShowErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeepLinkRelinkCheck extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;
        private final boolean isNativePushReminder;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedEmailAccounts;
        private final boolean showErrorBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLinkRelinkCheck(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2) {
            super("DeepLinkRelinkCheck", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.linkedEmailAccounts = list;
            this.emailProvider = emailProvider;
            this.showErrorBanner = z;
            this.isNativePushReminder = z2;
        }

        public /* synthetic */ DeepLinkRelinkCheck(java.util.List list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, emailProvider, z, (i & 8) != 0 ? false : z2);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> getLinkedEmailAccounts() {
            return this.linkedEmailAccounts;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        public final boolean isNativePushReminder() {
            return this.isNativePushReminder;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.linkedEmailAccounts;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            boolean z = this.showErrorBanner;
            boolean z2 = this.isNativePushReminder;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeepLinkRelinkCheck(linkedEmailAccounts=");
            sb.append(list);
            sb.append(", emailProvider=");
            sb.append(emailProvider);
            sb.append(", showErrorBanner=");
            sb.append(z);
            sb.append(", isNativePushReminder=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.linkedEmailAccounts.hashCode() * 31) + this.emailProvider.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showErrorBanner)) * 31) + java.lang.Boolean.hashCode(this.isNativePushReminder);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck deepLinkRelinkCheck = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedEmailAccounts, deepLinkRelinkCheck.linkedEmailAccounts) && this.emailProvider == deepLinkRelinkCheck.emailProvider && this.showErrorBanner == deepLinkRelinkCheck.showErrorBanner && this.isNativePushReminder == deepLinkRelinkCheck.isNativePushReminder;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck copy(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedEmailAccounts, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean showErrorBanner, boolean isNativePushReminder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedEmailAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck(linkedEmailAccounts, emailProvider, showErrorBanner, isNativePushReminder);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsNativePushReminder() {
            return this.isNativePushReminder;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> component1() {
            return this.linkedEmailAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck deepLinkRelinkCheck, java.util.List list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = deepLinkRelinkCheck.linkedEmailAccounts;
            }
            if ((i & 2) != 0) {
                emailProvider = deepLinkRelinkCheck.emailProvider;
            }
            if ((i & 4) != 0) {
                z = deepLinkRelinkCheck.showErrorBanner;
            }
            if ((i & 8) != 0) {
                z2 = deepLinkRelinkCheck.isNativePushReminder;
            }
            return deepLinkRelinkCheck.copy(list, emailProvider, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AlreadyRelinked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AlreadyRelinked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AlreadyRelinked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyRelinked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("AlreadyRelinked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlreadyRelinked(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked alreadyRelinked, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = alreadyRelinked.emailProvider;
            }
            return alreadyRelinked.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RequiresRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "showErrorBanner", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RequiresRelink;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider", "Z", "getShowErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequiresRelink extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;
        private final boolean showErrorBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiresRelink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z) {
            super("RequiresRelink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
            this.showErrorBanner = z;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            boolean z = this.showErrorBanner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequiresRelink(emailProvider=");
            sb.append(emailProvider);
            sb.append(", showErrorBanner=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.emailProvider.hashCode() * 31) + java.lang.Boolean.hashCode(this.showErrorBanner);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink requiresRelink = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink) other;
            return this.emailProvider == requiresRelink.emailProvider && this.showErrorBanner == requiresRelink.showErrorBanner;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean showErrorBanner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink(emailProvider, showErrorBanner);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink requiresRelink, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = requiresRelink.emailProvider;
            }
            if ((i & 2) != 0) {
                z = requiresRelink.showErrorBanner;
            }
            return requiresRelink.copy(emailProvider, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$ShowRelinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$ShowRelinkSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowRelinkSheet extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRelinkSheet(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("ShowRelinkSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowRelinkSheet(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet showRelinkSheet, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = showRelinkSheet.emailProvider;
            }
            return showRelinkSheet.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissAlreadyRelinked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAlreadyRelinked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissAlreadyRelinked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissAlreadyRelinked();

        public final int hashCode() {
            return -321877980;
        }

        private DismissAlreadyRelinked() {
            super("DismissAlreadyRelinked", null);
        }

        public final java.lang.String toString() {
            return "DismissAlreadyRelinked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissAlreadyRelinked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissRelinkSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissRelinkSheet extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissRelinkSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissRelinkSheet();

        public final int hashCode() {
            return 804781650;
        }

        private DismissRelinkSheet() {
            super("DismissRelinkSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissRelinkSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissRelinkSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RelinkSheetLinkClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$RelinkSheetLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelinkSheetLinkClicked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelinkSheetLinkClicked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("RelinkSheetLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelinkSheetLinkClicked(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked relinkSheetLinkClicked, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = relinkSheetLinkClicked.emailProvider;
            }
            return relinkSheetLinkClicked.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "DeleteImportedDataClicked", "ConfirmDeleteImportedData", "CancelDeleteImportedData", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$CancelDeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$ConfirmDeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$DeleteImportedDataClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DeleteImportedData extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private DeleteImportedData(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$DeleteImportedDataClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeleteImportedDataClicked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.DeleteImportedDataClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.DeleteImportedDataClicked();

            public final int hashCode() {
                return 707330595;
            }

            private DeleteImportedDataClicked() {
                super("DeleteImportedData.DeleteImportedDataClicked", null);
            }

            public final java.lang.String toString() {
                return "DeleteImportedDataClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.DeleteImportedDataClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$ConfirmDeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmDeleteImportedData extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.ConfirmDeleteImportedData INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.ConfirmDeleteImportedData();

            public final int hashCode() {
                return 61007694;
            }

            private ConfirmDeleteImportedData() {
                super("DeleteImportedData.ConfirmDeleteImportedData", null);
            }

            public final java.lang.String toString() {
                return "ConfirmDeleteImportedData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.ConfirmDeleteImportedData)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData$CancelDeleteImportedData;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedData;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CancelDeleteImportedData extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.CancelDeleteImportedData INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.CancelDeleteImportedData();

            public final int hashCode() {
                return 654059838;
            }

            private CancelDeleteImportedData() {
                super("DeleteImportedData.CancelDeleteImportedData", null);
            }

            public final java.lang.String toString() {
                return "CancelDeleteImportedData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.CancelDeleteImportedData)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ DeleteImportedData(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedDataSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteImportedDataSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataSuccess();

        public final int hashCode() {
            return 1190628832;
        }

        private DeleteImportedDataSuccess() {
            super("DeleteImportedDataSuccess", null);
        }

        public final java.lang.String toString() {
            return "DeleteImportedDataSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedDataFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeleteImportedDataFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteImportedDataFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteImportedDataFailed(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("DeleteImportedDataFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteImportedDataFailed(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed deleteImportedDataFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, deleteImportedDataFailed.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, deleteImportedDataFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed(errorTitle, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed deleteImportedDataFailed, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = deleteImportedDataFailed.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = deleteImportedDataFailed.errorMessage;
            }
            return deleteImportedDataFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeleteImportedDataSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDeleteImportedDataSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSuccess();

        public final int hashCode() {
            return -379577014;
        }

        private DismissDeleteImportedDataSuccess() {
            super("DismissDeleteImportedDataSuccess", null);
        }

        public final java.lang.String toString() {
            return "DismissDeleteImportedDataSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeleteImportedDataSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDeleteImportedDataSheet extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSheet();

        public final int hashCode() {
            return 17096806;
        }

        private DismissDeleteImportedDataSheet() {
            super("DismissDeleteImportedDataSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissDeleteImportedDataSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeleteImportedDataSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "DeauthorizeAllClicked", "ConfirmDeauthorizeAll", "CancelDeauthorizeAll", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$CancelDeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$ConfirmDeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$DeauthorizeAllClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DeauthorizeAll extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;

        private DeauthorizeAll(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$DeauthorizeAllClicked;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeauthorizeAllClicked extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.DeauthorizeAllClicked INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.DeauthorizeAllClicked();

            public final int hashCode() {
                return 448333219;
            }

            private DeauthorizeAllClicked() {
                super("DeauthorizeAll.DeauthorizeAllClicked", null);
            }

            public final java.lang.String toString() {
                return "DeauthorizeAllClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.DeauthorizeAllClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$ConfirmDeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll;", "", "deleteImportedData", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$ConfirmDeauthorizeAll;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDeleteImportedData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmDeauthorizeAll extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll {
            public static final int $stable = 0;
            private final boolean deleteImportedData;

            public ConfirmDeauthorizeAll(boolean z) {
                super("DeauthorizeAll.ConfirmDeauthorizeAll", null);
                this.deleteImportedData = z;
            }

            public final boolean getDeleteImportedData() {
                return this.deleteImportedData;
            }

            public final java.lang.String toString() {
                boolean z = this.deleteImportedData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmDeauthorizeAll(deleteImportedData=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.deleteImportedData);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll) && this.deleteImportedData == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll) other).deleteImportedData;
            }

            public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll copy(boolean deleteImportedData) {
                return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll(deleteImportedData);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getDeleteImportedData() {
                return this.deleteImportedData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll confirmDeauthorizeAll, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = confirmDeauthorizeAll.deleteImportedData;
                }
                return confirmDeauthorizeAll.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll$CancelDeauthorizeAll;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAll;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CancelDeauthorizeAll extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.CancelDeauthorizeAll INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.CancelDeauthorizeAll();

            public final int hashCode() {
                return 1627437758;
            }

            private CancelDeauthorizeAll() {
                super("DeauthorizeAll.CancelDeauthorizeAll", null);
            }

            public final java.lang.String toString() {
                return "CancelDeauthorizeAll";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.CancelDeauthorizeAll)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ DeauthorizeAll(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAllSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeauthorizeAllSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllSuccess();

        public final int hashCode() {
            return 896959232;
        }

        private DeauthorizeAllSuccess() {
            super("DeauthorizeAllSuccess", null);
        }

        public final java.lang.String toString() {
            return "DeauthorizeAllSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAllFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DeauthorizeAllFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeauthorizeAllFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeauthorizeAllFailed(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("DeauthorizeAllFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeauthorizeAllFailed(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed deauthorizeAllFailed = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, deauthorizeAllFailed.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, deauthorizeAllFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed(errorTitle, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed deauthorizeAllFailed, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = deauthorizeAllFailed.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = deauthorizeAllFailed.errorMessage;
            }
            return deauthorizeAllFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeauthorizeAllSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDeauthorizeAllSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSuccess();

        public final int hashCode() {
            return 345200490;
        }

        private DismissDeauthorizeAllSuccess() {
            super("DismissDeauthorizeAllSuccess", null);
        }

        public final java.lang.String toString() {
            return "DismissDeauthorizeAllSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$DismissDeauthorizeAllSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDeauthorizeAllSheet extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSheet();

        public final int hashCode() {
            return 2113938054;
        }

        private DismissDeauthorizeAllSheet() {
            super("DismissDeauthorizeAllSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissDeauthorizeAllSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissDeauthorizeAllSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingPreferenceLoaded;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingPreferenceLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingPreferenceLoaded extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public AmazonTrackingPreferenceLoaded(boolean z) {
            super("AmazonTrackingPreferenceLoaded", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingPreferenceLoaded(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded) && this.enabled == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded) other).enabled;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded copy(boolean enabled) {
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded amazonTrackingPreferenceLoaded, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingPreferenceLoaded.enabled;
            }
            return amazonTrackingPreferenceLoaded.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggled;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsScreenEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggled;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggled extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsScreenEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public AmazonTrackingToggled(boolean z) {
            super("AmazonTrackingToggled", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggled(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled) && this.enabled == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled) other).enabled;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled copy(boolean enabled) {
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled amazonTrackingToggled, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggled.enabled;
            }
            return amazonTrackingToggled.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggleSuccess extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public AmazonTrackingToggleSuccess(boolean z) {
            super("AmazonTrackingToggleSuccess", null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggleSuccess(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess) && this.enabled == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess) other).enabled;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess copy(boolean enabled) {
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess amazonTrackingToggleSuccess, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggleSuccess.enabled;
            }
            return amazonTrackingToggleSuccess.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleFailed;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/SettingsInternalEvent;", "", "previousValue", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent$AmazonTrackingToggleFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getPreviousValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmazonTrackingToggleFailed extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent implements com.paypal.oslo.feature.packagetracking.ui.settings.SettingsInternalEvent {
        public static final int $stable = 0;
        private final boolean previousValue;

        public AmazonTrackingToggleFailed(boolean z) {
            super("AmazonTrackingToggleFailed", null);
            this.previousValue = z;
        }

        public final boolean getPreviousValue() {
            return this.previousValue;
        }

        public final java.lang.String toString() {
            boolean z = this.previousValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonTrackingToggleFailed(previousValue=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.previousValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed) && this.previousValue == ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed) other).previousValue;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed copy(boolean previousValue) {
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed(previousValue);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPreviousValue() {
            return this.previousValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed amazonTrackingToggleFailed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = amazonTrackingToggleFailed.previousValue;
            }
            return amazonTrackingToggleFailed.copy(z);
        }
    }

    public /* synthetic */ PackageSettingsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
