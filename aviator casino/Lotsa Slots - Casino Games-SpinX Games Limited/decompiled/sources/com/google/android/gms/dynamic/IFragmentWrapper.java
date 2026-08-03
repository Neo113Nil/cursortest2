package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof com.google.android.gms.dynamic.IFragmentWrapper ? (com.google.android.gms.dynamic.IFragmentWrapper) queryLocalInterface : new com.google.android.gms.dynamic.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            switch (i) {
                case 2:
                    com.google.android.gms.dynamic.IObjectWrapper zzb = zzb();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzb);
                    return true;
                case 3:
                    android.os.Bundle zzc = zzc();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzd(parcel2, zzc);
                    return true;
                case 4:
                    int zzd = zzd();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd);
                    return true;
                case 5:
                    com.google.android.gms.dynamic.IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zze);
                    return true;
                case 6:
                    com.google.android.gms.dynamic.IObjectWrapper zzf = zzf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzf);
                    return true;
                case 7:
                    boolean zzg = zzg();
                    parcel2.writeNoException();
                    int i3 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzg ? 1 : 0);
                    return true;
                case 8:
                    java.lang.String zzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(zzh);
                    return true;
                case 9:
                    com.google.android.gms.dynamic.IFragmentWrapper zzi = zzi();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzi);
                    return true;
                case 10:
                    int zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzj);
                    return true;
                case 11:
                    boolean zzk = zzk();
                    parcel2.writeNoException();
                    int i4 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzk ? 1 : 0);
                    return true;
                case 12:
                    com.google.android.gms.dynamic.IObjectWrapper zzl = zzl();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzl);
                    return true;
                case 13:
                    boolean zzm = zzm();
                    parcel2.writeNoException();
                    int i5 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzm ? 1 : 0);
                    return true;
                case 14:
                    boolean zzn = zzn();
                    parcel2.writeNoException();
                    int i6 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzn ? 1 : 0);
                    return true;
                case 15:
                    boolean zzo = zzo();
                    parcel2.writeNoException();
                    int i7 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzo ? 1 : 0);
                    return true;
                case 16:
                    boolean zzp = zzp();
                    parcel2.writeNoException();
                    int i8 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzp ? 1 : 0);
                    return true;
                case 17:
                    boolean zzq = zzq();
                    parcel2.writeNoException();
                    int i9 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzq ? 1 : 0);
                    return true;
                case 18:
                    boolean zzr = zzr();
                    parcel2.writeNoException();
                    int i10 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzr ? 1 : 0);
                    return true;
                case 19:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i11 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzs ? 1 : 0);
                    return true;
                case 20:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzt(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zza = com.google.android.gms.internal.common.zzc.zza(parcel);
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzu(zza);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zza2 = com.google.android.gms.internal.common.zzc.zza(parcel);
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzv(zza2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zza3 = com.google.android.gms.internal.common.zzc.zza(parcel);
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzw(zza3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zza4 = com.google.android.gms.internal.common.zzc.zza(parcel);
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzx(zza4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.common.zzc.zzb(parcel, android.content.Intent.CREATOR);
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzy(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    android.content.Intent intent2 = (android.content.Intent) com.google.android.gms.internal.common.zzc.zzb(parcel, android.content.Intent.CREATOR);
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzz(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzf(parcel);
                    zzA(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void zzA(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException;

    android.os.Bundle zzc() throws android.os.RemoteException;

    int zzd() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zze() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException;

    boolean zzg() throws android.os.RemoteException;

    java.lang.String zzh() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzi() throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    boolean zzk() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException;

    boolean zzm() throws android.os.RemoteException;

    boolean zzn() throws android.os.RemoteException;

    boolean zzo() throws android.os.RemoteException;

    boolean zzp() throws android.os.RemoteException;

    boolean zzq() throws android.os.RemoteException;

    boolean zzr() throws android.os.RemoteException;

    boolean zzs() throws android.os.RemoteException;

    void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void zzu(boolean z) throws android.os.RemoteException;

    void zzv(boolean z) throws android.os.RemoteException;

    void zzw(boolean z) throws android.os.RemoteException;

    void zzx(boolean z) throws android.os.RemoteException;

    void zzy(android.content.Intent intent) throws android.os.RemoteException;

    void zzz(android.content.Intent intent, int i) throws android.os.RemoteException;
}
