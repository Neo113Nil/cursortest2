package com.paypal.oslo.feature.home.ui.accountsnapshot.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Error;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Loading;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AccountSnapshotUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AccountSnapshotUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Loading;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "section", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> section;

        public Loading(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("Loading", null);
            this.section = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getSection() {
            return this.section;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.section;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(section=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.section;
            if (section == null) {
                return 0;
            }
            return section.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.section, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading) other).section);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading copy(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading(section);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.section;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading loading, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = loading.section;
            }
            return loading.copy(section);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Success;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "section", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            this.section = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getSection() {
            return this.section;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.section;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(section=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.section, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success) other).section);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success copy(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success(section);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.section;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success success, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = success.section;
            }
            return success.copy(section);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Error;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "section", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            this.section = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getSection() {
            return this.section;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.section;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(section=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.section, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error) other).section);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error copy(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error(section);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.section;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error error, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = error.section;
            }
            return error.copy(section);
        }
    }

    public /* synthetic */ AccountSnapshotUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
