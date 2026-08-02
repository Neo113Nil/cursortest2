package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"BU\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006#"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "credentials", "", "matcher", "type", "", "requestType", "protocolTypes", "", "id", "fulfillmentActionName", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCredentials", "()[B", "getMatcher", "getType", "()Ljava/lang/String;", "getRequestType$annotations", "()V", "getRequestType", "getProtocolTypes$annotations", "getProtocolTypes", "()Ljava/util/List;", "getId", "getFulfillmentActionName", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegistrationRequestCreator")
/* loaded from: classes8.dex */
public final class RegistrationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String TAG = "RegistrationRequest";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredentials", id = 1)
    private final byte[] credentials;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getFulfillmentActionName", id = 7)
    private final java.lang.String fulfillmentActionName;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getId", id = 6)
    private final java.lang.String id;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMatcher", id = 2)
    private final byte[] matcher;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "java.util.Collections.emptyList()", getter = "getProtocolTypes", id = 5)
    private final java.util.List<java.lang.String> protocolTypes;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getRequestType", id = 4)
    private final java.lang.String requestType;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getType", id = 3)
    private final java.lang.String type;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.RegistrationRequest> CREATOR = new com.google.android.gms.identitycredentials.RegistrationRequestCreator();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegistrationRequest(byte[] bArr, byte[] bArr2, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        this(bArr, bArr2, str, str2, list, "", null, 64, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.RegistrationRequestCreator.writeToParcel(this, dest, flags);
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public RegistrationRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) byte[] bArr, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] bArr2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List<java.lang.String> list, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String str3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String str4) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.credentials = bArr;
        this.matcher = bArr2;
        this.type = str;
        this.requestType = str2;
        this.protocolTypes = list;
        this.id = str3;
        this.fulfillmentActionName = str4;
        boolean z2 = false;
        if (!kotlin.text.StringsKt.isBlank(str2) && !list.isEmpty()) {
            java.util.List<java.lang.String> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (!kotlin.text.StringsKt.isBlank((java.lang.String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (!kotlin.text.StringsKt.isBlank(this.type) && this.requestType.length() == 0 && this.protocolTypes.isEmpty()) {
            z2 = true;
        }
        if (z || z2) {
            return;
        }
        java.lang.String str5 = this.type;
        java.lang.String str6 = this.requestType;
        java.util.List<java.lang.String> list3 = this.protocolTypes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str5).length() + 31 + java.lang.String.valueOf(str6).length() + 20 + java.lang.String.valueOf(list3).length() + 94);
        sb.append("Either type: ");
        sb.append(str5);
        sb.append(", or requestType: ");
        sb.append(str6);
        sb.append(" and protocolTypes: ");
        sb.append(list3);
        sb.append(" must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public /* synthetic */ RegistrationRequest(byte[] bArr, byte[] bArr2, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2, str, str2, list, "", "");
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getRequestType() {
        return this.requestType;
    }

    public final java.util.List<java.lang.String> getProtocolTypes() {
        return this.protocolTypes;
    }

    public final byte[] getMatcher() {
        return this.matcher;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getFulfillmentActionName() {
        return this.fulfillmentActionName;
    }

    public final byte[] getCredentials() {
        return this.credentials;
    }
}
