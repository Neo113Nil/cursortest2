package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public abstract class NativeAd {
    public static final java.lang.String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    @java.lang.Deprecated
    public static abstract class AdChoicesInfo {
        public abstract java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages();

        public abstract java.lang.CharSequence getText();
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    @java.lang.Deprecated
    public static abstract class Image {
        public abstract android.graphics.drawable.Drawable getDrawable();

        public abstract double getScale();

        public abstract android.net.Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    @java.lang.Deprecated
    public abstract void performClick(android.os.Bundle bundle);

    @java.lang.Deprecated
    public abstract boolean recordImpression(android.os.Bundle bundle);

    @java.lang.Deprecated
    public abstract void reportTouchEvent(android.os.Bundle bundle);
}
