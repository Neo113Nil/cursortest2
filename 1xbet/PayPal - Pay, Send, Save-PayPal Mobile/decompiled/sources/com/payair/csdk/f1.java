package com.payair.csdk;

/* loaded from: classes10.dex */
public final class f1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f4248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl) {
        super(1);
        this.f4248a = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto responseGetCSDKPKCertificateDto = (com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseGetCSDKPKCertificateDto, "");
        return com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.access$decodeStringFromBase64(this.f4248a, responseGetCSDKPKCertificateDto.getCertificateData());
    }
}
