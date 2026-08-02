package Mj;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.content.res.g;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Mj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3638a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f18142b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f18143c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f18144a;

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.fontFeatureSettings, R.attr.letterSpacing, R.attr.textSize, R.attr.textStyle, R.attr.textColor, ru.ozon.app.android.R.attr.fontWeight};
        C7705l.Z(iArr);
        f18142b = iArr;
        f18143c = TypedValue.applyDimension(2, 12, Resources.getSystem().getDisplayMetrics());
    }

    public C3638a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18144a = context;
    }

    public static void a(C3638a c3638a, TextPaint paint) {
        Typeface create;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Context context = c3638a.f18144a;
        int[] iArr = f18142b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ru.ozon.app.android.R.style.TextStyle_Head_M, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        paint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, R.attr.fontFeatureSettings)));
        paint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, R.attr.letterSpacing), 0.0f));
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), ru.ozon.app.android.R.font.onest_regular);
        int i11 = obtainStyledAttributes.getInt(C7705l.L(iArr, R.attr.textStyle), 0);
        int i12 = obtainStyledAttributes.getInt(C7705l.L(iArr, ru.ozon.app.android.R.attr.fontWeight), -1);
        Typeface e11 = g.e(resourceId, context);
        if (Build.VERSION.SDK_INT < 28 || i12 <= 0 || i12 > 1000) {
            create = Typeface.create(e11, i11);
        } else {
            create = Typeface.create(e11, i12, i11 == 2);
        }
        paint.setTypeface(create);
        paint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.textSize), f18143c));
        paint.setColor(obtainStyledAttributes.getColor(C7705l.L(iArr, R.attr.textColor), androidx.core.content.a.getColor(context, ru.ozon.app.android.R.color.oz_text_primary)));
        obtainStyledAttributes.recycle();
    }
}
