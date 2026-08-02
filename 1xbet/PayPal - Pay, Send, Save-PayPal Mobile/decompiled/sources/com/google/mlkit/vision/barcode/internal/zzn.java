package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzn implements com.google.mlkit.vision.barcode.common.internal.BarcodeSource {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzyb zza;

    private static com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime zza(com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzxqVar) {
        if (zzxqVar == null) {
            return null;
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.CalendarDateTime(zzxqVar.zzf(), zzxqVar.zzd(), zzxqVar.zza(), zzxqVar.zzb(), zzxqVar.zzc(), zzxqVar.zze(), zzxqVar.zzh(), zzxqVar.zzg());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final android.graphics.Rect getBoundingBox() {
        android.graphics.Point[] zzo = this.zza.zzo();
        if (zzo == null) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (android.graphics.Point point : zzo) {
            i = java.lang.Math.min(i, point.x);
            i4 = java.lang.Math.max(i4, point.x);
            i3 = java.lang.Math.min(i3, point.y);
            i2 = java.lang.Math.max(i2, point.y);
        }
        return new android.graphics.Rect(i, i3, i4, i2);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxr zzc = this.zza.zzc();
        if (zzc != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.CalendarEvent(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), zza(zzc.zzb()), zza(zzc.zza()));
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.ContactInfo getContactInfo() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxs zzd = this.zza.zzd();
        if (zzd == null) {
            return null;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzxw zza = zzd.zza();
        com.google.mlkit.vision.barcode.common.Barcode.PersonName personName = zza != null ? new com.google.mlkit.vision.barcode.common.Barcode.PersonName(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg()) : null;
        java.lang.String zzb = zzd.zzb();
        java.lang.String zzc = zzd.zzc();
        com.google.android.gms.internal.mlkit_vision_barcode.zzxx[] zzf = zzd.zzf();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (zzf != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzxxVar : zzf) {
                if (zzxxVar != null) {
                    arrayList.add(new com.google.mlkit.vision.barcode.common.Barcode.Phone(zzxxVar.zzb(), zzxxVar.zza()));
                }
            }
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzxu[] zze = zzd.zze();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (zze != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzxuVar : zze) {
                if (zzxuVar != null) {
                    arrayList2.add(new com.google.mlkit.vision.barcode.common.Barcode.Email(zzxuVar.zza(), zzxuVar.zzb(), zzxuVar.zzd(), zzxuVar.zzc()));
                }
            }
        }
        java.util.List asList = zzd.zzg() != null ? java.util.Arrays.asList((java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzd.zzg())) : new java.util.ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzxp[] zzd2 = zzd.zzd();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (zzd2 != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzxp zzxpVar : zzd2) {
                if (zzxpVar != null) {
                    arrayList3.add(new com.google.mlkit.vision.barcode.common.Barcode.Address(zzxpVar.zza(), zzxpVar.zzb()));
                }
            }
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.ContactInfo(personName, zzb, zzc, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final android.graphics.Point[] getCornerPoints() {
        return this.zza.zzo();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final java.lang.String getDisplayValue() {
        return this.zza.zzl();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxt zze = this.zza.zze();
        if (zze != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.DriverLicense(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Email getEmail() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzf = this.zza.zzf();
        if (zzf == null) {
            return null;
        }
        return new com.google.mlkit.vision.barcode.common.Barcode.Email(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.zza();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxv zzg = this.zza.zzg();
        if (zzg != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.GeoPoint(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Phone getPhone() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzh = this.zza.zzh();
        if (zzh != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.Phone(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.zzn();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final java.lang.String getRawValue() {
        return this.zza.zzm();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.Sms getSms() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxy zzi = this.zza.zzi();
        if (zzi != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.Sms(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark getUrl() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzxz zzj = this.zza.zzj();
        if (zzj != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.UrlBookmark(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.zzb();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final com.google.mlkit.vision.barcode.common.Barcode.WiFi getWifi() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzya zzk = this.zza.zzk();
        if (zzk != null) {
            return new com.google.mlkit.vision.barcode.common.Barcode.WiFi(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }

    public zzn(com.google.android.gms.internal.mlkit_vision_barcode.zzyb zzybVar) {
        this.zza = zzybVar;
    }
}
