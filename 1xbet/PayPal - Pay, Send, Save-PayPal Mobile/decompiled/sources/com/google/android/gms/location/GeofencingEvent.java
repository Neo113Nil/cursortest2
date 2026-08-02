package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final java.util.List zzc;
    private final android.location.Location zzd;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent intent) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra(com.google.android.gms.common.internal.Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    intExtra2 = 4;
                }
            }
            arrayList = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList != null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    byte[] bArr = (byte[]) arrayList.get(i);
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    com.google.android.gms.internal.identity.zzek createFromParcel = com.google.android.gms.internal.identity.zzek.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    arrayList2.add(createFromParcel);
                }
            }
            android.location.Location location = (android.location.Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList2 == null || intExtra != -1) {
                return new com.google.android.gms.location.GeofencingEvent(intExtra, intExtra2, arrayList2, location);
            }
            return null;
        }
        intExtra2 = -1;
        arrayList = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList != null) {
        }
        android.location.Location location2 = (android.location.Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
        if (arrayList2 == null) {
        }
        return new com.google.android.gms.location.GeofencingEvent(intExtra, intExtra2, arrayList2, location2);
    }

    public boolean hasError() {
        return this.zza != -1;
    }

    public android.location.Location getTriggeringLocation() {
        return this.zzd;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public int getErrorCode() {
        return this.zza;
    }

    private GeofencingEvent(int i, int i2, java.util.List list, android.location.Location location) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
        this.zzd = location;
    }
}
