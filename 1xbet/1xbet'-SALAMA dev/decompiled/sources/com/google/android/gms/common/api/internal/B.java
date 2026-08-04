package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class B extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f11092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zau f11094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.c f11095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p122r.c f11096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0787h f11097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(InterfaceC0791l interfaceC0791l, C0787h c0787h) {
        super(interfaceC0791l);
        com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
        this.f11093b = new AtomicReference(null);
        this.f11094c = new zau(Looper.getMainLooper());
        this.f11095d = cVar;
        this.f11096e = new p122r.c(0);
        this.f11097f = c0787h;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i7, int i8, Intent intent) {
        AtomicReference atomicReference = this.f11093b;
        W w7 = (W) atomicReference.get();
        C0787h c0787h = this.f11097f;
        if (i7 != 1) {
            if (i7 == 2) {
                int iD = this.f11095d.d(getActivity(), com.google.android.gms.common.d.f11216a);
                if (iD == 0) {
                    atomicReference.set(null);
                    zau zauVar = c0787h.f11181E;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (w7 == null) {
                        return;
                    }
                    if (w7.f11151b.f11061b == 18 && iD == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            atomicReference.set(null);
            zau zauVar2 = c0787h.f11181E;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i8 == 0) {
            if (w7 == null) {
                return;
            }
            ConnectionResult connectionResult = new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, w7.f11151b.toString());
            atomicReference.set(null);
            c0787h.h(connectionResult, w7.f11150a);
            return;
        }
        if (w7 != null) {
            atomicReference.set(null);
            c0787h.h(w7.f11151b, w7.f11150a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.f11093b;
        W w7 = (W) atomicReference.get();
        int i7 = w7 == null ? -1 : w7.f11150a;
        atomicReference.set(null);
        this.f11097f.h(connectionResult, i7);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11093b.set(bundle.getBoolean("resolving_error", false) ? new W(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f11096e.isEmpty()) {
            return;
        }
        this.f11097f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        W w7 = (W) this.f11093b.get();
        if (w7 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", w7.f11150a);
        ConnectionResult connectionResult = w7.f11151b;
        bundle.putInt("failed_status", connectionResult.f11061b);
        bundle.putParcelable("failed_resolution", connectionResult.f11062c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        this.f11092a = true;
        if (this.f11096e.isEmpty()) {
            return;
        }
        this.f11097f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f11092a = false;
        C0787h c0787h = this.f11097f;
        c0787h.getClass();
        synchronized (C0787h.f11175I) {
            try {
                if (c0787h.f11178B == this) {
                    c0787h.f11178B = null;
                    c0787h.f11179C.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
