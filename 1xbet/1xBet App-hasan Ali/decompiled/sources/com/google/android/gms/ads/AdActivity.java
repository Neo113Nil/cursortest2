package com.google.android.gms.ads;

import Q2.C0351c;
import Q2.C0375o;
import Q2.C0379q;
import U2.j;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC0632Lb;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0632Lb f7433k;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.Z1(i, i5, intent);
            }
        } catch (Exception e3) {
            j.k("#007 Could not call remote method.", e3);
        }
        super.onActivityResult(i, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                if (!interfaceC0632Lb.n2()) {
                    return;
                }
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
        super.onBackPressed();
        try {
            InterfaceC0632Lb interfaceC0632Lb2 = this.f7433k;
            if (interfaceC0632Lb2 != null) {
                interfaceC0632Lb2.e();
            }
        } catch (RemoteException e5) {
            j.k("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.m2(new BinderC2361b(configuration));
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0375o c0375o = C0379q.f.f5049b;
        c0375o.getClass();
        C0351c c0351c = new C0351c(c0375o, this);
        Intent intent = getIntent();
        boolean z3 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z3 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            j.f("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC0632Lb interfaceC0632Lb = (InterfaceC0632Lb) c0351c.d(this, z3);
        this.f7433k = interfaceC0632Lb;
        if (interfaceC0632Lb == null) {
            j.k("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC0632Lb.z0(bundle);
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.l();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.n();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.I2(i, strArr, iArr);
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.s();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.t();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.Y0(bundle);
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.w();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.u();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
            if (interfaceC0632Lb != null) {
                interfaceC0632Lb.J();
            }
        } catch (RemoteException e3) {
            j.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
        if (interfaceC0632Lb != null) {
            try {
                interfaceC0632Lb.v();
            } catch (RemoteException e3) {
                j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
        if (interfaceC0632Lb != null) {
            try {
                interfaceC0632Lb.v();
            } catch (RemoteException e3) {
                j.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC0632Lb interfaceC0632Lb = this.f7433k;
        if (interfaceC0632Lb != null) {
            try {
                interfaceC0632Lb.v();
            } catch (RemoteException e3) {
                j.k("#007 Could not call remote method.", e3);
            }
        }
    }
}
