package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B'\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReferenceImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/String;", "hashCode", "Lorg/json/JSONObject;", "", "packToObject$core_publicRelease", "(Lorg/json/JSONObject;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "prepareInternal$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "prepareMagnesClientId$core_publicRelease", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "CREATOR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TapToPayReferenceImpl extends com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference
    /* renamed from: getId, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        return ((getHighResolutionOutputSizeshNQ4ISI != null ? getHighResolutionOutputSizeshNQ4ISI.hashCode() : 0) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl tapToPayReferenceImpl = (com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl) p0;
        if (this.getHighSpeedVideoFpsRangesFor.size() != tapToPayReferenceImpl.getHighSpeedVideoFpsRangesFor.size() || !kotlin.jvm.internal.Intrinsics.areEqual(getGetHighResolutionOutputSizeshNQ4ISI(), tapToPayReferenceImpl.getGetHighResolutionOutputSizeshNQ4ISI())) {
            return false;
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = this.getHighSpeedVideoFpsRangesFor.entrySet();
        if ((entrySet instanceof java.util.Collection) && entrySet.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!tapToPayReferenceImpl.getHighSpeedVideoFpsRangesFor.containsKey(entry.getKey()) || !kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), tapToPayReferenceImpl.getHighSpeedVideoFpsRangesFor.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public TapToPayReferenceImpl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    public TapToPayReferenceImpl(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        java.util.HashMap readHashMap = parcel.readHashMap(java.lang.ClassLoader.getSystemClassLoader());
        kotlin.jvm.internal.Intrinsics.checkNotNull(readHashMap, "");
        this.getHighSpeedVideoFpsRangesFor = readHashMap;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference
    public final void packToObject$core_publicRelease(org.json.JSONObject p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.putOpt("apiReference", getGetHighResolutionOutputSizeshNQ4ISI());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            p0.putOpt(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference
    public final java.lang.String get(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.get(p0);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference prepareInternal$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.getHighSpeedVideoFpsRangesFor);
        java.lang.String suggestionEmail = p0.getSuggestionEmail();
        if (suggestionEmail != null) {
            mutableMap.put(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.KEY_SUGGESTED_EMAIL, suggestionEmail);
        }
        java.lang.String suggestionPhone = p0.getSuggestionPhone();
        if (suggestionPhone != null) {
            mutableMap.put(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.KEY_SUGGESTED_PHONE, suggestionPhone);
        }
        java.lang.String suggestionPhoneCountryCode = p0.getSuggestionPhoneCountryCode();
        if (suggestionPhoneCountryCode != null) {
            mutableMap.put(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.KEY_SUGGESTED_PHONE_CODE, suggestionPhoneCountryCode);
        }
        java.lang.String cardPaymentUUID = p0.getCardPaymentUUID();
        if (cardPaymentUUID != null) {
            mutableMap.put(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.KEY_PAYMENT_UUID, cardPaymentUUID);
        }
        java.lang.String referenceNumber = p0.getReferenceNumber();
        if (referenceNumber != null) {
            mutableMap.put("REFERENCE_NUMBER", referenceNumber);
        }
        java.lang.String applicationIdentifier = p0.getApplicationIdentifier();
        if (applicationIdentifier != null) {
            mutableMap.put(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.KEY_APP_IDENTIFIER, applicationIdentifier);
        }
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl(getGetHighResolutionOutputSizeshNQ4ISI(), mutableMap);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference prepareMagnesClientId$core_publicRelease(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.getHighSpeedVideoFpsRangesFor);
        mutableMap.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_PAYPAL_CLIENT_METADATA_ID, p0);
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl(getGetHighResolutionOutputSizeshNQ4ISI(), mutableMap);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(getGetHighResolutionOutputSizeshNQ4ISI());
        p0.writeMap(this.getHighSpeedVideoFpsRangesFor);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReferenceImpl$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReferenceImpl;", "<init>", "()V", "Landroid/os/Parcel;", "source", "createFromParcel", "(Landroid/os/Parcel;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReferenceImpl;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReferenceImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl createFromParcel(android.os.Parcel source) {
            if (source != null) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl(source);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl[] newArray(int size) {
            com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl[] tapToPayReferenceImplArr = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReferenceImpl[size];
            for (int i = 0; i < size; i++) {
                tapToPayReferenceImplArr[i] = null;
            }
            return tapToPayReferenceImplArr;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
