package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a]\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000f\u001aW\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\f\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", "Landroidx/savedstate/SavedStateRegistryOwner;", "", "key", "Landroidx/savedstate/serialization/SavedStateConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlin/Function0;", "init", "Lkotlin/properties/ReadWriteProperty;", "saved", "(Landroidx/savedstate/SavedStateRegistryOwner;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;", "savedNullable", "Lkotlinx/serialization/KSerializer;", "serializer", "(Landroidx/savedstate/SavedStateRegistryOwner;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/ReadWriteProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistryOwnerDelegateKt {
    public static /* synthetic */ kotlin.properties.ReadWriteProperty saved$default(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return savedNullable(savedStateRegistryOwner, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str, savedStateConfiguration, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'saved' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> saved(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return savedNullable(savedStateRegistryOwner, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str, savedStateConfiguration, function0);
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty savedNullable$default(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return savedNullable(savedStateRegistryOwner, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str, savedStateConfiguration, function0);
    }

    public static final /* synthetic */ <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> savedNullable(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return savedNullable(savedStateRegistryOwner, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str, savedStateConfiguration, function0);
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty saved$default(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, kotlinx.serialization.KSerializer kSerializer, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateRegistryOwner, kSerializer, str, savedStateConfiguration, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the new 'saved' overload that supports both nullable and non-nullable types.")
    public static final /* synthetic */ kotlin.properties.ReadWriteProperty saved(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, kotlinx.serialization.KSerializer kSerializer, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.view.serialization.SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), kSerializer, str, savedStateConfiguration, function0);
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty savedNullable$default(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, kotlinx.serialization.KSerializer kSerializer, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return savedNullable(savedStateRegistryOwner, kSerializer, str, savedStateConfiguration, function0);
    }

    public static final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> savedNullable(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, kotlinx.serialization.KSerializer<T> kSerializer, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new androidx.view.serialization.SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), kSerializer, str, savedStateConfiguration, function0);
    }
}
