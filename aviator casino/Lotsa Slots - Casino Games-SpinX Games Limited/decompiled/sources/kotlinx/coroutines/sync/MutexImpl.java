package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010 \u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010'\u001a\u00020\u00142\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0014J\u001e\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010*\u001a\u00020+H\u0016R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004Ry\u0010\n\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000b0\u000bj\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\"8VX\u0096\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "<init>", "(Z)V", "owner", "Lkotlinx/atomicfu/AtomicRef;", "", "onSelectCancellationUnlockConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "isLocked", "()Z", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "tryLock", "tryLockImpl", "unlock", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLockRegFunction", "onLockProcessResult", "result", "toString", "", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class MutexImpl extends kotlinx.coroutines.sync.SemaphoreAndMutexImpl implements kotlinx.coroutines.sync.Mutex {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater owner$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.MutexImpl.class, java.lang.Object.class, "owner$volatile");
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    public static /* synthetic */ void getOnLock$annotations() {
    }

    private final /* synthetic */ java.lang.Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final /* synthetic */ void setOwner$volatile(java.lang.Object obj) {
        this.owner$volatile = obj;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return lock$suspendImpl(this, obj, continuation);
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : kotlinx.coroutines.sync.MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.jvm.functions.Function3 onSelectCancellationUnlockConstructor$lambda$1;
                onSelectCancellationUnlockConstructor$lambda$1 = kotlinx.coroutines.sync.MutexImpl.onSelectCancellationUnlockConstructor$lambda$1(kotlinx.coroutines.sync.MutexImpl.this, (kotlinx.coroutines.selects.SelectInstance) obj, obj2, obj3);
                return onSelectCancellationUnlockConstructor$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function3 onSelectCancellationUnlockConstructor$lambda$1(final kotlinx.coroutines.sync.MutexImpl mutexImpl, kotlinx.coroutines.selects.SelectInstance selectInstance, final java.lang.Object obj, java.lang.Object obj2) {
        return new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                kotlin.Unit onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
                onSelectCancellationUnlockConstructor$lambda$1$lambda$0 = kotlinx.coroutines.sync.MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(kotlinx.coroutines.sync.MutexImpl.this, obj, (java.lang.Throwable) obj3, obj4, (kotlin.coroutines.CoroutineContext) obj5);
                return onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onSelectCancellationUnlockConstructor$lambda$1$lambda$0(kotlinx.coroutines.sync.MutexImpl mutexImpl, java.lang.Object obj, java.lang.Throwable th, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext) {
        mutexImpl.unlock(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object owner) {
        return holdsLockImpl(owner) == 1;
    }

    private final int holdsLockImpl(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        while (isLocked()) {
            java.lang.Object obj = owner$volatile$FU.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ java.lang.Object lock$suspendImpl(kotlinx.coroutines.sync.MutexImpl mutexImpl, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object lockSuspend;
        return (!mutexImpl.tryLock(obj) && (lockSuspend = mutexImpl.lockSuspend(obj, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? lockSuspend : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object owner) {
        int tryLockImpl = tryLockImpl(owner);
        if (tryLockImpl == 0) {
            return true;
        }
        if (tryLockImpl == 1) {
            return false;
        }
        if (tryLockImpl == 2) {
            throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        throw new java.lang.IllegalStateException("unexpected".toString());
    }

    private final int tryLockImpl(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        while (!tryAcquire()) {
            if (owner == null) {
                return 1;
            }
            int holdsLockImpl = holdsLockImpl(owner);
            if (holdsLockImpl == 1) {
                return 2;
            }
            if (holdsLockImpl == 2) {
                return 1;
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            java.lang.Object obj = owner$volatile$FU.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                throw new java.lang.AssertionError();
            }
        }
        owner$volatile$FU.set(this, owner);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        while (isLocked()) {
            java.lang.Object obj = owner$volatile$FU.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                if (obj != owner && owner != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$volatile$FU;
                symbol2 = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, symbol2)) {
                    release();
                    return;
                }
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked".toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
        kotlinx.coroutines.sync.MutexImpl$onLock$1 mutexImpl$onLock$1 = kotlinx.coroutines.sync.MutexImpl$onLock$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        kotlinx.coroutines.sync.MutexImpl$onLock$2 mutexImpl$onLock$2 = kotlinx.coroutines.sync.MutexImpl$onLock$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.onSelectCancellationUnlockConstructor);
    }

    protected void onLockRegFunction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (owner != null && holdsLock(owner)) {
            symbol = kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
            select.selectInRegistrationPhase(symbol);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            onAcquireRegFunction(new kotlinx.coroutines.sync.MutexImpl.SelectInstanceWithOwner((kotlinx.coroutines.selects.SelectInstanceInternal) select, owner), owner);
        }
    }

    protected java.lang.Object onLockProcessResult(java.lang.Object owner, java.lang.Object result) {
        kotlinx.coroutines.internal.Symbol symbol;
        symbol = kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(result, symbol)) {
            return this;
        }
        throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJz\u0010\n\u001a\u0004\u0018\u00010\u0007\"\b\b\u0000\u0010\u000b*\u00020\u00022\u0006\u0010\f\u001a\u0002H\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00072M\u0010\u000e\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0016Jn\u0010\u0017\u001a\u00020\u0002\"\b\b\u0000\u0010\u000b*\u00020\u00022\u0006\u0010\f\u001a\u0002H\u000b2M\u0010\u000e\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u001d\u001a\u00020\u0002H\u0097\u0001J2\u0010\u001e\u001a\u00020\u00022'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020 j\u0002`!H\u0096\u0001J\u001d\u0010\u001e\u001a\u00020\u00022\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010$\u001a\u00020%H\u0096\u0001J;\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010 H\u0097\u0001¢\u0006\u0002\u0010&J\u001a\u0010'\u001a\u00020\u0002*\u00020(2\u0006\u0010\f\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0002\u0010)J\u0015\u0010*\u001a\u00020\u0002*\u00020(2\u0006\u0010+\u001a\u00020\u0010H\u0097\u0001J\u001c\u0010,\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0096\u0001¢\u0006\u0002\u0010/J\"\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u0010+\u001a\u00020\u0010H\u0097\u0001R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00105R\u0012\u00107\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00068"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "owner", "", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Object;)V", "tryResume", "R", "value", "idempotent", "onCancellation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "resume", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function3;)V", "cancel", "", "completeResume", "token", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", com.ironsource.D1.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "resumeUndispatchedWithException", "exception", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "(Lkotlin/Unit;Ljava/lang/Object;)Ljava/lang/Object;", "tryResumeWithException", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isActive", "()Z", "isCancelled", "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class CancellableContinuationWithOwner implements kotlinx.coroutines.CancellableContinuation<kotlin.Unit>, kotlinx.coroutines.Waiter {
        public final kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cont;
        public final java.lang.Object owner;

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(java.lang.Throwable cause) {
            return this.cont.cancel(cause);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(java.lang.Object token) {
            this.cont.completeResume(token);
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public kotlin.coroutines.CoroutineContext get$context() {
            return this.cont.get$context();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
            this.cont.invokeOnCancellation(handler);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.cont.invokeOnCancellation(segment, index);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @kotlin.ReplaceWith(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        /* renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(kotlin.Unit value, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
            this.cont.resume((kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit>) value, onCancellation);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.Unit unit) {
            this.cont.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.Throwable th) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public java.lang.Object tryResume(kotlin.Unit value, java.lang.Object idempotent) {
            return this.cont.tryResume(value, idempotent);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
            return this.cont.tryResumeWithException(exception);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(kotlin.Unit unit, kotlin.jvm.functions.Function1 function1) {
            resume2(unit, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(java.lang.Object obj, kotlin.jvm.functions.Function3 function3) {
            resume((kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner) obj, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) function3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ java.lang.Object tryResume(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function3 function3) {
            return tryResume((kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner) obj, obj2, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(kotlinx.coroutines.CancellableContinuationImpl<? super kotlin.Unit> cancellableContinuationImpl, java.lang.Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        public <R extends kotlin.Unit> java.lang.Object tryResume(R value, java.lang.Object idempotent, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl);
                symbol2 = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cancellableContinuationImpl = this.cont;
            final kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            java.lang.Object tryResume = cancellableContinuationImpl.tryResume(value, idempotent, new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.Unit tryResume$lambda$3;
                    tryResume$lambda$3 = kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(kotlinx.coroutines.sync.MutexImpl.this, this, (java.lang.Throwable) obj2, (kotlin.Unit) obj3, (kotlin.coroutines.CoroutineContext) obj4);
                    return tryResume$lambda$3;
                }
            });
            if (tryResume != null) {
                kotlinx.coroutines.sync.MutexImpl mutexImpl3 = kotlinx.coroutines.sync.MutexImpl.this;
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    java.lang.Object obj2 = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl3);
                    symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                    if (obj2 != symbol) {
                        throw new java.lang.AssertionError();
                    }
                }
                kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            }
            return tryResume;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit tryResume$lambda$3(kotlinx.coroutines.sync.MutexImpl mutexImpl, kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner, java.lang.Throwable th, kotlin.Unit unit, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlinx.coroutines.internal.Symbol symbol;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol && obj != cancellableContinuationWithOwner.owner) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().set(mutexImpl, cancellableContinuationWithOwner.owner);
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return kotlin.Unit.INSTANCE;
        }

        public <R extends kotlin.Unit> void resume(R value, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cancellableContinuationImpl = this.cont;
            final kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            cancellableContinuationImpl.resume((kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit>) value, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit resume$lambda$6;
                    resume$lambda$6 = kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner.resume$lambda$6(kotlinx.coroutines.sync.MutexImpl.this, this, (java.lang.Throwable) obj2);
                    return resume$lambda$6;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit resume$lambda$6(kotlinx.coroutines.sync.MutexImpl mutexImpl, kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner, java.lang.Throwable th) {
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u001d\u0010\u0012\u001a\u00020\r2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "select", "owner", "", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/selects/SelectInstanceInternal;Ljava/lang/Object;)V", "trySelect", "", "clauseObject", "result", "selectInRegistrationPhase", "", "internalResult", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", com.ironsource.D1.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class SelectInstanceWithOwner<Q> implements kotlinx.coroutines.selects.SelectInstanceInternal<Q> {
        public final java.lang.Object owner;
        public final kotlinx.coroutines.selects.SelectInstanceInternal<Q> select;

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public kotlin.coroutines.CoroutineContext getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.select.invokeOnCancellation(segment, index);
        }

        public SelectInstanceWithOwner(kotlinx.coroutines.selects.SelectInstanceInternal<Q> selectInstanceInternal, java.lang.Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(java.lang.Object clauseObject, java.lang.Object result) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            boolean trySelect = this.select.trySelect(clauseObject, result);
            kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            if (trySelect) {
                kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().set(mutexImpl2, this.owner);
            }
            return trySelect;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(java.lang.Object internalResult) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.sync.MutexImpl.getOwner$volatile$FU().set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(internalResult);
        }
    }

    public java.lang.String toString() {
        return "Mutex@" + kotlinx.coroutines.DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object lockSuspend(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            acquire((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) new kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
