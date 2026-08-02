package kotlinx.coroutines.flow.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes5.dex */
public final class n extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public kotlinx.coroutines.channels.g a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InterfaceC1060e<Object>[] i;
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 j;
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 k;
    public final /* synthetic */ InterfaceC1061f<Object> l;

    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ InterfaceC1060e<Object>[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ kotlinx.coroutines.channels.b e;

        /* renamed from: kotlinx.coroutines.flow.internal.n$a$a, reason: collision with other inner class name */
        public static final class C0160a<T> implements InterfaceC1061f {
            public final /* synthetic */ kotlinx.coroutines.channels.b a;
            public final /* synthetic */ int b;

            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.n$a$a$a, reason: collision with other inner class name */
            public static final class C0161a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public final /* synthetic */ C0160a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0161a(C0160a<? super T> c0160a, Continuation<? super C0161a> continuation) {
                    super(continuation);
                    this.b = c0160a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public C0160a(kotlinx.coroutines.channels.b bVar, int i) {
                this.a = bVar;
                this.b = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
            
                if (com.google.common.collect.c0.b(r0) != r1) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            
                if (r5.a.i(r7, r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.InterfaceC1061f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                C0161a c0161a;
                int i;
                if (continuation instanceof C0161a) {
                    c0161a = (C0161a) continuation;
                    int i2 = c0161a.c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0161a.c = i2 - Integer.MIN_VALUE;
                        Object obj = c0161a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0161a.c;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            IndexedValue indexedValue = new IndexedValue(this.b, t);
                            c0161a.c = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        c0161a.c = 2;
                    }
                }
                c0161a = new C0161a(this, continuation);
                Object obj2 = c0161a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0161a.c;
                if (i != 0) {
                }
                c0161a.c = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1060e[] interfaceC1060eArr, int i, AtomicInteger atomicInteger, kotlinx.coroutines.channels.b bVar, Continuation continuation) {
            super(2, continuation);
            this.b = interfaceC1060eArr;
            this.c = i;
            this.d = atomicInteger;
            this.e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            AtomicInteger atomicInteger = this.d;
            kotlinx.coroutines.channels.b bVar = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1060e<Object>[] interfaceC1060eArr = this.b;
                    int i2 = this.c;
                    InterfaceC1060e<Object> interfaceC1060e = interfaceC1060eArr[i2];
                    C0160a c0160a = new C0160a(bVar, i2);
                    this.a = 1;
                    if (interfaceC1060e.collect(c0160a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    bVar.g(null);
                }
                return Unit.INSTANCE;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    bVar.g(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC1060e[] interfaceC1060eArr, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 anonymousClass2, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3, InterfaceC1061f interfaceC1061f, Continuation continuation) {
        super(2, continuation);
        this.i = interfaceC1060eArr;
        this.j = anonymousClass2;
        this.k = anonymousClass3;
        this.l = interfaceC1061f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        n nVar = new n(this.i, this.j, this.k, this.l, continuation);
        nVar.f = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((n) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        if (r9 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        r13 = invoke();
        r14 = r19.l;
        r15 = r19.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r19.f = r10;
        r19.a = r11;
        r19.b = r2;
        r19.c = r9;
        r19.d = r12;
        r19.e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
    
        if (r15.invoke((androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3) r14, (kotlinx.coroutines.flow.InterfaceC1061f<java.lang.Object>) r10, (java.lang.Object[]) r19) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        r0 = kotlin.collections.ArraysKt___ArraysJvmKt.copyInto$default(r10, r13, 0, 0, 0, 14, (java.lang.Object) null);
        r19.f = r10;
        r19.a = r11;
        r19.b = r2;
        r19.c = r9;
        r19.d = r12;
        r19.e = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        if (r15.invoke((androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3) r14, (kotlinx.coroutines.flow.InterfaceC1061f<java.lang.Object>) r13, (androidx.work.impl.constraints.ConstraintsState[]) r19) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r9 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00af, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0105 -> B:8:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x011d -> B:7:0x0120). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        Object[] objArr;
        byte[] bArr;
        byte b;
        kotlinx.coroutines.channels.g gVar;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        kotlinx.coroutines.internal.x xVar = t.b;
        int i2 = 2;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            K k = (K) this.f;
            length = this.i.length;
            if (length == 0) {
                return Unit.INSTANCE;
            }
            objArr = new Object[length];
            ArraysKt___ArraysJvmKt.fill$default(objArr, xVar, 0, 0, 6, (Object) null);
            kotlinx.coroutines.channels.b a2 = kotlinx.coroutines.channels.j.a(length, null, 6);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i3 = 0; i3 < length; i3++) {
                C1082i.c(k, null, null, new a(this.i, i3, atomicInteger, a2, null), 3);
            }
            bArr = new byte[length];
            b = 0;
            gVar = a2;
        } else {
            if (i == 1) {
                ?? r2 = this.d;
                length = this.c;
                byte[] bArr2 = this.b;
                gVar = this.a;
                Object[] objArr2 = (Object[]) this.f;
                ResultKt.throwOnFailure(obj);
                obj2 = ((kotlinx.coroutines.channels.k) obj).a;
                b = r2;
                bArr = bArr2;
                objArr = objArr2;
                if (obj2 instanceof k.c) {
                    obj2 = null;
                }
                IndexedValue indexedValue = (IndexedValue) obj2;
                if (indexedValue == null) {
                    return Unit.INSTANCE;
                }
                while (true) {
                    int index = indexedValue.getIndex();
                    Object obj3 = objArr[index];
                    objArr[index] = indexedValue.getValue();
                    if (obj3 == xVar) {
                        length--;
                    }
                    if (bArr[index] != b) {
                        bArr[index] = b;
                        Object e = gVar.e();
                        if (e instanceof k.c) {
                            e = null;
                        }
                        indexedValue = (IndexedValue) e;
                        if (indexedValue == null) {
                            break;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i == 2) {
                ?? r22 = this.d;
                length = this.c;
                byte[] bArr3 = this.b;
                gVar = this.a;
                Object[] objArr3 = (Object[]) this.f;
                ResultKt.throwOnFailure(obj);
                b = r22;
                bArr = bArr3;
                objArr = objArr3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r23 = this.d;
                length = this.c;
                byte[] bArr4 = this.b;
                gVar = this.a;
                Object[] objArr4 = (Object[]) this.f;
                ResultKt.throwOnFailure(obj);
                b = r23;
                bArr = bArr4;
                objArr = objArr4;
                i2 = 2;
            }
        }
        b = (byte) (b + 1);
        this.f = objArr;
        this.a = gVar;
        this.b = bArr;
        this.c = length;
        this.d = b;
        this.e = 1;
        obj2 = gVar.a(this);
    }
}
