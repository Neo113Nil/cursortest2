package S10;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import gk0.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import l10.u;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$font;
import v10.C10183a;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final int f25675c = UiExtKt.toPx(4);

    /* renamed from: d, reason: collision with root package name */
    private static final int f25676d = UiExtKt.toPx(4);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f25677a;

    /* renamed from: b, reason: collision with root package name */
    private AppCompatTextView f25678b;

    public b(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f25677a = activity;
    }

    public static void a(b bVar) {
        bVar.f25677a.getOnBackPressedDispatcher().l();
    }

    public final void b(@NotNull View root, @NotNull u config) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(config, "config");
        Toolbar n11 = C10183a.n(root);
        if (n11 == null) {
            return;
        }
        n11.setPadding(0, f25675c, 0, 0);
        n11.setContentInsetStartWithNavigation(config.b());
        n11.setContentInsetsRelative(config.b(), n11.getContentInsetEnd());
        n11.setVisibility(config.a() != null ? 0 : 8);
        n11.setTag(Boolean.TRUE);
        u.b a11 = config.a();
        if (a11 == null) {
            return;
        }
        AppCompatTextView appCompatTextView = null;
        if (a11.d()) {
            Drawable drawable2 = androidx.core.content.a.getDrawable(root.getContext(), a11.b());
            if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                Context context = root.getContext();
                Integer c11 = a11.c();
                drawable.setTint(androidx.core.content.a.getColor(context, c11 != null ? c11.intValue() : R$color.graphic_tertiary));
            }
            n11.setNavigationIcon(drawable);
            n11.setNavigationOnClickListener(new View.OnClickListener() { // from class: S10.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a(b.this);
                }
            });
            if (n11.getChildCount() > 0 && (n11.getChildAt(0) instanceof AppCompatImageButton)) {
                n11.getChildAt(0).setId(R.id.navigationBtn);
            }
        }
        if (this.f25678b == null) {
            String title = a11.getTitle();
            if (title != null) {
                q qVar = q.f64554a;
                d b11 = N.b(AppCompatTextView.class);
                r rVar = this.f25677a;
                appCompatTextView = (AppCompatTextView) qVar.i(b11, rVar);
                if (appCompatTextView == null) {
                    appCompatTextView = new AppCompatTextView(rVar);
                }
                appCompatTextView.setId(R.id.titleToolbarTv);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                if (a11.d()) {
                    marginLayoutParams.setMargins(f25676d, 0, 0, 0);
                }
                appCompatTextView.setLayoutParams(marginLayoutParams);
                appCompatTextView.setIncludeFontPadding(true);
                appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Bold);
                if (a11.e().ordinal() == u.c.LEFT.ordinal()) {
                    appCompatTextView.setGravity(8388627);
                    appCompatTextView.setText(OzonSpannableStringExtKt.applyFontFix(OzonSpannableStringKt.toOzonSpannableString(title), rVar, R$font.onest_semibold));
                    appCompatTextView.setTextSize(20.0f);
                } else {
                    appCompatTextView.setGravity(17);
                    appCompatTextView.setText(title);
                }
            }
            if (appCompatTextView != null) {
                n11.addView(appCompatTextView);
                this.f25678b = appCompatTextView;
            }
        }
        String title2 = a11.getTitle();
        if (title2 != null) {
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(title2);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            n11.setTitle(OzonSpannableStringExtKt.applyFontFix(ozonSpannableString, context2, ru.ozon.uni.R$font.onest_semibold));
        }
        Context context3 = root.getContext();
        Integer a12 = a11.a();
        n11.setBackgroundColor(androidx.core.content.a.getColor(context3, a12 != null ? a12.intValue() : ru.ozon.uni.R$color.oz_semantic_bg_secondary));
    }
}
