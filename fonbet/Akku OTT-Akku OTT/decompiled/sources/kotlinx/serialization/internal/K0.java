package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

@SourceDebugExtension({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes5.dex */
public final class K0 {
    public static final Map<KClass<?>, kotlinx.serialization.b<?>> a;

    static {
        Map createMapBuilder = MapsKt.createMapBuilder();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
        createMapBuilder.put(orCreateKotlinClass, S0.a);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass2, r.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), C1157q.c);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass3, C.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), B.c);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass4, L.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), K.c);
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass5, C1138g0.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), C1136f0.c);
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(ULong.class);
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass6, e1.a);
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass7, W.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), V.c);
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(UInt.class);
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass8, b1.a);
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass9, R0.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), Q0.c);
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(UShort.class);
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass10, h1.a);
        KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass11, C1147l.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), C1145k.c);
        KClass orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(UByte.class);
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass12, Y0.a);
        KClass orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass13, C1141i.a);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), C1139h.c);
        KClass orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.INSTANCE, "<this>");
        createMapBuilder.put(orCreateKotlinClass14, i1.b);
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), C1158q0.a);
        try {
            KClass orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(Duration.class);
            Intrinsics.checkNotNullParameter(Duration.INSTANCE, "<this>");
            createMapBuilder.put(orCreateKotlinClass15, D.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), d1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), a1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), g1.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), X0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(Uuid.class);
            Intrinsics.checkNotNullParameter(Uuid.INSTANCE, "<this>");
            createMapBuilder.put(orCreateKotlinClass16, j1.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = MapsKt.build(createMapBuilder);
    }
}
