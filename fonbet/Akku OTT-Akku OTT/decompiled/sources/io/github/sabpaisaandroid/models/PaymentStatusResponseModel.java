package io.github.sabpaisaandroid.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lio/github/sabpaisaandroid/models/PaymentStatusResponseModel;", "", "clientCode", "", "statusResponseData", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientCode", "()Ljava/lang/String;", "setClientCode", "(Ljava/lang/String;)V", "getStatusResponseData", "setStatusResponseData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentStatusResponseModel {
    private String clientCode;
    private String statusResponseData;

    public PaymentStatusResponseModel(String clientCode, String statusResponseData) {
        Intrinsics.checkNotNullParameter(clientCode, "clientCode");
        Intrinsics.checkNotNullParameter(statusResponseData, "statusResponseData");
        this.clientCode = clientCode;
        this.statusResponseData = statusResponseData;
    }

    public static /* synthetic */ PaymentStatusResponseModel copy$default(PaymentStatusResponseModel paymentStatusResponseModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentStatusResponseModel.clientCode;
        }
        if ((i & 2) != 0) {
            str2 = paymentStatusResponseModel.statusResponseData;
        }
        return paymentStatusResponseModel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatusResponseData() {
        return this.statusResponseData;
    }

    public final PaymentStatusResponseModel copy(String clientCode, String statusResponseData) {
        Intrinsics.checkNotNullParameter(clientCode, "clientCode");
        Intrinsics.checkNotNullParameter(statusResponseData, "statusResponseData");
        return new PaymentStatusResponseModel(clientCode, statusResponseData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentStatusResponseModel)) {
            return false;
        }
        PaymentStatusResponseModel paymentStatusResponseModel = (PaymentStatusResponseModel) other;
        return Intrinsics.areEqual(this.clientCode, paymentStatusResponseModel.clientCode) && Intrinsics.areEqual(this.statusResponseData, paymentStatusResponseModel.statusResponseData);
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final String getStatusResponseData() {
        return this.statusResponseData;
    }

    public int hashCode() {
        return this.statusResponseData.hashCode() + (this.clientCode.hashCode() * 31);
    }

    public final void setClientCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientCode = str;
    }

    public final void setStatusResponseData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statusResponseData = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentStatusResponseModel(clientCode=");
        sb.append(this.clientCode);
        sb.append(", statusResponseData=");
        return t.b(')', this.statusResponseData, sb);
    }
}
