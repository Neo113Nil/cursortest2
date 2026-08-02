package f4;

import a.AbstractC0603a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.zze;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class o extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12955a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f12956b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f12957c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseUser f12958d;

    public o(B3.g gVar, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f12955a = new WeakReference(activity);
        this.f12956b = taskCompletionSource;
        this.f12957c = firebaseAuth;
        this.f12958d = firebaseUser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        Activity activity = (Activity) this.f12955a.get();
        TaskCompletionSource taskCompletionSource = this.f12956b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzadg.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            B3.g.m(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap hashMap = y.f12986a;
            if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    taskCompletionSource.setException(zzadg.zza(AbstractC0603a.y0("WEB_CONTEXT_CANCELED")));
                    B3.g.m(context);
                    return;
                }
                return;
            }
            com.google.android.gms.common.internal.D.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            taskCompletionSource.setException(zzadg.zza((Status) (byteArrayExtra != null ? AbstractC0603a.Q(byteArrayExtra, creator) : null)));
            B3.g.m(context);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f12957c.f(B3.g.k(intent)).addOnSuccessListener(new C1100l(taskCompletionSource, context, i9)).addOnFailureListener(new m(taskCompletionSource, context, i9));
            return;
        }
        boolean equals = "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra);
        FirebaseUser firebaseUser = this.f12958d;
        if (equals) {
            zze k7 = B3.g.k(intent);
            firebaseUser.getClass();
            FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUser).f11910c)).g(firebaseUser, k7).addOnSuccessListener(new C1100l(taskCompletionSource, context, i8)).addOnFailureListener(new m(taskCompletionSource, context, i8));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            zze k8 = B3.g.k(intent);
            firebaseUser.getClass();
            FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUser).f11910c)).o(firebaseUser, k8).addOnSuccessListener(new C1100l(taskCompletionSource, context, i7)).addOnFailureListener(new m(taskCompletionSource, context, i7));
        } else {
            taskCompletionSource.setException(zzadg.zza(AbstractC0603a.y0("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
