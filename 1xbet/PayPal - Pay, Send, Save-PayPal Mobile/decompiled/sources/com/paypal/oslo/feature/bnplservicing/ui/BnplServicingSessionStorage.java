package com.paypal.oslo.feature.bnplservicing.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/BnplServicingSessionStorage;", "", "<init>", "()V", "", "includeAllFields", "Lcom/paypal/oslo/feature/bnplservicing/logger/ScreenEventAttributes;", "getScreenEventAttributes", "(Z)Lcom/paypal/oslo/feature/bnplservicing/logger/ScreenEventAttributes;", "", "reset", "", "creditProductIdentifier", "Ljava/lang/String;", "getCreditProductIdentifier", "()Ljava/lang/String;", "setCreditProductIdentifier", "(Ljava/lang/String;)V", "paylaterSource", "getPaylaterSource", "setPaylaterSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingSessionStorage {
    public static final int $stable = 8;
    private java.lang.String creditProductIdentifier = "";
    private java.lang.String paylaterSource = "";

    @javax.inject.Inject
    public BnplServicingSessionStorage() {
    }

    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final void setCreditProductIdentifier(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.creditProductIdentifier = str;
    }

    public final java.lang.String getPaylaterSource() {
        return this.paylaterSource;
    }

    public final void setPaylaterSource(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.paylaterSource = str;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.logger.ScreenEventAttributes getScreenEventAttributes$default(com.paypal.oslo.feature.bnplservicing.ui.BnplServicingSessionStorage bnplServicingSessionStorage, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return bnplServicingSessionStorage.getScreenEventAttributes(z);
    }

    public final com.paypal.oslo.feature.bnplservicing.logger.ScreenEventAttributes getScreenEventAttributes(boolean includeAllFields) {
        if (includeAllFields) {
            return new com.paypal.oslo.feature.bnplservicing.logger.ScreenEventAttributes(this.creditProductIdentifier, this.paylaterSource);
        }
        return new com.paypal.oslo.feature.bnplservicing.logger.ScreenEventAttributes("", this.paylaterSource);
    }

    public final void reset() {
        this.creditProductIdentifier = "";
        this.paylaterSource = "";
    }
}
