package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00162\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u0016B#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0004\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/paypal/pds/components/TimelineState;", "", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "Lcom/paypal/pds/core/Color;", "p2", "<init>", "(ILcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;)V", "a11ResId", com.visa.cbp.getEncExpo.warmup, "getA11ResId$pds_release", "()I", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "iconTint", "Lcom/paypal/pds/core/Color;", "getIconTint$pds_release", "()Lcom/paypal/pds/core/Color;", "Companion", "Success", "InProgress", "NotStarted", "Alert", "Lcom/paypal/pds/components/TimelineState$Alert;", "Lcom/paypal/pds/components/TimelineState$InProgress;", "Lcom/paypal/pds/components/TimelineState$NotStarted;", "Lcom/paypal/pds/components/TimelineState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TimelineState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.TimelineState.Companion INSTANCE = new com.paypal.pds.components.TimelineState.Companion(null);
    private static final com.paypal.pds.components.TimelineState.InProgress InProgress;
    private static final com.paypal.pds.components.TimelineState.NotStarted NotStarted;
    private final int a11ResId;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.pds.core.Color iconTint;

    private TimelineState(int i, com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color) {
        this.a11ResId = i;
        this.icon = icon;
        this.iconTint = color;
    }

    /* renamed from: getA11ResId$pds_release, reason: from getter */
    public final int getA11ResId() {
        return this.a11ResId;
    }

    /* renamed from: getIcon$pds_release, reason: from getter */
    public com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ TimelineState(int i, com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color.ContentBase contentBase, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, icon, (i2 & 4) != 0 ? com.paypal.pds.core.Color.ContentBase.INSTANCE : contentBase, null);
    }

    /* renamed from: getIconTint$pds_release, reason: from getter */
    public final com.paypal.pds.core.Color getIconTint() {
        return this.iconTint;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/TimelineState$Success;", "Lcom/paypal/pds/components/TimelineState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.pds.components.TimelineState {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.TimelineState.Success INSTANCE = new com.paypal.pds.components.TimelineState.Success();

        public final int hashCode() {
            return 768431114;
        }

        private Success() {
            super(com.paypal.pds.R.string.core_pds_ui_sys_timeline_success_state, com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE, null, 4, null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.TimelineState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/TimelineState$InProgress;", "Lcom/paypal/pds/components/TimelineState;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "component1$pds_release", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/TimelineState$InProgress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class InProgress extends com.paypal.pds.components.TimelineState {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;

        public /* synthetic */ InProgress(com.paypal.pds.core.Icon.TimelineStarted timelineStarted, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.pds.core.Icon.TimelineStarted.INSTANCE : timelineStarted);
        }

        @Override // com.paypal.pds.components.TimelineState
        /* renamed from: getIcon$pds_release */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(com.paypal.pds.core.Icon icon) {
            super(com.paypal.pds.R.string.core_pds_ui_sys_timeline_in_progress_state, icon, null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.icon = icon;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InProgress(icon=");
            sb.append(icon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.components.TimelineState.InProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ((com.paypal.pds.components.TimelineState.InProgress) other).icon);
        }

        public final com.paypal.pds.components.TimelineState.InProgress copy(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.TimelineState.InProgress(icon);
        }

        /* renamed from: component1$pds_release, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.pds.components.TimelineState.InProgress copy$default(com.paypal.pds.components.TimelineState.InProgress inProgress, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = inProgress.icon;
            }
            return inProgress.copy(icon);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InProgress() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/pds/components/TimelineState$NotStarted;", "Lcom/paypal/pds/components/TimelineState;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "component1$pds_release", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/components/TimelineState$NotStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class NotStarted extends com.paypal.pds.components.TimelineState {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;

        public /* synthetic */ NotStarted(com.paypal.pds.core.Icon.TimelineNotStarted timelineNotStarted, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.pds.core.Icon.TimelineNotStarted.INSTANCE : timelineNotStarted);
        }

        @Override // com.paypal.pds.components.TimelineState
        /* renamed from: getIcon$pds_release */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(com.paypal.pds.core.Icon icon) {
            super(com.paypal.pds.R.string.core_pds_ui_sys_timeline_not_started_state, icon, com.paypal.pds.core.Color.ContentFaint.INSTANCE, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.icon = icon;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotStarted(icon=");
            sb.append(icon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.pds.components.TimelineState.NotStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ((com.paypal.pds.components.TimelineState.NotStarted) other).icon);
        }

        public final com.paypal.pds.components.TimelineState.NotStarted copy(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.pds.components.TimelineState.NotStarted(icon);
        }

        /* renamed from: component1$pds_release, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.pds.components.TimelineState.NotStarted copy$default(com.paypal.pds.components.TimelineState.NotStarted notStarted, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = notStarted.icon;
            }
            return notStarted.copy(icon);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/pds/components/TimelineState$Alert;", "Lcom/paypal/pds/components/TimelineState;", "<init>", "()V", "invoke", "()Lcom/paypal/pds/components/TimelineState$Alert;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Alert extends com.paypal.pds.components.TimelineState {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.TimelineState.Alert INSTANCE = new com.paypal.pds.components.TimelineState.Alert();

        public final int hashCode() {
            return 131396387;
        }

        private Alert() {
            super(com.paypal.pds.R.string.core_pds_ui_sys_timeline_alert_state, com.paypal.pds.core.Icon.Alert.INSTANCE, null, 4, null);
        }

        @kotlin.Deprecated(message = "Alert is now a data object. Use TimelineState.Alert directly instead of TimelineState.Alert()", replaceWith = @kotlin.ReplaceWith(expression = "Alert", imports = {}))
        public final com.paypal.pds.components.TimelineState.Alert invoke() {
            return INSTANCE;
        }

        public final java.lang.String toString() {
            return "Alert";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.components.TimelineState.Alert)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/components/TimelineState$Companion;", "", "<init>", "()V", "Lcom/paypal/pds/components/TimelineState$InProgress;", "InProgress", "Lcom/paypal/pds/components/TimelineState$InProgress;", "getInProgress", "()Lcom/paypal/pds/components/TimelineState$InProgress;", "Lcom/paypal/pds/components/TimelineState$NotStarted;", "NotStarted", "Lcom/paypal/pds/components/TimelineState$NotStarted;", "getNotStarted", "()Lcom/paypal/pds/components/TimelineState$NotStarted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.pds.components.TimelineState.InProgress getInProgress() {
            return com.paypal.pds.components.TimelineState.InProgress;
        }

        public final com.paypal.pds.components.TimelineState.NotStarted getNotStarted() {
            return com.paypal.pds.components.TimelineState.NotStarted;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 1;
        InProgress = new com.paypal.pds.components.TimelineState.InProgress(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        NotStarted = new com.paypal.pds.components.TimelineState.NotStarted(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TimelineState(int i, com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, icon, color);
    }
}
