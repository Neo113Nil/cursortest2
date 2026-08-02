package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001ac\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"ShimmerAsyncAvatar", "", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/AvatarSize;", "url", "", "onClick", "Lkotlin/Function0;", "fallbackSource", "Lcom/paypal/pds/components/AvatarSource;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/AvatarSource;Landroidx/compose/runtime/Composer;II)V", "AsyncAvatar", "onState", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/AvatarSource;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AsyncAvatarKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShimmerAsyncAvatar(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.pds.components.AvatarSource avatarSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i5;
        com.paypal.pds.components.AvatarSource avatarSource2;
        com.paypal.pds.components.AvatarSize avatarSize2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.pds.components.AvatarSource avatarSource3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        int i6;
        java.lang.String str3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        com.paypal.pds.components.AvatarSource avatarSource4;
        java.lang.Object rememberedValue;
        int i7;
        com.paypal.pds.components.AvatarSize.Medium medium = avatarSize;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-761202263);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(medium) : startRestartGroup.changedInstance(medium)) {
                    i7 = 32;
                    i3 |= i7;
                }
            }
            i7 = 16;
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    avatarSource2 = avatarSource;
                    i3 |= startRestartGroup.changed(avatarSource2) ? 16384 : 8192;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            companion = modifier2;
                        } else {
                            companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                medium = com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
                                i3 &= -113;
                            }
                            if (i9 != 0) {
                                str2 = null;
                            }
                            if (i4 != 0) {
                                function02 = null;
                            }
                            if (i5 != 0) {
                                i6 = i3;
                                str3 = str2;
                                function04 = function02;
                                avatarSource4 = null;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-761202263, i6, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.ShimmerAsyncAvatar (AsyncAvatar.kt:38)");
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                                final com.paypal.pds.components.AvatarSize avatarSize3 = medium;
                                final java.lang.String str4 = str3;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                                com.paypal.pds.components.AvatarSize avatarSize4 = medium;
                                final com.paypal.pds.components.AvatarSource avatarSource5 = avatarSource4;
                                com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1444454428, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.$r8$lambda$7kYYrN0ZrYmwXUtkWr1NTi3iqtc(com.paypal.pds.components.AvatarSize.this, str4, function05, avatarSource5, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i6 << 6) & 896) | 3078, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                str2 = str3;
                                function03 = function04;
                                avatarSource3 = avatarSource4;
                                avatarSize2 = avatarSize4;
                            }
                        }
                        str3 = str2;
                        function04 = function02;
                        avatarSource4 = avatarSource2;
                        i6 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                        final com.paypal.pds.components.AvatarSize avatarSize32 = medium;
                        final java.lang.String str42 = str3;
                        final kotlin.jvm.functions.Function0 function052 = function04;
                        com.paypal.pds.components.AvatarSize avatarSize42 = medium;
                        final com.paypal.pds.components.AvatarSource avatarSource52 = avatarSource4;
                        com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1444454428, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.$r8$lambda$7kYYrN0ZrYmwXUtkWr1NTi3iqtc(com.paypal.pds.components.AvatarSize.this, str42, function052, avatarSource52, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i6 << 6) & 896) | 3078, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        str2 = str3;
                        function03 = function04;
                        avatarSource3 = avatarSource4;
                        avatarSize2 = avatarSize42;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        avatarSize2 = medium;
                        modifier3 = modifier2;
                        function03 = function02;
                        avatarSource3 = avatarSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final com.paypal.pds.components.AvatarSize avatarSize5 = avatarSize2;
                        final java.lang.String str5 = str2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.m15493$r8$lambda$VC3IqhmTYxcQohREbFkEVlLVUU(androidx.compose.ui.Modifier.this, avatarSize5, str5, function03, avatarSource3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                avatarSource2 = avatarSource;
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            avatarSource2 = avatarSource;
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        avatarSource2 = avatarSource;
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AsyncAvatar(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.commonui.components.AsyncImagePainter.State, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.pds.components.AvatarSource avatarSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.commonui.components.AsyncImagePainter.State, kotlin.Unit> function12;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i6;
        com.paypal.pds.components.AvatarSource avatarSource2;
        java.lang.String str2;
        com.paypal.pds.components.AvatarSize avatarSize2;
        final com.paypal.pds.components.AvatarSource avatarSource3;
        final androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.commonui.components.AsyncImagePainter.State, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str3;
        int i7;
        boolean changed;
        java.lang.Object rememberedValue;
        com.paypal.pds.components.AvatarSource.Image image;
        com.paypal.pds.components.AvatarSource avatarSource4;
        int i8;
        com.paypal.pds.components.AvatarSize.Medium medium = avatarSize;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-485050575);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(medium) : startRestartGroup.changedInstance(medium)) {
                    i8 = 32;
                    i3 |= i8;
                }
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        avatarSource2 = avatarSource;
                    } else {
                        avatarSource2 = avatarSource;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(avatarSource2) ? 131072 : 65536;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            str3 = str;
                            companion = modifier2;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                medium = com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
                                i3 &= -113;
                            }
                            str3 = i10 != 0 ? null : str;
                            if (i4 != 0) {
                                function12 = null;
                            }
                            if (i5 != 0) {
                                function02 = null;
                            }
                            if (i6 != 0) {
                                i7 = i3;
                                function13 = function12;
                                function03 = function02;
                                avatarSource3 = null;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-485050575, i7, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatar (AsyncAvatar.kt:72)");
                                }
                                str2 = str3;
                                int i11 = i7;
                                com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str3).build(), null, null, function13, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 7168), 22);
                                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, startRestartGroup, 0, 1);
                                changed = startRestartGroup.changed((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState.getValue());
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = java.lang.Boolean.valueOf(collectAsState.getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                if (((java.lang.Boolean) rememberedValue).booleanValue()) {
                                    image = new com.paypal.pds.components.AvatarSource.Image(rememberAsyncImagePainter, null, 2, null);
                                } else if (avatarSource3 == null) {
                                    image = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
                                } else {
                                    avatarSource4 = avatarSource3;
                                    int i12 = i11 << 3;
                                    com.paypal.pds.components.AvatarKt.Avatar(avatarSource4, companion, medium, null, null, function03, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | (i12 & 112) | (i12 & 896) | (i12 & 458752), 24);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    avatarSize2 = medium;
                                }
                                avatarSource4 = image;
                                int i122 = i11 << 3;
                                com.paypal.pds.components.AvatarKt.Avatar(avatarSource4, companion, medium, null, null, function03, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | (i122 & 112) | (i122 & 896) | (i122 & 458752), 24);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                avatarSize2 = medium;
                            }
                        }
                        i7 = i3;
                        function03 = function02;
                        avatarSource3 = avatarSource2;
                        function13 = function12;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        str2 = str3;
                        int i112 = i7;
                        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter2 = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str3).build(), null, null, function13, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 7168), 22);
                        androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter2.getState(), null, startRestartGroup, 0, 1);
                        changed = startRestartGroup.changed((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState2.getValue());
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = java.lang.Boolean.valueOf(collectAsState2.getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        if (((java.lang.Boolean) rememberedValue).booleanValue()) {
                        }
                        avatarSource4 = image;
                        int i1222 = i112 << 3;
                        com.paypal.pds.components.AvatarKt.Avatar(avatarSource4, companion, medium, null, null, function03, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | (i1222 & 112) | (i1222 & 896) | (i1222 & 458752), 24);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        avatarSize2 = medium;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        str2 = str;
                        avatarSize2 = medium;
                        avatarSource3 = avatarSource2;
                        companion = modifier2;
                        function13 = function12;
                        function03 = function02;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final com.paypal.pds.components.AvatarSize avatarSize3 = avatarSize2;
                        final java.lang.String str4 = str2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.$r8$lambda$W9RJouTYrI5eohg3_PYYMzEs1Hs(androidx.compose.ui.Modifier.this, avatarSize3, str4, function13, function03, avatarSource3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7kYYrN0ZrYmwXUtkWr1NTi3iqtc(com.paypal.pds.components.AvatarSize avatarSize, java.lang.String str, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.AvatarSource avatarSource, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1444454428, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.ShimmerAsyncAvatar.<anonymous> (AsyncAvatar.kt:45)");
            }
            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.m15494$r8$lambda$bSedr_zXTQPK6QNVvMsOLbSvMw(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            AsyncAvatar(wrapContentSize$default, avatarSize, str, (kotlin.jvm.functions.Function1) rememberedValue, function0, avatarSource, composer, (com.paypal.pds.components.AvatarSize.$stable << 3) | 3078, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VC3IqhmTYxcQoh-REbFkEVlLVUU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15493$r8$lambda$VC3IqhmTYxcQohREbFkEVlLVUU(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, java.lang.String str, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.AvatarSource avatarSource, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShimmerAsyncAvatar(modifier, avatarSize, str, function0, avatarSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W9RJouTYrI5eohg3_PYYMzEs1Hs(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.AvatarSource avatarSource, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AsyncAvatar(modifier, avatarSize, str, function1, function0, avatarSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bSedr_zXTQP-K6QNVvMsOLbSvMw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15494$r8$lambda$bSedr_zXTQPK6QNVvMsOLbSvMw(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if ((state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) || (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error)) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        } else {
            mutableState.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }
}
