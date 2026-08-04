package p042f4;

import B3.g;
import G4.A;
import Q3.o;
import Y3.i;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.internal.D;
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
import p034e4.f;
import p034e4.h;
import p034e4.j;
import p155w1.C1013m0;

/* JADX INFO: renamed from: f4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0894c implements Continuation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0894c f12937c = new C0894c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12939b;

    public /* synthetic */ C0894c(int i7) {
        this.f12938a = i7;
    }

    public static void b(FirebaseAuth firebaseAuth, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task taskForException;
        if (activity == null) {
            taskCompletionSource.setException(new f("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow"));
            return;
        }
        i iVar = firebaseAuth.f11849a;
        iVar.b();
        s.b(iVar.f7663a, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (g.f1061d == null) {
            g gVar = new g(5);
            gVar.f1063b = false;
            g.f1061d = gVar;
        }
        g gVar2 = g.f1061d;
        if (gVar2.f1063b) {
            taskForException = Tasks.forException(zzadg.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        } else {
            gVar2.l(activity, new G(gVar2, activity, taskCompletionSource2));
            gVar2.f1063b = true;
            new zzaep(firebaseAuth, activity).zza();
            taskForException = taskCompletionSource2.getTask();
        }
        taskForException.addOnSuccessListener(new B(1, taskCompletionSource)).addOnFailureListener(new C0901j(taskCompletionSource, 1));
    }

    public Task a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, boolean z7, boolean z8, RecaptchaAction recaptchaAction) {
        A a2 = firebaseAuth.f11855g;
        A a4 = A.f12907c;
        i iVar = firebaseAuth.f11849a;
        if (zzafb.zza(iVar) || a2.f2871a) {
            return Tasks.forResult(new F(null, null, null));
        }
        Log.i("c", "ForceRecaptchaV2Flow from phoneAuthOptions = " + z7 + ", ForceRecaptchav2Flow from firebaseSettings = " + a2.f2872b);
        boolean z9 = z7 || a2.f2872b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        s sVar = a4.f12908a;
        sVar.getClass();
        Task task = System.currentTimeMillis() - sVar.f12972b < 3600000 ? sVar.f12971a : null;
        if (task != null) {
            if (task.isSuccessful()) {
                return Tasks.forResult(new F((String) task.getResult(), null, null));
            }
            Log.e("c", "Error in previous reCAPTCHAV2 flow: " + task.getException().getMessage());
            Log.e("c", "Continuing with application verification as normal");
        }
        if (z9 || z8) {
            c(firebaseAuth, str, activity, z4, z9, a4, taskCompletionSource);
        } else {
            if (firebaseAuth.f11859l == null) {
                firebaseAuth.f11859l = new o(iVar, firebaseAuth);
            }
            Task taskContinueWithTask = firebaseAuth.f11859l.q(firebaseAuth.f11858k, Boolean.FALSE).continueWithTask(new C1013m0(16));
            v vVar = new v();
            vVar.f12976a = this;
            vVar.f12977b = taskCompletionSource;
            vVar.f12978c = firebaseAuth;
            vVar.f12979d = recaptchaAction;
            vVar.f12980e = str;
            vVar.f12981f = activity;
            vVar.f12982g = z4;
            vVar.f12983h = a4;
            taskContinueWithTask.addOnCompleteListener(vVar);
        }
        return taskCompletionSource.getTask();
    }

    public void c(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z4, boolean z7, A a2, TaskCompletionSource taskCompletionSource) {
        if (!z4 || z7) {
            b(firebaseAuth, activity, taskCompletionSource);
            return;
        }
        i iVar = firebaseAuth.f11849a;
        iVar.b();
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(iVar.f7663a);
        Task<TContinuationResult> taskContinueWithTask = (!TextUtils.isEmpty((String) this.f12939b) ? Tasks.forResult(new zzagh((String) this.f12939b)) : firebaseAuth.f11853e.zza()).continueWithTask(firebaseAuth.f11873z, new D(this, str, integrityManagerCreate));
        n nVar = new n();
        nVar.f12957a = this;
        nVar.f12958b = taskCompletionSource;
        nVar.f12959c = firebaseAuth;
        nVar.f12960d = activity;
        taskContinueWithTask.addOnCompleteListener(nVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f12938a) {
            case 1:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                String str = ((j) task.getResult()).f12687a;
                C0897f c0897f = (C0897f) this.f12939b;
                D.e(str);
                zzao zzaoVar = new zzao();
                zzaoVar.f11925a = str;
                zzaoVar.f11929e = c0897f.f12941a;
                return Tasks.forResult(zzaoVar);
            case 2:
                zze zzeVar = ((zzaj) this.f12939b).f11922d;
                if (zzeVar == null) {
                    return task;
                }
                if (task.isSuccessful()) {
                    zzx zzxVar = (zzx) ((AuthResult) task.getResult());
                    return Tasks.forResult(new zzx(zzxVar.f11936a, zzxVar.f11937b, zzeVar));
                }
                Exception exception = task.getException();
                if (exception instanceof h) {
                    ((h) exception).f12684b = zzeVar;
                }
                return Tasks.forException(exception);
            case 3:
                boolean zIsSuccessful = task.isSuccessful();
                p113p3.f fVar = (p113p3.f) this.f12939b;
                if (zIsSuccessful) {
                    return fVar.j0((String) task.getResult());
                }
                Exception exception2 = task.getException();
                D.i(exception2);
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception2.getMessage() + "\n\n Failing open with a fake token.");
                return fVar.j0("NO_RECAPTCHA");
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f12939b);
                }
                Exception exception3 = task.getException();
                D.i(exception3);
                if (!(exception3 instanceof t)) {
                    return Tasks.forException(exception3);
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception3.getMessage());
                }
                return Tasks.forResult("");
        }
    }

    public /* synthetic */ C0894c(Object obj, int i7) {
        this.f12938a = i7;
        this.f12939b = obj;
    }
}
