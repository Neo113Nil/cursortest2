package com.google.android.libraries.places.widget;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocomplete;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "getPredictionFromIntent", "(Landroid/content/Intent;)Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getSessionTokenFromIntent", "(Landroid/content/Intent;)Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "Lcom/google/android/gms/common/api/Status;", "getResultStatusFromIntent", "(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/widget/PlaceAutocomplete$IntentBuilder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "createIntent", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "IntentBuilder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaceAutocomplete {
    public static final com.google.android.libraries.places.widget.PlaceAutocomplete INSTANCE = new com.google.android.libraries.places.widget.PlaceAutocomplete();

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011H\u0007J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocomplete$IntentBuilder;", "", "<init>", "()V", "optionsBuilder", "Lcom/google/android/libraries/places/widget/internal/autocomplete/common/AutocompleteOptions$Builder;", "setInitialQuery", "initialQuery", "", "setLocationBias", "locationBias", "Lcom/google/android/libraries/places/api/model/LocationBias;", "setLocationRestriction", "locationRestriction", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "setCountries", "countries", "", "setTypesFilter", "typesFilter", "setRegionCode", "regionCode", "setAutocompleteUiCustomization", "autocompleteUiCustomization", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "setOrigin", "origin", "Lcom/google/android/gms/maps/model/LatLng;", "setPureServiceAreaBusinessesIncluded", "isPureServiceAreaBusinessesIncluded", "", "setAutocompleteSessionToken", "autocompleteSessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "build", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IntentBuilder {
        private final com.google.android.libraries.places.internal.zznp zza;

        public IntentBuilder() {
            com.google.android.libraries.places.internal.zznp zzt = com.google.android.libraries.places.internal.zznq.zzt(com.google.android.libraries.places.internal.zzow.ONE_PLATFORM);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzt, "");
            this.zza = zzt;
        }

        public final android.content.Intent build(android.content.Context context) {
            try {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.libraries.places.widget.PlaceAutocompleteActivity.class);
                intent.putExtra("places/AutocompleteOptions", this.zza.zzr());
                return intent;
            } catch (java.lang.Error e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            } catch (java.lang.RuntimeException e2) {
                com.google.android.libraries.places.internal.zznb.zzb(e2);
                throw e2;
            }
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setAutocompleteSessionToken(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
            this.zza.zzq(autocompleteSessionToken);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setAutocompleteUiCustomization(com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization) {
            this.zza.zzo(autocompleteUiCustomization);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setCountries(java.util.List<java.lang.String> countries) {
            this.zza.zzj(countries);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setInitialQuery(java.lang.String initialQuery) {
            this.zza.zzf(initialQuery);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias) {
            this.zza.zzh(locationBias);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
            this.zza.zzi(locationRestriction);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setOrigin(com.google.android.gms.maps.model.LatLng origin) {
            this.zza.zze(origin);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setPureServiceAreaBusinessesIncluded(boolean isPureServiceAreaBusinessesIncluded) {
            this.zza.zzp(isPureServiceAreaBusinessesIncluded);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setRegionCode(java.lang.String regionCode) {
            this.zza.zzn(regionCode);
            return this;
        }

        public final com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder setTypesFilter(java.util.List<java.lang.String> typesFilter) {
            this.zza.zzk(typesFilter);
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ android.content.Intent createIntent$default(com.google.android.libraries.places.widget.PlaceAutocomplete placeAutocomplete, android.content.Context context, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return placeAutocomplete.createIntent(context, function1);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.api.model.AutocompletePrediction getPredictionFromIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return (com.google.android.libraries.places.api.model.AutocompletePrediction) intent.getParcelableExtra("places/selected_prediction");
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.common.api.Status getResultStatusFromIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return com.google.android.libraries.places.internal.zznt.zzc(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionTokenFromIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return (com.google.android.libraries.places.api.model.AutocompleteSessionToken) intent.getParcelableExtra("places/session_token");
    }

    public final android.content.Intent createIntent(android.content.Context context, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder, kotlin.Unit> actions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder intentBuilder = new com.google.android.libraries.places.widget.PlaceAutocomplete.IntentBuilder();
        if (actions != null) {
            actions.invoke(intentBuilder);
        }
        return intentBuilder.build(context);
    }

    private PlaceAutocomplete() {
    }
}
