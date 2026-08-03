package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzz {
    private final com.google.android.gms.ads.AdSize[] zza;
    private final java.lang.String zzb;

    public zzz(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.ads.R.styleable.AdsAttrs);
        java.lang.String string = obtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSize);
        java.lang.String string2 = obtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adSizes);
        boolean z = !android.text.TextUtils.isEmpty(string);
        boolean z2 = !android.text.TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.zza = zzc(string);
        } else {
            if (z || !z2) {
                if (z) {
                    obtainAttributes.recycle();
                    throw new java.lang.IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                }
                obtainAttributes.recycle();
                throw new java.lang.IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            this.zza = zzc(string2);
        }
        java.lang.String string3 = obtainAttributes.getString(com.google.android.gms.ads.R.styleable.AdsAttrs_adUnitId);
        this.zzb = string3;
        obtainAttributes.recycle();
        if (android.text.TextUtils.isEmpty(string3)) {
            throw new java.lang.IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.AdSize[] zzc(java.lang.String str) {
        java.lang.String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        com.google.android.gms.ads.AdSize[] adSizeArr = new com.google.android.gms.ads.AdSize[length];
        for (int i = 0; i < split.length; i++) {
            java.lang.String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                java.lang.String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    java.lang.String str2 = split2[0];
                    int parseInt = "FULL_WIDTH".equals(str2) ? -1 : java.lang.Integer.parseInt(str2);
                    java.lang.String str3 = split2[1];
                    adSizeArr[i] = new com.google.android.gms.ads.AdSize(parseInt, "AUTO_HEIGHT".equals(str3) ? -2 : java.lang.Integer.parseInt(str3));
                } catch (java.lang.NumberFormatException unused) {
                    java.lang.String.valueOf(trim);
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(trim)));
                }
            } else if (com.ironsource.mediationsdk.j.f6439a.equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.FULL_BANNER;
            } else if (com.ironsource.mediationsdk.j.d.equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.LEADERBOARD;
            } else if (com.ironsource.mediationsdk.j.g.equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i] = com.google.android.gms.ads.AdSize.FLUID;
            } else {
                if (!com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.AD_ICON.equals(trim)) {
                    java.lang.String.valueOf(trim);
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(trim)));
                }
                adSizeArr[i] = com.google.android.gms.ads.AdSize.zza;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        java.lang.String.valueOf(str);
        throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(java.lang.String.valueOf(str)));
    }

    public final com.google.android.gms.ads.AdSize[] zza(boolean z) {
        if (z || this.zza.length == 1) {
            return this.zza;
        }
        throw new java.lang.IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }
}
