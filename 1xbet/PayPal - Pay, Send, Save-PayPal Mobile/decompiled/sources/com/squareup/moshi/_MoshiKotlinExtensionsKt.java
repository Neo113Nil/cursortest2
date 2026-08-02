package com.squareup.moshi;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a*\u0010\t\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "(Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/reflect/KType;", "ktype", "(Lcom/squareup/moshi/Moshi;Lkotlin/reflect/KType;)Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/Moshi$Builder;", "addAdapter", "(Lcom/squareup/moshi/Moshi$Builder;Lcom/squareup/moshi/JsonAdapter;)Lcom/squareup/moshi/Moshi$Builder;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _MoshiKotlinExtensionsKt {
    public static final /* synthetic */ <T> com.squareup.moshi.JsonAdapter<T> adapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        return adapter(moshi, null);
    }

    public static final /* synthetic */ <T> com.squareup.moshi.Moshi.Builder addAdapter(com.squareup.moshi.Moshi.Builder builder, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonAdapter, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        com.squareup.moshi.Moshi.Builder add = builder.add(kotlin.reflect.TypesJVMKt.getJavaType(null), jsonAdapter);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
        return add;
    }

    public static final <T> com.squareup.moshi.JsonAdapter<T> adapter(com.squareup.moshi.Moshi moshi, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        com.squareup.moshi.JsonAdapter<T> adapter = moshi.adapter(kotlin.reflect.TypesJVMKt.getJavaType(kType));
        if ((adapter instanceof com.squareup.moshi.internal.NullSafeJsonAdapter) || (adapter instanceof com.squareup.moshi.internal.NonNullJsonAdapter)) {
            return adapter;
        }
        if (kType.getIsMarkedNullable()) {
            com.squareup.moshi.JsonAdapter<T> nullSafe = adapter.nullSafe();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullSafe, "");
            return nullSafe;
        }
        com.squareup.moshi.JsonAdapter<T> nonNull = adapter.nonNull();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonNull, "");
        return nonNull;
    }
}
