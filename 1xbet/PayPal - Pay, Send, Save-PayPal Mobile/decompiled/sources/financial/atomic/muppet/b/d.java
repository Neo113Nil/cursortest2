package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.inter.Browser f6816a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(financial.atomic.muppet.inter.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6816a = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.d(this.f6816a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.d(this.f6816a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        java.util.List pages = this.f6816a.pages();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pages, 10));
        java.util.Iterator it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.coroutines.jvm.internal.Boxing.boxInt(((financial.atomic.muppet.inter.Page) it.next()).hashCode()));
        }
        companion.getSerializersModule();
        return companion.encodeToString(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE), arrayList);
    }
}
