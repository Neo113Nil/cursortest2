package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public class SupportMapFragment extends androidx.fragment.app.Fragment {
    private final com.google.android.gms.maps.zzax zza = new com.google.android.gms.maps.zzax(this);

    public static com.google.android.gms.maps.SupportMapFragment newInstance() {
        return new com.google.android.gms.maps.SupportMapFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.lang.String name2 = getClass().getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(name2);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        printWriter.println(sb.toString());
        com.google.android.gms.maps.zzax zzaxVar = this.zza;
        if (zzaxVar.getDelegate() != null) {
            str2 = ((com.google.android.gms.maps.zzaw) zzaxVar.getDelegate()).zza(java.lang.String.valueOf(str).concat("  "));
        } else {
            str2 = "delegate is null";
        }
        printWriter.println(str2);
    }

    public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zzb(onMapReadyCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        com.google.android.gms.maps.zzax.zza(this.zza, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.zza.onCreate(bundle);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View onCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
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

    public final void onEnterAmbient(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        com.google.android.gms.maps.zzax zzaxVar = this.zza;
        if (zzaxVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzaw) zzaxVar.getDelegate()).zzb(bundle);
        }
    }

    public final void onExitAmbient() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        com.google.android.gms.maps.zzax zzaxVar = this.zza;
        if (zzaxVar.getDelegate() != null) {
            ((com.google.android.gms.maps.zzaw) zzaxVar.getDelegate()).zzc();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            com.google.android.gms.maps.zzax zzaxVar = this.zza;
            com.google.android.gms.maps.zzax.zza(zzaxVar, activity);
            com.google.android.gms.maps.GoogleMapOptions createFromAttributes = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(activity, attributeSet);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            zzaxVar.onInflate(activity, bundle2, bundle);
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
        java.lang.ClassLoader classLoader = com.google.android.gms.maps.SupportMapFragment.class.getClassLoader();
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

    public static com.google.android.gms.maps.SupportMapFragment newInstance(com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        com.google.android.gms.maps.SupportMapFragment supportMapFragment = new com.google.android.gms.maps.SupportMapFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }
}
