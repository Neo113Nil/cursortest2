package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class m implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i f7763a;
    public final kotlinx.coroutines.CoroutineScope b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastTrackerImpl$track$1", f = "VastTracker.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7764a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public int i;
        public final /* synthetic */ java.util.List<java.lang.String> j;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a k;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f l;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m m;
        public final /* synthetic */ java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> n;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x o;
        public final /* synthetic */ java.lang.Integer p;
        public final /* synthetic */ java.lang.String q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.util.List<java.lang.String> list, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m mVar, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a> continuation) {
            super(2, continuation);
            this.j = list;
            this.k = aVar;
            this.l = fVar;
            this.m = mVar;
            this.n = list2;
            this.o = xVar;
            this.p = num;
            this.q = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
        
            r6 = r6;
            r7 = r7;
            r4 = r4;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x00ba  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0098 -> B:5:0x00a2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.Iterator it;
            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar;
            java.lang.Integer num;
            java.lang.String str;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m mVar;
            java.lang.String d;
            java.lang.String b;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.i;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<java.lang.String> list2 = this.j;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = this.k;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar2 = this.l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m mVar2 = this.m;
                java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list3 = this.n;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar2 = this.o;
                java.lang.Integer num2 = this.p;
                java.lang.String str2 = this.q;
                it = list2.iterator();
                list = list3;
                xVar = xVar2;
                num = num2;
                str = str2;
                aVar = aVar2;
                fVar = fVar2;
                mVar = mVar2;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.util.Iterator it2 = (java.util.Iterator) this.h;
                java.lang.String str3 = (java.lang.String) this.g;
                java.lang.Integer num3 = (java.lang.Integer) this.f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x) this.e;
                java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list4 = (java.util.List) this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m mVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m) this.c;
                fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) this.f7764a;
                kotlin.ResultKt.throwOnFailure(obj);
                it = it2;
                java.lang.Object a2 = obj;
                str = str3;
                num = num3;
                xVar = xVar3;
                list = list4;
                aVar = aVar3;
                java.lang.String str4 = (java.lang.String) a2;
                mVar = mVar3;
                java.lang.Integer boxInt = xVar != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(xVar.c()) : null;
                d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.d();
                b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b(str4, boxInt, num, str, d);
                mVar.f7763a.a(b);
                if (!it.hasNext()) {
                    str4 = (java.lang.String) it.next();
                    if (aVar == null || fVar == null) {
                        fVar = fVar;
                        mVar = mVar;
                        aVar = aVar;
                        if (xVar != null) {
                        }
                        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.d();
                        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b(str4, boxInt, num, str, d);
                        mVar.f7763a.a(b);
                        if (!it.hasNext()) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        long a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a();
                        this.f7764a = aVar;
                        this.b = fVar;
                        this.c = mVar;
                        this.d = list;
                        this.e = xVar;
                        this.f = num;
                        this.g = str;
                        this.h = it;
                        this.i = 1;
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar4 = aVar;
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar3 = fVar;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m mVar4 = mVar;
                        a2 = mVar.a(str4, aVar, fVar, a3, list, this);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str;
                        num3 = num;
                        xVar3 = xVar;
                        list4 = list;
                        fVar = fVar3;
                        mVar3 = mVar4;
                        aVar3 = aVar4;
                        str = str3;
                        num = num3;
                        xVar = xVar3;
                        list = list4;
                        aVar = aVar3;
                        java.lang.String str42 = (java.lang.String) a2;
                        mVar = mVar3;
                        if (xVar != null) {
                        }
                        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.d();
                        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b(str42, boxInt, num, str, d);
                        mVar.f7763a.a(b);
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
    }

    public m(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f7763a = persistentHttpRequest;
        this.b = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getDefault());
    }

    public final void b(java.util.List<java.lang.String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(list, aVar, fVar, this, list2, xVar, num, str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l
    public void a(java.util.List<java.lang.String> urls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> renderedButtons, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f lastClickPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urls, "urls");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderedButtons, "renderedButtons");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        b(urls, xVar, num, str, renderedButtons, customUserEventBuilderService, lastClickPosition);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l
    public void a(java.util.List<java.lang.String> urls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urls, "urls");
        b(urls, xVar, num, str, kotlin.collections.CollectionsKt.emptyList(), null, null);
    }

    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, long j, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return aVar.a(j, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d(fVar, null, null, list, 6, null), str, continuation);
    }
}
