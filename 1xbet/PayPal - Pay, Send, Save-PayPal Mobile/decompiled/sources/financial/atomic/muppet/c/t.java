package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class t extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.serialization.json.JsonObject f6857a;
    public java.lang.String b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ financial.atomic.muppet.http.Response d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(financial.atomic.muppet.http.Response response, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.jsonObject$core_release(this);
    }
}
