package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "photoReference", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/PhotoMetadata$Builder;", "", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "photoMetadata", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/PhotoMetadata;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PhotoMetadataKt {
    public static final com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata(java.lang.String str, kotlin.jvm.functions.Function1<? super com.google.android.libraries.places.api.model.PhotoMetadata.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.android.libraries.places.api.model.PhotoMetadata.Builder builder = com.google.android.libraries.places.api.model.PhotoMetadata.builder(str);
        if (function1 != null) {
            function1.invoke(builder);
        }
        com.google.android.libraries.places.api.model.PhotoMetadata build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata$default(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return photoMetadata(str, function1);
    }
}
