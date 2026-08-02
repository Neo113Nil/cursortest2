package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0000\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0000\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0000\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0000*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", Constants.MessagePayloadKeys.FROM, "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m415ActualImageShaderF49vj9s(ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m420toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m420toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m416ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> colors, List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m276getXimpl(j), Offset.m277getYimpl(j), Offset.m276getXimpl(j2), Offset.m277getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m420toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m417ActualRadialGradientShader8uybcMk(long j, float f, List<Color> colors, List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m276getXimpl(j), Offset.m277getYimpl(j), f, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m420toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m418ActualSweepGradientShader9KIMszo(long j, List<Color> colors, List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m276getXimpl(j), Offset.m277getYimpl(j), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        while (i2 < lastIndex) {
            int i3 = i2 + 1;
            if (Color.m509getAlphaimpl(colors.get(i2).m517unboximpl()) == 0.0f) {
                i++;
            }
            i2 = i3;
        }
        return i;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> colors, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m562toArgb8_81llA(colors.get(i3).m517unboximpl());
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i4 = 0;
        while (i3 < size2) {
            int i5 = i3 + 1;
            long m517unboximpl = colors.get(i3).m517unboximpl();
            if (Color.m509getAlphaimpl(m517unboximpl) != 0.0f) {
                i2 = i4 + 1;
                iArr2[i4] = ColorKt.m562toArgb8_81llA(m517unboximpl);
            } else if (i3 == 0) {
                i2 = i4 + 1;
                iArr2[i4] = ColorKt.m562toArgb8_81llA(Color.m506copywmQWz5c$default(colors.get(1).m517unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
            } else {
                if (i3 == lastIndex) {
                    iArr2[i4] = ColorKt.m562toArgb8_81llA(Color.m506copywmQWz5c$default(colors.get(i3 - 1).m517unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4++;
                } else {
                    long m517unboximpl2 = colors.get(i3 - 1).m517unboximpl();
                    int i6 = i4 + 1;
                    iArr2[i4] = ColorKt.m562toArgb8_81llA(Color.m506copywmQWz5c$default(m517unboximpl2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 += 2;
                    iArr2[i6] = ColorKt.m562toArgb8_81llA(Color.m506copywmQWz5c$default(colors.get(i5).m517unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i3 = i5;
            }
            i4 = i2;
            i3 = i5;
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> colors, int i) {
        Float f;
        Float f2;
        float[] floatArray;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list == null) {
                return null;
            }
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(list);
            return floatArray;
        }
        float[] fArr = new float[colors.size() + i];
        fArr[0] = (list == null || (f = list.get(0)) == null) ? 0.0f : f.floatValue();
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        int i3 = 1;
        while (i2 < lastIndex) {
            int i4 = i2 + 1;
            long m517unboximpl = colors.get(i2).m517unboximpl();
            Float f3 = list == null ? null : list.get(i2);
            float lastIndex2 = f3 == null ? i2 / CollectionsKt.getLastIndex(colors) : f3.floatValue();
            int i5 = i3 + 1;
            fArr[i3] = lastIndex2;
            if (Color.m509getAlphaimpl(m517unboximpl) == 0.0f) {
                i3 += 2;
                fArr[i5] = lastIndex2;
                i2 = i4;
            } else {
                i2 = i4;
                i3 = i5;
            }
        }
        float f4 = 1.0f;
        if (list != null && (f2 = list.get(CollectionsKt.getLastIndex(colors))) != null) {
            f4 = f2.floatValue();
        }
        fArr[i3] = f4;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
