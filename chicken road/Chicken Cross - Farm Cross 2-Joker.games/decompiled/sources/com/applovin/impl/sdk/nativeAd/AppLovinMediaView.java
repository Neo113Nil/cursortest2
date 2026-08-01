package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.c5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.u7;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final p logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final l sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, Context context) {
        super(context);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = lVar;
        this.logger = lVar.Q();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        u7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri n0 = vastAd != null ? vastAd.n0() : null;
        if (mainImageUri == null && n0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) lVar.a(c5.N2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(lVar, c5.g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
