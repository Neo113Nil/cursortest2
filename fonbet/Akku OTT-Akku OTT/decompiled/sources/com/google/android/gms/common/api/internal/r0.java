package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class r0 extends C0836j implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final zau c;
    public final C0855e d;

    @VisibleForTesting
    public r0(InterfaceC0837k interfaceC0837k, C0855e c0855e) {
        super(interfaceC0837k);
        this.b = new AtomicReference(null);
        this.c = new zau(Looper.getMainLooper());
        this.d = c0855e;
    }

    public final void a(C0852b c0852b, int i) {
        this.b.set(null);
        ((B) this).f.i(c0852b, i);
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public final void onActivityResult(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.b;
        o0 o0Var = (o0) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int c = this.d.c(getActivity(), C0856f.a);
                if (c == 0) {
                    atomicReference.set(null);
                    zau zauVar = ((B) this).f.p;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (o0Var == null) {
                        return;
                    }
                    if (o0Var.b.b == 18 && c == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            zau zauVar2 = ((B) this).f.p;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (o0Var != null) {
                a(new C0852b(1, o0Var.b.toString(), null, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13), o0Var.a);
                return;
            }
            return;
        }
        if (o0Var != null) {
            a(o0Var.b, o0Var.a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0852b c0852b = new C0852b(13, null);
        o0 o0Var = (o0) this.b.get();
        a(c0852b, o0Var == null ? -1 : o0Var.a);
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new o0(new C0852b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o0 o0Var = (o0) this.b.get();
        if (o0Var == null) {
            return;
        }
        C0852b c0852b = o0Var.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", o0Var.a);
        bundle.putInt("failed_status", c0852b.b);
        bundle.putParcelable("failed_resolution", c0852b.c);
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public void onStart() {
        super.onStart();
        this.a = true;
    }

    @Override // com.google.android.gms.common.api.internal.C0836j
    public void onStop() {
        super.onStop();
        this.a = false;
    }
}
