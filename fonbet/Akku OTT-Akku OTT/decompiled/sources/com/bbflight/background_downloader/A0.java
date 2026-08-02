package com.bbflight.background_downloader;

import com.bbflight.background_downloader.BDPlugin;
import com.bbflight.background_downloader.TaskWorker;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.C1086c;
import kotlinx.serialization.json.b;

/* loaded from: classes3.dex */
public final class A0 {
    public static final kotlinx.coroutines.channels.b a;
    public static long b;
    public static final kotlinx.coroutines.channels.b c;

    @DebugMetadata(c = "com.bbflight.background_downloader.QueueService$1", f = "QueueService.kt", i = {1, 1, 1}, l = {40, 44}, m = "invokeSuspend", n = {"taskId", "now", "elapsed"}, nl = {41, 46}, s = {"L$1", "J$0", "J$1"}, v = 2)
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public String b;
        public int c;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
        
            if (kotlinx.coroutines.W.b(2000 - r5, r9) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        
            if (r10 == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0067 -> B:6:0x006a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            kotlinx.coroutines.channels.i iVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = A0.a;
                bVar.getClass();
                aVar = new b.a();
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            } else if (i == 1) {
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                iVar = aVar;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                str = (String) iVar.next();
                long currentTimeMillis = System.currentTimeMillis() - A0.b;
                if (currentTimeMillis < 2000) {
                    this.a = iVar;
                    this.b = str;
                    this.c = 2;
                }
                BDPlugin.INSTANCE.getClass();
                BDPlugin.l.remove(str);
                BDPlugin.k.remove(str);
                BDPlugin.n.remove(str);
                BDPlugin.t.remove(str);
                aVar = iVar;
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.b;
                iVar = this.a;
                ResultKt.throwOnFailure(obj);
                BDPlugin.INSTANCE.getClass();
                BDPlugin.l.remove(str);
                BDPlugin.k.remove(str);
                BDPlugin.n.remove(str);
                BDPlugin.t.remove(str);
                aVar = iVar;
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.QueueService$2", f = "QueueService.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, nl = {54}, s = {"L$0"}, v = 2)
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public int b;
        public /* synthetic */ Object c;

        @DebugMetadata(c = "com.bbflight.background_downloader.QueueService$2$1", f = "QueueService.kt", i = {0, 1}, l = {87, 88}, m = "invokeSuspend", n = {"onFail", "onFail"}, nl = {88, 90}, s = {"L$0", "L$0"}, v = 2)
        public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ A c;
            public final /* synthetic */ C1117w d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A a, C1117w c1117w, Continuation continuation) {
                super(2, continuation);
                this.c = a;
                this.d = c1117w;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
                return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00cd, code lost:
            
                if (r11.invoke(r10) != r2) goto L39;
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Function1<Continuation<? super Unit>, Object> function1;
                Function1<Continuation<? super Unit>, Object> function12;
                C1117w c1117w = this.d;
                A a = this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    function12 = (Function1) this.a;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        function1 = function12;
                        this.a = SpillingKt.nullOutSpilledVariable(function1);
                        this.b = 2;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                try {
                    TaskWorker.Companion companion = TaskWorker.INSTANCE;
                    M0 task = a.a;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(task, "task");
                    b.a aVar = kotlinx.serialization.json.b.d;
                    aVar.getClass();
                    List mutableListOf = CollectionsKt.mutableListOf(aVar.b(M0.Companion.serializer(), task));
                    Object obj2 = a.c;
                    if (obj2 instanceof ArrayList) {
                        mutableListOf.addAll((Collection) obj2);
                    } else {
                        mutableListOf.add(obj2);
                    }
                    MethodChannel a2 = BDPlugin.Companion.a(BDPlugin.INSTANCE, null, a.a.a, 1);
                    if (a2 != null) {
                        a2.invokeMethod(a.b, mutableListOf, new X(c1117w));
                    } else {
                        Boxing.boxBoolean(c1117w.M(Boxing.boxBoolean(false)));
                    }
                } catch (Exception e) {
                    String str = a.b;
                    e.getMessage();
                    if (!c1117w.isCompleted()) {
                        c1117w.M(Boxing.boxBoolean(false));
                    }
                }
                function1 = a.d;
                if (function1 != null) {
                    BDPlugin.INSTANCE.getClass();
                    if (!BDPlugin.u) {
                        this.a = function1;
                        this.b = 1;
                        Object await = c1117w.await(this);
                        if (await != coroutine_suspended) {
                            function12 = function1;
                            obj = await;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    this.a = SpillingKt.nullOutSpilledVariable(function1);
                    this.b = 2;
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = A0.c;
                bVar.getClass();
                aVar = new b.a();
                this.c = k;
                this.a = aVar;
                this.b = 1;
                obj = aVar.b(this);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    A a2 = (A) aVar.next();
                    C1117w a3 = C1119x.a();
                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                    C1082i.c(k, kotlinx.coroutines.internal.p.a, null, new a(a2, a3, null), 2);
                    this.c = k;
                    this.a = aVar;
                    this.b = 1;
                    obj = aVar.b(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    static {
        C1086c a2 = kotlinx.coroutines.L.a(C1049c0.a);
        a = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        c = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        C1082i.c(a2, null, null, new a(2, null), 3);
        C1082i.c(a2, null, null, new b(2, null), 3);
    }
}
