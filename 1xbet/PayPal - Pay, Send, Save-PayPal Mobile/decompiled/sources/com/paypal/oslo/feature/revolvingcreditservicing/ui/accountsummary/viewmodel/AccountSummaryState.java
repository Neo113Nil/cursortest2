package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "toolbarTitle", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getToolbarTitle", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "CreditDisclosurePending", "Error", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$CreditDisclosurePending;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AccountSummaryState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toolbarTitle;

    private AccountSummaryState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
        this.name = str;
        this.toolbarTitle = uiString;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ AccountSummaryState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE : empty, null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getToolbarTitle() {
        return this.toolbarTitle;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial();

        public final int hashCode() {
            return 1504124569;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Initial() {
            super("Initial", null, 2, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "", "shouldCheckBottomSheetConditions", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShouldCheckBottomSheetConditions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState {
        public static final int $stable = 0;
        private final boolean shouldCheckBottomSheetConditions;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading(boolean z) {
            super("Loading", null, 2, 0 == true ? 1 : 0);
            this.shouldCheckBottomSheetConditions = z;
        }

        public /* synthetic */ Loading(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getShouldCheckBottomSheetConditions() {
            return this.shouldCheckBottomSheetConditions;
        }

        public final java.lang.String toString() {
            boolean z = this.shouldCheckBottomSheetConditions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(shouldCheckBottomSheetConditions=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.shouldCheckBottomSheetConditions);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading) && this.shouldCheckBottomSheetConditions == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading) other).shouldCheckBottomSheetConditions;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading copy(boolean shouldCheckBottomSheetConditions) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(shouldCheckBottomSheetConditions);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldCheckBottomSheetConditions() {
            return this.shouldCheckBottomSheetConditions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading loading, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = loading.shouldCheckBottomSheetConditions;
            }
            return loading.copy(z);
        }

        public Loading() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bá\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b\u0012\u001c\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000e\u0012\u001c\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0011\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\bj\u0002`\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J&\u0010/\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000eHÆ\u0003¢\u0006\u0004\b/\u0010.J&\u00100\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0011HÆ\u0003¢\u0006\u0004\b0\u0010.J \u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\bj\u0002`\u0015HÆ\u0003¢\u0006\u0004\b1\u0010.J\u0012\u00102\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005HÆ\u0003¢\u0006\u0004\b4\u0010,J\u0010\u00105\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020!HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020#HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020%HÆ\u0003¢\u0006\u0004\b?\u0010@Jü\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001e\b\u0002\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000e2\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u00112\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\bj\u0002`\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020%2\b\u0010D\u001a\u0004\u0018\u00010CHÖ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bG\u00108J\u0010\u0010I\u001a\u00020HHÖ\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bL\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010,R0\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010.R0\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bQ\u0010.R0\u0010\u0012\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0004\u0012\u00020\n0\bj\u0002`\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bR\u0010.R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\bj\u0002`\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bS\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u00103R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bV\u0010,R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bX\u00106R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010Y\u001a\u0004\bZ\u00108R\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010[\u001a\u0004\b\\\u0010:R\u001a\u0010\"\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010]\u001a\u0004\b^\u0010<R\u001a\u0010$\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010_\u001a\u0004\b`\u0010>R\u001a\u0010&\u001a\u00020%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010a\u001a\u0004\bb\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "accountSummaryOverView", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountActionItemUiModel;", "recurringAccountActionsSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/specialfinancing/SpecialFinancingSectionUiState;", "specialFinancingSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/transactionitem/TransactionItemUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recentactivites/RecentActivitiesSectionUiState;", "recentActivitySection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/accountfeatures/AccountFeaturesSectionUiState;", "accountFeaturesSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiState;", "prioritizedAccountActionSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "balanceModuleUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PrioritizedAccountAction;", "prioritizedAccountAction", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "pushToWalletUiState", "", "toolbarTitleRes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "cashbackRewardUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "bottomSheetToShow", "", "shouldCheckBottomSheetConditions", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;ILcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "component8", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "component10", "()I", "component11", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component12", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "component13", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "component14", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;ILcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "getAccountSummaryOverView", "Ljava/util/List;", "getRecurringAccountActionsSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "getSpecialFinancingSection", "getRecentActivitySection", "getAccountFeaturesSection", "getPrioritizedAccountActionSection", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/BalanceModuleUiModel;", "getBalanceModuleUiModel", "getPrioritizedAccountAction", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/pushtowallet/PushToWalletUiState;", "getPushToWalletUiState", com.visa.cbp.getEncExpo.warmup, "getToolbarTitleRes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "getCashbackRewardUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "getBottomSheetToShow", "Z", "getShouldCheckBottomSheetConditions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountFeaturesSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType bottomSheetToShow;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> prioritizedAccountAction;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> prioritizedAccountActionSection;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState recentActivitySection;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> recurringAccountActionsSection;
        private final boolean shouldCheckBottomSheetConditions;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState specialFinancingSection;
        private final int toolbarTitleRes;

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView getAccountSummaryOverView() {
            return this.accountSummaryOverView;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> getRecurringAccountActionsSection() {
            return this.recurringAccountActionsSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getSpecialFinancingSection() {
            return this.specialFinancingSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getRecentActivitySection() {
            return this.recentActivitySection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getAccountFeaturesSection() {
            return this.accountFeaturesSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getPrioritizedAccountActionSection() {
            return this.prioritizedAccountActionSection;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel getBalanceModuleUiModel() {
            return this.balanceModuleUiModel;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState4, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, java.util.List list2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState, int i, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(accountSummaryOverView, list, accountSummarySectionUiState, accountSummarySectionUiState2, accountSummarySectionUiState3, accountSummarySectionUiState4, (i2 & 64) != 0 ? null : balanceModuleUiModel, (i2 & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 256) != 0 ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState(false, null, 2, null) : pushToWalletUiState, i, creditProductIdentifier, cashbackRewardUiModel, (i2 & 4096) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE : accountSummaryBottomSheetType, (i2 & 8192) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> getPrioritizedAccountAction() {
            return this.prioritizedAccountAction;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState getPushToWalletUiState() {
            return this.pushToWalletUiState;
        }

        public final int getToolbarTitleRes() {
            return this.toolbarTitleRes;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel getCashbackRewardUiModel() {
            return this.cashbackRewardUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType getBottomSheetToShow() {
            return this.bottomSheetToShow;
        }

        public final boolean getShouldCheckBottomSheetConditions() {
            return this.shouldCheckBottomSheetConditions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> list, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState4, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> list2, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState, int i, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType, boolean z) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i, creditProductIdentifier, true), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushToWalletUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryBottomSheetType, "");
            this.accountSummaryOverView = accountSummaryOverView;
            this.recurringAccountActionsSection = list;
            this.specialFinancingSection = accountSummarySectionUiState;
            this.recentActivitySection = accountSummarySectionUiState2;
            this.accountFeaturesSection = accountSummarySectionUiState3;
            this.prioritizedAccountActionSection = accountSummarySectionUiState4;
            this.balanceModuleUiModel = balanceModuleUiModel;
            this.prioritizedAccountAction = list2;
            this.pushToWalletUiState = pushToWalletUiState;
            this.toolbarTitleRes = i;
            this.creditProductIdentifier = creditProductIdentifier;
            this.cashbackRewardUiModel = cashbackRewardUiModel;
            this.bottomSheetToShow = accountSummaryBottomSheetType;
            this.shouldCheckBottomSheetConditions = z;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = this.accountSummaryOverView;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> list = this.recurringAccountActionsSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState = this.specialFinancingSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2 = this.recentActivitySection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState3 = this.accountFeaturesSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState4 = this.prioritizedAccountActionSection;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = this.balanceModuleUiModel;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> list2 = this.prioritizedAccountAction;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState = this.pushToWalletUiState;
            int i = this.toolbarTitleRes;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel = this.cashbackRewardUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType = this.bottomSheetToShow;
            boolean z = this.shouldCheckBottomSheetConditions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(accountSummaryOverView=");
            sb.append(accountSummaryOverView);
            sb.append(", recurringAccountActionsSection=");
            sb.append(list);
            sb.append(", specialFinancingSection=");
            sb.append(accountSummarySectionUiState);
            sb.append(", recentActivitySection=");
            sb.append(accountSummarySectionUiState2);
            sb.append(", accountFeaturesSection=");
            sb.append(accountSummarySectionUiState3);
            sb.append(", prioritizedAccountActionSection=");
            sb.append(accountSummarySectionUiState4);
            sb.append(", balanceModuleUiModel=");
            sb.append(balanceModuleUiModel);
            sb.append(", prioritizedAccountAction=");
            sb.append(list2);
            sb.append(", pushToWalletUiState=");
            sb.append(pushToWalletUiState);
            sb.append(", toolbarTitleRes=");
            sb.append(i);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", cashbackRewardUiModel=");
            sb.append(cashbackRewardUiModel);
            sb.append(", bottomSheetToShow=");
            sb.append(accountSummaryBottomSheetType);
            sb.append(", shouldCheckBottomSheetConditions=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.accountSummaryOverView.hashCode();
            int hashCode2 = this.recurringAccountActionsSection.hashCode();
            int hashCode3 = this.specialFinancingSection.hashCode();
            int hashCode4 = this.recentActivitySection.hashCode();
            int hashCode5 = this.accountFeaturesSection.hashCode();
            int hashCode6 = this.prioritizedAccountActionSection.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel = this.balanceModuleUiModel;
            return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balanceModuleUiModel == null ? 0 : balanceModuleUiModel.hashCode())) * 31) + this.prioritizedAccountAction.hashCode()) * 31) + this.pushToWalletUiState.hashCode()) * 31) + java.lang.Integer.hashCode(this.toolbarTitleRes)) * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.cashbackRewardUiModel.hashCode()) * 31) + this.bottomSheetToShow.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldCheckBottomSheetConditions);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountSummaryOverView, ready.accountSummaryOverView) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurringAccountActionsSection, ready.recurringAccountActionsSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.specialFinancingSection, ready.specialFinancingSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentActivitySection, ready.recentActivitySection) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountFeaturesSection, ready.accountFeaturesSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.prioritizedAccountActionSection, ready.prioritizedAccountActionSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceModuleUiModel, ready.balanceModuleUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.prioritizedAccountAction, ready.prioritizedAccountAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.pushToWalletUiState, ready.pushToWalletUiState) && this.toolbarTitleRes == ready.toolbarTitleRes && this.creditProductIdentifier == ready.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackRewardUiModel, ready.cashbackRewardUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetToShow, ready.bottomSheetToShow) && this.shouldCheckBottomSheetConditions == ready.shouldCheckBottomSheetConditions;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> recurringAccountActionsSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState specialFinancingSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState recentActivitySection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountFeaturesSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> prioritizedAccountActionSection, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> prioritizedAccountAction, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState pushToWalletUiState, int toolbarTitleRes, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel cashbackRewardUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType bottomSheetToShow, boolean shouldCheckBottomSheetConditions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringAccountActionsSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentActivitySection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountFeaturesSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountActionSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushToWalletUiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetToShow, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready(accountSummaryOverView, recurringAccountActionsSection, specialFinancingSection, recentActivitySection, accountFeaturesSection, prioritizedAccountActionSection, balanceModuleUiModel, prioritizedAccountAction, pushToWalletUiState, toolbarTitleRes, creditProductIdentifier, cashbackRewardUiModel, bottomSheetToShow, shouldCheckBottomSheetConditions);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState getPushToWalletUiState() {
            return this.pushToWalletUiState;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> component8() {
            return this.prioritizedAccountAction;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel getBalanceModuleUiModel() {
            return this.balanceModuleUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> component6() {
            return this.prioritizedAccountActionSection;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getAccountFeaturesSection() {
            return this.accountFeaturesSection;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getRecentActivitySection() {
            return this.recentActivitySection;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState getSpecialFinancingSection() {
            return this.specialFinancingSection;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionItemUiModel> component2() {
            return this.recurringAccountActionsSection;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShouldCheckBottomSheetConditions() {
            return this.shouldCheckBottomSheetConditions;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType getBottomSheetToShow() {
            return this.bottomSheetToShow;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel getCashbackRewardUiModel() {
            return this.cashbackRewardUiModel;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component10, reason: from getter */
        public final int getToolbarTitleRes() {
            return this.toolbarTitleRes;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView getAccountSummaryOverView() {
            return this.accountSummaryOverView;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$CreditDisclosurePending;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "pendingDataEvent", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$CreditDisclosurePending;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "getPendingDataEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreditDisclosurePending extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded pendingDataEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CreditDisclosurePending(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded) {
            super("CreditDisclosurePending", null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDataLoaded, "");
            this.pendingDataEvent = onDataLoaded;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded getPendingDataEvent() {
            return this.pendingDataEvent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded = this.pendingDataEvent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditDisclosurePending(pendingDataEvent=");
            sb.append(onDataLoaded);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pendingDataEvent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingDataEvent, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending) other).pendingDataEvent);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded pendingDataEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingDataEvent, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending(pendingDataEvent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded getPendingDataEvent() {
            return this.pendingDataEvent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending creditDisclosurePending, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onDataLoaded = creditDisclosurePending.pendingDataEvent;
            }
            return creditDisclosurePending.copy(onDataLoaded);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "uiModel", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "getUiModel", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel, java.lang.String str) {
            super("Error", null, 2, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryFullScreenErrorUiModel, "");
            this.uiModel = accountSummaryFullScreenErrorUiModel;
            this.creditAccountId = str;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(accountSummaryFullScreenErrorUiModel, (i & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel = this.uiModel;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(uiModel=");
            sb.append(accountSummaryFullScreenErrorUiModel);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            java.lang.String str = this.creditAccountId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, error.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, error.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel uiModel, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error(uiModel, creditAccountId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel accountSummaryFullScreenErrorUiModel, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountSummaryFullScreenErrorUiModel = error.uiModel;
            }
            if ((i & 2) != 0) {
                str = error.creditAccountId;
            }
            return error.copy(accountSummaryFullScreenErrorUiModel, str);
        }
    }

    public /* synthetic */ AccountSummaryState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiString);
    }
}
