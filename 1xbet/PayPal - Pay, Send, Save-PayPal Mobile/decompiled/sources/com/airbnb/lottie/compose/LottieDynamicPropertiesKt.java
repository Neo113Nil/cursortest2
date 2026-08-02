package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0015\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a^\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000b2'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0013\u001a>\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0015\"\u0004\b\u0000\u0010\u0007*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0002¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u00061\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000e\"\u0004\b\u0000\u0010\u0007X\u008a\u0084\u0002"}, d2 = {"rememberLottieDynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperty", "T", "property", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "keyPath", "", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", com.sun.jna.Callback.METHOD_NAME, "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "toValueCallback", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "lottie-compose_release", "callbackState"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieDynamicPropertiesKt {
    public static final com.airbnb.lottie.compose.LottieDynamicProperties rememberLottieDynamicProperties(com.airbnb.lottie.compose.LottieDynamicProperty<?>[] lottieDynamicPropertyArr, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lottieDynamicPropertyArr, "");
        composer.startReplaceableGroup(-395574495);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-395574495, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        int hashCode = java.util.Arrays.hashCode(lottieDynamicPropertyArr);
        composer.startReplaceableGroup(34468001);
        boolean changed = composer.changed(hashCode);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.compose.LottieDynamicProperties(kotlin.collections.ArraysKt.toList(lottieDynamicPropertyArr));
            composer.updateRememberedValue(rememberedValue);
        }
        com.airbnb.lottie.compose.LottieDynamicProperties lottieDynamicProperties = (com.airbnb.lottie.compose.LottieDynamicProperties) rememberedValue;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperties;
    }

    public static final <T> com.airbnb.lottie.compose.LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, T t2, java.lang.String[] strArr, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        composer.startReplaceableGroup(-1788530187);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1788530187, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        composer.startReplaceableGroup(1613443961);
        boolean changed = composer.changed(strArr);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.model.KeyPath((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
            composer.updateRememberedValue(rememberedValue);
        }
        com.airbnb.lottie.model.KeyPath keyPath = (com.airbnb.lottie.model.KeyPath) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1613444012);
        boolean changed2 = composer.changed(keyPath);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(t)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(t2)) && (i & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | z2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.airbnb.lottie.compose.LottieDynamicProperty(t, keyPath, t2);
            composer.updateRememberedValue(rememberedValue2);
        }
        com.airbnb.lottie.compose.LottieDynamicProperty<T> lottieDynamicProperty = (com.airbnb.lottie.compose.LottieDynamicProperty) rememberedValue2;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }

    public static final <T> com.airbnb.lottie.compose.LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, java.lang.String[] strArr, kotlin.jvm.functions.Function1<? super com.airbnb.lottie.value.LottieFrameInfo<T>, ? extends T> function1, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        composer.startReplaceableGroup(1331897370);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1331897370, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:69)");
        }
        int hashCode = java.util.Arrays.hashCode(strArr);
        composer.startReplaceableGroup(1613445061);
        boolean changed = composer.changed(hashCode);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.model.KeyPath((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
            composer.updateRememberedValue(rememberedValue);
        }
        com.airbnb.lottie.model.KeyPath keyPath = (com.airbnb.lottie.model.KeyPath) rememberedValue;
        composer.endReplaceableGroup();
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 6) & 14);
        composer.startReplaceableGroup(1613445186);
        boolean changed2 = composer.changed(keyPath);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(t)) || (i & 6) == 4;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.airbnb.lottie.compose.LottieDynamicProperty((java.lang.Object) t, keyPath, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.airbnb.lottie.value.LottieFrameInfo<T>, T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final T invoke(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lottieFrameInfo, "");
                    return (T) com.airbnb.lottie.compose.LottieDynamicPropertiesKt.access$rememberLottieDynamicProperty$lambda$4(rememberUpdatedState).invoke(lottieFrameInfo);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        com.airbnb.lottie.compose.LottieDynamicProperty<T> lottieDynamicProperty = (com.airbnb.lottie.compose.LottieDynamicProperty) rememberedValue2;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$rememberLottieDynamicProperty$lambda$4(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    public static final /* synthetic */ com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1 access$toValueCallback(final kotlin.jvm.functions.Function1 function1) {
        return new com.airbnb.lottie.value.LottieValueCallback<T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> frameInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
                return function1.invoke(frameInfo);
            }
        };
    }
}
