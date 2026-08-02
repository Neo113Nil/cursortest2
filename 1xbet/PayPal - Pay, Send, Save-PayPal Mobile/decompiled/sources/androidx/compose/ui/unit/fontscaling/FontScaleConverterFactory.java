package androidx.compose.ui.unit.fontscaling;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0004H\u0082\u0002¢\u0006\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "<init>", "()V", "", "fontScale", "", "isNonLinearFontScalingActive", "(F)Z", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "forScale", "(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "getHighSpeedVideoFpsRanges", "(F)I", "(I)F", "", "getHighResolutionOutputSizeshNQ4ISI", "(FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "Landroidx/collection/SparseArrayCompat;", "(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "getHighSpeedVideoSizes", "", "[F", "getHighSpeedVideoFpsRangesFor", "sLookupTables", "Landroidx/collection/SparseArrayCompat;", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "getSLookupTables$annotations", "", "[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.lang.Object[] getHighSpeedVideoSizes;
    public static final androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory INSTANCE = new androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final float[] getHighSpeedVideoFpsRangesFor = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> sLookupTables = new androidx.collection.SparseArrayCompat<>(0, 1, null);

    private static float Camera2StreamConfigurationMap(int p0) {
        return p0 / 100.0f;
    }

    private static int getHighSpeedVideoFpsRanges(float p0) {
        return (int) (p0 * 100.0f);
    }

    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    public final boolean isNonLinearFontScalingActive(float fontScale) {
        return fontScale >= 1.03f;
    }

    private FontScaleConverterFactory() {
    }

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        getHighSpeedVideoSizes = objArr;
        synchronized (objArr) {
            getHighResolutionOutputSizeshNQ4ISI(sLookupTables, 1.15f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            getHighResolutionOutputSizeshNQ4ISI(sLookupTables, 1.3f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            getHighResolutionOutputSizeshNQ4ISI(sLookupTables, 1.5f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            getHighResolutionOutputSizeshNQ4ISI(sLookupTables, 1.8f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            getHighResolutionOutputSizeshNQ4ISI(sLookupTables, 2.0f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (Camera2StreamConfigurationMap(sLookupTables.keyAt(0)) - 0.01f <= 1.03f) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    public final androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    public final void setSLookupTables(androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }

    public final androidx.compose.ui.unit.fontscaling.FontScaleConverter forScale(float fontScale) {
        androidx.compose.ui.unit.fontscaling.FontScaleConverter valueAt;
        if (!isNonLinearFontScalingActive(fontScale)) {
            return null;
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter highSpeedVideoSizes = getHighSpeedVideoSizes(fontScale);
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        int indexOfKey = sLookupTables.indexOfKey(getHighSpeedVideoFpsRanges(fontScale));
        if (indexOfKey >= 0) {
            return sLookupTables.valueAt(indexOfKey);
        }
        int i = -(indexOfKey + 1);
        int i2 = i - 1;
        float f = 1.0f;
        if (i >= sLookupTables.size()) {
            androidx.compose.ui.unit.fontscaling.FontScaleConverterTable fontScaleConverterTable = new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{1.0f}, new float[]{fontScale});
            getHighResolutionOutputSizeshNQ4ISI(fontScale, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i2 < 0) {
            float[] fArr = getHighSpeedVideoFpsRangesFor;
            valueAt = new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(fArr, fArr);
        } else {
            f = Camera2StreamConfigurationMap(sLookupTables.keyAt(i2));
            valueAt = sLookupTables.valueAt(i2);
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(valueAt, sLookupTables.valueAt(i), androidx.compose.ui.unit.fontscaling.MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, f, Camera2StreamConfigurationMap(sLookupTables.keyAt(i)), fontScale));
        getHighResolutionOutputSizeshNQ4ISI(fontScale, Camera2StreamConfigurationMap);
        return Camera2StreamConfigurationMap;
    }

    private static androidx.compose.ui.unit.fontscaling.FontScaleConverter Camera2StreamConfigurationMap(androidx.compose.ui.unit.fontscaling.FontScaleConverter p0, androidx.compose.ui.unit.fontscaling.FontScaleConverter p1, float p2) {
        float[] fArr = getHighSpeedVideoFpsRangesFor;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = getHighSpeedVideoFpsRangesFor[i];
            fArr2[i] = androidx.compose.ui.unit.fontscaling.MathUtils.INSTANCE.lerp(p0.convertSpToDp(f), p1.convertSpToDp(f), p2);
        }
        return new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(getHighSpeedVideoFpsRangesFor, fArr2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(float p0, androidx.compose.ui.unit.fontscaling.FontScaleConverter p1) {
        synchronized (getHighSpeedVideoSizes) {
            androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> m1092clone = sLookupTables.m1092clone();
            getHighResolutionOutputSizeshNQ4ISI(m1092clone, p0, p1);
            sLookupTables = m1092clone;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> p0, float p1, androidx.compose.ui.unit.fontscaling.FontScaleConverter p2) {
        p0.put(getHighSpeedVideoFpsRanges(p1), p2);
    }

    private static androidx.compose.ui.unit.fontscaling.FontScaleConverter getHighSpeedVideoSizes(float p0) {
        return sLookupTables.get(getHighSpeedVideoFpsRanges(p0));
    }
}
