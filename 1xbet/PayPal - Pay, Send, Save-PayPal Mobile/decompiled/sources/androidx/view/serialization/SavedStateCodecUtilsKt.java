package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0016\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "intListDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getIntListDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateCodecUtilsKt {
    private static final kotlinx.serialization.descriptors.SerialDescriptor intListDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.IntCompanionObject.INSTANCE)).getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor stringListDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE)).getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor booleanArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.BooleanArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor charArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.CharArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor doubleArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.DoubleArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor floatArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.FloatArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor intArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.IntArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor longArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.LongArraySerializer().getDescriptor();
    private static final kotlinx.serialization.descriptors.SerialDescriptor stringArrayDescriptor = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE)).getDescriptor();

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getStringListDescriptor() {
        return stringListDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }
}
