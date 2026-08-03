package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbc implements android.content.ServiceConnection {
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zza;
    private final java.lang.Object zzb = new java.lang.Object();
    private boolean zzc = false;
    private com.android.billingclient.api.BillingClientStateListener zzd;

    /* synthetic */ zzbc(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.BillingClientStateListener billingClientStateListener, com.android.billingclient.api.zzbb zzbbVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(com.android.billingclient.api.BillingResult billingResult) {
        synchronized (this.zzb) {
            com.android.billingclient.api.BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.Handler zzaj;
        java.util.concurrent.Future zzao;
        com.android.billingclient.api.BillingResult zzal;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.zza.zzg = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.zzbc.this.zza();
                return null;
            }
        };
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.zzbc.this.zzb();
            }
        };
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
        zzaj = billingClientImpl.zzaj();
        zzao = billingClientImpl.zzao(callable, 30000L, runnable, zzaj);
        if (zzao == null) {
            com.android.billingclient.api.BillingClientImpl billingClientImpl2 = this.zza;
            zzal = billingClientImpl2.zzal();
            billingClientImpl2.zzap(com.android.billingclient.api.zzcb.zza(25, 6, zzal));
            zzd(zzal);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.android.billingclient.api.zzcc zzccVar;
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        zzccVar = this.zza.zzf;
        zzccVar.zze(com.google.android.gms.internal.play_billing.zzhl.zzz());
        this.zza.zzg = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            com.android.billingclient.api.BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        android.os.Bundle bundle;
        int i;
        java.lang.String str;
        int i2;
        android.content.Context context;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        com.android.billingclient.api.zzo zzoVar;
        com.android.billingclient.api.zzo zzoVar2;
        boolean z;
        com.google.android.gms.internal.play_billing.zzs zzsVar;
        int i18;
        com.google.android.gms.internal.play_billing.zzs zzsVar2;
        com.google.android.gms.internal.play_billing.zzs zzsVar3;
        com.google.android.gms.internal.play_billing.zzs zzsVar4;
        synchronized (this.zzb) {
            if (!this.zzc) {
                if (android.text.TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new android.os.Bundle();
                    bundle.putString("accountName", null);
                }
                int i19 = 3;
                try {
                    context = this.zza.zze;
                    java.lang.String packageName = context.getPackageName();
                    int i20 = 22;
                    i2 = 3;
                    while (true) {
                        if (i20 < 3) {
                            i20 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                zzsVar3 = this.zza.zzg;
                                i2 = zzsVar3.zzy(i20, packageName, "subs");
                            } catch (java.lang.Exception e) {
                                e = e;
                                i19 = i2;
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                i = e instanceof android.os.DeadObjectException ? 101 : e instanceof android.os.RemoteException ? 100 : e instanceof java.lang.SecurityException ? 102 : 42;
                                if (i == 42) {
                                    str = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                    if (str.length() > 70) {
                                        str = str.substring(0, 70);
                                    }
                                } else {
                                    str = null;
                                }
                                this.zza.zza = 0;
                                this.zza.zzg = null;
                                i2 = i19;
                                if (i2 != 0) {
                                }
                                return null;
                            }
                        } else {
                            zzsVar4 = this.zza.zzg;
                            i2 = zzsVar4.zzc(i20, packageName, "subs", bundle);
                        }
                        if (i2 == 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "highestLevelSupportedForSubs: " + i20);
                            break;
                        }
                        i20--;
                    }
                    boolean z2 = true;
                    this.zza.zzj = i20 >= 5;
                    this.zza.zzi = i20 >= 3;
                    if (i20 < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                        i = 9;
                    } else {
                        i = 1;
                    }
                    int i21 = 22;
                    while (true) {
                        if (i21 < 3) {
                            break;
                        }
                        if (bundle == null) {
                            zzsVar2 = this.zza.zzg;
                            i2 = zzsVar2.zzy(i21, packageName, "inapp");
                        } else {
                            zzsVar = this.zza.zzg;
                            i2 = zzsVar.zzc(i21, packageName, "inapp", bundle);
                        }
                        if (i2 == 0) {
                            this.zza.zzk = i21;
                            i18 = this.zza.zzk;
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "mHighestLevelSupportedForInApp: " + i18);
                            break;
                        }
                        i21--;
                    }
                    com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zza;
                    i3 = billingClientImpl.zzk;
                    billingClientImpl.zzy = i3 >= 22;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl2 = this.zza;
                    i4 = billingClientImpl2.zzk;
                    billingClientImpl2.zzx = i4 >= 21;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl3 = this.zza;
                    i5 = billingClientImpl3.zzk;
                    billingClientImpl3.zzw = i5 >= 20;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl4 = this.zza;
                    i6 = billingClientImpl4.zzk;
                    billingClientImpl4.zzv = i6 >= 19;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl5 = this.zza;
                    i7 = billingClientImpl5.zzk;
                    billingClientImpl5.zzu = i7 >= 18;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl6 = this.zza;
                    i8 = billingClientImpl6.zzk;
                    billingClientImpl6.zzt = i8 >= 17;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl7 = this.zza;
                    i9 = billingClientImpl7.zzk;
                    billingClientImpl7.zzs = i9 >= 16;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl8 = this.zza;
                    i10 = billingClientImpl8.zzk;
                    billingClientImpl8.zzr = i10 >= 15;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl9 = this.zza;
                    i11 = billingClientImpl9.zzk;
                    billingClientImpl9.zzq = i11 >= 14;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl10 = this.zza;
                    i12 = billingClientImpl10.zzk;
                    billingClientImpl10.zzp = i12 >= 12;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl11 = this.zza;
                    i13 = billingClientImpl11.zzk;
                    billingClientImpl11.zzo = i13 >= 10;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl12 = this.zza;
                    i14 = billingClientImpl12.zzk;
                    billingClientImpl12.zzn = i14 >= 9;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl13 = this.zza;
                    i15 = billingClientImpl13.zzk;
                    billingClientImpl13.zzm = i15 >= 8;
                    com.android.billingclient.api.BillingClientImpl billingClientImpl14 = this.zza;
                    i16 = billingClientImpl14.zzk;
                    if (i16 < 6) {
                        z2 = false;
                    }
                    billingClientImpl14.zzl = z2;
                    i17 = this.zza.zzk;
                    if (i17 < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        i = 36;
                    }
                    if (i2 == 0) {
                        this.zza.zza = 2;
                        zzoVar = this.zza.zzd;
                        if (zzoVar != null) {
                            zzoVar2 = this.zza.zzd;
                            z = this.zza.zzx;
                            zzoVar2.zzg(z);
                        }
                    } else {
                        this.zza.zza = 0;
                        this.zza.zzg = null;
                    }
                    str = null;
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
                if (i2 != 0) {
                    this.zza.zzaq(com.android.billingclient.api.zzcb.zzc(6));
                    zzd(com.android.billingclient.api.zzce.zzl);
                } else {
                    this.zza.zzap(com.android.billingclient.api.zzcb.zzb(i, 6, com.android.billingclient.api.zzce.zza, str));
                    zzd(com.android.billingclient.api.zzce.zza);
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzg = null;
        this.zza.zzap(com.android.billingclient.api.zzcb.zza(24, 6, com.android.billingclient.api.zzce.zzn));
        zzd(com.android.billingclient.api.zzce.zzn);
    }

    final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
