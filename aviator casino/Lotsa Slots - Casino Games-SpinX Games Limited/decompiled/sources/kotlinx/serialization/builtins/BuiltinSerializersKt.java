package kotlinx.serialization.builtins;

/* compiled from: BuiltinSerializers.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\u001a@\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\t0\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\u001a@\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\u000f0\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\u001aZ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u00110\u0001\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u001a\u001a\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0001*\u00020\u001e\u001a\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0001\u001a\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0001H\u0007\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020#0\u0001*\u00020$\u001a\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0001\u001a\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0001H\u0007\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020*\u001a\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0001\u001a\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0001H\u0007\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u000200\u001a\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0001\u001a\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0001H\u0007\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000206\u001a\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0001\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002090\u0001*\u00020:\u001a\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0001\u001a\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020=0\u0001*\u00020>¢\u0006\u0002\u0010?\u001a\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0001\u001a\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020B0\u0001*\u00020B¢\u0006\u0002\u0010C\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020D0\u0001*\u00020E\u001a=\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HH0G0\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\f\b\u0001\u0010H\u0018\u0001*\u0004\u0018\u0001H\u00022\f\u0010I\u001a\b\u0012\u0004\u0012\u0002HH0\u0001H\u0087\b\u001aF\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HH0G0\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010H*\u0004\u0018\u0001H\u00022\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020K2\f\u0010I\u001a\b\u0012\u0004\u0012\u0002HH0\u0001H\u0007\u001a&\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020M0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020O0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a@\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0Q0\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020S\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020T0\u0001*\u00020U\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020V0\u0001*\u00020W\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020X0\u0001*\u00020Y\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020[\u001a\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\\0\u0001*\u00020]H\u0007\u001a\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u0001H\u0007\"3\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006`"}, d2 = {"nullable", "Lkotlinx/serialization/KSerializer;", "T", "", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "getNullable", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "PairSerializer", "Lkotlin/Pair;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "keySerializer", "valueSerializer", "MapEntrySerializer", "", "TripleSerializer", "Lkotlin/Triple;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "aSerializer", "bSerializer", "cSerializer", "serializer", "", "Lkotlin/Char$Companion;", "CharArraySerializer", "", "", "Lkotlin/Byte$Companion;", "ByteArraySerializer", "", "UByteArraySerializer", "Lkotlin/UByteArray;", "", "Lkotlin/Short$Companion;", "ShortArraySerializer", "", "UShortArraySerializer", "Lkotlin/UShortArray;", "", "Lkotlin/Int$Companion;", "IntArraySerializer", "", "UIntArraySerializer", "Lkotlin/UIntArray;", "", "Lkotlin/Long$Companion;", "LongArraySerializer", "", "ULongArraySerializer", "Lkotlin/ULongArray;", "", "Lkotlin/Float$Companion;", "FloatArraySerializer", "", "", "Lkotlin/Double$Companion;", "DoubleArraySerializer", "", "", "Lkotlin/Boolean$Companion;", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "BooleanArraySerializer", "", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/String$Companion;", "ArraySerializer", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "elementSerializer", "kClass", "Lkotlin/reflect/KClass;", "ListSerializer", "", "SetSerializer", "", "MapSerializer", "", "Lkotlin/UInt;", "Lkotlin/UInt$Companion;", "Lkotlin/ULong;", "Lkotlin/ULong$Companion;", "Lkotlin/UByte;", "Lkotlin/UByte$Companion;", "Lkotlin/UShort;", "Lkotlin/UShort$Companion;", "Lkotlin/time/Duration;", "Lkotlin/time/Duration$Companion;", "Lkotlin/uuid/Uuid;", "Lkotlin/uuid/Uuid$Companion;", "NothingSerializer", "", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuiltinSerializersKt {
    public static /* synthetic */ void getNullable$annotations(kotlinx.serialization.KSerializer kSerializer) {
    }

    public static final <T> kotlinx.serialization.KSerializer<T> getNullable(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new kotlinx.serialization.internal.NullableSerializer(kSerializer);
    }

    public static final <K, V> kotlinx.serialization.KSerializer<kotlin.Pair<K, V>> PairSerializer(kotlinx.serialization.KSerializer<K> keySerializer, kotlinx.serialization.KSerializer<V> valueSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new kotlinx.serialization.internal.PairSerializer(keySerializer, valueSerializer);
    }

    public static final <K, V> kotlinx.serialization.KSerializer<java.util.Map.Entry<K, V>> MapEntrySerializer(kotlinx.serialization.KSerializer<K> keySerializer, kotlinx.serialization.KSerializer<V> valueSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new kotlinx.serialization.internal.MapEntrySerializer(keySerializer, valueSerializer);
    }

    public static final <A, B, C> kotlinx.serialization.KSerializer<kotlin.Triple<A, B, C>> TripleSerializer(kotlinx.serialization.KSerializer<A> aSerializer, kotlinx.serialization.KSerializer<B> bSerializer, kotlinx.serialization.KSerializer<C> cSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new kotlinx.serialization.internal.TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Character> serializer(kotlin.jvm.internal.CharCompanionObject charCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return kotlinx.serialization.internal.CharSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<char[]> CharArraySerializer() {
        return kotlinx.serialization.internal.CharArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Byte> serializer(kotlin.jvm.internal.ByteCompanionObject byteCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return kotlinx.serialization.internal.ByteSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<byte[]> ByteArraySerializer() {
        return kotlinx.serialization.internal.ByteArraySerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<kotlin.UByteArray> UByteArraySerializer() {
        return kotlinx.serialization.internal.UByteArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Short> serializer(kotlin.jvm.internal.ShortCompanionObject shortCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return kotlinx.serialization.internal.ShortSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<short[]> ShortArraySerializer() {
        return kotlinx.serialization.internal.ShortArraySerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<kotlin.UShortArray> UShortArraySerializer() {
        return kotlinx.serialization.internal.UShortArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Integer> serializer(kotlin.jvm.internal.IntCompanionObject intCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return kotlinx.serialization.internal.IntSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<int[]> IntArraySerializer() {
        return kotlinx.serialization.internal.IntArraySerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<kotlin.UIntArray> UIntArraySerializer() {
        return kotlinx.serialization.internal.UIntArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Long> serializer(kotlin.jvm.internal.LongCompanionObject longCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return kotlinx.serialization.internal.LongSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<long[]> LongArraySerializer() {
        return kotlinx.serialization.internal.LongArraySerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<kotlin.ULongArray> ULongArraySerializer() {
        return kotlinx.serialization.internal.ULongArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Float> serializer(kotlin.jvm.internal.FloatCompanionObject floatCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return kotlinx.serialization.internal.FloatSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<float[]> FloatArraySerializer() {
        return kotlinx.serialization.internal.FloatArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Double> serializer(kotlin.jvm.internal.DoubleCompanionObject doubleCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return kotlinx.serialization.internal.DoubleSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<double[]> DoubleArraySerializer() {
        return kotlinx.serialization.internal.DoubleArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Boolean> serializer(kotlin.jvm.internal.BooleanCompanionObject booleanCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return kotlinx.serialization.internal.BooleanSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<boolean[]> BooleanArraySerializer() {
        return kotlinx.serialization.internal.BooleanArraySerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.Unit> serializer(kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "<this>");
        return kotlinx.serialization.internal.UnitSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.String> serializer(kotlin.jvm.internal.StringCompanionObject stringCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return kotlinx.serialization.internal.StringSerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> kotlinx.serialization.KSerializer<E[]> ArraySerializer(kotlinx.serialization.KSerializer<E> elementSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return ArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), elementSerializer);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final <T, E extends T> kotlinx.serialization.KSerializer<E[]> ArraySerializer(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<E> elementSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new kotlinx.serialization.internal.ReferenceArraySerializer(kClass, elementSerializer);
    }

    public static final <T> kotlinx.serialization.KSerializer<java.util.List<T>> ListSerializer(kotlinx.serialization.KSerializer<T> elementSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new kotlinx.serialization.internal.ArrayListSerializer(elementSerializer);
    }

    public static final <T> kotlinx.serialization.KSerializer<java.util.Set<T>> SetSerializer(kotlinx.serialization.KSerializer<T> elementSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new kotlinx.serialization.internal.LinkedHashSetSerializer(elementSerializer);
    }

    public static final <K, V> kotlinx.serialization.KSerializer<java.util.Map<K, V>> MapSerializer(kotlinx.serialization.KSerializer<K> keySerializer, kotlinx.serialization.KSerializer<V> valueSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    public static final kotlinx.serialization.KSerializer<kotlin.UInt> serializer(kotlin.UInt.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.UIntSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.ULong> serializer(kotlin.ULong.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.ULongSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.UByte> serializer(kotlin.UByte.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.UByteSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.UShort> serializer(kotlin.UShort.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.UShortSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.time.Duration> serializer(kotlin.time.Duration.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.DurationSerializer.INSTANCE;
    }

    public static final kotlinx.serialization.KSerializer<kotlin.uuid.Uuid> serializer(kotlin.uuid.Uuid.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return kotlinx.serialization.internal.UuidSerializer.INSTANCE;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer NothingSerializer() {
        return kotlinx.serialization.internal.NothingSerializer.INSTANCE;
    }
}
