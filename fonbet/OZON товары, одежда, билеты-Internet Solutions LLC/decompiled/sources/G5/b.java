package G5;

import B5.s;
import O5.c;
import O5.g;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f9721d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f9722a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9723b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, s> f9724c;

    public b(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f9723b = str;
        } else {
            this.f9723b = str.concat("/");
        }
        this.f9724c = map;
        if (callback instanceof View) {
            this.f9722a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f9722a = null;
        }
    }

    private void c(Bitmap bitmap, String str) {
        synchronized (f9721d) {
            this.f9724c.get(str).f(bitmap);
        }
    }

    public final Bitmap a(String str) {
        String str2 = this.f9723b;
        s sVar = this.f9724c.get(str);
        if (sVar != null) {
            Bitmap a11 = sVar.a();
            if (a11 != null) {
                return a11;
            }
            Context context = this.f9722a;
            if (context != null) {
                String b11 = sVar.b();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (b11.startsWith("data:") && b11.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(b11.substring(b11.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        c(decodeByteArray, str);
                        return decodeByteArray;
                    } catch (IllegalArgumentException e11) {
                        c.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
                try {
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + b11), null, options);
                        if (decodeStream != null) {
                            Bitmap f7 = g.f(sVar.e(), sVar.c(), decodeStream);
                            c(f7, str);
                            return f7;
                        }
                        c.c("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e12) {
                        c.d("Unable to decode image `" + str + "`.", e12);
                        return null;
                    }
                } catch (IOException e13) {
                    c.d("Unable to open asset.", e13);
                    return null;
                }
            }
        }
        return null;
    }

    public final boolean b(Context context) {
        Context context2 = this.f9722a;
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == context2;
    }
}
