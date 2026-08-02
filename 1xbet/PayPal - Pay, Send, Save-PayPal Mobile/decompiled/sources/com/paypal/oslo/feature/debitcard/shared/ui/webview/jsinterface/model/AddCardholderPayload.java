package com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddCardholderPayload;", "", "", "success", "primary", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddCardholderPayload;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddCardholderPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getSuccess", "getPrimary", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddCardholderPayload {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload.Companion(null);
    private final boolean primary;
    private final boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddCardholderPayload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddCardholderPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddCardholderPayload(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        this.primary = z2;
    }

    public AddCardholderPayload(boolean z, boolean z2) {
        this.success = z;
        this.primary = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.success);
        output.encodeBooleanElement(serialDesc, 1, self.primary);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        boolean z2 = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardholderPayload(success=");
        sb.append(z);
        sb.append(", primary=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.success) * 31) + java.lang.Boolean.hashCode(this.primary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload addCardholderPayload = (com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload) other;
        return this.success == addCardholderPayload.success && this.primary == addCardholderPayload.primary;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload copy(boolean success, boolean primary) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload(success, primary);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload copy$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddCardholderPayload addCardholderPayload, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = addCardholderPayload.success;
        }
        if ((i & 2) != 0) {
            z2 = addCardholderPayload.primary;
        }
        return addCardholderPayload.copy(z, z2);
    }
}
