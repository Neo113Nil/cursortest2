package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.InterfaceC1120x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1160}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1894:1\n34#2,5:1895\n33#3:1900\n33#3:1901\n41#4,3:1902\n46#4:1930\n48#4:1933\n231#5,3:1905\n200#5,7:1908\n211#5,3:1916\n214#5,2:1920\n217#5,6:1923\n234#5:1929\n1399#6:1915\n1270#6:1919\n54#7:1922\n1863#8,2:1931\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1158#1:1895,5\n1163#1:1900\n1133#1:1901\n1136#1:1902,3\n1136#1:1930\n1136#1:1933\n1136#1:1905,3\n1136#1:1908,7\n1136#1:1916,3\n1136#1:1920,2\n1136#1:1923,6\n1136#1:1929\n1136#1:1915\n1136#1:1919\n1139#1:1922\n1136#1:1931,2\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<kotlinx.coroutines.K, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {1160}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<kotlinx.coroutines.K, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function3<? super kotlinx.coroutines.K, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.L$0;
                Function3<kotlinx.coroutines.K, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (function3.invoke(k, monotonicFrameClock, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, Function3<? super kotlinx.coroutines.K, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super Recomposer$recompositionRunner$2> continuation) {
        super(2, continuation);
        this.this$0 = recomposer;
        this.$block = function3;
        this.$parentFrameClock = monotonicFrameClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Recomposer recomposer, Set set, Snapshot snapshot) {
        kotlinx.coroutines.flow.G g;
        InterfaceC1096l interfaceC1096l;
        synchronized (recomposer.stateLock) {
            try {
                g = recomposer._state;
                if (((Recomposer.State) g.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    MutableScatterSet mutableScatterSet = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
                        Object[] objArr = set$runtime.elements;
                        long[] jArr = set$runtime.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i << 3) + i3];
                                            if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(1))) {
                                                mutableScatterSet.add(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(1))) {
                                mutableScatterSet.add(obj2);
                            }
                        }
                    }
                    interfaceC1096l = recomposer.deriveStateLocked();
                } else {
                    interfaceC1096l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC1096l != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC1096l.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, continuation);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1120x0 e;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl;
        ObserverHandle observerHandle;
        Throwable th;
        Object obj2;
        InterfaceC1120x0 interfaceC1120x0;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl2;
        InterfaceC1120x0 interfaceC1120x02;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            e = com.google.common.base.r.e(((kotlinx.coroutines.K) this.L$0).getCoroutineContext());
            this.this$0.registerRunnerJob(e);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            final Recomposer recomposer = this.this$0;
            ObserverHandle registerApplyObserver = companion.registerApplyObserver(new Function2() { // from class: androidx.compose.runtime.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = Recomposer$recompositionRunner$2.invokeSuspend$lambda$2(Recomposer.this, (Set) obj3, (Snapshot) obj4);
                    return invokeSuspend$lambda$2;
                }
            });
            Recomposer.Companion companion2 = Recomposer.INSTANCE;
            recomposerInfoImpl = this.this$0.recomposerInfo;
            companion2.addRunning(recomposerInfoImpl);
            try {
                List knownCompositions = this.this$0.knownCompositions();
                int size = knownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ControlledComposition) knownCompositions.get(i2)).invalidateAll();
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, null);
                this.L$0 = e;
                this.L$1 = registerApplyObserver;
                this.label = 1;
                if (kotlinx.coroutines.L.c(anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = registerApplyObserver;
            } catch (Throwable th2) {
                observerHandle = registerApplyObserver;
                th = th2;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer2 = this.this$0;
                synchronized (obj2) {
                    try {
                        interfaceC1120x0 = recomposer2.runnerJob;
                        if (interfaceC1120x0 == e) {
                            recomposer2.runnerJob = null;
                        }
                        recomposer2.deriveStateLocked();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Recomposer.Companion companion3 = Recomposer.INSTANCE;
                recomposerInfoImpl2 = this.this$0.recomposerInfo;
                companion3.removeRunning(recomposerInfoImpl2);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observerHandle = (ObserverHandle) this.L$1;
            e = (InterfaceC1120x0) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th4) {
                th = th4;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer22 = this.this$0;
                synchronized (obj2) {
                }
            }
        }
        observerHandle.dispose();
        Object obj3 = this.this$0.stateLock;
        Recomposer recomposer3 = this.this$0;
        synchronized (obj3) {
            try {
                interfaceC1120x02 = recomposer3.runnerJob;
                if (interfaceC1120x02 == e) {
                    recomposer3.runnerJob = null;
                }
                recomposer3.deriveStateLocked();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        Recomposer.Companion companion4 = Recomposer.INSTANCE;
        recomposerInfoImpl3 = this.this$0.recomposerInfo;
        companion4.removeRunning(recomposerInfoImpl3);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
        return ((Recomposer$recompositionRunner$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
