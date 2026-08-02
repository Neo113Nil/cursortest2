package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6773a;
    public final /* synthetic */ financial.atomic.muppet.Page b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.i(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.i(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String getInputFormats;
        financial.atomic.muppet.inter.Page page;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6773a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.webkit.WebView access$get_wv = financial.atomic.muppet.Page.access$get_wv(this.b);
            getInputFormats = this.b.getGetInputFormats();
            access$get_wv.removeJavascriptInterface(getInputFormats);
            financial.atomic.muppet.Page.access$get_wv(this.b).stopLoading();
            android.view.ViewParent parent = financial.atomic.muppet.Page.access$get_wv(this.b).getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(financial.atomic.muppet.Page.access$get_wv(this.b));
            }
            financial.atomic.muppet.Page.access$get_wv(this.b).destroy();
            page = this.b.get_parent();
            financial.atomic.muppet.Page page2 = page instanceof financial.atomic.muppet.Page ? (financial.atomic.muppet.Page) page : null;
            if (page2 == null) {
                return null;
            }
            this.f6773a = 1;
            obj = page2.bringToFront(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.Boolean) obj;
    }
}
