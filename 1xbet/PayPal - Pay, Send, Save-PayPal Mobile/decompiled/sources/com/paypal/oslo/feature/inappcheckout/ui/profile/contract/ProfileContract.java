package com.paypal.oslo.feature.inappcheckout.ui.profile.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "", "isLoading", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Z)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Z)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfoEntity", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity;
        private final boolean isLoading;

        public State(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
            this.buyerInfoEntity = buyerInfoEntity;
            this.isLoading = z;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(buyerInfoEntity, (i & 2) != 0 ? true : z);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfoEntity;
            boolean z = this.isLoading;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(buyerInfoEntity=");
            sb.append(buyerInfoEntity);
            sb.append(", isLoading=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.buyerInfoEntity.hashCode() * 31) + java.lang.Boolean.hashCode(this.isLoading);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoEntity, state.buyerInfoEntity) && this.isLoading == state.isLoading;
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State copy(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, boolean isLoading) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State(buyerInfoEntity, isLoading);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
            return this.buyerInfoEntity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State copy$default(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State state, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                buyerInfoEntity = state.buyerInfoEntity;
            }
            if ((i & 2) != 0) {
                z = state.isLoading;
            }
            return state.copy(buyerInfoEntity, z);
        }
    }

    private ProfileContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "", "<init>", "()V", "StartLoading", "FinishLoading", "Initialize", "NavigateToPrivacy", "NavigateToPolicies", "NavigateToTerms", "LogoutUser", "HandleBackPress", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$FinishLoading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$LogoutUser;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToPolicies;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToPrivacy;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToTerms;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$StartLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$StartLoading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class StartLoading extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.StartLoading INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.StartLoading();

            private StartLoading() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$FinishLoading;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class FinishLoading extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.FinishLoading INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.FinishLoading();

            private FinishLoading() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$Initialize;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfoEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialize(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
                this.buyerInfoEntity = buyerInfoEntity;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
                return this.buyerInfoEntity;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfoEntity;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(buyerInfoEntity=");
                sb.append(buyerInfoEntity);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.buyerInfoEntity.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfoEntity, ((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) other).buyerInfoEntity);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize copy(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize(buyerInfoEntity);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
                return this.buyerInfoEntity;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize copy$default(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize initialize, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    buyerInfoEntity = initialize.buyerInfoEntity;
                }
                return initialize.copy(buyerInfoEntity);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToPrivacy;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToPrivacy extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPrivacy INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPrivacy();

            private NavigateToPrivacy() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToPolicies;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToPolicies extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPolicies INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPolicies();

            private NavigateToPolicies() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$NavigateToTerms;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateToTerms extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToTerms INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToTerms();

            private NavigateToTerms() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$LogoutUser;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LogoutUser extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.LogoutUser INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.LogoutUser();

            private LogoutUser() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HandleBackPress extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.HandleBackPress INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.HandleBackPress();

            private HandleBackPress() {
                super(null);
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "", "<init>", "()V", "NavigateBack", "NavigateToNativeInAppWebView", "ShowMessage", "LogoutSuccess", "LogoutError", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$LogoutError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$LogoutSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$ShowMessage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBack extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateBack INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateBack();

            private NavigateBack() {
                super(null);
            }
        }

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$NavigateToNativeInAppWebView;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$NavigateToNativeInAppWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToNativeInAppWebView extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToNativeInAppWebView(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
                this.data = nativeInAppWebViewData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToNativeInAppWebView(data=");
                sb.append(nativeInAppWebViewData);
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView) other).data);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView copy(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView(data);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView copy$default(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.NavigateToNativeInAppWebView navigateToNativeInAppWebView, com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    nativeInAppWebViewData = navigateToNativeInAppWebView.data;
                }
                return navigateToNativeInAppWebView.copy(nativeInAppWebViewData);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$ShowMessage;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$ShowMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowMessage extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowMessage(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowMessage(message=");
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage) other).message);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage copy$default(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage showMessage, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = showMessage.message;
                }
                return showMessage.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$LogoutSuccess;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LogoutSuccess extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutSuccess INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutSuccess();

            private LogoutSuccess() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$LogoutError;", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Effect$LogoutError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LogoutError extends com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect {
            public static final int $stable = 0;
            private final java.lang.String errorMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LogoutError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LogoutError(errorMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError) other).errorMessage);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError copy(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError(errorMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError copy$default(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError logoutError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = logoutError.errorMessage;
                }
                return logoutError.copy(str);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
