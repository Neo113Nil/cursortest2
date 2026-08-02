package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzana implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzana();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzanb zzanbVar;
        switch (i) {
            case 0:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.CONTENT_UNDEFINED;
                break;
            case 1:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.PHOTO;
                break;
            case 2:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.ADDRESS;
                break;
            case 3:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.RATING;
                break;
            case 4:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.TYPE;
                break;
            case 5:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.PRICE;
                break;
            case 6:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.ACCESSIBILITY;
                break;
            case 7:
                zzanbVar = com.google.android.libraries.places.internal.zzanb.OPEN_NOW_STATUS;
                break;
            default:
                zzanbVar = null;
                break;
        }
        return zzanbVar != null;
    }

    private zzana() {
    }
}
