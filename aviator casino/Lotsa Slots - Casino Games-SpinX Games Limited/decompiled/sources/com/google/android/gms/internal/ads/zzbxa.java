package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbxa extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbxb {
    public zzbxa() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static com.google.android.gms.internal.ads.zzbxb zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbxb ? (com.google.android.gms.internal.ads.zzbxb) queryLocalInterface : new com.google.android.gms.internal.ads.zzbwz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbxe zzbxeVar = null;
        com.google.android.gms.internal.ads.zzbwm zzbwkVar = null;
        com.google.android.gms.internal.ads.zzbwv zzbwtVar = null;
        com.google.android.gms.internal.ads.zzbwp zzbwnVar = null;
        com.google.android.gms.internal.ads.zzbwy zzbwwVar = null;
        com.google.android.gms.internal.ads.zzbwv zzbwtVar2 = null;
        com.google.android.gms.internal.ads.zzbwy zzbwwVar2 = null;
        com.google.android.gms.internal.ads.zzbws zzbwqVar = null;
        com.google.android.gms.internal.ads.zzbwp zzbwnVar2 = null;
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            java.lang.String readString = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxeVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbxe ? (com.google.android.gms.internal.ads.zzbxe) queryLocalInterface : new com.google.android.gms.internal.ads.zzbxc(readStrongBinder);
            }
            com.google.android.gms.internal.ads.zzbxe zzbxeVar2 = zzbxeVar;
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(asInterface, readString, bundle, bundle2, zzrVar, zzbxeVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            com.google.android.gms.internal.ads.zzbxq zzf = zzf();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzf);
        } else if (i == 3) {
            com.google.android.gms.internal.ads.zzbxq zzg = zzg();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzea zzh = zzh();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzh);
        } else if (i == 10) {
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    java.lang.String readString2 = parcel.readString();
                    java.lang.String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwnVar2 = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbwp ? (com.google.android.gms.internal.ads.zzbwp) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzbwn(readStrongBinder2);
                    }
                    com.google.android.gms.internal.ads.zzbwp zzbwpVar = zzbwnVar2;
                    com.google.android.gms.internal.ads.zzbvi zzb = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzi(readString2, readString3, zzmVar, asInterface2, zzbwpVar, zzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    java.lang.String readString4 = parcel.readString();
                    java.lang.String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwqVar = queryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbws ? (com.google.android.gms.internal.ads.zzbws) queryLocalInterface3 : new com.google.android.gms.internal.ads.zzbwq(readStrongBinder3);
                    }
                    com.google.android.gms.internal.ads.zzbws zzbwsVar = zzbwqVar;
                    com.google.android.gms.internal.ads.zzbvi zzb2 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzj(readString4, readString5, zzmVar2, asInterface3, zzbwsVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    boolean zzk = zzk(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    java.lang.String readString6 = parcel.readString();
                    java.lang.String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwwVar2 = queryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbwy ? (com.google.android.gms.internal.ads.zzbwy) queryLocalInterface4 : new com.google.android.gms.internal.ads.zzbww(readStrongBinder4);
                    }
                    com.google.android.gms.internal.ads.zzbwy zzbwyVar = zzbwwVar2;
                    com.google.android.gms.internal.ads.zzbvi zzb3 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzl(readString6, readString7, zzmVar3, asInterface5, zzbwyVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    boolean zzm = zzm(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    java.lang.String readString8 = parcel.readString();
                    java.lang.String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwtVar2 = queryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzbwv ? (com.google.android.gms.internal.ads.zzbwv) queryLocalInterface5 : new com.google.android.gms.internal.ads.zzbwt(readStrongBinder5);
                    }
                    com.google.android.gms.internal.ads.zzbwv zzbwvVar = zzbwtVar2;
                    com.google.android.gms.internal.ads.zzbvi zzb4 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzn(readString8, readString9, zzmVar4, asInterface7, zzbwvVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    java.lang.String readString10 = parcel.readString();
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    java.lang.String readString11 = parcel.readString();
                    java.lang.String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwwVar = queryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzbwy ? (com.google.android.gms.internal.ads.zzbwy) queryLocalInterface6 : new com.google.android.gms.internal.ads.zzbww(readStrongBinder6);
                    }
                    com.google.android.gms.internal.ads.zzbwy zzbwyVar2 = zzbwwVar;
                    com.google.android.gms.internal.ads.zzbvi zzb5 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzp(readString11, readString12, zzmVar5, asInterface8, zzbwyVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    java.lang.String readString13 = parcel.readString();
                    java.lang.String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwnVar = queryLocalInterface7 instanceof com.google.android.gms.internal.ads.zzbwp ? (com.google.android.gms.internal.ads.zzbwp) queryLocalInterface7 : new com.google.android.gms.internal.ads.zzbwn(readStrongBinder7);
                    }
                    com.google.android.gms.internal.ads.zzbwp zzbwpVar2 = zzbwnVar;
                    com.google.android.gms.internal.ads.zzbvi zzb6 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzq(readString13, readString14, zzmVar6, asInterface9, zzbwpVar2, zzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    java.lang.String readString15 = parcel.readString();
                    java.lang.String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwtVar = queryLocalInterface8 instanceof com.google.android.gms.internal.ads.zzbwv ? (com.google.android.gms.internal.ads.zzbwv) queryLocalInterface8 : new com.google.android.gms.internal.ads.zzbwt(readStrongBinder8);
                    }
                    com.google.android.gms.internal.ads.zzbwv zzbwvVar2 = zzbwtVar;
                    com.google.android.gms.internal.ads.zzbvi zzb7 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzblt zzbltVar = (com.google.android.gms.internal.ads.zzblt) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzblt.CREATOR);
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzr(readString15, readString16, zzmVar7, asInterface10, zzbwvVar2, zzb7, zzbltVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    java.lang.String readString17 = parcel.readString();
                    java.lang.String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper asInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbwkVar = queryLocalInterface9 instanceof com.google.android.gms.internal.ads.zzbwm ? (com.google.android.gms.internal.ads.zzbwm) queryLocalInterface9 : new com.google.android.gms.internal.ads.zzbwk(readStrongBinder9);
                    }
                    com.google.android.gms.internal.ads.zzbwm zzbwmVar = zzbwkVar;
                    com.google.android.gms.internal.ads.zzbvi zzb8 = com.google.android.gms.internal.ads.zzbvh.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    zzs(readString17, readString18, zzmVar8, asInterface11, zzbwmVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                    boolean zzt = zzt(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
