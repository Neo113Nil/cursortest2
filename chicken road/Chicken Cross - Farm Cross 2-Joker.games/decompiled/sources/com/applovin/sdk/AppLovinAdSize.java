package com.applovin.sdk;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.j;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f4599a;
    private final int b;
    private final int c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, j.f8411a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.f4599a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (j.f8411a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.c;
    }

    public String getLabel() {
        return this.f4599a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.b;
    }

    public String toString() {
        return getLabel();
    }
}
