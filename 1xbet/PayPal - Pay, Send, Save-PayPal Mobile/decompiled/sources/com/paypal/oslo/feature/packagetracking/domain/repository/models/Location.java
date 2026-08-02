package com.paypal.oslo.feature.packagetracking.domain.repository.models;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "", "", "lat", "lng", "<init>", "(DD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()D", "component2", "copy", "(DD)Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$package_tracking_prodRelease", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getLat", "getLng", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Location {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.domain.repository.models.Location.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.repository.models.Location.Companion(null);
    private final double lat;
    private final double lng;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.packagetracking.domain.repository.models.Location> serializer() {
            return com.paypal.oslo.feature.packagetracking.domain.repository.models.Location$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Location(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public /* synthetic */ Location(int i, double d, double d2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lat = 0.0d;
        } else {
            this.lat = d;
        }
        if ((i & 2) == 0) {
            this.lng = 0.0d;
        } else {
            this.lng = d2;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.domain.repository.models.Location self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || java.lang.Double.compare(self.lat, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.lat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || java.lang.Double.compare(self.lng, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.lng);
        }
    }

    public /* synthetic */ Location(double d, double d2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final java.lang.String toString() {
        double d = this.lat;
        double d2 = this.lng;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(lat=");
        sb.append(d);
        sb.append(", lng=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Double.hashCode(this.lat) * 31) + java.lang.Double.hashCode(this.lng);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.repository.models.Location)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location = (com.paypal.oslo.feature.packagetracking.domain.repository.models.Location) other;
        return java.lang.Double.compare(this.lat, location.lat) == 0 && java.lang.Double.compare(this.lng, location.lng) == 0;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.repository.models.Location copy(double lat, double lng) {
        return new com.paypal.oslo.feature.packagetracking.domain.repository.models.Location(lat, lng);
    }

    /* renamed from: component2, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.repository.models.Location copy$default(com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = location.lat;
        }
        if ((i & 2) != 0) {
            d2 = location.lng;
        }
        return location.copy(d, d2);
    }

    public Location() {
        this(0.0d, 0.0d, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
