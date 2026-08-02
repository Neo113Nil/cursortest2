package i0;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class s {
    public static final ColorSpace a(j0.c cVar) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17419e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17429q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17430r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17427o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17422j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17432t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17431s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17423k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17424l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17420g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17421h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17425m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17428p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.l.a(cVar, j0.d.f17426n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (kotlin.jvm.internal.l.a(cVar, j0.d.f17434v)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (kotlin.jvm.internal.l.a(cVar, j0.d.f17435w)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof j0.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        j0.q qVar = (j0.q) cVar;
        float[] a5 = qVar.f17463d.a();
        j0.r rVar = qVar.f17465g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f17476b, rVar.f17477c, rVar.f17478d, rVar.f17479e, rVar.f, rVar.f17480g, rVar.f17475a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.f17412a, qVar.f17466h, a5, transferParameters);
        }
        String str = cVar.f17412a;
        final j0.p pVar = qVar.f17469l;
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: i0.r
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d5) {
                switch (i) {
                }
                return ((Number) ((j0.p) pVar).c(Double.valueOf(d5))).doubleValue();
            }
        };
        final j0.p pVar2 = qVar.f17472o;
        final int i5 = 1;
        return new ColorSpace.Rgb(str, qVar.f17466h, a5, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: i0.r
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d5) {
                switch (i5) {
                }
                return ((Number) ((j0.p) pVar2).c(Double.valueOf(d5))).doubleValue();
            }
        }, qVar.f17464e, qVar.f);
    }
}
