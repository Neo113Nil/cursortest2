package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
public final class zzai extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    final /* synthetic */ com.google.android.libraries.places.widget.PlaceDetailsFragment zza;

    zzai(com.google.android.libraries.places.widget.PlaceDetailsFragment placeDetailsFragment) {
        this.zza = placeDetailsFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.zza.zzC();
    }
}
