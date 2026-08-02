package com.paypal.oslo.feature.pushnotification.silentpush.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError;", "", "InvalidEventType", "MissingTargetModule", "NoHandlerFound", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$InvalidEventType;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$MissingTargetModule;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$NoHandlerFound;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SilentPushError {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$InvalidEventType;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError;", "", "actual", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$InvalidEventType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActual"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidEventType implements com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError {
        public static final int $stable = 0;
        private final java.lang.String actual;

        public InvalidEventType(java.lang.String str) {
            this.actual = str;
        }

        public final java.lang.String getActual() {
            return this.actual;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.actual;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidEventType(actual=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.actual;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType) && kotlin.jvm.internal.Intrinsics.areEqual(this.actual, ((com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType) other).actual);
        }

        public final com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType copy(java.lang.String actual) {
            return new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType(actual);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActual() {
            return this.actual;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType copy$default(com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType invalidEventType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidEventType.actual;
            }
            return invalidEventType.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$MissingTargetModule;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingTargetModule implements com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.MissingTargetModule INSTANCE = new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.MissingTargetModule();

        public final int hashCode() {
            return -685462042;
        }

        private MissingTargetModule() {
        }

        public final java.lang.String toString() {
            return "MissingTargetModule";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.MissingTargetModule)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$NoHandlerFound;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError;", "", "targetModule", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError$NoHandlerFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTargetModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoHandlerFound implements com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError {
        public static final int $stable = 0;
        private final java.lang.String targetModule;

        public NoHandlerFound(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.targetModule = str;
        }

        public final java.lang.String getTargetModule() {
            return this.targetModule;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.targetModule;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoHandlerFound(targetModule=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.targetModule.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetModule, ((com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound) other).targetModule);
        }

        public final com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound copy(java.lang.String targetModule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetModule, "");
            return new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound(targetModule);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTargetModule() {
            return this.targetModule;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound copy$default(com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.NoHandlerFound noHandlerFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = noHandlerFound.targetModule;
            }
            return noHandlerFound.copy(str);
        }
    }
}
