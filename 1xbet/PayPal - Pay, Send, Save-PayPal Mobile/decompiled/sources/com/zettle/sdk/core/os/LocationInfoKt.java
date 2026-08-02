package com.zettle.sdk.core.os;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Companion;", "Lcom/zettle/sdk/commons/util/Log;", "Location$delegate", "Lkotlin/Lazy;", "getLocation", "(Lcom/zettle/sdk/commons/util/Log$Companion;)Lcom/zettle/sdk/commons/util/Log;", "Location"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocationInfoKt {
    private static final kotlin.Lazy Location$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.util.Log>() { // from class: com.zettle.sdk.core.os.LocationInfoKt$Location$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.util.Log invoke() {
            return com.zettle.sdk.commons.util.Log.INSTANCE.get("Location");
        }
    });

    public static final com.zettle.sdk.commons.util.Log getLocation(com.zettle.sdk.commons.util.Log.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.util.Log) Location$delegate.getValue();
    }
}
