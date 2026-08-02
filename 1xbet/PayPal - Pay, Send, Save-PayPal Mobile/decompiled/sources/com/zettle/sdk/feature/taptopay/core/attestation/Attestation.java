package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000b2\u00020\u0001:\u0004\f\u000b\r\u000eJ\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "action", "", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;)V", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "Companion", "Action", "InAttestationIdle", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Attestation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$InAttestationIdle;", ""}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InAttestationIdle {
    }

    void action(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action action);

    com.zettle.sdk.commons.state.State<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State> getState();

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Failed", "InProgress", "LoggedIn", "LoggedOut", "NotReady", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "ResetProvision", "Succeeded", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$InProgress;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$LoggedIn;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$LoggedOut;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$NotReady;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Ready;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$ResetProvision;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Succeeded;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        private State(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        /* renamed from: toString, reason: from getter */
        public java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$ResetProvision;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$InAttestationIdle;", "Landroid/content/Context;", "context", "", "organizationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getOrganizationId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ResetProvision extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State implements com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle {
            private final android.content.Context context;
            private final java.lang.String organizationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResetProvision(android.content.Context context, java.lang.String str) {
                super("ResetProvision", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.context = context;
                this.organizationId = str;
            }

            public final android.content.Context getContext() {
                return this.context;
            }

            public final java.lang.String getOrganizationId() {
                return this.organizationId;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$LoggedIn;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Landroid/content/Context;", "context", "", "organizationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getOrganizationId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LoggedIn extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State {
            private final android.content.Context context;
            private final java.lang.String organizationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoggedIn(android.content.Context context, java.lang.String str) {
                super("LoggedIn", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.context = context;
                this.organizationId = str;
            }

            public final android.content.Context getContext() {
                return this.context;
            }

            public final java.lang.String getOrganizationId() {
                return this.organizationId;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$LoggedOut;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LoggedOut extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State {
            private final android.content.Context context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoggedOut(android.content.Context context) {
                super("LoggedOut", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                this.context = context;
            }

            public final android.content.Context getContext() {
                return this.context;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$NotReady;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NotReady extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State {
            public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady();

            private NotReady() {
                super("NotReady", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Ready;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$InAttestationIdle;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Ready extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State implements com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle {
            public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready();

            private Ready() {
                super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$InProgress;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InProgress extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State {
            private final android.content.Context context;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InProgress(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                super("InProgress", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                this.context = context;
                this.info = transactionInfo;
            }

            public /* synthetic */ InProgress(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(context, (i & 2) != 0 ? null : transactionInfo);
            }

            public final android.content.Context getContext() {
                return this.context;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Succeeded;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$InAttestationIdle;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Succeeded extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State implements com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle {
            public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded();

            private Succeeded() {
                super("Succeeded", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$InAttestationIdle;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "reason", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedActions", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;Ljava/util/List;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "getReason$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Ljava/util/List;", "getRecommendedActions", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State implements com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle {
            private final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason reason;
            private final java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> recommendedActions;

            /* renamed from: getReason$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason getReason() {
                return this.reason;
            }

            public /* synthetic */ Failed(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason errorReason, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(errorReason, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> getRecommendedActions() {
                return this.recommendedActions;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Failed(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason errorReason, java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> list) {
                super(r0.toString(), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                java.lang.String arrays = java.util.Arrays.toString(list.toArray(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction[0]));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(result:");
                sb.append(errorReason);
                sb.append(", ");
                sb.append(arrays);
                sb.append(")");
                this.reason = errorReason;
                this.recommendedActions = list;
            }
        }

        public /* synthetic */ State(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Attest", "LogIn", "LogOut", "Stop", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogIn;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogOut;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Stop;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        private Action(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        /* renamed from: toString, reason: from getter */
        public java.lang.String getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogIn;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "Landroid/content/Context;", "context", "", "organizationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getOrganizationId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LogIn extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action {
            private final android.content.Context context;
            private final java.lang.String organizationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LogIn(android.content.Context context, java.lang.String str) {
                super("LogIn", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.context = context;
                this.organizationId = str;
            }

            public final android.content.Context getContext() {
                return this.context;
            }

            public final java.lang.String getOrganizationId() {
                return this.organizationId;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogOut;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LogOut extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action {
            private final android.content.Context context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LogOut(android.content.Context context) {
                super("LogOut", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                this.context = context;
            }

            public final android.content.Context getContext() {
                return this.context;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Stop;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Stop extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action {
            public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop();

            private Stop() {
                super("Stop", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "DoAttestation", "FailAttestation", "SucceedAttestation", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$DoAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$FailAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$SucceedAttestation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class Attest extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action {

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            private Attest(java.lang.String str) {
                super("Attest", null);
                this.getHighSpeedVideoFpsRangesFor = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getCamera2StreamConfigurationMap() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$DoAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "transactionInfo", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getTransactionInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class DoAttestation extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest {
                private final android.content.Context context;
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo;

                public /* synthetic */ DoAttestation(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this(context, (i & 2) != 0 ? null : transactionInfo);
                }

                public final android.content.Context getContext() {
                    return this.context;
                }

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getTransactionInfo() {
                    return this.transactionInfo;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public DoAttestation(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                    super(r2.toString(), r0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                    kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                    java.util.UUID id = transactionInfo != null ? transactionInfo.getId() : null;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("DoAttestation(");
                    sb.append(id);
                    sb.append(")");
                    this.context = context;
                    this.transactionInfo = transactionInfo;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$SucceedAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SucceedAttestation extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest {
                public static final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.SucceedAttestation INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.SucceedAttestation();

                private SucceedAttestation() {
                    super("SucceedAttestation", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$FailAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "reason", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedActions", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;Ljava/util/List;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "getReason$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Ljava/util/List;", "getRecommendedActions", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class FailAttestation extends com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest {
                private final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason reason;
                private final java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> recommendedActions;

                /* renamed from: getReason$core_publicRelease, reason: from getter */
                public final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason getReason() {
                    return this.reason;
                }

                public final java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> getRecommendedActions() {
                    return this.recommendedActions;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public FailAttestation(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason errorReason, java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> list) {
                    super(r0.toString(), null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                    java.lang.String arrays = java.util.Arrays.toString(list.toArray(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction[0]));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("FailAttestation(result:");
                    sb.append(errorReason);
                    sb.append(", ");
                    sb.append(arrays);
                    sb.append(")");
                    this.reason = errorReason;
                    this.recommendedActions = list;
                }
            }

            public /* synthetic */ Attest(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        public /* synthetic */ Action(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Companion();

        private Companion() {
        }
    }
}
