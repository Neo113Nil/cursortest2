package com.paypal.oslo.feature.packagetracking.domain.repository.models;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Geometry;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "location", "", "locationType", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Geometry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$package_tracking_prodRelease", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Geometry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Location;", "getLocation", "Ljava/lang/String;", "getLocationType", "getLocationType$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Geometry {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry.Companion(null);
    private final com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location;
    private final java.lang.String locationType;

    @kotlinx.serialization.SerialName("location_type")
    public static /* synthetic */ void getLocationType$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Geometry$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/Geometry;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry> serializer() {
            return com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Geometry(int i, com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.location = null;
        } else {
            this.location = location;
        }
        if ((i & 2) == 0) {
            this.locationType = null;
        } else {
            this.locationType = str;
        }
    }

    public Geometry(com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, java.lang.String str) {
        this.location = location;
        this.locationType = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.location != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.packagetracking.domain.repository.models.Location$$serializer.INSTANCE, self.location);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.locationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.locationType);
        }
    }

    public /* synthetic */ Geometry(com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : location, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.repository.models.Location getLocation() {
        return this.location;
    }

    public final java.lang.String getLocationType() {
        return this.locationType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location = this.location;
        java.lang.String str = this.locationType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Geometry(location=");
        sb.append(location);
        sb.append(", locationType=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location = this.location;
        int hashCode = location == null ? 0 : location.hashCode();
        java.lang.String str = this.locationType;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry geometry = (com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.location, geometry.location) && kotlin.jvm.internal.Intrinsics.areEqual(this.locationType, geometry.locationType);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry copy(com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, java.lang.String locationType) {
        return new com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry(location, locationType);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLocationType() {
        return this.locationType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.repository.models.Location getLocation() {
        return this.location;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry copy$default(com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry geometry, com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            location = geometry.location;
        }
        if ((i & 2) != 0) {
            str = geometry.locationType;
        }
        return geometry.copy(location, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Geometry() {
        this((com.paypal.oslo.feature.packagetracking.domain.repository.models.Location) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
