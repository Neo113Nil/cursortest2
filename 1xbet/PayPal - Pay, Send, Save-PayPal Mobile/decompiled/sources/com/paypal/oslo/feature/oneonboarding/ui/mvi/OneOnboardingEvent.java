package com.paypal.oslo.feature.oneonboarding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "UserIntent", "SystemEvent", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OneOnboardingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OneOnboardingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "RetryableUserIntent", "StartFlow", "StepForward", "StepBack", "CloseFlow", "Submit", "Retry", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$CloseFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Retry;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StartFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StepBack;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StepForward;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Submit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserIntent extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StartFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Submit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface RetryableUserIntent {
        }

        private UserIntent(java.lang.String str) {
            super(str, null);
            this.name = str;
        }

        @Override // com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, com.paypal.oslo.core.mvi.Event
        public java.lang.String getName() {
            return this.name;
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StartFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StartFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StartFlow extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent implements com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartFlow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
                super("OneOnboardingEvent.UserIntent.StartFlow", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                this.intentId = intentId;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("StartFlow(intentId=");
                sb.append(intentId);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.intentId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow) other).intentId);
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow(intentId);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StartFlow startFlow, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intentId = startFlow.intentId;
                }
                return startFlow.copy(intentId);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StepForward;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StepForward extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepForward INSTANCE = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepForward();

            public final int hashCode() {
                return -543558147;
            }

            private StepForward() {
                super("OneOnboardingEvent.UserIntent.StepForward", null);
            }

            public final java.lang.String toString() {
                return "StepForward";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepForward)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$StepBack;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StepBack extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack INSTANCE = new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack();

            public final int hashCode() {
                return -1108530001;
            }

            private StepBack() {
                super("OneOnboardingEvent.UserIntent.StepBack", null);
            }

            public final java.lang.String toString() {
                return "StepBack";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.StepBack)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$CloseFlow;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$CloseFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CloseFlow extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.Status status;

            public CloseFlow(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
                super("OneOnboardingEvent.UserIntent.CloseFlow", null);
                this.status = status;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
                return this.status;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.Status status = this.status;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseFlow(status=");
                sb.append(status);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.oneonboarding.api.domain.Status status = this.status;
                if (status == null) {
                    return 0;
                }
                return status.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) && this.status == ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow) other).status;
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow copy(com.paypal.oslo.feature.oneonboarding.api.domain.Status status) {
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow(status);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
                return this.status;
            }

            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.CloseFlow closeFlow, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    status = closeFlow.status;
                }
                return closeFlow.copy(status);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Submit;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "collectedItems", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Submit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Ljava/util/List;", "getCollectedItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Submit extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent implements com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> collectedItems;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Submit(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list) {
                super("OneOnboardingEvent.UserIntent.Submit", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.intentId = intentId;
                this.collectedItems = list;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> getCollectedItems() {
                return this.collectedItems;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
                java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> list = this.collectedItems;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Submit(intentId=");
                sb.append(intentId);
                sb.append(", collectedItems=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.intentId.hashCode() * 31) + this.collectedItems.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit)) {
                    return false;
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit submit = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, submit.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.collectedItems, submit.collectedItems);
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> collectedItems) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItems, "");
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit(intentId, collectedItems);
            }

            public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem> component2() {
                return this.collectedItems;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Submit submit, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intentId = submit.intentId;
                }
                if ((i & 2) != 0) {
                    list = submit.collectedItems;
                }
                return submit.copy(intentId, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Retry;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "retryableEvent", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$Retry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$UserIntent$RetryableUserIntent;", "getRetryableEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Retry extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Retry(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent) {
                super("OneOnboardingEvent.UserIntent.Retry", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryableUserIntent, "");
                this.retryableEvent = retryableUserIntent;
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent getRetryableEvent() {
                return this.retryableEvent;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent = this.retryableEvent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Retry(retryableEvent=");
                sb.append(retryableUserIntent);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.retryableEvent.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryableEvent, ((com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry) other).retryableEvent);
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry copy(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableEvent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryableEvent, "");
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry(retryableEvent);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent getRetryableEvent() {
                return this.retryableEvent;
            }

            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.Retry retry, com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.UserIntent.RetryableUserIntent retryableUserIntent, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    retryableUserIntent = retry.retryableEvent;
                }
                return retry.copy(retryableUserIntent);
            }
        }

        public /* synthetic */ UserIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FlowLoaded", "FlowLoadFailed", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoadFailed;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SystemEvent extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent {
        public static final int $stable = 0;
        private final java.lang.String name;

        private SystemEvent(java.lang.String str) {
            super(str, null);
            this.name = str;
        }

        @Override // com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent, com.paypal.oslo.core.mvi.Event
        public java.lang.String getName() {
            return this.name;
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoaded;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "getFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FlowLoaded extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlowLoaded(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.Flow flow) {
                super("OneOnboardingEvent.SystemEvent.FlowLoaded", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
                this.intentId = intentId;
                this.flow = flow;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
                return this.flow;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
                com.paypal.oslo.feature.oneonboarding.domain.Flow flow = this.flow;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowLoaded(intentId=");
                sb.append(intentId);
                sb.append(", flow=");
                sb.append(flow);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.intentId.hashCode() * 31) + this.flow.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded)) {
                    return false;
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded flowLoaded = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, flowLoaded.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flow, flowLoaded.flow);
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.Flow flow) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded(intentId, flow);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.domain.Flow getFlow() {
                return this.flow;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoaded flowLoaded, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.Flow flow, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intentId = flowLoaded.intentId;
                }
                if ((i & 2) != 0) {
                    flow = flowLoaded.flow;
                }
                return flowLoaded.copy(intentId, flow);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoadFailed;", "Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "error", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;)Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingEvent$SystemEvent$FlowLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FlowLoadFailed extends com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError error;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlowLoadFailed(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError) {
                super("OneOnboardingEvent.SystemEvent.FlowLoadFailed", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowStepError, "");
                this.intentId = intentId;
                this.error = flowStepError;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
                com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowLoadFailed(intentId=");
                sb.append(intentId);
                sb.append(", error=");
                sb.append(flowStepError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.intentId.hashCode() * 31) + this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed flowLoadFailed = (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, flowLoadFailed.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, flowLoadFailed.error);
            }

            public final com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed(intentId, error);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError getError() {
                return this.error;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed copy$default(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingEvent.SystemEvent.FlowLoadFailed flowLoadFailed, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError flowStepError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intentId = flowLoadFailed.intentId;
                }
                if ((i & 2) != 0) {
                    flowStepError = flowLoadFailed.error;
                }
                return flowLoadFailed.copy(intentId, flowStepError);
            }
        }

        public /* synthetic */ SystemEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public /* synthetic */ OneOnboardingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
