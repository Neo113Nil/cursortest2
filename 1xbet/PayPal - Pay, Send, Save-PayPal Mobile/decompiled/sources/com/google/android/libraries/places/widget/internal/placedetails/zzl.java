package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzl extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final java.util.List zza;

    public zzl(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        com.google.android.libraries.places.widget.internal.placedetails.zzi zziVar = (com.google.android.libraries.places.widget.internal.placedetails.zzi) this.zza.get(i);
        if (zziVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzh) {
            return 0;
        }
        if (zziVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzg) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "");
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            android.widget.TextView zza = ((com.google.android.libraries.places.widget.internal.placedetails.zzk) viewHolder).zza();
            java.lang.Object obj = this.zza.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            zza.setText(((com.google.android.libraries.places.widget.internal.placedetails.zzh) obj).zza());
            return;
        }
        if (itemViewType != 1) {
            return;
        }
        android.widget.TextView zza2 = ((com.google.android.libraries.places.widget.internal.placedetails.zzj) viewHolder).zza();
        java.lang.Object obj2 = this.zza.get(i);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        zza2.setText(((com.google.android.libraries.places.widget.internal.placedetails.zzg) obj2).zza());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            android.view.View inflate = from.inflate(com.google.android.libraries.places.R.layout.about_tab_section_title, viewGroup, false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
            return new com.google.android.libraries.places.widget.internal.placedetails.zzk(inflate);
        }
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("Invalid view type");
        }
        android.view.View inflate2 = from.inflate(com.google.android.libraries.places.R.layout.about_tab_feature, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate2);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzj(inflate2);
    }

    public final boolean zza(int i) {
        if (i < 0) {
            return false;
        }
        java.util.List list = this.zza;
        if (i < list.size() - 1) {
            return list.get(i + 1) instanceof com.google.android.libraries.places.widget.internal.placedetails.zzh;
        }
        return false;
    }
}
