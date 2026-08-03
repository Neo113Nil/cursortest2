package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
class InMobiNativeMappedImage extends com.google.android.gms.ads.formats.NativeAd.Image {
    private final android.graphics.drawable.Drawable inMobiDrawable;
    private final android.net.Uri inMobiImageUri;
    private final double inMobiScale;

    public InMobiNativeMappedImage(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d) {
        this.inMobiDrawable = drawable;
        this.inMobiImageUri = uri;
        this.inMobiScale = d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public android.graphics.drawable.Drawable getDrawable() {
        return this.inMobiDrawable;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public android.net.Uri getUri() {
        return this.inMobiImageUri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.inMobiScale;
    }
}
