package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u000fHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u0006:"}, d2 = {"Lio/github/sabpaisaandroid/models/SabPaisaFraudModel;", "Landroid/os/Parcelable;", "packageName", "", "uniqueAssets", "opPackageName", "clientCode", "amount", "packageResourcePath", "baseUrl", "version", "transactionId", "fromPlayStore", Constants.MESSAGE, "status_code", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/String;", "getBaseUrl", "getClientCode", "getFromPlayStore", "getMessage", "getOpPackageName", "getPackageName", "getPackageResourcePath", "getStatus_code", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTransactionId", "getUniqueAssets", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/github/sabpaisaandroid/models/SabPaisaFraudModel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SabPaisaFraudModel implements Parcelable {
    public static final Parcelable.Creator<SabPaisaFraudModel> CREATOR = new a();
    private final String amount;
    private final String baseUrl;
    private final String clientCode;
    private final String fromPlayStore;
    private final String message;
    private final String opPackageName;
    private final String packageName;
    private final String packageResourcePath;
    private final Integer status_code;
    private final String transactionId;
    private final String uniqueAssets;
    private final String version;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SabPaisaFraudModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SabPaisaFraudModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SabPaisaFraudModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SabPaisaFraudModel[] newArray(int i) {
            return new SabPaisaFraudModel[i];
        }
    }

    public SabPaisaFraudModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        this.packageName = str;
        this.uniqueAssets = str2;
        this.opPackageName = str3;
        this.clientCode = str4;
        this.amount = str5;
        this.packageResourcePath = str6;
        this.baseUrl = str7;
        this.version = str8;
        this.transactionId = str9;
        this.fromPlayStore = str10;
        this.message = str11;
        this.status_code = num;
    }

    public static /* synthetic */ SabPaisaFraudModel copy$default(SabPaisaFraudModel sabPaisaFraudModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sabPaisaFraudModel.packageName;
        }
        if ((i & 2) != 0) {
            str2 = sabPaisaFraudModel.uniqueAssets;
        }
        if ((i & 4) != 0) {
            str3 = sabPaisaFraudModel.opPackageName;
        }
        if ((i & 8) != 0) {
            str4 = sabPaisaFraudModel.clientCode;
        }
        if ((i & 16) != 0) {
            str5 = sabPaisaFraudModel.amount;
        }
        if ((i & 32) != 0) {
            str6 = sabPaisaFraudModel.packageResourcePath;
        }
        if ((i & 64) != 0) {
            str7 = sabPaisaFraudModel.baseUrl;
        }
        if ((i & 128) != 0) {
            str8 = sabPaisaFraudModel.version;
        }
        if ((i & 256) != 0) {
            str9 = sabPaisaFraudModel.transactionId;
        }
        if ((i & 512) != 0) {
            str10 = sabPaisaFraudModel.fromPlayStore;
        }
        if ((i & 1024) != 0) {
            str11 = sabPaisaFraudModel.message;
        }
        if ((i & 2048) != 0) {
            num = sabPaisaFraudModel.status_code;
        }
        String str12 = str11;
        Integer num2 = num;
        String str13 = str9;
        String str14 = str10;
        String str15 = str7;
        String str16 = str8;
        String str17 = str5;
        String str18 = str6;
        return sabPaisaFraudModel.copy(str, str2, str3, str4, str17, str18, str15, str16, str13, str14, str12, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFromPlayStore() {
        return this.fromPlayStore;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getStatus_code() {
        return this.status_code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUniqueAssets() {
        return this.uniqueAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOpPackageName() {
        return this.opPackageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPackageResourcePath() {
        return this.packageResourcePath;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final SabPaisaFraudModel copy(String packageName, String uniqueAssets, String opPackageName, String clientCode, String amount, String packageResourcePath, String baseUrl, String version, String transactionId, String fromPlayStore, String message, Integer status_code) {
        return new SabPaisaFraudModel(packageName, uniqueAssets, opPackageName, clientCode, amount, packageResourcePath, baseUrl, version, transactionId, fromPlayStore, message, status_code);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SabPaisaFraudModel)) {
            return false;
        }
        SabPaisaFraudModel sabPaisaFraudModel = (SabPaisaFraudModel) other;
        return Intrinsics.areEqual(this.packageName, sabPaisaFraudModel.packageName) && Intrinsics.areEqual(this.uniqueAssets, sabPaisaFraudModel.uniqueAssets) && Intrinsics.areEqual(this.opPackageName, sabPaisaFraudModel.opPackageName) && Intrinsics.areEqual(this.clientCode, sabPaisaFraudModel.clientCode) && Intrinsics.areEqual(this.amount, sabPaisaFraudModel.amount) && Intrinsics.areEqual(this.packageResourcePath, sabPaisaFraudModel.packageResourcePath) && Intrinsics.areEqual(this.baseUrl, sabPaisaFraudModel.baseUrl) && Intrinsics.areEqual(this.version, sabPaisaFraudModel.version) && Intrinsics.areEqual(this.transactionId, sabPaisaFraudModel.transactionId) && Intrinsics.areEqual(this.fromPlayStore, sabPaisaFraudModel.fromPlayStore) && Intrinsics.areEqual(this.message, sabPaisaFraudModel.message) && Intrinsics.areEqual(this.status_code, sabPaisaFraudModel.status_code);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final String getFromPlayStore() {
        return this.fromPlayStore;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOpPackageName() {
        return this.opPackageName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPackageResourcePath() {
        return this.packageResourcePath;
    }

    public final Integer getStatus_code() {
        return this.status_code;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getUniqueAssets() {
        return this.uniqueAssets;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.packageName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uniqueAssets;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.opPackageName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amount;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.packageResourcePath;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.baseUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.version;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.transactionId;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fromPlayStore;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.message;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.status_code;
        return hashCode11 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SabPaisaFraudModel(packageName=" + this.packageName + ", uniqueAssets=" + this.uniqueAssets + ", opPackageName=" + this.opPackageName + ", clientCode=" + this.clientCode + ", amount=" + this.amount + ", packageResourcePath=" + this.packageResourcePath + ", baseUrl=" + this.baseUrl + ", version=" + this.version + ", transactionId=" + this.transactionId + ", fromPlayStore=" + this.fromPlayStore + ", message=" + this.message + ", status_code=" + this.status_code + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.packageName);
        parcel.writeString(this.uniqueAssets);
        parcel.writeString(this.opPackageName);
        parcel.writeString(this.clientCode);
        parcel.writeString(this.amount);
        parcel.writeString(this.packageResourcePath);
        parcel.writeString(this.baseUrl);
        parcel.writeString(this.version);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.fromPlayStore);
        parcel.writeString(this.message);
        Integer num = this.status_code;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public /* synthetic */ SabPaisaFraudModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : num);
    }
}
