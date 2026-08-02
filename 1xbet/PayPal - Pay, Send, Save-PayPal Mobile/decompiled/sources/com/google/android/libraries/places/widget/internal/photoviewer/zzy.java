package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzy extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity zza;

    zzy(com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity placesLightboxActivity) {
        this.zza = placesLightboxActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        int i2;
        int i3;
        com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity placesLightboxActivity = this.zza;
        placesLightboxActivity.zzj(i);
        i2 = placesLightboxActivity.zzh;
        if (i != i2) {
            i3 = placesLightboxActivity.zzg;
            placesLightboxActivity.zzg = i3 + 1;
            placesLightboxActivity.zzh = i;
        }
    }
}
