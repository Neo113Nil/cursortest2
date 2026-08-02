package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class H3 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.H3> CREATOR;
    public static final com.plaid.internal.H3 HTTP_ERROR;
    public static final com.plaid.internal.H3 INITIALIZATION_ERROR;
    public static final com.plaid.internal.H3 NETWORK_ERROR;
    public static final com.plaid.internal.H3 SESSION_EXPIRED;
    public static final com.plaid.internal.H3 UNKNOWN_ERROR;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.plaid.internal.H3[] f5798a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.plaid.internal.H3 h3 = new com.plaid.internal.H3("NETWORK_ERROR", 0);
        NETWORK_ERROR = h3;
        com.plaid.internal.H3 h32 = new com.plaid.internal.H3(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, 1);
        SESSION_EXPIRED = h32;
        com.plaid.internal.H3 h33 = new com.plaid.internal.H3("INITIALIZATION_ERROR", 2);
        INITIALIZATION_ERROR = h33;
        com.plaid.internal.H3 h34 = new com.plaid.internal.H3("HTTP_ERROR", 3);
        HTTP_ERROR = h34;
        com.plaid.internal.H3 h35 = new com.plaid.internal.H3("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = h35;
        com.plaid.internal.H3[] h3Arr = {h3, h32, h33, h34, h35};
        f5798a = h3Arr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(h3Arr);
        CREATOR = new android.os.Parcelable.Creator<com.plaid.internal.H3>() { // from class: com.plaid.internal.H3.a
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.H3 createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.plaid.internal.H3.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.H3[] newArray(int i) {
                return new com.plaid.internal.H3[i];
            }
        };
    }

    public H3(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.H3> getEntries() {
        return b;
    }

    public static com.plaid.internal.H3 valueOf(java.lang.String str) {
        return (com.plaid.internal.H3) java.lang.Enum.valueOf(com.plaid.internal.H3.class, str);
    }

    public static com.plaid.internal.H3[] values() {
        return (com.plaid.internal.H3[]) f5798a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }
}
