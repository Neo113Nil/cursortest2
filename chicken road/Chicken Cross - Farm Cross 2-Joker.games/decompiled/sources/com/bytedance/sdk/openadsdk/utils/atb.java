package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class atb implements com.bytedance.sdk.component.vj.dax {
    private final WeakReference<ImageView> pcc;

    public atb(ImageView imageView) {
        this.pcc = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
        ImageView imageView = this.pcc.get();
        if (imageView == null) {
            return;
        }
        try {
            Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) sf);
                return;
            }
            if (sf instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (sf instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) sf).start();
                }
                imageView.setImageDrawable((Drawable) sf);
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(int i, String str, Throwable th) {
        ImageView imageView = this.pcc.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
