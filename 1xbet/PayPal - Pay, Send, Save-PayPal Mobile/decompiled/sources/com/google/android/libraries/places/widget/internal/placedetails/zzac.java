package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzac extends android.text.style.ClickableSpan {
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzad zza;
    final /* synthetic */ com.google.android.libraries.places.api.model.Place zzb;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzo zzc;

    zzac(com.google.android.libraries.places.widget.internal.placedetails.zzad zzadVar, com.google.android.libraries.places.api.model.Place place, com.google.android.libraries.places.widget.internal.placedetails.zzo zzoVar) {
        this.zza = zzadVar;
        this.zzb = place;
        this.zzc = zzoVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.content.Intent zzi;
        android.content.Context context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzad zzadVar = this.zza;
        zzi = com.google.android.libraries.places.widget.internal.placedetails.zzad.zzi(this.zzb);
        zzadVar.zzh(zzi);
        com.google.android.libraries.places.widget.internal.placedetails.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            context = zzadVar.zzb;
            zzoVar.zzf(context);
        }
    }
}
