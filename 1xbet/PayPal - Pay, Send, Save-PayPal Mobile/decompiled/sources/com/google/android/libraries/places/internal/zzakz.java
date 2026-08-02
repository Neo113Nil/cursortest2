package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzakz implements com.google.android.libraries.places.internal.zzbdw {
    static final com.google.android.libraries.places.internal.zzbdw zza = new com.google.android.libraries.places.internal.zzakz();

    @Override // com.google.android.libraries.places.internal.zzbdw
    public final boolean zza(int i) {
        com.google.android.libraries.places.internal.zzala zzalaVar;
        switch (i) {
            case 0:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zzalaVar = com.google.android.libraries.places.internal.zzala.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zzalaVar = null;
                break;
        }
        return zzalaVar != null;
    }

    private zzakz() {
    }
}
