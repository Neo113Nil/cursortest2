package com.paypal.oslo.core.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007:\u0002\u0012\u0013J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/Event;", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/core/mvi/UiEffect;", "E", "", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/Event;)Larrow/core/Either;", "Output", "UnexpectedEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Reducer<S extends com.paypal.oslo.core.mvi.UiState, I extends com.paypal.oslo.core.mvi.Event, E extends com.paypal.oslo.core.mvi.UiEffect> {
    java.lang.String getName();

    arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<S, E>> reduce(S state, I event);

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0004*\u00020\u00032\u00020\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00028\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00028\u00038\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00018\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/UiEffect;", "E", "", "state", "effect", "<init>", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/UiEffect;)V", "component1", "()Lcom/paypal/oslo/core/mvi/UiState;", "component2", "()Lcom/paypal/oslo/core/mvi/UiEffect;", "copy", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/UiEffect;)Lcom/paypal/oslo/core/mvi/Reducer$Output;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/mvi/UiState;", "getState", "Lcom/paypal/oslo/core/mvi/UiEffect;", "getEffect"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Output<S extends com.paypal.oslo.core.mvi.UiState, E extends com.paypal.oslo.core.mvi.UiEffect> {
        private final E effect;
        private final S state;

        public Output(S s, E e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
            this.state = s;
            this.effect = e;
        }

        public /* synthetic */ Output(com.paypal.oslo.core.mvi.UiState uiState, com.paypal.oslo.core.mvi.UiEffect uiEffect, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiState, (i & 2) != 0 ? null : uiEffect);
        }

        public final S getState() {
            return this.state;
        }

        public final E getEffect() {
            return this.effect;
        }

        public final java.lang.String toString() {
            S s = this.state;
            E e = this.effect;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Output(state=");
            sb.append(s);
            sb.append(", effect=");
            sb.append(e);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.state.hashCode();
            E e = this.effect;
            return (hashCode * 31) + (e == null ? 0 : e.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.mvi.Reducer.Output)) {
                return false;
            }
            com.paypal.oslo.core.mvi.Reducer.Output output = (com.paypal.oslo.core.mvi.Reducer.Output) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.state, output.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.effect, output.effect);
        }

        public final com.paypal.oslo.core.mvi.Reducer.Output<S, E> copy(S state, E effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.core.mvi.Reducer.Output<>(state, effect);
        }

        public final E component2() {
            return this.effect;
        }

        public final S component1() {
            return this.state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.mvi.Reducer.Output copy$default(com.paypal.oslo.core.mvi.Reducer.Output output, com.paypal.oslo.core.mvi.UiState uiState, com.paypal.oslo.core.mvi.UiEffect uiEffect, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiState = output.state;
            }
            if ((i & 2) != 0) {
                uiEffect = output.effect;
            }
            return output.copy(uiState, uiEffect);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "", "Lcom/paypal/oslo/core/mvi/UiState;", "state", "Lcom/paypal/oslo/core/mvi/Event;", "event", "<init>", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/Event;)V", "component1", "()Lcom/paypal/oslo/core/mvi/UiState;", "component2", "()Lcom/paypal/oslo/core/mvi/Event;", "copy", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/Event;)Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/mvi/UiState;", "getState", "Lcom/paypal/oslo/core/mvi/Event;", "getEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedEvent {
        private final com.paypal.oslo.core.mvi.Event event;
        private final com.paypal.oslo.core.mvi.UiState state;

        public UnexpectedEvent(com.paypal.oslo.core.mvi.UiState uiState, com.paypal.oslo.core.mvi.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            this.state = uiState;
            this.event = event;
        }

        public final com.paypal.oslo.core.mvi.UiState getState() {
            return this.state;
        }

        public final com.paypal.oslo.core.mvi.Event getEvent() {
            return this.event;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.mvi.UiState uiState = this.state;
            com.paypal.oslo.core.mvi.Event event = this.event;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnexpectedEvent(state=");
            sb.append(uiState);
            sb.append(", event=");
            sb.append(event);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.state.hashCode() * 31) + this.event.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent)) {
                return false;
            }
            com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent unexpectedEvent = (com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.state, unexpectedEvent.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, unexpectedEvent.event);
        }

        public final com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent copy(com.paypal.oslo.core.mvi.UiState state, com.paypal.oslo.core.mvi.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            return new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(state, event);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.mvi.Event getEvent() {
            return this.event;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.mvi.UiState getState() {
            return this.state;
        }

        public static /* synthetic */ com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent copy$default(com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent unexpectedEvent, com.paypal.oslo.core.mvi.UiState uiState, com.paypal.oslo.core.mvi.Event event, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiState = unexpectedEvent.state;
            }
            if ((i & 2) != 0) {
                event = unexpectedEvent.event;
            }
            return unexpectedEvent.copy(uiState, event);
        }
    }
}
