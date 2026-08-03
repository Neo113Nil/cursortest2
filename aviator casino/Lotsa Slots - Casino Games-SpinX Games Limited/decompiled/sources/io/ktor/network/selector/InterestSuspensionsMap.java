package io.ktor.network.selector;

/* compiled from: InterestSuspensionsMap.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ:\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0010\u001a\u00020\u00072#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "addSuspension", "(Lio/ktor/network/selector/SelectInterest;Lkotlinx/coroutines/CancellableContinuation;)V", "", "readyOps", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "invokeForEachPresent", "(ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "removeSuspension", "(Lio/ktor/network/selector/SelectInterest;)Lkotlinx/coroutines/CancellableContinuation;", "interestOrdinal", "(I)Lkotlinx/coroutines/CancellableContinuation;", "", "toString", "()Ljava/lang/String;", "readHandlerReference", "Lkotlinx/coroutines/CancellableContinuation;", "writeHandlerReference", "connectHandlerReference", "acceptHandlerReference", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InterestSuspensionsMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.selector.InterestSuspensionsMap.Companion INSTANCE = new io.ktor.network.selector.InterestSuspensionsMap.Companion(null);
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>>[] updaters;
    private volatile kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> acceptHandlerReference;
    private volatile kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> connectHandlerReference;
    private volatile kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> readHandlerReference;
    private volatile kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> writeHandlerReference;

    /* compiled from: InterestSuspensionsMap.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.network.selector.SelectInterest.values().length];
            try {
                iArr[io.ktor.network.selector.SelectInterest.READ.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.network.selector.SelectInterest.WRITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.network.selector.SelectInterest.ACCEPT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.ktor.network.selector.SelectInterest.CONNECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void addSuspension(io.ktor.network.selector.SelectInterest interest, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interest, "interest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(INSTANCE.updater(interest), this, null, continuation)) {
            return;
        }
        throw new java.lang.IllegalStateException(("Handler for " + interest.name() + " is already registered").toString());
    }

    public final void invokeForEachPresent(int readyOps, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>, kotlin.Unit> block) {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        int[] flags = io.ktor.network.selector.SelectInterest.INSTANCE.getFlags();
        int length = flags.length;
        for (int i = 0; i < length; i++) {
            if ((flags[i] & readyOps) != 0 && (removeSuspension = removeSuspension(i)) != null) {
                block.invoke(removeSuspension);
            }
        }
    }

    public final void invokeForEachPresent(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>, ? super io.ktor.network.selector.SelectInterest, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        for (io.ktor.network.selector.SelectInterest selectInterest : io.ktor.network.selector.SelectInterest.INSTANCE.getAllInterests()) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension = removeSuspension(selectInterest);
            if (removeSuspension != null) {
                block.invoke(removeSuspension, selectInterest);
            }
        }
    }

    public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension(io.ktor.network.selector.SelectInterest interest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interest, "interest");
        return (kotlinx.coroutines.CancellableContinuation) INSTANCE.updater(interest).getAndSet(this, null);
    }

    public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension(int interestOrdinal) {
        return updaters[interestOrdinal].getAndSet(this, null);
    }

    public java.lang.String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    /* compiled from: InterestSuspensionsMap.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR4\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap$Companion;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lio/ktor/network/selector/InterestSuspensionsMap;", "Lkotlinx/coroutines/CancellableContinuation;", "", "updater", "(Lio/ktor/network/selector/SelectInterest;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "", "updaters", "[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getUpdaters$annotations", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getUpdaters$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>> updater(io.ktor.network.selector.SelectInterest interest) {
            return io.ktor.network.selector.InterestSuspensionsMap.updaters[interest.ordinal()];
        }
    }

    static {
        kotlin.reflect.KMutableProperty1 kMutableProperty1;
        io.ktor.network.selector.SelectInterest[] allInterests = io.ktor.network.selector.SelectInterest.INSTANCE.getAllInterests();
        java.util.ArrayList arrayList = new java.util.ArrayList(allInterests.length);
        for (io.ktor.network.selector.SelectInterest selectInterest : allInterests) {
            int i = io.ktor.network.selector.InterestSuspensionsMap.WhenMappings.$EnumSwitchMapping$0[selectInterest.ordinal()];
            if (i == 1) {
                kMutableProperty1 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                    public java.lang.Object get(java.lang.Object obj) {
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                        cancellableContinuation = ((io.ktor.network.selector.InterestSuspensionsMap) obj).readHandlerReference;
                        return cancellableContinuation;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                    public void set(java.lang.Object obj, java.lang.Object obj2) {
                        ((io.ktor.network.selector.InterestSuspensionsMap) obj).readHandlerReference = (kotlinx.coroutines.CancellableContinuation) obj2;
                    }
                };
            } else if (i == 2) {
                kMutableProperty1 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                    public java.lang.Object get(java.lang.Object obj) {
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                        cancellableContinuation = ((io.ktor.network.selector.InterestSuspensionsMap) obj).writeHandlerReference;
                        return cancellableContinuation;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                    public void set(java.lang.Object obj, java.lang.Object obj2) {
                        ((io.ktor.network.selector.InterestSuspensionsMap) obj).writeHandlerReference = (kotlinx.coroutines.CancellableContinuation) obj2;
                    }
                };
            } else if (i == 3) {
                kMutableProperty1 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                    public java.lang.Object get(java.lang.Object obj) {
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                        cancellableContinuation = ((io.ktor.network.selector.InterestSuspensionsMap) obj).acceptHandlerReference;
                        return cancellableContinuation;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                    public void set(java.lang.Object obj, java.lang.Object obj2) {
                        ((io.ktor.network.selector.InterestSuspensionsMap) obj).acceptHandlerReference = (kotlinx.coroutines.CancellableContinuation) obj2;
                    }
                };
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kMutableProperty1 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                    public java.lang.Object get(java.lang.Object obj) {
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                        cancellableContinuation = ((io.ktor.network.selector.InterestSuspensionsMap) obj).connectHandlerReference;
                        return cancellableContinuation;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                    public void set(java.lang.Object obj, java.lang.Object obj2) {
                        ((io.ktor.network.selector.InterestSuspensionsMap) obj).connectHandlerReference = (kotlinx.coroutines.CancellableContinuation) obj2;
                    }
                };
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater newUpdater = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.selector.InterestSuspensionsMap.class, kotlinx.coroutines.CancellableContinuation.class, kMutableProperty1.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNull(newUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(newUpdater);
        }
        updaters = (java.util.concurrent.atomic.AtomicReferenceFieldUpdater[]) arrayList.toArray(new java.util.concurrent.atomic.AtomicReferenceFieldUpdater[0]);
    }
}
