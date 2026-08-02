package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "name", "", "types", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/AddressComponent$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/AddressComponent;", "addressComponent", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/AddressComponent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddressComponentKt {
    public static final com.google.android.libraries.places.api.model.AddressComponent addressComponent(java.lang.String str, java.util.List<java.lang.String> list, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.AddressComponent.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.google.android.libraries.places.api.model.AddressComponent.Builder builder = com.google.android.libraries.places.api.model.AddressComponent.builder(str, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.AddressComponent build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.AddressComponent addressComponent$default(java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return addressComponent(str, list, function1);
    }
}
