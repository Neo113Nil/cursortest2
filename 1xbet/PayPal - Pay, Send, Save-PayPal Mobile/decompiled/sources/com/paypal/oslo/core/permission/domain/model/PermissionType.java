package com.paypal.oslo.core.permission.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "PushNotifications", "Camera", "FineLocation", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType$Camera;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType$FineLocation;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType$PushNotifications;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class PermissionType {
    public static final int $stable = 0;
    private final java.lang.String permission;

    private PermissionType(java.lang.String str) {
        this.permission = str;
    }

    public final java.lang.String getPermission() {
        return this.permission;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionType$PushNotifications;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushNotifications extends com.paypal.oslo.core.permission.domain.model.PermissionType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionType.PushNotifications INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionType.PushNotifications();

        public final int hashCode() {
            return 2085963375;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private PushNotifications() {
            super(r0, null);
            java.lang.String str;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                str = "android.permission.POST_NOTIFICATIONS";
            } else {
                str = "";
            }
        }

        public final java.lang.String toString() {
            return "PushNotifications";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionType.PushNotifications)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionType$Camera;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Camera extends com.paypal.oslo.core.permission.domain.model.PermissionType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionType.Camera INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionType.Camera();

        public final int hashCode() {
            return 1888842564;
        }

        private Camera() {
            super("android.permission.CAMERA", null);
        }

        public final java.lang.String toString() {
            return "Camera";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionType.Camera)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionType$FineLocation;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FineLocation extends com.paypal.oslo.core.permission.domain.model.PermissionType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation();

        public final int hashCode() {
            return 1086749806;
        }

        private FineLocation() {
            super("android.permission.ACCESS_FINE_LOCATION", null);
        }

        public final java.lang.String toString() {
            return "FineLocation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PermissionType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
