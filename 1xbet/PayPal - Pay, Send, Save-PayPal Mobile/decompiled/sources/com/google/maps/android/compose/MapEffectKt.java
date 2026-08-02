package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aF\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\n\u001aP\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\f\u001aZ\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\u000e\u001aT\u0010\t\u001a\u00020\u00062\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u000f\"\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\u0011"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "MapEffect", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapEffectKt {
    public static final void MapEffect(final java.lang.Object obj, final kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-357282938);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-357282938, i2, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:22)");
            }
            androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
            boolean changedInstance = startRestartGroup.changedInstance(function3);
            boolean changedInstance2 = startRestartGroup.changedInstance(map);
            com.google.maps.android.compose.MapEffectKt$MapEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.google.maps.android.compose.MapEffectKt$MapEffect$1$1(function3, map, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(obj, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapEffectKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit MapEffect$lambda$1;
                    MapEffect$lambda$1 = com.google.maps.android.compose.MapEffectKt.MapEffect$lambda$1(obj, function3, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return MapEffect$lambda$1;
                }
            });
        }
    }

    public static final void MapEffect(final java.lang.Object obj, final java.lang.Object obj2, final kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-834763738);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-834763738, i2, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:42)");
            }
            androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
            boolean changedInstance = startRestartGroup.changedInstance(function3);
            boolean changedInstance2 = startRestartGroup.changedInstance(map);
            com.google.maps.android.compose.MapEffectKt$MapEffect$3$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.google.maps.android.compose.MapEffectKt$MapEffect$3$1(function3, map, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(obj, obj2, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i2 & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapEffectKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.Unit MapEffect$lambda$3;
                    MapEffect$lambda$3 = com.google.maps.android.compose.MapEffectKt.MapEffect$lambda$3(obj, obj2, function3, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    return MapEffect$lambda$3;
                }
            });
        }
    }

    public static final void MapEffect(final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, final kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-88380218);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(obj3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-88380218, i2, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:67)");
            }
            androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
            boolean changedInstance = startRestartGroup.changedInstance(function3);
            boolean changedInstance2 = startRestartGroup.changedInstance(map);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.google.maps.android.compose.MapEffectKt$MapEffect$5$1(function3, map, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(obj, obj2, obj3, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapEffectKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    kotlin.Unit MapEffect$lambda$5;
                    MapEffect$lambda$5 = com.google.maps.android.compose.MapEffectKt.MapEffect$lambda$5(obj, obj2, obj3, function3, i, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    return MapEffect$lambda$5;
                }
            });
        }
    }

    public static final void MapEffect(final java.lang.Object[] objArr, final kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-276920653);
        int i2 = (i & 48) == 0 ? (startRestartGroup.changedInstance(function3) ? 32 : 16) | i : i;
        startRestartGroup.startMovableGroup(167225444, java.lang.Integer.valueOf(objArr.length));
        int i3 = i2 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
        for (java.lang.Object obj : objArr) {
            i3 |= startRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-276920653, i3, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:90)");
            }
            androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            boolean changedInstance = startRestartGroup.changedInstance(function3);
            boolean changedInstance2 = startRestartGroup.changedInstance(map);
            com.google.maps.android.compose.MapEffectKt$MapEffect$7$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.google.maps.android.compose.MapEffectKt$MapEffect$7$1(function3, map, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(copyOf, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit MapEffect$lambda$7;
                    MapEffect$lambda$7 = com.google.maps.android.compose.MapEffectKt.MapEffect$lambda$7(objArr, function3, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return MapEffect$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapEffect$lambda$7(java.lang.Object[] objArr, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        MapEffect(objArr, (kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapEffect$lambda$5(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        MapEffect(obj, obj2, obj3, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapEffect$lambda$3(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        MapEffect(obj, obj2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapEffect$lambda$1(java.lang.Object obj, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        MapEffect(obj, (kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
