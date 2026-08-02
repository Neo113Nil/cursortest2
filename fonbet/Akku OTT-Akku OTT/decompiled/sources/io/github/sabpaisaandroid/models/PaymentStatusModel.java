package io.github.sabpaisaandroid.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lio/github/sabpaisaandroid/models/PaymentStatusModel;", "", "clientCode", "", "statusTransEncData", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientCode", "()Ljava/lang/String;", "setClientCode", "(Ljava/lang/String;)V", "getStatusTransEncData", "setStatusTransEncData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentStatusModel {
    private String clientCode;
    private String statusTransEncData;

    public PaymentStatusModel(String clientCode, String statusTransEncData) {
        Intrinsics.checkNotNullParameter(clientCode, "clientCode");
        Intrinsics.checkNotNullParameter(statusTransEncData, "statusTransEncData");
        this.clientCode = clientCode;
        this.statusTransEncData = statusTransEncData;
    }

    public static /* synthetic */ PaymentStatusModel copy$default(PaymentStatusModel paymentStatusModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentStatusModel.clientCode;
        }
        if ((i & 2) != 0) {
            str2 = paymentStatusModel.statusTransEncData;
        }
        return paymentStatusModel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatusTransEncData() {
        return this.statusTransEncData;
    }

    public final PaymentStatusModel copy(String clientCode, String statusTransEncData) {
        Intrinsics.checkNotNullParameter(clientCode, "clientCode");
        Intrinsics.checkNotNullParameter(statusTransEncData, "statusTransEncData");
        return new PaymentStatusModel(clientCode, statusTransEncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentStatusModel)) {
            return false;
        }
        PaymentStatusModel paymentStatusModel = (PaymentStatusModel) other;
        return Intrinsics.areEqual(this.clientCode, paymentStatusModel.clientCode) && Intrinsics.areEqual(this.statusTransEncData, paymentStatusModel.statusTransEncData);
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final String getStatusTransEncData() {
        return this.statusTransEncData;
    }

    public int hashCode() {
        return this.statusTransEncData.hashCode() + (this.clientCode.hashCode() * 31);
    }

    public final void setClientCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientCode = str;
    }

    public final void setStatusTransEncData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statusTransEncData = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentStatusModel(clientCode=");
        sb.append(this.clientCode);
        sb.append(", statusTransEncData=");
        return t.b(')', this.statusTransEncData, sb);
    }
}
