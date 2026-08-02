package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u001d\u001a\u00020\u001a2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010%\u001a\u00020$*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b%\u0010&"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "pageCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "rememberPagerMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "p0", "", "Landroidx/compose/foundation/pager/PageInfo;", "p1", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;Ljava/util/List;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r34.changed(r29) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r34.changed(r30) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r34.changed(r27) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r34.changed(r28) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        if (r34.changed(r31) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        if (r34.changed(r33) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        if (r34.changed(r26) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r34.changed(r22) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy m1930rememberPagerMeasurePolicy8u0NR3k(kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> function0, androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.gestures.Orientation orientation, int i, float f, androidx.compose.foundation.pager.PageSize pageSize, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0<java.lang.Integer> function02, androidx.compose.runtime.Composer composer, int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        java.lang.Object obj;
        boolean z12;
        boolean changed;
        androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1294131537, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:61)");
        }
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if ((i2 & 48) != 32) {
            z2 = false;
            z3 = (((i2 & 896) ^ 384) <= 256 && composer.changed(paddingValues)) || (i2 & 384) == 256;
            z4 = (((i2 & 7168) ^ 3072) <= 2048 && composer.changed(z)) || (i2 & 3072) == 2048;
            z5 = (((57344 & i2) ^ 24576) <= 16384 && composer.changed(orientation.ordinal())) || (i2 & 24576) == 16384;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) != 67108864) {
                z6 = false;
                if (((1879048192 & i2) ^ 805306368) <= 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                    z7 = false;
                    if (((3670016 & i2) ^ 1572864) <= 1048576) {
                    }
                    if ((i2 & 1572864) != 1048576) {
                        z8 = false;
                        if (((29360128 & i2) ^ 12582912) <= 8388608) {
                        }
                        if ((i2 & 12582912) != 8388608) {
                            z9 = false;
                            if (((i3 & 14) ^ 6) <= 4) {
                            }
                            if ((i3 & 6) != 4) {
                                z10 = false;
                                if (((i3 & 896) ^ 384) <= 256) {
                                }
                                if ((i3 & 384) != 256) {
                                    z11 = false;
                                    if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                    }
                                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                        obj = coroutineScope;
                                        z12 = false;
                                        changed = composer.changed(obj);
                                        rememberedValue = composer.rememberedValue();
                                        if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                                            composer.updateRememberedValue(rememberedValue);
                                        }
                                        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        return lazyLayoutMeasurePolicy;
                                    }
                                    obj = coroutineScope;
                                    z12 = true;
                                    changed = composer.changed(obj);
                                    rememberedValue = composer.rememberedValue();
                                    if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                                    }
                                    rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                                    composer.updateRememberedValue(rememberedValue);
                                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    return lazyLayoutMeasurePolicy2;
                                }
                                z11 = true;
                                if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                                }
                                if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                }
                                obj = coroutineScope;
                                z12 = true;
                                changed = composer.changed(obj);
                                rememberedValue = composer.rememberedValue();
                                if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                                }
                                rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                                composer.updateRememberedValue(rememberedValue);
                                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                return lazyLayoutMeasurePolicy22;
                            }
                            z10 = true;
                            if (((i3 & 896) ^ 384) <= 256) {
                            }
                            if ((i3 & 384) != 256) {
                            }
                            z11 = true;
                            if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                            }
                            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                            }
                            obj = coroutineScope;
                            z12 = true;
                            changed = composer.changed(obj);
                            rememberedValue = composer.rememberedValue();
                            if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                            }
                            rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                            composer.updateRememberedValue(rememberedValue);
                            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            return lazyLayoutMeasurePolicy222;
                        }
                        z9 = true;
                        if (((i3 & 14) ^ 6) <= 4) {
                        }
                        if ((i3 & 6) != 4) {
                        }
                        z10 = true;
                        if (((i3 & 896) ^ 384) <= 256) {
                        }
                        if ((i3 & 384) != 256) {
                        }
                        z11 = true;
                        if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                        }
                        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        }
                        obj = coroutineScope;
                        z12 = true;
                        changed = composer.changed(obj);
                        rememberedValue = composer.rememberedValue();
                        if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                        }
                        rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                        composer.updateRememberedValue(rememberedValue);
                        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        return lazyLayoutMeasurePolicy2222;
                    }
                    z8 = true;
                    if (((29360128 & i2) ^ 12582912) <= 8388608) {
                    }
                    if ((i2 & 12582912) != 8388608) {
                    }
                    z9 = true;
                    if (((i3 & 14) ^ 6) <= 4) {
                    }
                    if ((i3 & 6) != 4) {
                    }
                    z10 = true;
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                    if ((i3 & 384) != 256) {
                    }
                    z11 = true;
                    if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                    }
                    obj = coroutineScope;
                    z12 = true;
                    changed = composer.changed(obj);
                    rememberedValue = composer.rememberedValue();
                    if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                    }
                    rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                    composer.updateRememberedValue(rememberedValue);
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    return lazyLayoutMeasurePolicy22222;
                }
                z7 = true;
                if (((3670016 & i2) ^ 1572864) <= 1048576) {
                }
                if ((i2 & 1572864) != 1048576) {
                }
                z8 = true;
                if (((29360128 & i2) ^ 12582912) <= 8388608) {
                }
                if ((i2 & 12582912) != 8388608) {
                }
                z9 = true;
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) != 4) {
                }
                z10 = true;
                if (((i3 & 896) ^ 384) <= 256) {
                }
                if ((i3 & 384) != 256) {
                }
                z11 = true;
                if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                }
                obj = coroutineScope;
                z12 = true;
                changed = composer.changed(obj);
                rememberedValue = composer.rememberedValue();
                if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
                }
                rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
                composer.updateRememberedValue(rememberedValue);
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy222222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return lazyLayoutMeasurePolicy222222;
            }
            z6 = true;
            if (((1879048192 & i2) ^ 805306368) <= 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            z7 = true;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
            }
            if ((i2 & 1572864) != 1048576) {
            }
            z8 = true;
            if (((29360128 & i2) ^ 12582912) <= 8388608) {
            }
            if ((i2 & 12582912) != 8388608) {
            }
            z9 = true;
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) != 4) {
            }
            z10 = true;
            if (((i3 & 896) ^ 384) <= 256) {
            }
            if ((i3 & 384) != 256) {
            }
            z11 = true;
            if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
            }
            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            }
            obj = coroutineScope;
            z12 = true;
            changed = composer.changed(obj);
            rememberedValue = composer.rememberedValue();
            if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
            }
            rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2222222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return lazyLayoutMeasurePolicy2222222;
        }
        z2 = true;
        if (((i2 & 896) ^ 384) <= 256) {
        }
        if (((i2 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i2) ^ 24576) <= 16384) {
        }
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) != 67108864) {
        }
        z6 = true;
        if (((1879048192 & i2) ^ 805306368) <= 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        z7 = true;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((i2 & 1572864) != 1048576) {
        }
        z8 = true;
        if (((29360128 & i2) ^ 12582912) <= 8388608) {
        }
        if ((i2 & 12582912) != 8388608) {
        }
        z9 = true;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
        }
        z10 = true;
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if ((i3 & 384) != 256) {
        }
        z11 = true;
        if (((458752 & i2) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
        }
        obj = coroutineScope;
        z12 = true;
        changed = composer.changed(obj);
        rememberedValue = composer.rememberedValue();
        if (!(z11 | z8 | z2 | z3 | z4 | z5 | z6 | z7 | z9 | z10 | z12 | changed)) {
        }
        rememberedValue = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(pagerState, orientation, paddingValues, z, f, pageSize, function0, function02, vertical, horizontal, i, snapPosition, coroutineScope);
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy22222222 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return lazyLayoutMeasurePolicy22222222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic, java.util.List<? extends androidx.compose.foundation.pager.PageInfo> list) {
        android.os.Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int index = ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.first((java.util.List) list)).getIndex();
                int index2 = ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) list)).getIndex();
                for (int prefetchWindowStartLine = cacheWindowLogic.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    lazyLayoutMeasureScope.compose(prefetchWindowStartLine);
                }
                int i = index2 + 1;
                int prefetchWindowEndLine = cacheWindowLogic.getPrefetchWindowEndLine();
                if (i <= prefetchWindowEndLine) {
                    while (true) {
                        lazyLayoutMeasureScope.compose(i);
                        if (i == prefetchWindowEndLine) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            android.os.Trace.endSection();
        }
    }
}
