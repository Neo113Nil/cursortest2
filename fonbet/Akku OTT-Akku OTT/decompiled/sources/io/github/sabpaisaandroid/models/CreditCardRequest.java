package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001cJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010Q\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jæ\u0001\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\\J\t\u0010]\u001a\u00020^HÖ\u0001J\u0013\u0010_\u001a\u00020\u00182\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020^HÖ\u0001J\t\u0010c\u001a\u00020\u0007HÖ\u0001J\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020^HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010&¨\u0006i"}, d2 = {"Lio/github/sabpaisaandroid/models/CreditCardRequest;", "Landroid/os/Parcelable;", "clientId", "", "paidAmount", "", "txnId", "", "clientTxnId", "clientName", "clientCode", "requestAmount", "payeeEmail", "payeeMobile", "amountType", "payMode", "Lio/github/sabpaisaandroid/models/PayMode;", "endPoint", "Lio/github/sabpaisaandroid/models/EndPoint;", "udf1", "deviceName", "cardBean", "Lio/github/sabpaisaandroid/models/CardBean;", "binUpdateFlag", "", "donationAmount", "", "browserDetails", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/models/CardBean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)V", "getAmountType", "()Ljava/lang/String;", "getBinUpdateFlag", "()Ljava/lang/Boolean;", "setBinUpdateFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBrowserDetails", "setBrowserDetails", "(Ljava/lang/String;)V", "getCardBean", "()Lio/github/sabpaisaandroid/models/CardBean;", "getClientCode", "getClientId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientName", "getClientTxnId", "getDeviceName", "getDonationAmount", "()Ljava/lang/Float;", "setDonationAmount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getEndPoint", "()Lio/github/sabpaisaandroid/models/EndPoint;", "setEndPoint", "(Lio/github/sabpaisaandroid/models/EndPoint;)V", "getPaidAmount", "()Ljava/lang/Double;", "setPaidAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPayMode", "()Lio/github/sabpaisaandroid/models/PayMode;", "setPayMode", "(Lio/github/sabpaisaandroid/models/PayMode;)V", "getPayeeEmail", "getPayeeMobile", "getRequestAmount", "setRequestAmount", "getTxnId", "getUdf1", "setUdf1", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/models/CardBean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)Lio/github/sabpaisaandroid/models/CreditCardRequest;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditCardRequest implements Parcelable {
    public static final Parcelable.Creator<CreditCardRequest> CREATOR = new a();
    private final String amountType;
    private Boolean binUpdateFlag;
    private String browserDetails;
    private final CardBean cardBean;
    private final String clientCode;
    private final Long clientId;
    private final String clientName;
    private final String clientTxnId;
    private final String deviceName;
    private Float donationAmount;
    private EndPoint endPoint;
    private Double paidAmount;
    private PayMode payMode;
    private final String payeeEmail;
    private final String payeeMobile;
    private Double requestAmount;
    private final String txnId;
    private String udf1;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditCardRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreditCardRequest createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            PayMode createFromParcel = parcel.readInt() == 0 ? null : PayMode.CREATOR.createFromParcel(parcel);
            EndPoint createFromParcel2 = parcel.readInt() == 0 ? null : EndPoint.CREATOR.createFromParcel(parcel);
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            CardBean createFromParcel3 = parcel.readInt() == 0 ? null : CardBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreditCardRequest(valueOf2, valueOf3, readString, readString2, readString3, readString4, valueOf4, readString5, readString6, readString7, createFromParcel, createFromParcel2, readString8, readString9, createFromParcel3, valueOf, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreditCardRequest[] newArray(int i) {
            return new CreditCardRequest[i];
        }
    }

    public CreditCardRequest(Long l, Double d, String str, String str2, String str3, String str4, Double d2, String str5, String str6, String str7, PayMode payMode, EndPoint endPoint, String str8, String str9, CardBean cardBean, Boolean bool, Float f, String str10) {
        this.clientId = l;
        this.paidAmount = d;
        this.txnId = str;
        this.clientTxnId = str2;
        this.clientName = str3;
        this.clientCode = str4;
        this.requestAmount = d2;
        this.payeeEmail = str5;
        this.payeeMobile = str6;
        this.amountType = str7;
        this.payMode = payMode;
        this.endPoint = endPoint;
        this.udf1 = str8;
        this.deviceName = str9;
        this.cardBean = cardBean;
        this.binUpdateFlag = bool;
        this.donationAmount = f;
        this.browserDetails = str10;
    }

    public static /* synthetic */ CreditCardRequest copy$default(CreditCardRequest creditCardRequest, Long l, Double d, String str, String str2, String str3, String str4, Double d2, String str5, String str6, String str7, PayMode payMode, EndPoint endPoint, String str8, String str9, CardBean cardBean, Boolean bool, Float f, String str10, int i, Object obj) {
        String str11;
        Float f2;
        Long l2 = (i & 1) != 0 ? creditCardRequest.clientId : l;
        Double d3 = (i & 2) != 0 ? creditCardRequest.paidAmount : d;
        String str12 = (i & 4) != 0 ? creditCardRequest.txnId : str;
        String str13 = (i & 8) != 0 ? creditCardRequest.clientTxnId : str2;
        String str14 = (i & 16) != 0 ? creditCardRequest.clientName : str3;
        String str15 = (i & 32) != 0 ? creditCardRequest.clientCode : str4;
        Double d4 = (i & 64) != 0 ? creditCardRequest.requestAmount : d2;
        String str16 = (i & 128) != 0 ? creditCardRequest.payeeEmail : str5;
        String str17 = (i & 256) != 0 ? creditCardRequest.payeeMobile : str6;
        String str18 = (i & 512) != 0 ? creditCardRequest.amountType : str7;
        PayMode payMode2 = (i & 1024) != 0 ? creditCardRequest.payMode : payMode;
        EndPoint endPoint2 = (i & 2048) != 0 ? creditCardRequest.endPoint : endPoint;
        String str19 = (i & 4096) != 0 ? creditCardRequest.udf1 : str8;
        String str20 = (i & 8192) != 0 ? creditCardRequest.deviceName : str9;
        Long l3 = l2;
        CardBean cardBean2 = (i & 16384) != 0 ? creditCardRequest.cardBean : cardBean;
        Boolean bool2 = (i & 32768) != 0 ? creditCardRequest.binUpdateFlag : bool;
        Float f3 = (i & 65536) != 0 ? creditCardRequest.donationAmount : f;
        if ((i & 131072) != 0) {
            f2 = f3;
            str11 = creditCardRequest.browserDetails;
        } else {
            str11 = str10;
            f2 = f3;
        }
        return creditCardRequest.copy(l3, d3, str12, str13, str14, str15, d4, str16, str17, str18, payMode2, endPoint2, str19, str20, cardBean2, bool2, f2, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getClientId() {
        return this.clientId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* renamed from: component11, reason: from getter */
    public final PayMode getPayMode() {
        return this.payMode;
    }

    /* renamed from: component12, reason: from getter */
    public final EndPoint getEndPoint() {
        return this.endPoint;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUdf1() {
        return this.udf1;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component15, reason: from getter */
    public final CardBean getCardBean() {
        return this.cardBean;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getBinUpdateFlag() {
        return this.binUpdateFlag;
    }

    /* renamed from: component17, reason: from getter */
    public final Float getDonationAmount() {
        return this.donationAmount;
    }

    /* renamed from: component18, reason: from getter */
    public final String getBrowserDetails() {
        return this.browserDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getPaidAmount() {
        return this.paidAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTxnId() {
        return this.txnId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getRequestAmount() {
        return this.requestAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPayeeMobile() {
        return this.payeeMobile;
    }

    public final CreditCardRequest copy(Long clientId, Double paidAmount, String txnId, String clientTxnId, String clientName, String clientCode, Double requestAmount, String payeeEmail, String payeeMobile, String amountType, PayMode payMode, EndPoint endPoint, String udf1, String deviceName, CardBean cardBean, Boolean binUpdateFlag, Float donationAmount, String browserDetails) {
        return new CreditCardRequest(clientId, paidAmount, txnId, clientTxnId, clientName, clientCode, requestAmount, payeeEmail, payeeMobile, amountType, payMode, endPoint, udf1, deviceName, cardBean, binUpdateFlag, donationAmount, browserDetails);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardRequest)) {
            return false;
        }
        CreditCardRequest creditCardRequest = (CreditCardRequest) other;
        return Intrinsics.areEqual(this.clientId, creditCardRequest.clientId) && Intrinsics.areEqual((Object) this.paidAmount, (Object) creditCardRequest.paidAmount) && Intrinsics.areEqual(this.txnId, creditCardRequest.txnId) && Intrinsics.areEqual(this.clientTxnId, creditCardRequest.clientTxnId) && Intrinsics.areEqual(this.clientName, creditCardRequest.clientName) && Intrinsics.areEqual(this.clientCode, creditCardRequest.clientCode) && Intrinsics.areEqual((Object) this.requestAmount, (Object) creditCardRequest.requestAmount) && Intrinsics.areEqual(this.payeeEmail, creditCardRequest.payeeEmail) && Intrinsics.areEqual(this.payeeMobile, creditCardRequest.payeeMobile) && Intrinsics.areEqual(this.amountType, creditCardRequest.amountType) && Intrinsics.areEqual(this.payMode, creditCardRequest.payMode) && Intrinsics.areEqual(this.endPoint, creditCardRequest.endPoint) && Intrinsics.areEqual(this.udf1, creditCardRequest.udf1) && Intrinsics.areEqual(this.deviceName, creditCardRequest.deviceName) && Intrinsics.areEqual(this.cardBean, creditCardRequest.cardBean) && Intrinsics.areEqual(this.binUpdateFlag, creditCardRequest.binUpdateFlag) && Intrinsics.areEqual((Object) this.donationAmount, (Object) creditCardRequest.donationAmount) && Intrinsics.areEqual(this.browserDetails, creditCardRequest.browserDetails);
    }

    public final String getAmountType() {
        return this.amountType;
    }

    public final Boolean getBinUpdateFlag() {
        return this.binUpdateFlag;
    }

    public final String getBrowserDetails() {
        return this.browserDetails;
    }

    public final CardBean getCardBean() {
        return this.cardBean;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final Long getClientId() {
        return this.clientId;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final Float getDonationAmount() {
        return this.donationAmount;
    }

    public final EndPoint getEndPoint() {
        return this.endPoint;
    }

    public final Double getPaidAmount() {
        return this.paidAmount;
    }

    public final PayMode getPayMode() {
        return this.payMode;
    }

    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    public final String getPayeeMobile() {
        return this.payeeMobile;
    }

    public final Double getRequestAmount() {
        return this.requestAmount;
    }

    public final String getTxnId() {
        return this.txnId;
    }

    public final String getUdf1() {
        return this.udf1;
    }

    public int hashCode() {
        Long l = this.clientId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.paidAmount;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.txnId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientTxnId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.requestAmount;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.payeeEmail;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payeeMobile;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.amountType;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PayMode payMode = this.payMode;
        int hashCode11 = (hashCode10 + (payMode == null ? 0 : payMode.hashCode())) * 31;
        EndPoint endPoint = this.endPoint;
        int hashCode12 = (hashCode11 + (endPoint == null ? 0 : endPoint.hashCode())) * 31;
        String str8 = this.udf1;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deviceName;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        CardBean cardBean = this.cardBean;
        int hashCode15 = (hashCode14 + (cardBean == null ? 0 : cardBean.hashCode())) * 31;
        Boolean bool = this.binUpdateFlag;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.donationAmount;
        int hashCode17 = (hashCode16 + (f == null ? 0 : f.hashCode())) * 31;
        String str10 = this.browserDetails;
        return hashCode17 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setBinUpdateFlag(Boolean bool) {
        this.binUpdateFlag = bool;
    }

    public final void setBrowserDetails(String str) {
        this.browserDetails = str;
    }

    public final void setDonationAmount(Float f) {
        this.donationAmount = f;
    }

    public final void setEndPoint(EndPoint endPoint) {
        this.endPoint = endPoint;
    }

    public final void setPaidAmount(Double d) {
        this.paidAmount = d;
    }

    public final void setPayMode(PayMode payMode) {
        this.payMode = payMode;
    }

    public final void setRequestAmount(Double d) {
        this.requestAmount = d;
    }

    public final void setUdf1(String str) {
        this.udf1 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreditCardRequest(clientId=");
        sb.append(this.clientId);
        sb.append(", paidAmount=");
        sb.append(this.paidAmount);
        sb.append(", txnId=");
        sb.append(this.txnId);
        sb.append(", clientTxnId=");
        sb.append(this.clientTxnId);
        sb.append(", clientName=");
        sb.append(this.clientName);
        sb.append(", clientCode=");
        sb.append(this.clientCode);
        sb.append(", requestAmount=");
        sb.append(this.requestAmount);
        sb.append(", payeeEmail=");
        sb.append(this.payeeEmail);
        sb.append(", payeeMobile=");
        sb.append(this.payeeMobile);
        sb.append(", amountType=");
        sb.append(this.amountType);
        sb.append(", payMode=");
        sb.append(this.payMode);
        sb.append(", endPoint=");
        sb.append(this.endPoint);
        sb.append(", udf1=");
        sb.append(this.udf1);
        sb.append(", deviceName=");
        sb.append(this.deviceName);
        sb.append(", cardBean=");
        sb.append(this.cardBean);
        sb.append(", binUpdateFlag=");
        sb.append(this.binUpdateFlag);
        sb.append(", donationAmount=");
        sb.append(this.donationAmount);
        sb.append(", browserDetails=");
        return t.b(')', this.browserDetails, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Long l = this.clientId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Double d = this.paidAmount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.txnId);
        parcel.writeString(this.clientTxnId);
        parcel.writeString(this.clientName);
        parcel.writeString(this.clientCode);
        Double d2 = this.requestAmount;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.payeeEmail);
        parcel.writeString(this.payeeMobile);
        parcel.writeString(this.amountType);
        PayMode payMode = this.payMode;
        if (payMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payMode.writeToParcel(parcel, flags);
        }
        EndPoint endPoint = this.endPoint;
        if (endPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endPoint.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.udf1);
        parcel.writeString(this.deviceName);
        CardBean cardBean = this.cardBean;
        if (cardBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardBean.writeToParcel(parcel, flags);
        }
        Boolean bool = this.binUpdateFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f = this.donationAmount;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.browserDetails);
    }

    public /* synthetic */ CreditCardRequest(Long l, Double d, String str, String str2, String str3, String str4, Double d2, String str5, String str6, String str7, PayMode payMode, EndPoint endPoint, String str8, String str9, CardBean cardBean, Boolean bool, Float f, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, d, str, str2, str3, str4, d2, str5, str6, str7, payMode, endPoint, str8, str9, cardBean, bool, (i & 65536) != 0 ? Float.valueOf(0.0f) : f, (i & 131072) != 0 ? "" : str10);
    }
}
