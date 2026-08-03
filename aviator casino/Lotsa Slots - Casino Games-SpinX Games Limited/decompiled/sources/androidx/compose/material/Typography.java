package androidx.compose.material;

/* compiled from: Typography.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012Bo\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/compose/material/Typography;", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "h1", "Landroidx/compose/ui/text/TextStyle;", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM, "overline", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBody1", "()Landroidx/compose/ui/text/TextStyle;", "getBody2", "getButton", "getCaption", "getH1", "getH2", "getH3", "getH4", "getH5", "getH6", "getOverline", "getSubtitle1", "getSubtitle2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Typography {
    private final androidx.compose.ui.text.TextStyle body1;
    private final androidx.compose.ui.text.TextStyle body2;
    private final androidx.compose.ui.text.TextStyle button;
    private final androidx.compose.ui.text.TextStyle caption;
    private final androidx.compose.ui.text.TextStyle h1;
    private final androidx.compose.ui.text.TextStyle h2;
    private final androidx.compose.ui.text.TextStyle h3;
    private final androidx.compose.ui.text.TextStyle h4;
    private final androidx.compose.ui.text.TextStyle h5;
    private final androidx.compose.ui.text.TextStyle h6;
    private final androidx.compose.ui.text.TextStyle overline;
    private final androidx.compose.ui.text.TextStyle subtitle1;
    private final androidx.compose.ui.text.TextStyle subtitle2;

    public Typography(androidx.compose.ui.text.TextStyle h1, androidx.compose.ui.text.TextStyle h2, androidx.compose.ui.text.TextStyle h3, androidx.compose.ui.text.TextStyle h4, androidx.compose.ui.text.TextStyle h5, androidx.compose.ui.text.TextStyle h6, androidx.compose.ui.text.TextStyle subtitle1, androidx.compose.ui.text.TextStyle subtitle2, androidx.compose.ui.text.TextStyle body1, androidx.compose.ui.text.TextStyle body2, androidx.compose.ui.text.TextStyle button, androidx.compose.ui.text.TextStyle caption, androidx.compose.ui.text.TextStyle overline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "h1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2, "h2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3, "h3");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h4, "h4");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "h5");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h6, "h6");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overline, "overline");
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    public final androidx.compose.ui.text.TextStyle getH1() {
        return this.h1;
    }

    public final androidx.compose.ui.text.TextStyle getH2() {
        return this.h2;
    }

    public final androidx.compose.ui.text.TextStyle getH3() {
        return this.h3;
    }

    public final androidx.compose.ui.text.TextStyle getH4() {
        return this.h4;
    }

    public final androidx.compose.ui.text.TextStyle getH5() {
        return this.h5;
    }

    public final androidx.compose.ui.text.TextStyle getH6() {
        return this.h6;
    }

    public final androidx.compose.ui.text.TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final androidx.compose.ui.text.TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public final androidx.compose.ui.text.TextStyle getBody1() {
        return this.body1;
    }

    public final androidx.compose.ui.text.TextStyle getBody2() {
        return this.body2;
    }

    public final androidx.compose.ui.text.TextStyle getButton() {
        return this.button;
    }

    public final androidx.compose.ui.text.TextStyle getCaption() {
        return this.caption;
    }

    public final androidx.compose.ui.text.TextStyle getOverline() {
        return this.overline;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, androidx.compose.ui.text.TextStyle textStyle3, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.text.TextStyle textStyle5, androidx.compose.ui.text.TextStyle textStyle6, androidx.compose.ui.text.TextStyle textStyle7, androidx.compose.ui.text.TextStyle textStyle8, androidx.compose.ui.text.TextStyle textStyle9, androidx.compose.ui.text.TextStyle textStyle10, androidx.compose.ui.text.TextStyle textStyle11, androidx.compose.ui.text.TextStyle textStyle12, androidx.compose.ui.text.TextStyle textStyle13, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r6, r5, r9, r10, r11, r13, r7, r8, r12, r0);
        androidx.compose.ui.text.TextStyle textStyle14;
        androidx.compose.ui.text.TextStyle textStyle15;
        androidx.compose.ui.text.TextStyle textStyle16;
        androidx.compose.ui.text.TextStyle textStyle17;
        androidx.compose.ui.text.TextStyle textStyle18;
        androidx.compose.ui.text.TextStyle textStyle19;
        androidx.compose.ui.text.TextStyle textStyle20;
        androidx.compose.ui.text.TextStyle textStyle21;
        androidx.compose.ui.text.TextStyle textStyle22;
        androidx.compose.ui.text.TextStyle textStyle23;
        androidx.compose.ui.text.TextStyle textStyle24;
        androidx.compose.ui.text.TextStyle textStyle25;
        androidx.compose.ui.text.TextStyle textStyle26;
        androidx.compose.ui.text.font.SystemFontFamily systemFontFamily = (i & 1) != 0 ? androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            textStyle14 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(96), androidx.compose.ui.text.font.FontWeight.INSTANCE.getLight(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(-1.5d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle14 = textStyle;
        }
        if ((i & 4) != 0) {
            textStyle15 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(60), androidx.compose.ui.text.font.FontWeight.INSTANCE.getLight(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(-0.5d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle15 = textStyle2;
        }
        if ((i & 8) != 0) {
            textStyle16 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(48), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle16 = textStyle3;
        }
        if ((i & 16) != 0) {
            textStyle17 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(34), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.25d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle17 = textStyle4;
        }
        if ((i & 32) != 0) {
            textStyle18 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(24), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle18 = textStyle5;
        }
        if ((i & 64) != 0) {
            textStyle19 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(20), androidx.compose.ui.text.font.FontWeight.INSTANCE.getMedium(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.15d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle19 = textStyle6;
        }
        if ((i & 128) != 0) {
            textStyle20 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(16), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.15d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle20 = textStyle7;
        }
        if ((i & 256) != 0) {
            textStyle21 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(14), androidx.compose.ui.text.font.FontWeight.INSTANCE.getMedium(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.1d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle21 = textStyle8;
        }
        if ((i & 512) != 0) {
            textStyle22 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(16), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.5d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle22 = textStyle9;
        }
        if ((i & 1024) != 0) {
            textStyle23 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(14), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.25d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle23 = textStyle10;
        }
        if ((i & 2048) != 0) {
            textStyle24 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(14), androidx.compose.ui.text.font.FontWeight.INSTANCE.getMedium(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(1.25d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle24 = textStyle11;
        }
        if ((i & 4096) != 0) {
            textStyle25 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(12), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(0.4d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle25 = textStyle12;
        }
        if ((i & 8192) != 0) {
            textStyle26 = new androidx.compose.ui.text.TextStyle(0L, androidx.compose.ui.unit.TextUnitKt.getSp(10), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, androidx.compose.ui.unit.TextUnitKt.getSp(1.5d), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.style.TextAlign) null, (androidx.compose.ui.text.style.TextDirection) null, 0L, (androidx.compose.ui.text.style.TextIndent) null, 262009, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            textStyle26 = textStyle13;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typography(androidx.compose.ui.text.font.FontFamily defaultFontFamily, androidx.compose.ui.text.TextStyle h1, androidx.compose.ui.text.TextStyle h2, androidx.compose.ui.text.TextStyle h3, androidx.compose.ui.text.TextStyle h4, androidx.compose.ui.text.TextStyle h5, androidx.compose.ui.text.TextStyle h6, androidx.compose.ui.text.TextStyle subtitle1, androidx.compose.ui.text.TextStyle subtitle2, androidx.compose.ui.text.TextStyle body1, androidx.compose.ui.text.TextStyle body2, androidx.compose.ui.text.TextStyle button, androidx.compose.ui.text.TextStyle caption, androidx.compose.ui.text.TextStyle overline) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        androidx.compose.ui.text.TextStyle withDefaultFontFamily;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily2;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily3;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily4;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily5;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily6;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily7;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily8;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily9;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily10;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily11;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily12;
        androidx.compose.ui.text.TextStyle withDefaultFontFamily13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "h1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2, "h2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3, "h3");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h4, "h4");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "h5");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h6, "h6");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overline, "overline");
        withDefaultFontFamily = androidx.compose.material.TypographyKt.withDefaultFontFamily(h1, defaultFontFamily);
        withDefaultFontFamily2 = androidx.compose.material.TypographyKt.withDefaultFontFamily(h2, defaultFontFamily);
        withDefaultFontFamily3 = androidx.compose.material.TypographyKt.withDefaultFontFamily(h3, defaultFontFamily);
        withDefaultFontFamily4 = androidx.compose.material.TypographyKt.withDefaultFontFamily(h4, defaultFontFamily);
        withDefaultFontFamily5 = androidx.compose.material.TypographyKt.withDefaultFontFamily(h5, defaultFontFamily);
        withDefaultFontFamily6 = androidx.compose.material.TypographyKt.withDefaultFontFamily(h6, defaultFontFamily);
        withDefaultFontFamily7 = androidx.compose.material.TypographyKt.withDefaultFontFamily(subtitle1, defaultFontFamily);
        withDefaultFontFamily8 = androidx.compose.material.TypographyKt.withDefaultFontFamily(subtitle2, defaultFontFamily);
        withDefaultFontFamily9 = androidx.compose.material.TypographyKt.withDefaultFontFamily(body1, defaultFontFamily);
        withDefaultFontFamily10 = androidx.compose.material.TypographyKt.withDefaultFontFamily(body2, defaultFontFamily);
        withDefaultFontFamily11 = androidx.compose.material.TypographyKt.withDefaultFontFamily(button, defaultFontFamily);
        withDefaultFontFamily12 = androidx.compose.material.TypographyKt.withDefaultFontFamily(caption, defaultFontFamily);
        withDefaultFontFamily13 = androidx.compose.material.TypographyKt.withDefaultFontFamily(overline, defaultFontFamily);
    }

    public final androidx.compose.material.Typography copy(androidx.compose.ui.text.TextStyle h1, androidx.compose.ui.text.TextStyle h2, androidx.compose.ui.text.TextStyle h3, androidx.compose.ui.text.TextStyle h4, androidx.compose.ui.text.TextStyle h5, androidx.compose.ui.text.TextStyle h6, androidx.compose.ui.text.TextStyle subtitle1, androidx.compose.ui.text.TextStyle subtitle2, androidx.compose.ui.text.TextStyle body1, androidx.compose.ui.text.TextStyle body2, androidx.compose.ui.text.TextStyle button, androidx.compose.ui.text.TextStyle caption, androidx.compose.ui.text.TextStyle overline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "h1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2, "h2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3, "h3");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h4, "h4");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "h5");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h6, "h6");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overline, "overline");
        return new androidx.compose.material.Typography(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.Typography)) {
            return false;
        }
        androidx.compose.material.Typography typography = (androidx.compose.material.Typography) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.h1, typography.h1) && kotlin.jvm.internal.Intrinsics.areEqual(this.h2, typography.h2) && kotlin.jvm.internal.Intrinsics.areEqual(this.h3, typography.h3) && kotlin.jvm.internal.Intrinsics.areEqual(this.h4, typography.h4) && kotlin.jvm.internal.Intrinsics.areEqual(this.h5, typography.h5) && kotlin.jvm.internal.Intrinsics.areEqual(this.h6, typography.h6) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle1, typography.subtitle1) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle2, typography.subtitle2) && kotlin.jvm.internal.Intrinsics.areEqual(this.body1, typography.body1) && kotlin.jvm.internal.Intrinsics.areEqual(this.body2, typography.body2) && kotlin.jvm.internal.Intrinsics.areEqual(this.button, typography.button) && kotlin.jvm.internal.Intrinsics.areEqual(this.caption, typography.caption) && kotlin.jvm.internal.Intrinsics.areEqual(this.overline, typography.overline);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public java.lang.String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
