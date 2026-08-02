package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J°\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010>J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0013\u0010@\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010%R%\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010%R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b*\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b+\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b0\u0010!¨\u0006J"}, d2 = {"Lio/github/sabpaisaandroid/models/ActiveMapping;", "Landroid/os/Parcelable;", "mappingId", "", "feeForward", "", "clientId", "paymodeId", "endpointId", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "paymode", "Lio/github/sabpaisaandroid/models/PayMode;", "endpoint", "Lio/github/sabpaisaandroid/models/EndPoint;", "isSelectedAndroid", "feeList", "Ljava/util/ArrayList;", "Lio/github/sabpaisaandroid/models/FeeList;", "Lkotlin/collections/ArrayList;", "imageUrl", "param9", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getClientId", "()Ljava/lang/String;", "getEndpoint", "()Lio/github/sabpaisaandroid/models/EndPoint;", "getEndpointId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeeForward", "setFeeForward", "(Ljava/lang/String;)V", "getFeeList", "()Ljava/util/ArrayList;", "getImageUrl", "setImageUrl", "setSelectedAndroid", "getMappingId", "getParam9", "setParam9", "getPaymode", "()Lio/github/sabpaisaandroid/models/PayMode;", "getPaymodeId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Lio/github/sabpaisaandroid/models/ActiveMapping;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActiveMapping implements Parcelable {
    public static final Parcelable.Creator<ActiveMapping> CREATOR = new a();
    private Boolean active;
    private final String clientId;
    private final EndPoint endpoint;
    private final Integer endpointId;
    private String feeForward;
    private final ArrayList<FeeList> feeList;
    private String imageUrl;
    private Boolean isSelectedAndroid;
    private final Integer mappingId;
    private String param9;
    private final PayMode paymode;
    private final Integer paymodeId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActiveMapping> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActiveMapping createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean valueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            PayMode createFromParcel = parcel.readInt() == 0 ? null : PayMode.CREATOR.createFromParcel(parcel);
            EndPoint createFromParcel2 = parcel.readInt() == 0 ? null : EndPoint.CREATOR.createFromParcel(parcel);
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(FeeList.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ActiveMapping(valueOf, readString, readString2, valueOf2, valueOf3, valueOf4, createFromParcel, createFromParcel2, valueOf5, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActiveMapping[] newArray(int i) {
            return new ActiveMapping[i];
        }
    }

    public ActiveMapping(Integer num, String str, String str2, Integer num2, Integer num3, Boolean bool, PayMode payMode, EndPoint endPoint, Boolean bool2, ArrayList<FeeList> arrayList, String str3, String str4) {
        this.mappingId = num;
        this.feeForward = str;
        this.clientId = str2;
        this.paymodeId = num2;
        this.endpointId = num3;
        this.active = bool;
        this.paymode = payMode;
        this.endpoint = endPoint;
        this.isSelectedAndroid = bool2;
        this.feeList = arrayList;
        this.imageUrl = str3;
        this.param9 = str4;
    }

    public static /* synthetic */ ActiveMapping copy$default(ActiveMapping activeMapping, Integer num, String str, String str2, Integer num2, Integer num3, Boolean bool, PayMode payMode, EndPoint endPoint, Boolean bool2, ArrayList arrayList, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = activeMapping.mappingId;
        }
        if ((i & 2) != 0) {
            str = activeMapping.feeForward;
        }
        if ((i & 4) != 0) {
            str2 = activeMapping.clientId;
        }
        if ((i & 8) != 0) {
            num2 = activeMapping.paymodeId;
        }
        if ((i & 16) != 0) {
            num3 = activeMapping.endpointId;
        }
        if ((i & 32) != 0) {
            bool = activeMapping.active;
        }
        if ((i & 64) != 0) {
            payMode = activeMapping.paymode;
        }
        if ((i & 128) != 0) {
            endPoint = activeMapping.endpoint;
        }
        if ((i & 256) != 0) {
            bool2 = activeMapping.isSelectedAndroid;
        }
        if ((i & 512) != 0) {
            arrayList = activeMapping.feeList;
        }
        if ((i & 1024) != 0) {
            str3 = activeMapping.imageUrl;
        }
        if ((i & 2048) != 0) {
            str4 = activeMapping.param9;
        }
        String str5 = str3;
        String str6 = str4;
        Boolean bool3 = bool2;
        ArrayList arrayList2 = arrayList;
        PayMode payMode2 = payMode;
        EndPoint endPoint2 = endPoint;
        Integer num4 = num3;
        Boolean bool4 = bool;
        return activeMapping.copy(num, str, str2, num2, num4, bool4, payMode2, endPoint2, bool3, arrayList2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMappingId() {
        return this.mappingId;
    }

    public final ArrayList<FeeList> component10() {
        return this.feeList;
    }

    /* renamed from: component11, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getParam9() {
        return this.param9;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeeForward() {
        return this.feeForward;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getPaymodeId() {
        return this.paymodeId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getEndpointId() {
        return this.endpointId;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    /* renamed from: component7, reason: from getter */
    public final PayMode getPaymode() {
        return this.paymode;
    }

    /* renamed from: component8, reason: from getter */
    public final EndPoint getEndpoint() {
        return this.endpoint;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsSelectedAndroid() {
        return this.isSelectedAndroid;
    }

    public final ActiveMapping copy(Integer mappingId, String feeForward, String clientId, Integer paymodeId, Integer endpointId, Boolean active, PayMode paymode, EndPoint endpoint, Boolean isSelectedAndroid, ArrayList<FeeList> feeList, String imageUrl, String param9) {
        return new ActiveMapping(mappingId, feeForward, clientId, paymodeId, endpointId, active, paymode, endpoint, isSelectedAndroid, feeList, imageUrl, param9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveMapping)) {
            return false;
        }
        ActiveMapping activeMapping = (ActiveMapping) other;
        return Intrinsics.areEqual(this.mappingId, activeMapping.mappingId) && Intrinsics.areEqual(this.feeForward, activeMapping.feeForward) && Intrinsics.areEqual(this.clientId, activeMapping.clientId) && Intrinsics.areEqual(this.paymodeId, activeMapping.paymodeId) && Intrinsics.areEqual(this.endpointId, activeMapping.endpointId) && Intrinsics.areEqual(this.active, activeMapping.active) && Intrinsics.areEqual(this.paymode, activeMapping.paymode) && Intrinsics.areEqual(this.endpoint, activeMapping.endpoint) && Intrinsics.areEqual(this.isSelectedAndroid, activeMapping.isSelectedAndroid) && Intrinsics.areEqual(this.feeList, activeMapping.feeList) && Intrinsics.areEqual(this.imageUrl, activeMapping.imageUrl) && Intrinsics.areEqual(this.param9, activeMapping.param9);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final EndPoint getEndpoint() {
        return this.endpoint;
    }

    public final Integer getEndpointId() {
        return this.endpointId;
    }

    public final String getFeeForward() {
        return this.feeForward;
    }

    public final ArrayList<FeeList> getFeeList() {
        return this.feeList;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getMappingId() {
        return this.mappingId;
    }

    public final String getParam9() {
        return this.param9;
    }

    public final PayMode getPaymode() {
        return this.paymode;
    }

    public final Integer getPaymodeId() {
        return this.paymodeId;
    }

    public int hashCode() {
        Integer num = this.mappingId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.feeForward;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.paymodeId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endpointId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.active;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        PayMode payMode = this.paymode;
        int hashCode7 = (hashCode6 + (payMode == null ? 0 : payMode.hashCode())) * 31;
        EndPoint endPoint = this.endpoint;
        int hashCode8 = (hashCode7 + (endPoint == null ? 0 : endPoint.hashCode())) * 31;
        Boolean bool2 = this.isSelectedAndroid;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ArrayList<FeeList> arrayList = this.feeList;
        int hashCode10 = (hashCode9 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.param9;
        return hashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isSelectedAndroid() {
        return this.isSelectedAndroid;
    }

    public final void setActive(Boolean bool) {
        this.active = bool;
    }

    public final void setFeeForward(String str) {
        this.feeForward = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setParam9(String str) {
        this.param9 = str;
    }

    public final void setSelectedAndroid(Boolean bool) {
        this.isSelectedAndroid = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActiveMapping(mappingId=");
        sb.append(this.mappingId);
        sb.append(", feeForward=");
        sb.append(this.feeForward);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", paymodeId=");
        sb.append(this.paymodeId);
        sb.append(", endpointId=");
        sb.append(this.endpointId);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", paymode=");
        sb.append(this.paymode);
        sb.append(", endpoint=");
        sb.append(this.endpoint);
        sb.append(", isSelectedAndroid=");
        sb.append(this.isSelectedAndroid);
        sb.append(", feeList=");
        sb.append(this.feeList);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", param9=");
        return t.b(')', this.param9, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.mappingId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.feeForward);
        parcel.writeString(this.clientId);
        Integer num2 = this.paymodeId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.endpointId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.active;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        PayMode payMode = this.paymode;
        if (payMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payMode.writeToParcel(parcel, flags);
        }
        EndPoint endPoint = this.endpoint;
        if (endPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endPoint.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.isSelectedAndroid;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        ArrayList<FeeList> arrayList = this.feeList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<FeeList> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.param9);
    }
}
