package com.google.android.libraries.places.widget;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class AutocompleteActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.libraries.places.widget.listener.PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    private int zza;
    private int zzb;
    private boolean zzc;

    public AutocompleteActivity() {
        super(com.google.android.libraries.places.R.layout.places_autocomplete_activity);
        this.zzc = false;
    }

    private final void zzc(int i, com.google.android.libraries.places.api.model.Place place, com.google.android.gms.common.api.Status status) {
        try {
            android.content.Intent intent = new android.content.Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i, intent);
            finish();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        try {
            com.google.common.base.Preconditions.checkState(com.google.android.libraries.places.api.Places.isInitialized(), "Places must be initialized.");
            com.google.common.base.Preconditions.checkState(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            com.google.android.libraries.places.internal.zznq zzd = com.google.android.libraries.places.internal.zznt.zzd(getIntent());
            int ordinal = zzd.zzb().ordinal();
            if (ordinal == 0) {
                this.zza = com.google.android.libraries.places.R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzb = com.google.android.libraries.places.R.style.PlacesAutocompleteFullscreen;
            } else if (ordinal == 1) {
                this.zza = com.google.android.libraries.places.R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzb = com.google.android.libraries.places.R.style.PlacesAutocompleteOverlay;
            }
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i = this.zza;
            com.google.android.libraries.places.internal.zzps zza = com.google.android.libraries.places.internal.zzpr.zza();
            zza.zzc(this);
            zza.zzb(com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET);
            supportFragmentManager.setFragmentFactory(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzj(i, zza.zza(), zzd));
            setTheme(this.zzb);
            super.onCreate(bundle);
            final com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment = (com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment) getSupportFragmentManager().findFragmentById(com.google.android.libraries.places.R.id.places_autocomplete_content);
            com.google.common.base.Preconditions.checkState(autocompleteImplFragment != null);
            autocompleteImplFragment.zza(this);
            final android.view.View findViewById = findViewById(android.R.id.content);
            findViewById.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnTouchListener
                public final /* synthetic */ boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return com.google.android.libraries.places.widget.AutocompleteActivity.this.zza(autocompleteImplFragment, findViewById, view, motionEvent);
                }
            });
            findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.widget.AutocompleteActivity.this.zzb(view);
                }
            });
            if (zzd.zzc().isEmpty()) {
                zzc(2, null, new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(com.google.android.gms.common.api.Status status) {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(com.google.android.libraries.places.api.model.Place place) {
        zzc(-1, place, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }

    final /* synthetic */ boolean zza(com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment autocompleteImplFragment, android.view.View view, android.view.View view2, android.view.MotionEvent motionEvent) {
        this.zzc = false;
        if (autocompleteImplFragment.getView() == null || motionEvent.getY() <= r1.getBottom()) {
            return false;
        }
        this.zzc = true;
        view.performClick();
        return true;
    }

    final /* synthetic */ void zzb(android.view.View view) {
        if (this.zzc) {
            zzc(0, null, new com.google.android.gms.common.api.Status(16));
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
