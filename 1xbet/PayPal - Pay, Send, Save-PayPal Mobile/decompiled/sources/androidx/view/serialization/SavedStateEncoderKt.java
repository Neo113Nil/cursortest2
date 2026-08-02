package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\u00060\u0005j\u0002`\u0006\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a=\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\f\u001a7\u0010\t\u001a\u00060\u0005j\u0002`\u0006\"\u0004\b\u0000\u0010\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\f"}, d2 = {"", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/savedstate/serialization/SavedStateConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "encodeToSavedState", "(Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "encodeToSavedStateNullable", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateEncoderKt {
    public static /* synthetic */ android.os.Bundle encodeToSavedState$default(java.lang.Object obj, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), obj, savedStateConfiguration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'encodeToSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ <T> android.os.Bundle encodeToSavedState(T t, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t, savedStateConfiguration);
    }

    public static /* synthetic */ android.os.Bundle encodeToSavedStateNullable$default(java.lang.Object obj, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), obj, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> android.os.Bundle encodeToSavedStateNullable(T t, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t, savedStateConfiguration);
    }

    public static /* synthetic */ android.os.Bundle encodeToSavedState$default(kotlinx.serialization.SerializationStrategy serializationStrategy, java.lang.Object obj, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(serializationStrategy, obj, savedStateConfiguration);
    }

    public static /* synthetic */ android.os.Bundle encodeToSavedStateNullable$default(kotlinx.serialization.SerializationStrategy serializationStrategy, java.lang.Object obj, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedStateNullable(serializationStrategy, obj, savedStateConfiguration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'encodeToSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ android.os.Bundle encodeToSavedState(kotlinx.serialization.SerializationStrategy serializationStrategy, java.lang.Object obj, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        new androidx.view.serialization.SavedStateEncoder(bundleOf, savedStateConfiguration).encodeSerializableValue(serializationStrategy, obj);
        return bundleOf;
    }

    public static final <T> android.os.Bundle encodeToSavedStateNullable(kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        new androidx.view.serialization.SavedStateEncoder(bundleOf, savedStateConfiguration).encodeSerializableValue(serializationStrategy, t);
        return bundleOf;
    }

    public static final <T> android.os.Bundle encodeToSavedStateNullable(kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return encodeToSavedStateNullable$default(serializationStrategy, t, null, 4, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'encodeToSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ android.os.Bundle encodeToSavedState(kotlinx.serialization.SerializationStrategy serializationStrategy, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return encodeToSavedState$default(serializationStrategy, obj, null, 4, null);
    }
}
