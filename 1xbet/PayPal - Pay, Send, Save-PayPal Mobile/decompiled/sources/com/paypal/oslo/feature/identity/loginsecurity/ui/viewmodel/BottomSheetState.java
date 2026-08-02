package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState;", "", "<init>", "()V", "Hidden", "FingerprintConfirmation", "ExtendSession", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$ExtendSession;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$FingerprintConfirmation;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$Hidden;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BottomSheetState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$Hidden;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.Hidden INSTANCE = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.Hidden();

        public final int hashCode() {
            return 277221403;
        }

        private Hidden() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Hidden";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    private BottomSheetState() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$FingerprintConfirmation;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState;", "", "title", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$FingerprintConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FingerprintConfirmation extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState {
        public static final int $stable = 0;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FingerprintConfirmation(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FingerprintConfirmation(title=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation) other).title);
        }

        public final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation copy(java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation(title);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation copy$default(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation fingerprintConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fingerprintConfirmation.title;
            }
            return fingerprintConfirmation.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState$ExtendSession;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExtendSession extends com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.ExtendSession INSTANCE = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.ExtendSession();

        public final int hashCode() {
            return 1608590987;
        }

        private ExtendSession() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ExtendSession";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.ExtendSession)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BottomSheetState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
