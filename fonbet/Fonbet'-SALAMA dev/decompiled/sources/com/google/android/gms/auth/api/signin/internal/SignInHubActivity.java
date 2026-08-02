package com.google.android.gms.auth.api.signin.internal;

import B3.g;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.A;
import androidx.lifecycle.InterfaceC0745t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import e3.C1016a;
import e3.C1018c;
import e3.C1023h;
import java.lang.reflect.Modifier;
import java.util.Set;
import n0.AbstractC1445a;
import n0.b;
import n0.c;
import n0.d;
import n1.C1450e;
import r.m;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends A {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f11053f = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11054a = false;

    /* renamed from: b, reason: collision with root package name */
    public SignInConfiguration f11055b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11056c;

    /* renamed from: d, reason: collision with root package name */
    public int f11057d;

    /* renamed from: e, reason: collision with root package name */
    public Intent f11058e;

    public final void d() {
        AbstractC1445a supportLoaderManager = getSupportLoaderManager();
        C1450e c1450e = new C1450e(this, 11);
        d dVar = (d) supportLoaderManager;
        c cVar = dVar.f15294b;
        if (cVar.f15292e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        m mVar = cVar.f15291d;
        b bVar = (b) mVar.b(0, null);
        InterfaceC0745t interfaceC0745t = dVar.f15293a;
        if (bVar == null) {
            try {
                cVar.f15292e = true;
                Set set = o.f11208a;
                synchronized (set) {
                }
                C1018c c1018c = new C1018c(this, set);
                if (C1018c.class.isMemberClass() && !Modifier.isStatic(C1018c.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c1018c);
                }
                b bVar2 = new b(c1018c);
                mVar.c(0, bVar2);
                cVar.f15292e = false;
                g gVar = new g(bVar2.f15287l, c1450e);
                bVar2.d(interfaceC0745t, gVar);
                g gVar2 = bVar2.f15289n;
                if (gVar2 != null) {
                    bVar2.h(gVar2);
                }
                bVar2.f15288m = interfaceC0745t;
                bVar2.f15289n = gVar;
            } catch (Throwable th) {
                cVar.f15292e = false;
                throw th;
            }
        } else {
            g gVar3 = new g(bVar.f15287l, c1450e);
            bVar.d(interfaceC0745t, gVar3);
            g gVar4 = bVar.f15289n;
            if (gVar4 != null) {
                bVar.h(gVar4);
            }
            bVar.f15288m = interfaceC0745t;
            bVar.f15289n = gVar3;
        }
        f11053f = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void e(int i7) {
        Status status = new Status(i7, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f11053f = false;
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f11054a) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f11046b) != null) {
                C1023h e02 = C1023h.e0(this);
                GoogleSignInOptions googleSignInOptions = this.f11055b.f11052b;
                synchronized (e02) {
                    ((C1016a) e02.f12667a).d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f11056c = true;
                this.f11057d = i8;
                this.f11058e = intent;
                d();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                e(intExtra);
                return;
            }
        }
        e(8);
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, F.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            e(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f11055b = signInConfiguration;
        if (bundle != null) {
            boolean z4 = bundle.getBoolean("signingInGoogleApiClients");
            this.f11056c = z4;
            if (z4) {
                this.f11057d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f11058e = intent2;
                d();
                return;
            }
            return;
        }
        if (f11053f) {
            setResult(0);
            e(12502);
            return;
        }
        f11053f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f11055b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f11054a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            e(17);
        }
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f11053f = false;
    }

    @Override // androidx.activity.o, F.m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f11056c);
        if (this.f11056c) {
            bundle.putInt("signInResultCode", this.f11057d);
            bundle.putParcelable("signInResultData", this.f11058e);
        }
    }
}
