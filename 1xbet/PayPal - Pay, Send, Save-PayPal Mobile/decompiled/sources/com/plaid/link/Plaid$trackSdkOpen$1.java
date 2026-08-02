package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.link.Plaid$trackSdkOpen$1", f = "Plaid.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Plaid$trackSdkOpen$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.plaid.internal.C0683x3 $workflowAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$trackSdkOpen$1(com.plaid.internal.C0683x3 c0683x3, kotlin.coroutines.Continuation<? super com.plaid.link.Plaid$trackSdkOpen$1> continuation) {
        super(2, continuation);
        this.$workflowAnalytics = c0683x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.X4 x4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            x4 = com.plaid.link.Plaid.component;
            if (x4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                x4 = null;
            }
            com.plaid.internal.C0690y1 c0690y1 = ((com.plaid.internal.C0609p0) x4).f.get();
            this.label = 1;
            obj = c0690y1.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.plaid.internal.N2 n2 = (com.plaid.internal.N2) obj;
        if (n2 instanceof com.plaid.internal.N2.k) {
            com.plaid.internal.C0683x3 c0683x3 = this.$workflowAnalytics;
            com.plaid.internal.N2.k kVar = (com.plaid.internal.N2.k) n2;
            java.lang.String str = kVar.b;
            java.lang.String str2 = kVar.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build = com.plaid.internal.C0683x3.a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(str)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0665v3(c0683x3, str2, build, null), 3, null);
        } else {
            com.plaid.internal.C0683x3 c0683x32 = this.$workflowAnalytics;
            java.lang.String g = n2.g();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "");
            com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build2 = com.plaid.internal.C0683x3.a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(g)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0665v3(c0683x32, "", build2, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.link.Plaid$trackSdkOpen$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.link.Plaid$trackSdkOpen$1(this.$workflowAnalytics, continuation);
    }
}
