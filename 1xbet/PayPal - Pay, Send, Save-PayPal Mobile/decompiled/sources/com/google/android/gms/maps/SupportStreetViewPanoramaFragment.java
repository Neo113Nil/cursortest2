package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public class SupportStreetViewPanoramaFragment extends androidx.fragment.app.Fragment {
    private final com.google.android.gms.maps.zzba zza = new com.google.android.gms.maps.zzba(this);

    public static com.google.android.gms.maps.SupportStreetViewPanoramaFragment newInstance() {
        return new com.google.android.gms.maps.SupportStreetViewPanoramaFragment();
    }

    public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null.");
        this.zza.zzb(onStreetViewPanoramaReadyCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        com.google.android.gms.maps.zzba.zza(this.zza, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zza.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.zza.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.zza.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.zza.onDestroyView();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            com.google.android.gms.maps.zzba zzbaVar = this.zza;
            com.google.android.gms.maps.zzba.zza(zzbaVar, activity);
            zzbaVar.onInflate(activity, new android.os.Bundle(), bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.zza.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.zza.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.zza.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.zza.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public static com.google.android.gms.maps.SupportStreetViewPanoramaFragment newInstance(com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        com.google.android.gms.maps.SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new com.google.android.gms.maps.SupportStreetViewPanoramaFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }
}
