package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep;", "", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "Companion", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RequirementsManagerDep {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.requirements.RequirementsManagerDep.Companion INSTANCE = com.zettle.sdk.core.requirements.RequirementsManagerDep.Companion.getHighSpeedVideoFpsRangesFor;

    com.zettle.sdk.commons.state.State<com.zettle.sdk.core.requirements.RequirementsManagerDep.State> getState();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;", "", "<init>", "()V", "Denied", "Granted", "Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State$Denied;", "Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State$Granted;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State$Granted;", "Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Granted extends com.zettle.sdk.core.requirements.RequirementsManagerDep.State {
            public static final com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Granted INSTANCE = new com.zettle.sdk.core.requirements.RequirementsManagerDep.State.Granted();

            private Granted() {
                super(null);
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State$Denied;", "Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$State;", "", "Lcom/zettle/sdk/core/requirements/RequirementDep;", "requirements", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getRequirements", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Denied extends com.zettle.sdk.core.requirements.RequirementsManagerDep.State {
            private final java.util.List<com.zettle.sdk.core.requirements.RequirementDep> requirements;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Denied(java.util.List<? extends com.zettle.sdk.core.requirements.RequirementDep> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.requirements = list;
            }

            public final java.util.List<com.zettle.sdk.core.requirements.RequirementDep> getRequirements() {
                return this.requirements;
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementsManagerDep$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.requirements.RequirementsManagerDep.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.core.requirements.RequirementsManagerDep.Companion();

        private Companion() {
        }
    }
}
