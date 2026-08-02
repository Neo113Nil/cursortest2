package com.paypal.oslo.feature.settings.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0003456B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJf\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b/\u0010\u0017R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u0010\u001cR\u0014\u00103\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "screenState", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "sections", "", "appVersion", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "logoutState", "globalError", "Lkotlin/Pair;", "", "scrollIndex", "<init>", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;Ljava/util/Map;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;Ljava/lang/String;Lkotlin/Pair;)V", "component1", "()Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "component5", "component6", "()Lkotlin/Pair;", "copy", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;Ljava/util/Map;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;Ljava/lang/String;Lkotlin/Pair;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "getScreenState", "Ljava/util/Map;", "getSections", "Ljava/lang/String;", "getAppVersion", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "getLogoutState", "getGlobalError", "Lkotlin/Pair;", "getScrollIndex", "getName", "name", "SectionState", "ScreenState", "LogoutState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SettingsState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.lang.String appVersion;
    private final java.lang.String globalError;
    private final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState;
    private final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState;
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex;
    private final java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsState(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState, java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, ? extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> map, java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, java.lang.String str2, kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        this.screenState = screenState;
        this.sections = map;
        this.appVersion = str;
        this.logoutState = logoutState;
        this.globalError = str2;
        this.scrollIndex = pair;
    }

    public /* synthetic */ SettingsState(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Initial initial, java.util.Map map, java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial initial2, java.lang.String str2, kotlin.Pair pair, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Initial.INSTANCE : initial, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial.INSTANCE : initial2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? kotlin.TuplesKt.to(0, 0) : pair);
    }

    public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState getScreenState() {
        return this.screenState;
    }

    public final java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> getSections() {
        return this.sections;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState getLogoutState() {
        return this.logoutState;
    }

    public final java.lang.String getGlobalError() {
        return this.globalError;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getScrollIndex() {
        return this.scrollIndex;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "", "<init>", "()V", "NotLoaded", "Loading", "Loaded", "Error", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loading;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$NotLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SectionState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$NotLoaded;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NotLoaded extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.NotLoaded INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.NotLoaded();

            private NotLoaded() {
                super(null);
            }
        }

        private SectionState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loading;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Loading extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loading INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loading();

            private Loading() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loaded extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsSectionUiData, "");
                this.data = settingsSectionUiData;
            }

            public final com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(data=");
                sb.append(settingsSectionUiData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) other).data);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded copy(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(data);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    settingsSectionUiData = loaded.data;
                }
                return loaded.copy(settingsSectionUiData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error) other).message);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }
        }

        public /* synthetic */ SectionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "", "<init>", "()V", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Error;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Initial;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Loading;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ScreenState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Initial;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Initial extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Initial INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Initial();

            private Initial() {
                super(null);
            }
        }

        private ScreenState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Loading;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Loading extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Loading INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Loading();

            private Loading() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Ready;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Ready extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready();

            private Ready() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Error;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$ScreenState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error) other).message);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }
        }

        public /* synthetic */ ScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "", "<init>", "()V", "Initial", "InProgress", "Failed", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$Failed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$InProgress;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$Initial;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LogoutState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$Initial;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Initial extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Initial();

            private Initial() {
                super(null);
            }
        }

        private LogoutState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$InProgress;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InProgress extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.InProgress INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.InProgress();

            private InProgress() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$Failed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Failed extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState {
            public static final int $stable = 0;
            private final java.lang.String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.error = str;
            }

            public final java.lang.String getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed) other).error);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed copy(java.lang.String error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed(error);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.Failed failed, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = failed.error;
                }
                return failed.copy(str);
            }
        }

        public /* synthetic */ LogoutState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return "SettingsState";
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState = this.screenState;
        java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> map = this.sections;
        java.lang.String str = this.appVersion;
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState = this.logoutState;
        java.lang.String str2 = this.globalError;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = this.scrollIndex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingsState(screenState=");
        sb.append(screenState);
        sb.append(", sections=");
        sb.append(map);
        sb.append(", appVersion=");
        sb.append(str);
        sb.append(", logoutState=");
        sb.append(logoutState);
        sb.append(", globalError=");
        sb.append(str2);
        sb.append(", scrollIndex=");
        sb.append(pair);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.screenState.hashCode();
        int hashCode2 = this.sections.hashCode();
        int hashCode3 = this.appVersion.hashCode();
        int hashCode4 = this.logoutState.hashCode();
        java.lang.String str = this.globalError;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.scrollIndex.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState)) {
            return false;
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenState, settingsState.screenState) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, settingsState.sections) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, settingsState.appVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoutState, settingsState.logoutState) && kotlin.jvm.internal.Intrinsics.areEqual(this.globalError, settingsState.globalError) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollIndex, settingsState.scrollIndex);
    }

    public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState copy(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState, java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, ? extends com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> sections, java.lang.String appVersion, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, java.lang.String globalError, kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollIndex, "");
        return new com.paypal.oslo.feature.settings.ui.mvi.SettingsState(screenState, sections, appVersion, logoutState, globalError, scrollIndex);
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component6() {
        return this.scrollIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getGlobalError() {
        return this.globalError;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState getLogoutState() {
        return this.logoutState;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.util.Map<com.paypal.oslo.feature.settings.domain.model.SettingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState> component2() {
        return this.sections;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState getScreenState() {
        return this.screenState;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsState copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState screenState, java.util.Map map, java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, java.lang.String str2, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            screenState = settingsState.screenState;
        }
        if ((i & 2) != 0) {
            map = settingsState.sections;
        }
        java.util.Map map2 = map;
        if ((i & 4) != 0) {
            str = settingsState.appVersion;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            logoutState = settingsState.logoutState;
        }
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState2 = logoutState;
        if ((i & 16) != 0) {
            str2 = settingsState.globalError;
        }
        java.lang.String str4 = str2;
        if ((i & 32) != 0) {
            pair = settingsState.scrollIndex;
        }
        return settingsState.copy(screenState, map2, str3, logoutState2, str4, pair);
    }

    public SettingsState() {
        this(null, null, null, null, null, null, 63, null);
    }
}
