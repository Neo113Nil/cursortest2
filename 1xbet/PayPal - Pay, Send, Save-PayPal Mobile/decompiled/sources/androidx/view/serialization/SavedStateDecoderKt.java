package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a=\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\f\u001a7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\f"}, d2 = {"", "T", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "decodeFromSavedState", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "decodeFromSavedStateNullable", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "(Lkotlinx/serialization/DeserializationStrategy;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateDecoderKt {
    public static /* synthetic */ java.lang.Object decodeFromSavedState$default(android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bundle, savedStateConfiguration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'decodeFromSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ <T> T decodeFromSavedState(android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bundle, savedStateConfiguration);
    }

    public static /* synthetic */ java.lang.Object decodeFromSavedStateNullable$default(android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bundle, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedStateNullable(android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedStateNullable(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bundle, savedStateConfiguration);
    }

    public static /* synthetic */ java.lang.Object decodeFromSavedState$default(kotlinx.serialization.DeserializationStrategy deserializationStrategy, android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(deserializationStrategy, bundle, savedStateConfiguration);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'decodeFromSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ java.lang.Object decodeFromSavedState(kotlinx.serialization.DeserializationStrategy deserializationStrategy, android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        return new androidx.view.serialization.SavedStateDecoder(bundle, savedStateConfiguration).decodeSerializableValue(deserializationStrategy);
    }

    public static /* synthetic */ java.lang.Object decodeFromSavedStateNullable$default(kotlinx.serialization.DeserializationStrategy deserializationStrategy, android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedStateNullable(deserializationStrategy, bundle, savedStateConfiguration);
    }

    public static final <T> T decodeFromSavedStateNullable(kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, android.os.Bundle bundle, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        return (T) new androidx.view.serialization.SavedStateDecoder(bundle, savedStateConfiguration).decodeSerializableValue(deserializationStrategy);
    }

    public static final <T> T decodeFromSavedStateNullable(kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        return (T) decodeFromSavedStateNullable$default(deserializationStrategy, bundle, null, 4, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'decodeFromSavedState' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ java.lang.Object decodeFromSavedState(kotlinx.serialization.DeserializationStrategy deserializationStrategy, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        return decodeFromSavedState$default(deserializationStrategy, bundle, null, 4, null);
    }
}
