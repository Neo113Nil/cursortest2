package com.paypal.oslo.feature.home.ui.accountsnapshot.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Navigate", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect$Navigate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AccountSnapshotUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AccountSnapshotUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect$Navigate;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect$Navigate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Navigate extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Navigate(androidx.navigation3.runtime.NavKey navKey) {
            super("Navigate", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Navigate(destination=");
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
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate) other).destination);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate navigate, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigate.destination;
            }
            return navigate.copy(navKey);
        }
    }

    public /* synthetic */ AccountSnapshotUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
