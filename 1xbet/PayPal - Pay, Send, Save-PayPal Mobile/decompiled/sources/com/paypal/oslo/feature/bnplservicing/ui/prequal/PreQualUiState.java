package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "ReLoading", "Error", "Success", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$ReLoading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PreQualUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PreQualUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading();

        public final int hashCode() {
            return 142419962;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$ReLoading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$ReLoading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReLoading extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReLoading(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel) {
            super("ReLoading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preQualUiModel, "");
            this.model = preQualUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReLoading(model=");
            sb.append(preQualUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading copy(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.ReLoading reLoading, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                preQualUiModel = reLoading.model;
            }
            return reLoading.copy(preQualUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error();

        public final int hashCode() {
            return 963620934;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Success;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preQualUiModel, "");
            this.model = preQualUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(model=");
            sb.append(preQualUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success copy(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiState.Success success, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                preQualUiModel = success.model;
            }
            return success.copy(preQualUiModel);
        }
    }

    public /* synthetic */ PreQualUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
