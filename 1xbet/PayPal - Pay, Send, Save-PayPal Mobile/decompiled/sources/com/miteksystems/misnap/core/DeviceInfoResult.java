package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult;", "", "<init>", "()V", "Failure", "Success", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DeviceInfoResult {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure;", "Lcom/miteksystems/misnap/core/DeviceInfoResult;", "<init>", "()V", "Execution", "LibraryLoad", com.miteksystems.misnap.core.MibiData.KEY_LICENSE, "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$Execution;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$LibraryLoad;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$License;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Failure extends com.miteksystems.misnap.core.DeviceInfoResult {
        private Failure() {
            super(null);
        }

        public /* synthetic */ Failure(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$License;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$License;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getReason"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class License extends com.miteksystems.misnap.core.DeviceInfoResult.Failure {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String reason;

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("License(reason=");
                sb.append(this.reason);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.DeviceInfoResult.Failure.License) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.miteksystems.misnap.core.DeviceInfoResult.Failure.License) other).reason);
            }

            public final com.miteksystems.misnap.core.DeviceInfoResult.Failure.License copy(java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.miteksystems.misnap.core.DeviceInfoResult.Failure.License(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.miteksystems.misnap.core.DeviceInfoResult.Failure.License copy$default(com.miteksystems.misnap.core.DeviceInfoResult.Failure.License license, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = license.reason;
                }
                return license.copy(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public License(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$Execution;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Execution extends com.miteksystems.misnap.core.DeviceInfoResult.Failure {
            public static final com.miteksystems.misnap.core.DeviceInfoResult.Failure.Execution INSTANCE = new com.miteksystems.misnap.core.DeviceInfoResult.Failure.Execution();

            private Execution() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure$LibraryLoad;", "Lcom/miteksystems/misnap/core/DeviceInfoResult$Failure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LibraryLoad extends com.miteksystems.misnap.core.DeviceInfoResult.Failure {
            public static final com.miteksystems.misnap.core.DeviceInfoResult.Failure.LibraryLoad INSTANCE = new com.miteksystems.misnap.core.DeviceInfoResult.Failure.LibraryLoad();

            private LibraryLoad() {
                super(null);
            }
        }
    }

    public /* synthetic */ DeviceInfoResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoResult$Success;", "Lcom/miteksystems/misnap/core/DeviceInfoResult;", "", "", "deviceInfo", "", "licenseExpired", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/miteksystems/misnap/core/DeviceInfoResult$Success;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getDeviceInfo", util.h.xy.cb.b.f1091, "Z", "getLicenseExpired"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Success extends com.miteksystems.misnap.core.DeviceInfoResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.List<java.lang.String> deviceInfo;

        /* renamed from: b, reason: from kotlin metadata */
        private final boolean licenseExpired;

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(deviceInfo=");
            sb.append(this.deviceInfo);
            sb.append(", licenseExpired=");
            sb.append(this.licenseExpired);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.deviceInfo.hashCode();
            boolean z = this.licenseExpired;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return (hashCode * 31) + i;
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        public final java.util.List<java.lang.String> getDeviceInfo() {
            return this.deviceInfo;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.DeviceInfoResult.Success)) {
                return false;
            }
            com.miteksystems.misnap.core.DeviceInfoResult.Success success = (com.miteksystems.misnap.core.DeviceInfoResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, success.deviceInfo) && this.licenseExpired == success.licenseExpired;
        }

        public final com.miteksystems.misnap.core.DeviceInfoResult.Success copy(java.util.List<java.lang.String> deviceInfo, boolean licenseExpired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
            return new com.miteksystems.misnap.core.DeviceInfoResult.Success(deviceInfo, licenseExpired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.deviceInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.miteksystems.misnap.core.DeviceInfoResult.Success copy$default(com.miteksystems.misnap.core.DeviceInfoResult.Success success, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.deviceInfo;
            }
            if ((i & 2) != 0) {
                z = success.licenseExpired;
            }
            return success.copy(list, z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<java.lang.String> list, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.deviceInfo = list;
            this.licenseExpired = z;
        }
    }

    private DeviceInfoResult() {
    }
}
