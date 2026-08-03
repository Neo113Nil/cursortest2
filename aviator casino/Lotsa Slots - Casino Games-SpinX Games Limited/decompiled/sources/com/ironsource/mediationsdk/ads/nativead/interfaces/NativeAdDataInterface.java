package com.ironsource.mediationsdk.ads.nativead.interfaces;

/* loaded from: classes5.dex */
public interface NativeAdDataInterface {

    public static class Image {

        /* renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Drawable f6402a;
        private final android.net.Uri b;

        public Image(android.graphics.drawable.Drawable drawable, android.net.Uri uri) {
            this.f6402a = drawable;
            this.b = uri;
        }

        public final android.graphics.drawable.Drawable getDrawable() {
            return this.f6402a;
        }

        public final android.net.Uri getUri() {
            return this.b;
        }
    }

    java.lang.String getAdvertiser();

    java.lang.String getBody();

    java.lang.String getCallToAction();

    com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon();

    java.lang.String getTitle();
}
