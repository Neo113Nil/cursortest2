package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
final class zzm extends androidx.recyclerview.widget.DiffUtil.ItemCallback {
    /* synthetic */ zzm(byte[] bArr) {
    }

    public static final boolean zza(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.getPlaceId().equals(autocompletePrediction2.getPlaceId());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.api.model.AutocompletePrediction) obj).equals((com.google.android.libraries.places.api.model.AutocompletePrediction) obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final /* synthetic */ boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
        return zza((com.google.android.libraries.places.api.model.AutocompletePrediction) obj, (com.google.android.libraries.places.api.model.AutocompletePrediction) obj2);
    }

    private zzm() {
        throw null;
    }
}
