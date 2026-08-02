package org.betup.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetShareImageDecorator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lorg/betup/utils/BetShareImageDecorator;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "GOLD_HEX", "", "BET_GRAY_HEX", "MARGIN_DP", "", "EXTRA_RAISE_DP", "EXTRA_LEFT_SHIFT_DP", "TEXT_SP", "LETTER_SPACING_EM", "applyCornerBrand", "Landroid/graphics/Bitmap;", "activity", "Landroidx/fragment/app/FragmentActivity;", "source", "isSingleLegBetTicket", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetShareImageDecorator {
    public static final int $stable = 0;
    private static final int BET_GRAY_HEX = -3025445;
    private static final float EXTRA_LEFT_SHIFT_DP = 12.0f;
    private static final float EXTRA_RAISE_DP = 16.0f;
    private static final int GOLD_HEX = -20422;
    public static final BetShareImageDecorator INSTANCE = new BetShareImageDecorator();
    private static final float LETTER_SPACING_EM = -0.06f;
    private static final float MARGIN_DP = 4.0f;
    private static final float TEXT_SP = 18.0f;

    private BetShareImageDecorator() {
    }

    public static /* synthetic */ Bitmap applyCornerBrand$default(BetShareImageDecorator betShareImageDecorator, FragmentActivity fragmentActivity, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return betShareImageDecorator.applyCornerBrand(fragmentActivity, bitmap, z);
    }

    public final Bitmap applyCornerBrand(FragmentActivity activity, Bitmap source, boolean isSingleLegBetTicket) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Bitmap copy = source.copy(Bitmap.Config.ARGB_8888, true);
        if (!source.isRecycled()) {
            source.recycle();
        }
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(4.0f * f), 4);
        float f2 = isSingleLegBetTicket ? 0.0f : EXTRA_RAISE_DP * f;
        float applyDimension = TypedValue.applyDimension(2, TEXT_SP, displayMetrics);
        String string = activity.getString(R.string.share_image_brand_bet);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(R.string.share_image_brand_up);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Paint paint = new Paint(1);
        paint.setColor(BET_GRAY_HEX);
        paint.setTextSize(applyDimension);
        paint.setTypeface(Typeface.create("sans-serif-black", 0));
        paint.setFakeBoldText(true);
        paint.setLetterSpacing(LETTER_SPACING_EM);
        Paint paint2 = new Paint(paint);
        paint2.setColor(GOLD_HEX);
        float measureText = paint.measureText(string);
        float measureText2 = paint2.measureText(string2) + measureText;
        float height = ((copy.getHeight() - coerceAtLeast) - f2) - paint.getFontMetrics().descent;
        float coerceAtLeast2 = RangesKt.coerceAtLeast(((copy.getWidth() - coerceAtLeast) - measureText2) - (f * 12.0f), 0.0f);
        Canvas canvas = new Canvas(copy);
        canvas.drawText(string, coerceAtLeast2, height, paint);
        canvas.drawText(string2, coerceAtLeast2 + measureText, height, paint2);
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}
