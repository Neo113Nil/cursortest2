package com.paypal.oslo.feature.identity.login.domain.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "state", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "action", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "reduce", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "ReducerOutput"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface IdentityLoginFlowReducer {
    com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reduce(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState state, com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction action);

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "state", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/IdentityLoginFlowEffect;", "effects", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "getState", "Ljava/util/List;", "getEffects"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReducerOutput {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> effects;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState state;

        /* JADX WARN: Multi-variable type inference failed */
        public ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authFlowState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.state = authFlowState;
            this.effects = list;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState getState() {
            return this.state;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> getEffects() {
            return this.effects;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState = this.state;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> list = this.effects;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReducerOutput(state=");
            sb.append(authFlowState);
            sb.append(", effects=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.state.hashCode() * 31) + this.effects.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reducerOutput = (com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.state, reducerOutput.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.effects, reducerOutput.effects);
        }

        public final com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput copy(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState state, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> effects) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effects, "");
            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, effects);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect> component2() {
            return this.effects;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState getState() {
            return this.state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput copy$default(com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reducerOutput, com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authFlowState = reducerOutput.state;
            }
            if ((i & 2) != 0) {
                list = reducerOutput.effects;
            }
            return reducerOutput.copy(authFlowState, list);
        }
    }
}
