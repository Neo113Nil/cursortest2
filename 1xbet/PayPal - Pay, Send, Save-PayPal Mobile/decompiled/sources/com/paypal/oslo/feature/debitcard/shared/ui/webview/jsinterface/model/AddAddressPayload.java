package com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddAddressPayload;", "", "", "success", "", "newAddressId", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddAddressPayload;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddAddressPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getSuccess", "Ljava/lang/String;", "getNewAddressId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddAddressPayload {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload.Companion(null);
    private final java.lang.String newAddressId;
    private final boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddAddressPayload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/jsinterface/model/AddAddressPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddAddressPayload(int i, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        this.newAddressId = str;
    }

    public AddAddressPayload(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.success = z;
        this.newAddressId = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.success);
        output.encodeStringElement(serialDesc, 1, self.newAddressId);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getNewAddressId() {
        return this.newAddressId;
    }

    public final java.lang.String toString() {
        boolean z = this.success;
        java.lang.String str = this.newAddressId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddAddressPayload(success=");
        sb.append(z);
        sb.append(", newAddressId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.success) * 31) + this.newAddressId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload addAddressPayload = (com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload) other;
        return this.success == addAddressPayload.success && kotlin.jvm.internal.Intrinsics.areEqual(this.newAddressId, addAddressPayload.newAddressId);
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload copy(boolean success, java.lang.String newAddressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAddressId, "");
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload(success, newAddressId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNewAddressId() {
        return this.newAddressId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload copy$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.jsinterface.model.AddAddressPayload addAddressPayload, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = addAddressPayload.success;
        }
        if ((i & 2) != 0) {
            str = addAddressPayload.newAddressId;
        }
        return addAddressPayload.copy(z, str);
    }
}
