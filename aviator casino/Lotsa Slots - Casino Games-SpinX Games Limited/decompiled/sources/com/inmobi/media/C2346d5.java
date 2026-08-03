package com.inmobi.media;

/* renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2346d5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.Network f5153a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2346d5(android.net.Network network, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5153a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2346d5(this.f5153a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2346d5(this.f5153a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:2|3)|(3:7|(1:9)(1:23)|(6:11|12|13|14|15|16))|24|13|14|15|16|(2:(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r1 = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(r0));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        com.inmobi.media.core.config.models.AdConfig.CustomNetworkValidation a2;
        java.lang.String urlDomain;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            try {
                a2 = com.inmobi.media.C2371e5.a();
            } catch (java.lang.Exception unused) {
            }
            if (a2 != null && (urlDomain = a2.getUrlDomain()) != null) {
                if (urlDomain.length() <= 0) {
                    urlDomain = null;
                }
                if (urlDomain != null) {
                    z = !kotlin.jvm.internal.Intrinsics.areEqual(java.net.InetAddress.getByName(urlDomain).toString(), "");
                    com.inmobi.media.C2371e5.b = z;
                    com.inmobi.media.C2371e5.f5170a = this.f5153a;
                    com.inmobi.media.C2371e5.c = android.os.SystemClock.elapsedRealtime();
                    boolean z2 = com.inmobi.media.C2371e5.b;
                    com.inmobi.media.C2371e5.e.set(false);
                    return kotlin.Unit.INSTANCE;
                }
            }
            z = false;
            com.inmobi.media.C2371e5.b = z;
            com.inmobi.media.C2371e5.f5170a = this.f5153a;
            com.inmobi.media.C2371e5.c = android.os.SystemClock.elapsedRealtime();
            boolean z22 = com.inmobi.media.C2371e5.b;
            com.inmobi.media.C2371e5.e.set(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            com.inmobi.media.C2371e5.e.set(false);
            throw th;
        }
    }
}
