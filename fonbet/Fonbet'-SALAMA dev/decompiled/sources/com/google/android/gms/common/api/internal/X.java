package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractBinderC0849a;
import com.google.android.gms.common.internal.InterfaceC0860l;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.signin.internal.zak;
import io.sentry.protocol.SentryStackFrame;
import java.util.Set;

/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11152a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11154c;

    public /* synthetic */ X(int i7, Object obj, Object obj2) {
        this.f11152a = i7;
        this.f11154c = obj;
        this.f11153b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0860l interfaceC0860l;
        Set set;
        InterfaceC0860l interfaceC0860l2 = null;
        switch (this.f11152a) {
            case 0:
                if (((B) this.f11154c).f11092a) {
                    ConnectionResult connectionResult = ((W) this.f11153b).f11151b;
                    if ((connectionResult.f11061b == 0 || connectionResult.f11062c == null) ? false : true) {
                        B b7 = (B) this.f11154c;
                        InterfaceC0835l interfaceC0835l = b7.mLifecycleFragment;
                        Activity activity = b7.getActivity();
                        PendingIntent pendingIntent = connectionResult.f11062c;
                        com.google.android.gms.common.internal.D.i(pendingIntent);
                        int i7 = ((W) this.f11153b).f11150a;
                        int i8 = GoogleApiActivity.f11073b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i7);
                        intent.putExtra("notify_manager", false);
                        interfaceC0835l.startActivityForResult(intent, 1);
                        return;
                    }
                    B b8 = (B) this.f11154c;
                    if (b8.f11095d.a(b8.getActivity(), connectionResult.f11061b, null) != null) {
                        B b9 = (B) this.f11154c;
                        com.google.android.gms.common.c cVar = b9.f11095d;
                        Activity activity2 = b9.getActivity();
                        B b10 = (B) this.f11154c;
                        cVar.j(activity2, b10.mLifecycleFragment, connectionResult.f11061b, b10);
                        return;
                    }
                    if (connectionResult.f11061b != 18) {
                        B b11 = (B) this.f11154c;
                        int i9 = ((W) this.f11153b).f11150a;
                        b11.f11093b.set(null);
                        b11.f11097f.h(connectionResult, i9);
                        return;
                    }
                    B b12 = (B) this.f11154c;
                    com.google.android.gms.common.c cVar2 = b12.f11095d;
                    Activity activity3 = b12.getActivity();
                    B b13 = (B) this.f11154c;
                    cVar2.getClass();
                    ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                    builder.setView(progressBar);
                    builder.setMessage(com.google.android.gms.common.internal.s.b(18, activity3));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    com.google.android.gms.common.c.h(activity3, create, "GooglePlayServicesUpdatingDialog", b13);
                    B b14 = (B) this.f11154c;
                    com.google.android.gms.common.c cVar3 = b14.f11095d;
                    Context applicationContext = b14.getActivity().getApplicationContext();
                    A a2 = new A(this, create);
                    cVar3.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme(SentryStackFrame.JsonKeys.PACKAGE);
                    G g3 = new G(a2);
                    zao.zaa(applicationContext, g3, intentFilter);
                    g3.f11117b = applicationContext;
                    if (com.google.android.gms.common.g.zza(applicationContext, "com.google.android.gms")) {
                        return;
                    }
                    B b15 = (B) this.f11154c;
                    b15.f11093b.set(null);
                    zau zauVar = b15.f11097f.f11181E;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    synchronized (g3) {
                        try {
                            Context context = (Context) g3.f11117b;
                            if (context != null) {
                                context.unregisterReceiver(g3);
                            }
                            g3.f11117b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                H2.r rVar = (H2.r) this.f11154c;
                D d7 = (D) ((C0831h) rVar.f3296g).f11177A.get((C0824a) rVar.f3292c);
                if (d7 == null) {
                    return;
                }
                ConnectionResult connectionResult2 = (ConnectionResult) this.f11153b;
                if (!(connectionResult2.f11061b == 0)) {
                    d7.m(connectionResult2, null);
                    return;
                }
                rVar.f3293d = true;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) rVar.f3291b;
                if (gVar.requiresSignIn()) {
                    if (!rVar.f3293d || (interfaceC0860l = (InterfaceC0860l) rVar.f3294e) == null) {
                        return;
                    }
                    gVar.getRemoteService(interfaceC0860l, (Set) rVar.f3295f);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e7) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
                    gVar.disconnect("Failed to get service from broker.");
                    d7.m(new ConnectionResult(10), null);
                    return;
                }
            default:
                zak zakVar = (zak) this.f11153b;
                ConnectionResult connectionResult3 = zakVar.f11564b;
                boolean z4 = connectionResult3.f11061b == 0;
                M m7 = (M) this.f11154c;
                if (z4) {
                    zav zavVar = zakVar.f11565c;
                    com.google.android.gms.common.internal.D.i(zavVar);
                    ConnectionResult connectionResult4 = zavVar.f11346c;
                    if (connectionResult4.f11061b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult4)), new Exception());
                        m7.f11138x.f(connectionResult4);
                        m7.f11137f.disconnect();
                        return;
                    }
                    H2.r rVar2 = m7.f11138x;
                    IBinder iBinder = zavVar.f11345b;
                    if (iBinder != null) {
                        int i10 = AbstractBinderC0849a.f11301a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0860l2 = queryLocalInterface instanceof InterfaceC0860l ? (InterfaceC0860l) queryLocalInterface : new com.google.android.gms.common.internal.P(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    rVar2.getClass();
                    if (interfaceC0860l2 == null || (set = m7.f11135d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar2.f(new ConnectionResult(4));
                    } else {
                        rVar2.f3294e = interfaceC0860l2;
                        rVar2.f3295f = set;
                        if (rVar2.f3293d) {
                            ((com.google.android.gms.common.api.g) rVar2.f3291b).getRemoteService(interfaceC0860l2, set);
                        }
                    }
                } else {
                    m7.f11138x.f(connectionResult3);
                }
                m7.f11137f.disconnect();
                return;
        }
    }
}
