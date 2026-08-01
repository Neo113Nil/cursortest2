package sg.bigo.ads.L0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public final class C extends ImageView {
    public C(String str, Context context) {
        super(context);
        try {
            if (I.a((CharSequence) str)) {
                return;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray == null) {
                return;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeByteArray);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
            setBackground(bitmapDrawable);
            setClickable(false);
            setFocusable(false);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, ViewGroup viewGroup, C c) {
        KeyEvent.Callback callback = viewGroup;
        if (c == null || context == null) {
            return;
        }
        if (viewGroup == null) {
            callback = X.a(context, (View) null);
        }
        if (callback instanceof ViewGroup) {
            X.a(c, (ViewGroup) callback, new ViewGroup.LayoutParams(-1, -1), -1);
            c.bringToFront();
        }
    }
}
