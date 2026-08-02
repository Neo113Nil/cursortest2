package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "", "<init>", "()V", "OnButtonClicked", "OnToggleChanged", "OnNavigate", "OnLogoutClicked", "OnListScroll", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnButtonClicked;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnListScroll;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnLogoutClicked;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnNavigate;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnToggleChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SettingsScreenUiEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnButtonClicked;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "", "settingId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnButtonClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSettingId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnButtonClicked extends com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent {
        public static final int $stable = 0;
        private final java.lang.String settingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnButtonClicked(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.settingId = str;
        }

        public final java.lang.String getSettingId() {
            return this.settingId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.settingId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnButtonClicked(settingId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.settingId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.settingId, ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked) other).settingId);
        }

        public final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked copy(java.lang.String settingId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingId, "");
            return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked(settingId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSettingId() {
            return this.settingId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked copy$default(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnButtonClicked onButtonClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onButtonClicked.settingId;
            }
            return onButtonClicked.copy(str);
        }
    }

    private SettingsScreenUiEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnToggleChanged;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "", "settingId", "", "isEnabled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnToggleChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSettingId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToggleChanged extends com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent {
        public static final int $stable = 0;
        private final boolean isEnabled;
        private final java.lang.String settingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnToggleChanged(java.lang.String str, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.settingId = str;
            this.isEnabled = z;
        }

        public final java.lang.String getSettingId() {
            return this.settingId;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.settingId;
            boolean z = this.isEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnToggleChanged(settingId=");
            sb.append(str);
            sb.append(", isEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.settingId.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged)) {
                return false;
            }
            com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged onToggleChanged = (com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.settingId, onToggleChanged.settingId) && this.isEnabled == onToggleChanged.isEnabled;
        }

        public final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged copy(java.lang.String settingId, boolean isEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingId, "");
            return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged(settingId, isEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSettingId() {
            return this.settingId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged copy$default(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnToggleChanged onToggleChanged, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onToggleChanged.settingId;
            }
            if ((i & 2) != 0) {
                z = onToggleChanged.isEnabled;
            }
            return onToggleChanged.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnNavigate;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnNavigate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNavigate extends com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNavigate(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNavigate(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate) other).destination);
        }

        public final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate copy$default(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnNavigate onNavigate, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = onNavigate.destination;
            }
            return onNavigate.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnLogoutClicked;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLogoutClicked extends com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnLogoutClicked INSTANCE = new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnLogoutClicked();

        public final int hashCode() {
            return 150532893;
        }

        private OnLogoutClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnLogoutClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnLogoutClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnListScroll;", "Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent;", "Lkotlin/Pair;", "", "scrollIndex", "<init>", "(Lkotlin/Pair;)V", "component1", "()Lkotlin/Pair;", "copy", "(Lkotlin/Pair;)Lcom/paypal/oslo/feature/settings/ui/viewmodel/SettingsScreenUiEvent$OnListScroll;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Pair;", "getScrollIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnListScroll extends com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent {
        public static final int $stable = 0;
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnListScroll(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
            this.scrollIndex = pair;
        }

        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getScrollIndex() {
            return this.scrollIndex;
        }

        public final java.lang.String toString() {
            kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = this.scrollIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnListScroll(scrollIndex=");
            sb.append(pair);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.scrollIndex.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollIndex, ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll) other).scrollIndex);
        }

        public final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll copy(kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollIndex, "");
            return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll(scrollIndex);
        }

        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component1() {
            return this.scrollIndex;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll copy$default(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsScreenUiEvent.OnListScroll onListScroll, kotlin.Pair pair, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pair = onListScroll.scrollIndex;
            }
            return onListScroll.copy(pair);
        }
    }

    public /* synthetic */ SettingsScreenUiEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
