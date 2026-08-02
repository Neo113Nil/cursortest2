package com.paypal.oslo.feature.packagetracking.domain.model.display;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation;", "", "<init>", "()V", "Loading", "Success", "Hide", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Hide;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Loading;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageLocation {
    public static final int $stable = 0;

    private PackageLocation() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Loading;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading();

        public final int hashCode() {
            return -365578608;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Success;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "address", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)V", "component1", "()Lcom/google/android/gms/maps/model/LatLng;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLng", "Ljava/lang/String;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation {
        public static final int $stable = 8;
        private final java.lang.String address;
        private final com.google.android.gms.maps.model.LatLng latLng;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.latLng = latLng;
            this.address = str;
        }

        public final java.lang.String getAddress() {
            return this.address;
        }

        public final com.google.android.gms.maps.model.LatLng getLatLng() {
            return this.latLng;
        }

        public final java.lang.String toString() {
            com.google.android.gms.maps.model.LatLng latLng = this.latLng;
            java.lang.String str = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(latLng=");
            sb.append(latLng);
            sb.append(", address=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.latLng.hashCode() * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success success = (com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.latLng, success.latLng) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, success.address);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success copy(com.google.android.gms.maps.model.LatLng latLng, java.lang.String address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success(latLng, address);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddress() {
            return this.address;
        }

        /* renamed from: component1, reason: from getter */
        public final com.google.android.gms.maps.model.LatLng getLatLng() {
            return this.latLng;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success copy$default(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Success success, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                latLng = success.latLng;
            }
            if ((i & 2) != 0) {
                str = success.address;
            }
            return success.copy(latLng, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation$Hide;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageLocation;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hide extends com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Hide INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Hide();

        public final int hashCode() {
            return 1993877614;
        }

        private Hide() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Hide";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.display.PackageLocation.Hide)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PackageLocation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
