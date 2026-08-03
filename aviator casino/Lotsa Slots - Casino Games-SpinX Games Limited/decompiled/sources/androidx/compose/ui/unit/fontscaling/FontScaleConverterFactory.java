package androidx.compose.ui.unit.fontscaling;

/* compiled from: FontScaleConverterFactory.android.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\tH\u0007J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\tH\u0082\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\tH\u0007J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010#\u001a\u00020\rH\u0002J&\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010#\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "()V", "CommonFontSizes", "", "LookupTablesWriteLock", "", "[Ljava/lang/Object;", "MinScaleForNonLinear", "", "ScaleKeyMultiplier", "sLookupTables", "Landroidx/collection/SparseArrayCompat;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "getSLookupTables$annotations", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "createInterpolatedTableBetween", "start", "end", "interpolationPoint", "forScale", "fontScale", "get", "scaleKey", "getKey", "", "getScaleFromKey", com.ironsource.X3.i.W, "isNonLinearFontScalingActive", "", "put", "", "fontScaleConverter", "putInto", com.ironsource.B5.R, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    private static final float[] CommonFontSizes;
    public static final androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory INSTANCE;
    private static final java.lang.Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;
    private static volatile androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> sLookupTables;

    private final int getKey(float fontScale) {
        return (int) (fontScale * 100.0f);
    }

    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int key) {
        return key / 100.0f;
    }

    public final boolean isNonLinearFontScalingActive(float fontScale) {
        return fontScale >= 1.03f;
    }

    private FontScaleConverterFactory() {
    }

    static {
        androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory fontScaleConverterFactory = new androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        sLookupTables = new androidx.collection.SparseArrayCompat<>(0, 1, null);
        java.lang.Object[] objArr = new java.lang.Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.01f <= 1.03f) {
            throw new java.lang.IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
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
        float f;
        if (!isNonLinearFontScalingActive(fontScale)) {
            return null;
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter = INSTANCE.get(fontScale);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int indexOfKey = sLookupTables.indexOfKey(getKey(fontScale));
        if (indexOfKey >= 0) {
            return sLookupTables.valueAt(indexOfKey);
        }
        int i = -(indexOfKey + 1);
        int i2 = i - 1;
        if (i >= sLookupTables.size()) {
            androidx.compose.ui.unit.fontscaling.FontScaleConverterTable fontScaleConverterTable = new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(new float[]{1.0f}, new float[]{fontScale});
            put(fontScale, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i2 < 0) {
            float[] fArr = CommonFontSizes;
            valueAt = new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(fArr, fArr);
            f = 1.0f;
        } else {
            float scaleFromKey = getScaleFromKey(sLookupTables.keyAt(i2));
            valueAt = sLookupTables.valueAt(i2);
            f = scaleFromKey;
        }
        androidx.compose.ui.unit.fontscaling.FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(valueAt, sLookupTables.valueAt(i), androidx.compose.ui.unit.fontscaling.MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, f, getScaleFromKey(sLookupTables.keyAt(i)), fontScale));
        put(fontScale, createInterpolatedTableBetween);
        return createInterpolatedTableBetween;
    }

    private final androidx.compose.ui.unit.fontscaling.FontScaleConverter createInterpolatedTableBetween(androidx.compose.ui.unit.fontscaling.FontScaleConverter start, androidx.compose.ui.unit.fontscaling.FontScaleConverter end, float interpolationPoint) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = CommonFontSizes[i];
            fArr2[i] = androidx.compose.ui.unit.fontscaling.MathUtils.INSTANCE.lerp(start.convertSpToDp(f), end.convertSpToDp(f), interpolationPoint);
        }
        return new androidx.compose.ui.unit.fontscaling.FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final void put(float scaleKey, androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory fontScaleConverterFactory = INSTANCE;
            androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> m35clone = sLookupTables.m35clone();
            fontScaleConverterFactory.putInto(m35clone, scaleKey, fontScaleConverter);
            sLookupTables = m35clone;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void putInto(androidx.collection.SparseArrayCompat<androidx.compose.ui.unit.fontscaling.FontScaleConverter> table, float scaleKey, androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter) {
        table.put(getKey(scaleKey), fontScaleConverter);
    }

    private final androidx.compose.ui.unit.fontscaling.FontScaleConverter get(float scaleKey) {
        return sLookupTables.get(getKey(scaleKey));
    }
}
