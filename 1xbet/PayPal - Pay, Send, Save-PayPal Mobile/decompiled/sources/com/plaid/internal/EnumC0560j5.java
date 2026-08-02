package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class EnumC0560j5 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.EnumC0560j5> CREATOR;
    public static final com.plaid.internal.EnumC0560j5.a Companion;
    public static final com.plaid.internal.EnumC0560j5 DEVELOPMENT;
    public static final com.plaid.internal.EnumC0560j5 DEVENV;
    public static final com.plaid.internal.EnumC0560j5 PRODUCTION;
    public static final com.plaid.internal.EnumC0560j5 SANDBOX;
    public static final java.util.Map<java.lang.String, com.plaid.internal.EnumC0560j5> b;
    public static final /* synthetic */ com.plaid.internal.EnumC0560j5[] c;
    public static final /* synthetic */ kotlin.enums.EnumEntries d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6452a;

    /* renamed from: com.plaid.internal.j5$a */
    public static final class a {
        public static com.plaid.internal.EnumC0560j5 a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.plaid.internal.EnumC0560j5 enumC0560j5 = (com.plaid.internal.EnumC0560j5) com.plaid.internal.EnumC0560j5.b.get(str);
            return enumC0560j5 == null ? com.plaid.internal.EnumC0560j5.SANDBOX : enumC0560j5;
        }
    }

    static {
        com.plaid.internal.EnumC0560j5 enumC0560j5 = new com.plaid.internal.EnumC0560j5("PRODUCTION", 0, com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION);
        PRODUCTION = enumC0560j5;
        com.plaid.internal.EnumC0560j5 enumC0560j52 = new com.plaid.internal.EnumC0560j5("DEVELOPMENT", 1, "development");
        DEVELOPMENT = enumC0560j52;
        com.plaid.internal.EnumC0560j5 enumC0560j53 = new com.plaid.internal.EnumC0560j5("SANDBOX", 2, com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX);
        SANDBOX = enumC0560j53;
        com.plaid.internal.EnumC0560j5 enumC0560j54 = new com.plaid.internal.EnumC0560j5("DEVENV", 3, "devenv");
        DEVENV = enumC0560j54;
        com.plaid.internal.EnumC0560j5[] enumC0560j5Arr = {enumC0560j5, enumC0560j52, enumC0560j53, enumC0560j54};
        c = enumC0560j5Arr;
        d = kotlin.enums.EnumEntriesKt.enumEntries(enumC0560j5Arr);
        Companion = new com.plaid.internal.EnumC0560j5.a();
        CREATOR = new android.os.Parcelable.Creator<com.plaid.internal.EnumC0560j5>() { // from class: com.plaid.internal.j5.b
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.EnumC0560j5 createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.plaid.internal.EnumC0560j5.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.EnumC0560j5[] newArray(int i) {
                return new com.plaid.internal.EnumC0560j5[i];
            }
        };
        b = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION, enumC0560j5), kotlin.TuplesKt.to("development", enumC0560j52), kotlin.TuplesKt.to(com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX, enumC0560j53), kotlin.TuplesKt.to("devenv", enumC0560j54));
    }

    public EnumC0560j5(java.lang.String str, int i, java.lang.String str2) {
        this.f6452a = str2;
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.EnumC0560j5> getEntries() {
        return d;
    }

    public static com.plaid.internal.EnumC0560j5 valueOf(java.lang.String str) {
        return (com.plaid.internal.EnumC0560j5) java.lang.Enum.valueOf(com.plaid.internal.EnumC0560j5.class, str);
    }

    public static com.plaid.internal.EnumC0560j5[] values() {
        return (com.plaid.internal.EnumC0560j5[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String getJson() {
        return this.f6452a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }
}
