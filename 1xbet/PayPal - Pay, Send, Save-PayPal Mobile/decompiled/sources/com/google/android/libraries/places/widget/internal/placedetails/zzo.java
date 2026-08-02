package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.internal.placedetails.zzo> CREATOR = new com.google.android.libraries.places.widget.internal.placedetails.zzn();
    private final com.google.android.libraries.places.internal.zzaml zza;
    private final com.google.android.libraries.places.internal.zzamj zzb;
    private final java.util.List zzc;
    private final int zzd;
    private com.google.android.libraries.places.internal.zzpu zze;

    private final com.google.android.libraries.places.internal.zzamd zzl(android.content.Context context) {
        com.google.android.libraries.places.internal.zzamd zza = com.google.android.libraries.places.internal.zzamm.zza();
        zza.zza(this.zza);
        zza.zzb(this.zzb);
        zza.zzc(this.zzc);
        zza.zze(com.google.android.libraries.places.internal.zzox.zza(context, this.zzd));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zza, "");
        return zza;
    }

    private final void zzm(com.google.android.libraries.places.internal.zzamd zzamdVar) {
        com.google.android.libraries.places.internal.zzpu zzpuVar = this.zze;
        if (zzpuVar != null) {
            zzpuVar.zzb((com.google.android.libraries.places.internal.zzamm) zzamdVar.zzG());
        }
    }

    private final void zzn(android.content.Context context, int i) {
        com.google.android.libraries.places.internal.zzamd zzl = zzl(context);
        zzp(zzl, i);
        zzm(zzl);
    }

    private final void zzo(android.content.Context context, int i, java.lang.Integer num) {
        com.google.android.libraries.places.internal.zzamd zzl = zzl(context);
        zzp(zzl, 12);
        zzl.zzg(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzl, "");
        if (num != null) {
            zzl.zzd(num.intValue());
        }
        zzm(zzl);
    }

    private static final com.google.android.libraries.places.internal.zzamd zzp(com.google.android.libraries.places.internal.zzamd zzamdVar, int i) {
        zzamdVar.zzf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzamdVar, "");
        return zzamdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void zzb(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzn(context, 2);
    }

    public final void zzc(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzn(context, 3);
    }

    public final void zzd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzn(context, 4);
    }

    public final void zze(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzn(context, 5);
    }

    public final void zzf(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzn(context, 7);
    }

    public final void zzg(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzo(context, 2, null);
    }

    public final void zzh(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzo(context, 3, null);
    }

    public final void zzi(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzo(context, 4, null);
    }

    public final void zzk(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzo(context, 6, null);
    }

    public final void zzj(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        zzo(context, 5, java.lang.Integer.valueOf(i));
    }

    public final void zza(com.google.android.libraries.places.internal.zzpu zzpuVar) {
        this.zze = zzpuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.zza.name());
        parcel.writeString(this.zzb.name());
        java.util.List list = this.zzc;
        parcel.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((com.google.android.libraries.places.internal.zzamg) it.next()).name());
        }
        parcel.writeInt(this.zzd);
    }

    public zzo(com.google.android.libraries.places.internal.zzaml zzamlVar, com.google.android.libraries.places.internal.zzamj zzamjVar, java.util.List list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzamlVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzamjVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = zzamlVar;
        this.zzb = zzamjVar;
        this.zzc = list;
        this.zzd = i;
    }
}
