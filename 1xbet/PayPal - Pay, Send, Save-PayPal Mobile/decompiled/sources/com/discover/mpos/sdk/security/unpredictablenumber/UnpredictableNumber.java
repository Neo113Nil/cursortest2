package com.discover.mpos.sdk.security.unpredictablenumber;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\f\u0010\u0018\u001a\u00020\b*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumber;", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "dataStorage", "Lcom/discover/mpos/sdk/security/storage/DataStorage;", "randomNumberGenerator", "Lcom/discover/mpos/sdk/security/RandomNumberGenerator;", "(Lcom/discover/mpos/sdk/security/storage/DataStorage;Lcom/discover/mpos/sdk/security/RandomNumberGenerator;)V", "internalValue", "", "keyValueQ", "", "unpredictableNumberLength", "", "computeTvp", "debugTag", "getStoredQ", "invalidate", "", "applicationCryptogram", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "setUp", "terminalId", "ifdSerialNumber", "tearDown", "toSha256", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.security.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class UnpredictableNumber implements com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f3228a;
    private final java.lang.String b;
    private final int c;
    private final com.discover.mpos.sdk.security.storage.DataStorage d;
    private final com.discover.mpos.sdk.security.RandomNumberGenerator e;

    public UnpredictableNumber(com.discover.mpos.sdk.security.storage.DataStorage dataStorage, com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomNumberGenerator, "");
        this.d = dataStorage;
        this.e = randomNumberGenerator;
        this.b = "StoredValueQ";
        this.c = 4;
    }

    @Override // com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator
    public final void a(java.lang.String str, java.lang.String str2) {
        byte[] plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        byte[] nextRandomValue = this.e.nextRandomValue();
        java.lang.String a2 = this.d.a(this.b);
        byte[] hexToByteArray = a2 != null ? com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(a2) : null;
        byte[] c = c();
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        byte[] bytes2 = str2.getBytes(kotlin.text.Charsets.UTF_8);
        new java.lang.Object[]{bytes, bytes2, nextRandomValue, c, hexToByteArray};
        byte[] plus2 = kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(c, bytes2), bytes), nextRandomValue);
        if (hexToByteArray != null && (plus = kotlin.collections.ArraysKt.plus(hexToByteArray, plus2)) != null) {
            plus2 = plus;
        }
        byte[] b = b(plus2);
        this.f3228a = b;
        if (b == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        new java.lang.Object[]{b};
    }

    @Override // com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator
    public final byte[] a() {
        byte[] nextRandomValue = this.e.nextRandomValue();
        byte[] bArr = this.f3228a;
        if (bArr == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        new java.lang.Object[]{bArr, nextRandomValue};
        byte[] bArr2 = this.f3228a;
        if (bArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        byte[] b = b(kotlin.collections.ArraysKt.plus(bArr2, nextRandomValue));
        byte[] copyOfRange = kotlin.collections.ArraysKt.copyOfRange(b, b.length - this.c, b.length);
        new java.lang.Object[]{copyOfRange};
        return copyOfRange;
    }

    @Override // com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator
    public final void a(byte[] bArr) {
        byte[] b;
        byte[] nextRandomValue = this.e.nextRandomValue();
        byte[] c = c();
        byte[] bArr2 = this.f3228a;
        if (bArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        new java.lang.Object[]{bArr2, bArr, nextRandomValue, c};
        byte[] bArr3 = this.f3228a;
        if (bArr3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        byte[] plus = kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(bArr3, c), nextRandomValue);
        new java.lang.Object[]{plus};
        if (bArr == null) {
            b = b(plus);
        } else {
            b = b(kotlin.collections.ArraysKt.plus(plus, bArr));
        }
        this.f3228a = b;
        if (b == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        new java.lang.Object[]{b};
    }

    @Override // com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator
    public final void b() {
        byte[] bArr = this.f3228a;
        if (bArr != null) {
            com.discover.mpos.sdk.security.storage.DataStorage dataStorage = this.d;
            java.lang.String str = this.b;
            if (bArr == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            dataStorage.a(str, com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr));
        }
    }

    private static byte[] c() {
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (valueOf != null) {
            return valueOf.getBytes(charset);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static byte[] b(byte[] bArr) {
        return java.security.MessageDigest.getInstance("SHA-256").digest(bArr);
    }
}
