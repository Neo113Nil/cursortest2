package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzka {
    public static final com.google.android.libraries.places.api.model.RoutingSummary zza(com.google.android.libraries.places.internal.zzbbc zzbbcVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.libraries.places.internal.zzbbb zzbbbVar : zzbbcVar.zza()) {
            arrayList.add(com.google.android.libraries.places.api.model.Leg.newInstance(java.time.Duration.ofSeconds(zzbbbVar.zza().zzc(), r3.zze()), zzbbbVar.zzc()));
        }
        com.google.android.libraries.places.api.model.RoutingSummary.Builder builder = com.google.android.libraries.places.api.model.RoutingSummary.builder(arrayList);
        java.lang.String zzc = zzbbcVar.zzc();
        if (!zzc.isEmpty()) {
            builder.setDirectionsUri(android.net.Uri.parse(zzc));
        }
        return builder.build();
    }

    zzka() {
    }
}
