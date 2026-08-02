package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzp implements com.google.mlkit.vision.barcode.common.internal.BarcodeSource {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzu zza;

    private static com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime zza(com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd, zzjVar.zze, zzjVar.zzf, zzjVar.zzg, zzjVar.zzh);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final android.graphics.Rect getBoundingBox() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzu zzuVar = this.zza;
        if (zzuVar.zze == null) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            android.graphics.Point[] pointArr = zzuVar.zze;
            if (i3 >= pointArr.length) {
                return new android.graphics.Rect(i, i4, i5, i2);
            }
            android.graphics.Point point = pointArr[i3];
            i = java.lang.Math.min(i, point.x);
            i5 = java.lang.Math.max(i5, point.x);
            i4 = java.lang.Math.min(i4, point.y);
            i2 = java.lang.Math.max(i2, point.y);
            i3++;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = this.zza.zzl;
        if (zzkVar == null) {
            return null;
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent(zzkVar.zza, zzkVar.zzb, zzkVar.zzc, zzkVar.zzd, zzkVar.zze, zza(zzkVar.zzf), zza(zzkVar.zzg));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.ContactInfo getContactInfo() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzl zzlVar = this.zza.zzm;
        if (zzlVar == null) {
            return null;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzp zzpVar = zzlVar.zza;
        com.google.mlkit.vision.barcode.common.Barcode.PersonName personName = zzpVar != null ? new com.google.mlkit.vision.barcode.common.Barcode.PersonName(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg) : null;
        java.lang.String str = zzlVar.zzb;
        java.lang.String str2 = zzlVar.zzc;
        com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzqVarArr = zzlVar.zzd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (zzqVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList.add(new com.google.mlkit.vision.barcode.common.Barcode.Phone(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zznVarArr = zzlVar.zze;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (zznVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList2.add(new com.google.mlkit.vision.barcode.common.Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
                }
            }
        }
        java.lang.String[] strArr = zzlVar.zzf;
        java.util.List asList = strArr != null ? java.util.Arrays.asList(strArr) : new java.util.ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr = zzlVar.zzg;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (zziVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList3.add(new com.google.mlkit.vision.barcode.common.Barcode.Address(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.ContactInfo(personName, str, str2, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final android.graphics.Point[] getCornerPoints() {
        return this.zza.zze;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final java.lang.String getDisplayValue() {
        return this.zza.zzc;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = this.zza.zzn;
        if (zzmVar == null) {
            return null;
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.DriverLicense(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Email getEmail() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar = this.zza.zzf;
        if (zznVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.zza;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar = this.zza.zzk;
        if (zzoVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.GeoPoint(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Phone getPhone() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar = this.zza.zzg;
        if (zzqVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.Phone(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.zzo;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final java.lang.String getRawValue() {
        return this.zza.zzb;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Sms getSms() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzr zzrVar = this.zza.zzh;
        if (zzrVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.Sms(zzrVar.zza, zzrVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark getUrl() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzs zzsVar = this.zza.zzj;
        if (zzsVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark(zzsVar.zza, zzsVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.zzd;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.WiFi getWifi() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzt zztVar = this.zza.zzi;
        if (zztVar != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.WiFi(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }

    public zzp(com.google.android.gms.internal.mlkit_vision_barcode.zzu zzuVar) {
        this.zza = zzuVar;
    }
}
