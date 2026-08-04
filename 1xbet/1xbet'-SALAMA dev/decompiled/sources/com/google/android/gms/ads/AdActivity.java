package com.google.android.gms.ads;

import F2.C0221c;
import F2.C0247p;
import F2.C0252s;
import J2.j;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbso;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbso f10706a;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzh(i7, i8, intent);
            }
        } catch (Exception e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null && !zzbsoVar.zzH()) {
                return;
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        super.onBackPressed();
        try {
            zzbso zzbsoVar2 = this.f10706a;
            if (zzbsoVar2 != null) {
                zzbsoVar2.zzi();
            }
        } catch (RemoteException e8) {
            j.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzk(new b(configuration));
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0247p c0247p = C0252s.f2717f.f2719b;
        c0247p.getClass();
        C0221c c0221c = new C0221c(c0247p, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            j.d("useClientJar flag not found in activity intent extras.");
        }
        zzbso zzbsoVar = (zzbso) c0221c.d(this, booleanExtra);
        this.f10706a = zzbsoVar;
        if (zzbsoVar == null) {
            j.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbsoVar.zzl(bundle);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzm();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzo();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzp(i7, strArr, iArr);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzq();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzr();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzs(bundle);
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzt();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzu();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbso zzbsoVar = this.f10706a;
            if (zzbsoVar != null) {
                zzbsoVar.zzv();
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(i7);
        zzbso zzbsoVar = this.f10706a;
        if (zzbsoVar != null) {
            try {
                zzbsoVar.zzx();
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbso zzbsoVar = this.f10706a;
        if (zzbsoVar != null) {
            try {
                zzbsoVar.zzx();
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbso zzbsoVar = this.f10706a;
        if (zzbsoVar != null) {
            try {
                zzbsoVar.zzx();
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
