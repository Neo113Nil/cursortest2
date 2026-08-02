package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\u0006J\b\u0010)\u001a\u00020\u0006H\u0002J\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010+\u001a\u00020\u0006J\u0006\u0010,\u001a\u00020'J\u0006\u0010-\u001a\u00020'J\u0006\u0010.\u001a\u00020'J\u0006\u0010/\u001a\u00020\u0006J\u0006\u00100\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u0006J\u000e\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020'J\u0006\u00105\u001a\u00020\u001cJ\u0011\u00106\u001a\b\u0012\u0004\u0012\u00020\u000607¢\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\u0006J\u0006\u0010:\u001a\u00020\u0006J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020?H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/icc/OdaKeyRetrievalProcessor;", "", "input", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OdaKeyRetrievalConfig;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OdaKeyRetrievalConfig;)V", "certificate", "", "getCertificate", "()[B", "computedHash", "getComputedHash", "setComputedHash", "([B)V", "exponentUsedInDataRecovering", "getExponentUsedInDataRecovering", "exponentUsedInHash", "getExponentUsedInHash", "iccPanTrack2", "getIccPanTrack2", "modulus", "getModulus", "modulus$delegate", "Lkotlin/Lazy;", "panLength", "", "publicKey", "getPublicKey", "recoveredData", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredData;", "getRecoveredData", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredData;", "recoveredData$delegate", "remainder", "getRemainder", "validator", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/RecoveredDataFormatValidator;", "applySha", "dataToAdd", "checkLengths", "", "computeModulus", "concatenationData", "expirationDate", "hashAlgorithmIndicator", "isAlgorithmRecognized", "isCertificateValid", "isRecoveredDataWellFormatted", "key", "keyAlgorithmIndicator", "panAssessmentValue", "performHashCheck", "dataToBeAuthenticated", "performPanCheck", "recoverPublicKeyData", "recoveredDataToArray", "", "()[[B", "recoveredFormat", "recoveredHash", "recoveredHeader", "recoveredTrailer", "shouldIgnoreByte", "byte", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OdaKeyRetrievalProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3051a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public byte[] f;
    private final byte[] g;
    private final int h;
    private final com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.RecoveredDataFormatValidator i;
    private final kotlin.Lazy j;
    private final kotlin.Lazy k;

    public OdaKeyRetrievalProcessor(com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OdaKeyRetrievalConfig odaKeyRetrievalConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(odaKeyRetrievalConfig, "");
        byte[] content = odaKeyRetrievalConfig.b.getContent();
        this.f3051a = content == null ? new byte[0] : content;
        byte[] content2 = odaKeyRetrievalConfig.c.getContent();
        this.g = content2 == null ? new byte[0] : content2;
        byte[] content3 = odaKeyRetrievalConfig.d.getContent();
        this.b = content3 == null ? new byte[0] : content3;
        byte[] content4 = odaKeyRetrievalConfig.e.getContent();
        this.c = content4 == null ? new byte[0] : content4;
        this.d = odaKeyRetrievalConfig.f;
        this.e = odaKeyRetrievalConfig.f3127a;
        this.h = odaKeyRetrievalConfig.g;
        this.i = odaKeyRetrievalConfig.h;
        this.j = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.OdaKeyRetrievalProcessor.b());
        this.k = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.OdaKeyRetrievalProcessor.a());
    }

    public final byte[] b() {
        byte[] bArr = this.f;
        if (bArr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return bArr;
    }

    public final boolean c() {
        byte[] bArr = this.f3051a;
        return bArr.length != 0 && bArr.length == this.e.length;
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData d() {
        byte[] bArr;
        try {
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, this.e);
            bArr = new java.math.BigInteger(1, this.f3051a).modPow(new java.math.BigInteger(1, this.g), bigInteger).toByteArray();
            if (bArr[0] == 0) {
                bArr = kotlin.collections.ArraysKt.copyOfRange(bArr, 1, bArr.length);
            }
        } catch (java.lang.NumberFormatException unused) {
            bArr = new byte[0];
        }
        return new com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData(bArr, new com.discover.mpos.sdk.core.data.SafeIndexBasedExtractor(), this.h);
    }

    public final boolean e() {
        return this.i.a(a());
    }

    public final boolean g() {
        int indexOf = kotlin.collections.ArraysKt.indexOf(a().c, (byte) -1);
        if (indexOf > 0) {
            byte[] hexToByteArray = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.hexToByteArray(kotlin.collections.ArraysKt.copyOfRange(a().c, 0, indexOf));
            int length = hexToByteArray.length;
            byte[] bArr = this.d;
            if (length <= bArr.length && java.util.Arrays.equals(hexToByteArray, kotlin.collections.ArraysKt.copyOfRange(bArr, 0, indexOf * 2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        byte[] bArr = a().d;
        return com.discover.mpos.sdk.core.extensions.CalendarExtKt.lastDayOfMonth(java.util.Calendar.getInstance(), java.lang.Integer.parseInt(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(bArr[0])), java.lang.Integer.parseInt(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(bArr[1]))).after(java.util.Calendar.getInstance());
    }

    public final boolean i() {
        return 1 == kotlin.collections.ArraysKt.first(a().g);
    }

    public final byte[][] j() {
        return new byte[][]{a().b, a().c, a().d, a().e, a().f, a().g, a().h, a().i, a().j};
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredData;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData invoke() {
            return com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.OdaKeyRetrievalProcessor.this.d();
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.OdaKeyRetrievalProcessor.this.f();
        }

        a() {
            super(0);
        }
    }

    public final byte[] f() {
        return kotlin.collections.ArraysKt.plus(a().k, this.c);
    }

    public final boolean a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f = java.security.MessageDigest.getInstance("SHA-1").digest(kotlin.collections.ArraysKt.plus(new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(a().b).append(a().c).append(a().d).append(a().e).append(a().f).append(a().g).append(a().h).append(a().i).append(a().j).append(this.c).append(this.b).build(), bArr));
        byte[] bArr2 = a().l;
        byte[] bArr3 = this.f;
        if (bArr3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return java.util.Arrays.equals(bArr2, bArr3);
    }

    public final byte[] k() {
        return (byte[]) this.k.getValue();
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData a() {
        return (com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredData) this.j.getValue();
    }
}
