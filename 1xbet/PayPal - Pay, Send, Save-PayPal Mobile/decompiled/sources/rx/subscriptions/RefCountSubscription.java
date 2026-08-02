package rx.subscriptions;

/* loaded from: classes18.dex */
public final class RefCountSubscription implements rx.Subscription {
    static final rx.subscriptions.RefCountSubscription.State getHighResolutionOutputSizeshNQ4ISI = new rx.subscriptions.RefCountSubscription.State(false, 0);
    final java.util.concurrent.atomic.AtomicReference<rx.subscriptions.RefCountSubscription.State> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    final rx.Subscription getHighSpeedVideoFpsRangesFor;

    static final class State {
        final boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoSizes;

        State(boolean z, int i) {
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = i;
        }
    }

    public RefCountSubscription(rx.Subscription subscription) {
        if (subscription == null) {
            throw new java.lang.IllegalArgumentException(lib.android.paypal.com.magnessdk.g.n2);
        }
        this.getHighSpeedVideoFpsRangesFor = subscription;
    }

    public final rx.Subscription get() {
        rx.subscriptions.RefCountSubscription.State state;
        java.util.concurrent.atomic.AtomicReference<rx.subscriptions.RefCountSubscription.State> atomicReference = this.getHighSpeedVideoFpsRanges;
        do {
            state = atomicReference.get();
            if (state.getHighSpeedVideoFpsRanges) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, state, new rx.subscriptions.RefCountSubscription.State(state.getHighSpeedVideoFpsRanges, state.getHighSpeedVideoSizes + 1)));
        return new rx.subscriptions.RefCountSubscription.InnerSubscription(this);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoFpsRanges.get().getHighSpeedVideoFpsRanges;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        rx.subscriptions.RefCountSubscription.State state;
        rx.subscriptions.RefCountSubscription.State state2;
        java.util.concurrent.atomic.AtomicReference<rx.subscriptions.RefCountSubscription.State> atomicReference = this.getHighSpeedVideoFpsRanges;
        do {
            state = atomicReference.get();
            if (state.getHighSpeedVideoFpsRanges) {
                return;
            } else {
                state2 = new rx.subscriptions.RefCountSubscription.State(true, state.getHighSpeedVideoSizes);
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, state, state2));
        if (state2.getHighSpeedVideoFpsRanges && state2.getHighSpeedVideoSizes == 0) {
            this.getHighSpeedVideoFpsRangesFor.unsubscribe();
        }
    }

    static final class InnerSubscription extends java.util.concurrent.atomic.AtomicInteger implements rx.Subscription {
        private static final long serialVersionUID = 7005765588239987643L;
        final rx.subscriptions.RefCountSubscription getHighSpeedVideoFpsRangesFor;

        public InnerSubscription(rx.subscriptions.RefCountSubscription refCountSubscription) {
            this.getHighSpeedVideoFpsRangesFor = refCountSubscription;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            rx.subscriptions.RefCountSubscription.State state;
            rx.subscriptions.RefCountSubscription.State state2;
            if (compareAndSet(0, 1)) {
                rx.subscriptions.RefCountSubscription refCountSubscription = this.getHighSpeedVideoFpsRangesFor;
                java.util.concurrent.atomic.AtomicReference<rx.subscriptions.RefCountSubscription.State> atomicReference = refCountSubscription.getHighSpeedVideoFpsRanges;
                do {
                    state = atomicReference.get();
                    state2 = new rx.subscriptions.RefCountSubscription.State(state.getHighSpeedVideoFpsRanges, state.getHighSpeedVideoSizes - 1);
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, state, state2));
                if (state2.getHighSpeedVideoFpsRanges && state2.getHighSpeedVideoSizes == 0) {
                    refCountSubscription.getHighSpeedVideoFpsRangesFor.unsubscribe();
                }
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() != 0;
        }
    }
}
