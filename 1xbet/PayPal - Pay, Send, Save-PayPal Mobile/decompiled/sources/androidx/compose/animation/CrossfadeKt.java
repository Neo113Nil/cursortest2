package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f2&\u0010\u000b\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "label", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(final T t, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, java.lang.String str, final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec2;
        int i5;
        java.lang.String str2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i3 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        androidx.compose.animation.core.TweenSpec tween$default = i4 != 0 ? androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec2;
                        java.lang.String str3 = i5 != 0 ? "Crossfade" : str2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        int i7 = i3 & 58352;
                        java.lang.String str4 = str3;
                        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), companion, tween$default, (kotlin.jvm.functions.Function1) null, function3, startRestartGroup, i7, 4);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str2 = str4;
                        finiteAnimationSpec3 = tween$default;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final java.lang.String str5 = str2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                            private void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer2) {
                                androidx.compose.animation.CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec3, str5, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                getHighSpeedVideoFpsRangesFor(composer2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(final java.lang.Object obj, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, final kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-160948176);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(obj) : startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(finiteAnimationSpec) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-160948176, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (java.lang.String) null, startRestartGroup, i3 & 14, 2), modifier, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) finiteAnimationSpec, (kotlin.jvm.functions.Function1) null, function3, startRestartGroup, (i3 & 1008) | ((i3 << 3) & 57344), 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$2
                private void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.animation.CrossfadeKt.Crossfade(obj, modifier2, finiteAnimationSpec2, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoSizes(composer2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(final androidx.compose.animation.core.Transition<T> transition, androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec2;
        int i4;
        kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.animation.core.Transition<T> transition2 = transition;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1877370462);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(transition2) ? 4 : 2) | i : i;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i5 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? 256 : 128;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i5 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        if (i6 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if (i3 != 0) {
                            finiteAnimationSpec2 = androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null);
                        }
                        if (i4 != 0) {
                            androidx.compose.animation.CrossfadeKt$Crossfade$3$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final T invoke(T t) {
                                        return t;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1877370462, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        java.lang.Object obj = rememberedValue2;
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                            mutableStateListOf.add(transition.getCurrentState());
                            startRestartGroup.updateRememberedValue(mutableStateListOf);
                            obj = mutableStateListOf;
                        }
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.collection.ScatterMapKt.mutableScatterMapOf();
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.collection.MutableScatterMap mutableScatterMap = (androidx.collection.MutableScatterMap) rememberedValue3;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            startRestartGroup.startReplaceGroup(316295552);
                        } else {
                            startRestartGroup.startReplaceGroup(321145192);
                            if (snapshotStateList.size() == 1 && kotlin.jvm.internal.Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState())) {
                                startRestartGroup.startReplaceGroup(316295552);
                            } else {
                                startRestartGroup.startReplaceGroup(321279546);
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = snapshotStateList;
                                boolean z = (i5 & 14) == 4;
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                        public final java.lang.Boolean invoke(T t) {
                                            return java.lang.Boolean.valueOf(!kotlin.jvm.internal.Intrinsics.areEqual(t, transition2.getTargetState()));
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                kotlin.collections.CollectionsKt.removeAll((java.util.List) snapshotStateList2, (kotlin.jvm.functions.Function1) rememberedValue4);
                                mutableScatterMap.clear();
                            }
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        if (mutableScatterMap.contains(transition.getTargetState())) {
                            startRestartGroup.startReplaceGroup(316295552);
                        } else {
                            startRestartGroup.startReplaceGroup(321536443);
                            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList;
                            java.util.Iterator<T> it = snapshotStateList3.iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i7 = -1;
                                    break;
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(function12.invoke(it.next()), function12.invoke(transition.getTargetState()))) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                snapshotStateList.add(transition.getTargetState());
                            } else {
                                snapshotStateList.set(i7, transition.getTargetState());
                            }
                            mutableScatterMap.clear();
                            int size = snapshotStateList3.size();
                            int i8 = 0;
                            while (i8 < size) {
                                T t = snapshotStateList3.get(i8);
                                mutableScatterMap.set(t, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-934471669, true, new androidx.compose.animation.CrossfadeKt$Crossfade$5$1(transition2, finiteAnimationSpec2, t, function3), startRestartGroup, 54));
                                i8++;
                                transition2 = transition;
                            }
                        }
                        startRestartGroup.endReplaceGroup();
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1312707512);
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = snapshotStateList;
                        int size2 = snapshotStateList4.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            T t2 = snapshotStateList4.get(i9);
                            startRestartGroup.startMovableGroup(1171574969, function12.invoke(t2));
                            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) mutableScatterMap.get(t2);
                            if (function2 == null) {
                                startRestartGroup.startReplaceGroup(1959122128);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1171576145);
                                function2.invoke(startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endMovableGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3 = finiteAnimationSpec2;
                    final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function13 = function12;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            private void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer2) {
                                androidx.compose.animation.CrossfadeKt.Crossfade(transition, modifier3, finiteAnimationSpec3, function13, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                getHighSpeedVideoSizes(composer2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                }
                final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec32 = finiteAnimationSpec2;
                final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function132 = function12;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            function12 = function1;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
            }
            final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec322 = finiteAnimationSpec2;
            final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1322 = function12;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec3222 = finiteAnimationSpec2;
        final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function13222 = function12;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
