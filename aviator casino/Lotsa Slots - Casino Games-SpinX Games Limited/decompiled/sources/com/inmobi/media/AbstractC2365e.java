package com.inmobi.media;

/* renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2365e {
    public static final boolean a() {
        return true;
    }

    public static void a(final com.inmobi.media.M0 process, final com.inmobi.media.Ng ng, java.lang.Long l, final kotlin.jvm.functions.Function0 shouldProcess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(process, "process");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldProcess, "shouldProcess");
        kotlin.Lazy lazy = com.inmobi.media.E0.f4672a;
        long longValue = l != null ? l.longValue() : 0L;
        kotlin.jvm.functions.Function0 execute = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2365e.a(kotlin.jvm.functions.Function0.this, process, ng);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(execute, "execute");
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.E0.e;
        if (coroutineScope == null) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
            com.inmobi.media.E0.e = coroutineScope;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.D0(longValue, execute, null), 3, null);
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function0 function0, com.inmobi.media.M0 m0, com.inmobi.media.Ng ng) {
        try {
            if (((java.lang.Boolean) function0.invoke()).booleanValue()) {
                java.lang.Object a2 = m0.a();
                if (ng != null) {
                    ng.a(a2);
                }
            } else if (ng != null) {
                ng.onError(new java.lang.Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (java.lang.Exception e) {
            if (ng != null) {
                ng.onError(e);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
