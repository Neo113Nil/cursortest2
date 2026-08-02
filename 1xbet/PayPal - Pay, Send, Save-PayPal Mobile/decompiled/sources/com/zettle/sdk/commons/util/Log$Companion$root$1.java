package com.zettle.sdk.commons.util;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class Log$Companion$root$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, com.zettle.sdk.commons.util.Log, com.zettle.sdk.commons.util.Log> {
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final com.zettle.sdk.commons.util.Log invoke(java.lang.String str, com.zettle.sdk.commons.util.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.zettle.sdk.commons.util.Log.Companion.access$getOrCreate((com.zettle.sdk.commons.util.Log.Companion) this.receiver, str, log);
    }

    Log$Companion$root$1(java.lang.Object obj) {
        super(2, obj, com.zettle.sdk.commons.util.Log.Companion.class, "getOrCreate", "getOrCreate(Ljava/lang/String;Lcom/zettle/sdk/commons/util/Log;)Lcom/zettle/sdk/commons/util/Log;", 0);
    }
}
