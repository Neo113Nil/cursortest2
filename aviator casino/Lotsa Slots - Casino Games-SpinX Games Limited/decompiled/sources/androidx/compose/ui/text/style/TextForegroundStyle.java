package androidx.compose.ui.text.style;

/* compiled from: TextForegroundStyle.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0016J\u0016\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "merge", "other", "takeOrElse", "Lkotlin/Function0;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Unspecified", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextForegroundStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextForegroundStyle.Companion INSTANCE = androidx.compose.ui.text.style.TextForegroundStyle.Companion.$$INSTANCE;

    float getAlpha();

    androidx.compose.ui.graphics.Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo4258getColor0d7_KjU();

    androidx.compose.ui.text.style.TextForegroundStyle merge(androidx.compose.ui.text.style.TextForegroundStyle other);

    androidx.compose.ui.text.style.TextForegroundStyle takeOrElse(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.text.style.TextForegroundStyle> other);

    /* compiled from: TextForegroundStyle.kt */
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.compose.ui.text.style.TextForegroundStyle $default$merge(final androidx.compose.ui.text.style.TextForegroundStyle _this, androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle) {
            float takeOrElse;
            boolean z = textForegroundStyle instanceof androidx.compose.ui.text.style.BrushStyle;
            if (!z || !(_this instanceof androidx.compose.ui.text.style.BrushStyle)) {
                return (!z || (_this instanceof androidx.compose.ui.text.style.BrushStyle)) ? (z || !(_this instanceof androidx.compose.ui.text.style.BrushStyle)) ? textForegroundStyle.takeOrElse(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.style.TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.compose.ui.text.style.TextForegroundStyle invoke() {
                        return androidx.compose.ui.text.style.TextForegroundStyle.this;
                    }
                }) : _this : textForegroundStyle;
            }
            androidx.compose.ui.graphics.ShaderBrush value = ((androidx.compose.ui.text.style.BrushStyle) textForegroundStyle).getValue();
            takeOrElse = androidx.compose.ui.text.style.TextDrawStyleKt.takeOrElse(textForegroundStyle.getAlpha(), new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Float invoke() {
                    return java.lang.Float.valueOf(androidx.compose.ui.text.style.TextForegroundStyle.this.getAlpha());
                }
            });
            return new androidx.compose.ui.text.style.BrushStyle(value, takeOrElse);
        }

        public static androidx.compose.ui.text.style.TextForegroundStyle $default$takeOrElse(androidx.compose.ui.text.style.TextForegroundStyle _this, kotlin.jvm.functions.Function0 function0) {
            return !kotlin.jvm.internal.Intrinsics.areEqual(_this, androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE) ? _this : (androidx.compose.ui.text.style.TextForegroundStyle) function0.invoke();
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "()V", "alpha", "", "getAlpha", "()F", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unspecified implements androidx.compose.ui.text.style.TextForegroundStyle {
        public static final int $stable = 0;
        public static final androidx.compose.ui.text.style.TextForegroundStyle.Unspecified INSTANCE = new androidx.compose.ui.text.style.TextForegroundStyle.Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public androidx.compose.ui.graphics.Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ androidx.compose.ui.text.style.TextForegroundStyle merge(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle) {
            return androidx.compose.ui.text.style.TextForegroundStyle.CC.$default$merge(this, textForegroundStyle);
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ androidx.compose.ui.text.style.TextForegroundStyle takeOrElse(kotlin.jvm.functions.Function0 function0) {
            return androidx.compose.ui.text.style.TextForegroundStyle.CC.$default$takeOrElse(this, function0);
        }

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo4258getColor0d7_KjU() {
            return androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "()V", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/compose/ui/text/style/TextForegroundStyle;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "from-8_81llA", "(J)Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.style.TextForegroundStyle.Companion $$INSTANCE = new androidx.compose.ui.text.style.TextForegroundStyle.Companion();

        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextForegroundStyle from(androidx.compose.ui.graphics.Brush brush, float alpha) {
            if (brush == null) {
                return androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE;
            }
            if (brush instanceof androidx.compose.ui.graphics.SolidColor) {
                return m4381from8_81llA(androidx.compose.ui.text.style.TextDrawStyleKt.m4380modulateDxMtmZc(((androidx.compose.ui.graphics.SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof androidx.compose.ui.graphics.ShaderBrush) {
                return new androidx.compose.ui.text.style.BrushStyle((androidx.compose.ui.graphics.ShaderBrush) brush, alpha);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final androidx.compose.ui.text.style.TextForegroundStyle m4381from8_81llA(long color) {
            return color != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() ? new androidx.compose.ui.text.style.ColorStyle(color, null) : androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE;
        }
    }
}
