package com.paypal.android.taptopay.domain.model.card;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "", "CardNotFound", "DefaultError", "InitCheckFailed", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$CardNotFound;", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$DefaultError;", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$InitCheckFailed;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ResumeCardError {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$InitCheckFailed;", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$InitCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitCheckFailed implements com.paypal.android.taptopay.domain.model.card.ResumeCardError {
        private final java.lang.String debugMessage;

        public InitCheckFailed(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitCheckFailed(debugMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debugMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed) other).debugMessage);
        }

        public final com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed copy(java.lang.String debugMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed(debugMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed copy$default(com.paypal.android.taptopay.domain.model.card.ResumeCardError.InitCheckFailed initCheckFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initCheckFailed.debugMessage;
            }
            return initCheckFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$CardNotFound;", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardNotFound implements com.paypal.android.taptopay.domain.model.card.ResumeCardError {
        public static final com.paypal.android.taptopay.domain.model.card.ResumeCardError.CardNotFound INSTANCE = new com.paypal.android.taptopay.domain.model.card.ResumeCardError.CardNotFound();

        public final int hashCode() {
            return -1807515992;
        }

        private CardNotFound() {
        }

        public final java.lang.String toString() {
            return "CardNotFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.domain.model.card.ResumeCardError.CardNotFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$DefaultError;", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DefaultError implements com.paypal.android.taptopay.domain.model.card.ResumeCardError {
        private final java.lang.String debugMessage;
        private final java.lang.Throwable throwable;

        public DefaultError(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
            this.throwable = th;
        }

        public /* synthetic */ DefaultError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(debugMessage=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debugMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError)) {
                return false;
            }
            com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, defaultError.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, defaultError.throwable);
        }

        public final com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError copy$default(com.paypal.android.taptopay.domain.model.card.ResumeCardError.DefaultError defaultError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = defaultError.debugMessage;
            }
            if ((i & 2) != 0) {
                th = defaultError.throwable;
            }
            return defaultError.copy(str, th);
        }
    }
}
