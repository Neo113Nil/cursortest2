package com.inmobi.media;

/* renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2607n5 extends android.widget.ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final byte f5350a;
    public final com.inmobi.media.InterfaceC2772t9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2607n5(android.content.Context context, byte b, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5350a = b;
        this.b = interfaceC2772t9;
        int i = b == 0 ? 15 : (b == 2 || b == 3 || b == 4 || b == 5 || b == 6) ? 30 : 0;
        try {
            java.lang.Integer a2 = a(b);
            if (a2 == null) {
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b("CustomView", "null drawable id while creating button - " + ((int) b));
                    return;
                }
                return;
            }
            a(a2.intValue(), i, i, i, i);
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("CustomView", "new customView - " + ((int) b) + " created");
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("CustomView", "exception while building customView", e);
            }
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    public static java.lang.Integer a(byte b) {
        if (b == 0) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_close_button);
        }
        if (b == 1) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_close_transparent);
        }
        if (b == 2) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_close_icon);
        }
        if (b == 3) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_refresh);
        }
        if (b == 4) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_back);
        }
        if (b == 5) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_forward_active);
        }
        if (b == 6) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_forward_inactive);
        }
        if (b == 9) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_mute);
        }
        if (b == 10) {
            return java.lang.Integer.valueOf(com.inmobi.ads.R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i, final int i2, final int i3, final int i4, final int i5) {
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.y()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2581m5(this, i, i2, i3, i4, i5, null), 3, null);
        } else {
            android.graphics.drawable.Icon.createWithResource(getContext(), i).loadDrawableAsync(getContext(), new android.graphics.drawable.Icon.OnDrawableLoadedListener() { // from class: com.inmobi.media.n5$$ExternalSyntheticLambda0
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(android.graphics.drawable.Drawable drawable) {
                    com.inmobi.media.C2607n5.a(com.inmobi.media.C2607n5.this, i2, i3, i4, i5, drawable);
                }
            }, ((com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue()).f5177a);
        }
    }

    public static final void a(com.inmobi.media.C2607n5 c2607n5, int i, int i2, int i3, int i4, android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2607n5.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("CustomView", "drawable for " + ((int) c2607n5.f5350a) + " is null");
                return;
            }
            return;
        }
        c2607n5.setImageDrawable(drawable);
        c2607n5.setPadding(i, i2, i3, i4);
    }

    public final void a(final android.graphics.drawable.Drawable drawable, final int i, final int i2, final int i3, final int i4) {
        post(new java.lang.Runnable() { // from class: com.inmobi.media.n5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2607n5.a(com.inmobi.media.C2607n5.this, drawable, i, i2, i3, i4);
            }
        });
    }

    public static final void a(com.inmobi.media.C2607n5 c2607n5, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        c2607n5.setImageDrawable(drawable);
        c2607n5.setPadding(i, i2, i3, i4);
    }
}
