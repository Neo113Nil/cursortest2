package f4;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;
import e4.C1032f;
import e4.C1034h;
import e4.C1036j;
import w1.C1722m0;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1091c implements Continuation {

    /* renamed from: c, reason: collision with root package name */
    public static final C1091c f12931c = new C1091c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12932a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12933b;

    public /* synthetic */ C1091c(int i7) {
        this.f12932a = i7;
    }

    public static void b(FirebaseAuth firebaseAuth, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task forException;
        if (activity == null) {
            taskCompletionSource.setException(new C1032f("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow"));
            return;
        }
        Y3.i iVar = firebaseAuth.f11849a;
        iVar.b();
        s.b(iVar.f7663a, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (B3.g.f1061d == null) {
            B3.g gVar = new B3.g(5);
            gVar.f1063b = false;
            B3.g.f1061d = gVar;
        }
        B3.g gVar2 = B3.g.f1061d;
        if (gVar2.f1063b) {
            forException = Tasks.forException(zzadg.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        } else {
            gVar2.l(activity, new com.google.android.gms.common.api.internal.G(gVar2, activity, taskCompletionSource2));
            gVar2.f1063b = true;
            new zzaep(firebaseAuth, activity).zza();
            forException = taskCompletionSource2.getTask();
        }
        forException.addOnSuccessListener(new C1085B(1, taskCompletionSource)).addOnFailureListener(new C1098j(taskCompletionSource, 1));
    }

    public Task a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, boolean z7, boolean z8, RecaptchaAction recaptchaAction) {
        G4.A a2 = firebaseAuth.f11855g;
        C1084A c1084a = C1084A.f12901c;
        Y3.i iVar = firebaseAuth.f11849a;
        if (zzafb.zza(iVar) || a2.f2871a) {
            return Tasks.forResult(new F(null, null, null));
        }
        Log.i("c", "ForceRecaptchaV2Flow from phoneAuthOptions = " + z7 + ", ForceRecaptchav2Flow from firebaseSettings = " + a2.f2872b);
        boolean z9 = z7 || a2.f2872b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        s sVar = c1084a.f12902a;
        sVar.getClass();
        Task task = System.currentTimeMillis() - sVar.f12966b < 3600000 ? sVar.f12965a : null;
        if (task != null) {
            if (task.isSuccessful()) {
                return Tasks.forResult(new F((String) task.getResult(), null, null));
            }
            Log.e("c", "Error in previous reCAPTCHAV2 flow: " + task.getException().getMessage());
            Log.e("c", "Continuing with application verification as normal");
        }
        if (z9 || z8) {
            c(firebaseAuth, str, activity, z4, z9, c1084a, taskCompletionSource);
        } else {
            if (firebaseAuth.f11859l == null) {
                firebaseAuth.f11859l = new Q3.o(iVar, firebaseAuth);
            }
            Task continueWithTask = firebaseAuth.f11859l.q(firebaseAuth.f11858k, Boolean.FALSE).continueWithTask(new C1722m0(16));
            v vVar = new v();
            vVar.f12970a = this;
            vVar.f12971b = taskCompletionSource;
            vVar.f12972c = firebaseAuth;
            vVar.f12973d = recaptchaAction;
            vVar.f12974e = str;
            vVar.f12975f = activity;
            vVar.f12976g = z4;
            vVar.f12977h = c1084a;
            continueWithTask.addOnCompleteListener(vVar);
        }
        return taskCompletionSource.getTask();
    }

    public void c(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, boolean z7, C1084A c1084a, TaskCompletionSource taskCompletionSource) {
        if (!z4 || z7) {
            b(firebaseAuth, activity, taskCompletionSource);
            return;
        }
        Y3.i iVar = firebaseAuth.f11849a;
        iVar.b();
        IntegrityManager create = IntegrityManagerFactory.create(iVar.f7663a);
        Task<TContinuationResult> continueWithTask = (!TextUtils.isEmpty((String) this.f12933b) ? Tasks.forResult(new zzagh((String) this.f12933b)) : firebaseAuth.f11853e.zza()).continueWithTask(firebaseAuth.f11873z, new C1087D(this, str, create));
        n nVar = new n();
        nVar.f12951a = this;
        nVar.f12952b = taskCompletionSource;
        nVar.f12953c = firebaseAuth;
        nVar.f12954d = activity;
        continueWithTask.addOnCompleteListener(nVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f12932a) {
            case 1:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                String str = ((C1036j) task.getResult()).f12681a;
                C1094f c1094f = (C1094f) this.f12933b;
                com.google.android.gms.common.internal.D.e(str);
                zzao zzaoVar = new zzao();
                zzaoVar.f11925a = str;
                zzaoVar.f11929e = c1094f.f12935a;
                return Tasks.forResult(zzaoVar);
            case 2:
                zze zzeVar = ((zzaj) this.f12933b).f11922d;
                if (zzeVar == null) {
                    return task;
                }
                if (task.isSuccessful()) {
                    zzx zzxVar = (zzx) ((AuthResult) task.getResult());
                    return Tasks.forResult(new zzx(zzxVar.f11936a, zzxVar.f11937b, zzeVar));
                }
                Exception exception = task.getException();
                if (exception instanceof C1034h) {
                    ((C1034h) exception).f12678b = zzeVar;
                }
                return Tasks.forException(exception);
            case 3:
                boolean isSuccessful = task.isSuccessful();
                p3.f fVar = (p3.f) this.f12933b;
                if (isSuccessful) {
                    return fVar.j0((String) task.getResult());
                }
                Exception exception2 = task.getException();
                com.google.android.gms.common.internal.D.i(exception2);
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception2.getMessage() + "\n\n Failing open with a fake token.");
                return fVar.j0("NO_RECAPTCHA");
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f12933b);
                }
                Exception exception3 = task.getException();
                com.google.android.gms.common.internal.D.i(exception3);
                if (!(exception3 instanceof t)) {
                    return Tasks.forException(exception3);
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception3.getMessage());
                }
                return Tasks.forResult("");
        }
    }

    public /* synthetic */ C1091c(Object obj, int i7) {
        this.f12932a = i7;
        this.f12933b = obj;
    }
}
