package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzlp {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private java.util.Locale zzc = null;
    private java.util.Map zzd = new java.util.HashMap();

    zzlp(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str2), "API key cannot be empty.");
        this.zzb = str2;
    }

    final com.google.android.libraries.places.internal.zzlp zzb(java.util.Map map) {
        this.zzd = new java.util.HashMap(map);
        return this;
    }

    public final java.lang.String zzc() {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule.GOOGLE_MAPS_BASE_URL).buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(this.zza);
        buildUpon.appendQueryParameter("key", this.zzb);
        java.util.Locale locale = this.zzc;
        if (locale != null) {
            java.lang.String languageTag = locale.toLanguageTag();
            if (!android.text.TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, languageTag);
            }
        }
        java.util.Map map = this.zzd;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    final com.google.android.libraries.places.internal.zzlp zza(java.util.Locale locale) {
        this.zzc = locale;
        return this;
    }
}
