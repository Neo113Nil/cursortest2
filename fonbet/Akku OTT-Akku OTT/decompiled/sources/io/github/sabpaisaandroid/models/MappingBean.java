package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014¨\u00065"}, d2 = {"Lio/github/sabpaisaandroid/models/MappingBean;", "Landroid/os/Parcelable;", "mappingId", "", "feeForward", "", "clientId", "paymodeId", "endpointId", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "paymode", "Lio/github/sabpaisaandroid/models/PayMode;", "endpoint", "Lio/github/sabpaisaandroid/models/EndPoint;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getClientId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndpoint", "()Lio/github/sabpaisaandroid/models/EndPoint;", "getEndpointId", "getFeeForward", "()Ljava/lang/String;", "getMappingId", "getPaymode", "()Lio/github/sabpaisaandroid/models/PayMode;", "getPaymodeId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lio/github/sabpaisaandroid/models/PayMode;Lio/github/sabpaisaandroid/models/EndPoint;)Lio/github/sabpaisaandroid/models/MappingBean;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MappingBean implements Parcelable {
    public static final Parcelable.Creator<MappingBean> CREATOR = new a();
    private final Boolean active;
    private final Long clientId;
    private final EndPoint endpoint;
    private final Long endpointId;
    private final String feeForward;
    private final Long mappingId;
    private final PayMode paymode;
    private final Long paymodeId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MappingBean> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MappingBean createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MappingBean(valueOf2, readString, valueOf3, valueOf4, valueOf5, valueOf, parcel.readInt() == 0 ? null : PayMode.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EndPoint.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MappingBean[] newArray(int i) {
            return new MappingBean[i];
        }
    }

    public MappingBean(Long l, String str, Long l2, Long l3, Long l4, Boolean bool, PayMode payMode, EndPoint endPoint) {
        this.mappingId = l;
        this.feeForward = str;
        this.clientId = l2;
        this.paymodeId = l3;
        this.endpointId = l4;
        this.active = bool;
        this.paymode = payMode;
        this.endpoint = endPoint;
    }

    public static /* synthetic */ MappingBean copy$default(MappingBean mappingBean, Long l, String str, Long l2, Long l3, Long l4, Boolean bool, PayMode payMode, EndPoint endPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            l = mappingBean.mappingId;
        }
        if ((i & 2) != 0) {
            str = mappingBean.feeForward;
        }
        if ((i & 4) != 0) {
            l2 = mappingBean.clientId;
        }
        if ((i & 8) != 0) {
            l3 = mappingBean.paymodeId;
        }
        if ((i & 16) != 0) {
            l4 = mappingBean.endpointId;
        }
        if ((i & 32) != 0) {
            bool = mappingBean.active;
        }
        if ((i & 64) != 0) {
            payMode = mappingBean.paymode;
        }
        if ((i & 128) != 0) {
            endPoint = mappingBean.endpoint;
        }
        PayMode payMode2 = payMode;
        EndPoint endPoint2 = endPoint;
        Long l5 = l4;
        Boolean bool2 = bool;
        return mappingBean.copy(l, str, l2, l3, l5, bool2, payMode2, endPoint2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getMappingId() {
        return this.mappingId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeeForward() {
        return this.feeForward;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getClientId() {
        return this.clientId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getPaymodeId() {
        return this.paymodeId;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getEndpointId() {
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

    public final MappingBean copy(Long mappingId, String feeForward, Long clientId, Long paymodeId, Long endpointId, Boolean active, PayMode paymode, EndPoint endpoint) {
        return new MappingBean(mappingId, feeForward, clientId, paymodeId, endpointId, active, paymode, endpoint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MappingBean)) {
            return false;
        }
        MappingBean mappingBean = (MappingBean) other;
        return Intrinsics.areEqual(this.mappingId, mappingBean.mappingId) && Intrinsics.areEqual(this.feeForward, mappingBean.feeForward) && Intrinsics.areEqual(this.clientId, mappingBean.clientId) && Intrinsics.areEqual(this.paymodeId, mappingBean.paymodeId) && Intrinsics.areEqual(this.endpointId, mappingBean.endpointId) && Intrinsics.areEqual(this.active, mappingBean.active) && Intrinsics.areEqual(this.paymode, mappingBean.paymode) && Intrinsics.areEqual(this.endpoint, mappingBean.endpoint);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final Long getClientId() {
        return this.clientId;
    }

    public final EndPoint getEndpoint() {
        return this.endpoint;
    }

    public final Long getEndpointId() {
        return this.endpointId;
    }

    public final String getFeeForward() {
        return this.feeForward;
    }

    public final Long getMappingId() {
        return this.mappingId;
    }

    public final PayMode getPaymode() {
        return this.paymode;
    }

    public final Long getPaymodeId() {
        return this.paymodeId;
    }

    public int hashCode() {
        Long l = this.mappingId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.feeForward;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.clientId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.paymodeId;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.endpointId;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.active;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        PayMode payMode = this.paymode;
        int hashCode7 = (hashCode6 + (payMode == null ? 0 : payMode.hashCode())) * 31;
        EndPoint endPoint = this.endpoint;
        return hashCode7 + (endPoint != null ? endPoint.hashCode() : 0);
    }

    public String toString() {
        return "MappingBean(mappingId=" + this.mappingId + ", feeForward=" + this.feeForward + ", clientId=" + this.clientId + ", paymodeId=" + this.paymodeId + ", endpointId=" + this.endpointId + ", active=" + this.active + ", paymode=" + this.paymode + ", endpoint=" + this.endpoint + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Long l = this.mappingId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.feeForward);
        Long l2 = this.clientId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.paymodeId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.endpointId;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
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
    }
}
