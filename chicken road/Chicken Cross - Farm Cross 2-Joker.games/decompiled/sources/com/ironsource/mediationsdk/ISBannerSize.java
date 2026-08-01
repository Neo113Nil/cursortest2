package com.ironsource.mediationsdk;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.R7;
import com.unity3d.mediation.LevelPlayAdSize;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f8364a;
    private final int b;
    private final String c;
    private boolean d;
    R7 e;
    public static final ISBannerSize BANNER = j.a(j.f8411a, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = j.a(j.b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = j.a(j.c, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    protected static final ISBannerSize f = j.a();
    public static final ISBannerSize SMART = j.a(j.e, 0, 0);

    public ISBannerSize(int i, int i2) {
        this(j.f, i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return j.b(i);
    }

    void a(R7 r7) {
        if (j.a(r7, this.f8364a, this.b)) {
            this.e = r7;
        }
    }

    public String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.f8364a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals(j.e);
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.e.d()));
        }
        String description = getDescription();
        description.hashCode();
        description.hashCode();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f8364a, this.b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i, int i2) {
        this.c = str;
        this.f8364a = i;
        this.b = i2;
        this.e = new R7(i, i2);
    }
}
