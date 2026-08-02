package com.ingo.sdk.kotlin.common.features.location;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010By\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jt\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ'\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b;\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b=\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\""}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "", "", "latitude", "longitude", "", "horizontalAccuracy", "verticalAccuracy", "altitude", "bearing", androidx.core.location.LocationCompat.EXTRA_BEARING_ACCURACY, "speed", androidx.core.location.LocationCompat.EXTRA_SPEED_ACCURACY, "", "timestamp", "<init>", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()J", "copy", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ingoCore_release", "(Lcom/ingo/sdk/kotlin/common/features/location/LocationData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getLatitude", "getLongitude", "Ljava/lang/String;", "getHorizontalAccuracy", "getVerticalAccuracy", "getAltitude", "getBearing", "getBearingAccuracy", "getSpeed", "getSpeedAccuracy", "J", "getTimestamp", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class LocationData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.location.LocationData.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.location.LocationData.Companion(null);
    private final java.lang.String altitude;
    private final java.lang.String bearing;
    private final java.lang.String bearingAccuracy;
    private final java.lang.String horizontalAccuracy;
    private final double latitude;
    private final double longitude;
    private final java.lang.String speed;
    private final java.lang.String speedAccuracy;
    private final long timestamp;
    private final java.lang.String verticalAccuracy;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/location/LocationData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.location.LocationData> serializer() {
            return com.ingo.sdk.kotlin.common.features.location.LocationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocationData(int i, double d, double d2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1023, com.ingo.sdk.kotlin.common.features.location.LocationData$$serializer.INSTANCE.getDescriptor());
        }
        this.latitude = d;
        this.longitude = d2;
        this.horizontalAccuracy = str;
        this.verticalAccuracy = str2;
        this.altitude = str3;
        this.bearing = str4;
        this.bearingAccuracy = str5;
        this.speed = str6;
        this.speedAccuracy = str7;
        this.timestamp = j;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$ingoCore_release(com.ingo.sdk.kotlin.common.features.location.LocationData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.latitude);
        output.encodeDoubleElement(serialDesc, 1, self.longitude);
        output.encodeStringElement(serialDesc, 2, self.horizontalAccuracy);
        output.encodeStringElement(serialDesc, 3, self.verticalAccuracy);
        output.encodeStringElement(serialDesc, 4, self.altitude);
        output.encodeStringElement(serialDesc, 5, self.bearing);
        output.encodeStringElement(serialDesc, 6, self.bearingAccuracy);
        output.encodeStringElement(serialDesc, 7, self.speed);
        output.encodeStringElement(serialDesc, 8, self.speedAccuracy);
        output.encodeLongElement(serialDesc, 9, self.timestamp);
    }

    public LocationData(double d, double d2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.latitude = d;
        this.longitude = d2;
        this.horizontalAccuracy = str;
        this.verticalAccuracy = str2;
        this.altitude = str3;
        this.bearing = str4;
        this.bearingAccuracy = str5;
        this.speed = str6;
        this.speedAccuracy = str7;
        this.timestamp = j;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final java.lang.String getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final java.lang.String getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public final java.lang.String getAltitude() {
        return this.altitude;
    }

    public final java.lang.String getBearing() {
        return this.bearing;
    }

    public final java.lang.String getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public final java.lang.String getSpeed() {
        return this.speed;
    }

    public final java.lang.String getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final java.lang.String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        java.lang.String str = this.horizontalAccuracy;
        java.lang.String str2 = this.verticalAccuracy;
        java.lang.String str3 = this.altitude;
        java.lang.String str4 = this.bearing;
        java.lang.String str5 = this.bearingAccuracy;
        java.lang.String str6 = this.speed;
        java.lang.String str7 = this.speedAccuracy;
        long j = this.timestamp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationData(latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", horizontalAccuracy=");
        sb.append(str);
        sb.append(", verticalAccuracy=");
        sb.append(str2);
        sb.append(", altitude=");
        sb.append(str3);
        sb.append(", bearing=");
        sb.append(str4);
        sb.append(", bearingAccuracy=");
        sb.append(str5);
        sb.append(", speed=");
        sb.append(str6);
        sb.append(", speedAccuracy=");
        sb.append(str7);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((java.lang.Double.hashCode(this.latitude) * 31) + java.lang.Double.hashCode(this.longitude)) * 31) + this.horizontalAccuracy.hashCode()) * 31) + this.verticalAccuracy.hashCode()) * 31) + this.altitude.hashCode()) * 31) + this.bearing.hashCode()) * 31) + this.bearingAccuracy.hashCode()) * 31) + this.speed.hashCode()) * 31) + this.speedAccuracy.hashCode()) * 31) + java.lang.Long.hashCode(this.timestamp);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.location.LocationData)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.location.LocationData locationData = (com.ingo.sdk.kotlin.common.features.location.LocationData) other;
        return java.lang.Double.compare(this.latitude, locationData.latitude) == 0 && java.lang.Double.compare(this.longitude, locationData.longitude) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.horizontalAccuracy, locationData.horizontalAccuracy) && kotlin.jvm.internal.Intrinsics.areEqual(this.verticalAccuracy, locationData.verticalAccuracy) && kotlin.jvm.internal.Intrinsics.areEqual(this.altitude, locationData.altitude) && kotlin.jvm.internal.Intrinsics.areEqual(this.bearing, locationData.bearing) && kotlin.jvm.internal.Intrinsics.areEqual(this.bearingAccuracy, locationData.bearingAccuracy) && kotlin.jvm.internal.Intrinsics.areEqual(this.speed, locationData.speed) && kotlin.jvm.internal.Intrinsics.areEqual(this.speedAccuracy, locationData.speedAccuracy) && this.timestamp == locationData.timestamp;
    }

    public final com.ingo.sdk.kotlin.common.features.location.LocationData copy(double latitude, double longitude, java.lang.String horizontalAccuracy, java.lang.String verticalAccuracy, java.lang.String altitude, java.lang.String bearing, java.lang.String bearingAccuracy, java.lang.String speed, java.lang.String speedAccuracy, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(horizontalAccuracy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verticalAccuracy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(altitude, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bearing, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bearingAccuracy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speedAccuracy, "");
        return new com.ingo.sdk.kotlin.common.features.location.LocationData(latitude, longitude, horizontalAccuracy, verticalAccuracy, altitude, bearing, bearingAccuracy, speed, speedAccuracy, timestamp);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSpeed() {
        return this.speed;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBearing() {
        return this.bearing;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAltitude() {
        return this.altitude;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }
}
