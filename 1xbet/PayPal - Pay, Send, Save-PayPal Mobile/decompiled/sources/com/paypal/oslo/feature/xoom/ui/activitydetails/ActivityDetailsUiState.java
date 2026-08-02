package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Initializing", "Initialized", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initial;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initialized;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initializing;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ActivityDetailsUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ActivityDetailsUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initial;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial INSTANCE = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial();

        public final int hashCode() {
            return 2018051181;
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
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initializing;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initializing extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing INSTANCE = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing();

        public final int hashCode() {
            return -524654396;
        }

        private Initializing() {
            super("Initializing", null);
        }

        public final java.lang.String toString() {
            return "Initializing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initialized;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState$Initialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialized extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialized(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel) {
            super("Initialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsUiModel, "");
            this.uiModel = activityDetailsUiModel;
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialized(uiModel=");
            sb.append(activityDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized copy(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized initialized, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsUiModel = initialized.uiModel;
            }
            return initialized.copy(activityDetailsUiModel);
        }
    }

    public /* synthetic */ ActivityDetailsUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
