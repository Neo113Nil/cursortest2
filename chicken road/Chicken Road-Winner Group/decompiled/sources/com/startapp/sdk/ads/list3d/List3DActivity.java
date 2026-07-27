package com.startapp.sdk.ads.list3d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.jb;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.mb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sb;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.xf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class List3DActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private List3DView f2976a;

    /* renamed from: b, reason: collision with root package name */
    private int f2977b;

    /* renamed from: c, reason: collision with root package name */
    private Long f2978c;

    /* renamed from: d, reason: collision with root package name */
    private Long f2979d;
    String f;

    /* renamed from: g, reason: collision with root package name */
    String f2981g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f2982h;

    /* renamed from: i, reason: collision with root package name */
    private sb f2983i;

    /* renamed from: e, reason: collision with root package name */
    private long f2980e = 0;

    /* renamed from: j, reason: collision with root package name */
    private jb f2984j = new jb(this);

    @Override // android.app.Activity
    public final void finish() {
        sb sbVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f2982h;
            g0.a(this, (arrayList == null || arrayList.isEmpty()) ? "" : ((ob) this.f2982h.get(0)).f4150e != null ? ((ob) this.f2982h.get(0)).f4150e : "", a());
            fh.f3695a.getClass();
            if (this.f2977b == getResources().getConfiguration().orientation) {
                wb.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                try {
                    if (this.f2984j != null) {
                        wb.a(this).a(this.f2984j);
                        this.f2984j = null;
                    }
                } finally {
                }
            }
            String str = this.f;
            if (str != null && (sbVar = this.f2983i) != null) {
                for (xf xfVar : sbVar.a(str).f4295a.f3447c.values()) {
                    if (xfVar != null) {
                        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!h0.f.booleanValue()) {
                    this.f2983i.f4328a.remove(this.f);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        sb sbVar = this.f2983i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f).f4295a.f3447c.values()) {
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, android.content.Context, com.startapp.sdk.ads.list3d.List3DActivity] */
    /* JADX WARN: Type inference failed for: r15v31, types: [android.view.View, android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.startapp.sdk.adsbase.adinformation.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v28, types: [android.widget.ImageButton, android.widget.ImageView] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable th;
        TextView textView;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                try {
                    requestWindowFeature(1);
                    getWindow().setFlags(1024, 1024);
                } catch (Throwable th2) {
                    th = th2;
                    d9.a(th);
                    finish();
                }
            }
            if (bundle == null) {
                wb.a((Context) this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f2978c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f2979d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f2978c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f2979d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra("position");
            this.f = getIntent().getStringExtra("listModelUuid");
            wb.a((Context) this).a(this.f2984j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f2977b = getResources().getConfiguration().orientation;
            si.a((Activity) this, true);
            requestWindowFeature(1);
            this.f2981g = getIntent().getStringExtra("adTag");
            int d3 = AdsCommonMetaData.k().d();
            int c3 = AdsCommonMetaData.k().c();
            this.f2976a = new List3DView(this);
            this.f2976a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{d3, c3}));
            sb sbVar = (sb) com.startapp.sdk.components.a.a((Context) this).f3351R.a();
            this.f2983i = sbVar;
            ArrayList arrayList = sbVar.a(this.f).f4296b;
            this.f2982h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f2976a.setStarted();
            this.f2976a.setHint(true);
            this.f2976a.setFade(true);
            mb mbVar = new mb(this, this.f2982h, this.f2981g, this.f);
            this.f2983i.a(this.f).a(this);
            this.f2976a.setAdapter(mbVar);
            this.f2976a.setDynamics(new rg());
            this.f2976a.setOnItemClickListener(new a(this));
            ?? relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(h0.f3816h);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            ?? linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            ?? relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(AdsCommonMetaData.k().z().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView2 = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView2.setLayoutParams(layoutParams3);
            float f = 2;
            textView2.setPadding(0, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
            textView2.setTextColor(AdsCommonMetaData.k().C().intValue());
            textView2.setTextSize(AdsCommonMetaData.k().E().intValue());
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(AdsCommonMetaData.k().A());
            textView2.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            ii.a(textView2, AdsCommonMetaData.k().D());
            relativeLayout2.addView(textView2);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap b3 = f2.b(this, "close_button.png");
            if (b3 == null) {
                b3 = f2.b(this, "close_button.png");
            }
            if (b3 != null) {
                ?? imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                float f3 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(b3, Math.round(TypedValue.applyDimension(1, f3, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f3, getResources().getDisplayMetrics())), true));
                textView = imageButton;
            } else {
                TextView textView3 = new TextView(this);
                textView3.setText("   x   ");
                textView3.setTextSize(20.0f);
                textView = textView3;
            }
            textView.setLayoutParams(layoutParams4);
            textView.setOnClickListener(new b(this));
            textView.setContentDescription("x");
            textView.setId(h0.f3818j);
            relativeLayout2.addView(textView);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()))));
            view.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f2976a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f2976a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView4 = new TextView(this);
            textView4.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView4.setPadding(0, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView4.setText("Powered By ");
            textView4.setTextSize(16.0f);
            linearLayout2.addView(textView4);
            ImageView imageView = new ImageView(this);
            Bitmap b4 = f2.b(this, "logo.png");
            if (b4 == null) {
                b4 = f2.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(b4, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            try {
                new com.startapp.sdk.adsbase.adinformation.a(this, AdInformationConfig.ImageResourceType.INFO_L, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null, null, null).a(relativeLayout);
                setContentView(relativeLayout, layoutParams);
                new Handler().postDelayed(new lb(this), 500L);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                d9.a(th);
                finish();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f2984j != null) {
            wb.a(this).a(this.f2984j);
        }
        si.a((Activity) this, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        sb sbVar = this.f2983i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f).f4295a.f3447c.values()) {
                if (xfVar != null) {
                    xfVar.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f2978c != null && this.f2979d != null && System.currentTimeMillis() - this.f2978c.longValue() > this.f2979d.longValue()) {
            finish();
            return;
        }
        fh.f3695a.getClass();
        this.f2980e = SystemClock.uptimeMillis();
        sb sbVar = this.f2983i;
        if (sbVar != null) {
            a9 a9Var = sbVar.a(this.f).f4295a;
            for (String str : a9Var.f3447c.keySet()) {
                if (a9Var.f3447c.get(str) != null) {
                    ((xf) a9Var.f3447c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l3 = this.f2978c;
        if (l3 != null) {
            bundle.putSerializable("lastLoadTime", l3);
        }
        Long l4 = this.f2979d;
        if (l4 != null) {
            bundle.putSerializable("adCacheTtl", l4);
        }
    }

    public final CloseTrackingParams a() {
        return new CloseTrackingParams(this.f2981g, (SystemClock.uptimeMillis() - this.f2980e) / 1000);
    }

    public final void a(int i3) {
        ArrayList arrayList;
        List3DView list3DView = this.f2976a;
        View childAt = list3DView.getChildAt(i3 - list3DView.f2992i);
        if (childAt == null) {
            return;
        }
        qb qbVar = (qb) childAt.getTag();
        sb sbVar = this.f2983i;
        rb a3 = sbVar != null ? sbVar.a(this.f) : null;
        if (a3 == null || (arrayList = a3.f4296b) == null || i3 >= arrayList.size()) {
            return;
        }
        ob obVar = (ob) a3.f4296b.get(i3);
        qbVar.f4267b.setImageBitmap(a3.f4295a.a(obVar.f4146a, i3, obVar.f4153i));
        qbVar.f4267b.requestLayout();
        if (obVar.f4158n != null) {
            qbVar.f4270e.setText("Open");
        } else {
            qbVar.f4270e.setText("Download");
        }
    }
}
