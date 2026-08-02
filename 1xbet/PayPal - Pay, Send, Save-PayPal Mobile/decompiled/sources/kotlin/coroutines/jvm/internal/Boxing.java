package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"", kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG, "boxBoolean", "(Z)Ljava/lang/Boolean;", "", "boxByte", "(B)Ljava/lang/Byte;", "", "boxShort", "(S)Ljava/lang/Short;", "", "boxInt", "(I)Ljava/lang/Integer;", "", "boxLong", "(J)Ljava/lang/Long;", "", "boxFloat", "(F)Ljava/lang/Float;", "", "boxDouble", "(D)Ljava/lang/Double;", "", "boxChar", "(C)Ljava/lang/Character;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Boxing {
    public static final java.lang.Boolean boxBoolean(boolean z) {
        return java.lang.Boolean.valueOf(z);
    }

    public static final java.lang.Byte boxByte(byte b) {
        return java.lang.Byte.valueOf(b);
    }

    public static final java.lang.Short boxShort(short s) {
        return java.lang.Short.valueOf(s);
    }

    public static final java.lang.Integer boxInt(int i) {
        return java.lang.Integer.valueOf(i);
    }

    public static final java.lang.Long boxLong(long j) {
        return new java.lang.Long(j);
    }

    public static final java.lang.Float boxFloat(float f) {
        return java.lang.Float.valueOf(f);
    }

    public static final java.lang.Double boxDouble(double d) {
        return java.lang.Double.valueOf(d);
    }

    public static final java.lang.Character boxChar(char c) {
        return java.lang.Character.valueOf(c);
    }
}
