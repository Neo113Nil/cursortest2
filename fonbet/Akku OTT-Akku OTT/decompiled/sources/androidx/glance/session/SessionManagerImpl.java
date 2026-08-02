package androidx.glance.session;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.DirectExecutor;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.common.util.concurrent.u;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1096l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\bH\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/glance/session/SessionManagerImpl;", "Landroidx/glance/session/SessionManager;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "(Ljava/lang/Class;)V", "sessions", "", "", "Landroidx/glance/session/Session;", "closeSession", "", Constants.KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueDelayedWorker", "context", "Landroid/content/Context;", "getSession", "isSessionRunning", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "session", "(Landroid/content/Context;Landroidx/glance/session/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionManager.kt\nandroidx/glance/session/SessionManagerImpl\n+ 2 Data.kt\nandroidx/work/DataKt\n+ 3 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n31#2,5:134\n41#3,8:139\n49#3:156\n61#3,7:157\n41#3,8:166\n49#3:183\n61#3,7:184\n310#4,9:147\n319#4,2:164\n310#4,9:174\n319#4,2:191\n1747#5,3:193\n*S KotlinDebug\n*F\n+ 1 SessionManager.kt\nandroidx/glance/session/SessionManagerImpl\n*L\n85#1:134,5\n92#1:139,8\n92#1:156\n92#1:157,7\n101#1:166,8\n101#1:183\n101#1:184,7\n92#1:147,9\n92#1:164,2\n101#1:174,9\n101#1:191,2\n102#1:193,3\n*E\n"})
/* loaded from: classes.dex */
public final class SessionManagerImpl implements SessionManager {
    private static final boolean DEBUG = false;
    private static final String TAG = "GlanceSessionManager";
    private final Map<String, Session> sessions = new LinkedHashMap();
    private final Class<? extends ListenableWorker> workerClass;

    public SessionManagerImpl(Class<? extends ListenableWorker> cls) {
        this.workerClass = cls;
    }

    private final void enqueueDelayedWorker(Context context) {
        WorkManager.getInstance(context).enqueueUniqueWork("sessionWorkerKeepEnabled", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(this.workerClass).setInitialDelay(3650L, TimeUnit.DAYS).setConstraints(new Constraints.Builder().setRequiresCharging(true).build()).build());
    }

    @Override // androidx.glance.session.SessionManager
    public Object closeSession(String str, Continuation<? super Unit> continuation) {
        Session remove;
        synchronized (this.sessions) {
            remove = this.sessions.remove(str);
        }
        if (remove != null) {
            remove.close();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.glance.session.SessionManager
    public Session getSession(String key) {
        Session session;
        synchronized (this.sessions) {
            session = this.sessions.get(key);
        }
        return session;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r8 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[EDGE_INSN: B:35:0x00d3->B:15:0x00d3 BREAK  A[LOOP:0: B:20:0x00af->B:34:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.glance.session.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isSessionRunning(Context context, String str, Continuation<? super Boolean> continuation) {
        SessionManagerImpl$isSessionRunning$1 sessionManagerImpl$isSessionRunning$1;
        int i;
        Object obj;
        String str2;
        SessionManagerImpl sessionManagerImpl;
        SessionManagerImpl sessionManagerImpl2;
        Iterable iterable;
        Iterator it;
        if (continuation instanceof SessionManagerImpl$isSessionRunning$1) {
            sessionManagerImpl$isSessionRunning$1 = (SessionManagerImpl$isSessionRunning$1) continuation;
            int i2 = sessionManagerImpl$isSessionRunning$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$isSessionRunning$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sessionManagerImpl$isSessionRunning$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionManagerImpl$isSessionRunning$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    final u<List<WorkInfo>> workInfosForUniqueWork = WorkManager.getInstance(context).getWorkInfosForUniqueWork(str);
                    if (workInfosForUniqueWork.isDone()) {
                        try {
                            obj = workInfosForUniqueWork.get();
                            str2 = str;
                            sessionManagerImpl = this;
                            iterable = (Iterable) obj;
                            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                it = iterable.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (((WorkInfo) it.next()).getState() == WorkInfo.State.RUNNING) {
                                        synchronized (sessionManagerImpl.sessions) {
                                            boolean containsKey = sessionManagerImpl.sessions.containsKey(str2);
                                        }
                                    }
                                }
                            }
                            z = false;
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            boxBoolean.getClass();
                            return boxBoolean;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            throw cause;
                        }
                    }
                    sessionManagerImpl$isSessionRunning$1.L$0 = this;
                    sessionManagerImpl$isSessionRunning$1.L$1 = str;
                    sessionManagerImpl$isSessionRunning$1.L$2 = workInfosForUniqueWork;
                    sessionManagerImpl$isSessionRunning$1.label = 1;
                    final C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(sessionManagerImpl$isSessionRunning$1));
                    c1100n.r();
                    workInfosForUniqueWork.addListener(new Runnable() { // from class: androidx.glance.session.SessionManagerImpl$isSessionRunning$$inlined$await$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                InterfaceC1096l.this.resumeWith(Result.m1716constructorimpl(workInfosForUniqueWork.get()));
                            } catch (Throwable th) {
                                Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    cause2 = th;
                                }
                                if (th instanceof CancellationException) {
                                    InterfaceC1096l.this.cancel(cause2);
                                    return;
                                }
                                InterfaceC1096l interfaceC1096l = InterfaceC1096l.this;
                                Result.Companion companion = Result.INSTANCE;
                                interfaceC1096l.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(cause2)));
                            }
                        }
                    }, DirectExecutor.INSTANCE);
                    c1100n.t(new Function1<Throwable, Unit>() { // from class: androidx.glance.session.SessionManagerImpl$isSessionRunning$$inlined$await$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            u.this.cancel(false);
                        }
                    });
                    obj2 = c1100n.q();
                    if (obj2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(sessionManagerImpl$isSessionRunning$1);
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionManagerImpl2 = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) sessionManagerImpl$isSessionRunning$1.L$1;
                    sessionManagerImpl2 = (SessionManagerImpl) sessionManagerImpl$isSessionRunning$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                String str3 = str;
                sessionManagerImpl = sessionManagerImpl2;
                obj = obj2;
                str2 = str3;
                iterable = (Iterable) obj;
                if (iterable instanceof Collection) {
                }
                it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                z = false;
                Boolean boxBoolean2 = Boxing.boxBoolean(z);
                boxBoolean2.getClass();
                return boxBoolean2;
            }
        }
        sessionManagerImpl$isSessionRunning$1 = new SessionManagerImpl$isSessionRunning$1(this, continuation);
        Object obj22 = sessionManagerImpl$isSessionRunning$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionManagerImpl$isSessionRunning$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        String str32 = str;
        sessionManagerImpl = sessionManagerImpl2;
        obj = obj22;
        str2 = str32;
        iterable = (Iterable) obj;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        z2 = false;
        Boolean boxBoolean22 = Boxing.boxBoolean(z2);
        boxBoolean22.getClass();
        return boxBoolean22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.glance.session.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startSession(Context context, Session session, Continuation<? super Unit> continuation) {
        SessionManagerImpl$startSession$1 sessionManagerImpl$startSession$1;
        int i;
        Session put;
        SessionManagerImpl sessionManagerImpl;
        if (continuation instanceof SessionManagerImpl$startSession$1) {
            sessionManagerImpl$startSession$1 = (SessionManagerImpl$startSession$1) continuation;
            int i2 = sessionManagerImpl$startSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$startSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sessionManagerImpl$startSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionManagerImpl$startSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    synchronized (this.sessions) {
                        put = this.sessions.put(session.getKey(), session);
                    }
                    if (put != null) {
                        put.close();
                    }
                    OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(this.workerClass);
                    Pair[] pairArr = {TuplesKt.to(getKeyParam(), session.getKey())};
                    Data.Builder builder2 = new Data.Builder();
                    Pair pair = pairArr[0];
                    builder2.put((String) pair.getFirst(), pair.getSecond());
                    Data build = builder2.build();
                    Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
                    final u<Operation.State.SUCCESS> result = WorkManager.getInstance(context).enqueueUniqueWork(session.getKey(), ExistingWorkPolicy.REPLACE, builder.setInputData(build).build()).getResult();
                    if (result.isDone()) {
                        try {
                            result.get();
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            throw cause;
                        }
                    } else {
                        sessionManagerImpl$startSession$1.L$0 = this;
                        sessionManagerImpl$startSession$1.L$1 = context;
                        sessionManagerImpl$startSession$1.L$2 = result;
                        sessionManagerImpl$startSession$1.label = 1;
                        final C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(sessionManagerImpl$startSession$1));
                        c1100n.r();
                        result.addListener(new Runnable() { // from class: androidx.glance.session.SessionManagerImpl$startSession$$inlined$await$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    InterfaceC1096l.this.resumeWith(Result.m1716constructorimpl(result.get()));
                                } catch (Throwable th) {
                                    Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        cause2 = th;
                                    }
                                    if (th instanceof CancellationException) {
                                        InterfaceC1096l.this.cancel(cause2);
                                        return;
                                    }
                                    InterfaceC1096l interfaceC1096l = InterfaceC1096l.this;
                                    Result.Companion companion = Result.INSTANCE;
                                    interfaceC1096l.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(cause2)));
                                }
                            }
                        }, DirectExecutor.INSTANCE);
                        c1100n.t(new Function1<Throwable, Unit>() { // from class: androidx.glance.session.SessionManagerImpl$startSession$$inlined$await$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                u.this.cancel(false);
                            }
                        });
                        Object q = c1100n.q();
                        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(sessionManagerImpl$startSession$1);
                        }
                        if (q == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    sessionManagerImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) sessionManagerImpl$startSession$1.L$1;
                    sessionManagerImpl = (SessionManagerImpl) sessionManagerImpl$startSession$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sessionManagerImpl.enqueueDelayedWorker(context);
                return Unit.INSTANCE;
            }
        }
        sessionManagerImpl$startSession$1 = new SessionManagerImpl$startSession$1(this, continuation);
        Object obj2 = sessionManagerImpl$startSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionManagerImpl$startSession$1.label;
        if (i != 0) {
        }
        sessionManagerImpl.enqueueDelayedWorker(context);
        return Unit.INSTANCE;
    }
}
