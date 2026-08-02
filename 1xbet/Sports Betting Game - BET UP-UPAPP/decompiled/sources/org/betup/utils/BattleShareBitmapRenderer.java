package org.betup.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.ContextCompat;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.ui.dialogs.compose.BattleResultPalette;
import org.betup.ui.dialogs.compose.BattleResultTone;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleShareBitmapRenderer.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J8\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0002JD\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u0016H\u0002¨\u0006#"}, d2 = {"Lorg/betup/utils/BattleShareBitmapRenderer;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "render", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "palette", "Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "title", "", "subtitle", "amountText", "matchup", "widthPx", "", "truncateToWidth", "text", "paint", "Landroid/graphics/Paint;", "maxWidth", "", "drawEmblem", "", "canvas", "Landroid/graphics/Canvas;", "top", "target", "drawEmblemLayer", "resId", "centerX", "baseTop", RRWebVideoEvent.JsonKeys.SIZE, "yOffset", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleShareBitmapRenderer {
    public static final int $stable = 0;
    public static final BattleShareBitmapRenderer INSTANCE = new BattleShareBitmapRenderer();

    /* compiled from: BattleShareBitmapRenderer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleResultTone.values().length];
            try {
                iArr[BattleResultTone.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleResultTone.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleResultTone.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleResultTone.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleResultTone.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BattleResultTone.RETURNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BattleResultTone.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BattleResultTone.FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BattleResultTone.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BattleShareBitmapRenderer() {
    }

    public final Bitmap render(Context context, BattleResultPalette palette, String title, String subtitle, String amountText, String matchup, int widthPx) {
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(palette, "palette");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(matchup, "matchup");
        if (widthPx <= 0) {
            return null;
        }
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = f * 20.0f;
        float f3 = f * 18.0f;
        float f4 = widthPx;
        int roundToInt = MathKt.roundToInt(0.3f * f4);
        float f5 = roundToInt + f2 + f3;
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt((88.0f * f) + f5 + (36.0f * f) + f2), MathKt.roundToInt(0.95f * f4));
        Bitmap createBitmap = Bitmap.createBitmap(widthPx, coerceAtLeast, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
            case 1:
                j = ComposeUtils.AppColorPalette.BattleWonHeader.INSTANCE.getColor();
                break;
            case 2:
                j = ComposeUtils.AppColorPalette.BattleLostHeader.INSTANCE.getColor();
                break;
            case 3:
                j = ComposeUtils.AppColorPalette.BattleDrawHeader.INSTANCE.getColor();
                break;
            case 4:
                j = ComposeUtils.AppColorPalette.BattlePendingHeader.INSTANCE.getColor();
                break;
            case 5:
                j = ComposeUtils.AppColorPalette.BattleActiveHeader.INSTANCE.getColor();
                break;
            case 6:
                j = ComposeUtils.AppColorPalette.BattleReturnedHeader.INSTANCE.getColor();
                break;
            case 7:
                j = ComposeUtils.AppColorPalette.BattleCanceledHeader.INSTANCE.getColor();
                break;
            case 8:
                j = ComposeUtils.AppColorPalette.BattleFinishedHeader.INSTANCE.getColor();
                break;
            case 9:
                j = ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int m5222toArgb8_81llA = ColorKt.m5222toArgb8_81llA(j);
        int m5222toArgb8_81llA2 = ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor());
        float f6 = coerceAtLeast;
        RectF rectF = new RectF(0.0f, 0.0f, f4, f6);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f6, m5222toArgb8_81llA, m5222toArgb8_81llA2, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(rectF, f3, f3, paint);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.5f * f);
        paint2.setColor(ColorKt.m5222toArgb8_81llA(palette.m13239getCaptionBorder0d7_KjU()));
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        drawEmblem(canvas, context, palette, widthPx, MathKt.roundToInt(f2), roundToInt);
        Paint paint3 = new Paint(1);
        int i = WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()];
        if (i == 1) {
            j2 = ComposeUtils.AppColorPalette.BattleTitleGold.INSTANCE.getColor();
        } else if (i == 2) {
            j2 = ComposeUtils.AppColorPalette.BattleTitleLost.INSTANCE.getColor();
        } else {
            j2 = ComposeUtils.AppColorPalette.BattleTitleGold.INSTANCE.getColor();
        }
        paint3.setColor(ColorKt.m5222toArgb8_81llA(j2));
        paint3.setTextSize(f2);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint3.setTextAlign(Paint.Align.CENTER);
        Paint paint4 = new Paint(1);
        paint4.setColor(ColorKt.m5222toArgb8_81llA(palette.m13247getSubtitle0d7_KjU()));
        paint4.setTextSize(10.0f * f);
        paint4.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setLetterSpacing(0.08f);
        Paint paint5 = new Paint(1);
        paint5.setColor(ColorKt.m5222toArgb8_81llA(palette.m13238getAmountColor0d7_KjU()));
        paint5.setTextSize(26.0f * f);
        paint5.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint5.setTextAlign(Paint.Align.CENTER);
        Paint paint6 = new Paint(1);
        paint6.setColor(ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.BattleCaptionText.INSTANCE.getColor()));
        paint6.setTextSize(12.0f * f);
        paint6.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        paint6.setTextAlign(Paint.Align.CENTER);
        float f7 = f4 / 2.0f;
        float f8 = f4 - (2.0f * f2);
        String upperCase = title.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        canvas.drawText(truncateToWidth(upperCase, paint3, f8), f7, f5, paint3);
        String upperCase2 = subtitle.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        canvas.drawText(truncateToWidth(upperCase2, paint4, f8), f7, f5 + f3, paint4);
        canvas.drawText(truncateToWidth(amountText, paint5, f8), f7, f5 + (f * 48.0f), paint5);
        canvas.drawText(truncateToWidth(matchup, paint6, f8), f7, f6 - f2, paint6);
        return createBitmap;
    }

    private final String truncateToWidth(String text, Paint paint, float maxWidth) {
        if (paint.measureText(text) <= maxWidth) {
            return text;
        }
        int length = text.length();
        while (length > 0) {
            String substring = text.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (paint.measureText(substring + "…") <= maxWidth) {
                break;
            }
            length--;
        }
        if (length <= 0) {
            return text;
        }
        String substring2 = text.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2 + "…";
    }

    private final void drawEmblem(Canvas canvas, Context context, BattleResultPalette palette, int widthPx, int top, int target) {
        Integer num;
        int i = widthPx / 2;
        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                num = null;
                break;
            case 3:
                num = Integer.valueOf(R.drawable.battle_result_glow_draw);
                break;
            case 8:
                num = Integer.valueOf(R.drawable.battle_result_glow_finished);
                break;
            case 9:
                num = Integer.valueOf(R.drawable.battle_result_glow_neutral);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            drawEmblemLayer$default(this, canvas, context, num.intValue(), i, top, MathKt.roundToInt(target * 1.1f), 0.0f, 64, null);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[palette.getTone().ordinal()]) {
            case 1:
                drawEmblemLayer$default(this, canvas, context, R.drawable.image_b_won, i, top, target, 0.0f, 64, null);
                return;
            case 2:
                drawEmblemLayer$default(this, canvas, context, R.drawable.image_b_lost, i, top, target, 0.0f, 64, null);
                return;
            case 3:
                drawEmblemLayer$default(this, canvas, context, R.drawable.laurel_wreath_battle_preview, i, top, target, 0.0f, 64, null);
                float f = target;
                drawEmblemLayer(canvas, context, R.drawable.battle_result_scale_draw, i, top, MathKt.roundToInt(0.72f * f), (-target) * 0.04f);
                drawEmblemLayer(canvas, context, R.drawable.battle_coin_battle_preview, i, top, MathKt.roundToInt(0.55f * f), f * 0.06f);
                return;
            case 4:
                drawEmblemLayer$default(this, canvas, context, R.drawable.image_b_pending, i, top, target, 0.0f, 64, null);
                return;
            case 5:
                drawEmblemLayer$default(this, canvas, context, R.drawable.image_b_started, i, top, target, 0.0f, 64, null);
                return;
            case 6:
            case 7:
                drawEmblemLayer$default(this, canvas, context, R.drawable.image_b_cancel, i, top, target, 0.0f, 64, null);
                return;
            case 8:
                drawEmblemLayer$default(this, canvas, context, R.drawable.laurel_wreath_battle_preview, i, top, target, 0.0f, 64, null);
                float f2 = target;
                drawEmblemLayer(canvas, context, R.drawable.battle_result_medal_finished, i, top, MathKt.roundToInt(0.42f * f2), f2 * 0.02f);
                drawEmblemLayer(canvas, context, R.drawable.battle_coin_battle_preview, i, top, MathKt.roundToInt(0.55f * f2), f2 * 0.06f);
                return;
            default:
                drawEmblemLayer$default(this, canvas, context, R.drawable.laurel_wreath_battle_preview, i, top, target, 0.0f, 64, null);
                drawEmblemLayer$default(this, canvas, context, R.drawable.battle_coin_battle_preview, i, top, MathKt.roundToInt(target * 0.58f), 0.0f, 64, null);
                return;
        }
    }

    static /* synthetic */ void drawEmblemLayer$default(BattleShareBitmapRenderer battleShareBitmapRenderer, Canvas canvas, Context context, int i, int i2, int i3, int i4, float f, int i5, Object obj) {
        battleShareBitmapRenderer.drawEmblemLayer(canvas, context, i, i2, i3, i4, (i5 & 64) != 0 ? 0.0f : f);
    }

    private final void drawEmblemLayer(Canvas canvas, Context context, int resId, int centerX, int baseTop, int size, float yOffset) {
        Drawable mutate;
        Drawable drawable = ContextCompat.getDrawable(context, resId);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return;
        }
        int i = centerX - (size / 2);
        int roundToInt = MathKt.roundToInt(baseTop + yOffset);
        mutate.setBounds(i, roundToInt, i + size, size + roundToInt);
        mutate.draw(canvas);
    }
}
