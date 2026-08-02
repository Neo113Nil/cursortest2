package com.paypal.oslo.app.launch;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSource;", "", "<init>", "()V", "Organic", "DeepLink", "PushNotification", "Lcom/paypal/oslo/app/launch/AppLaunchSource$DeepLink;", "Lcom/paypal/oslo/app/launch/AppLaunchSource$Organic;", "Lcom/paypal/oslo/app/launch/AppLaunchSource$PushNotification;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AppLaunchSource {
    public static final int $stable = 0;

    private AppLaunchSource() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSource$Organic;", "Lcom/paypal/oslo/app/launch/AppLaunchSource;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Organic extends com.paypal.oslo.app.launch.AppLaunchSource {
        public static final int $stable = 0;
        public static final com.paypal.oslo.app.launch.AppLaunchSource.Organic INSTANCE = new com.paypal.oslo.app.launch.AppLaunchSource.Organic();

        public final int hashCode() {
            return 800810839;
        }

        private Organic() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Organic";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.app.launch.AppLaunchSource.Organic)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSource$DeepLink;", "Lcom/paypal/oslo/app/launch/AppLaunchSource;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/app/launch/AppLaunchSource$DeepLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeepLink extends com.paypal.oslo.app.launch.AppLaunchSource {
        public static final int $stable = 0;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeepLink(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.app.launch.AppLaunchSource.DeepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.app.launch.AppLaunchSource.DeepLink) other).id);
        }

        public final com.paypal.oslo.app.launch.AppLaunchSource.DeepLink copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.app.launch.AppLaunchSource.DeepLink(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.app.launch.AppLaunchSource.DeepLink copy$default(com.paypal.oslo.app.launch.AppLaunchSource.DeepLink deepLink, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deepLink.id;
            }
            return deepLink.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSource$PushNotification;", "Lcom/paypal/oslo/app/launch/AppLaunchSource;", "", "notificationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/app/launch/AppLaunchSource$PushNotification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushNotification extends com.paypal.oslo.app.launch.AppLaunchSource {
        public static final int $stable = 0;
        private final java.lang.String notificationId;

        public PushNotification(java.lang.String str) {
            super(null);
            this.notificationId = str;
        }

        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notificationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PushNotification(notificationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.notificationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.app.launch.AppLaunchSource.PushNotification) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, ((com.paypal.oslo.app.launch.AppLaunchSource.PushNotification) other).notificationId);
        }

        public final com.paypal.oslo.app.launch.AppLaunchSource.PushNotification copy(java.lang.String notificationId) {
            return new com.paypal.oslo.app.launch.AppLaunchSource.PushNotification(notificationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNotificationId() {
            return this.notificationId;
        }

        public static /* synthetic */ com.paypal.oslo.app.launch.AppLaunchSource.PushNotification copy$default(com.paypal.oslo.app.launch.AppLaunchSource.PushNotification pushNotification, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pushNotification.notificationId;
            }
            return pushNotification.copy(str);
        }
    }

    public /* synthetic */ AppLaunchSource(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
