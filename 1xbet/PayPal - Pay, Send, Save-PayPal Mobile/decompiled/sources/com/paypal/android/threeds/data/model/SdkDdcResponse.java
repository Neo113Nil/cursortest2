package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/SdkDdcResponse;", "", "", "version", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "getTransactionId", "setTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SdkDdcResponse {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("threeds_server_transaction_id")
    private java.lang.String transactionId;

    @com.google.gson.annotations.SerializedName("version")
    private java.lang.String version;

    public SdkDdcResponse(java.lang.String str, java.lang.String str2) {
        this.version = str;
        this.transactionId = str2;
    }

    public /* synthetic */ SdkDdcResponse(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final void setVersion(java.lang.String str) {
        this.version = str;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final void setTransactionId(java.lang.String str) {
        this.transactionId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkDdcResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
