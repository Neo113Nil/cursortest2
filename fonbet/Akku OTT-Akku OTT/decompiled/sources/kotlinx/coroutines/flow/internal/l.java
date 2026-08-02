package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;

@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* loaded from: classes5.dex */
public final class l<T, R> extends j<T, R> {
    public final kotlinx.coroutines.flow.w e;

    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ l<T, R> c;
        public final /* synthetic */ InterfaceC1061f<R> d;

        /* renamed from: kotlinx.coroutines.flow.internal.l$a$a, reason: collision with other inner class name */
        public static final class C0158a<T> implements InterfaceC1061f {
            public final /* synthetic */ Ref.ObjectRef<InterfaceC1120x0> a;
            public final /* synthetic */ K b;
            public final /* synthetic */ l<T, R> c;
            public final /* synthetic */ InterfaceC1061f<R> d;

            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$a, reason: collision with other inner class name */
            public static final class C0159a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ l<T, R> b;
                public final /* synthetic */ InterfaceC1061f<R> c;
                public final /* synthetic */ T d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0159a(l<T, R> lVar, InterfaceC1061f<? super R> interfaceC1061f, T t, Continuation<? super C0159a> continuation) {
                    super(2, continuation);
                    this.b = lVar;
                    this.c = interfaceC1061f;
                    this.d = t;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0159a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(K k, Continuation<? super Unit> continuation) {
                    return ((C0159a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.w wVar = this.b.e;
                        this.a = 1;
                        if (wVar.invoke(this.c, this.d, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$b */
            public static final class b extends ContinuationImpl {
                public C0158a a;
                public Object b;
                public InterfaceC1120x0 c;
                public /* synthetic */ Object d;
                public final /* synthetic */ C0158a<T> e;
                public int f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0158a<? super T> c0158a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.e = c0158a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0158a(Ref.ObjectRef<InterfaceC1120x0> objectRef, K k, l<T, R> lVar, InterfaceC1061f<? super R> interfaceC1061f) {
                this.a = objectRef;
                this.b = k;
                this.c = lVar;
                this.d = interfaceC1061f;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC1061f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                b bVar;
                int i;
                C0158a<T> c0158a;
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i2 = bVar.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.f = i2 - Integer.MIN_VALUE;
                        Object obj = bVar.d;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = bVar.f;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC1120x0 interfaceC1120x0 = this.a.element;
                            if (interfaceC1120x0 != null) {
                                interfaceC1120x0.cancel((CancellationException) new m("Child of the scoped flow was cancelled"));
                                bVar.a = this;
                                bVar.b = t;
                                bVar.c = interfaceC1120x0;
                                bVar.f = 1;
                                if (interfaceC1120x0.join(bVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c0158a = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t = (T) bVar.b;
                            c0158a = bVar.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        c0158a.a.element = (T) C1082i.c(c0158a.b, null, M.d, new C0159a(c0158a.c, c0158a.d, t, null), 1);
                        return Unit.INSTANCE;
                    }
                }
                bVar = new b(this, continuation);
                Object obj2 = bVar.d;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.f;
                if (i != 0) {
                }
                c0158a.a.element = (T) C1082i.c(c0158a.b, null, M.d, new C0159a(c0158a.c, c0158a.d, t, null), 1);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<T, R> lVar, InterfaceC1061f<? super R> interfaceC1061f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = lVar;
            this.d = interfaceC1061f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                K k = (K) this.b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                l<T, R> lVar = this.c;
                InterfaceC1060e<S> interfaceC1060e = lVar.d;
                C0158a c0158a = new C0158a(objectRef, k, lVar, this.d);
                this.a = 1;
                if (interfaceC1060e.collect(c0158a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public l(kotlinx.coroutines.flow.w wVar, InterfaceC1060e interfaceC1060e, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        super(interfaceC1060e, coroutineContext, i, aVar);
        this.e = wVar;
    }

    @Override // kotlinx.coroutines.flow.internal.g
    public final g<R> d(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return new l(this.e, this.d, coroutineContext, i, aVar);
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final Object e(InterfaceC1061f<? super R> interfaceC1061f, Continuation<? super Unit> continuation) {
        Object c = L.c(new a(this, interfaceC1061f, null), continuation);
        return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
    }
}
