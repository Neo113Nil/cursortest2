package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Initial;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Loading;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageSettingsUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageSettingsUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Initial;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Initial INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Initial();

        public final int hashCode() {
            return 1573356861;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Loading;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Loading INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Loading();

        public final int hashCode() {
            return -38334667;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0012\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b=\u0010$J\u0082\u0002\u0010>\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bG\u0010/R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\b\u0006\u0010$R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\b\u0007\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bM\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bN\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bO\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bP\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bV\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00103R\u001a\u0010\u0016\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bY\u0010$R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bZ\u0010$R\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b[\u0010$R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\b\\\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\b]\u0010'R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\b^\u0010/R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\b_\u0010'R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010`\u001a\u0004\ba\u0010<R\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\b\u001e\u0010$R\u0011\u0010c\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bb\u0010$R\u0013\u0010f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bg\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Success;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "emailAccounts", "", "isUnlinking", "isLinking", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "unlinkingProvider", "showLinkSuccessProvider", "showUnlinkSuccessProvider", "showUnlinkSheetProvider", "showAlreadyRelinkedProvider", "Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "errorBannerInfo", "", "webViewUrl", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DEEP_LINK_DATA_KEY, "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "deeplinkState", "showDeleteImportedDataSheetProvider", "showDeleteImportedDataSuccessProvider", "showDeauthorizeAllSheetProvider", "showDeauthorizeAllSuccessProvider", "showRelinkSheetProvider", "relinkDate", "relinkDeeplinkProvider", "amazonTrackingEnabled", "isTogglingAmazonPreference", "<init>", "(Ljava/util/List;ZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;ZZZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/Boolean;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component5", "component6", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "component10", "()Ljava/lang/String;", "component11", "()Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "component12", "()Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Boolean;", "component21", "copy", "(Ljava/util/List;ZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;ZZZZLcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/Boolean;Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getEmailAccounts", "Z", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getUnlinkingProvider", "getShowLinkSuccessProvider", "getShowUnlinkSuccessProvider", "getShowUnlinkSheetProvider", "getShowAlreadyRelinkedProvider", "Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "getErrorBannerInfo", "Ljava/lang/String;", "getWebViewUrl", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "getDeeplinkData", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "getDeeplinkState", "getShowDeleteImportedDataSheetProvider", "getShowDeleteImportedDataSuccessProvider", "getShowDeauthorizeAllSheetProvider", "getShowDeauthorizeAllSuccessProvider", "getShowRelinkSheetProvider", "getRelinkDate", "getRelinkDeeplinkProvider", "Ljava/lang/Boolean;", "getAmazonTrackingEnabled", "getHasLinkedAccount", "hasLinkedAccount", "getPrimaryLinkedAccount", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "primaryLinkedAccount", "getHasDataToDelete", "hasDataToDelete"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState {
        public static final int $stable = 8;
        private final java.lang.Boolean amazonTrackingEnabled;
        private final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData;
        private final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState deeplinkState;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> emailAccounts;
        private final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorBannerInfo;
        private final boolean isLinking;
        private final boolean isTogglingAmazonPreference;
        private final boolean isUnlinking;
        private final java.lang.String relinkDate;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider relinkDeeplinkProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showAlreadyRelinkedProvider;
        private final boolean showDeauthorizeAllSheetProvider;
        private final boolean showDeauthorizeAllSuccessProvider;
        private final boolean showDeleteImportedDataSheetProvider;
        private final boolean showDeleteImportedDataSuccessProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showLinkSuccessProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showRelinkSheetProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showUnlinkSheetProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showUnlinkSuccessProvider;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider unlinkingProvider;
        private final java.lang.String webViewUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list, boolean z, boolean z2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider3, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider4, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider5, com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo, java.lang.String str, com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData, com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState, boolean z3, boolean z4, boolean z5, boolean z6, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider6, java.lang.String str2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider7, java.lang.Boolean bool, boolean z7) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.emailAccounts = list;
            this.isUnlinking = z;
            this.isLinking = z2;
            this.unlinkingProvider = emailProvider;
            this.showLinkSuccessProvider = emailProvider2;
            this.showUnlinkSuccessProvider = emailProvider3;
            this.showUnlinkSheetProvider = emailProvider4;
            this.showAlreadyRelinkedProvider = emailProvider5;
            this.errorBannerInfo = errorInfo;
            this.webViewUrl = str;
            this.deeplinkData = deeplinkData;
            this.deeplinkState = settingsDeeplinkState;
            this.showDeleteImportedDataSheetProvider = z3;
            this.showDeleteImportedDataSuccessProvider = z4;
            this.showDeauthorizeAllSheetProvider = z5;
            this.showDeauthorizeAllSuccessProvider = z6;
            this.showRelinkSheetProvider = emailProvider6;
            this.relinkDate = str2;
            this.relinkDeeplinkProvider = emailProvider7;
            this.amazonTrackingEnabled = bool;
            this.isTogglingAmazonPreference = z7;
        }

        public /* synthetic */ Success(java.util.List list, boolean z, boolean z2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider3, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider4, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider5, com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo, java.lang.String str, com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData, com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState, boolean z3, boolean z4, boolean z5, boolean z6, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider6, java.lang.String str2, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider7, java.lang.Boolean bool, boolean z7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : emailProvider, (i & 16) != 0 ? null : emailProvider2, (i & 32) != 0 ? null : emailProvider3, (i & 64) != 0 ? null : emailProvider4, (i & 128) != 0 ? null : emailProvider5, (i & 256) != 0 ? null : errorInfo, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : deeplinkData, (i & 2048) != 0 ? null : settingsDeeplinkState, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? false : z5, (i & 32768) != 0 ? false : z6, (i & 65536) != 0 ? null : emailProvider6, (i & 131072) != 0 ? null : str2, (i & 262144) != 0 ? null : emailProvider7, (i & 524288) == 0 ? bool : null, (i & 1048576) != 0 ? false : z7);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> getEmailAccounts() {
            return this.emailAccounts;
        }

        public final boolean isUnlinking() {
            return this.isUnlinking;
        }

        public final boolean isLinking() {
            return this.isLinking;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getUnlinkingProvider() {
            return this.unlinkingProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowLinkSuccessProvider() {
            return this.showLinkSuccessProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowUnlinkSuccessProvider() {
            return this.showUnlinkSuccessProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowUnlinkSheetProvider() {
            return this.showUnlinkSheetProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowAlreadyRelinkedProvider() {
            return this.showAlreadyRelinkedProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo getErrorBannerInfo() {
            return this.errorBannerInfo;
        }

        public final java.lang.String getWebViewUrl() {
            return this.webViewUrl;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData getDeeplinkData() {
            return this.deeplinkData;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState getDeeplinkState() {
            return this.deeplinkState;
        }

        public final boolean getShowDeleteImportedDataSheetProvider() {
            return this.showDeleteImportedDataSheetProvider;
        }

        public final boolean getShowDeleteImportedDataSuccessProvider() {
            return this.showDeleteImportedDataSuccessProvider;
        }

        public final boolean getShowDeauthorizeAllSheetProvider() {
            return this.showDeauthorizeAllSheetProvider;
        }

        public final boolean getShowDeauthorizeAllSuccessProvider() {
            return this.showDeauthorizeAllSuccessProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowRelinkSheetProvider() {
            return this.showRelinkSheetProvider;
        }

        public final java.lang.String getRelinkDate() {
            return this.relinkDate;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getRelinkDeeplinkProvider() {
            return this.relinkDeeplinkProvider;
        }

        public final java.lang.Boolean getAmazonTrackingEnabled() {
            return this.amazonTrackingEnabled;
        }

        public final boolean isTogglingAmazonPreference() {
            return this.isTogglingAmazonPreference;
        }

        public final boolean getHasLinkedAccount() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.emailAccounts;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it.next()).getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED) {
                    return true;
                }
            }
            return false;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailLink getPrimaryLinkedAccount() {
            java.lang.Object obj;
            java.util.Iterator<T> it = this.emailAccounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj).getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj;
        }

        public final boolean getHasDataToDelete() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.emailAccounts;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            for (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink : list) {
                if (emailLink.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED || kotlin.jvm.internal.Intrinsics.areEqual(emailLink.isDataDeleted(), java.lang.Boolean.FALSE)) {
                    return true;
                }
            }
            return false;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.emailAccounts;
            boolean z = this.isUnlinking;
            boolean z2 = this.isLinking;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.unlinkingProvider;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2 = this.showLinkSuccessProvider;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider3 = this.showUnlinkSuccessProvider;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider4 = this.showUnlinkSheetProvider;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider5 = this.showAlreadyRelinkedProvider;
            com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo = this.errorBannerInfo;
            java.lang.String str = this.webViewUrl;
            com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData = this.deeplinkData;
            com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState = this.deeplinkState;
            boolean z3 = this.showDeleteImportedDataSheetProvider;
            boolean z4 = this.showDeleteImportedDataSuccessProvider;
            boolean z5 = this.showDeauthorizeAllSheetProvider;
            boolean z6 = this.showDeauthorizeAllSuccessProvider;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider6 = this.showRelinkSheetProvider;
            java.lang.String str2 = this.relinkDate;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider7 = this.relinkDeeplinkProvider;
            java.lang.Boolean bool = this.amazonTrackingEnabled;
            boolean z7 = this.isTogglingAmazonPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(emailAccounts=");
            sb.append(list);
            sb.append(", isUnlinking=");
            sb.append(z);
            sb.append(", isLinking=");
            sb.append(z2);
            sb.append(", unlinkingProvider=");
            sb.append(emailProvider);
            sb.append(", showLinkSuccessProvider=");
            sb.append(emailProvider2);
            sb.append(", showUnlinkSuccessProvider=");
            sb.append(emailProvider3);
            sb.append(", showUnlinkSheetProvider=");
            sb.append(emailProvider4);
            sb.append(", showAlreadyRelinkedProvider=");
            sb.append(emailProvider5);
            sb.append(", errorBannerInfo=");
            sb.append(errorInfo);
            sb.append(", webViewUrl=");
            sb.append(str);
            sb.append(", deeplinkData=");
            sb.append(deeplinkData);
            sb.append(", deeplinkState=");
            sb.append(settingsDeeplinkState);
            sb.append(", showDeleteImportedDataSheetProvider=");
            sb.append(z3);
            sb.append(", showDeleteImportedDataSuccessProvider=");
            sb.append(z4);
            sb.append(", showDeauthorizeAllSheetProvider=");
            sb.append(z5);
            sb.append(", showDeauthorizeAllSuccessProvider=");
            sb.append(z6);
            sb.append(", showRelinkSheetProvider=");
            sb.append(emailProvider6);
            sb.append(", relinkDate=");
            sb.append(str2);
            sb.append(", relinkDeeplinkProvider=");
            sb.append(emailProvider7);
            sb.append(", amazonTrackingEnabled=");
            sb.append(bool);
            sb.append(", isTogglingAmazonPreference=");
            sb.append(z7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.emailAccounts.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isUnlinking);
            int hashCode3 = java.lang.Boolean.hashCode(this.isLinking);
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.unlinkingProvider;
            int hashCode4 = emailProvider == null ? 0 : emailProvider.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2 = this.showLinkSuccessProvider;
            int hashCode5 = emailProvider2 == null ? 0 : emailProvider2.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider3 = this.showUnlinkSuccessProvider;
            int hashCode6 = emailProvider3 == null ? 0 : emailProvider3.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider4 = this.showUnlinkSheetProvider;
            int hashCode7 = emailProvider4 == null ? 0 : emailProvider4.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider5 = this.showAlreadyRelinkedProvider;
            int hashCode8 = emailProvider5 == null ? 0 : emailProvider5.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo = this.errorBannerInfo;
            int hashCode9 = errorInfo == null ? 0 : errorInfo.hashCode();
            java.lang.String str = this.webViewUrl;
            int hashCode10 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData = this.deeplinkData;
            int hashCode11 = deeplinkData == null ? 0 : deeplinkData.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState settingsDeeplinkState = this.deeplinkState;
            int hashCode12 = settingsDeeplinkState == null ? 0 : settingsDeeplinkState.hashCode();
            int hashCode13 = java.lang.Boolean.hashCode(this.showDeleteImportedDataSheetProvider);
            int hashCode14 = java.lang.Boolean.hashCode(this.showDeleteImportedDataSuccessProvider);
            int hashCode15 = java.lang.Boolean.hashCode(this.showDeauthorizeAllSheetProvider);
            int hashCode16 = java.lang.Boolean.hashCode(this.showDeauthorizeAllSuccessProvider);
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider6 = this.showRelinkSheetProvider;
            int hashCode17 = emailProvider6 == null ? 0 : emailProvider6.hashCode();
            java.lang.String str2 = this.relinkDate;
            int hashCode18 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider7 = this.relinkDeeplinkProvider;
            int hashCode19 = emailProvider7 == null ? 0 : emailProvider7.hashCode();
            java.lang.Boolean bool = this.amazonTrackingEnabled;
            return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isTogglingAmazonPreference);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success success = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emailAccounts, success.emailAccounts) && this.isUnlinking == success.isUnlinking && this.isLinking == success.isLinking && this.unlinkingProvider == success.unlinkingProvider && this.showLinkSuccessProvider == success.showLinkSuccessProvider && this.showUnlinkSuccessProvider == success.showUnlinkSuccessProvider && this.showUnlinkSheetProvider == success.showUnlinkSheetProvider && this.showAlreadyRelinkedProvider == success.showAlreadyRelinkedProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBannerInfo, success.errorBannerInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewUrl, success.webViewUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkData, success.deeplinkData) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkState, success.deeplinkState) && this.showDeleteImportedDataSheetProvider == success.showDeleteImportedDataSheetProvider && this.showDeleteImportedDataSuccessProvider == success.showDeleteImportedDataSuccessProvider && this.showDeauthorizeAllSheetProvider == success.showDeauthorizeAllSheetProvider && this.showDeauthorizeAllSuccessProvider == success.showDeauthorizeAllSuccessProvider && this.showRelinkSheetProvider == success.showRelinkSheetProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.relinkDate, success.relinkDate) && this.relinkDeeplinkProvider == success.relinkDeeplinkProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.amazonTrackingEnabled, success.amazonTrackingEnabled) && this.isTogglingAmazonPreference == success.isTogglingAmazonPreference;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success copy(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> emailAccounts, boolean isUnlinking, boolean isLinking, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider unlinkingProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showLinkSuccessProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showUnlinkSuccessProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showUnlinkSheetProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showAlreadyRelinkedProvider, com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorBannerInfo, java.lang.String webViewUrl, com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData, com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState deeplinkState, boolean showDeleteImportedDataSheetProvider, boolean showDeleteImportedDataSuccessProvider, boolean showDeauthorizeAllSheetProvider, boolean showDeauthorizeAllSuccessProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider showRelinkSheetProvider, java.lang.String relinkDate, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider relinkDeeplinkProvider, java.lang.Boolean amazonTrackingEnabled, boolean isTogglingAmazonPreference) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAccounts, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success(emailAccounts, isUnlinking, isLinking, unlinkingProvider, showLinkSuccessProvider, showUnlinkSuccessProvider, showUnlinkSheetProvider, showAlreadyRelinkedProvider, errorBannerInfo, webViewUrl, deeplinkData, deeplinkState, showDeleteImportedDataSheetProvider, showDeleteImportedDataSuccessProvider, showDeauthorizeAllSheetProvider, showDeauthorizeAllSuccessProvider, showRelinkSheetProvider, relinkDate, relinkDeeplinkProvider, amazonTrackingEnabled, isTogglingAmazonPreference);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo getErrorBannerInfo() {
            return this.errorBannerInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowAlreadyRelinkedProvider() {
            return this.showAlreadyRelinkedProvider;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowUnlinkSheetProvider() {
            return this.showUnlinkSheetProvider;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowUnlinkSuccessProvider() {
            return this.showUnlinkSuccessProvider;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowLinkSuccessProvider() {
            return this.showLinkSuccessProvider;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getUnlinkingProvider() {
            return this.unlinkingProvider;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLinking() {
            return this.isLinking;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getIsTogglingAmazonPreference() {
            return this.isTogglingAmazonPreference;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.Boolean getAmazonTrackingEnabled() {
            return this.amazonTrackingEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsUnlinking() {
            return this.isUnlinking;
        }

        /* renamed from: component19, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getRelinkDeeplinkProvider() {
            return this.relinkDeeplinkProvider;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.String getRelinkDate() {
            return this.relinkDate;
        }

        /* renamed from: component17, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getShowRelinkSheetProvider() {
            return this.showRelinkSheetProvider;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getShowDeauthorizeAllSuccessProvider() {
            return this.showDeauthorizeAllSuccessProvider;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getShowDeauthorizeAllSheetProvider() {
            return this.showDeauthorizeAllSheetProvider;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShowDeleteImportedDataSuccessProvider() {
            return this.showDeleteImportedDataSuccessProvider;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getShowDeleteImportedDataSheetProvider() {
            return this.showDeleteImportedDataSheetProvider;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState getDeeplinkState() {
            return this.deeplinkState;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData getDeeplinkData() {
            return this.deeplinkData;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getWebViewUrl() {
            return this.webViewUrl;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> component1() {
            return this.emailAccounts;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Error;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "errorTitle", "errorMessage", "", "canRetry", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getErrorTitle", "getErrorMessage", "Z", "getCanRetry"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState {
        public static final int $stable = 0;
        private final boolean canRetry;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.errorTitle = uiString;
            this.errorMessage = uiString2;
            this.canRetry = z;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiString, uiString2, (i & 4) != 0 ? true : z);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.errorTitle;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.errorMessage;
            boolean z = this.canRetry;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorTitle=");
            sb.append(uiString);
            sb.append(", errorMessage=");
            sb.append(uiString2);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + java.lang.Boolean.hashCode(this.canRetry);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error error = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorTitle, error.errorTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && this.canRetry == error.canRetry;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error copy(com.paypal.oslo.feature.packagetracking.domain.UiString errorTitle, com.paypal.oslo.feature.packagetracking.domain.UiString errorMessage, boolean canRetry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error(errorTitle, errorMessage, canRetry);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getErrorTitle() {
            return this.errorTitle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Error error, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = error.errorTitle;
            }
            if ((i & 2) != 0) {
                uiString2 = error.errorMessage;
            }
            if ((i & 4) != 0) {
                z = error.canRetry;
            }
            return error.copy(uiString, uiString2, z);
        }
    }

    public /* synthetic */ PackageSettingsUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
