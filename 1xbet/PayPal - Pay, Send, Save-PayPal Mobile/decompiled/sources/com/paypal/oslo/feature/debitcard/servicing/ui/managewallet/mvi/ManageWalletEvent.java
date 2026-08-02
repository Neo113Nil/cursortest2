package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0013\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0013\u001d\u001e\u001f !\"#$%&'()*+,-./"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadWalletData", "RefreshWalletData", "WalletDataLoaded", "WalletDataLoadFailed", "ProvisionedTokensLoaded", "PushProvisioningWidgetReady", "PushProvisioningWidgetFailed", "BackClicked", "ErrorCloseClicked", "ErrorRetryClicked", "LockWalletToggled", "UnlockWalletToggled", "WalletLockedSuccessfully", "WalletUnlockedSuccessfully", "LockWalletFailed", "UnlockWalletFailed", "RemoveWalletClicked", "WalletRemovedSuccessfully", "RemoveWalletFailed", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ErrorCloseClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ErrorRetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LoadWalletData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ProvisionedTokensLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$PushProvisioningWidgetFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$PushProvisioningWidgetReady;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RefreshWalletData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletLockedSuccessfully;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletRemovedSuccessfully;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletUnlockedSuccessfully;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageWalletEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageWalletEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LoadWalletData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadWalletData extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData();

        public final int hashCode() {
            return -187122402;
        }

        private LoadWalletData() {
            super("LoadWalletData", null);
        }

        public final java.lang.String toString() {
            return "LoadWalletData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RefreshWalletData;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshWalletData extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData();

        public final int hashCode() {
            return 881270793;
        }

        private RefreshWalletData() {
            super("RefreshWalletData", null);
        }

        public final java.lang.String toString() {
            return "RefreshWalletData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "walletInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWalletInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletDataLoaded extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletDataLoaded(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list) {
            super("WalletDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.walletInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> getWalletInstruments() {
            return this.walletInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list = this.walletInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletDataLoaded(walletInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.walletInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstruments, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) other).walletInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstruments, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded(walletInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> component1() {
            return this.walletInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded walletDataLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = walletDataLoaded.walletInstruments;
            }
            return walletDataLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorTag", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletDataLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletDataLoadFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletDataLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("WalletDataLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorType = debitErrorType;
            this.errorTag = str;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public /* synthetic */ WalletDataLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i & 2) != 0 ? "" : str);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorTag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletDataLoadFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorTag=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + this.errorTag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed walletDataLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed) other;
            return this.errorType == walletDataLoadFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, walletDataLoadFailed.errorTag);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed(errorType, errorTag);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed walletDataLoadFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = walletDataLoadFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = walletDataLoadFailed.errorTag;
            }
            return walletDataLoadFailed.copy(debitErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ProvisionedTokensLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "", "", "tokenIds", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ProvisionedTokensLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getTokenIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionedTokensLoaded extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 8;
        private final java.util.Set<java.lang.String> tokenIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisionedTokensLoaded(java.util.Set<java.lang.String> set) {
            super("ProvisionedTokensLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.tokenIds = set;
        }

        public final java.util.Set<java.lang.String> getTokenIds() {
            return this.tokenIds;
        }

        public final java.lang.String toString() {
            java.util.Set<java.lang.String> set = this.tokenIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedTokensLoaded(tokenIds=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tokenIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenIds, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) other).tokenIds);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded copy(java.util.Set<java.lang.String> tokenIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenIds, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded(tokenIds);
        }

        public final java.util.Set<java.lang.String> component1() {
            return this.tokenIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded provisionedTokensLoaded, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = provisionedTokensLoaded.tokenIds;
            }
            return provisionedTokensLoaded.copy(set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$PushProvisioningWidgetReady;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningWidgetReady extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady();

        public final int hashCode() {
            return 1245795811;
        }

        private PushProvisioningWidgetReady() {
            super("PushProvisioningWidgetReady", null);
        }

        public final java.lang.String toString() {
            return "PushProvisioningWidgetReady";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$PushProvisioningWidgetFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningWidgetFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed();

        public final int hashCode() {
            return -382033923;
        }

        private PushProvisioningWidgetFailed() {
            super("PushProvisioningWidgetFailed", null);
        }

        public final java.lang.String toString() {
            return "PushProvisioningWidgetFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked();

        public final int hashCode() {
            return 2075826443;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ErrorCloseClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorCloseClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked();

        public final int hashCode() {
            return 788115650;
        }

        private ErrorCloseClicked() {
            super("ErrorCloseClicked", null);
        }

        public final java.lang.String toString() {
            return "ErrorCloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$ErrorRetryClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorRetryClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked();

        public final int hashCode() {
            return -555497966;
        }

        private ErrorRetryClicked() {
            super("ErrorRetryClicked", null);
        }

        public final java.lang.String toString() {
            return "ErrorRetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockWalletToggled extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockWalletToggled(java.lang.String str) {
            super("LockWalletToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockWalletToggled(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled lockWalletToggled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lockWalletToggled.cardId;
            }
            return lockWalletToggled.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlockWalletToggled extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockWalletToggled(java.lang.String str) {
            super("UnlockWalletToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlockWalletToggled(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled unlockWalletToggled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unlockWalletToggled.cardId;
            }
            return unlockWalletToggled.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletLockedSuccessfully;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletLockedSuccessfully extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully();

        public final int hashCode() {
            return 1261367231;
        }

        private WalletLockedSuccessfully() {
            super("WalletLockedSuccessfully", null);
        }

        public final java.lang.String toString() {
            return "WalletLockedSuccessfully";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletUnlockedSuccessfully;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletUnlockedSuccessfully extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully();

        public final int hashCode() {
            return 1216882328;
        }

        private WalletUnlockedSuccessfully() {
            super("WalletUnlockedSuccessfully", null);
        }

        public final java.lang.String toString() {
            return "WalletUnlockedSuccessfully";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "cardId", "errorTag", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$LockWalletFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getCardId", "getErrorTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockWalletFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2) {
            super("LockWalletFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorType = debitErrorType;
            this.cardId = str;
            this.errorTag = str2;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public /* synthetic */ LockWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, str, (i & 4) != 0 ? "" : str2);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.errorTag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockWalletFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.errorTag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed lockWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed) other;
            return this.errorType == lockWalletFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, lockWalletFailed.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, lockWalletFailed.errorTag);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String cardId, java.lang.String errorTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed(errorType, cardId, errorTag);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed lockWalletFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = lockWalletFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = lockWalletFailed.cardId;
            }
            if ((i & 4) != 0) {
                str2 = lockWalletFailed.errorTag;
            }
            return lockWalletFailed.copy(debitErrorType, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "cardId", "errorTag", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$UnlockWalletFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getCardId", "getErrorTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlockWalletFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2) {
            super("UnlockWalletFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorType = debitErrorType;
            this.cardId = str;
            this.errorTag = str2;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public /* synthetic */ UnlockWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, str, (i & 4) != 0 ? "" : str2);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.errorTag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlockWalletFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.errorTag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed unlockWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed) other;
            return this.errorType == unlockWalletFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, unlockWalletFailed.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, unlockWalletFailed.errorTag);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String cardId, java.lang.String errorTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed(errorType, cardId, errorTag);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed unlockWalletFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = unlockWalletFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = unlockWalletFailed.cardId;
            }
            if ((i & 4) != 0) {
                str2 = unlockWalletFailed.errorTag;
            }
            return unlockWalletFailed.copy(debitErrorType, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveWalletClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveWalletClicked(java.lang.String str) {
            super("RemoveWalletClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveWalletClicked(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked removeWalletClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = removeWalletClicked.cardId;
            }
            return removeWalletClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$WalletRemovedSuccessfully;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletRemovedSuccessfully extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully();

        public final int hashCode() {
            return 1292559865;
        }

        private WalletRemovedSuccessfully() {
            super("WalletRemovedSuccessfully", null);
        }

        public final java.lang.String toString() {
            return "WalletRemovedSuccessfully";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "cardId", "errorTag", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent$RemoveWalletFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getCardId", "getErrorTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveWalletFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2) {
            super("RemoveWalletFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorType = debitErrorType;
            this.cardId = str;
            this.errorTag = str2;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public /* synthetic */ RemoveWalletFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, str, (i & 4) != 0 ? "" : str2);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.errorTag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveWalletFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.errorTag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed removeWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed) other;
            return this.errorType == removeWalletFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, removeWalletFailed.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, removeWalletFailed.errorTag);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String cardId, java.lang.String errorTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed(errorType, cardId, errorTag);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed removeWalletFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = removeWalletFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = removeWalletFailed.cardId;
            }
            if ((i & 4) != 0) {
                str2 = removeWalletFailed.errorTag;
            }
            return removeWalletFailed.copy(debitErrorType, str, str2);
        }
    }

    public /* synthetic */ ManageWalletEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
