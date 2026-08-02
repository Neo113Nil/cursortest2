package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.InterfaceC1120x0;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$transferBytes$2", f = "TaskWorker.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6}, l = {661, 667, 668, 667, 668, 667, 668}, m = "invokeSuspend", n = {"$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter", "$this$withContext", "readerJob", "testerJob", "doneCompleter"}, nl = {667, 668, 661, 668, 665, 668, -1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes3.dex */
public final class l1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super W0>, Object> {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public W0 e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ M0 j;
    public final /* synthetic */ TaskWorker k;
    public final /* synthetic */ InputStream l;
    public final /* synthetic */ byte[] m;
    public final /* synthetic */ Ref.IntRef n;
    public final /* synthetic */ OutputStream o;
    public final /* synthetic */ long p;

    @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$transferBytes$2$1", f = "TaskWorker.kt", i = {0, 0, 0}, l = {636}, m = "invokeSuspend", n = {"$this$launch", "expectedFileSize", NotificationCompat.CATEGORY_PROGRESS}, nl = {639}, s = {"L$0", "J$0", "D$0"}, v = 2)
    @SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$transferBytes$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,856:1\n1#2:857\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ InputStream c;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ C1117w e;
        public final /* synthetic */ Ref.IntRef f;
        public final /* synthetic */ OutputStream i;
        public final /* synthetic */ TaskWorker j;
        public final /* synthetic */ M0 k;
        public final /* synthetic */ long l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, byte[] bArr, C1117w c1117w, Ref.IntRef intRef, OutputStream outputStream, TaskWorker taskWorker, M0 m0, long j, Continuation continuation) {
            super(2, continuation);
            this.c = inputStream;
            this.d = bArr;
            this.e = c1117w;
            this.f = intRef;
            this.i = outputStream;
            this.j = taskWorker;
            this.k = m0;
            this.l = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.j, this.k, this.l, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C1117w c1117w;
            kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            while (true) {
                InputStream inputStream = this.c;
                byte[] bArr = this.d;
                int read = inputStream.read(bArr, 0, 8192);
                Ref.IntRef intRef = this.f;
                intRef.element = read;
                c1117w = this.e;
                if (read == -1) {
                    break;
                }
                if (!kotlinx.coroutines.L.d(k)) {
                    c1117w.M(W0.f);
                    break;
                }
                int i2 = intRef.element;
                TaskWorker taskWorker = this.j;
                if (i2 > 0) {
                    this.i.write(bArr, 0, i2);
                    taskWorker.c += intRef.element;
                    BDPlugin.INSTANCE.getClass();
                    LinkedHashMap linkedHashMap = BDPlugin.w;
                    M0 m0 = this.k;
                    Long l = (Long) linkedHashMap.get(m0.a);
                    if (l != null) {
                        linkedHashMap.put(m0.a, Boxing.boxLong(l.longValue() - intRef.element));
                    }
                }
                long j = taskWorker.b;
                long j2 = this.l;
                long j3 = j2 + j;
                double min = Double.min((taskWorker.c + j) / j3, 0.999d);
                if (j2 > 0 && taskWorker.o(min, System.currentTimeMillis())) {
                    this.b = k;
                    this.a = 1;
                    if (taskWorker.q(min, j3, this.k, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            c1117w.M(W0.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$transferBytes$2$2", f = "TaskWorker.kt", i = {0}, l = {658}, m = "invokeSuspend", n = {"$this$launch"}, nl = {660}, s = {"L$0"}, v = 2)
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ TaskWorker c;
        public final /* synthetic */ C1117w d;
        public final /* synthetic */ M0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TaskWorker taskWorker, C1117w c1117w, M0 m0, Continuation continuation) {
            super(2, continuation);
            this.c = taskWorker;
            this.d = c1117w;
            this.e = m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                if (kotlinx.coroutines.L.d(k)) {
                    TaskWorker taskWorker = this.c;
                    boolean isStopped = taskWorker.isStopped();
                    C1117w c1117w = this.d;
                    if (isStopped) {
                        c1117w.M(W0.f);
                    } else {
                        BDPlugin.INSTANCE.getClass();
                        if (BDPlugin.p.contains(this.e.a)) {
                            c1117w.M(W0.k);
                        } else if (!taskWorker.k || taskWorker.y) {
                            this.b = k;
                            this.a = 1;
                        } else {
                            c1117w.M(W0.b);
                        }
                    }
                }
                return Unit.INSTANCE;
            } while (kotlinx.coroutines.W.b(100L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(M0 m0, TaskWorker taskWorker, InputStream inputStream, byte[] bArr, Ref.IntRef intRef, OutputStream outputStream, long j, Continuation<? super l1> continuation) {
        super(2, continuation);
        this.j = m0;
        this.k = taskWorker;
        this.l = inputStream;
        this.m = bArr;
        this.n = intRef;
        this.o = outputStream;
        this.p = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        l1 l1Var = new l1(this.j, this.k, this.l, this.m, this.n, this.o, this.p, continuation);
        l1Var.i = obj;
        return l1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super W0> continuation) {
        return ((l1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0133, code lost:
    
        if (com.google.common.base.r.c(r7, r20) == r3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0221, code lost:
    
        if (com.google.common.base.r.c(r6, r20) == r3) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.Q0 q0;
        InterfaceC1120x0 interfaceC1120x0;
        InterfaceC1120x0 interfaceC1120x02;
        InterfaceC1120x0 interfaceC1120x03;
        InterfaceC1120x0 interfaceC1120x04;
        InterfaceC1115v interfaceC1115v;
        InterfaceC1115v interfaceC1115v2;
        Exception exc;
        Object await;
        InterfaceC1120x0 interfaceC1120x05;
        InterfaceC1115v interfaceC1115v3;
        W0 w0;
        InterfaceC1120x0 interfaceC1120x06;
        kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f;
        M0 m0 = this.j;
        TaskWorker taskWorker = this.k;
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                C1117w a2 = C1119x.a();
                try {
                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            q0 = null;
                                            try {
                                                interfaceC1120x03 = C1082i.c(k, kotlinx.coroutines.scheduling.b.a, null, new a(this.l, this.m, a2, this.n, this.o, taskWorker, this.j, this.p, null), 2);
                                            } catch (Exception e) {
                                                e = e;
                                                interfaceC1120x03 = q0;
                                                interfaceC1120x04 = interfaceC1120x03;
                                                interfaceC1115v2 = a2;
                                                exc = e;
                                                try {
                                                    String str = m0.a;
                                                    exc.toString();
                                                    taskWorker.n(exc);
                                                    w0 = W0.f;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    interfaceC1115v = interfaceC1115v2;
                                                    interfaceC1120x02 = interfaceC1120x03;
                                                    interfaceC1120x0 = interfaceC1120x04;
                                                    if (interfaceC1120x02 != null) {
                                                        this.i = SpillingKt.nullOutSpilledVariable(k);
                                                        this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x02);
                                                        this.b = interfaceC1120x0;
                                                        this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v);
                                                        this.d = th;
                                                        this.f = 6;
                                                        break;
                                                    }
                                                    if (interfaceC1120x0 == null) {
                                                    }
                                                }
                                                if (interfaceC1120x03 != null) {
                                                    this.i = SpillingKt.nullOutSpilledVariable(k);
                                                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                                                    this.b = interfaceC1120x04;
                                                    this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v2);
                                                    this.d = SpillingKt.nullOutSpilledVariable(exc);
                                                    this.e = w0;
                                                    this.f = 4;
                                                    if (com.google.common.base.r.c(interfaceC1120x03, this) != coroutine_suspended) {
                                                        interfaceC1120x06 = interfaceC1120x04;
                                                        interfaceC1120x04 = interfaceC1120x06;
                                                    }
                                                }
                                                if (interfaceC1120x04 != null) {
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                interfaceC1120x0 = q0;
                                                interfaceC1120x02 = interfaceC1120x0;
                                                interfaceC1115v = a2;
                                                if (interfaceC1120x02 != null) {
                                                }
                                                if (interfaceC1120x0 == null) {
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            q0 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            q0 = null;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        q0 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        q0 = null;
                                    }
                                    try {
                                        q0 = C1082i.c(k, null, null, new b(taskWorker, a2, m0, null), 3);
                                        this.i = SpillingKt.nullOutSpilledVariable(k);
                                        this.a = interfaceC1120x03;
                                        this.b = q0;
                                        this.c = SpillingKt.nullOutSpilledVariable(a2);
                                        this.f = 1;
                                        await = a2.await(this);
                                        if (await != coroutine_suspended) {
                                            interfaceC1120x05 = q0;
                                            interfaceC1115v3 = a2;
                                            if (interfaceC1120x03 != null) {
                                                this.i = SpillingKt.nullOutSpilledVariable(k);
                                                this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                                                this.b = interfaceC1120x05;
                                                this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v3);
                                                this.d = await;
                                                this.f = 2;
                                                break;
                                            }
                                            if (interfaceC1120x05 != null) {
                                                this.i = SpillingKt.nullOutSpilledVariable(k);
                                                this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                                                this.b = SpillingKt.nullOutSpilledVariable(interfaceC1120x05);
                                                this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v3);
                                                this.d = await;
                                                this.f = 3;
                                                if (com.google.common.base.r.c(interfaceC1120x05, this) == coroutine_suspended) {
                                                }
                                            }
                                            return await;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        interfaceC1120x04 = q0;
                                        interfaceC1115v2 = a2;
                                        exc = e;
                                        String str2 = m0.a;
                                        exc.toString();
                                        taskWorker.n(exc);
                                        w0 = W0.f;
                                        if (interfaceC1120x03 != null) {
                                        }
                                        if (interfaceC1120x04 != null) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        interfaceC1120x0 = q0;
                                        interfaceC1120x02 = interfaceC1120x03;
                                        interfaceC1115v = a2;
                                        if (interfaceC1120x02 != null) {
                                        }
                                        if (interfaceC1120x0 == null) {
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    q0 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    q0 = null;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                q0 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                q0 = null;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            q0 = null;
                        } catch (Throwable th8) {
                            th = th8;
                            q0 = null;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        q0 = null;
                    } catch (Throwable th9) {
                        th = th9;
                        q0 = null;
                    }
                } catch (Exception e9) {
                    e = e9;
                    q0 = null;
                } catch (Throwable th10) {
                    th = th10;
                    q0 = null;
                }
            case 1:
                InterfaceC1115v interfaceC1115v4 = (InterfaceC1115v) this.c;
                interfaceC1120x04 = (InterfaceC1120x0) this.b;
                InterfaceC1120x0 interfaceC1120x07 = (InterfaceC1120x0) this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    interfaceC1115v3 = interfaceC1115v4;
                    interfaceC1120x05 = interfaceC1120x04;
                    interfaceC1120x03 = interfaceC1120x07;
                    if (interfaceC1120x03 != null) {
                    }
                    if (interfaceC1120x05 != null) {
                    }
                    return await;
                } catch (Exception e10) {
                    exc = e10;
                    interfaceC1115v2 = interfaceC1115v4;
                    interfaceC1120x03 = interfaceC1120x07;
                    String str22 = m0.a;
                    exc.toString();
                    taskWorker.n(exc);
                    w0 = W0.f;
                    if (interfaceC1120x03 != null) {
                    }
                    if (interfaceC1120x04 != null) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    interfaceC1115v = interfaceC1115v4;
                    interfaceC1120x0 = interfaceC1120x04;
                    interfaceC1120x02 = interfaceC1120x07;
                    if (interfaceC1120x02 != null) {
                    }
                    if (interfaceC1120x0 == null) {
                    }
                }
                break;
            case 2:
                await = this.d;
                interfaceC1115v3 = (InterfaceC1115v) this.c;
                interfaceC1120x05 = (InterfaceC1120x0) this.b;
                interfaceC1120x03 = (InterfaceC1120x0) this.a;
                ResultKt.throwOnFailure(obj);
                if (interfaceC1120x05 != null) {
                }
                return await;
            case 3:
                Object obj2 = this.d;
                ResultKt.throwOnFailure(obj);
                return obj2;
            case 4:
                w0 = this.e;
                exc = (Exception) this.d;
                interfaceC1115v2 = (InterfaceC1115v) this.c;
                interfaceC1120x06 = (InterfaceC1120x0) this.b;
                interfaceC1120x03 = (InterfaceC1120x0) this.a;
                ResultKt.throwOnFailure(obj);
                interfaceC1120x04 = interfaceC1120x06;
                if (interfaceC1120x04 != null) {
                    return w0;
                }
                this.i = SpillingKt.nullOutSpilledVariable(k);
                this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                this.b = SpillingKt.nullOutSpilledVariable(interfaceC1120x04);
                this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v2);
                this.d = SpillingKt.nullOutSpilledVariable(exc);
                this.e = w0;
                this.f = 5;
                return com.google.common.base.r.c(interfaceC1120x04, this) == coroutine_suspended ? coroutine_suspended : w0;
            case 5:
                W0 w02 = this.e;
                ResultKt.throwOnFailure(obj);
                return w02;
            case 6:
                th = (Throwable) this.d;
                interfaceC1115v = (InterfaceC1115v) this.c;
                interfaceC1120x0 = (InterfaceC1120x0) this.b;
                interfaceC1120x02 = (InterfaceC1120x0) this.a;
                ResultKt.throwOnFailure(obj);
                if (interfaceC1120x0 == null) {
                    throw th;
                }
                this.i = SpillingKt.nullOutSpilledVariable(k);
                this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x02);
                this.b = SpillingKt.nullOutSpilledVariable(interfaceC1120x0);
                this.c = SpillingKt.nullOutSpilledVariable(interfaceC1115v);
                this.d = th;
                this.f = 7;
                if (com.google.common.base.r.c(interfaceC1120x0, this) != coroutine_suspended) {
                    throw th;
                }
                break;
            case 7:
                Throwable th12 = (Throwable) this.d;
                ResultKt.throwOnFailure(obj);
                throw th12;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
