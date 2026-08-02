package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public abstract class zzbp extends com.google.android.play.core.splitinstall.internal.zzl implements com.google.android.play.core.splitinstall.internal.zzbq {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzl
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzi(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzj(readInt2, bundle2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzb(readInt3, bundle3);
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzg(readInt4, bundle4);
                return true;
            case 6:
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzl(bundle5);
                return true;
            case 7:
                java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzh(createTypedArrayList);
                return true;
            case 8:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzf(bundle6);
                return true;
            case 9:
                android.os.Bundle bundle7 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzc(bundle7);
                return true;
            case 10:
                android.os.Bundle bundle8 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzm(bundle8);
                return true;
            case 11:
                android.os.Bundle bundle9 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzk(bundle9);
                return true;
            case 12:
                android.os.Bundle bundle10 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zzd(bundle10);
                return true;
            case 13:
                android.os.Bundle bundle11 = (android.os.Bundle) com.google.android.play.core.splitinstall.internal.zzm.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.splitinstall.internal.zzm.zzb(parcel);
                zze(bundle11);
                return true;
            default:
                return false;
        }
    }
}
