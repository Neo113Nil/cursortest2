package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0012Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\u000f¨\u00061"}, d2 = {"Lio/github/sabpaisaandroid/models/AmountBean;", "Landroid/os/Parcelable;", "gst", "", "paidAmount", "actualAmount", "convCharge", "endPointChargse", "amountType", "", "amountMessage", "amountFlag", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getActualAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAmountFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAmountMessage", "()Ljava/lang/String;", "getAmountType", "getConvCharge", "getEndPointChargse", "getGst", "getPaidAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/github/sabpaisaandroid/models/AmountBean;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AmountBean implements Parcelable {
    public static final Parcelable.Creator<AmountBean> CREATOR = new a();
    private final Double actualAmount;
    private final Boolean amountFlag;
    private final String amountMessage;
    private final String amountType;
    private final Double convCharge;
    private final Double endPointChargse;
    private final Double gst;
    private final Double paidAmount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmountBean> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AmountBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AmountBean(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, readString, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AmountBean[] newArray(int i) {
            return new AmountBean[i];
        }
    }

    public AmountBean(Double d, Double d2, Double d3, Double d4, Double d5, String str, String str2, Boolean bool) {
        this.gst = d;
        this.paidAmount = d2;
        this.actualAmount = d3;
        this.convCharge = d4;
        this.endPointChargse = d5;
        this.amountType = str;
        this.amountMessage = str2;
        this.amountFlag = bool;
    }

    public static /* synthetic */ AmountBean copy$default(AmountBean amountBean, Double d, Double d2, Double d3, Double d4, Double d5, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            d = amountBean.gst;
        }
        if ((i & 2) != 0) {
            d2 = amountBean.paidAmount;
        }
        if ((i & 4) != 0) {
            d3 = amountBean.actualAmount;
        }
        if ((i & 8) != 0) {
            d4 = amountBean.convCharge;
        }
        if ((i & 16) != 0) {
            d5 = amountBean.endPointChargse;
        }
        if ((i & 32) != 0) {
            str = amountBean.amountType;
        }
        if ((i & 64) != 0) {
            str2 = amountBean.amountMessage;
        }
        if ((i & 128) != 0) {
            bool = amountBean.amountFlag;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        Double d6 = d5;
        String str4 = str;
        return amountBean.copy(d, d2, d3, d4, d6, str4, str3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getGst() {
        return this.gst;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getPaidAmount() {
        return this.paidAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getActualAmount() {
        return this.actualAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getConvCharge() {
        return this.convCharge;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getEndPointChargse() {
        return this.endPointChargse;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAmountMessage() {
        return this.amountMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getAmountFlag() {
        return this.amountFlag;
    }

    public final AmountBean copy(Double gst, Double paidAmount, Double actualAmount, Double convCharge, Double endPointChargse, String amountType, String amountMessage, Boolean amountFlag) {
        return new AmountBean(gst, paidAmount, actualAmount, convCharge, endPointChargse, amountType, amountMessage, amountFlag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountBean)) {
            return false;
        }
        AmountBean amountBean = (AmountBean) other;
        return Intrinsics.areEqual((Object) this.gst, (Object) amountBean.gst) && Intrinsics.areEqual((Object) this.paidAmount, (Object) amountBean.paidAmount) && Intrinsics.areEqual((Object) this.actualAmount, (Object) amountBean.actualAmount) && Intrinsics.areEqual((Object) this.convCharge, (Object) amountBean.convCharge) && Intrinsics.areEqual((Object) this.endPointChargse, (Object) amountBean.endPointChargse) && Intrinsics.areEqual(this.amountType, amountBean.amountType) && Intrinsics.areEqual(this.amountMessage, amountBean.amountMessage) && Intrinsics.areEqual(this.amountFlag, amountBean.amountFlag);
    }

    public final Double getActualAmount() {
        return this.actualAmount;
    }

    public final Boolean getAmountFlag() {
        return this.amountFlag;
    }

    public final String getAmountMessage() {
        return this.amountMessage;
    }

    public final String getAmountType() {
        return this.amountType;
    }

    public final Double getConvCharge() {
        return this.convCharge;
    }

    public final Double getEndPointChargse() {
        return this.endPointChargse;
    }

    public final Double getGst() {
        return this.gst;
    }

    public final Double getPaidAmount() {
        return this.paidAmount;
    }

    public int hashCode() {
        Double d = this.gst;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.paidAmount;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.actualAmount;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.convCharge;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.endPointChargse;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.amountType;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amountMessage;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.amountFlag;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AmountBean(gst=" + this.gst + ", paidAmount=" + this.paidAmount + ", actualAmount=" + this.actualAmount + ", convCharge=" + this.convCharge + ", endPointChargse=" + this.endPointChargse + ", amountType=" + this.amountType + ", amountMessage=" + this.amountMessage + ", amountFlag=" + this.amountFlag + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.gst;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.paidAmount;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.actualAmount;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.convCharge;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.endPointChargse;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        parcel.writeString(this.amountType);
        parcel.writeString(this.amountMessage);
        Boolean bool = this.amountFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
