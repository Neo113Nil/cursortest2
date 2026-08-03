package io.ktor.network.selector;

/* compiled from: SelectableBase.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/ktor/network/selector/SelectableBase;", "Lio/ktor/network/selector/Selectable;", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "", "state", "", "interestOp", "(Lio/ktor/network/selector/SelectInterest;Z)V", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/ktor/network/selector/InterestSuspensionsMap;", "suspensions", "Lio/ktor/network/selector/InterestSuspensionsMap;", "getSuspensions", "()Lio/ktor/network/selector/InterestSuspensionsMap;", "isClosed", "()Z", "", "getInterestedOps", "()I", "interestedOps", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SelectableBase implements io.ktor.network.selector.Selectable {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _interestedOps$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.selector.SelectableBase.class, "_interestedOps");
    private final java.util.concurrent.atomic.AtomicBoolean _isClosed = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final io.ktor.network.selector.InterestSuspensionsMap suspensions = new io.ktor.network.selector.InterestSuspensionsMap();
    private volatile /* synthetic */ int _interestedOps = 0;

    @Override // io.ktor.network.selector.Selectable
    public io.ktor.network.selector.InterestSuspensionsMap getSuspensions() {
        return this.suspensions;
    }

    @Override // io.ktor.network.selector.Selectable
    public boolean isClosed() {
        return this._isClosed.get();
    }

    @Override // io.ktor.network.selector.Selectable
    /* renamed from: getInterestedOps, reason: from getter */
    public int get_interestedOps() {
        return this._interestedOps;
    }

    @Override // io.ktor.network.selector.Selectable
    public void interestOp(io.ktor.network.selector.SelectInterest interest, boolean state) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interest, "interest");
        int flag = interest.getFlag();
        do {
            i = this._interestedOps;
        } while (!_interestedOps$FU.compareAndSet(this, i, state ? i | flag : (~flag) & i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this._interestedOps = 0;
            io.ktor.network.selector.InterestSuspensionsMap suspensions = getSuspensions();
            for (io.ktor.network.selector.SelectInterest selectInterest : io.ktor.network.selector.SelectInterest.INSTANCE.getAllInterests()) {
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension = suspensions.removeSuspension(selectInterest);
                if (removeSuspension != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    removeSuspension.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new io.ktor.network.selector.ClosedChannelCancellationException())));
                }
            }
        }
    }
}
