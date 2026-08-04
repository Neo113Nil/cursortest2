package p042f4;

import B3.g;
import Y3.i;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.zze;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p003a.a;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f12961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f12962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f12963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseUser f12964d;

    public o(g gVar, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f12961a = new WeakReference(activity);
        this.f12962b = taskCompletionSource;
        this.f12963c = firebaseAuth;
        this.f12964d = firebaseUser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        Activity activity = (Activity) this.f12961a.get();
        TaskCompletionSource taskCompletionSource = this.f12962b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            g.m(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap map = y.f12992a;
            if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    taskCompletionSource.setException(zzadg.zza(a.y0("WEB_CONTEXT_CANCELED")));
                    g.m(context);
                    return;
                }
                return;
            }
            D.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            taskCompletionSource.setException(zzadg.zza((Status) (byteArrayExtra != null ? a.Q(byteArrayExtra, creator) : null)));
            g.m(context);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f12963c.f(g.k(intent)).addOnSuccessListener(new C0903l(taskCompletionSource, context, i9)).addOnFailureListener(new m(taskCompletionSource, context, i9));
            return;
        }
        boolean zEquals = "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra);
        FirebaseUser firebaseUser = this.f12964d;
        if (zEquals) {
            zze zzeVarK = g.k(intent);
            firebaseUser.getClass();
            FirebaseAuth.getInstance(i.f(((zzad) firebaseUser).f11910c)).g(firebaseUser, zzeVarK).addOnSuccessListener(new C0903l(taskCompletionSource, context, i8)).addOnFailureListener(new m(taskCompletionSource, context, i8));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            zze zzeVarK2 = g.k(intent);
            firebaseUser.getClass();
            FirebaseAuth.getInstance(i.f(((zzad) firebaseUser).f11910c)).o(firebaseUser, zzeVarK2).addOnSuccessListener(new C0903l(taskCompletionSource, context, i7)).addOnFailureListener(new m(taskCompletionSource, context, i7));
        } else {
            taskCompletionSource.setException(zzadg.zza(a.y0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
