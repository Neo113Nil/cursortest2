package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzah extends androidx.recyclerview.widget.ListAdapter {
    private final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai zza;
    private int zzb;
    private boolean zzc;

    public zzah(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai zzaiVar) {
        super(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzag(null));
        this.zzc = true;
        this.zza = zzaiVar;
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public final void submitList(java.util.List list) {
        try {
            this.zzc = (this.zzb != 0 || list == null || list.isEmpty()) ? false : true;
            this.zzb = list != null ? list.size() : 0;
            super.submitList(list);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        try {
            return new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak(this.zza, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak zzakVar, int i) {
        try {
            zzakVar.zza((com.google.android.libraries.places.api.model.AutocompletePrediction) getItem(i), this.zzc);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }
}
