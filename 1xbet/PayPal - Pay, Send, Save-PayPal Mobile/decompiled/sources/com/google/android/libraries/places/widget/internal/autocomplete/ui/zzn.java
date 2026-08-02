package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzn extends androidx.recyclerview.widget.ListAdapter {
    private final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp zza;
    private int zzb;
    private boolean zzc;
    private final com.google.android.libraries.places.internal.zznq zzd;
    private final int zze;

    public zzn(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp zzpVar, com.google.android.libraries.places.internal.zznq zznqVar, int i) {
        super(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzm(null));
        this.zzc = true;
        this.zza = zzpVar;
        this.zzd = zznqVar;
        this.zze = i;
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
    public final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzq onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        try {
            return new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzq(this.zza, android.view.LayoutInflater.from(viewGroup.getContext()).cloneInContext(new android.view.ContextThemeWrapper(viewGroup.getContext(), this.zze)).inflate(com.google.android.libraries.places.R.layout.autocomplete_prediction_item, viewGroup, false), this.zzd);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzq zzqVar, int i) {
        try {
            zzqVar.zza((com.google.android.libraries.places.api.model.AutocompletePrediction) getItem(i), this.zzc);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }
}
