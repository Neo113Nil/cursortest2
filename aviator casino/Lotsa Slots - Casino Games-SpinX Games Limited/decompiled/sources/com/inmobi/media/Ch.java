package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ch implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Eh f4643a;
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef c;

    public Ch(com.inmobi.media.Eh eh, kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        this.f4643a = eh;
        this.b = flowCollector;
        this.c = objectRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
    
        if (r12.emit(r1, r0) != r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        if (r12 == r8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.inmobi.media.AbstractC2767t4 abstractC2767t4, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Bh bh;
        int i;
        java.lang.Object obj;
        if (continuation instanceof com.inmobi.media.Bh) {
            bh = (com.inmobi.media.Bh) continuation;
            int i2 = bh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bh.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = bh.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bh.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (!(abstractC2767t4 instanceof com.inmobi.media.C2794u4)) {
                        if (!(abstractC2767t4 instanceof com.inmobi.media.C2397f4)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.inmobi.media.Eh eh = this.f4643a;
                    com.inmobi.media.C2794u4 c2794u4 = (com.inmobi.media.C2794u4) abstractC2767t4;
                    bh.f4625a = abstractC2767t4;
                    bh.d = 1;
                    int i3 = c2794u4.f5479a;
                    if (i3 == 200) {
                        com.inmobi.media.C2370e4 c2370e4 = eh.f4687a;
                        com.inmobi.media.core.config.models.Config config = c2794u4.b;
                        com.inmobi.media.C2613n9 c2613n9 = c2370e4.f5169a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "<this>");
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("config_value", config.toJson().toString());
                        contentValues.put("config_type", config.getType());
                        contentValues.put("update_ts", java.lang.Long.valueOf(config.getLastUpdateTimeStamp()));
                        obj = c2613n9.a("config_db", contentValues, 5, bh);
                        if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = kotlin.Unit.INSTANCE;
                        }
                        if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = kotlin.Unit.INSTANCE;
                        }
                    } else if (i3 == 304) {
                        com.inmobi.media.C2370e4 c2370e42 = eh.f4687a;
                        java.lang.String type = c2794u4.b.getType();
                        long lastUpdateTimeStamp = c2794u4.b.getLastUpdateTimeStamp();
                        c2370e42.getClass();
                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                        contentValues2.put("update_ts", kotlin.coroutines.jvm.internal.Boxing.boxLong(lastUpdateTimeStamp));
                        obj = com.inmobi.media.C2613n9.a(c2370e42.f5169a, "config_db", contentValues2, "config_type=?", new java.lang.String[]{type}, bh, 16);
                        if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = kotlin.Unit.INSTANCE;
                        }
                        if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        obj = kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC2767t4 = bh.f4625a;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (((com.inmobi.media.C2794u4) abstractC2767t4).b instanceof com.inmobi.media.core.config.models.RootConfig) {
                            this.c.element = com.inmobi.media.Eh.a(this.f4643a);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    abstractC2767t4 = bh.f4625a;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                kotlinx.coroutines.flow.FlowCollector flowCollector = this.b;
                com.inmobi.media.core.config.models.Config config2 = ((com.inmobi.media.C2794u4) abstractC2767t4).b;
                bh.f4625a = abstractC2767t4;
                bh.d = 2;
            }
        }
        bh = new com.inmobi.media.Bh(this, continuation);
        java.lang.Object obj22 = bh.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bh.d;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.b;
        com.inmobi.media.core.config.models.Config config22 = ((com.inmobi.media.C2794u4) abstractC2767t4).b;
        bh.f4625a = abstractC2767t4;
        bh.d = 2;
    }
}
