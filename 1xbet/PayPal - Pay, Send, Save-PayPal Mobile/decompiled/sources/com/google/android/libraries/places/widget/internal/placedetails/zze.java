package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zze extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzl zza;

    zze(com.google.android.libraries.places.widget.internal.placedetails.zzl zzlVar) {
        this.zza = zzlVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return this.zza.getItemViewType(i) != 0 ? 1 : 2;
    }
}
