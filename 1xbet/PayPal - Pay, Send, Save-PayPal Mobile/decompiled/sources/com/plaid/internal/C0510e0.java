package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", f = "CrashStorage.kt", i = {1}, l = {36, 38}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
/* renamed from: com.plaid.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0510e0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.plaid.internal.core.crashreporting.internal.models.Crash>>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.C0537h0 f6399a;
    public java.util.Collection b;
    public java.util.Iterator c;
    public int d;
    public final /* synthetic */ com.plaid.internal.C0537h0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0510e0(com.plaid.internal.C0537h0 c0537h0, kotlin.coroutines.Continuation<? super com.plaid.internal.C0510e0> continuation) {
        super(2, continuation);
        this.e = c0537h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0510e0(this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.plaid.internal.core.crashreporting.internal.models.Crash>> continuation) {
        return new com.plaid.internal.C0510e0(this.e, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005e -> B:8:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Collection arrayList;
        com.plaid.internal.C0537h0 c0537h0;
        java.util.Iterator it;
        java.util.List listOf;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0537h0 c0537h02 = this.e;
            this.d = 1;
            obj = c0537h02.f6424a.a(this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.c;
            arrayList = this.b;
            c0537h0 = this.f6399a;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th) {
                com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th);
                listOf = kotlin.collections.CollectionsKt.listOf(c0537h0.b.a(th));
            }
            listOf = (java.util.List) obj;
            kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
            if (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.lang.reflect.Type type = c0537h0.d;
                this.f6399a = c0537h0;
                this.b = arrayList;
                this.c = it;
                this.d = 2;
                obj = com.plaid.internal.C0537h0.a(c0537h0, str, type, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                listOf = (java.util.List) obj;
                kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
                if (it.hasNext()) {
                    return (java.util.List) arrayList;
                }
            }
        }
        com.plaid.internal.C0537h0 c0537h03 = this.e;
        arrayList = new java.util.ArrayList();
        c0537h0 = c0537h03;
        it = ((java.lang.Iterable) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
