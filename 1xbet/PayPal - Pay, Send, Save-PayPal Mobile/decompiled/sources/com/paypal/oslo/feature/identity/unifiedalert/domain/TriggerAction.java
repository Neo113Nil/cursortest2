package com.paypal.oslo.feature.identity.unifiedalert.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction;", "", "<init>", "()V", "Fetch", "Skip", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction$Fetch;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction$Skip;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TriggerAction {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction$Fetch;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fetch extends com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch();

        public final int hashCode() {
            return 1123526357;
        }

        private Fetch() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Fetch";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch)) {
                return false;
            }
            return true;
        }
    }

    private TriggerAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction$Skip;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Skip extends com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Skip INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Skip();

        public final int hashCode() {
            return 729372164;
        }

        private Skip() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Skip";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Skip)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ TriggerAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
