package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.qd;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j, reason: collision with root package name */
    private static final int f3390j = R.id.io_start_navigation_bar;

    /* renamed from: k, reason: collision with root package name */
    private static final int f3391k = R.id.io_start_navigation_bar_title;

    /* renamed from: l, reason: collision with root package name */
    private static final int f3392l = R.id.io_start_navigation_bar_close;

    /* renamed from: m, reason: collision with root package name */
    private static final int f3393m = R.id.io_start_navigation_bar_external;

    /* renamed from: n, reason: collision with root package name */
    private static final int f3394n = R.id.io_start_navigation_bar_back;

    /* renamed from: o, reason: collision with root package name */
    private static final int f3395o = R.id.io_start_navigation_bar_forward;

    /* renamed from: p, reason: collision with root package name */
    private static final int f3396p = R.id.io_start_navigation_bar_title_url;

    /* renamed from: q, reason: collision with root package name */
    private static final int f3397q = Color.rgb(78, 86, 101);

    /* renamed from: r, reason: collision with root package name */
    private static final int f3398r = Color.rgb(148, 155, 166);

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f3399a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f3400b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f3401c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f3402d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f3403e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f3404g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f3405h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f3406i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f3405h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f3405h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f3403e.setImageBitmap(((qd) this.f3406i.get("BACK_DARK")).f4272a);
                this.f3403e.setEnabled(true);
            } else {
                this.f3403e.setImageBitmap(((qd) this.f3406i.get("BACK")).f4272a);
                this.f3403e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f3401c.setImageBitmap(((qd) this.f3406i.get("FORWARD_DARK")).f4272a);
                this.f3401c.setEnabled(true);
            } else {
                this.f3401c.setImageBitmap(((qd) this.f3406i.get("FORWARD")).f4272a);
                this.f3401c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f3403e.setImageBitmap(((qd) this.f3406i.get("BACK_DARK")).f4272a);
            addView(this.f3403e, ii.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f3401c;
            int i3 = f3394n;
            RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a3.addRule(1, i3);
            addView(view, a3);
            removeView(this.f3399a);
            this.f3399a.removeView(this.f3404g);
            this.f3399a.removeView(this.f);
            this.f3399a.addView(this.f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f3399a;
            TextView textView = this.f3404g;
            int i4 = f3391k;
            RelativeLayout.LayoutParams a4 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a4.addRule(3, i4);
            relativeLayout.addView(textView, a4);
            int i5 = f3395o;
            RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a5.addRule(1, i5);
            a5.addRule(0, f3393m);
            addView(this.f3399a, a5);
            this.f3405h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.f3404g;
    }

    public final void c() {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i3 = f3397q;
        int i4 = f3391k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i3);
        textView.setId(i4);
        this.f = textView;
        Context context2 = getContext();
        int i5 = f3398r;
        int i6 = f3396p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i5);
        textView2.setId(i6);
        this.f3404g = textView2;
        this.f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f3399a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f3399a.addView(this.f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f3399a;
        TextView textView3 = this.f3404g;
        RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        a3.addRule(3, i4);
        relativeLayout2.addView(textView3, a3);
        for (qd qdVar : this.f3406i.values()) {
            Context context3 = getContext();
            String str = qdVar.f4275d;
            Bitmap b3 = f2.b(context3, str);
            if (b3 == null) {
                b3 = f2.b(context3, str);
            }
            if (b3 != null) {
                qdVar.f4272a = Bitmap.createScaledBitmap(b3, ii.a(getContext(), qdVar.f4273b), ii.a(getContext(), qdVar.f4274c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((qd) this.f3406i.get("X")).f4272a;
        int i7 = f3392l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i7);
        this.f3400b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((qd) this.f3406i.get("BROWSER")).f4272a;
        int i8 = f3393m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i8);
        this.f3402d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((qd) this.f3406i.get("BACK")).f4272a;
        int i9 = f3394n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i9);
        this.f3403e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((qd) this.f3406i.get("FORWARD")).f4272a;
        int i10 = f3395o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i10);
        this.f3401c = imageView4;
        int a4 = ii.a(getContext(), 10);
        this.f3401c.setPadding(a4, a4, a4, a4);
        this.f3401c.setEnabled(false);
        this.f3403e.setPadding(a4, a4, a4, a4);
        addView(this.f3400b, ii.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.f3402d;
        RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        a5.addRule(0, i7);
        addView(view, a5);
        View view2 = this.f3399a;
        RelativeLayout.LayoutParams a6 = ii.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        a6.addRule(0, i8);
        addView(view2, a6);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, ii.a(getContext(), 60)));
        setId(f3390j);
        HashMap hashMap = new HashMap();
        hashMap.put("BACK", new qd(14, 22, "back_.png"));
        hashMap.put("BACK_DARK", new qd(14, 22, "back_dark.png"));
        hashMap.put("FORWARD", new qd(14, 22, "forward_.png"));
        hashMap.put("FORWARD_DARK", new qd(14, 22, "forward_dark.png"));
        hashMap.put("X", new qd(23, 23, "x_dark.png"));
        hashMap.put("BROWSER", new qd(28, 28, "browser_icon_dark.png"));
        this.f3406i = hashMap;
    }

    public final void e() {
        this.f3406i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f3400b.setOnClickListener(onClickListener);
        this.f3403e.setOnClickListener(onClickListener);
        this.f3401c.setOnClickListener(onClickListener);
        this.f3402d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f;
    }
}
