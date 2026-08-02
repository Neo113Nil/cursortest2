package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6876a;
    public final /* synthetic */ financial.atomic.muppet.Page b;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.i(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x011b, code lost:
    
        if (((kotlinx.coroutines.Deferred) r4).await(r3) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0121, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
    
        if (r4 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ea, code lost:
    
        if (((kotlinx.coroutines.Deferred) r4).await(r3) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
    
        if (r4 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (((kotlinx.coroutines.Deferred) r4).await(r3) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r4 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (((kotlinx.coroutines.Deferred) r4).await(r3) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r4 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (((kotlinx.coroutines.Deferred) r4).await(r3) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r4 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String getInputFormats;
        java.lang.String getInputFormats2;
        java.lang.String getInputFormats3;
        java.lang.String getInputFormats4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f6876a) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.Page page = this.b;
                this.f6876a = 1;
                obj = page.evaluate("window.MuppetPage = { dispatch: (m) => dispatchEvent(new CustomEvent('dispatch', { detail: m })) }", this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6876a = 2;
                break;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.Page page2 = this.b;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("window.addEventListener('dispatch', (e) => ");
                getInputFormats = this.b.getGetInputFormats();
                sb.append(getInputFormats);
                sb.append(".event('dispatch', JSON.stringify(e.detail)))");
                java.lang.String obj2 = sb.toString();
                this.f6876a = 3;
                obj = page2.evaluate(obj2, this);
                break;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6876a = 4;
                break;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.Page page3 = this.b;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("window.addEventListener('DOMContentLoaded', (e) => ");
                getInputFormats2 = this.b.getGetInputFormats();
                sb2.append(getInputFormats2);
                sb2.append(".event(e.type.toLowerCase(), location.href))");
                java.lang.String obj3 = sb2.toString();
                this.f6876a = 5;
                obj = page3.evaluate(obj3, this);
                break;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6876a = 6;
                break;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.Page page4 = this.b;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("window.addEventListener('load', (e) => ");
                getInputFormats3 = this.b.getGetInputFormats();
                sb3.append(getInputFormats3);
                sb3.append(".event(e.type, location.href))");
                java.lang.String obj4 = sb3.toString();
                this.f6876a = 7;
                obj = page4.evaluate(obj4, this);
                break;
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6876a = 8;
                break;
            case 8:
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.Page page5 = this.b;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\n                (() => {\n                    const observer = new MutationObserver(mutationList =>\n                    mutationList.filter(m => m.type === 'childList').forEach(m => {\n                        m.addedNodes.forEach(() => ");
                getInputFormats4 = this.b.getGetInputFormats();
                sb4.append(getInputFormats4);
                sb4.append(".event('domchange', location.href));\n                    }));\n                    observer.observe(document, { childList: true, subtree: true });\n                })()\n            ");
                java.lang.String obj5 = sb4.toString();
                this.f6876a = 9;
                obj = page5.evaluate(obj5, this);
                break;
            case 9:
                kotlin.ResultKt.throwOnFailure(obj);
                this.f6876a = 10;
                break;
            case 10:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.i(this.b, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
    }
}
