package com.inmobi.media;

/* renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2883xf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2883xf f5551a = new com.inmobi.media.C2883xf();
    public static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    public static com.inmobi.media.Af c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2778tf c2778tf;
        java.lang.Object obj;
        int i;
        android.content.Context context;
        com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig;
        if (continuationImpl instanceof com.inmobi.media.C2778tf) {
            c2778tf = (com.inmobi.media.C2778tf) continuationImpl;
            int i2 = c2778tf.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2778tf.e = i2 - Integer.MIN_VALUE;
                obj = c2778tf.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2778tf.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
                    com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig2 = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getViewability().getOmidConfig();
                    android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                    if (context2 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    c2778tf.f5466a = omidConfig2;
                    c2778tf.b = context2;
                    c2778tf.e = 1;
                    java.lang.Object a2 = a(context2, omidConfig2, c2778tf);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context = context2;
                    omidConfig = omidConfig2;
                    obj = a2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = c2778tf.b;
                    omidConfig = c2778tf.f5466a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                b.set(2);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2805uf(omidConfig, context, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        c2778tf = new com.inmobi.media.C2778tf(this, continuationImpl);
        obj = c2778tf.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2778tf.e;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(android.content.Context context, com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2857wf c2857wf;
        java.lang.Object obj;
        int i;
        if (continuationImpl instanceof com.inmobi.media.C2857wf) {
            c2857wf = (com.inmobi.media.C2857wf) continuationImpl;
            int i2 = c2857wf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2857wf.c = i2 - Integer.MIN_VALUE;
                obj = c2857wf.f5529a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2857wf.c;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = b;
                    if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                        com.inmobi.media.Af af = c;
                        if (af == null) {
                            af = new com.inmobi.media.Af(context);
                            c = af;
                        }
                        c2857wf.c = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.C2908yf(af, omidConfig, null), c2857wf);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    z = false;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        c2857wf = new com.inmobi.media.C2857wf(this, continuationImpl);
        obj = c2857wf.f5529a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2857wf.c;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }
}
