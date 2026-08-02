package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/datetime/FixedOffsetTimeZone;", "Lkotlinx/datetime/TimeZone;", "Lkotlinx/datetime/UtcOffset;", "offset", "Ljava/time/ZoneId;", "zoneId", "<init>", "(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V", "(Lkotlinx/datetime/UtcOffset;)V", "Lkotlinx/datetime/UtcOffset;", "getOffset", "()Lkotlinx/datetime/UtcOffset;", "", "getTotalSeconds", "()I", "getTotalSeconds$annotations", "()V", "totalSeconds", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.FixedOffsetTimeZoneSerializer.class)
/* loaded from: classes3.dex */
public final class FixedOffsetTimeZone extends kotlinx.datetime.TimeZone {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.FixedOffsetTimeZone.Companion INSTANCE = new kotlinx.datetime.FixedOffsetTimeZone.Companion(null);
    private final kotlinx.datetime.UtcOffset offset;

    @kotlin.Deprecated(message = "Use offset.totalSeconds", replaceWith = @kotlin.ReplaceWith(expression = "offset.totalSeconds", imports = {}))
    public static /* synthetic */ void getTotalSeconds$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/FixedOffsetTimeZone$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/FixedOffsetTimeZone;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<kotlinx.datetime.FixedOffsetTimeZone> serializer() {
            return kotlinx.datetime.serializers.FixedOffsetTimeZoneSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedOffsetTimeZone(kotlinx.datetime.UtcOffset utcOffset, java.time.ZoneId zoneId) {
        super(zoneId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
        this.offset = utcOffset;
    }

    public final kotlinx.datetime.UtcOffset getOffset() {
        return this.offset;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedOffsetTimeZone(kotlinx.datetime.UtcOffset utcOffset) {
        this(utcOffset, utcOffset.getZoneOffset());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(utcOffset, "");
    }

    public final int getTotalSeconds() {
        return this.offset.getTotalSeconds();
    }
}
