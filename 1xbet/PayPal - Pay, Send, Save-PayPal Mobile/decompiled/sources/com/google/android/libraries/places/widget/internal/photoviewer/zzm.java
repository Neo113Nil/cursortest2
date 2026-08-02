package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzm extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private java.util.List zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(androidx.fragment.app.FragmentManager fragmentManager, androidx.view.Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        this.zza = kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final androidx.fragment.app.Fragment createFragment(int i) {
        com.google.android.libraries.places.widget.internal.photoviewer.zzd zzdVar = (com.google.android.libraries.places.widget.internal.photoviewer.zzd) this.zza.get(i);
        int size = this.zza.size();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzdVar, "");
        com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar = new com.google.android.libraries.places.widget.internal.photoviewer.zzl();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("page_data", zzdVar);
        bundle.putBoolean("has_previous", i > 0);
        bundle.putBoolean("has_next", i < size - 1);
        zzlVar.setArguments(bundle);
        return zzlVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    public final void zza(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }
}
