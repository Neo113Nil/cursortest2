package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes5.dex */
public class e2 extends x1 {
    public e2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, a aVar, ProgressBar progressBar, k0 k0Var, View view, View view2, AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, ImageView imageView2, ViewGroup viewGroup) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        int i2;
        if (this.c.k0() == b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.c.k0() == b.e.BOTTOM) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        } else if (this.c.k0() == b.e.LEFT) {
            layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
        } else {
            if (this.c.k0() == b.e.RIGHT) {
                i = 5;
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                i = 5;
                layoutParams = this.e;
            }
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            view2.setLayoutParams(this.e);
            this.d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.d.addView(view);
            if (gVar != null) {
                if (this.c.B0()) {
                    i2 = 48;
                    i = 3;
                } else {
                    i2 = 48;
                }
                a(this.c.o(), i2 | i, gVar);
            }
            if (imageView != null) {
                int dpToPx = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f4550a.a(c5.j2)).intValue());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f4550a.a(c5.l2)).intValue());
                int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f4550a.a(c5.k2)).intValue());
                layoutParams2.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
                this.d.addView(imageView, layoutParams2);
            }
            if (aVar != null) {
                this.d.addView(aVar, this.e);
            }
            if (k0Var != null) {
                int dpToPx3 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f4550a.a(c5.W1)).intValue());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dpToPx3, dpToPx3, ((Integer) this.f4550a.a(c5.V1)).intValue());
                int dpToPx4 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f4550a.a(c5.U1)).intValue());
                layoutParams3.setMargins(dpToPx4, dpToPx4, dpToPx4, dpToPx4);
                this.d.addView(k0Var, layoutParams3);
            }
            if (progressBar != null) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams4.setMargins(0, 0, 0, ((Integer) this.f4550a.a(c5.o2)).intValue());
                this.d.addView(progressBar, layoutParams4);
            }
            if (imageView2 != null) {
                u7 u7Var = (u7) this.c;
                if (u7Var.r1()) {
                    int dpToPx5 = AppLovinSdkUtils.dpToPx(this.b, u7Var.l1().g());
                    int dpToPx6 = AppLovinSdkUtils.dpToPx(this.b, u7Var.l1().d());
                    int dpToPx7 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f4550a.a(c5.h5)).intValue());
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(dpToPx5, dpToPx6, 83);
                    layoutParams5.setMargins(dpToPx7, dpToPx7, dpToPx7, dpToPx7);
                    this.d.addView(imageView2, layoutParams5);
                }
            }
            if (kVar != null) {
                this.d.addView(kVar, this.e);
            }
            if (viewGroup == null) {
                viewGroup.addView(this.d);
                return;
            } else {
                this.b.setContentView(this.d);
                return;
            }
        }
        i = 5;
        appLovinAdView.setLayoutParams(this.e);
        this.d.addView(appLovinAdView);
        view2.setLayoutParams(this.e);
        this.d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.d.addView(view);
        if (gVar != null) {
        }
        if (imageView != null) {
        }
        if (aVar != null) {
        }
        if (k0Var != null) {
        }
        if (progressBar != null) {
        }
        if (imageView2 != null) {
        }
        if (kVar != null) {
        }
        if (viewGroup == null) {
        }
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (((Boolean) this.f4550a.a(c5.a7)).booleanValue()) {
            s.b(this.d, view);
        } else {
            s.a(this.d, view);
        }
        if (gVar != null) {
            a(this.c.o(), (this.c.v0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f4550a.a(c5.v2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f4550a.a(c5.w2)).intValue());
            this.d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
    }
}
