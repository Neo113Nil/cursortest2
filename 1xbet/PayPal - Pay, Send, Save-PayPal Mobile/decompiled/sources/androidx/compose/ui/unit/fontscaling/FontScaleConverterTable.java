package androidx.compose.ui.unit.fontscaling;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "dp", "convertDpToSp", "(F)F", "sp", "convertSpToDp", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "mFromSpValues", "[F", "getMFromSpValues", "()[F", "getMFromSpValues$annotations", "()V", "mToDpValues", "getMToDpValues", "getMToDpValues$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontScaleConverterTable implements androidx.compose.ui.unit.fontscaling.FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.fontscaling.FontScaleConverterTable.Companion INSTANCE = new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable.Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertDpToSp(float dp) {
        return androidx.compose.ui.unit.fontscaling.FontScaleConverterTable.Companion.access$lookupAndInterpolate(INSTANCE, dp, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertSpToDp(float sp) {
        return androidx.compose.ui.unit.fontscaling.FontScaleConverterTable.Companion.access$lookupAndInterpolate(INSTANCE, sp, this.mFromSpValues, this.mToDpValues);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.ui.unit.fontscaling.FontScaleConverterTable)) {
            return false;
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverterTable fontScaleConverterTable = (androidx.compose.ui.unit.fontscaling.FontScaleConverterTable) other;
        return java.util.Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && java.util.Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.mFromSpValues) * 31) + java.util.Arrays.hashCode(this.mToDpValues);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontScaleConverter{fromSpValues=");
        java.lang.String arrays = java.util.Arrays.toString(this.mFromSpValues);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        sb.append(arrays);
        sb.append(", toDpValues=");
        java.lang.String arrays2 = java.util.Arrays.toString(this.mToDpValues);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays2, "");
        sb.append(arrays2);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(F[F[F)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ float access$lookupAndInterpolate(androidx.compose.ui.unit.fontscaling.FontScaleConverterTable.Companion companion, float f, float[] fArr, float[] fArr2) {
            return getHighSpeedVideoFpsRangesFor(f, fArr, fArr2);
        }

        private static float getHighSpeedVideoFpsRangesFor(float p0, float[] p1, float[] p2) {
            float f;
            float f2;
            float f3;
            float constrainedMap;
            float abs = java.lang.Math.abs(p0);
            float signum = java.lang.Math.signum(p0);
            int binarySearch = java.util.Arrays.binarySearch(p1, abs);
            if (binarySearch >= 0) {
                constrainedMap = p2[binarySearch];
            } else {
                int i = -(binarySearch + 1);
                int i2 = i - 1;
                float f4 = 0.0f;
                if (i2 >= p1.length - 1) {
                    float f5 = p1[p1.length - 1];
                    float f6 = p2[p1.length - 1];
                    if (f5 == 0.0f) {
                        return 0.0f;
                    }
                    return p0 * (f6 / f5);
                }
                if (i2 == -1) {
                    float f7 = p1[0];
                    f3 = p2[0];
                    f2 = f7;
                    f = 0.0f;
                } else {
                    float f8 = p1[i2];
                    float f9 = p1[i];
                    f = p2[i2];
                    f4 = f8;
                    f2 = f9;
                    f3 = p2[i];
                }
                constrainedMap = androidx.compose.ui.unit.fontscaling.MathUtils.INSTANCE.constrainedMap(f, f3, f4, f2, abs);
            }
            return signum * constrainedMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
