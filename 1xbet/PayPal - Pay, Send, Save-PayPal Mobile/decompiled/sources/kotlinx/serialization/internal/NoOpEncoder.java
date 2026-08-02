package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lkotlinx/serialization/internal/NoOpEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoOpEncoder extends kotlinx.serialization.encoding.AbstractEncoder {
    public static final kotlinx.serialization.internal.NoOpEncoder INSTANCE = new kotlinx.serialization.internal.NoOpEncoder();
    private static final kotlinx.serialization.modules.SerializersModule serializersModule = kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule();

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long value) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short value) {
    }

    private NoOpEncoder() {
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final void encodeValue(java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeString(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
    }
}
