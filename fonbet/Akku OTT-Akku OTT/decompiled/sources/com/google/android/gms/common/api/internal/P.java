package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes4.dex */
public final class P extends BroadcastReceiver {

    @Nullable
    public Context a;
    public final p0 b;

    public P(p0 p0Var) {
        this.b = p0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            p0 p0Var = this.b;
            r0 r0Var = p0Var.b.b;
            r0Var.b.set(null);
            zau zauVar = ((B) r0Var).f.p;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            AlertDialog alertDialog = p0Var.a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
