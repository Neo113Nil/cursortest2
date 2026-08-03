package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Nh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ph f4858a;
    public final /* synthetic */ com.inmobi.media.Ib b;
    public final /* synthetic */ org.json.JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(com.inmobi.media.Ph ph, com.inmobi.media.Ib ib, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f4858a = ph;
        this.b = ib;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Nh(this.f4858a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.Nh) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r0 != com.inmobi.media.Ib.d) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.Ib eventLogLevel;
        int ordinal;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.Kb kb = this.f4858a.e;
            eventLogLevel = this.b;
            kb.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            ordinal = kb.f4797a.ordinal();
        } catch (java.lang.Exception e) {
            this.f4858a.getClass();
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (eventLogLevel == com.inmobi.media.Ib.d) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (eventLogLevel != com.inmobi.media.Ib.c) {
                    if (eventLogLevel == com.inmobi.media.Ib.d) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else if (eventLogLevel != com.inmobi.media.Ib.b) {
                if (eventLogLevel != com.inmobi.media.Ib.c) {
                }
            }
        }
        this.f4858a.g.add(this.c);
        return kotlin.Unit.INSTANCE;
    }
}
