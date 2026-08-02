package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbs {
    private final android.content.Context zza;

    private static java.lang.String zzb(java.util.Locale locale) {
        return java.lang.String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(java.lang.String.valueOf(locale.getCountry())));
    }

    public final java.util.List zza() {
        android.os.LocaleList locales = this.zza.getResources().getConfiguration().getLocales();
        java.util.ArrayList arrayList = new java.util.ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(zzb(locales.get(i)));
        }
        return arrayList;
    }

    public zzbs(android.content.Context context) {
        this.zza = context;
    }
}
