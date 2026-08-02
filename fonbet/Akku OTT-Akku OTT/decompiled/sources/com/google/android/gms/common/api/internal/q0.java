package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import androidx.annotation.MainThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes4.dex */
public final class q0 implements Runnable {
    public final o0 a;
    public final /* synthetic */ r0 b;

    public q0(r0 r0Var, o0 o0Var) {
        this.b = r0Var;
        this.a = o0Var;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.b.a) {
            C0852b c0852b = this.a.b;
            if (c0852b.l()) {
                r0 r0Var = this.b;
                InterfaceC0837k interfaceC0837k = r0Var.mLifecycleFragment;
                Activity activity = r0Var.getActivity();
                PendingIntent pendingIntent = c0852b.c;
                C0875q.g(pendingIntent);
                int i = this.a.a;
                int i2 = GoogleApiActivity.b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                interfaceC0837k.startActivityForResult(intent, 1);
                return;
            }
            r0 r0Var2 = this.b;
            if (r0Var2.d.a(r0Var2.getActivity(), c0852b.b, null) != null) {
                r0 r0Var3 = this.b;
                r0Var3.d.h(r0Var3.getActivity(), r0Var3.mLifecycleFragment, c0852b.b, this.b);
                return;
            }
            if (c0852b.b != 18) {
                this.b.a(c0852b, this.a.a);
                return;
            }
            r0 r0Var4 = this.b;
            C0855e c0855e = r0Var4.d;
            Activity activity2 = r0Var4.getActivity();
            c0855e.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.A.b(activity2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            C0855e.f(activity2, create, "GooglePlayServicesUpdatingDialog", r0Var4);
            r0 r0Var5 = this.b;
            Context applicationContext = r0Var5.getActivity().getApplicationContext();
            p0 p0Var = new p0(this, create);
            r0Var5.d.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            P p = new P(p0Var);
            zao.zaa(applicationContext, p, intentFilter);
            p.a = applicationContext;
            if (com.google.android.gms.common.j.b(applicationContext)) {
                return;
            }
            r0 r0Var6 = this.b;
            r0Var6.b.set(null);
            zau zauVar = ((B) r0Var6).f.p;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            if (create.isShowing()) {
                create.dismiss();
            }
            synchronized (p) {
                try {
                    Context context = p.a;
                    if (context != null) {
                        context.unregisterReceiver(p);
                    }
                    p.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
