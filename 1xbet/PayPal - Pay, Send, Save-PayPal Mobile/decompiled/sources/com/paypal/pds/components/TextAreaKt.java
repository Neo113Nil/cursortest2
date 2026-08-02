package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0094\u0001\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0007\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010\u0007\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"TextArea", "", "onValueChange", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "modifier", "Landroidx/compose/ui/Modifier;", "textLimit", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "label", "enabled", "", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "maxLines", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;IILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "TextAreaPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextAreaWithPreFilledValuePreview", "TextAreaWithHelperTextPreview", "TextAreaWithErrorStatePreview", "TextAreaWithoutTextLimitPreview", "pds_release", "isErrorState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TextAreaKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextArea(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.lang.Integer num, java.lang.String str, java.lang.String str2, boolean z, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, int i, int i2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String str3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.lang.Integer num2;
        final java.lang.String str4;
        final boolean z2;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        final int i14;
        final int i15;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        final java.lang.String str5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1163223319);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= startRestartGroup.changed(num) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(str) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        str3 = str2;
                        i5 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(list) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i5 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            num2 = num;
                            str4 = str;
                            z2 = z;
                            list2 = list;
                            i14 = i;
                            i15 = i2;
                            mutableInteractionSource2 = mutableInteractionSource;
                            str5 = str3;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            final java.lang.Integer num3 = i6 != 0 ? null : num;
                            final java.lang.String str6 = i7 != 0 ? "" : str;
                            java.lang.String str7 = i8 != 0 ? null : str3;
                            boolean z3 = i9 != 0 ? true : z;
                            final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i10 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                            int i17 = i11 != 0 ? 6 : i;
                            int i18 = i12 != 0 ? 2 : i2;
                            if (i13 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1163223319, i5, -1, "com.paypal.pds.components.TextArea (TextArea.kt:59)");
                            }
                            int i19 = i5 << 3;
                            int i20 = i5 >> 12;
                            java.lang.Integer num4 = num3;
                            java.lang.String str8 = str6;
                            java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3 = emptyList;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.TextInputKt.TextInput(str8, function1, modifier3, str7, null, null, z3, false, null, null, null, mutableInteractionSource3, false, i17, i18, null, null, list3, true, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1955722479, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.TextAreaKt.$r8$lambda$sMdJq8ddCsQLMQ1xqI57U8gk0Uc(num3, emptyList, str6, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), null, composer2, ((i5 >> 9) & 14) | (i19 & 112) | (i19 & 896) | ((i5 >> 3) & 7168) | (3670016 & i19), (i20 & 57344) | ((i5 >> 24) & 112) | 100663296 | (i20 & 7168) | (i19 & 29360128), 384, 12162992);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            str5 = str7;
                            z2 = z3;
                            i14 = i17;
                            i15 = i18;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            num2 = num4;
                            str4 = str8;
                            list2 = list3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.TextAreaKt.$r8$lambda$xajW1mheR7ToZD4Z5TpEhgryCE8(kotlin.jvm.functions.Function1.this, modifier2, num2, str4, str5, z2, list2, i14, i15, mutableInteractionSource2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                str3 = str2;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            str3 = str2;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        str3 = str2;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$57ESxvYt3QnmazILq84-E42ZbxY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22045$r8$lambda$57ESxvYt3QnmazILq84E42ZbxY(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-583501243);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-583501243, updateChangedFlags, -1, "com.paypal.pds.components.TextAreaWithPreFilledValuePreview (TextArea.kt:116)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.$r8$lambda$fsEKxX2rycnbekrBJBeoxiNzK0w((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            TextArea((kotlin.jvm.functions.Function1) rememberedValue, null, 100, "This is a pre-filled text in the TextArea component.", "Label", false, null, 6, 2, null, startRestartGroup, 113274246, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextAreaKt.m22045$r8$lambda$57ESxvYt3QnmazILq84E42ZbxY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KGGVvMb4jxXzKJYDtlmSXXvWvC8(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-667155294);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-667155294, updateChangedFlags, -1, "com.paypal.pds.components.TextAreaWithErrorStatePreview (TextArea.kt:146)");
            }
            com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.m22050$r8$lambda$yGBuMESpWAmok7mnZx6OjFhNg((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.m22048$r8$lambda$aCXvmAsYXUB7OY_EZ9cppPdtkE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            TextArea((kotlin.jvm.functions.Function1) rememberedValue2, null, 10, "This is a pre-filled text in the TextArea component.", "Label", false, listOf, 6, 2, null, startRestartGroup, 113274246, 546);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextAreaKt.$r8$lambda$KGGVvMb4jxXzKJYDtlmSXXvWvC8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OkWywjWF87bMsYGCKUCy4YEJ5nI(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$SSbYOBDF6Bw3g77fcQZZX-m8hjs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22046$r8$lambda$SSbYOBDF6Bw3g77fcQZZXm8hjs(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(693263353);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(693263353, updateChangedFlags, -1, "com.paypal.pds.components.TextAreaWithoutTextLimitPreview (TextArea.kt:172)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("This is a pre-filled text in the TextArea component.", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.$r8$lambda$ickXitLxV4hMjA8v1TgKrlI5_lc(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            composer2 = startRestartGroup;
            TextArea(function1, null, null, str, "Label", false, null, 6, 1, null, startRestartGroup, 113271174, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextAreaKt.m22046$r8$lambda$SSbYOBDF6Bw3g77fcQZZXm8hjs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y2ZfFf9nuZF4EWf2n-aJTNF4aM0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22047$r8$lambda$Y2ZfFf9nuZF4EWf2naJTNF4aM0(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1196963788);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1196963788, updateChangedFlags, -1, "com.paypal.pds.components.TextAreaWithHelperTextPreview (TextArea.kt:130)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.pds.components.textinput.ValidationAlert.HelpedText("Helper text"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.$r8$lambda$j6AHdsT4SGknAdTzMSIUacWRoaU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            TextArea((kotlin.jvm.functions.Function1) rememberedValue, null, 10, "", "Label", false, listOf, 6, 2, null, startRestartGroup, 113274246, 546);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextAreaKt.m22047$r8$lambda$Y2ZfFf9nuZF4EWf2naJTNF4aM0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aCXvmAsYXUB7OY_EZ9cppPdtk-E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22048$r8$lambda$aCXvmAsYXUB7OY_EZ9cppPdtkE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$cfvrefBNrxFH8sSNEA1DeIZf6v0(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-97895885);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-97895885, updateChangedFlags, -1, "com.paypal.pds.components.TextAreaPreview (TextArea.kt:102)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.$r8$lambda$OkWywjWF87bMsYGCKUCy4YEJ5nI(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            composer2 = startRestartGroup;
            TextArea(function1, null, 30, str, "label", false, null, 0, 2, null, startRestartGroup, 100688262, 738);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextAreaKt.$r8$lambda$cfvrefBNrxFH8sSNEA1DeIZf6v0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fsEKxX2rycnbekrBJBeoxiNzK0w(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h5keDki1lrdQ-nZbjA_497B9m8s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22049$r8$lambda$h5keDki1lrdQnZbjA_497B9m8s(java.lang.Integer num, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setAlpha(num == null ? 0.0f : 1.0f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ickXitLxV4hMjA8v1TgKrlI5_lc(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j6AHdsT4SGknAdTzMSIUacWRoaU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$rWoI8PyQ4m7leUJkDC0bOL0qQDo(java.util.List list, java.lang.String str) {
        java.util.List list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.paypal.pds.components.textinput.ValidationAlertData validate = ((com.paypal.pds.components.textinput.ValidationAlert) it.next()).validate(str);
            if (kotlin.jvm.internal.Intrinsics.areEqual(validate != null ? validate.getStyle() : null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sMdJq8ddCsQLMQ1xqI57U8gk0Uc(final java.lang.Integer num, final java.util.List list, final java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1955722479, i, -1, "com.paypal.pds.components.TextArea.<anonymous> (TextArea.kt:72)");
            }
            androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
            java.lang.String str2 = null;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            boolean changed = composer.changed(num);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.TextAreaKt.m22049$r8$lambda$h5keDki1lrdQnZbjA_497B9m8s(num, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(fillMaxWidth$default, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 6);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, graphicsLayer);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            boolean changed2 = composer.changed(list);
            boolean changed3 = composer.changed(str);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.TextAreaKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.pds.components.TextAreaKt.$r8$lambda$rWoI8PyQ4m7leUJkDC0bOL0qQDo(list, str));
                    }
                });
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.core.Color color = ((java.lang.Boolean) ((androidx.compose.runtime.State) rememberedValue2).getValue()).booleanValue() ? com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE : com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            if (num != null) {
                int intValue = num.intValue();
                int length = str.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(length);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(intValue);
                str2 = sb.toString();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2 == null ? "" : str2, null, color, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 0, 6, 1018);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xajW1mheR7ToZD4Z5TpEhgryCE8(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.lang.Integer num, java.lang.String str, java.lang.String str2, boolean z, java.util.List list, int i, int i2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        TextArea(function1, modifier, num, str, str2, z, list, i, i2, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yGBuMESpWAmo-k7mnZx6-OjFhNg, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m22050$r8$lambda$yGBuMESpWAmok7mnZx6OjFhNg(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 10) {
            return new com.paypal.pds.components.textinput.ValidationAlertData("Error: Character limit exceeded", com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
        }
        return null;
    }
}
