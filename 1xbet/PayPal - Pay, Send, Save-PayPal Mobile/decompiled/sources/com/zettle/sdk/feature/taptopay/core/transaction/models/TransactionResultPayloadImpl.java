package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b>\b\u0002\u0018\u0000 a2\u00020\u0001:\u0001aBñ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010*\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b1\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001c\u00106\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u001c\u00104\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-R\u001c\u00107\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b9\u0010-R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)R\u001c\u0010B\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010-R\u001c\u0010C\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010+\u001a\u0004\bD\u0010-R\u001c\u0010F\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bE\u0010-R\u001c\u0010J\u001a\u0004\u0018\u00010\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010@\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010!R\u001c\u0010M\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bM\u0010+\u001a\u0004\bN\u0010-R\u001c\u0010S\u001a\u0004\u0018\u00010\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010O\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bT\u0010+\u001a\u0004\bU\u0010-R\u001c\u0010T\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bS\u0010+\u001a\u0004\bV\u0010-R\u001c\u0010W\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010+\u001a\u0004\bX\u0010-R\u001c\u0010[\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bY\u0010+\u001a\u0004\bZ\u0010-R\u001c\u0010^\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\\\u0010+\u001a\u0004\b]\u0010-R\u001c\u0010Y\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b^\u0010+\u001a\u0004\b_\u0010-R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b[\u0010+\u001a\u0004\b`\u0010-"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionResultPayloadImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "p13", "p14", "p15", "p16", "p17", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "p18", "p19", "p20", "p21", "p22", "p23", "<init>", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Camera2StreamConfigurationMap", "J", "getAmount", "()J", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getApplicationIdentifier", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getApplicationName", "getAuthorizationCode", "getHighSpeedVideoSizes", "getCardIssuingBank", "getHighSpeedVideoSizesFor", "getCardPaymentEntryMode", "getOutputMinFrameDuration", "getInputFormats", "getCardType", "getCardholderVerificationMethod", "getOutputFormats", "Ljava/lang/Long;", "getGratuityAmount", "()Ljava/lang/Long;", "getInputSizeshNQ4ISI", "getInstallmentAmount", "getOutputStallDurationlomOqCM", "getMaskedPan", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "getMxCardType", "getMxFiid", "getOutputSizeshNQ4ISI", "Ljava/lang/Integer;", "getMxPaymentMethodCode", "()Ljava/lang/Integer;", "getOutputStallDuration", com.visa.cbp.getEncExpo.warmup, "getNrOfInstallments", "toString", "getPanHash", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReference", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "isOutputSupportedForhNQ4ISI", "isOutputSupportedFor", "getReferenceNumber", "getSuggestionEmail", "unwrapAs", "getSuggestionPhone", "accessartificialFrame", "getSuggestionPhoneCountryCode", "CoroutineDebuggingKt", "coroutineCreation", "getTransactionId", "coroutineBoundary", "getTsi", "getTvr", "CREATOR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionResultPayloadImpl implements com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl.Companion(null);
    private final long Camera2StreamConfigurationMap;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private final java.lang.String coroutineCreation;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private final java.lang.String CoroutineDebuggingKt;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final java.lang.String accessartificialFrame;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final java.lang.String coroutineBoundary;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final long getInputSizeshNQ4ISI;
    private final java.lang.Long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.String getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final java.lang.String getOutputSizeshNQ4ISI;
    private final java.lang.String getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Integer getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final int getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDurationlomOqCM;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference isOutputSupportedForhNQ4ISI;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String isOutputSupportedFor;
    private final java.lang.String toString;
    private final java.lang.String unwrapAs;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TransactionResultPayloadImpl(long j, java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j2, int i, java.lang.String str11, java.lang.String str12, java.lang.Integer num, java.lang.String str13, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18) {
        this.Camera2StreamConfigurationMap = j;
        this.getOutputFormats = l;
        this.getHighSpeedVideoSizesFor = str;
        this.accessartificialFrame = str2;
        this.getOutputMinFrameDuration = str3;
        this.getInputFormats = str4;
        this.coroutineCreation = str5;
        this.getHighSpeedVideoSizes = str6;
        this.getOutputMinFrameDurationlomOqCM = str7;
        this.getHighSpeedVideoFpsRangesFor = str8;
        this.getHighSpeedVideoFpsRanges = str9;
        this.getHighResolutionOutputSizeshNQ4ISI = str10;
        this.getInputSizeshNQ4ISI = j2;
        this.getOutputStallDurationlomOqCM = i;
        this.getOutputSizeshNQ4ISI = str11;
        this.getOutputSizes = str12;
        this.getOutputStallDuration = num;
        this.toString = str13;
        this.isOutputSupportedForhNQ4ISI = tapToPayReference;
        this.getValidOutputFormatsForInputhNQ4ISI = str14;
        this.coroutineBoundary = str15;
        this.isOutputSupportedFor = str16;
        this.unwrapAs = str17;
        this.CoroutineDebuggingKt = str18;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getAmount, reason: from getter */
    public final long getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getGratuityAmount, reason: from getter */
    public final java.lang.Long getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getCardType, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getTsi, reason: from getter */
    public final java.lang.String getAccessartificialFrame() {
        return this.accessartificialFrame;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getCardPaymentEntryMode, reason: from getter */
    public final java.lang.String getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getCardholderVerificationMethod, reason: from getter */
    public final java.lang.String getGetInputFormats() {
        return this.getInputFormats;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getTvr, reason: from getter */
    public final java.lang.String getCoroutineCreation() {
        return this.coroutineCreation;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getCardIssuingBank, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getMaskedPan, reason: from getter */
    public final java.lang.String getGetOutputMinFrameDurationlomOqCM() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getApplicationName, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getApplicationIdentifier, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getAuthorizationCode, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getInstallmentAmount, reason: from getter */
    public final long getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getNrOfInstallments, reason: from getter */
    public final int getGetOutputStallDurationlomOqCM() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getMxFiid, reason: from getter */
    public final java.lang.String getGetOutputSizeshNQ4ISI() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getMxCardType, reason: from getter */
    public final java.lang.String getGetOutputSizes() {
        return this.getOutputSizes;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getMxPaymentMethodCode, reason: from getter */
    public final java.lang.Integer getGetOutputStallDuration() {
        return this.getOutputStallDuration;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getPanHash, reason: from getter */
    public final java.lang.String getToString() {
        return this.toString;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getReference, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getIsOutputSupportedForhNQ4ISI() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getReferenceNumber, reason: from getter */
    public final java.lang.String getGetValidOutputFormatsForInputhNQ4ISI() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getTransactionId, reason: from getter */
    public final java.lang.String getCoroutineBoundary() {
        return this.coroutineBoundary;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getSuggestionEmail, reason: from getter */
    public final java.lang.String getIsOutputSupportedFor() {
        return this.isOutputSupportedFor;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getSuggestionPhone, reason: from getter */
    public final java.lang.String getUnwrapAs() {
        return this.unwrapAs;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload
    /* renamed from: getSuggestionPhoneCountryCode, reason: from getter */
    public final java.lang.String getCoroutineDebuggingKt() {
        return this.CoroutineDebuggingKt;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.writeLong(getCamera2StreamConfigurationMap());
        java.lang.Long getOutputFormats = getGetOutputFormats();
        p0.writeLong(getOutputFormats != null ? getOutputFormats.longValue() : -1L);
        p0.writeString(getGetHighSpeedVideoSizesFor());
        p0.writeString(getAccessartificialFrame());
        p0.writeString(getGetOutputMinFrameDuration());
        p0.writeString(getGetInputFormats());
        p0.writeString(getCoroutineCreation());
        p0.writeString(getGetHighSpeedVideoSizes());
        p0.writeString(getGetOutputMinFrameDurationlomOqCM());
        p0.writeString(getGetHighSpeedVideoFpsRangesFor());
        p0.writeString(getGetHighSpeedVideoFpsRanges());
        p0.writeString(getGetHighResolutionOutputSizeshNQ4ISI());
        p0.writeLong(getGetInputSizeshNQ4ISI());
        p0.writeInt(getGetOutputStallDurationlomOqCM());
        p0.writeString(getGetOutputSizeshNQ4ISI());
        p0.writeString(getGetOutputSizes());
        java.lang.Integer getOutputStallDuration = getGetOutputStallDuration();
        p0.writeInt(getOutputStallDuration != null ? getOutputStallDuration.intValue() : -1);
        p0.writeString(getToString());
        p0.writeParcelable(getIsOutputSupportedForhNQ4ISI(), p1);
        p0.writeString(getGetValidOutputFormatsForInputhNQ4ISI());
        p0.writeString(getIsOutputSupportedFor());
        p0.writeString(getUnwrapAs());
        p0.writeString(getCoroutineDebuggingKt());
        p0.writeString(getCoroutineBoundary());
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionResultPayloadImpl$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionResultPayloadImpl;", "<init>", "()V", "Landroid/os/Parcel;", "source", "createFromParcel", "(Landroid/os/Parcel;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionResultPayloadImpl;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionResultPayloadImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl createFromParcel(android.os.Parcel source) {
            if (source == null) {
                return null;
            }
            long readLong = source.readLong();
            long readLong2 = source.readLong();
            java.lang.Long valueOf = readLong2 == -1 ? null : java.lang.Long.valueOf(readLong2);
            java.lang.String readString = source.readString();
            java.lang.String readString2 = source.readString();
            java.lang.String readString3 = source.readString();
            java.lang.String readString4 = source.readString();
            java.lang.String readString5 = source.readString();
            java.lang.String readString6 = source.readString();
            java.lang.String readString7 = source.readString();
            java.lang.String readString8 = source.readString();
            java.lang.String readString9 = source.readString();
            java.lang.String readString10 = source.readString();
            long readLong3 = source.readLong();
            int readInt = source.readInt();
            java.lang.String readString11 = source.readString();
            java.lang.String readString12 = source.readString();
            int readInt2 = source.readInt();
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl(readLong, valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readLong3, readInt, readString11, readString12, readInt2 != -1 ? java.lang.Integer.valueOf(readInt2) : null, source.readString(), (com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference) source.readParcelable(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.class.getClassLoader()), source.readString(), source.readString(), source.readString(), source.readString(), source.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl[] newArray(int size) {
            com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl[] transactionResultPayloadImplArr = new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl[size];
            for (int i = 0; i < size; i++) {
                transactionResultPayloadImplArr[i] = null;
            }
            return transactionResultPayloadImplArr;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
