package com.payair.csdk;

/* loaded from: classes4.dex */
public final class r3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl f4308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl tokenRemoteRepositoryImpl) {
        super(1);
        this.f4308a = tokenRemoteRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.storage.StorageService storageService;
        com.payair.logic.remote.model.TokenDetailsDto tokenDetailsDto = (com.payair.logic.remote.model.TokenDetailsDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetailsDto, "");
        storageService = this.f4308a.b;
        return com.payair.logic.remote.model.TokenDetailsDtoKt.toTokenDetails(tokenDetailsDto, storageService);
    }
}
