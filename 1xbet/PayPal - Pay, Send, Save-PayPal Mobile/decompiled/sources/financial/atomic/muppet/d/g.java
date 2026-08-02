package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6864a;
    public final /* synthetic */ financial.atomic.muppet.impl.Page b;
    public final /* synthetic */ io.ktor.http.Url c;
    public final /* synthetic */ kotlin.jvm.functions.Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(financial.atomic.muppet.impl.Page page, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = url;
        this.d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.d.g(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.d.g) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6864a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.impl.Page page = this.b;
            java.lang.String obj2 = this.c.toString();
            this.f6864a = 1;
            obj = page.cookies(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        kotlin.jvm.functions.Function1 function1 = this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((io.ktor.http.Cookie) function1.invoke((io.ktor.http.Cookie) it.next()));
        }
        return arrayList;
    }
}
