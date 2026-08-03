package androidx.compose.material;

/* compiled from: Button.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.JG\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00105R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final androidx.compose.foundation.layout.PaddingValues ContentPadding;
    public static final androidx.compose.material.ButtonDefaults INSTANCE = new androidx.compose.material.ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    private static final androidx.compose.foundation.layout.PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    private ButtonDefaults() {
    }

    public final androidx.compose.foundation.layout.PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1271getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1270getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1268getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1269getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final androidx.compose.material.ButtonColors m1265buttonColorsro_MJ88(long j, long j2, long j3, long j4, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1870371134);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)403@16701L6,404@16747L32,405@16836L6,406@16914L6,407@16983L6,408@17039L8:Button.kt#jmzs0o");
        long m1315getPrimary0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1315getPrimary0d7_KjU() : j;
        androidx.compose.material.DefaultButtonColors defaultButtonColors = new androidx.compose.material.DefaultButtonColors(m1315getPrimary0d7_KjU, (i2 & 2) != 0 ? androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(m1315getPrimary0d7_KjU, composer, i & 14) : j2, (i2 & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) : j3, (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final androidx.compose.material.ButtonColors m1273outlinedButtonColorsRGew2ao(long j, long j2, long j3, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2124406093);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)426@17786L6,427@17846L6,428@17914L6,429@17970L8:Button.kt#jmzs0o");
        long m1319getSurface0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU() : j;
        androidx.compose.material.DefaultButtonColors defaultButtonColors = new androidx.compose.material.DefaultButtonColors(m1319getSurface0d7_KjU, (i2 & 2) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1315getPrimary0d7_KjU() : j2, m1319getSurface0d7_KjU, (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final androidx.compose.material.ButtonColors m1274textButtonColorsRGew2ao(long j, long j2, long j3, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)448@18737L6,449@18805L6,450@18861L8:Button.kt#jmzs0o");
        long m2148getTransparent0d7_KjU = (i2 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2148getTransparent0d7_KjU() : j;
        androidx.compose.material.DefaultButtonColors defaultButtonColors = new androidx.compose.material.DefaultButtonColors(m2148getTransparent0d7_KjU, (i2 & 2) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1315getPrimary0d7_KjU() : j2, m2148getTransparent0d7_KjU, (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1272getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final androidx.compose.foundation.BorderStroke getOutlinedBorder(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C474@19565L6:Button.kt#jmzs0o");
        androidx.compose.foundation.BorderStroke m239BorderStrokecXLIe8U = androidx.compose.foundation.BorderStrokeKt.m239BorderStrokecXLIe8U(OutlinedBorderSize, androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return m239BorderStrokecXLIe8U;
    }

    public final androidx.compose.foundation.layout.PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ androidx.compose.material.ButtonElevation m1267elevationyajeYGU(float f, float f2, float f3, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1428576874);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)346@14503L161:Button.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m4478constructorimpl(2);
        }
        float f4 = f;
        if ((i2 & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
        }
        float f5 = f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(0);
        }
        float f6 = 4;
        androidx.compose.material.ButtonElevation m1266elevationR_JCAzs = m1266elevationR_JCAzs(f4, f5, f3, androidx.compose.ui.unit.Dp.m4478constructorimpl(f6), androidx.compose.ui.unit.Dp.m4478constructorimpl(f6), composer, (i & 14) | 27648 | (i & 112) | (i & 896) | ((i << 6) & 458752), 0);
        composer.endReplaceableGroup();
        return m1266elevationR_JCAzs;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:java.lang.Object) from 0x00a2: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r2v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:632)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final androidx.compose.material.ButtonElevation m1266elevationR_JCAzs(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ??, still in use, count: 1, list:
          (r2v6 ?? I:java.lang.Object) from 0x00a2: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r2v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:632)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    static {
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(16);
        ButtonHorizontalPadding = m4478constructorimpl;
        float f = 8;
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        ButtonVerticalPadding = m4478constructorimpl2;
        androidx.compose.foundation.layout.PaddingValues m564PaddingValuesa9UjIt4 = androidx.compose.foundation.layout.PaddingKt.m564PaddingValuesa9UjIt4(m4478constructorimpl, m4478constructorimpl2, m4478constructorimpl, m4478constructorimpl2);
        ContentPadding = m564PaddingValuesa9UjIt4;
        MinWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(64);
        MinHeight = androidx.compose.ui.unit.Dp.m4478constructorimpl(36);
        IconSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(18);
        IconSpacing = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        OutlinedBorderSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(1);
        float m4478constructorimpl3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        TextButtonHorizontalPadding = m4478constructorimpl3;
        TextButtonContentPadding = androidx.compose.foundation.layout.PaddingKt.m564PaddingValuesa9UjIt4(m4478constructorimpl3, m564PaddingValuesa9UjIt4.getTop(), m4478constructorimpl3, m564PaddingValuesa9UjIt4.getBottom());
    }
}
