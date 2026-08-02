package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzkl extends com.google.android.libraries.places.internal.zzld {
    zzkl(com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest, java.lang.String str, com.google.android.libraries.places.internal.zznh zznhVar) {
        super(fetchPhotoRequest, null, str, zznhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzld
    public final java.util.Map zze() {
        com.google.android.libraries.places.api.net.FetchPhotoRequest fetchPhotoRequest = (com.google.android.libraries.places.api.net.FetchPhotoRequest) zza();
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        java.util.HashMap hashMap = new java.util.HashMap();
        zzg(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzg(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    protected final java.lang.String zzf() {
        return "photo";
    }
}
