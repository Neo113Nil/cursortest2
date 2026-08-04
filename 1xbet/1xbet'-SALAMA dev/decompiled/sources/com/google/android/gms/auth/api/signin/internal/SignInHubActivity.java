package com.google.android.gms.auth.api.signin.internal;

import B3.g;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.A;
import androidx.lifecycle.InterfaceC0724t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import java.lang.reflect.Modifier;
import java.util.Set;
import p033e3.h;
import p095n0.a;
import p095n0.b;
import p095n0.c;
import p095n0.d;
import p096n1.e;
import p122r.m;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f11053f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11054a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignInConfiguration f11055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Intent f11058e;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        a supportLoaderManager = getSupportLoaderManager();
        e eVar = new e(this, 11);
        d dVar = (d) supportLoaderManager;
        c cVar = dVar.f15300b;
        if (cVar.f15298e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        m mVar = cVar.f15297d;
        b bVar = (b) mVar.b(0, null);
        InterfaceC0724t interfaceC0724t = dVar.f15299a;
        if (bVar == null) {
            try {
                cVar.f15298e = true;
                Set set = o.f11208a;
                synchronized (set) {
                }
                p033e3.c cVar2 = new p033e3.c(this, set);
                if (p033e3.c.class.isMemberClass() && !Modifier.isStatic(p033e3.c.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVar2);
                }
                b bVar2 = new b(cVar2);
                mVar.c(0, bVar2);
                cVar.f15298e = false;
                g gVar = new g(bVar2.f15293l, eVar);
                bVar2.d(interfaceC0724t, gVar);
                g gVar2 = bVar2.f15295n;
                if (gVar2 != null) {
                    bVar2.h(gVar2);
                }
                bVar2.f15294m = interfaceC0724t;
                bVar2.f15295n = gVar;
            } catch (Throwable th) {
                cVar.f15298e = false;
                throw th;
            }
        } else {
            g gVar3 = new g(bVar.f15293l, eVar);
            bVar.d(interfaceC0724t, gVar3);
            g gVar4 = bVar.f15295n;
            if (gVar4 != null) {
                bVar.h(gVar4);
            }
            bVar.f15294m = interfaceC0724t;
            bVar.f15295n = gVar3;
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
                h hVarE0 = h.e0(this);
                GoogleSignInOptions googleSignInOptions = this.f11055b.f11052b;
                synchronized (hVarE0) {
                    ((p033e3.a) hVarE0.f12673a).d(googleSignInAccount, googleSignInOptions);
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
