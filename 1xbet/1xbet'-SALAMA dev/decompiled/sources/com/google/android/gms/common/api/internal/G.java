package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11116a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11118c;

    public G(B3.g gVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f11117b = new WeakReference(activity);
        this.f11118c = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11116a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    A a2 = (A) this.f11118c;
                    B b7 = (B) ((X) a2.f11091b).f11154c;
                    b7.f11093b.set(null);
                    zau zauVar = b7.f11097f.f11181E;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) a2.f11090a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = (Context) this.f11117b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f11117b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                Activity activity = (Activity) ((WeakReference) this.f11117b).get();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11118c;
                if (activity == null) {
                    Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
                    taskCompletionSource.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
                    B3.g.m(context);
                    return;
                }
                if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
                    String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                    if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                        B3.g.m(context);
                        return;
                    } else {
                        taskCompletionSource.setException(zzadg.zza(p003a.a.y0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                        return;
                    }
                }
                HashMap map = p042f4.y.f12992a;
                if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                    if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                        taskCompletionSource.setException(zzadg.zza(p003a.a.y0("WEB_CONTEXT_CANCELED")));
                        B3.g.m(context);
                        return;
                    }
                    return;
                }
                com.google.android.gms.common.internal.D.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                Parcelable.Creator<Status> creator = Status.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
                taskCompletionSource.setException(zzadg.zza((Status) (byteArrayExtra != null ? p003a.a.Q(byteArrayExtra, creator) : null)));
                B3.g.m(context);
                return;
        }
    }

    public G(A a2) {
        this.f11118c = a2;
    }
}
