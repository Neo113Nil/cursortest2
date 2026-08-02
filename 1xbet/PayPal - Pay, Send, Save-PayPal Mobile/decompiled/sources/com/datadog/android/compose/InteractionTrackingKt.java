package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"TrackInteractionEffect", "", "targetName", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionType", "Lcom/datadog/android/compose/InteractionType;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "(Ljava/lang/String;Landroidx/compose/foundation/interaction/InteractionSource;Lcom/datadog/android/compose/InteractionType;Ljava/util/Map;Lcom/datadog/android/api/SdkCore;Landroidx/compose/runtime/Composer;II)V", "trackClick", "Lkotlin/Function0;", "onClick", "(Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/api/SdkCore;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dd-sdk-android-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InteractionTrackingKt {
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> trackClick(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.api.SdkCore sdkCore, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        composer.startReplaceableGroup(-1445852688);
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(337025432);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = kotlin.collections.MapsKt.emptyMap();
                composer.updateRememberedValue(rememberedValue);
            }
            map = (java.util.Map) rememberedValue;
            composer.endReplaceableGroup();
        }
        boolean z = true;
        if ((i2 & 4) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1445852688, i, -1, "com.datadog.android.compose.trackClick (InteractionTracking.kt:41)");
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 9) & 14);
        composer.startReplaceableGroup(337031429);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(str)) && (i & 6) != 4) {
            z = false;
        }
        boolean changed = composer.changed(map);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.datadog.android.compose.internal.TapActionTracker(str, map, rememberUpdatedState, com.datadog.android.rum.GlobalRumMonitor.get(sdkCore));
            composer.updateRememberedValue(rememberedValue2);
        }
        com.datadog.android.compose.internal.TapActionTracker tapActionTracker = (com.datadog.android.compose.internal.TapActionTracker) rememberedValue2;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tapActionTracker;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TrackInteractionEffect(final java.lang.String str, final androidx.compose.foundation.interaction.InteractionSource interactionSource, final com.datadog.android.compose.InteractionType interactionType, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.api.SdkCore sdkCore, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        com.datadog.android.api.SdkCore sdkCore2;
        int i4;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map3;
        com.datadog.android.api.SdkCore instance$default;
        boolean z;
        boolean changedInstance;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean changed;
        boolean changedInstance2;
        com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1 rememberedValue;
        boolean z5;
        int i5;
        final java.util.Map<java.lang.String, ? extends java.lang.Object> map4;
        final com.datadog.android.api.SdkCore sdkCore3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1415344678);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionType) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            map2 = map;
            i3 |= startRestartGroup.changedInstance(map2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    sdkCore2 = sdkCore;
                    if (startRestartGroup.changedInstance(sdkCore2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    sdkCore2 = sdkCore;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                sdkCore2 = sdkCore;
            }
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap = i7 == 0 ? kotlin.collections.MapsKt.emptyMap() : map2;
                    if ((i2 & 16) == 0) {
                        i4 = i3 & (-57345);
                        map3 = emptyMap;
                        instance$default = com.datadog.android.Datadog.getInstance$default(null, 1, null);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1415344678, i4, -1, "com.datadog.android.compose.TrackInteractionEffect (InteractionTracking.kt:70)");
                        }
                        z = startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) != androidx.compose.ui.unit.LayoutDirection.Rtl;
                        startRestartGroup.startReplaceableGroup(597522539);
                        changedInstance = startRestartGroup.changedInstance(instance$default);
                        z2 = (i4 & 896) != 256;
                        z3 = (i4 & 14) != 4;
                        z4 = (i4 & 112) == 32;
                        changed = startRestartGroup.changed(z);
                        changedInstance2 = startRestartGroup.changedInstance(map3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if ((!(changedInstance | z2 | z3 | z4 | changed) && !changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            z5 = z;
                            i5 = i4;
                            rememberedValue = new com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1(instance$default, interactionType, str, interactionSource, z, map3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        } else {
                            z5 = z;
                            i5 = i4;
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, interactionType, java.lang.Boolean.valueOf(z5), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i5 >> 3) & 126);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        map4 = map3;
                        sdkCore3 = instance$default;
                    } else {
                        map2 = emptyMap;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                map3 = map2;
                instance$default = sdkCore2;
                i4 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) != androidx.compose.ui.unit.LayoutDirection.Rtl) {
                }
                startRestartGroup.startReplaceableGroup(597522539);
                changedInstance = startRestartGroup.changedInstance(instance$default);
                if ((i4 & 896) != 256) {
                }
                if ((i4 & 14) != 4) {
                }
                if ((i4 & 112) == 32) {
                }
                changed = startRestartGroup.changed(z);
                changedInstance2 = startRestartGroup.changedInstance(map3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2 | z3 | z4 | changed | changedInstance2)) {
                }
                z5 = z;
                i5 = i4;
                rememberedValue = new com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1(instance$default, interactionType, str, interactionSource, z, map3, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, interactionType, java.lang.Boolean.valueOf(z5), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, (i5 >> 3) & 126);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                map4 = map3;
                sdkCore3 = instance$default;
            } else {
                startRestartGroup.skipToGroupEnd();
                map4 = map2;
                sdkCore3 = sdkCore2;
            }
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        com.datadog.android.compose.InteractionTrackingKt.TrackInteractionEffect(str, interactionSource, interactionType, map4, sdkCore3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                });
                return;
            }
            return;
        }
        map2 = map;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
    }
}
