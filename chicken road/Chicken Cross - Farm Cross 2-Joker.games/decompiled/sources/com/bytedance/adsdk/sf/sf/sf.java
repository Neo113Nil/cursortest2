package com.bytedance.adsdk.sf.sf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.sf.oo;
import com.bytedance.adsdk.sf.ork;
import com.bytedance.adsdk.sf.wh.wh;
import java.io.IOException;
import java.util.Map;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes4.dex */
public class sf {
    private static final Object pcc = new Object();
    private final String gm;
    private oo oo;
    private final Context sf;
    private final Map<String, ork> vj;

    public sf(Drawable.Callback callback, String str, oo ooVar, Map<String, ork> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.gm = str + FileSystemKt.UnixPathSeparator;
        } else {
            this.gm = str;
        }
        this.vj = map;
        pcc(ooVar);
        if (!(callback instanceof View)) {
            this.sf = null;
        } else {
            this.sf = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void pcc(oo ooVar) {
        this.oo = ooVar;
    }

    public Bitmap pcc(String str, Bitmap bitmap) {
        if (bitmap == null) {
            ork orkVar = this.vj.get(str);
            Bitmap vh = orkVar.vh();
            orkVar.pcc(null);
            return vh;
        }
        Bitmap vh2 = this.vj.get(str).vh();
        sf(str, bitmap);
        return vh2;
    }

    public Bitmap pcc(String str) {
        ork orkVar = this.vj.get(str);
        if (orkVar == null) {
            return null;
        }
        Bitmap vh = orkVar.vh();
        if (vh != null) {
            return vh;
        }
        oo ooVar = this.oo;
        if (ooVar != null) {
            return ooVar.pcc(orkVar);
        }
        Context context = this.sf;
        if (context == null) {
            return null;
        }
        String vy = orkVar.vy();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (vy.startsWith("data:") && vy.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(vy.substring(vy.indexOf(44) + 1), 0);
                return sf(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.gm)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.gm + vy), null, options);
                if (decodeStream == null) {
                    return null;
                }
                return sf(str, wh.pcc(decodeStream, orkVar.pcc(), orkVar.sf()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean pcc(Context context) {
        return (context == null && this.sf == null) || this.sf.equals(context);
    }

    private Bitmap sf(String str, Bitmap bitmap) {
        synchronized (pcc) {
            this.vj.get(str).pcc(bitmap);
        }
        return bitmap;
    }
}
