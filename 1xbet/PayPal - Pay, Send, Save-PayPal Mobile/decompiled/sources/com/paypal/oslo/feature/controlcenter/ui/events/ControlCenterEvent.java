package com.paypal.oslo.feature.controlcenter.ui.events;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadData", "RetryLoad", "ProfileLoaded", "ProfileLoadFailed", "DisplayNameFormatted", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$DisplayNameFormatted;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$LoadData;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoadFailed;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoaded;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$RetryLoad;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ControlCenterEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ControlCenterEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$LoadData;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadData extends com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData();

        public final int hashCode() {
            return 930941614;
        }

        private LoadData() {
            super("LoadData", null);
        }

        public final java.lang.String toString() {
            return "LoadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$RetryLoad;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoad extends com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad();

        public final int hashCode() {
            return 718185072;
        }

        private RetryLoad() {
            super("RetryLoad", null);
        }

        public final java.lang.String toString() {
            return "RetryLoad";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoaded;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "userProfile", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "tabs", "", "showAccountSwitchChevron", "isUpdatePhotoEnabled", "<init>", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Ljava/util/List;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Ljava/util/List;ZZ)Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "getUserProfile", "Ljava/util/List;", "getTabs", "Z", "getShowAccountSwitchChevron"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileLoaded extends com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent {
        public static final int $stable = 8;
        private final boolean isUpdatePhotoEnabled;
        private final boolean showAccountSwitchChevron;
        private final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs;
        private final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProfileLoaded(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list, boolean z, boolean z2) {
            super("ProfileLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userProfile = userProfile;
            this.tabs = list;
            this.showAccountSwitchChevron = z;
            this.isUpdatePhotoEnabled = z2;
        }

        public /* synthetic */ ProfileLoaded(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List list, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileLoaded(userProfile=");
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
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded profileLoaded = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userProfile, profileLoaded.userProfile) && kotlin.jvm.internal.Intrinsics.areEqual(this.tabs, profileLoaded.tabs) && this.showAccountSwitchChevron == profileLoaded.showAccountSwitchChevron && this.isUpdatePhotoEnabled == profileLoaded.isUpdatePhotoEnabled;
        }

        public final com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded copy(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs, boolean showAccountSwitchChevron, boolean isUpdatePhotoEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabs, "");
            return new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded(userProfile, tabs, showAccountSwitchChevron, isUpdatePhotoEnabled);
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
        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded copy$default(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded profileLoaded, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userProfile = profileLoaded.userProfile;
            }
            if ((i & 2) != 0) {
                list = profileLoaded.tabs;
            }
            if ((i & 4) != 0) {
                z = profileLoaded.showAccountSwitchChevron;
            }
            if ((i & 8) != 0) {
                z2 = profileLoaded.isUpdatePhotoEnabled;
            }
            return profileLoaded.copy(userProfile, list, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoadFailed;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "", "errorMessage", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$ProfileLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Throwable;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileLoadFailed extends com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent {
        public static final int $stable = 8;
        private final java.lang.Throwable error;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProfileLoadFailed(java.lang.String str, java.lang.Throwable th) {
            super("ProfileLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.error = th;
        }

        public /* synthetic */ ProfileLoadFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Throwable getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.Throwable th = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileLoadFailed(errorMessage=");
            sb.append(str);
            sb.append(", error=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorMessage.hashCode();
            java.lang.Throwable th = this.error;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed profileLoadFailed = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, profileLoadFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, profileLoadFailed.error);
        }

        public final com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed copy(java.lang.String errorMessage, java.lang.Throwable error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed(errorMessage, error);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed copy$default(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed profileLoadFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = profileLoadFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                th = profileLoadFailed.error;
            }
            return profileLoadFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$DisplayNameFormatted;", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "", "formattedName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent$DisplayNameFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisplayNameFormatted extends com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedName;

        public DisplayNameFormatted(java.lang.String str) {
            super("DisplayNameFormatted", null);
            this.formattedName = str;
        }

        public final java.lang.String getFormattedName() {
            return this.formattedName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayNameFormatted(formattedName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.formattedName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedName, ((com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) other).formattedName);
        }

        public final com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted copy(java.lang.String formattedName) {
            return new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted(formattedName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedName() {
            return this.formattedName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted copy$default(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted displayNameFormatted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = displayNameFormatted.formattedName;
            }
            return displayNameFormatted.copy(str);
        }
    }

    public /* synthetic */ ControlCenterEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
