package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class AdActivity extends android.app.Activity {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private com.google.android.gms.internal.ads.zzbzb zza;

    private final void zza() {
        com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
        if (zzbzbVar != null) {
            try {
                zzbzbVar.zzs();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzm(i, i2, intent);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                if (!zzbzbVar.zzg()) {
                    return;
                }
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar2 = this.zza;
            if (zzbzbVar2 != null) {
                zzbzbVar2.zze();
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(configuration));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onCreate");
        com.google.android.gms.internal.ads.zzbzb zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzg(this);
        this.zza = zzg;
        if (zzg == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzg.zzh(bundle);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onDestroy");
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzq();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onPause");
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzl();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzH(i, strArr, iArr);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onRestart");
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzi();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzk();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzo(bundle);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onStart");
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzj();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdActivity onStop");
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzp();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            com.google.android.gms.internal.ads.zzbzb zzbzbVar = this.zza;
            if (zzbzbVar != null) {
                zzbzbVar.zzf();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
