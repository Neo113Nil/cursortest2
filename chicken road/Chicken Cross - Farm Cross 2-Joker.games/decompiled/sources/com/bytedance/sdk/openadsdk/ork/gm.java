package com.bytedance.sdk.openadsdk.ork;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class gm implements dax {
    private dax gm;
    private final WeakReference<ImageView> pcc;
    private final String sf = "ImageLoaderToViewWrapper";

    public static dax pcc(of ofVar, String str, ImageView imageView) {
        return new sf(ofVar, str, new gm(imageView));
    }

    public static dax pcc(of ofVar, String str, ImageView imageView, dax daxVar) {
        return new sf(ofVar, str, new gm(imageView, daxVar));
    }

    private gm(ImageView imageView, dax daxVar) {
        this.pcc = new WeakReference<>(imageView);
        this.gm = daxVar;
    }

    private gm(ImageView imageView) {
        this.pcc = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(vh vhVar) {
        final ImageView imageView = this.pcc.get();
        if (imageView != null) {
            final Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                if (rnn.wh()) {
                    imageView.setImageBitmap((Bitmap) sf);
                } else {
                    jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ork.gm.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) sf);
                        }
                    });
                }
                dax daxVar = this.gm;
                if (daxVar != null) {
                    daxVar.pcc(vhVar);
                    return;
                }
                return;
            }
            if (sf instanceof Drawable) {
                if (rnn.wh()) {
                    pcc(sf, imageView);
                } else {
                    jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ork.gm.2
                        @Override // java.lang.Runnable
                        public void run() {
                            gm.this.pcc(sf, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && (obj instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.vj.dax
    public void pcc(int i, String str, Throwable th) {
        dax daxVar = this.gm;
        if (daxVar != null) {
            daxVar.pcc(i, str, th);
        }
    }
}
