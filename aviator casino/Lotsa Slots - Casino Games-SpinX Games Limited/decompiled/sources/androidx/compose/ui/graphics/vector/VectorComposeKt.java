package androidx.compose.ui.graphics.vector;

/* compiled from: VectorCompose.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a¦\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f8;
        int i5;
        float f9;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> emptyPath;
        final float f15;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-213417674);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f8 = f2;
                i3 |= startRestartGroup.changed(f8) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    f9 = f3;
                    i3 |= startRestartGroup.changed(f9) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(f5) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f7) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        i11 = (1879048192 & i) == 0 ? startRestartGroup.changedInstance(function2) ? 536870912 : 268435456 : 805306368;
                        if (i10 == 256 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                str2 = i12 != 0 ? "" : str;
                                f10 = i13 != 0 ? 0.0f : f;
                                if (i4 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i5 != 0) {
                                    f9 = 0.0f;
                                }
                                f11 = i6 != 0 ? 1.0f : f4;
                                f12 = i7 == 0 ? f5 : 1.0f;
                                f13 = i8 != 0 ? 0.0f : f6;
                                f14 = i9 == 0 ? f7 : 0.0f;
                                if (i10 != 0) {
                                    emptyPath = androidx.compose.ui.graphics.vector.VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                    }
                                    androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$1 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                                            return new androidx.compose.ui.graphics.vector.GroupComponent();
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-548224868);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(vectorComposeKt$Group$1);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str3) {
                                            invoke2(groupComponent, str3);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str3) {
                                            groupComponent.setName(str3);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setRotation(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setPivotX(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setPivotY(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setScaleX(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setScaleY(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setTranslationX(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                            groupComponent.setTranslationY(f20);
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                                            invoke2(groupComponent, list3);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                                            groupComponent.setClipPathData(list3);
                                        }
                                    });
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    f15 = f14;
                                    f16 = f12;
                                    f17 = f8;
                                    f18 = f9;
                                    f19 = f13;
                                    list2 = emptyPath;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i10 != 0) {
                                    i3 &= -234881025;
                                }
                                str2 = str;
                                f10 = f;
                                f11 = f4;
                                f12 = f5;
                                f13 = f6;
                                f14 = f7;
                            }
                            emptyPath = list;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$12 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                                    return new androidx.compose.ui.graphics.vector.GroupComponent();
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-548224868);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
                            }
                            startRestartGroup.startNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str3) {
                                    invoke2(groupComponent, str3);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str3) {
                                    groupComponent.setName(str3);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setRotation(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setPivotX(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setPivotY(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setScaleX(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setScaleY(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setTranslationX(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f20) {
                                    groupComponent.setTranslationY(f20);
                                }
                            });
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            f15 = f14;
                            f16 = f12;
                            f17 = f8;
                            f18 = f9;
                            f19 = f13;
                            list2 = emptyPath;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f10 = f;
                            f11 = f4;
                            f16 = f5;
                            f19 = f6;
                            f15 = f7;
                            f17 = f8;
                            f18 = f9;
                            list2 = list;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final java.lang.String str3 = str2;
                            final float f20 = f10;
                            final float f21 = f11;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                                    androidx.compose.ui.graphics.vector.VectorComposeKt.Group(str3, f20, f17, f18, f21, f16, f19, f15, list2, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if (i10 == 256) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    emptyPath = list;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$122 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                            return new androidx.compose.ui.graphics.vector.GroupComponent();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-548224868);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
                    }
                    startRestartGroup.startNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m1641constructorimpl22 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                            invoke2(groupComponent, str32);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                            groupComponent.setName(str32);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setRotation(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setPivotX(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setPivotY(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setScaleX(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setScaleY(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setTranslationX(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                            invoke(groupComponent, f202.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                            groupComponent.setTranslationY(f202);
                        }
                    });
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f9 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i11;
                if (i10 == 256) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                emptyPath = list;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$1222 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                        return new androidx.compose.ui.graphics.vector.GroupComponent();
                    }
                };
                startRestartGroup.startReplaceableGroup(-548224868);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
                }
                startRestartGroup.startNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m1641constructorimpl222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                        invoke2(groupComponent, str32);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                        groupComponent.setName(str32);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setRotation(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setPivotX(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setPivotY(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setScaleX(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setScaleY(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setTranslationX(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                        invoke(groupComponent, f202.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                        groupComponent.setTranslationY(f202);
                    }
                });
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f8 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f9 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i11;
            if (i10 == 256) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            emptyPath = list;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$12222 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                    return new androidx.compose.ui.graphics.vector.GroupComponent();
                }
            };
            startRestartGroup.startReplaceableGroup(-548224868);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
            }
            startRestartGroup.startNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m1641constructorimpl2222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                    invoke2(groupComponent, str32);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                    groupComponent.setName(str32);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setRotation(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setPivotX(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setPivotY(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setScaleX(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setScaleY(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setTranslationX(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                    invoke(groupComponent, f202.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                    groupComponent.setTranslationY(f202);
                }
            });
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                    groupComponent.setClipPathData(list3);
                }
            });
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            f15 = f14;
            f16 = f12;
            f17 = f8;
            f18 = f9;
            f19 = f13;
            list2 = emptyPath;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f8 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f9 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i11;
        if (i10 == 256) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        emptyPath = list;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 vectorComposeKt$Group$122222 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.graphics.vector.GroupComponent invoke() {
                return new androidx.compose.ui.graphics.vector.GroupComponent();
            }
        };
        startRestartGroup.startReplaceableGroup(-548224868);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
        }
        startRestartGroup.startNode();
        if (!startRestartGroup.getInserting()) {
        }
        androidx.compose.runtime.Composer m1641constructorimpl22222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                invoke2(groupComponent, str32);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.String str32) {
                groupComponent.setName(str32);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setRotation(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setPivotX(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setPivotY(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setScaleX(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setScaleY(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setTranslationX(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.lang.Float f202) {
                invoke(groupComponent, f202.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, float f202) {
                groupComponent.setTranslationY(f202);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, emptyPath, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.GroupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                invoke2(groupComponent, list3);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.GroupComponent groupComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list3) {
                groupComponent.setClipPathData(list3);
            }
        });
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
        function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 27) & 14));
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        f15 = f14;
        f16 = f12;
        f17 = f8;
        f18 = f9;
        f19 = f13;
        list2 = emptyPath;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m2772Path9cdaXJ4(final java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list, int i, java.lang.String str, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, androidx.compose.runtime.Composer composer, final int i4, final int i5, final int i6) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5068L876:VectorCompose.kt#huu6hf");
        final int defaultFillType = (i6 & 2) != 0 ? androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType() : i;
        final java.lang.String str2 = (i6 & 4) != 0 ? "" : str;
        final androidx.compose.ui.graphics.Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        androidx.compose.ui.graphics.Brush brush4 = (i6 & 32) != 0 ? null : brush2;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & 256) != 0 ? androidx.compose.ui.graphics.vector.VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & 512) != 0 ? androidx.compose.ui.graphics.vector.VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1478270750, i4, i5, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
        }
        final androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.graphics.vector.PathComponent invoke() {
                return new androidx.compose.ui.graphics.vector.PathComponent();
            }
        };
        startRestartGroup.startReplaceableGroup(1886828752);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.graphics.vector.VectorApplier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.vector.PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.ui.graphics.vector.PathComponent invoke() {
                    return kotlin.jvm.functions.Function0.this.invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, str2, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.String, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.String str3) {
                invoke2(pathComponent, str3);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.String str3) {
                pathComponent.setName(str3);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, list, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode>, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list2) {
                invoke2(pathComponent, list2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list2) {
                pathComponent.setPathData(list2);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, androidx.compose.ui.graphics.PathFillType.m2397boximpl(defaultFillType), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, androidx.compose.ui.graphics.PathFillType, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.PathFillType pathFillType) {
                m2774invokepweu1eQ(pathComponent, pathFillType.getValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m2774invokepweu1eQ(androidx.compose.ui.graphics.vector.PathComponent pathComponent, int i7) {
                pathComponent.m2766setPathFillTypeoQ8Xj4U(i7);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, brush3, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, androidx.compose.ui.graphics.Brush, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.Brush brush5) {
                invoke2(pathComponent, brush5);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.Brush brush5) {
                pathComponent.setFill(brush5);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f8), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setFillAlpha(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, brush4, new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, androidx.compose.ui.graphics.Brush, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.Brush brush5) {
                invoke2(pathComponent, brush5);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.Brush brush5) {
                pathComponent.setStroke(brush5);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f9), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setStrokeAlpha(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f10), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineWidth(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, androidx.compose.ui.graphics.StrokeJoin.m2477boximpl(defaultStrokeLineJoin), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, androidx.compose.ui.graphics.StrokeJoin, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.StrokeJoin strokeJoin) {
                m2775invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m2775invokekLtJ_vA(androidx.compose.ui.graphics.vector.PathComponent pathComponent, int i7) {
                pathComponent.m2768setStrokeLineJoinWw9F2mQ(i7);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, androidx.compose.ui.graphics.StrokeCap.m2467boximpl(defaultStrokeLineCap), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, androidx.compose.ui.graphics.StrokeCap, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, androidx.compose.ui.graphics.StrokeCap strokeCap) {
                m2773invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m2773invokeCSYIeUk(androidx.compose.ui.graphics.vector.PathComponent pathComponent, int i7) {
                pathComponent.m2767setStrokeLineCapBeK7IIE(i7);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f11), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineMiter(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f12), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathStart(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f13), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathEnd(f15);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, java.lang.Float.valueOf(f14), new kotlin.jvm.functions.Function2<androidx.compose.ui.graphics.vector.PathComponent, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, java.lang.Float f15) {
                invoke(pathComponent, f15.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.graphics.vector.PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathOffset(f15);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f15 = f8;
            final androidx.compose.ui.graphics.Brush brush5 = brush4;
            final float f16 = f9;
            final float f17 = f10;
            final int i7 = defaultStrokeLineCap;
            final int i8 = defaultStrokeLineJoin;
            final float f18 = f11;
            final float f19 = f12;
            final float f20 = f13;
            final float f21 = f14;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                    androidx.compose.ui.graphics.vector.VectorComposeKt.m2772Path9cdaXJ4(list, defaultFillType, str2, brush3, f15, brush5, f16, f17, i7, i8, f18, f19, f20, f21, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }
}
