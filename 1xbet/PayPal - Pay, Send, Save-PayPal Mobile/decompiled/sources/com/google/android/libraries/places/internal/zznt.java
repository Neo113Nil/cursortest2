package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zznt {
    public static com.google.android.libraries.places.api.model.Place zza(android.content.Intent intent) {
        try {
            com.google.common.base.Preconditions.checkNotNull(intent, "Intent must not be null.");
            com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) intent.getParcelableExtra("places/selected_place");
            com.google.common.base.Preconditions.checkNotNull(place, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static com.google.android.gms.common.api.Status zzb(android.content.Intent intent) {
        try {
            com.google.common.base.Preconditions.checkNotNull(intent, "Intent must not be null.");
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) intent.getParcelableExtra("places/status");
            com.google.common.base.Preconditions.checkNotNull(status, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static com.google.android.gms.common.api.Status zzc(android.content.Intent intent) {
        return (com.google.android.gms.common.api.Status) intent.getParcelableExtra("places/status");
    }

    public static com.google.android.libraries.places.internal.zznq zzd(android.content.Intent intent) {
        return (com.google.android.libraries.places.internal.zznq) com.google.common.base.Preconditions.checkNotNull((com.google.android.libraries.places.internal.zznq) intent.getParcelableExtra("places/AutocompleteOptions"));
    }

    public static java.lang.String zze(android.content.Context context, int i) {
        java.lang.Object obj = androidx.core.os.ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
        if (obj == null) {
            obj = java.util.Locale.getDefault();
        }
        java.util.Locale zzf = com.google.android.libraries.places.api.Places.isInitialized() ? com.google.android.libraries.places.api.Places.zzc().zzf() : obj;
        if (zzf.equals(obj)) {
            return context.getString(i);
        }
        androidx.core.os.LocaleListCompat forLanguageTags = androidx.core.os.LocaleListCompat.forLanguageTags(zzf.toLanguageTag());
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        androidx.core.os.ConfigurationCompat.setLocales(configuration, forLanguageTags);
        return context.createConfigurationContext(configuration).getString(i);
    }
}
