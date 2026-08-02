package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzb extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.photoviewer.PageSelectionIndicator zza;

    zzb(com.google.android.libraries.places.widget.internal.photoviewer.PageSelectionIndicator pageSelectionIndicator) {
        this.zza = pageSelectionIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        this.zza.zza(i);
    }
}
