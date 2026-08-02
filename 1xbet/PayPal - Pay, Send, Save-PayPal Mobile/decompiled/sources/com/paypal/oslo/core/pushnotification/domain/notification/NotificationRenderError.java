package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "PermissionDenied", "ResourceNotFound", "InvalidData", "Unknown", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$InvalidData;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$PermissionDenied;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$ResourceNotFound;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NotificationRenderError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$PermissionDenied;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionDenied implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError {
        public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.PermissionDenied INSTANCE = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.PermissionDenied();

        public final int hashCode() {
            return -1093619555;
        }

        private PermissionDenied() {
        }

        public final java.lang.String toString() {
            return "PermissionDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.PermissionDenied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$ResourceNotFound;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "resourceName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$ResourceNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getResourceName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResourceNotFound implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError {
        private final java.lang.String resourceName;

        public ResourceNotFound(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.resourceName = str;
        }

        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.resourceName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceNotFound(resourceName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.resourceName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceName, ((com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound) other).resourceName);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound copy(java.lang.String resourceName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceName, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound(resourceName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.ResourceNotFound resourceNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resourceNotFound.resourceName;
            }
            return resourceNotFound.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$InvalidData;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$InvalidData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidData implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError {
        private final java.lang.String message;

        public InvalidData(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidData(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData) other).message);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData invalidData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidData.message;
            }
            return invalidData.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$Unknown;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError {
        private final java.lang.Throwable cause;

        public Unknown(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown) other).cause);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown unknown, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(th);
        }
    }
}
