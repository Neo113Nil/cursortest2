package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/user/ReceiptSettings;", "", "", "seen1", "", "showLegalDisclaimer", "isEmailSuggestionsDisabled", "isPhoneSuggestionsDisabled", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/zettle/sdk/core/user/ReceiptSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/ReceiptSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getShowLegalDisclaimer", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class ReceiptSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.ReceiptSettings.Companion INSTANCE = new com.zettle.sdk.core.user.ReceiptSettings.Companion(null);
    private final boolean isEmailSuggestionsDisabled;
    private final boolean isPhoneSuggestionsDisabled;
    private final boolean showLegalDisclaimer;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/ReceiptSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/ReceiptSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.ReceiptSettings> serializer() {
            return com.zettle.sdk.core.user.ReceiptSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ReceiptSettings(int i, boolean z, boolean z2, boolean z3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.zettle.sdk.core.user.ReceiptSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.showLegalDisclaimer = z;
        this.isEmailSuggestionsDisabled = z2;
        this.isPhoneSuggestionsDisabled = z3;
    }

    public ReceiptSettings(boolean z, boolean z2, boolean z3) {
        this.showLegalDisclaimer = z;
        this.isEmailSuggestionsDisabled = z2;
        this.isPhoneSuggestionsDisabled = z3;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.ReceiptSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeBooleanElement(serialDesc, 0, self.showLegalDisclaimer);
        output.encodeBooleanElement(serialDesc, 1, self.isEmailSuggestionsDisabled);
        output.encodeBooleanElement(serialDesc, 2, self.isPhoneSuggestionsDisabled);
    }

    public final boolean getShowLegalDisclaimer() {
        return this.showLegalDisclaimer;
    }

    public final boolean isEmailSuggestionsDisabled() {
        return this.isEmailSuggestionsDisabled;
    }

    public final boolean isPhoneSuggestionsDisabled() {
        return this.isPhoneSuggestionsDisabled;
    }

    public final java.lang.String toString() {
        boolean z = this.showLegalDisclaimer;
        boolean z2 = this.isEmailSuggestionsDisabled;
        boolean z3 = this.isPhoneSuggestionsDisabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiptSettings(showLegalDisclaimer=");
        sb.append(z);
        sb.append(", isEmailSuggestionsDisabled=");
        sb.append(z2);
        sb.append(", isPhoneSuggestionsDisabled=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.showLegalDisclaimer;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.isEmailSuggestionsDisabled;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        boolean z2 = this.isPhoneSuggestionsDisabled;
        return (((r0 * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.ReceiptSettings)) {
            return false;
        }
        com.zettle.sdk.core.user.ReceiptSettings receiptSettings = (com.zettle.sdk.core.user.ReceiptSettings) other;
        return this.showLegalDisclaimer == receiptSettings.showLegalDisclaimer && this.isEmailSuggestionsDisabled == receiptSettings.isEmailSuggestionsDisabled && this.isPhoneSuggestionsDisabled == receiptSettings.isPhoneSuggestionsDisabled;
    }

    public final com.zettle.sdk.core.user.ReceiptSettings copy(boolean showLegalDisclaimer, boolean isEmailSuggestionsDisabled, boolean isPhoneSuggestionsDisabled) {
        return new com.zettle.sdk.core.user.ReceiptSettings(showLegalDisclaimer, isEmailSuggestionsDisabled, isPhoneSuggestionsDisabled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPhoneSuggestionsDisabled() {
        return this.isPhoneSuggestionsDisabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEmailSuggestionsDisabled() {
        return this.isEmailSuggestionsDisabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLegalDisclaimer() {
        return this.showLegalDisclaimer;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.ReceiptSettings copy$default(com.zettle.sdk.core.user.ReceiptSettings receiptSettings, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = receiptSettings.showLegalDisclaimer;
        }
        if ((i & 2) != 0) {
            z2 = receiptSettings.isEmailSuggestionsDisabled;
        }
        if ((i & 4) != 0) {
            z3 = receiptSettings.isPhoneSuggestionsDisabled;
        }
        return receiptSettings.copy(z, z2, z3);
    }
}
