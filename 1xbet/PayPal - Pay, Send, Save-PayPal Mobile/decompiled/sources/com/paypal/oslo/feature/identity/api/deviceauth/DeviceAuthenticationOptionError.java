package com.paypal.oslo.feature.identity.api.deviceauth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "Unsupported", "Failed", "Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Failed;", "Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Unsupported;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeviceAuthenticationOptionError {
    private final java.lang.String msg;

    private DeviceAuthenticationOptionError(java.lang.String str) {
        this.msg = str;
    }

    public java.lang.String getMsg() {
        return this.msg;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Unsupported;", "Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError;", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Unsupported;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMsg"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unsupported extends com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError {
        private final java.lang.String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsupported(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }

        @Override // com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError
        public final java.lang.String getMsg() {
            return this.msg;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.msg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported(msg=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.msg.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported) && kotlin.jvm.internal.Intrinsics.areEqual(this.msg, ((com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported) other).msg);
        }

        public final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported copy(java.lang.String msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
            return new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported(msg);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMsg() {
            return this.msg;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported copy$default(com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Unsupported unsupported, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unsupported.msg;
            }
            return unsupported.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Failed;", "Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError;", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionError$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMsg"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError {
        private final java.lang.String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }

        @Override // com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError
        public final java.lang.String getMsg() {
            return this.msg;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.msg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(msg=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.msg.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.msg, ((com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed) other).msg);
        }

        public final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed copy(java.lang.String msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
            return new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed(msg);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMsg() {
            return this.msg;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed copy$default(com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionError.Failed failed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failed.msg;
            }
            return failed.copy(str);
        }
    }

    public /* synthetic */ DeviceAuthenticationOptionError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
