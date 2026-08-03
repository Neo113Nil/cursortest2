package com.inmobi.media;

/* renamed from: com.inmobi.media.gj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2439gj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5223a;
    public final /* synthetic */ com.inmobi.media.C2465hj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ android.webkit.WebView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439gj(com.inmobi.media.C2465hj c2465hj, long j, java.lang.String str, android.webkit.WebView webView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2465hj;
        this.c = j;
        this.d = str;
        this.e = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2439gj(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2439gj) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        int ordinal;
        android.webkit.WebView webView;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5223a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j = this.b.f5245a;
            this.f5223a = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z2 = false;
        boolean z3 = this.c == this.b.e;
        java.lang.String str = this.d;
        if (str != null) {
            android.webkit.WebView webView2 = this.e;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, webView2 != null ? webView2.getUrl() : null)) {
                z = true;
                ordinal = this.b.g.ordinal();
                if (ordinal == 1 ? !this.b.h : ordinal == 3) {
                    z2 = true;
                }
                if (z3 && z && !this.b.f && z2 && (webView = this.e) != null && webView.isAttachedToWindow()) {
                    this.b.a("PAGE_COMMIT_VISIBLE", this.d);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        z = false;
        ordinal = this.b.g.ordinal();
        if (ordinal == 1) {
            z2 = true;
            if (z3) {
            }
            return kotlin.Unit.INSTANCE;
        }
        z2 = true;
        if (z3) {
            this.b.a("PAGE_COMMIT_VISIBLE", this.d);
        }
        return kotlin.Unit.INSTANCE;
    }
}
