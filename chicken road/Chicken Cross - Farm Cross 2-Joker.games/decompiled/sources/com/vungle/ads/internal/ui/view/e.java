package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.o1;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class e extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f12168a;
    public ImageView b;
    public NativeVideoListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, o1 internal) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f12168a = internal;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.f12168a.b(this.b);
        requestLayout();
    }

    public final ImageView getImageView$vungle_ads_release() {
        return this.b;
    }

    public final o1 getInternal() {
        return this.f12168a;
    }

    public final NativeVideoListener getNativeVideoListener() {
        return this.c;
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.b = imageView;
    }

    public final void setNativeVideoListener(NativeVideoListener nativeVideoListener) {
        this.c = nativeVideoListener;
    }

    public void a() {
        removeAllViews();
        try {
            Result.Companion companion = Result.INSTANCE;
            ImageView imageView = this.b;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }
}
