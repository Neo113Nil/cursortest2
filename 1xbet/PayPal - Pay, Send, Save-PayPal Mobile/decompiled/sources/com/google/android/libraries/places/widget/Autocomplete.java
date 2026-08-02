package com.google.android.libraries.places.widget;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class Autocomplete {
    public static com.google.android.libraries.places.api.model.Place getPlaceFromIntent(android.content.Intent intent) {
        return com.google.android.libraries.places.internal.zznt.zza(intent);
    }

    public static com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent intent) {
        return com.google.android.libraries.places.internal.zznt.zzb(intent);
    }

    @java.lang.Deprecated
    public static class IntentBuilder {
        private final com.google.android.libraries.places.internal.zznp zza;

        public IntentBuilder(com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
            this.zza = com.google.android.libraries.places.internal.zznq.zzs(autocompleteActivityMode, list, com.google.android.libraries.places.internal.zzor.INTENT);
        }

        public android.content.Intent build(android.content.Context context) {
            try {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.libraries.places.widget.AutocompleteActivity.class);
                com.google.android.libraries.places.internal.zznp zznpVar = this.zza;
                android.content.res.Resources.Theme theme = context.getTheme();
                android.util.TypedValue typedValue = new android.util.TypedValue();
                if (theme.resolveAttribute(android.R.attr.colorPrimary, typedValue, true)) {
                    zznpVar.zzl(typedValue.data);
                }
                android.util.TypedValue typedValue2 = new android.util.TypedValue();
                if (theme.resolveAttribute(android.R.attr.colorPrimaryDark, typedValue2, true)) {
                    zznpVar.zzm(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", zznpVar.zzr());
                return intent;
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setCountries(java.util.List<java.lang.String> list) {
            this.zza.zzj(list);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setHint(java.lang.String str) {
            this.zza.zzg(str);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setInitialQuery(java.lang.String str) {
            this.zza.zzf(str);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias) {
            this.zza.zzh(locationBias);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
            this.zza.zzi(locationRestriction);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setRegionCode(java.lang.String str) {
            this.zza.zzn(str);
            return this;
        }

        public com.google.android.libraries.places.widget.Autocomplete.IntentBuilder setTypesFilter(java.util.List<java.lang.String> list) {
            this.zza.zzk(list);
            return this;
        }

        public IntentBuilder(com.google.android.libraries.places.internal.zznq zznqVar) {
            this.zza = zznqVar.zzr();
        }
    }

    private Autocomplete() {
    }
}
