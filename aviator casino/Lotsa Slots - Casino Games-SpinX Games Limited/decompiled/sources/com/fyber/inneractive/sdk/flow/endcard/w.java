package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class w extends com.fyber.inneractive.sdk.flow.endcard.a {
    public android.graphics.Bitmap c;
    public final android.widget.ImageView d;
    public final android.view.ViewGroup e;

    public w(com.fyber.inneractive.sdk.flow.endcard.v vVar) {
        super(vVar);
        android.widget.ImageView imageView = new android.widget.ImageView(com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a());
        imageView.setId(com.fyber.inneractive.sdk.R.id.ia_inneractive_vast_endcard_static);
        this.d = imageView;
        this.e = com.fyber.inneractive.sdk.flow.endcard.a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final android.view.View b() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        android.graphics.Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.c = null;
        this.d.setImageBitmap(null);
    }
}
