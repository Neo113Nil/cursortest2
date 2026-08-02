package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\b\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0087\b¢\u0006\u0002\u0010\t\u001aU\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\r0\bH\u0087\b¢\u0006\u0002\u0010\u000e\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\r0\bH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"rememberSerializable", "T", "", "inputs", "", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/savedstate/serialization/SavedStateConfiguration;", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "([Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "stateSerializer", "([Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RememberSerializableKt {
    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final /* synthetic */ <T> T m5466rememberSerializable(java.lang.Object[] objArr, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        androidx.view.serialization.SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration2.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) m5467rememberSerializable(copyOf, (kotlinx.serialization.KSerializer) kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), savedStateConfiguration2, (kotlin.jvm.functions.Function0) function0, composer, (i << 3) & 8064, 0);
    }

    /* renamed from: rememberSerializable, reason: collision with other method in class */
    public static final <T> T m5467rememberSerializable(java.lang.Object[] objArr, kotlinx.serialization.KSerializer<T> kSerializer, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1261607160, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t = (T) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(java.util.Arrays.copyOf(objArr, objArr.length), androidx.compose.runtime.saveable.serialization.SerializableSaverKt.serializableSaver(kSerializer, savedStateConfiguration), (java.lang.String) null, (kotlin.jvm.functions.Function0) function0, composer, (i & 7168) | 384, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final /* synthetic */ <T> androidx.compose.runtime.MutableState<T> rememberSerializable(java.lang.Object[] objArr, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends androidx.compose.runtime.MutableState<T>> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        androidx.view.serialization.SavedStateConfiguration savedStateConfiguration2 = savedStateConfiguration;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlinx.serialization.modules.SerializersModule serializersModule = savedStateConfiguration2.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return rememberSerializable(copyOf, (kotlinx.serialization.KSerializer) kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), savedStateConfiguration2, (kotlin.jvm.functions.Function0) function0, composer, (i << 3) & 8064, 0);
    }

    public static final <T> androidx.compose.runtime.MutableState<T> rememberSerializable(java.lang.Object[] objArr, kotlinx.serialization.KSerializer<T> kSerializer, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends androidx.compose.runtime.MutableState<T>> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1248826527, i, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:163)");
        }
        androidx.compose.runtime.MutableState<T> mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(java.util.Arrays.copyOf(objArr, objArr.length), androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver(androidx.compose.runtime.saveable.serialization.SerializableSaverKt.serializableSaver(kSerializer, savedStateConfiguration)), (java.lang.String) null, (kotlin.jvm.functions.Function0) function0, composer, (i & 7168) | 384, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
