package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f12171a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }

    public final void a(Context context) {
        this.f12171a = new ImageView(context);
        int a2 = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        ImageView imageView = this.f12171a;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.f12171a;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.f12171a;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("icon");
        return null;
    }

    public final void a(FrameLayout rootView, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int a2 = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        if (i == 0) {
            layoutParams.gravity = 8388659;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            ImageView imageView = this.f12171a;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("icon");
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            boolean z = u.f12190a;
            t.c("NativeAd", com.iab.omid.library.vungle.internal.l.a("error msg: ").append(e.getLocalizedMessage()).toString());
        }
        ImageView imageView2 = this.f12171a;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }
}
