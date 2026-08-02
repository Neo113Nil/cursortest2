package com.paypal.oslo.feature.controlcenter.ui.states;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Error;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Initial;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Loading;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ControlCenterUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ControlCenterUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Initial;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial();

        public final int hashCode() {
            return 1668270464;
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
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Loading;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "defaultTabs", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDefaultTabs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> defaultTabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.defaultTabs = list;
        }

        public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getDefaultTabs() {
            return this.defaultTabs;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list = this.defaultTabs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(defaultTabs=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.defaultTabs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultTabs, ((com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading) other).defaultTabs);
        }

        public final com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading copy(java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> defaultTabs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTabs, "");
            return new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading(defaultTabs);
        }

        public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> component1() {
            return this.defaultTabs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading copy$default(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Loading loading, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loading.defaultTabs;
            }
            return loading.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Success;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "userProfile", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "tabs", "", "showAccountSwitchChevron", "isUpdatePhotoEnabled", "<init>", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Ljava/util/List;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Ljava/util/List;ZZ)Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "getUserProfile", "Ljava/util/List;", "getTabs", "Z", "getShowAccountSwitchChevron"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState {
        public static final int $stable = 8;
        private final boolean isUpdatePhotoEnabled;
        private final boolean showAccountSwitchChevron;
        private final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs;
        private final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list, boolean z, boolean z2) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userProfile = userProfile;
            this.tabs = list;
            this.showAccountSwitchChevron = z;
            this.isUpdatePhotoEnabled = z2;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List list, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userProfile, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile getUserProfile() {
            return this.userProfile;
        }

        public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabs() {
            return this.tabs;
        }

        public final boolean getShowAccountSwitchChevron() {
            return this.showAccountSwitchChevron;
        }

        public final boolean isUpdatePhotoEnabled() {
            return this.isUpdatePhotoEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile = this.userProfile;
            java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list = this.tabs;
            boolean z = this.showAccountSwitchChevron;
            boolean z2 = this.isUpdatePhotoEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(userProfile=");
            sb.append(userProfile);
            sb.append(", tabs=");
            sb.append(list);
            sb.append(", showAccountSwitchChevron=");
            sb.append(z);
            sb.append(", isUpdatePhotoEnabled=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.userProfile.hashCode() * 31) + this.tabs.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showAccountSwitchChevron)) * 31) + java.lang.Boolean.hashCode(this.isUpdatePhotoEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success success = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userProfile, success.userProfile) && kotlin.jvm.internal.Intrinsics.areEqual(this.tabs, success.tabs) && this.showAccountSwitchChevron == success.showAccountSwitchChevron && this.isUpdatePhotoEnabled == success.isUpdatePhotoEnabled;
        }

        public final com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success copy(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs, boolean showAccountSwitchChevron, boolean isUpdatePhotoEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabs, "");
            return new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success(userProfile, tabs, showAccountSwitchChevron, isUpdatePhotoEnabled);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsUpdatePhotoEnabled() {
            return this.isUpdatePhotoEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAccountSwitchChevron() {
            return this.showAccountSwitchChevron;
        }

        public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> component2() {
            return this.tabs;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile getUserProfile() {
            return this.userProfile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success copy$default(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success success, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userProfile = success.userProfile;
            }
            if ((i & 2) != 0) {
                list = success.tabs;
            }
            if ((i & 4) != 0) {
                z = success.showAccountSwitchChevron;
            }
            if ((i & 8) != 0) {
                z2 = success.isUpdatePhotoEnabled;
            }
            return success.copy(userProfile, list, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Error;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "", "errorMessage", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.Throwable th) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.cause = th;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorMessage.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error error = (com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, error.cause);
        }

        public final com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error copy(java.lang.String errorMessage, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error(errorMessage, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error copy$default(com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Error error, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i & 2) != 0) {
                th = error.cause;
            }
            return error.copy(str, th);
        }
    }

    public /* synthetic */ ControlCenterUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
