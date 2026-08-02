package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "failedLinkedAccounts", "<init>", "(Ljava/util/List;)V", "", "onPrimaryButtonClick", "()V", "Ljava/util/List;", "getFailedLinkedAccounts", "()Ljava/util/List;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "navigateToDestination", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigateToDestination", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "errorScreenType", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "getErrorScreenType", "()Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "Factory", "NavigateTo", "ErrorScreenType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FailedLinkedAccountsErrorViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType errorScreenType;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedLinkedAccounts;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo> navigateToDestination;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$Factory;", "", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "failedLinkedAccounts", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;", "create", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel create(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedLinkedAccounts);
    }

    @dagger.assisted.AssistedInject
    public FailedLinkedAccountsErrorViewModel(@dagger.assisted.Assisted java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list) {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.HybridType hybridType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.failedLinkedAccounts = list;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.navigateToDestination = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModelKt.toFailedLinkedAccountsFailType(((com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult) it.next()).getErrorType()));
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        if (set.isEmpty()) {
            hybridType = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.TERMINAL);
        } else if (set.size() == 1) {
            hybridType = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType) kotlin.collections.CollectionsKt.first(set));
        } else {
            hybridType = com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.HybridType.INSTANCE;
        }
        this.errorScreenType = hybridType;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> getFailedLinkedAccounts() {
        return this.failedLinkedAccounts;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo;", "", "<init>", "()V", "ConsentScreen", "ResolutionCenter", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo$ConsentScreen;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo$ResolutionCenter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NavigateTo {
        public static final int $stable = 0;

        private NavigateTo() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo$ConsentScreen;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConsentScreen extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ConsentScreen INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ConsentScreen();

            public final int hashCode() {
                return -295503287;
            }

            private ConsentScreen() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ConsentScreen";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ConsentScreen)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo$ResolutionCenter;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ResolutionCenter extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ResolutionCenter INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ResolutionCenter();

            public final int hashCode() {
                return -1957248994;
            }

            private ResolutionCenter() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ResolutionCenter";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ResolutionCenter)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ NavigateTo(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "", "<init>", "()V", "SingleType", "HybridType", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType$HybridType;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType$SingleType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ErrorScreenType {
        public static final int $stable = 0;

        private ErrorScreenType() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType$SingleType;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;", "failType", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType$SingleType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;", "getFailType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SingleType extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleType(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedLinkedAccountsFailType, "");
                this.failType = failedLinkedAccountsFailType;
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType getFailType() {
                return this.failType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType = this.failType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleType(failType=");
                sb.append(failedLinkedAccountsFailType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.failType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) && this.failType == ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) other).failType;
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType copy(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failType, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType(failType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType getFailType() {
                return this.failType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType copy$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType singleType, com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    failedLinkedAccountsFailType = singleType.failType;
                }
                return singleType.copy(failedLinkedAccountsFailType);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType$HybridType;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$ErrorScreenType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HybridType extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.HybridType INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.HybridType();

            public final int hashCode() {
                return -651819493;
            }

            private HybridType() {
                super(null);
            }

            public final java.lang.String toString() {
                return "HybridType";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.HybridType)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ ErrorScreenType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo> getNavigateToDestination() {
        return this.navigateToDestination;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType getErrorScreenType() {
        return this.errorScreenType;
    }

    public final void onPrimaryButtonClick() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo.ConsentScreen.INSTANCE)) {
        }
    }
}
