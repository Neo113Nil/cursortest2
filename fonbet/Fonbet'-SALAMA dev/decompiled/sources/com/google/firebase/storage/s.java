package com.google.firebase.storage;

import R5.M;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class s extends b {
    public static final HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f12058k;

    /* renamed from: b, reason: collision with root package name */
    public final O1.k f12060b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.k f12061c;

    /* renamed from: d, reason: collision with root package name */
    public final O1.k f12062d;

    /* renamed from: e, reason: collision with root package name */
    public final O1.k f12063e;

    /* renamed from: i, reason: collision with root package name */
    public r f12067i;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12059a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final O1.k f12064f = new O1.k(this, -465, new M(17));

    /* renamed from: g, reason: collision with root package name */
    public final O1.k f12065g = new O1.k(this, 16, new M(18));

    /* renamed from: h, reason: collision with root package name */
    public volatile int f12066h = 1;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        HashMap hashMap2 = new HashMap();
        f12058k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet(Arrays.asList(256, 64, 128)));
    }

    public s() {
        final int i7 = 0;
        this.f12060b = new O1.k(this, 128, new y(this) { // from class: com.google.firebase.storage.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f12047b;

            {
                this.f12047b = this;
            }

            @Override // com.google.firebase.storage.y
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        s sVar = this.f12047b;
                        sVar.getClass();
                        t.f12068c.a(sVar);
                        ((OnSuccessListener) obj).onSuccess((r) obj2);
                        break;
                    case 1:
                        s sVar2 = this.f12047b;
                        sVar2.getClass();
                        t.f12068c.a(sVar2);
                        ((OnFailureListener) obj).onFailure(((r) obj2).f12056a);
                        break;
                    case 2:
                        s sVar3 = this.f12047b;
                        sVar3.getClass();
                        t.f12068c.a(sVar3);
                        ((OnCompleteListener) obj).onComplete(sVar3);
                        break;
                    default:
                        s sVar4 = this.f12047b;
                        sVar4.getClass();
                        t.f12068c.a(sVar4);
                        ((OnCanceledListener) obj).onCanceled();
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f12061c = new O1.k(this, 64, new y(this) { // from class: com.google.firebase.storage.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f12047b;

            {
                this.f12047b = this;
            }

            @Override // com.google.firebase.storage.y
            public final void a(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        s sVar = this.f12047b;
                        sVar.getClass();
                        t.f12068c.a(sVar);
                        ((OnSuccessListener) obj).onSuccess((r) obj2);
                        break;
                    case 1:
                        s sVar2 = this.f12047b;
                        sVar2.getClass();
                        t.f12068c.a(sVar2);
                        ((OnFailureListener) obj).onFailure(((r) obj2).f12056a);
                        break;
                    case 2:
                        s sVar3 = this.f12047b;
                        sVar3.getClass();
                        t.f12068c.a(sVar3);
                        ((OnCompleteListener) obj).onComplete(sVar3);
                        break;
                    default:
                        s sVar4 = this.f12047b;
                        sVar4.getClass();
                        t.f12068c.a(sVar4);
                        ((OnCanceledListener) obj).onCanceled();
                        break;
                }
            }
        });
        final int i9 = 2;
        this.f12062d = new O1.k(this, 448, new y(this) { // from class: com.google.firebase.storage.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f12047b;

            {
                this.f12047b = this;
            }

            @Override // com.google.firebase.storage.y
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        s sVar = this.f12047b;
                        sVar.getClass();
                        t.f12068c.a(sVar);
                        ((OnSuccessListener) obj).onSuccess((r) obj2);
                        break;
                    case 1:
                        s sVar2 = this.f12047b;
                        sVar2.getClass();
                        t.f12068c.a(sVar2);
                        ((OnFailureListener) obj).onFailure(((r) obj2).f12056a);
                        break;
                    case 2:
                        s sVar3 = this.f12047b;
                        sVar3.getClass();
                        t.f12068c.a(sVar3);
                        ((OnCompleteListener) obj).onComplete(sVar3);
                        break;
                    default:
                        s sVar4 = this.f12047b;
                        sVar4.getClass();
                        t.f12068c.a(sVar4);
                        ((OnCanceledListener) obj).onCanceled();
                        break;
                }
            }
        });
        final int i10 = 3;
        this.f12063e = new O1.k(this, 256, new y(this) { // from class: com.google.firebase.storage.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f12047b;

            {
                this.f12047b = this;
            }

            @Override // com.google.firebase.storage.y
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        s sVar = this.f12047b;
                        sVar.getClass();
                        t.f12068c.a(sVar);
                        ((OnSuccessListener) obj).onSuccess((r) obj2);
                        break;
                    case 1:
                        s sVar2 = this.f12047b;
                        sVar2.getClass();
                        t.f12068c.a(sVar2);
                        ((OnFailureListener) obj).onFailure(((r) obj2).f12056a);
                        break;
                    case 2:
                        s sVar3 = this.f12047b;
                        sVar3.getClass();
                        t.f12068c.a(sVar3);
                        ((OnCompleteListener) obj).onComplete(sVar3);
                        break;
                    default:
                        s sVar4 = this.f12047b;
                        sVar4.getClass();
                        t.f12068c.a(sVar4);
                        ((OnCanceledListener) obj).onCanceled();
                        break;
                }
            }
        });
    }

    public static String c(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? i7 != 32 ? i7 != 64 ? i7 != 128 ? i7 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    public final void a() {
        if (isComplete() || (this.f12066h & 16) != 0 || this.f12066h == 2 || o(256, false)) {
            return;
        }
        o(64, false);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        D.i(onCanceledListener);
        this.f12063e.b(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        D.i(onCompleteListener);
        this.f12062d.b(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        D.i(onFailureListener);
        this.f12061c.b(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        D.i(onSuccessListener);
        this.f12060b.b(null, null, onSuccessListener);
        return this;
    }

    public final r b() {
        r rVar = this.f12067i;
        if (rVar != null) {
            return rVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f12067i == null) {
            this.f12067i = m();
        }
        return this.f12067i;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12062d.b(null, null, new K4.l(this, continuation, taskCompletionSource, 4));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12062d.b(null, null, new p(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public abstract m d();

    public abstract void e();

    public void f() {
    }

    public boolean g() {
        return p(new int[]{16, 8}, true);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        if (b() == null) {
            return null;
        }
        return b().f12056a;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        if (b() == null) {
            throw new IllegalStateException();
        }
        i iVar = b().f12056a;
        if (iVar == null) {
            return b();
        }
        throw new RuntimeExecutionException(iVar);
    }

    public final void h() {
        if (o(2, false)) {
            l();
        }
    }

    public void i() {
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f12066h == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return (this.f12066h & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return (this.f12066h & 128) != 0;
    }

    public boolean j() {
        if (!o(2, true)) {
            return false;
        }
        i();
        l();
        return true;
    }

    public abstract void k();

    public abstract void l();

    public final r m() {
        r n2;
        synchronized (this.f12059a) {
            n2 = n();
        }
        return n2;
    }

    public abstract r n();

    public final boolean o(int i7, boolean z4) {
        return p(new int[]{i7}, z4);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12060b.b(null, null, new q(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public final boolean p(int[] iArr, boolean z4) {
        String substring;
        HashMap hashMap = z4 ? j : f12058k;
        synchronized (this.f12059a) {
            try {
                for (int i7 : iArr) {
                    HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(this.f12066h));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i7))) {
                        this.f12066h = i7;
                        int i8 = this.f12066h;
                        if (i8 == 2) {
                            t tVar = t.f12068c;
                            synchronized (tVar.f12070b) {
                                tVar.f12069a.put(d().toString(), new WeakReference(this));
                            }
                        } else if (i8 == 4) {
                            f();
                        } else if (i8 != 16 && i8 != 64 && i8 != 128 && i8 == 256) {
                            e();
                        }
                        this.f12060b.i();
                        this.f12061c.i();
                        this.f12063e.i();
                        this.f12062d.i();
                        this.f12065g.i();
                        this.f12064f.i();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + c(i7) + " isUser: " + z4 + " from state:" + c(this.f12066h));
                        }
                        return true;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unable to change internal state to: ");
                if (iArr.length == 0) {
                    substring = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i9 : iArr) {
                        sb2.append(c(i9));
                        sb2.append(", ");
                    }
                    substring = sb2.substring(0, sb2.length() - 2);
                }
                sb.append(substring);
                sb.append(" isUser: ");
                sb.append(z4);
                sb.append(" from state:");
                sb.append(c(this.f12066h));
                Log.w("StorageTask", sb.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        D.i(onCanceledListener);
        D.i(executor);
        this.f12063e.b(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        D.i(onCompleteListener);
        D.i(executor);
        this.f12062d.b(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        D.i(onFailureListener);
        D.i(executor);
        this.f12061c.b(null, executor, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        D.i(executor);
        D.i(onSuccessListener);
        this.f12060b.b(null, executor, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12062d.b(null, executor, new K4.l(this, continuation, taskCompletionSource, 4));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        D.i(onCanceledListener);
        D.i(activity);
        this.f12063e.b(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        D.i(onCompleteListener);
        D.i(activity);
        this.f12062d.b(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        D.i(onFailureListener);
        D.i(activity);
        this.f12061c.b(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        D.i(activity);
        D.i(onSuccessListener);
        this.f12060b.b(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12062d.b(null, executor, new p(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12060b.b(null, executor, new q(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        if (b() != null) {
            if (!cls.isInstance(b().f12056a)) {
                i iVar = b().f12056a;
                if (iVar == null) {
                    return b();
                }
                throw new RuntimeExecutionException(iVar);
            }
            throw ((Throwable) cls.cast(b().f12056a));
        }
        throw new IllegalStateException();
    }
}
