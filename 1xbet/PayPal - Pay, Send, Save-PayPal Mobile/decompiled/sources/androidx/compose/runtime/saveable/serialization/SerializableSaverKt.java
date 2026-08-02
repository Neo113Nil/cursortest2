package androidx.compose.runtime.saveable.serialization;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"", "Serializable", "Landroidx/savedstate/serialization/SavedStateConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/compose/runtime/saveable/Saver;", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "serializableSaver", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroidx/compose/runtime/saveable/Saver;", "Lkotlinx/serialization/KSerializer;", "serializer", "(Lkotlinx/serialization/KSerializer;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroidx/compose/runtime/saveable/Saver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializableSaverKt {
    public static /* synthetic */ androidx.compose.runtime.saveable.Saver serializableSaver$default(androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "Serializable");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return serializableSaver(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), savedStateConfiguration);
    }

    public static final /* synthetic */ <Serializable> androidx.compose.runtime.saveable.Saver<Serializable, android.os.Bundle> serializableSaver(androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "Serializable");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return serializableSaver(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), savedStateConfiguration);
    }

    public static /* synthetic */ androidx.compose.runtime.saveable.Saver serializableSaver$default(kotlinx.serialization.KSerializer kSerializer, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return serializableSaver(kSerializer, savedStateConfiguration);
    }

    public static final <Serializable> androidx.compose.runtime.saveable.Saver<Serializable, android.os.Bundle> serializableSaver(final kotlinx.serialization.KSerializer<Serializable> kSerializer, final androidx.view.serialization.SavedStateConfiguration savedStateConfiguration) {
        return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.serialization.SerializableSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                android.os.Bundle encodeToSavedState;
                encodeToSavedState = androidx.view.serialization.SavedStateEncoderKt.encodeToSavedState(kotlinx.serialization.KSerializer.this, obj2, savedStateConfiguration);
                return encodeToSavedState;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.serialization.SerializableSaverKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object decodeFromSavedState;
                decodeFromSavedState = androidx.view.serialization.SavedStateDecoderKt.decodeFromSavedState(kotlinx.serialization.KSerializer.this, (android.os.Bundle) obj, savedStateConfiguration);
                return decodeFromSavedState;
            }
        });
    }
}
