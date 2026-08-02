package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class EventHubKt {
    public static final /* synthetic */ java.util.Collection access$filterRemove(java.util.Collection collection, final kotlin.jvm.functions.Function1 function1) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.collections.CollectionsKt.removeAll(collection, new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHubKt$filterRemove$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(T t) {
                boolean z;
                if (function1.invoke(t).booleanValue()) {
                    arrayList.add(t);
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
        return arrayList;
    }
}
