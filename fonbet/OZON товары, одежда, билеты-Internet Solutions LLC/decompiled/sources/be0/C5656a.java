package be0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import hd.C6915b;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import we0.q;
import we0.r;

@SuppressLint({"ViewConstructor", "SetTextI18n"})
/* renamed from: be0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5656a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final GeoProviderConfig f55960a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f55961b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f55962c;

    /* renamed from: d, reason: collision with root package name */
    private int f55963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5656a(@NotNull Context context, @NotNull GeoProviderConfig config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f55960a = config;
        this.f55963d = f(20);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, f(20)));
        int f7 = f(8);
        setPadding(f7, f7, f7, f7);
        e(config, context, null);
    }

    public static void a(C5656a c5656a, String str) {
        c5656a.i(str);
    }

    public static void b(C5656a c5656a, String str) {
        c5656a.i(str);
    }

    @SuppressLint({"CheckResult"})
    private final void c(GeoProviderConfig geoProviderConfig, Context context, List<GeoProviderConfig.Copyright> list) {
        String logoMobile = geoProviderConfig.getLogoMobile();
        if (logoMobile == null || logoMobile.length() <= 0) {
            return;
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, f(20)));
        c.n(imageView.getContext().getApplicationContext()).load(geoProviderConfig.getLogoMobile()).into(imageView);
        imageView.setPadding(f(8), f(3), f(8), f(3));
        if (list != null && (!list.isEmpty())) {
            String url = list.get(0).getUrl();
            if (url == null) {
                url = "https://docs.ozon.ru/legal/terms-of-use/site/maps/";
            }
            imageView.setOnClickListener(new GD.a(2, this, url));
        }
        this.f55961b = imageView;
        addView(imageView);
    }

    @SuppressLint({"CheckResult"})
    private final void d(Context context, List<GeoProviderConfig.Copyright> list) {
        String str;
        GeoProviderConfig.Copyright copyright;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(f(20), f(20)));
        imageView.setImageResource(R.drawable.info_icon);
        imageView.setAlpha(0.75f);
        if (list == null || (copyright = (GeoProviderConfig.Copyright) C7714v.M(list)) == null || (str = copyright.getUrl()) == null) {
            str = "https://docs.ozon.ru/legal/terms-of-use/site/maps/";
        }
        imageView.setOnClickListener(new GD.b(2, this, str));
        imageView.setContentDescription("Ozon logo");
        this.f55961b = imageView;
        addView(imageView);
    }

    private final void e(GeoProviderConfig geoProviderConfig, Context context, q qVar) {
        List<GeoProviderConfig.Copyright> parseCopyrights = geoProviderConfig.parseCopyrights();
        List<GeoProviderConfig.Copyright> U02 = parseCopyrights != null ? C7714v.U0(parseCopyrights) : null;
        if ((qVar != null ? qVar.b() : null) == r.LEFT_BOTTOM) {
            d(context, U02);
            c(geoProviderConfig, context, U02);
        } else {
            c(geoProviderConfig, context, U02);
            d(context, U02);
        }
    }

    public static int f(int i11) {
        return C6915b.c(i11 * Resources.getSystem().getDisplayMetrics().density);
    }

    private final void i(String str) {
        try {
            androidx.core.content.a.startActivity(getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)), Bundle.EMPTY);
        } catch (Exception unused) {
        }
    }

    public final int g() {
        return this.f55963d;
    }

    public final Integer h() {
        return this.f55962c;
    }

    public final void j(@NotNull q logoConfig) {
        Intrinsics.checkNotNullParameter(logoConfig, "logoConfig");
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e(this.f55960a, context, logoConfig);
        if (logoConfig.b() == r.LEFT_TOP || logoConfig.b() == r.LEFT_BOTTOM) {
            setHorizontalGravity(3);
            ImageView imageView = this.f55961b;
            if (imageView != null) {
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
            }
        } else {
            setHorizontalGravity(5);
            ImageView imageView2 = this.f55961b;
            if (imageView2 != null) {
                imageView2.setScaleType(ImageView.ScaleType.FIT_END);
            }
        }
        if (logoConfig.b() == r.LEFT_BOTTOM || logoConfig.b() == r.RIGHT_BOTTOM) {
            setVerticalGravity(80);
        } else {
            setVerticalGravity(48);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f55962c = Integer.valueOf(i11 - Math.abs(getPaddingRight() - getPaddingLeft()));
    }
}
