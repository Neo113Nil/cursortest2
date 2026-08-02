package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
public final class zzax extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    final /* synthetic */ com.google.android.libraries.places.widget.PlaceSearchFragment zza;

    zzax(com.google.android.libraries.places.widget.PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        com.google.android.libraries.places.widget.model.Orientation orientation;
        android.view.View findViewById;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onScrolled(recyclerView, i, i2);
        if (!recyclerView.canScrollVertically(1)) {
            android.view.View findViewById2 = this.zza.requireView().findViewById(com.google.android.libraries.places.R.id.place_search_border_bottom);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        com.google.android.libraries.places.widget.PlaceSearchFragment placeSearchFragment = this.zza;
        orientation = placeSearchFragment.zzk;
        if (orientation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            orientation = null;
        }
        if (orientation == com.google.android.libraries.places.widget.model.Orientation.VERTICAL && placeSearchFragment.getZzp() == com.google.android.libraries.places.widget.model.AttributionPosition.BOTTOM && (findViewById = placeSearchFragment.requireView().findViewById(com.google.android.libraries.places.R.id.place_search_border_bottom)) != null) {
            findViewById.setVisibility(0);
        }
    }
}
