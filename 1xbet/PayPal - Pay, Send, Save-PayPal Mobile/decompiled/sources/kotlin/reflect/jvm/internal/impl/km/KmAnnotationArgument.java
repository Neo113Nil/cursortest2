package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public abstract class KmAnnotationArgument {
    public abstract java.lang.String toString();

    private KmAnnotationArgument() {
    }

    public static abstract class LiteralValue<T> extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        public abstract T getValue();

        private LiteralValue() {
            super(null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            T value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('(');
            if (this instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) {
                value = (T) new java.lang.StringBuilder("\"");
                value.append((java.lang.Object) ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) this).getValue());
                value.append('\"');
            } else {
                value = getValue();
            }
            sb.append(value.toString());
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ LiteralValue(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class ByteValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Byte> {
        private final byte getHighResolutionOutputSizeshNQ4ISI;

        public ByteValue(byte b) {
            super(null);
            this.getHighResolutionOutputSizeshNQ4ISI = b;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Byte getValue() {
            return java.lang.Byte.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return java.lang.Byte.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ByteValue) && this.getHighResolutionOutputSizeshNQ4ISI == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ByteValue) obj).getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public static final class CharValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Character> {
        private final char getHighSpeedVideoFpsRanges;

        public CharValue(char c) {
            super(null);
            this.getHighSpeedVideoFpsRanges = c;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Character getValue() {
            return java.lang.Character.valueOf(this.getHighSpeedVideoFpsRanges);
        }

        public final int hashCode() {
            return java.lang.Character.hashCode(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.CharValue) && this.getHighSpeedVideoFpsRanges == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.CharValue) obj).getHighSpeedVideoFpsRanges;
        }
    }

    public static final class ShortValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Short> {
        private final short getHighSpeedVideoSizes;

        public ShortValue(short s) {
            super(null);
            this.getHighSpeedVideoSizes = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Short getValue() {
            return java.lang.Short.valueOf(this.getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return java.lang.Short.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ShortValue) && this.getHighSpeedVideoSizes == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ShortValue) obj).getHighSpeedVideoSizes;
        }
    }

    public static final class IntValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Integer> {
        private final int getHighSpeedVideoFpsRangesFor;

        public IntValue(int i) {
            super(null);
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Integer getValue() {
            return java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor);
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.IntValue) && this.getHighSpeedVideoFpsRangesFor == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.IntValue) obj).getHighSpeedVideoFpsRangesFor;
        }
    }

    public static final class LongValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Long> {
        private final long getHighResolutionOutputSizeshNQ4ISI;

        public LongValue(long j) {
            super(null);
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Long getValue() {
            return java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LongValue) && this.getHighResolutionOutputSizeshNQ4ISI == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LongValue) obj).getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public static final class FloatValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Float> {
        private final float getHighSpeedVideoSizes;

        public FloatValue(float f) {
            super(null);
            this.getHighSpeedVideoSizes = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Float getValue() {
            return java.lang.Float.valueOf(this.getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.FloatValue) && java.lang.Float.compare(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.FloatValue) obj).getHighSpeedVideoSizes) == 0;
        }
    }

    public static final class DoubleValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Double> {
        private final double getHighSpeedVideoSizes;

        public DoubleValue(double d) {
            super(null);
            this.getHighSpeedVideoSizes = d;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Double getValue() {
            return java.lang.Double.valueOf(this.getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return java.lang.Double.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.DoubleValue) && java.lang.Double.compare(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.DoubleValue) obj).getHighSpeedVideoSizes) == 0;
        }
    }

    public static final class BooleanValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.Boolean> {
        private final boolean Camera2StreamConfigurationMap;

        public BooleanValue(boolean z) {
            super(null);
            this.Camera2StreamConfigurationMap = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.Boolean getValue() {
            return java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap);
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.BooleanValue) && this.Camera2StreamConfigurationMap == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.BooleanValue) obj).Camera2StreamConfigurationMap;
        }
    }

    public static final class UByteValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<kotlin.UByte> {
        private final byte getHighSpeedVideoFpsRanges;

        private UByteValue(byte b) {
            super(null);
            this.getHighSpeedVideoFpsRanges = b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final /* synthetic */ kotlin.UByte getValue() {
            return kotlin.UByte.m23445boximpl(m23892getValuew2LRezQ());
        }

        /* renamed from: getValue-w2LRezQ, reason: not valid java name */
        public final byte m23892getValuew2LRezQ() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int hashCode() {
            return kotlin.UByte.m23449hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UByteValue) && this.getHighSpeedVideoFpsRanges == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UByteValue) obj).getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ UByteValue(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }
    }

    public static final class UShortValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<kotlin.UShort> {
        private final short getHighSpeedVideoFpsRanges;

        private UShortValue(short s) {
            super(null);
            this.getHighSpeedVideoFpsRanges = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final /* synthetic */ kotlin.UShort getValue() {
            return kotlin.UShort.m23517boximpl(m23895getValueMh2AYeg());
        }

        /* renamed from: getValue-Mh2AYeg, reason: not valid java name */
        public final short m23895getValueMh2AYeg() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int hashCode() {
            return kotlin.UShort.m23521hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UShortValue) && this.getHighSpeedVideoFpsRanges == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UShortValue) obj).getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ UShortValue(short s, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(s);
        }
    }

    public static final class UIntValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<kotlin.UInt> {
        private final int getHighSpeedVideoFpsRanges;

        private UIntValue(int i) {
            super(null);
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final /* synthetic */ kotlin.UInt getValue() {
            return kotlin.UInt.m23469boximpl(m23893getValuepVg5ArA());
        }

        /* renamed from: getValue-pVg5ArA, reason: not valid java name */
        public final int m23893getValuepVg5ArA() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int hashCode() {
            return kotlin.UInt.m23473hashCodeimpl(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UIntValue) && this.getHighSpeedVideoFpsRanges == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UIntValue) obj).getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ UIntValue(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }
    }

    public static final class ULongValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<kotlin.ULong> {
        private final long getHighSpeedVideoFpsRangesFor;

        private ULongValue(long j) {
            super(null);
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final /* synthetic */ kotlin.ULong getValue() {
            return kotlin.ULong.m23493boximpl(m23894getValuesVKNKU());
        }

        /* renamed from: getValue-s-VKNKU, reason: not valid java name */
        public final long m23894getValuesVKNKU() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int hashCode() {
            return kotlin.ULong.m23497hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ULongValue) && this.getHighSpeedVideoFpsRangesFor == ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ULongValue) obj).getHighSpeedVideoFpsRangesFor;
        }

        public /* synthetic */ ULongValue(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public static final class StringValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue<java.lang.String> {
        private final java.lang.String getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRanges = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public final java.lang.String getValue() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) obj).getHighSpeedVideoFpsRanges);
        }
    }

    public static final class EnumValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = str2;
        }

        public final java.lang.String getEnumClassName() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String getEnumEntryName() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnumValue(");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue enumValue = (kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, enumValue.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, enumValue.getHighSpeedVideoFpsRanges);
        }
    }

    public static final class AnnotationValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        private final kotlin.reflect.jvm.internal.impl.km.KmAnnotation Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(kotlin.reflect.jvm.internal.impl.km.KmAnnotation kmAnnotation) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmAnnotation, "");
            this.Camera2StreamConfigurationMap = kmAnnotation;
        }

        public final kotlin.reflect.jvm.internal.impl.km.KmAnnotation getAnnotation() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AnnotationValue(");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.AnnotationValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.AnnotationValue) obj).Camera2StreamConfigurationMap);
        }
    }

    public static final class ArrayValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArrayValue(java.util.List<? extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoSizes = list;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> getElements() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArrayValue(");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayValue) obj).getHighSpeedVideoSizes);
        }
    }

    public static final class KClassValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        private final java.lang.String Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.Camera2StreamConfigurationMap = str;
        }

        public final java.lang.String getClassName() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KClassValue(");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.KClassValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.KClassValue) obj).Camera2StreamConfigurationMap);
        }
    }

    public static final class ArrayKClassValue extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(java.lang.String str, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = i;
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.".toString());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.Camera2StreamConfigurationMap);
            int i3 = this.getHighSpeedVideoFpsRanges;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.getHighSpeedVideoFpsRangesFor = sb.toString();
        }

        public final int getArrayDimensionCount() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String getClassName() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int hashCode() {
            return (this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue arrayKClassValue = (kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, arrayKClassValue.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges == arrayKClassValue.getHighSpeedVideoFpsRanges;
        }
    }

    public /* synthetic */ KmAnnotationArgument(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
