package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.home.compose.HomeMatchItem;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchesHorizontalRow.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"HomeMatchesHorizontalRow", "", "matches", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "isLoadingMore", "", "hasMore", "onLoadMore", "Lkotlin/Function0;", "onMatchClick", "Lkotlin/Function1;", "", "oddType", "Lorg/betup/model/local/entity/OddType;", "isBetSelected", "isBetValidating", "isBetLocked", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "onBetClick", "Lkotlin/Function2;", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchesHorizontalRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchesHorizontalRow$lambda$7(List list, boolean z, boolean z2, Function0 function0, Function1 function1, OddType oddType, Function1 function12, Function1 function13, Function1 function14, Function2 function2, Modifier modifier, LazyListState lazyListState, int i, int i2, int i3, Composer composer, int i4) {
        HomeMatchesHorizontalRow(list, z, z2, function0, function1, oddType, function12, function13, function14, function2, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchesHorizontalRow(final List<HomeMatchItem> matches, final boolean z, final boolean z2, final Function0<Unit> onLoadMore, final Function1<? super Long, Unit> onMatchClick, final OddType oddType, final Function1<? super Long, Boolean> isBetSelected, final Function1<? super Long, Boolean> isBetValidating, final Function1<? super HomeMatchOddUi, Boolean> isBetLocked, final Function2<? super Long, ? super HomeMatchOddUi, Unit> onBetClick, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LazyListState lazyListState2;
        LazyListState lazyListState3;
        Modifier modifier2;
        int i8;
        boolean z3;
        Object[] objArr;
        boolean changedInstance;
        HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1 rememberedValue;
        LazyListState lazyListState4;
        int i9;
        boolean z4;
        Object[] objArr2;
        ?? r7;
        Composer composer2;
        boolean changedInstance2;
        Object rememberedValue2;
        Composer composer3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(onMatchClick, "onMatchClick");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(isBetSelected, "isBetSelected");
        Intrinsics.checkNotNullParameter(isBetValidating, "isBetValidating");
        Intrinsics.checkNotNullParameter(isBetLocked, "isBetLocked");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(-2038703013);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(matches) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i12 = 16;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onLoadMore) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onMatchClick) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(oddType.ordinal()) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(isBetSelected) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(isBetValidating) ? 8388608 : 4194304;
        }
        if ((i3 & 256) == 0) {
            i11 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(isBetLocked) ? 67108864 : 33554432 : 100663296;
            if ((i3 & 512) != 0) {
                i10 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onBetClick) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                i5 = i4;
                i6 = i3 & 1024;
                if (i6 != 0) {
                    i7 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i7 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
                } else {
                    i7 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0) {
                        lazyListState2 = lazyListState;
                        if (startRestartGroup.changed(lazyListState2)) {
                            i12 = 32;
                        }
                    } else {
                        lazyListState2 = lazyListState;
                    }
                    i7 |= i12;
                } else {
                    lazyListState2 = lazyListState;
                }
                if ((i5 & 306783379) == 306783378 || (i7 & 19) != 18 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i3 & 2048) != 0) {
                            lazyListState3 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i7 &= -113;
                        } else {
                            lazyListState3 = lazyListState2;
                        }
                        modifier2 = companion;
                        i8 = i7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2048) != 0) {
                            i7 &= -113;
                        }
                        lazyListState3 = lazyListState2;
                        i8 = i7;
                        modifier2 = modifier;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2038703013, i5, i8, "org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRow (HomeMatchesHorizontalRow.kt:30)");
                    }
                    z3 = !z2 || z;
                    objArr = new Object[]{lazyListState3, Boolean.valueOf(z2), Boolean.valueOf(z), Integer.valueOf(matches.size())};
                    startRestartGroup.startReplaceGroup(-1224400529);
                    int i13 = i8 & 112;
                    int i14 = i8;
                    changedInstance = ((i5 & 112) == 32) | (((i13 ^ 48) <= 32 && startRestartGroup.changed(lazyListState3)) || (i8 & 48) == 32) | startRestartGroup.changedInstance(matches) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i5 & 7168) == 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        lazyListState4 = lazyListState3;
                        i9 = i5;
                        z4 = z3;
                        objArr2 = objArr;
                        r7 = 0;
                        rememberedValue = new HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1(lazyListState3, matches, z, z2, onLoadMore, null);
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(rememberedValue);
                    } else {
                        z4 = z3;
                        lazyListState4 = lazyListState3;
                        i9 = i5;
                        objArr2 = objArr;
                        r7 = 0;
                        composer2 = startRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer2, (int) r7);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
                    PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 11, null);
                    Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
                    composer2.startReplaceGroup(-1224400529);
                    final boolean z5 = z4;
                    changedInstance2 = composer2.changedInstance(matches) | ((i9 & 57344) == 16384 ? true : r7) | ((i9 & 458752) == 131072 ? true : r7) | ((i9 & 3670016) == 1048576 ? true : r7) | ((i9 & 29360128) == 8388608 ? true : r7) | ((i9 & 234881024) == 67108864 ? true : r7) | ((i9 & 1879048192) != 536870912 ? r7 : true) | composer2.changed(z5);
                    rememberedValue2 = composer2.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        composer3 = composer2;
                        Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit HomeMatchesHorizontalRow$lambda$6$lambda$5;
                                HomeMatchesHorizontalRow$lambda$6$lambda$5 = HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow$lambda$6$lambda$5(matches, z5, onMatchClick, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, (LazyListScope) obj);
                                return HomeMatchesHorizontalRow$lambda$6$lambda$5;
                            }
                        };
                        composer3.updateRememberedValue(function1);
                        rememberedValue2 = function1;
                    } else {
                        composer3 = composer2;
                    }
                    composer3.endReplaceGroup();
                    LazyDslKt.LazyRow(modifier2, lazyListState4, m1513PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, null, (Function1) rememberedValue2, composer3, (i14 & 14) | 24960 | i13, 488);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer3 = startRestartGroup;
                    lazyListState4 = lazyListState2;
                    modifier2 = modifier;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final LazyListState lazyListState5 = lazyListState4;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HomeMatchesHorizontalRow$lambda$7;
                            HomeMatchesHorizontalRow$lambda$7 = HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow$lambda$7(matches, z, z2, onLoadMore, onMatchClick, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, modifier3, lazyListState5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return HomeMatchesHorizontalRow$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= i10;
            i5 = i4;
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            modifier2 = companion;
            i8 = i7;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = !z2 || z;
            objArr = new Object[]{lazyListState3, Boolean.valueOf(z2), Boolean.valueOf(z), Integer.valueOf(matches.size())};
            startRestartGroup.startReplaceGroup(-1224400529);
            int i132 = i8 & 112;
            int i142 = i8;
            changedInstance = ((i5 & 112) == 32) | (((i132 ^ 48) <= 32 && startRestartGroup.changed(lazyListState3)) || (i8 & 48) == 32) | startRestartGroup.changedInstance(matches) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i5 & 7168) == 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            lazyListState4 = lazyListState3;
            i9 = i5;
            z4 = z3;
            objArr2 = objArr;
            r7 = 0;
            rememberedValue = new HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1(lazyListState3, matches, z, z2, onLoadMore, null);
            composer2 = startRestartGroup;
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer2, (int) r7);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
            PaddingValues m1513PaddingValuesa9UjIt4$default2 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 11, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical2 = m1397spacedBy0680j_42;
            composer2.startReplaceGroup(-1224400529);
            final boolean z52 = z4;
            changedInstance2 = composer2.changedInstance(matches) | ((i9 & 57344) == 16384 ? true : r7) | ((i9 & 458752) == 131072 ? true : r7) | ((i9 & 3670016) == 1048576 ? true : r7) | ((i9 & 29360128) == 8388608 ? true : r7) | ((i9 & 234881024) == 67108864 ? true : r7) | ((i9 & 1879048192) != 536870912 ? r7 : true) | composer2.changed(z52);
            rememberedValue2 = composer2.rememberedValue();
            if (changedInstance2) {
            }
            composer3 = composer2;
            Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HomeMatchesHorizontalRow$lambda$6$lambda$5;
                    HomeMatchesHorizontalRow$lambda$6$lambda$5 = HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow$lambda$6$lambda$5(matches, z52, onMatchClick, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, (LazyListScope) obj);
                    return HomeMatchesHorizontalRow$lambda$6$lambda$5;
                }
            };
            composer3.updateRememberedValue(function12);
            rememberedValue2 = function12;
            composer3.endReplaceGroup();
            LazyDslKt.LazyRow(modifier2, lazyListState4, m1513PaddingValuesa9UjIt4$default2, false, horizontalOrVertical2, null, null, false, null, (Function1) rememberedValue2, composer3, (i142 & 14) | 24960 | i132, 488);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 |= i11;
        if ((i3 & 512) != 0) {
        }
        i4 |= i10;
        i5 = i4;
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        modifier2 = companion;
        i8 = i7;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = !z2 || z;
        objArr = new Object[]{lazyListState3, Boolean.valueOf(z2), Boolean.valueOf(z), Integer.valueOf(matches.size())};
        startRestartGroup.startReplaceGroup(-1224400529);
        int i1322 = i8 & 112;
        int i1422 = i8;
        changedInstance = ((i5 & 112) == 32) | (((i1322 ^ 48) <= 32 && startRestartGroup.changed(lazyListState3)) || (i8 & 48) == 32) | startRestartGroup.changedInstance(matches) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i5 & 7168) == 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        lazyListState4 = lazyListState3;
        i9 = i5;
        z4 = z3;
        objArr2 = objArr;
        r7 = 0;
        rememberedValue = new HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$1$1(lazyListState3, matches, z, z2, onLoadMore, null);
        composer2 = startRestartGroup;
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer2, (int) r7);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
        PaddingValues m1513PaddingValuesa9UjIt4$default22 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 11, null);
        Arrangement.HorizontalOrVertical horizontalOrVertical22 = m1397spacedBy0680j_422;
        composer2.startReplaceGroup(-1224400529);
        final boolean z522 = z4;
        changedInstance2 = composer2.changedInstance(matches) | ((i9 & 57344) == 16384 ? true : r7) | ((i9 & 458752) == 131072 ? true : r7) | ((i9 & 3670016) == 1048576 ? true : r7) | ((i9 & 29360128) == 8388608 ? true : r7) | ((i9 & 234881024) == 67108864 ? true : r7) | ((i9 & 1879048192) != 536870912 ? r7 : true) | composer2.changed(z522);
        rememberedValue2 = composer2.rememberedValue();
        if (changedInstance2) {
        }
        composer3 = composer2;
        Function1 function122 = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeMatchesHorizontalRow$lambda$6$lambda$5;
                HomeMatchesHorizontalRow$lambda$6$lambda$5 = HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow$lambda$6$lambda$5(matches, z522, onMatchClick, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, (LazyListScope) obj);
                return HomeMatchesHorizontalRow$lambda$6$lambda$5;
            }
        };
        composer3.updateRememberedValue(function122);
        rememberedValue2 = function122;
        composer3.endReplaceGroup();
        LazyDslKt.LazyRow(modifier2, lazyListState4, m1513PaddingValuesa9UjIt4$default22, false, horizontalOrVertical22, null, null, false, null, (Function1) rememberedValue2, composer3, (i1422 & 14) | 24960 | i1322, 488);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchesHorizontalRow$lambda$6$lambda$5(final List list, boolean z, final Function1 function1, final OddType oddType, final Function1 function12, final Function1 function13, final Function1 function14, final Function2 function2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function2 function22 = new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object HomeMatchesHorizontalRow$lambda$6$lambda$5$lambda$1;
                HomeMatchesHorizontalRow$lambda$6$lambda$5$lambda$1 = HomeMatchesHorizontalRowKt.HomeMatchesHorizontalRow$lambda$6$lambda$5$lambda$1(((Integer) obj).intValue(), (HomeMatchItem) obj2);
                return HomeMatchesHorizontalRow$lambda$6$lambda$5$lambda$1;
            }
        };
        LazyRow.items(list.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$lambda$6$lambda$5$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$lambda$6$lambda$5$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$lambda$6$lambda$5$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final HomeMatchItem homeMatchItem = (HomeMatchItem) list.get(i);
                composer.startReplaceGroup(-1137667980);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | composer.changedInstance(homeMatchItem);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function15 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function15.invoke(Long.valueOf(homeMatchItem.getMatchId()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                OddType oddType2 = oddType;
                Function1 function16 = function12;
                Function1 function17 = function13;
                Function1 function18 = function14;
                composer.startReplaceGroup(-1633490746);
                boolean changed2 = composer.changed(function2) | composer.changedInstance(homeMatchItem);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function2 function23 = function2;
                    rememberedValue2 = (Function1) new Function1<HomeMatchOddUi, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesHorizontalRowKt$HomeMatchesHorizontalRow$2$1$2$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(HomeMatchOddUi homeMatchOddUi) {
                            invoke2(homeMatchOddUi);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(HomeMatchOddUi odd) {
                            Intrinsics.checkNotNullParameter(odd, "odd");
                            function23.invoke(Long.valueOf(homeMatchItem.getMatchId()), odd);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                HomeMatchCardKt.HomeMatchCard(homeMatchItem, function0, oddType2, function16, function17, function18, (Function1) rememberedValue2, companion, composer, 12582912, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z) {
            LazyListScope.item$default(LazyRow, "loading_more", null, ComposableSingletons$HomeMatchesHorizontalRowKt.INSTANCE.getLambda$1040179293$app_release(), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HomeMatchesHorizontalRow$lambda$6$lambda$5$lambda$1(int i, HomeMatchItem match) {
        Intrinsics.checkNotNullParameter(match, "match");
        return match.getMatchId() + "_" + i;
    }
}
