package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aR\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001f\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\f\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0010"}, d2 = {"", "MapClickListenerUpdater", "(Landroidx/compose/runtime/Composer;I)V", "", "L", "Lkotlin/Function0;", com.sun.jna.Callback.METHOD_NAME, "Lkotlin/Function2;", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/ExtensionFunctionType;", "setter", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "MapClickListenerComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "Lcom/google/maps/android/compose/MapClickListenerNode;", "factory", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapClickListenersKt {
    public static final void MapClickListenerUpdater(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1792062778);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1792062778, i, -1, "com.google.maps.android.compose.MapClickListenerUpdater (MapClickListeners.kt:88)");
            }
            androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            final com.google.maps.android.compose.MapClickListeners mapClickListeners = ((com.google.maps.android.compose.MapApplier) applier).getMapClickListeners();
            startRestartGroup.startReplaceGroup(-109547171);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getIndoorStateChangeListener();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setIndoorStateChangeListener((com.google.maps.android.compose.IndoorStateChangeListener) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl2 = mutablePropertyReference0Impl;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl2, (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue), new com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2
                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public final void onIndoorBuildingFocused() {
                    mutablePropertyReference0Impl.invoke().onIndoorBuildingFocused();
                }

                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public final void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding building) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(building, "");
                    mutablePropertyReference0Impl.invoke().onIndoorLevelActivated(building);
                }
            }, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109530250);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl3 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$3
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnMapClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnMapClick((kotlin.jvm.functions.Function1) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl4 = mutablePropertyReference0Impl3;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$4$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$4$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue2);
            boolean changedInstance = startRestartGroup.changedInstance(mutablePropertyReference0Impl3);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.google.android.gms.maps.GoogleMap.OnMapClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                    public final void onMapClick(com.google.android.gms.maps.model.LatLng latLng) {
                        com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$1$1$0(kotlin.reflect.KMutableProperty0.this, latLng);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl4, function2, (com.google.android.gms.maps.GoogleMap.OnMapClickListener) rememberedValue3, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109522338);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl5 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$5
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnMapLongClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnMapLongClick((kotlin.jvm.functions.Function1) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl6 = mutablePropertyReference0Impl5;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$6$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$6$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue4);
            boolean changedInstance2 = startRestartGroup.changedInstance(mutablePropertyReference0Impl5);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.google.android.gms.maps.GoogleMap.OnMapLongClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda2
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
                    public final void onMapLongClick(com.google.android.gms.maps.model.LatLng latLng) {
                        com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$2$1$0(kotlin.reflect.KMutableProperty0.this, latLng);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl6, function22, (com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) rememberedValue5, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109514282);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl7 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$7
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnMapLoaded();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnMapLoaded((kotlin.jvm.functions.Function0) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl8 = mutablePropertyReference0Impl7;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$8$1$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$8$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue6);
            boolean changedInstance3 = startRestartGroup.changedInstance(mutablePropertyReference0Impl7);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                    public final void onMapLoaded() {
                        com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$3$1$0(kotlin.reflect.KMutableProperty0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl8, function23, (com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) rememberedValue7, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109506057);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl9 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$9
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnMyLocationButtonClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnMyLocationButtonClick((kotlin.jvm.functions.Function0) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl10 = mutablePropertyReference0Impl9;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$10$1$1 rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$10$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue8);
            boolean changedInstance4 = startRestartGroup.changedInstance(mutablePropertyReference0Impl9);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda4
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                    public final boolean onMyLocationButtonClick() {
                        boolean MapClickListenerUpdater$lambda$0$4$1$0;
                        MapClickListenerUpdater$lambda$0$4$1$0 = com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$4$1$0(kotlin.reflect.KMutableProperty0.this);
                        return MapClickListenerUpdater$lambda$0$4$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl10, function24, (com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) rememberedValue9, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109497020);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl11 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$11
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnMyLocationClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnMyLocationClick((kotlin.jvm.functions.Function1) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl12 = mutablePropertyReference0Impl11;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$12$1$1 rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$12$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue10);
            boolean changedInstance5 = startRestartGroup.changedInstance(mutablePropertyReference0Impl11);
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda5
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                    public final void onMyLocationClick(android.location.Location location) {
                        com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$5$1$0(kotlin.reflect.KMutableProperty0.this, location);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl12, function25, (com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) rememberedValue11, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-109488810);
            final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl13 = new kotlin.jvm.internal.MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$13
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((com.google.maps.android.compose.MapClickListeners) this.receiver).getOnPOIClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
                    ((com.google.maps.android.compose.MapClickListeners) this.receiver).setOnPOIClick((kotlin.jvm.functions.Function1) obj);
                }
            };
            kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl14 = mutablePropertyReference0Impl13;
            com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$14$1$1 rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$14$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            kotlin.jvm.functions.Function2 function26 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue12);
            boolean changedInstance6 = startRestartGroup.changedInstance(mutablePropertyReference0Impl13);
            java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new com.google.android.gms.maps.GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda6
                    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                    public final void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
                        com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$0$6$1$0(kotlin.reflect.KMutableProperty0.this, pointOfInterest);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            MapClickListenerComposeNode(mutablePropertyReference0Impl14, function26, (com.google.android.gms.maps.GoogleMap.OnPoiClickListener) rememberedValue13, startRestartGroup, 48);
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit MapClickListenerUpdater$lambda$1;
                    MapClickListenerUpdater$lambda$1 = com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater$lambda$1(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return MapClickListenerUpdater$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$0$1$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0, com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$0$2$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0, com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$0$3$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0) {
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) kMutableProperty0.invoke();
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapClickListenerUpdater$lambda$0$4$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0) {
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) kMutableProperty0.invoke();
        if (function0 != null) {
            return ((java.lang.Boolean) function0.invoke()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$0$5$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0, android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$0$6$1$0(kotlin.reflect.KMutableProperty0 kMutableProperty0, com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointOfInterest, "");
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kMutableProperty0.invoke();
        if (function1 != null) {
            function1.invoke(pointOfInterest);
        }
    }

    private static final <L> void MapClickListenerComposeNode(kotlin.jvm.functions.Function0<? extends java.lang.Object> function0, final kotlin.jvm.functions.Function2<? super com.google.android.gms.maps.GoogleMap, ? super L, kotlin.Unit> function2, final L l, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-649632125, i, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:176)");
        }
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
        final com.google.maps.android.compose.MapApplier mapApplier = (com.google.maps.android.compose.MapApplier) applier;
        boolean changedInstance = composer.changedInstance(mapApplier);
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(function2)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changedInstance(l)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.google.maps.android.compose.MapClickListenerNode MapClickListenerComposeNode$lambda$0$0;
                    MapClickListenerComposeNode$lambda$0$0 = com.google.maps.android.compose.MapClickListenersKt.MapClickListenerComposeNode$lambda$0$0(com.google.maps.android.compose.MapApplier.this, function2, l);
                    return MapClickListenerComposeNode$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        MapClickListenerComposeNode(function0, (kotlin.jvm.functions.Function0) rememberedValue, composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MapClickListenerNode MapClickListenerComposeNode$lambda$0$0(com.google.maps.android.compose.MapApplier mapApplier, kotlin.jvm.functions.Function2 function2, java.lang.Object obj) {
        return new com.google.maps.android.compose.MapClickListenerNode(mapApplier.getMap(), function2, obj);
    }

    private static final void MapClickListenerComposeNode(final kotlin.jvm.functions.Function0<? extends java.lang.Object> function0, final kotlin.jvm.functions.Function0<? extends com.google.maps.android.compose.MapClickListenerNode<?>> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1042600347);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1042600347, i2, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:187)");
            }
            if (function0.invoke() == null) {
                startRestartGroup.startReplaceGroup(1097220765);
            } else {
                startRestartGroup.startReplaceGroup(-1211533631);
                if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(function02);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                startRestartGroup.endNode();
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit MapClickListenerComposeNode$lambda$2;
                    MapClickListenerComposeNode$lambda$2 = com.google.maps.android.compose.MapClickListenersKt.MapClickListenerComposeNode$lambda$2(kotlin.jvm.functions.Function0.this, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return MapClickListenerComposeNode$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapClickListenerUpdater$lambda$1(int i, androidx.compose.runtime.Composer composer, int i2) {
        MapClickListenerUpdater(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MapClickListenerComposeNode$lambda$2(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        MapClickListenerComposeNode(function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
