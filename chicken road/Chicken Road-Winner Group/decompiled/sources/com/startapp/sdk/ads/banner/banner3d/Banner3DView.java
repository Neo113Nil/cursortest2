package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.internal.d1;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.json.RatingBar;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public class Banner3DView extends RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f2889g = R.id.io_start_banner_photo;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2890h = R.id.io_start_banner_title;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2891i = R.id.io_start_banner_description;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2892j = R.id.io_start_banner_download;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2893k = R.id.io_start_banner_rating;

    /* renamed from: a, reason: collision with root package name */
    private TextView f2894a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2895b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f2896c;

    /* renamed from: d, reason: collision with root package name */
    private RatingBar f2897d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f2898e;
    private final Point f;

    public enum Template {
        /* JADX INFO: Fake field, exist only in values array */
        XS,
        S,
        M,
        L,
        XL
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Context context = getContext();
        Template template = Template.S;
        int i3 = this.f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i3 > size.getSize().getWidth() || this.f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i4 = this.f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i4 > size2.getSize().getWidth() || this.f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i5 = this.f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i5 > size3.getSize().getWidth() || this.f.y > size3.getSize().getHeight()) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a3 = ii.a(context, 2);
        int round = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 20, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 90, context.getResources().getDisplayMetrics()));
        setPadding(round2, 0, round2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f2896c = imageView;
        int i6 = f2889g;
        imageView.setId(i6);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams.addRule(15);
        this.f2896c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f2894a = textView;
        int i7 = f2890h;
        textView.setId(i7);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i6);
        layoutParams2.addRule(14);
        this.f2894a.setLayoutParams(layoutParams2);
        this.f2894a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f2894a.setGravity(8388611);
        this.f2894a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f2894a.setTextSize(17.0f);
            this.f2894a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f.x * 0.55d));
        } else if (ordinal == 2) {
            this.f2894a.setTextSize(17.0f);
            this.f2894a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f.x * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f2894a.setTextSize(22.0f);
            this.f2894a.setPadding(round, 0, 0, round2);
        }
        this.f2894a.setSingleLine(true);
        this.f2894a.setEllipsize(TextUtils.TruncateAt.END);
        ii.a(this.f2894a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f2895b = textView2;
        int i8 = f2891i;
        textView2.setId(i8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i6);
        layoutParams3.addRule(3, i7);
        layoutParams3.setMargins(0, 0, 0, round2);
        this.f2895b.setLayoutParams(layoutParams3);
        this.f2895b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f2895b.setTextSize(18.0f);
        this.f2895b.setMaxLines(2);
        this.f2895b.setLines(2);
        this.f2895b.setSingleLine(false);
        this.f2895b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f2895b.setHorizontallyScrolling(true);
        this.f2895b.setPadding(round, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f2897d = ratingBar;
        ratingBar.setId(f2893k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(17, i6);
            layoutParams4.addRule(8, i6);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(17, i7);
            layoutParams3.width = ii.a(getContext(), (int) (this.f.x * 0.6d));
        }
        layoutParams4.setMargins(round, round4, round, 0);
        this.f2897d.setLayoutParams(layoutParams4);
        this.f2898e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f2898e.setTextSize(13.0f);
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(17, i8);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5, 0, 0, 0);
            this.f2898e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(17, i8);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5 * 7, 0, 0, 0);
            this.f2898e.setTextSize(26.0f);
        }
        this.f2898e.setPadding(round3, round3, round3, round3);
        this.f2898e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f2898e.setTextColor(-1);
        this.f2898e.setTypeface(null, 1);
        this.f2898e.setId(f2892j);
        this.f2898e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f2898e.setBackgroundDrawable(new d1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f2896c);
        addView(this.f2894a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f2898e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f2898e);
            addView(this.f2895b);
        }
        addView(this.f2897d);
    }

    public void setButtonText(boolean z3) {
        if (z3) {
            this.f2898e.setText("OPEN");
        } else {
            this.f2898e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] a3 = a(str);
                String str2 = a3[0];
                String str3 = a3[1];
                String str4 = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    str4 = B0.c.o(str4, "...");
                }
                this.f2895b.setText(str2 + IOUtils.LINE_SEPARATOR_UNIX + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f2896c.setImageBitmap(bitmap);
    }

    public void setRating(float f) {
        try {
            this.f2897d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f2894a.setText(str);
    }

    public void setImage(int i3, int i4, int i5) {
        this.f2896c.setImageResource(i3);
        ViewGroup.LayoutParams layoutParams = this.f2896c.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i5;
        this.f2896c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i3, int i4) {
        this.f2896c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f2896c.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f2896c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        a();
    }

    private static String[] a(String str) {
        boolean z3;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i3 = length - 1;
            int i4 = length - 2;
            while (true) {
                if (i4 <= 0) {
                    z3 = false;
                    break;
                }
                if (charArray[i4] == ' ') {
                    z3 = true;
                    i3 = i4;
                    break;
                }
                i4--;
            }
            int i5 = z3 ? i3 : 55;
            strArr[0] = str.substring(0, i5);
            strArr[1] = str.substring(i5 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
