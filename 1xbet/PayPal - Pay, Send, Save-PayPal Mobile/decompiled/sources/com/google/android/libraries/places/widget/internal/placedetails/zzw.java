package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzw extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final java.util.List zza;

    public zzw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        com.google.android.libraries.places.widget.internal.placedetails.zzv zzvVar = (com.google.android.libraries.places.widget.internal.placedetails.zzv) viewHolder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzvVar, "");
        zzvVar.zza().setText((java.lang.CharSequence) this.zza.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.expanded_open_hours_item, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzv(inflate);
    }
}
