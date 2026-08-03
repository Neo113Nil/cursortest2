package kotlinx.serialization.encoding;

/* compiled from: Encoding.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001bH&J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001eH&J\u0018\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0013H\u0016J/\u0010&\u001a\u00020\u0007\"\n\b\u0000\u0010'*\u0004\u0018\u00010\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010\n\u001a\u0002H'H\u0016¢\u0006\u0002\u0010*J/\u0010+\u001a\u00020\u0007\"\b\b\u0000\u0010'*\u00020\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\b\u0010\n\u001a\u0004\u0018\u0001H'H\u0017¢\u0006\u0002\u0010*R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006,À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeNotNullMark", "", "encodeNull", "encodeBoolean", "value", "", "encodeByte", "", "encodeShort", "", "encodeChar", "", "encodeInt", "", "encodeLong", "", "encodeFloat", "", "encodeDouble", "", "encodeString", "", "encodeEnum", "enumDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "encodeInline", "descriptor", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginCollection", "collectionSize", "encodeSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeNullableSerializableValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Encoder {
    kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int collectionSize);

    kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor);

    void encodeBoolean(boolean value);

    void encodeByte(byte value);

    void encodeChar(char value);

    void encodeDouble(double value);

    void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index);

    void encodeFloat(float value);

    kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor);

    void encodeInt(int value);

    void encodeLong(long value);

    @kotlinx.serialization.ExperimentalSerializationApi
    void encodeNotNullMark();

    @kotlinx.serialization.ExperimentalSerializationApi
    void encodeNull();

    @kotlinx.serialization.ExperimentalSerializationApi
    <T> void encodeNullableSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value);

    <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value);

    void encodeShort(short value);

    void encodeString(java.lang.String value);

    kotlinx.serialization.modules.SerializersModule getSerializersModule();

    /* compiled from: Encoding.kt */
    /* renamed from: kotlinx.serialization.encoding.Encoder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @kotlinx.serialization.ExperimentalSerializationApi
        public static void $default$encodeNotNullMark(kotlinx.serialization.encoding.Encoder _this) {
        }

        public static kotlinx.serialization.encoding.CompositeEncoder $default$beginCollection(kotlinx.serialization.encoding.Encoder _this, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return _this.beginStructure(descriptor);
        }

        public static void $default$encodeSerializableValue(kotlinx.serialization.encoding.Encoder _this, kotlinx.serialization.SerializationStrategy serializer, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(_this, obj);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        public static void $default$encodeNullableSerializableValue(kotlinx.serialization.encoding.Encoder _this, kotlinx.serialization.SerializationStrategy serializer, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().isNullable()) {
                _this.encodeSerializableValue(serializer, obj);
            } else if (obj == null) {
                _this.encodeNull();
            } else {
                _this.encodeNotNullMark();
                _this.encodeSerializableValue(serializer, obj);
            }
        }
    }

    /* compiled from: Encoding.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static void encodeNotNullMark(kotlinx.serialization.encoding.Encoder encoder) {
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeNotNullMark(encoder);
        }

        @java.lang.Deprecated
        public static kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlinx.serialization.encoding.Encoder.CC.$default$beginCollection(encoder, descriptor, i);
        }

        @java.lang.Deprecated
        public static <T> void encodeSerializableValue(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeSerializableValue(encoder, serializer, t);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> void encodeNullableSerializableValue(kotlinx.serialization.encoding.Encoder encoder, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
            kotlinx.serialization.encoding.Encoder.CC.$default$encodeNullableSerializableValue(encoder, serializer, t);
        }
    }
}
