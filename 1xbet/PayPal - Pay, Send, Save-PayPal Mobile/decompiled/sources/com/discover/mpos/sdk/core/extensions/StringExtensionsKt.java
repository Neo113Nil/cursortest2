package com.discover.mpos.sdk.core.extensions;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "toJSONString", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class StringExtensionsKt {
    public static final java.lang.String toJSONString(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return com.discover.mpos.sdk.core.debug.logger.PrettifiedGson.INSTANCE.gsonInstance().toJson(obj);
    }
}
