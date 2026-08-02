package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzck extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final boolean zza;
    private final com.google.android.libraries.places.api.model.Place zzb;
    private final int zzc;
    private final java.util.List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzck(androidx.fragment.app.FragmentManager fragmentManager, androidx.view.Lifecycle lifecycle, android.content.Context context, boolean z, boolean z2, com.google.android.libraries.places.api.model.Place place, int i) {
        super(fragmentManager, lifecycle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        this.zza = z2;
        this.zzb = place;
        this.zzc = i;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzk(place, context, z2)) {
            createListBuilder.add(1);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        java.util.List<com.google.android.libraries.places.api.model.Review> reviews = place.getReviews();
        if (reviews != null && !reviews.isEmpty()) {
            createListBuilder.add(2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        if (z && (com.google.android.libraries.places.widget.internal.placedetails.zzcj.zza(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzb(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzc(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzd(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zze(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzf(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzg(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzh(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzi(place) || com.google.android.libraries.places.widget.internal.placedetails.zzcj.zzj(place))) {
            createListBuilder.add(3);
        }
        this.zzd = kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final androidx.fragment.app.Fragment createFragment(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            int i2 = this.zzc;
            boolean z = this.zza;
            com.google.android.libraries.places.widget.internal.placedetails.zzao zzaoVar = new com.google.android.libraries.places.widget.internal.placedetails.zzao();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("arg-theme-res-id", i2);
            bundle.putBoolean("arg-opening-hours-requested", z);
            zzaoVar.setArguments(bundle);
            return zzaoVar;
        }
        if (itemViewType == 2) {
            int i3 = this.zzc;
            com.google.android.libraries.places.widget.internal.placedetails.zzby zzbyVar = new com.google.android.libraries.places.widget.internal.placedetails.zzby();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("arg-theme-res-id", i3);
            zzbyVar.setArguments(bundle2);
            return zzbyVar;
        }
        if (itemViewType != 3) {
            throw new java.lang.IllegalStateException("Invalid tab type.");
        }
        int i4 = this.zzc;
        com.google.android.libraries.places.widget.internal.placedetails.zzf zzfVar = new com.google.android.libraries.places.widget.internal.placedetails.zzf();
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("arg-theme-res-id", i4);
        zzfVar.setArguments(bundle3);
        return zzfVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzd.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((java.lang.Number) this.zzd.get(i)).intValue();
    }
}
