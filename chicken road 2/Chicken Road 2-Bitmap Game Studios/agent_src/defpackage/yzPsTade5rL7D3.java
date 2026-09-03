package defpackage;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class yzPsTade5rL7D3 implements Arrangement.SpacingAlignmentCalculator, CancellationHandle, DoubleFunction, ObjectConstructor, Easing {
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ yzPsTade5rL7D3(int i) {
        this.yzPsTade5rL7D3 = i;
    }

    public static /* synthetic */ void FsuUJlzzWhYnMlD(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void MRfxZSx8l5UG62U(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void NIabVTHf6LMJyXq(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void UEutaskTsxaI() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void Uo5pffGf8LUU(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void b41X89IqSbKt() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void gmXBnHsR2YSm(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void i7xAcZoXXiIt(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void kSPEzfraxudm4i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void uypNJrpDByoB(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void yRx9jbDCTnXb3(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // androidx.compose.animation.core.Easing
    public float hRNgd2zGCE5kj(float f) {
        float f2;
        float f3;
        switch (this.yzPsTade5rL7D3) {
            case 28:
                int i = EasingFunctionsKt.yzPsTade5rL7D3;
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                CubicBezierEasing cubicBezierEasing = EasingKt.yzPsTade5rL7D3;
                return f;
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object oyjLVtGms9eZwJ0() {
        switch (this.yzPsTade5rL7D3) {
            case 16:
                return new ArrayList();
            case 17:
                return new ConcurrentHashMap();
            case 18:
                return new ConcurrentSkipListMap();
            case 19:
                return new LinkedHashSet();
            case 20:
                return new TreeSet();
            case 21:
                return new ArrayDeque();
            case 22:
                return new LinkedTreeMap(true);
            case 23:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double ra306ClFT3HT(double d) {
        switch (this.yzPsTade5rL7D3) {
            case 10:
                float[] fArr = ColorSpaces.yzPsTade5rL7D3;
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 11:
                float[] fArr2 = ColorSpaces.yzPsTade5rL7D3;
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                float[] fArr3 = ColorSpaces.yzPsTade5rL7D3;
                return ColorSpaces.hRNgd2zGCE5kj(ColorSpaces.ra306ClFT3HT, d);
            case 13:
                float[] fArr4 = ColorSpaces.yzPsTade5rL7D3;
                return ColorSpaces.yzPsTade5rL7D3(ColorSpaces.ra306ClFT3HT, d);
            case 14:
                float[] fArr5 = ColorSpaces.yzPsTade5rL7D3;
                return ColorSpaces.oyjLVtGms9eZwJ0(ColorSpaces.oyjLVtGms9eZwJ0, d);
            default:
                float[] fArr6 = ColorSpaces.yzPsTade5rL7D3;
                return ColorSpaces.ra306ClFT3HT(ColorSpaces.oyjLVtGms9eZwJ0, d);
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public int yzPsTade5rL7D3(int i, LayoutDirection layoutDirection) {
        return Alignment.Companion.uypNJrpDByoB.yzPsTade5rL7D3(0, i, layoutDirection);
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
    }
}
