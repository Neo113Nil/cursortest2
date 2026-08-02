package com.paypal.oslo.core.permission.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "", "<init>", "()V", "Granted", "ShouldShowRationale", "PermanentlyDenied", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$Granted;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$PermanentlyDenied;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$ShouldShowRationale;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class PermissionStatus {
    public static final int $stable = 0;

    private PermissionStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$Granted;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Granted extends com.paypal.oslo.core.permission.domain.model.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted();

        public final int hashCode() {
            return 1370685940;
        }

        private Granted() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Granted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$ShouldShowRationale;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShouldShowRationale extends com.paypal.oslo.core.permission.domain.model.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale();

        public final int hashCode() {
            return 29708608;
        }

        private ShouldShowRationale() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShouldShowRationale";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus$PermanentlyDenied;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermanentlyDenied extends com.paypal.oslo.core.permission.domain.model.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied INSTANCE = new com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied();

        public final int hashCode() {
            return -293784017;
        }

        private PermanentlyDenied() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PermanentlyDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PermissionStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
