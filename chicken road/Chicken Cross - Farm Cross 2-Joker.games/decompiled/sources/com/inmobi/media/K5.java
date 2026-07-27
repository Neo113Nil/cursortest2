package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class K5 extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final byte f6664a;
    public final Y9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(Context context, byte b, Y9 y9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6664a = b;
        this.b = y9;
        int i = b == 0 ? 15 : (b == 2 || b == 3 || b == 4 || b == 5 || b == 6) ? 30 : 0;
        try {
            Integer a2 = a(b);
            if (a2 == null) {
                if (y9 != null) {
                    ((Z9) y9).b("CustomView", "null drawable id while creating button - " + ((int) b));
                }
            } else {
                a(a2.intValue(), i, i, i, i);
                if (y9 != null) {
                    ((Z9) y9).c("CustomView", "new customView - " + ((int) b) + " created");
                }
            }
        } catch (Exception e) {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).a("CustomView", "exception while building customView", e);
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public static Integer a(byte b) {
        if (b == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i, final int i2, final int i3, final int i4, final int i5) {
        Y5.f6965a.getClass();
        if (!Y5.y()) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new J5(this, i, i2, i3, i4, i5, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: com.inmobi.media.K5$$ExternalSyntheticLambda1
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    K5.a(K5.this, i2, i3, i4, i5, drawable);
                }
            }, ((Wc) P6.e.getValue()).f6931a);
        }
    }

    public static final void a(K5 k5, int i, int i2, int i3, int i4, Drawable drawable) {
        if (drawable == null) {
            Y9 y9 = k5.b;
            if (y9 != null) {
                ((Z9) y9).b("CustomView", "drawable for " + ((int) k5.f6664a) + " is null");
                return;
            }
            return;
        }
        k5.setImageDrawable(drawable);
        k5.setPadding(i, i2, i3, i4);
    }

    public final void a(final Drawable drawable, final int i, final int i2, final int i3, final int i4) {
        post(new Runnable() { // from class: com.inmobi.media.K5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                K5.a(K5.this, drawable, i, i2, i3, i4);
            }
        });
    }

    public static final void a(K5 k5, Drawable drawable, int i, int i2, int i3, int i4) {
        k5.setImageDrawable(drawable);
        k5.setPadding(i, i2, i3, i4);
    }
}
