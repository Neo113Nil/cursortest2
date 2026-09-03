package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.util.ListUtilsKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class OcGJUxcOVecQiKb {
    public static void AGl7HBCQ8xrHABq(long j, StringBuilder sb, String str) {
        sb.append((Object) Color.FsuUJlzzWhYnMlD(j));
        sb.append(str);
    }

    public static void FTJ2XS7ULgY8(int i, Composer composer, int i2, Function2 function2) {
        composer.Yey4RyhSyBRHub(Integer.valueOf(i));
        composer.hRNgd2zGCE5kj(Integer.valueOf(i2), function2);
    }

    public static String FsuUJlzzWhYnMlD(String str, long j) {
        return str + j;
    }

    public static StringBuilder GiTAvmtrM6Bh8SJ(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void MCcLy95b8Awzmw(int i, int i2, int i3, int i4, int i5) {
        Key_androidKt.yzPsTade5rL7D3(i);
        Key_androidKt.yzPsTade5rL7D3(i2);
        Key_androidKt.yzPsTade5rL7D3(i3);
        Key_androidKt.yzPsTade5rL7D3(i4);
        Key_androidKt.yzPsTade5rL7D3(i5);
    }

    public static String MRfxZSx8l5UG62U(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder NIabVTHf6LMJyXq(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static KotlinNothingValueException OcGJUxcOVecQiKb(String str) {
        ListUtilsKt.hRNgd2zGCE5kj(str);
        return new KotlinNothingValueException();
    }

    public static String UEutaskTsxaI(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String Uo5pffGf8LUU(String str, int i) {
        return str + i;
    }

    public static KotlinNothingValueException XrorSzThrtvJ4A(String str) {
        ComposerKt.hRNgd2zGCE5kj(str);
        return new KotlinNothingValueException();
    }

    public static ProvidedValue b41X89IqSbKt(long j, DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal) {
        return dynamicProvidableCompositionLocal.hRNgd2zGCE5kj(new Color(j));
    }

    public static void exVmIuryuB8HeQ(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl) {
        composableLambdaImpl.kSPEzfraxudm4i(composer, Integer.valueOf(i));
        composer.GDGFDp2lxiHY();
    }

    public static String gmXBnHsR2YSm(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static int hRNgd2zGCE5kj(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static String i7xAcZoXXiIt(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String kSPEzfraxudm4i(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static KotlinNothingValueException o2t7oodqU1bUMaS(String str) {
        InlineClassHelperKt.ra306ClFT3HT(str);
        return new KotlinNothingValueException();
    }

    public static int oyjLVtGms9eZwJ0(TextStyle textStyle, int i, int i2) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static void pu0JZhzR2Or6(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1, long j) {
        canvasDrawScope$drawContext$1.yzPsTade5rL7D3().uypNJrpDByoB();
        canvasDrawScope$drawContext$1.Uo5pffGf8LUU(j);
    }

    public static int ra306ClFT3HT(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static String uypNJrpDByoB(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String yRx9jbDCTnXb3(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static int yzPsTade5rL7D3(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }
}
