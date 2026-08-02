package com.payair.csdk;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl f4311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl) {
        super(1);
        this.f4311a = hceRemoteRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider;
        com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto responseStartTokenizeAllCardsDto = (com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseStartTokenizeAllCardsDto, "");
        com.payair.model.StartTokenizeAllCardsData startTokenizeAllCardsData = com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDtoKt.toStartTokenizeAllCardsData(responseStartTokenizeAllCardsDto);
        coroutineDispatcherProvider = this.f4311a.i;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineDispatcherProvider.getIOScope(), null, null, new com.payair.csdk.r1(startTokenizeAllCardsData, this.f4311a, null), 3, null);
        return startTokenizeAllCardsData;
    }
}
