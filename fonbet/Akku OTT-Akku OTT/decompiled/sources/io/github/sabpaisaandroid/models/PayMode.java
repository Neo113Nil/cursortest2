package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\f¨\u0006'"}, d2 = {"Lio/github/sabpaisaandroid/models/PayMode;", "Landroid/os/Parcelable;", "paymodeId", "", "paymodeType", "", "paymodeName", "performanceFlag", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymodeName", "()Ljava/lang/String;", "getPaymodeType", "getPerformanceFlag", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/github/sabpaisaandroid/models/PayMode;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PayMode implements Parcelable {
    public static final Parcelable.Creator<PayMode> CREATOR = new a();
    private final Boolean active;
    private final Integer paymodeId;
    private final String paymodeName;
    private final String paymodeType;
    private final Boolean performanceFlag;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PayMode> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayMode createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PayMode(valueOf2, readString, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayMode[] newArray(int i) {
            return new PayMode[i];
        }
    }

    public PayMode(Integer num, String str, String str2, Boolean bool, Boolean bool2) {
        this.paymodeId = num;
        this.paymodeType = str;
        this.paymodeName = str2;
        this.performanceFlag = bool;
        this.active = bool2;
    }

    public static /* synthetic */ PayMode copy$default(PayMode payMode, Integer num, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = payMode.paymodeId;
        }
        if ((i & 2) != 0) {
            str = payMode.paymodeType;
        }
        if ((i & 4) != 0) {
            str2 = payMode.paymodeName;
        }
        if ((i & 8) != 0) {
            bool = payMode.performanceFlag;
        }
        if ((i & 16) != 0) {
            bool2 = payMode.active;
        }
        Boolean bool3 = bool2;
        String str3 = str2;
        return payMode.copy(num, str, str3, bool, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getPaymodeId() {
        return this.paymodeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymodeType() {
        return this.paymodeType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymodeName() {
        return this.paymodeName;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getPerformanceFlag() {
        return this.performanceFlag;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    public final PayMode copy(Integer paymodeId, String paymodeType, String paymodeName, Boolean performanceFlag, Boolean active) {
        return new PayMode(paymodeId, paymodeType, paymodeName, performanceFlag, active);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayMode)) {
            return false;
        }
        PayMode payMode = (PayMode) other;
        return Intrinsics.areEqual(this.paymodeId, payMode.paymodeId) && Intrinsics.areEqual(this.paymodeType, payMode.paymodeType) && Intrinsics.areEqual(this.paymodeName, payMode.paymodeName) && Intrinsics.areEqual(this.performanceFlag, payMode.performanceFlag) && Intrinsics.areEqual(this.active, payMode.active);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final Integer getPaymodeId() {
        return this.paymodeId;
    }

    public final String getPaymodeName() {
        return this.paymodeName;
    }

    public final String getPaymodeType() {
        return this.paymodeType;
    }

    public final Boolean getPerformanceFlag() {
        return this.performanceFlag;
    }

    public int hashCode() {
        Integer num = this.paymodeId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.paymodeType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymodeName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.performanceFlag;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.active;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "PayMode(paymodeId=" + this.paymodeId + ", paymodeType=" + this.paymodeType + ", paymodeName=" + this.paymodeName + ", performanceFlag=" + this.performanceFlag + ", active=" + this.active + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.paymodeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.paymodeType);
        parcel.writeString(this.paymodeName);
        Boolean bool = this.performanceFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.active;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
