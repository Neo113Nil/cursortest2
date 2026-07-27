package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.j2;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* loaded from: classes5.dex */
public class a extends n5 {
    private final AppLovinNativeAdImpl g;
    private final InterfaceC0084a h;
    private final String i;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0084a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, InterfaceC0084a interfaceC0084a) {
        super("TaskCacheNativeAd", lVar);
        this.i = UUID.randomUUID().toString();
        this.g = appLovinNativeAdImpl;
        this.h = interfaceC0084a;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i;
        int i2;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } finally {
            }
        } catch (IOException e) {
            if (p.a()) {
                this.c.a(this.b, "Failed to calculate aspect ratio", e);
            }
        }
        if (i <= 0 || i2 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f = i / i2;
        fileInputStream.close();
        return f;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (p.a()) {
            this.c.a(this.b, "Attempting to cache resource: " + uri);
        }
        String a2 = this.f4351a.I().a(a(), uri.toString(), this.g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.i, j2.a(this.g));
        if (TextUtils.isEmpty(a2)) {
            if (p.a()) {
                this.c.b(this.b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File a3 = this.f4351a.I().a(a2, a());
        if (a3 == null) {
            if (p.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached image filename = " + a2);
            }
            return null;
        }
        Uri fromFile = Uri.fromFile(a3);
        if (fromFile != null) {
            return fromFile;
        }
        if (p.a()) {
            this.c.b(this.b, "Unable to extract Uri from image file");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (p.a()) {
            this.c.a(this.b, "Begin caching ad #" + this.g.getAdIdNumber() + "...");
        }
        Uri b = b(this.g.getIconUri());
        if (b != null) {
            this.g.setIconUri(b);
        }
        Uri b2 = b(this.g.getMainImageUri());
        if (b2 != null) {
            this.g.setMainImageUri(b2);
            float a2 = a(b2);
            if (a2 > 0.0f) {
                this.g.setMainImageAspectRatio(a2);
            }
        }
        Uri b3 = b(this.g.getPrivacyIconUri());
        if (b3 != null) {
            this.g.setPrivacyIconUri(b3);
        }
        if (p.a()) {
            this.c.a(this.b, "Finished caching ad #" + this.g.getAdIdNumber());
        }
        this.h.a(this.g);
    }
}
