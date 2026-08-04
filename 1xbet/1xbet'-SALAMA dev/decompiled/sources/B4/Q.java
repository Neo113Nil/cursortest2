package B4;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1120a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f1121b = S.f1125g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f1122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Task f1123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f1124e;

    public Q() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f1122c = taskCompletionSource;
        this.f1123d = taskCompletionSource.getTask();
        this.f1124e = new ArrayDeque();
    }

    public final void a(I i7) {
        synchronized (this.f1120a) {
            try {
                S s7 = this.f1121b;
                S s8 = new S(s7.f1126a, s7.f1127b, s7.f1128c, s7.f1129d, i7, 1);
                this.f1121b = s8;
                for (P p5 : this.f1124e) {
                    p5.getClass();
                    p5.f1118a.execute(new A0.f(4, p5, s8));
                }
                this.f1124e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1122c.setException(i7);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f1123d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        return this.f1123d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f1123d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        return this.f1123d.addOnSuccessListener(onSuccessListener);
    }

    public final void b(S s7) {
        String str;
        boolean zB = p136t.e.b(s7.f1130e, 3);
        int i7 = s7.f1130e;
        if (i7 == 1) {
            str = "ERROR";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "SUCCESS";
        } else {
            str = "RUNNING";
        }
        p113p3.f.O("Expected success, but was ".concat(str), zB, new Object[0]);
        synchronized (this.f1120a) {
            try {
                this.f1121b = s7;
                for (P p5 : this.f1124e) {
                    S s8 = this.f1121b;
                    p5.getClass();
                    p5.f1118a.execute(new A0.f(4, p5, s8));
                }
                this.f1124e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1122c.setResult(s7);
    }

    public final void c(S s7) {
        synchronized (this.f1120a) {
            try {
                this.f1121b = s7;
                for (P p5 : this.f1124e) {
                    p5.getClass();
                    p5.f1118a.execute(new A0.f(4, p5, s7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        return this.f1123d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return this.f1123d.continueWithTask(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        return this.f1123d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        return (S) this.f1123d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f1123d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return this.f1123d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return this.f1123d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        return this.f1123d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f1123d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        return this.f1123d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f1123d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        return this.f1123d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        return this.f1123d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        return this.f1123d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        return (S) this.f1123d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return this.f1123d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f1123d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        return this.f1123d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f1123d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        return this.f1123d.addOnSuccessListener(activity, onSuccessListener);
    }
}
