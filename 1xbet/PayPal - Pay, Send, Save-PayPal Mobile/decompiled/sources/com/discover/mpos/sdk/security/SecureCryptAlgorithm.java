package com.discover.mpos.sdk.security;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/security/SecureCryptAlgorithm;", "Lcom/discover/mpos/sdk/security/CryptAlgorithm;", "hashAlgorithm", "Lcom/discover/mpos/sdk/security/HashAlgorithm;", "(Lcom/discover/mpos/sdk/security/HashAlgorithm;)V", "messageDigest", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "getMessageDigest", "()Ljava/security/MessageDigest;", "messageDigest$delegate", "Lkotlin/Lazy;", "hash", "", "byteArray", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.security.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SecureCryptAlgorithm implements com.discover.mpos.sdk.security.CryptAlgorithm {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.Lazy f3229a;

    public /* synthetic */ SecureCryptAlgorithm() {
        this(com.discover.mpos.sdk.security.HashAlgorithm.SHA_1);
    }

    private SecureCryptAlgorithm(com.discover.mpos.sdk.security.HashAlgorithm hashAlgorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashAlgorithm, "");
        this.f3229a = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.security.SecureCryptAlgorithm.a(hashAlgorithm));
    }

    @Override // com.discover.mpos.sdk.security.CryptAlgorithm
    public final byte[] a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return ((java.security.MessageDigest) this.f3229a.getValue()).digest(bArr);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.security.c$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.security.MessageDigest> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.security.HashAlgorithm f3230a;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.security.MessageDigest invoke() {
            return java.security.MessageDigest.getInstance(this.f3230a.b);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.security.HashAlgorithm hashAlgorithm) {
            super(0);
            this.f3230a = hashAlgorithm;
        }
    }
}
