package com.paypal.oslo.feature.xoom.extensions;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "parseJsonTo", "(Ljava/lang/String;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class XoomJsonParserKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T parseJsonTo(java.lang.String str) {
        com.paypal.oslo.feature.xoom.extensions.XoomJsonParser xoomJsonParser = com.paypal.oslo.feature.xoom.extensions.XoomJsonParser.INSTANCE;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (T) xoomJsonParser.fromJson(str, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null));
    }
}
