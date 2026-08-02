package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"Lkotlinx/datetime/TimeZone;", "", "Ljava/time/ZoneId;", "zoneId", "<init>", "(Ljava/time/ZoneId;)V", "Lkotlin/time/Instant;", "Lkotlinx/datetime/LocalDateTime;", "toLocalDateTime", "(Lkotlin/time/Instant;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/OverloadMarker;", "youShallNotPass", "toInstant", "(Lkotlinx/datetime/LocalDateTime;Lkotlinx/datetime/OverloadMarker;)Lkotlin/time/Instant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZoneId;", "getZoneId$kotlinx_datetime", "()Ljava/time/ZoneId;", "getId", "id", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.TimeZoneSerializer.class)
/* loaded from: classes3.dex */
public class TimeZone {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.TimeZone.Companion INSTANCE = new kotlinx.datetime.TimeZone.Companion(null);
    private static final kotlinx.datetime.FixedOffsetTimeZone UTC;
    private final java.time.ZoneId zoneId;

    public TimeZone(java.time.ZoneId zoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
        this.zoneId = zoneId;
    }

    /* renamed from: getZoneId$kotlinx_datetime, reason: from getter */
    public final java.time.ZoneId getZoneId() {
        return this.zoneId;
    }

    public final java.lang.String getId() {
        java.lang.String id = this.zoneId.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        return id;
    }

    public final kotlinx.datetime.LocalDateTime toLocalDateTime(kotlin.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        return kotlinx.datetime.TimeZoneKt.toLocalDateTime(instant, this);
    }

    public final kotlin.time.Instant toInstant(kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.OverloadMarker overloadMarker) {
        kotlin.time.Instant instant$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overloadMarker, "");
        instant$default = kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.toInstant$default(localDateTime, this, (kotlinx.datetime.OverloadMarker) null, 2, (java.lang.Object) null);
        return instant$default;
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof kotlinx.datetime.TimeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.zoneId, ((kotlinx.datetime.TimeZone) other).zoneId);
        }
        return true;
    }

    public int hashCode() {
        return this.zoneId.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String zoneId = this.zoneId.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneId, "");
        return zoneId;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/TimeZone$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/TimeZone;", "currentSystemDefault", "()Lkotlinx/datetime/TimeZone;", "", "zoneId", "of", "(Ljava/lang/String;)Lkotlinx/datetime/TimeZone;", "Ljava/time/ZoneId;", "ofZone$kotlinx_datetime", "(Ljava/time/ZoneId;)Lkotlinx/datetime/TimeZone;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/FixedOffsetTimeZone;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC, "Lkotlinx/datetime/FixedOffsetTimeZone;", "getUTC", "()Lkotlinx/datetime/FixedOffsetTimeZone;", "", "getAvailableZoneIds", "()Ljava/util/Set;", "availableZoneIds"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.TimeZone> serializer() {
            return kotlinx.datetime.serializers.TimeZoneSerializer.INSTANCE;
        }

        public final kotlinx.datetime.TimeZone currentSystemDefault() {
            java.time.ZoneId systemDefault = java.time.ZoneId.systemDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemDefault, "");
            return ofZone$kotlinx_datetime(systemDefault);
        }

        public final kotlinx.datetime.FixedOffsetTimeZone getUTC() {
            return kotlinx.datetime.TimeZone.UTC;
        }

        public final kotlinx.datetime.TimeZone of(java.lang.String zoneId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(zoneId, "z")) {
                    zoneId = "Z";
                }
                java.time.ZoneId of = java.time.ZoneId.of(zoneId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "");
                return ofZone$kotlinx_datetime(of);
            } catch (java.lang.Exception e) {
                if (e instanceof java.time.DateTimeException) {
                    throw new kotlinx.datetime.IllegalTimeZoneException(e);
                }
                throw e;
            }
        }

        public final kotlinx.datetime.TimeZone ofZone$kotlinx_datetime(java.time.ZoneId zoneId) {
            boolean highSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
            if (!(zoneId instanceof java.time.ZoneOffset)) {
                highSpeedVideoFpsRangesFor = kotlinx.datetime.TimeZoneKt__TimeZoneJvmKt.getHighSpeedVideoFpsRangesFor(zoneId);
                if (highSpeedVideoFpsRangesFor) {
                    java.time.ZoneId normalized = zoneId.normalized();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(normalized, "");
                    return new kotlinx.datetime.FixedOffsetTimeZone(new kotlinx.datetime.UtcOffset((java.time.ZoneOffset) normalized), zoneId);
                }
                return new kotlinx.datetime.TimeZone(zoneId);
            }
            return new kotlinx.datetime.FixedOffsetTimeZone(new kotlinx.datetime.UtcOffset((java.time.ZoneOffset) zoneId));
        }

        public final java.util.Set<java.lang.String> getAvailableZoneIds() {
            java.util.Set<java.lang.String> availableZoneIds = java.time.ZoneId.getAvailableZoneIds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableZoneIds, "");
            return availableZoneIds;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlinx.datetime.UtcOffset zero = kotlinx.datetime.UtcOffset.INSTANCE.getZERO();
        java.time.ZoneId of = java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "");
        UTC = new kotlinx.datetime.FixedOffsetTimeZone(zero, of);
    }

    public static /* synthetic */ kotlin.time.Instant toInstant$default(kotlinx.datetime.TimeZone timeZone, kotlinx.datetime.LocalDateTime localDateTime, kotlinx.datetime.OverloadMarker overloadMarker, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toInstant");
        }
        if ((i & 1) != 0) {
            overloadMarker = kotlinx.datetime.OverloadMarker.INSTANCE.getINSTANCE$kotlinx_datetime();
        }
        return timeZone.toInstant(localDateTime, overloadMarker);
    }
}
