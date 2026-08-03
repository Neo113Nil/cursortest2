package com.inmobi.media;

/* renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2880xc extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5549a;
    public final /* synthetic */ com.inmobi.media.C2905yc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2880xc(com.inmobi.media.C2905yc c2905yc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2905yc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2880xc(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2880xc(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object a2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5549a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2905yc c2905yc = this.b;
            java.lang.String str3 = c2905yc.f5569a;
            int i2 = c2905yc.b;
            int i3 = c2905yc.c;
            kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
            c2905yc.g = new com.inmobi.media.Re(str3, null, null, null, new com.inmobi.media.Ni(i2, i3 * 1000, 0), false, 46);
            com.inmobi.media.C2905yc c2905yc2 = this.b;
            com.inmobi.media.Re re = c2905yc2.g;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context, "mraid_js_store");
                str = com.ironsource.X3.i.W;
                str2 = "last_ts";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, str);
                if ((java.lang.System.currentTimeMillis() / 1000) - a3.f4815a.getLong(str2, 0L) > c2905yc2.d && re != null) {
                    com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue();
                    this.f5549a = 1;
                    a2 = b9.f4618a.a(re, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        a2 = obj;
        str = com.ironsource.X3.i.W;
        str2 = "last_ts";
        com.inmobi.media.Ve ve = (com.inmobi.media.Ve) a2;
        android.content.Context context2 = com.inmobi.media.Xi.f5051a;
        if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
            com.inmobi.media.C2905yc c2905yc3 = this.b;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2905yc3.e;
            if (interfaceC2772t9 != null) {
                java.lang.String str4 = c2905yc3.f;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str4, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
            com.inmobi.media.La a4 = com.inmobi.media.Ka.a(context2, "mraid_js_store");
            kotlin.ranges.IntRange intRange2 = com.inmobi.media.AbstractC2276af.f5103a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
            java.lang.String value = ve.d().string(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mraid_js_string", str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            a4.a("mraid_js_string", value, false);
            a4.a(str2, java.lang.System.currentTimeMillis() / 1000, false);
        }
        return kotlin.Unit.INSTANCE;
    }
}
