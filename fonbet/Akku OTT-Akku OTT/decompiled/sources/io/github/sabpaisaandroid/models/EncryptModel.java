package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006+"}, d2 = {"Lio/github/sabpaisaandroid/models/EncryptModel;", "Landroid/os/Parcelable;", "cardNumber", "", "cardHolderName", "cvv", "expMonth", "expYY", Constants.KEY, "initVector", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardHolderName", "()Ljava/lang/String;", "getCardNumber", "getCvv", "getExpMonth", "getExpYY", "getInitVector", "getKey", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EncryptModel implements Parcelable {
    public static final Parcelable.Creator<EncryptModel> CREATOR = new a();
    private final String cardHolderName;
    private final String cardNumber;
    private final String cvv;
    private final String expMonth;
    private final String expYY;
    private final String initVector;
    private final String key;
    private final String value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EncryptModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EncryptModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EncryptModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EncryptModel[] newArray(int i) {
            return new EncryptModel[i];
        }
    }

    public EncryptModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ EncryptModel copy$default(EncryptModel encryptModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptModel.cardNumber;
        }
        if ((i & 2) != 0) {
            str2 = encryptModel.cardHolderName;
        }
        if ((i & 4) != 0) {
            str3 = encryptModel.cvv;
        }
        if ((i & 8) != 0) {
            str4 = encryptModel.expMonth;
        }
        if ((i & 16) != 0) {
            str5 = encryptModel.expYY;
        }
        if ((i & 32) != 0) {
            str6 = encryptModel.key;
        }
        if ((i & 64) != 0) {
            str7 = encryptModel.initVector;
        }
        if ((i & 128) != 0) {
            str8 = encryptModel.value;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return encryptModel.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpYY() {
        return this.expYY;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInitVector() {
        return this.initVector;
    }

    /* renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final EncryptModel copy(String cardNumber, String cardHolderName, String cvv, String expMonth, String expYY, String key, String initVector, String value) {
        return new EncryptModel(cardNumber, cardHolderName, cvv, expMonth, expYY, key, initVector, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptModel)) {
            return false;
        }
        EncryptModel encryptModel = (EncryptModel) other;
        return Intrinsics.areEqual(this.cardNumber, encryptModel.cardNumber) && Intrinsics.areEqual(this.cardHolderName, encryptModel.cardHolderName) && Intrinsics.areEqual(this.cvv, encryptModel.cvv) && Intrinsics.areEqual(this.expMonth, encryptModel.expMonth) && Intrinsics.areEqual(this.expYY, encryptModel.expYY) && Intrinsics.areEqual(this.key, encryptModel.key) && Intrinsics.areEqual(this.initVector, encryptModel.initVector) && Intrinsics.areEqual(this.value, encryptModel.value);
    }

    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpMonth() {
        return this.expMonth;
    }

    public final String getExpYY() {
        return this.expYY;
    }

    public final String getInitVector() {
        return this.initVector;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.cardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardHolderName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cvv;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expMonth;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expYY;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.key;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.initVector;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.value;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptModel(cardNumber=");
        sb.append(this.cardNumber);
        sb.append(", cardHolderName=");
        sb.append(this.cardHolderName);
        sb.append(", cvv=");
        sb.append(this.cvv);
        sb.append(", expMonth=");
        sb.append(this.expMonth);
        sb.append(", expYY=");
        sb.append(this.expYY);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", initVector=");
        sb.append(this.initVector);
        sb.append(", value=");
        return t.b(')', this.value, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.cardHolderName);
        parcel.writeString(this.cvv);
        parcel.writeString(this.expMonth);
        parcel.writeString(this.expYY);
        parcel.writeString(this.key);
        parcel.writeString(this.initVector);
        parcel.writeString(this.value);
    }

    public EncryptModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.cardNumber = str;
        this.cardHolderName = str2;
        this.cvv = str3;
        this.expMonth = str4;
        this.expYY = str5;
        this.key = str6;
        this.initVector = str7;
        this.value = str8;
    }

    public /* synthetic */ EncryptModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
