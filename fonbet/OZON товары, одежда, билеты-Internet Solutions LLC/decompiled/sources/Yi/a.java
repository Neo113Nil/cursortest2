package Yi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ri.C9281a;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$drawable;

/* loaded from: classes10.dex */
public final class a extends ConstraintLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final float f35114h = UiExtKt.toPxF(12);

    /* renamed from: i, reason: collision with root package name */
    private static final int f35115i = UiExtKt.toPx(4);

    /* renamed from: j, reason: collision with root package name */
    private static final int f35116j = UiExtKt.toPx(8);

    /* renamed from: k, reason: collision with root package name */
    private static final int f35117k = UiExtKt.toPx(20);

    /* renamed from: l, reason: collision with root package name */
    private static final int f35118l = R.id.galleryMediaCellImage;

    /* renamed from: m, reason: collision with root package name */
    private static final int f35119m = R.id.galleryMediaCellFavouriteIcon;

    /* renamed from: n, reason: collision with root package name */
    private static final int f35120n = R.id.galleryMediaCellDurationText;

    /* renamed from: o, reason: collision with root package name */
    private static final int f35121o = R.id.galleryMediaCellSelectionText;

    /* renamed from: p, reason: collision with root package name */
    private static final int f35122p = R.id.galleryMediaCellSelectionCheckMark;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AppCompatImageView f35123c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AppCompatImageView f35124d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f35125e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f35126f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AppCompatImageView f35127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, int i11) {
        super(context, null, R.attr.mediaCellStyle, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int i12 = f35118l;
        appCompatImageView.setId(i12);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(0, 0));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(appCompatImageView);
        this.f35123c = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        int i13 = f35119m;
        appCompatImageView2.setId(i13);
        appCompatImageView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        appCompatImageView2.setImageDrawable(androidx.core.content.a.getDrawable(context, R$drawable.ic_m_heart_filled));
        ThemeExtKt.tint(appCompatImageView2, Integer.valueOf(androidx.core.content.a.getColor(context, R$color.oz_white_1)));
        addView(appCompatImageView2);
        this.f35124d = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        int i14 = f35120n;
        appCompatTextView.setId(i14);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i15 = f35116j;
        bVar.setMargins(i15, i15, i15, i15);
        appCompatTextView.setLayoutParams(bVar);
        float f7 = f35114h;
        appCompatTextView.setTextSize(f7);
        int i16 = f35115i;
        appCompatTextView.setPadding(i15, i16, i15, i16);
        appCompatTextView.setTextAppearance(context, R$style.TextStyle_Caption_Bold);
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(context, R$color.oz_text_primary_negative));
        appCompatTextView.setBackground(androidx.core.content.a.getDrawable(context, ru.ozon.uni.R$drawable.bg_dialog_rounded));
        int color = androidx.core.content.a.getColor(context, R$color.oz_semantic_accent_feed_2);
        Intrinsics.checkNotNullParameter(appCompatTextView, "<this>");
        Y.F(appCompatTextView, ColorStateList.valueOf(color));
        addView(appCompatTextView);
        this.f35125e = appCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C9281a.f83537a, R.attr.mediaCellStyle, i11);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int color2 = obtainStyledAttributes.getColor(1, ThemeExtKt.themeColor(context, R.attr.textLightKey));
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
            int i17 = f35121o;
            appCompatTextView2.setId(i17);
            int i18 = f35117k;
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(i18, i18);
            bVar2.setMargins(i15, i15, i15, i15);
            appCompatTextView2.setLayoutParams(bVar2);
            appCompatTextView2.setGravity(17);
            appCompatTextView2.setTextSize(f7);
            appCompatTextView2.setTextAppearance(context, R$style.OzonTextAppearance_BodyControl_300xsmall);
            appCompatTextView2.setTextColor(color2);
            appCompatTextView2.setBackground(androidx.core.content.a.getDrawable(context, R.drawable.ozon_gallery_selector_checkbox));
            addView(appCompatTextView2);
            this.f35126f = appCompatTextView2;
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
            int i19 = f35122p;
            appCompatImageView3.setId(i19);
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(i18, i18);
            bVar3.setMargins(i15, i15, i15, i15);
            appCompatImageView3.setLayoutParams(bVar3);
            appCompatImageView3.setImageDrawable(drawable);
            addView(appCompatImageView3);
            this.f35127g = appCompatImageView3;
            d dVar = new d();
            dVar.p(this);
            dVar.s(i12, 6, 0, 6);
            dVar.s(i12, 3, 0, 3);
            dVar.s(i12, 7, 0, 7);
            dVar.s(i12, 4, 0, 4);
            dVar.s(i13, 6, 0, 6);
            dVar.s(i13, 4, 0, 4);
            dVar.s(i14, 7, 0, 7);
            dVar.s(i14, 4, 0, 4);
            dVar.s(i17, 7, 0, 7);
            dVar.s(i17, 3, 0, 3);
            dVar.s(i19, 7, 0, 7);
            dVar.s(i19, 3, 0, 3);
            dVar.f(this);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @NotNull
    public final AppCompatTextView b() {
        return this.f35125e;
    }

    @NotNull
    public final AppCompatImageView c() {
        return this.f35124d;
    }

    @NotNull
    public final AppCompatImageView d() {
        return this.f35123c;
    }

    @NotNull
    public final AppCompatImageView e() {
        return this.f35127g;
    }

    @NotNull
    public final AppCompatTextView f() {
        return this.f35126f;
    }
}
