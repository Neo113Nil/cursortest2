package com.inmobi.media;

/* renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2861wj {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5532a;
    public final kotlinx.coroutines.sync.Mutex b;

    public AbstractC2861wj(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f5532a = coroutineScope;
        this.b = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public abstract com.inmobi.media.InterfaceC2782tj a();

    public abstract void a(com.inmobi.media.InterfaceC2782tj interfaceC2782tj);

    public final void a(com.inmobi.media.InterfaceC2782tj newState, com.inmobi.media.InterfaceC2782tj callerState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "newState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerState, "callerState");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f5532a, null, null, new com.inmobi.media.C2809uj(this, newState, callerState, null), 3, null);
    }

    public final void b(com.inmobi.media.InterfaceC2782tj interfaceC2782tj, com.inmobi.media.InterfaceC2782tj interfaceC2782tj2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(a(), interfaceC2782tj2) && !kotlin.jvm.internal.Intrinsics.areEqual(a(), interfaceC2782tj)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass().getSimpleName();
            interfaceC2782tj.getClass().getSimpleName();
            a().c();
            a(interfaceC2782tj);
            a().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.inmobi.media.tj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.C2354dd c2354dd, com.inmobi.media.InterfaceC2782tj interfaceC2782tj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2835vj c2835vj;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2835vj) {
                c2835vj = (com.inmobi.media.C2835vj) continuationImpl;
                int i2 = c2835vj.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2835vj.f = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2835vj.d;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2835vj.f;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.b;
                        c2835vj.f5514a = c2354dd;
                        c2835vj.b = interfaceC2782tj;
                        c2835vj.c = mutex;
                        c2835vj.f = 1;
                        if (mutex.lock(null, c2835vj) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = c2835vj.c;
                        interfaceC2782tj = c2835vj.b;
                        ?? r0 = c2835vj.f5514a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        c2354dd = r0;
                    }
                    b(c2354dd, interfaceC2782tj);
                    return kotlin.Unit.INSTANCE;
                }
            }
            b(c2354dd, interfaceC2782tj);
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c2835vj = new com.inmobi.media.C2835vj(this, continuationImpl);
        java.lang.Object obj2 = c2835vj.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2835vj.f;
        if (i != 0) {
        }
    }
}
