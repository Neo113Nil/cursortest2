package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public class zzni extends androidx.appcompat.app.AppCompatActivity {
    public com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment zza;
    private int zzb;
    private int zzc;

    public zzni() {
        super(com.google.android.libraries.places.R.layout.autocomplete_activity);
        this.zzc = com.google.android.libraries.places.R.style.PlacesMaterialTheme;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer zze;
        try {
            com.google.common.base.Preconditions.checkState(com.google.android.libraries.places.api.Places.isInitialized(), "Places must be initialized.");
            boolean z = true;
            com.google.common.base.Preconditions.checkState(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            com.google.android.libraries.places.internal.zznq zzd = com.google.android.libraries.places.internal.zznt.zzd(getIntent());
            com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo = zzd.zzo();
            if (zzo != null && (zze = zzo.getZze()) != null) {
                this.zzc = zze.intValue();
            }
            this.zzb = com.google.android.libraries.places.R.layout.autocomplete_fullscreen;
            setTheme(this.zzc);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i = this.zzb;
            com.google.android.libraries.places.internal.zzps zza = com.google.android.libraries.places.internal.zzpr.zza();
            zza.zzc(this);
            zza.zzb(zzd.zza() == com.google.android.libraries.places.internal.zzow.JWT_AND_ONE_PLATFORM ? com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT : com.google.android.libraries.places.internal.zzmy.ONE_PLATFORM_AUTOCOMPLETE_WIDGET);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzab(i, zza.zza(), zzd, this.zzc));
            super.onCreate(bundle);
            com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = (com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment) getSupportFragmentManager().findFragmentById(com.google.android.libraries.places.R.id.autocomplete_content);
            this.zza = baseAutocompleteImplFragment;
            if (baseAutocompleteImplFragment == null) {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zza(int i, com.google.android.libraries.places.api.model.Place place, com.google.android.gms.common.api.Status status) {
        try {
            android.content.Intent intent = new android.content.Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.zza();
            }
            finish();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zzb(int i, com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, com.google.android.gms.common.api.Status status) {
        try {
            android.content.Intent intent = new android.content.Intent();
            if (autocompletePrediction != null && autocompleteSessionToken != null) {
                intent.putExtra("places/selected_prediction", autocompletePrediction);
                intent.putExtra("places/session_token", autocompleteSessionToken);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
            if (baseAutocompleteImplFragment != null) {
                baseAutocompleteImplFragment.zza();
            }
            finish();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zzc(int i, com.google.android.gms.common.api.Status status) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("places/status", status);
            setResult(i, intent);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
