package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToEnterAmount", "NavigateToReview", "NavigateToEnrollment", "ShowLocationMismatch", "ShowValidationError", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnrollment;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowLocationMismatch;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ScannerUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnterAmount;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnterAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEnterAmount extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToEnterAmount(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerUiEffect.NavigateToEnterAmount", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEnterAmount(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount navigateToEnterAmount, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = navigateToEnterAmount.navArgs;
            }
            return navigateToEnterAmount.copy(qrcSessionNavArgs);
        }
    }

    private ScannerUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerUiEffect.NavigateToReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview navigateToReview, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = navigateToReview.navArgs;
            }
            return navigateToReview.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnrollment;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$NavigateToEnrollment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEnrollment extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToEnrollment(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerUiEffect.NavigateToEnrollment", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEnrollment(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment navigateToEnrollment, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = navigateToEnrollment.navArgs;
            }
            return navigateToEnrollment.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowLocationMismatch;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowLocationMismatch;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowLocationMismatch extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        public ShowLocationMismatch(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("ScannerUiEffect.ShowLocationMismatch", null);
            this.navArgs = qrcSessionNavArgs;
        }

        public /* synthetic */ ShowLocationMismatch(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : qrcSessionNavArgs);
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowLocationMismatch(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            if (qrcSessionNavArgs == null) {
                return 0;
            }
            return qrcSessionNavArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch showLocationMismatch, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = showLocationMismatch.navArgs;
            }
            return showLocationMismatch.copy(qrcSessionNavArgs);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowLocationMismatch() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowValidationError;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect$ShowValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowValidationError extends com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect {
        public static final int $stable = 0;
        private final java.lang.String reason;

        public ShowValidationError(java.lang.String str) {
            super("ScannerUiEffect.ShowValidationError", null);
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowValidationError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError) other).reason);
        }

        public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError copy(java.lang.String reason) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError copy$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError showValidationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showValidationError.reason;
            }
            return showValidationError.copy(str);
        }
    }

    public /* synthetic */ ScannerUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
