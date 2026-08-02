package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/analytics/Dispatcher;", "", "", "startDispatching", "()V", "stopDispatching", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Dispatcher {
    com.zettle.sdk.commons.state.State<com.zettle.sdk.analytics.Dispatcher.State> getState();

    void startDispatching();

    void stopDispatching();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/analytics/Dispatcher$State;", "", "<init>", "()V", "Dispatching", "Done", "Initial", "Lcom/zettle/sdk/analytics/Dispatcher$State$Dispatching;", "Lcom/zettle/sdk/analytics/Dispatcher$State$Done;", "Lcom/zettle/sdk/analytics/Dispatcher$State$Initial;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Dispatcher$State$Initial;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Initial extends com.zettle.sdk.analytics.Dispatcher.State {
            public static final com.zettle.sdk.analytics.Dispatcher.State.Initial INSTANCE = new com.zettle.sdk.analytics.Dispatcher.State.Initial();

            private Initial() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Initial";
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/analytics/Dispatcher$State$Dispatching;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "", "attempt", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getAttempt", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dispatching extends com.zettle.sdk.analytics.Dispatcher.State {
            private final int attempt;

            public Dispatching(int i) {
                super(null);
                this.attempt = i;
            }

            public final int getAttempt() {
                return this.attempt;
            }

            public final java.lang.String toString() {
                int i = this.attempt;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Dispatching[");
                sb.append(i);
                sb.append("]");
                return sb.toString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Dispatcher$State$Done;", "Lcom/zettle/sdk/analytics/Dispatcher$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Done extends com.zettle.sdk.analytics.Dispatcher.State {
            public static final com.zettle.sdk.analytics.Dispatcher.State.Done INSTANCE = new com.zettle.sdk.analytics.Dispatcher.State.Done();

            private Done() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Done";
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
