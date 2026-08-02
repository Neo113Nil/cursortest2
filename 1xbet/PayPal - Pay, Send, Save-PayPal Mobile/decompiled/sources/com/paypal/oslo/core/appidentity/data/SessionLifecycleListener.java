package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener;", "", "", "onStop", "()V", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;", "event", "onStart", "(Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;)V", "", "getInactivityThresholdMs", "()J", "inactivityThresholdMs", "StartEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SessionLifecycleListener {
    long getInactivityThresholdMs();

    void onStart(com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent event);

    default void onStop() {
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onStop(com.paypal.oslo.core.appidentity.data.SessionLifecycleListener sessionLifecycleListener) {
            com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.super.onStop();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;", "", "WithinThreshold", "AfterTimeout", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$AfterTimeout;", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$WithinThreshold;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface StartEvent {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$WithinThreshold;", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;", "", "elapsedMs", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$WithinThreshold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getElapsedMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class WithinThreshold implements com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent {
            private final long elapsedMs;

            public WithinThreshold(long j) {
                this.elapsedMs = j;
            }

            public final long getElapsedMs() {
                return this.elapsedMs;
            }

            public final java.lang.String toString() {
                long j = this.elapsedMs;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("WithinThreshold(elapsedMs=");
                sb.append(j);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Long.hashCode(this.elapsedMs);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold) && this.elapsedMs == ((com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold) other).elapsedMs;
            }

            public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold copy(long elapsedMs) {
                return new com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold(elapsedMs);
            }

            /* renamed from: component1, reason: from getter */
            public final long getElapsedMs() {
                return this.elapsedMs;
            }

            public static /* synthetic */ com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold copy$default(com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold withinThreshold, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = withinThreshold.elapsedMs;
                }
                return withinThreshold.copy(j);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$AfterTimeout;", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;", "", "elapsedMs", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent$AfterTimeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getElapsedMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AfterTimeout implements com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent {
            private final long elapsedMs;

            public AfterTimeout(long j) {
                this.elapsedMs = j;
            }

            public final long getElapsedMs() {
                return this.elapsedMs;
            }

            public final java.lang.String toString() {
                long j = this.elapsedMs;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AfterTimeout(elapsedMs=");
                sb.append(j);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Long.hashCode(this.elapsedMs);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout) && this.elapsedMs == ((com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout) other).elapsedMs;
            }

            public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout copy(long elapsedMs) {
                return new com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout(elapsedMs);
            }

            /* renamed from: component1, reason: from getter */
            public final long getElapsedMs() {
                return this.elapsedMs;
            }

            public static /* synthetic */ com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout copy$default(com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout afterTimeout, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = afterTimeout.elapsedMs;
                }
                return afterTimeout.copy(j);
            }
        }
    }
}
