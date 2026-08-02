package Kj;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.content.res.g;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: Kj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3529a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final int[] f15993a;

    static {
        int[] iArr = {R.attr.fontFamily, android.R.attr.fontFeatureSettings, android.R.attr.letterSpacing, android.R.attr.textSize};
        C7705l.Z(iArr);
        f15993a = iArr;
    }

    public static final void a(@NotNull TextPaint textPaint, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = f15993a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textPaint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, android.R.attr.fontFeatureSettings)));
        textPaint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, android.R.attr.letterSpacing), 0.0f));
        textPaint.setTypeface(g.e(obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R.font.onest_semibold), context));
        textPaint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, android.R.attr.textSize), TypedValue.applyDimension(2, 12, Resources.getSystem().getDisplayMetrics())));
        obtainStyledAttributes.recycle();
    }
}
