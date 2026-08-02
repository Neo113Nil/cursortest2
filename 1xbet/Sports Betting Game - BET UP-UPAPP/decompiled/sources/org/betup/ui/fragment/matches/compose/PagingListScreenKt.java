package org.betup.ui.fragment.matches.compose;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.search.SearchBottomSheetFragment;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: PagingListScreen.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a÷\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010#H\u0007¢\u0006\u0002\u0010$¨\u0006%²\u0006\n\u0010&\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"PagingListScreen", "", "controller", "Lorg/betup/ui/fragment/matches/BasePagingController;", "onClickBack", "Lkotlin/Function0;", "items", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "isLoading", "", "error", "", "hasMore", "isLoadingMore", "query", "onAddToFavorite", "Lkotlin/Function1;", "onDeleteFromFavorite", "tourSportId", "", "onTourSportItemBounds", "Landroid/graphics/Rect;", "onTourSportItemId", "onSportScrollComplete", "tourLeagueId", "onTourLeagueItemBounds", "onTourLeagueItemId", "onLeagueScrollComplete", "onExpandedStateChanged", "enableSearchBottomSheet", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "onListPositionChanged", "Lkotlin/Function2;", "(Lorg/betup/ui/fragment/matches/BasePagingController;Lkotlin/jvm/functions/Function0;Ljava/util/List;ZLjava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZIILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;IIII)V", "app_release", "canRetry", "searchText", "isRefreshing", "isSearchExpanded"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagingListScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$34(BasePagingController basePagingController, Function0 function0, List list, boolean z, String str, boolean z2, boolean z3, String str2, Function1 function1, Function1 function12, Long l, Function1 function13, Function1 function14, Function0 function02, Long l2, Function1 function15, Function1 function16, Function0 function03, Function1 function17, boolean z4, int i, int i2, Function2 function2, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        PagingListScreen(basePagingController, function0, list, z, str, z2, z3, str2, function1, function12, l, function13, function14, function02, l2, function15, function16, function03, function17, z4, i, i2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0422, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L309;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PagingListScreen(final BasePagingController controller, final Function0<Unit> onClickBack, final List<SportListItemUiModel> items, final boolean z, final String str, final boolean z2, final boolean z3, final String query, final Function1<? super SportListItemUiModel, Unit> onAddToFavorite, final Function1<? super SportListItemUiModel, Unit> onDeleteFromFavorite, Long l, Function1<? super Rect, Unit> function1, Function1<? super Long, Unit> function12, Function0<Unit> function0, Long l2, Function1<? super Rect, Unit> function13, Function1<? super Long, Unit> function14, Function0<Unit> function02, Function1<? super Boolean, Unit> function15, boolean z4, int i, int i2, Function2<? super Integer, ? super Integer, Unit> function2, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final Function1<? super Boolean, Unit> function16;
        boolean z5;
        Object rememberedValue;
        Object rememberedValue2;
        final MutableState mutableState;
        Object rememberedValue3;
        Function1<? super Rect, Unit> function17;
        final MutableState mutableState2;
        boolean changedInstance;
        int i26;
        boolean z6;
        Object rememberedValue4;
        Object rememberedValue5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean changedInstance3;
        Object rememberedValue7;
        boolean changedInstance4;
        Object rememberedValue8;
        boolean z7;
        Object rememberedValue9;
        Function0 function03;
        float m7774constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        Function1<? super Boolean, Unit> function18;
        MutableState mutableState3;
        final Function1<? super Boolean, Unit> function19;
        final Long l3;
        final Function1<? super Long, Unit> function110;
        final Function0<Unit> function04;
        final Long l4;
        final Function1<? super Rect, Unit> function111;
        final Function1<? super Long, Unit> function112;
        final Function0<Unit> function05;
        final boolean z8;
        final int i27;
        final int i28;
        final Function2<? super Integer, ? super Integer, Unit> function22;
        final Function1<? super Rect, Unit> function113;
        ScopeUpdateScope endRestartGroup;
        int i29;
        int i30;
        int i31;
        int i32;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onClickBack, "onClickBack");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onAddToFavorite, "onAddToFavorite");
        Intrinsics.checkNotNullParameter(onDeleteFromFavorite, "onDeleteFromFavorite");
        Composer startRestartGroup = composer.startRestartGroup(-494995625);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(onClickBack) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= startRestartGroup.changedInstance(items) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i7 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((i6 & 32) != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i6 & 64) == 0) {
            i32 = (1572864 & i3) == 0 ? startRestartGroup.changed(z3) ? 1048576 : 524288 : 1572864;
            if ((i6 & 128) != 0) {
                i31 = (12582912 & i3) == 0 ? startRestartGroup.changed(query) ? 8388608 : 4194304 : 12582912;
                if ((i6 & 256) == 0) {
                    i30 = (100663296 & i3) == 0 ? startRestartGroup.changedInstance(onAddToFavorite) ? 67108864 : 33554432 : 100663296;
                    if ((i6 & 512) != 0) {
                        i29 = (805306368 & i3) == 0 ? startRestartGroup.changedInstance(onDeleteFromFavorite) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                        i8 = i7;
                        i9 = i6 & 1024;
                        if (i9 != 0) {
                            i10 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i10 = i4 | (startRestartGroup.changed(l) ? 4 : 2);
                        } else {
                            i10 = i4;
                        }
                        i11 = i6 & 2048;
                        if (i11 != 0) {
                            i10 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i10 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                        }
                        i12 = i10;
                        i13 = i6 & 4096;
                        if (i13 != 0) {
                            i12 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i12 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                            i14 = i6 & 8192;
                            if (i14 == 0) {
                                i12 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i12 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                                i15 = i6 & 16384;
                                if (i15 != 0) {
                                    i12 |= 24576;
                                } else if ((i4 & 24576) == 0) {
                                    i12 |= startRestartGroup.changed(l2) ? 16384 : 8192;
                                    i16 = i6 & 32768;
                                    if (i16 == 0) {
                                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i12 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                    }
                                    i17 = i6 & 65536;
                                    if (i17 == 0) {
                                        i12 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i12 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                    }
                                    i18 = i6 & 131072;
                                    if (i18 == 0) {
                                        i12 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i12 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                                    }
                                    i19 = i6 & 262144;
                                    if (i19 == 0) {
                                        i12 |= 100663296;
                                    } else if ((i4 & 100663296) == 0) {
                                        i12 |= startRestartGroup.changedInstance(function15) ? 67108864 : 33554432;
                                    }
                                    i20 = i6 & 524288;
                                    if (i20 == 0) {
                                        i12 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i12 |= startRestartGroup.changed(z4) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    i21 = i6 & 1048576;
                                    if (i21 == 0) {
                                        i22 = i5;
                                        i23 = i22 | 6;
                                    } else {
                                        i22 = i5;
                                        if ((i22 & 6) == 0) {
                                            i23 = i22 | (startRestartGroup.changed(i) ? 4 : 2);
                                        } else {
                                            i23 = i22;
                                        }
                                    }
                                    i24 = i6 & 2097152;
                                    if (i24 == 0) {
                                        i23 |= 48;
                                    } else if ((i22 & 48) == 0) {
                                        i23 |= startRestartGroup.changed(i2) ? 32 : 16;
                                    }
                                    int i33 = i23;
                                    i25 = i6 & 4194304;
                                    if (i25 == 0) {
                                        i33 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else if ((i22 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i33 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                                        if ((i8 & 306783379) == 306783378 || (306783379 & i12) != 306783378 || (i33 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                                            Long l5 = i9 != 0 ? null : l;
                                            Function1<? super Rect, Unit> function114 = i11 != 0 ? null : function1;
                                            Function1<? super Long, Unit> function115 = i13 != 0 ? null : function12;
                                            Function0<Unit> function06 = i14 != 0 ? null : function0;
                                            Long l6 = i15 != 0 ? null : l2;
                                            Function1<? super Rect, Unit> function116 = i16 != 0 ? null : function13;
                                            Function1<? super Long, Unit> function117 = i17 != 0 ? null : function14;
                                            Function0<Unit> function07 = i18 != 0 ? null : function02;
                                            function16 = i19 != 0 ? null : function15;
                                            z5 = i20 != 0 ? false : z4;
                                            int i34 = i21 != 0 ? 0 : i;
                                            int i35 = i24 != 0 ? 0 : i2;
                                            Function2<? super Integer, ? super Integer, Unit> function23 = i25 != 0 ? null : function2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-494995625, i8, i12, "org.betup.ui.fragment.matches.compose.PagingListScreen (PagingListScreen.kt:64)");
                                            }
                                            State collectAsState = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localContext);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            final Context context = (Context) consume;
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(query, null, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            final MutableState mutableState4 = (MutableState) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            mutableState = (MutableState) rememberedValue2;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                function17 = function114;
                                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            } else {
                                                function17 = function114;
                                            }
                                            mutableState2 = (MutableState) rememberedValue3;
                                            startRestartGroup.endReplaceGroup();
                                            boolean PagingListScreen$lambda$5 = PagingListScreen$lambda$5(mutableState);
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            changedInstance = startRestartGroup.changedInstance(controller);
                                            Object rememberedValue10 = startRestartGroup.rememberedValue();
                                            if (changedInstance) {
                                                i26 = i33;
                                            } else {
                                                i26 = i33;
                                            }
                                            rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit PagingListScreen$lambda$11$lambda$10;
                                                    PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                                                    return PagingListScreen$lambda$11$lambda$10;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue10);
                                            startRestartGroup.endReplaceGroup();
                                            PullRefreshState m2661rememberPullRefreshStateUuyPYSY = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$5, (Function0) rememberedValue10, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                            Boolean valueOf = Boolean.valueOf(z);
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            z6 = (i8 & 7168) == 2048;
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (!z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                                            Boolean valueOf2 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                                            startRestartGroup.startReplaceGroup(5004770);
                                            rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = (Function2) new PagingListScreenKt$PagingListScreen$2$1(mutableState, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                                            float f = 12;
                                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, Dp.m7774constructorimpl(f), 0.0f, 10, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            String PagingListScreen$lambda$2 = PagingListScreen$lambda$2(mutableState4);
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            changedInstance2 = startRestartGroup.changedInstance(controller);
                                            rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                                                        PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState4, (String) obj);
                                                        return PagingListScreen$lambda$33$lambda$15$lambda$14;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                            }
                                            Function1 function118 = (Function1) rememberedValue6;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            changedInstance3 = startRestartGroup.changedInstance(controller);
                                            rememberedValue7 = startRestartGroup.rememberedValue();
                                            if (!changedInstance3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                                                        PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState4, (String) obj);
                                                        return PagingListScreen$lambda$33$lambda$17$lambda$16;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                            }
                                            Function1 function119 = (Function1) rememberedValue7;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            changedInstance4 = startRestartGroup.changedInstance(controller);
                                            rememberedValue8 = startRestartGroup.rememberedValue();
                                            if (!changedInstance4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                                                        PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState4);
                                                        return PagingListScreen$lambda$33$lambda$19$lambda$18;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                            }
                                            Function0 function08 = (Function0) rememberedValue8;
                                            startRestartGroup.endReplaceGroup();
                                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            startRestartGroup.startReplaceGroup(-1633490746);
                                            z7 = (234881024 & i12) == 67108864;
                                            rememberedValue9 = startRestartGroup.rememberedValue();
                                            if (!z7 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                                                        PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                                                        return PagingListScreen$lambda$33$lambda$21$lambda$20;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                            }
                                            Function1 function120 = (Function1) rememberedValue9;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1475152909);
                                            if (z5) {
                                                startRestartGroup.startReplaceGroup(5004770);
                                                boolean changedInstance5 = startRestartGroup.changedInstance(context);
                                                Object rememberedValue11 = startRestartGroup.rememberedValue();
                                                if (changedInstance5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue11 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit PagingListScreen$lambda$33$lambda$24$lambda$23;
                                                            PagingListScreen$lambda$33$lambda$24$lambda$23 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$24$lambda$23(context);
                                                            return PagingListScreen$lambda$33$lambda$24$lambda$23;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                                }
                                                function03 = (Function0) rememberedValue11;
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                function03 = null;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$2, function118, onClickBack, function119, function08, fillMaxWidth$default, false, false, function120, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            if (PagingListScreen$lambda$8(mutableState2)) {
                                                m7774constructorimpl = Dp.m7774constructorimpl(58);
                                            } else {
                                                m7774constructorimpl = Dp.m7774constructorimpl(16);
                                            }
                                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, m7774constructorimpl), startRestartGroup, 0);
                                            Modifier pullRefresh$default = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY, false, 2, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default);
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor2);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            if (z) {
                                                startRestartGroup.startReplaceGroup(2078122288);
                                                Modifier align = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.createNode(constructor3);
                                                } else {
                                                    startRestartGroup.useNode();
                                                }
                                                Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 6, 28);
                                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading, startRestartGroup, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 0, 131058);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endReplaceGroup();
                                            } else if (str != null && PagingListScreen$lambda$0(collectAsState)) {
                                                startRestartGroup.startReplaceGroup(2078994256);
                                                Modifier align2 = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                                                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, align2);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.createNode(constructor4);
                                                } else {
                                                    startRestartGroup.useNode();
                                                }
                                                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                float f2 = 16;
                                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                                                TextKt.m3621Text4IGK_g(str, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(32), 0.0f, 2, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i8 >> 12) & 14) | 3120, 0, 130544);
                                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), startRestartGroup, 6);
                                                String stringResource = StringResources_androidKt.stringResource(R.string.vk_retry, startRestartGroup, 6);
                                                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), 0.0f, 2, null);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                boolean changedInstance6 = startRestartGroup.changedInstance(controller);
                                                Object rememberedValue12 = startRestartGroup.rememberedValue();
                                                if (changedInstance6 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit PagingListScreen$lambda$33$lambda$32$lambda$28$lambda$27$lambda$26;
                                                            PagingListScreen$lambda$33$lambda$32$lambda$28$lambda$27$lambda$26 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$32$lambda$28$lambda$27$lambda$26(BasePagingController.this);
                                                            return PagingListScreen$lambda$33$lambda$32$lambda$28$lambda$27$lambda$26;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                CommonButtonKt.m12915CommonButtonUPEs2M4(m1518paddingVpY3zN4$default, false, stringResource, false, false, false, (Function0) rememberedValue12, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 54, 0, 0, 2097080);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endReplaceGroup();
                                            } else if (items.isEmpty() && !z && str == null) {
                                                startRestartGroup.startReplaceGroup(2080162491);
                                                Modifier align3 = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                                                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, startRestartGroup, 48);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, align3);
                                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.createNode(constructor5);
                                                } else {
                                                    startRestartGroup.useNode();
                                                }
                                                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                                IconKt.m3077Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_search, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_no_results, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(48)), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.empty_list_view, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(32), 0.0f, 2, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(2081262712);
                                                startRestartGroup.startReplaceGroup(-1746271574);
                                                boolean changedInstance7 = ((458752 & i8) == 131072) | ((3670016 & i8) == 1048576) | startRestartGroup.changedInstance(controller);
                                                Object rememberedValue13 = startRestartGroup.rememberedValue();
                                                if (changedInstance7 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit PagingListScreen$lambda$33$lambda$32$lambda$31$lambda$30;
                                                            PagingListScreen$lambda$33$lambda$32$lambda$31$lambda$30 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$32$lambda$31$lambda$30(z2, z3, controller);
                                                            return PagingListScreen$lambda$33$lambda$32$lambda$31$lambda$30;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                                }
                                                Function0 function09 = (Function0) rememberedValue13;
                                                startRestartGroup.endReplaceGroup();
                                                int i36 = i8 >> 6;
                                                int i37 = i8 >> 12;
                                                int i38 = (i37 & 458752) | (i36 & 7168) | (i36 & 14) | (i37 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (57344 & i37);
                                                int i39 = i12 << 24;
                                                int i40 = i38 | (234881024 & i39) | (i39 & 1879048192);
                                                int i41 = i26 << 18;
                                                int i42 = ((i12 >> 6) & 524286) | (3670016 & i41) | (29360128 & i41) | (i41 & 234881024);
                                                composer2 = startRestartGroup;
                                                function18 = function16;
                                                mutableState3 = mutableState;
                                                SportsListKt.m13963SportsListBUBvxpI(items, function09, z3, z2, onAddToFavorite, onDeleteFromFavorite, null, 0.0f, l5, function17, function115, function06, l6, function116, function117, function07, i34, i35, function23, composer2, i40, i42, 192);
                                                composer2.endReplaceGroup();
                                                PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                function19 = function18;
                                                l3 = l5;
                                                function110 = function115;
                                                function04 = function06;
                                                l4 = l6;
                                                function111 = function116;
                                                function112 = function117;
                                                function05 = function07;
                                                z8 = z5;
                                                i27 = i34;
                                                i28 = i35;
                                                function22 = function23;
                                                function113 = function17;
                                            }
                                            function18 = function16;
                                            composer2 = startRestartGroup;
                                            mutableState3 = mutableState;
                                            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function19 = function18;
                                            l3 = l5;
                                            function110 = function115;
                                            function04 = function06;
                                            l4 = l6;
                                            function111 = function116;
                                            function112 = function117;
                                            function05 = function07;
                                            z8 = z5;
                                            i27 = i34;
                                            i28 = i35;
                                            function22 = function23;
                                            function113 = function17;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            l3 = l;
                                            function113 = function1;
                                            function110 = function12;
                                            function04 = function0;
                                            l4 = l2;
                                            function111 = function13;
                                            function112 = function14;
                                            function05 = function02;
                                            function19 = function15;
                                            z8 = z4;
                                            i27 = i;
                                            i28 = i2;
                                            function22 = function2;
                                            composer2 = startRestartGroup;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda8
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit PagingListScreen$lambda$34;
                                                    PagingListScreen$lambda$34 = PagingListScreenKt.PagingListScreen$lambda$34(BasePagingController.this, onClickBack, items, z, str, z2, z3, query, onAddToFavorite, onDeleteFromFavorite, l3, function113, function110, function04, l4, function111, function112, function05, function19, z8, i27, i28, function22, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                    return PagingListScreen$lambda$34;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if ((i8 & 306783379) == 306783378) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (i21 != 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i25 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    State collectAsState2 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContext2);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Context context2 = (Context) consume2;
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState mutableState42 = (MutableState) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    mutableState = (MutableState) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    mutableState2 = (MutableState) rememberedValue3;
                                    startRestartGroup.endReplaceGroup();
                                    boolean PagingListScreen$lambda$52 = PagingListScreen$lambda$5(mutableState);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changedInstance = startRestartGroup.changedInstance(controller);
                                    Object rememberedValue102 = startRestartGroup.rememberedValue();
                                    if (changedInstance) {
                                    }
                                    rememberedValue102 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit PagingListScreen$lambda$11$lambda$10;
                                            PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                                            return PagingListScreen$lambda$11$lambda$10;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue102);
                                    startRestartGroup.endReplaceGroup();
                                    PullRefreshState m2661rememberPullRefreshStateUuyPYSY2 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$52, (Function0) rememberedValue102, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                    Boolean valueOf3 = Boolean.valueOf(z);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    if ((i8 & 7168) == 2048) {
                                    }
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!z6) {
                                    }
                                    rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                                    Boolean valueOf22 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                                    startRestartGroup.startReplaceGroup(5004770);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                                    float f3 = 12;
                                    Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), 0.0f, Dp.m7774constructorimpl(f3), 0.0f, 10, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
                                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                                    String PagingListScreen$lambda$22 = PagingListScreen$lambda$2(mutableState42);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changedInstance2 = startRestartGroup.changedInstance(controller);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                                            PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState42, (String) obj);
                                            return PagingListScreen$lambda$33$lambda$15$lambda$14;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                    Function1 function1182 = (Function1) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changedInstance3 = startRestartGroup.changedInstance(controller);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3) {
                                    }
                                    rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                                            PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState42, (String) obj);
                                            return PagingListScreen$lambda$33$lambda$17$lambda$16;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                    Function1 function1192 = (Function1) rememberedValue7;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changedInstance4 = startRestartGroup.changedInstance(controller);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (!changedInstance4) {
                                    }
                                    rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                                            PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState42);
                                            return PagingListScreen$lambda$33$lambda$19$lambda$18;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                    Function0 function082 = (Function0) rememberedValue8;
                                    startRestartGroup.endReplaceGroup();
                                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    if ((234881024 & i12) == 67108864) {
                                    }
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (!z7) {
                                    }
                                    rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                                            PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                                            return PagingListScreen$lambda$33$lambda$21$lambda$20;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                    Function1 function1202 = (Function1) rememberedValue9;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1475152909);
                                    if (z5) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$22, function1182, onClickBack, function1192, function082, fillMaxWidth$default2, false, false, function1202, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    if (PagingListScreen$lambda$8(mutableState2)) {
                                    }
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion2, m7774constructorimpl), startRestartGroup, 0);
                                    Modifier pullRefresh$default2 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance5, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2, false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2);
                                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting()) {
                                    }
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    if (z) {
                                    }
                                    function18 = function16;
                                    composer2 = startRestartGroup;
                                    mutableState3 = mutableState;
                                    PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY2, boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function19 = function18;
                                    l3 = l5;
                                    function110 = function115;
                                    function04 = function06;
                                    l4 = l6;
                                    function111 = function116;
                                    function112 = function117;
                                    function05 = function07;
                                    z8 = z5;
                                    i27 = i34;
                                    i28 = i35;
                                    function22 = function23;
                                    function113 = function17;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i16 = i6 & 32768;
                                if (i16 == 0) {
                                }
                                i17 = i6 & 65536;
                                if (i17 == 0) {
                                }
                                i18 = i6 & 131072;
                                if (i18 == 0) {
                                }
                                i19 = i6 & 262144;
                                if (i19 == 0) {
                                }
                                i20 = i6 & 524288;
                                if (i20 == 0) {
                                }
                                i21 = i6 & 1048576;
                                if (i21 == 0) {
                                }
                                i24 = i6 & 2097152;
                                if (i24 == 0) {
                                }
                                int i332 = i23;
                                i25 = i6 & 4194304;
                                if (i25 == 0) {
                                }
                                if ((i8 & 306783379) == 306783378) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i13 != 0) {
                                }
                                if (i14 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i17 != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i20 != 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (i25 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                State collectAsState22 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume22 = startRestartGroup.consume(localContext22);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Context context22 = (Context) consume22;
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableState mutableState422 = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState = (MutableState) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState2 = (MutableState) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                boolean PagingListScreen$lambda$522 = PagingListScreen$lambda$5(mutableState);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changedInstance = startRestartGroup.changedInstance(controller);
                                Object rememberedValue1022 = startRestartGroup.rememberedValue();
                                if (changedInstance) {
                                }
                                rememberedValue1022 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit PagingListScreen$lambda$11$lambda$10;
                                        PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                                        return PagingListScreen$lambda$11$lambda$10;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue1022);
                                startRestartGroup.endReplaceGroup();
                                PullRefreshState m2661rememberPullRefreshStateUuyPYSY22 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$522, (Function0) rememberedValue1022, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                Boolean valueOf32 = Boolean.valueOf(z);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                if ((i8 & 7168) == 2048) {
                                }
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!z6) {
                                }
                                rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                                Boolean valueOf222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                                startRestartGroup.startReplaceGroup(5004770);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                                float f32 = 12;
                                Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32), 0.0f, Dp.m7774constructorimpl(f32), 0.0f, 10, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy52 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
                                Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance52 = ColumnScopeInstance.INSTANCE;
                                String PagingListScreen$lambda$222 = PagingListScreen$lambda$2(mutableState422);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changedInstance2 = startRestartGroup.changedInstance(controller);
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (!changedInstance2) {
                                }
                                rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                                        PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState422, (String) obj);
                                        return PagingListScreen$lambda$33$lambda$15$lambda$14;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                Function1 function11822 = (Function1) rememberedValue6;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changedInstance3 = startRestartGroup.changedInstance(controller);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (!changedInstance3) {
                                }
                                rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                                        PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState422, (String) obj);
                                        return PagingListScreen$lambda$33$lambda$17$lambda$16;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                Function1 function11922 = (Function1) rememberedValue7;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changedInstance4 = startRestartGroup.changedInstance(controller);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!changedInstance4) {
                                }
                                rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                                        PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState422);
                                        return PagingListScreen$lambda$33$lambda$19$lambda$18;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                Function0 function0822 = (Function0) rememberedValue8;
                                startRestartGroup.endReplaceGroup();
                                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                if ((234881024 & i12) == 67108864) {
                                }
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (!z7) {
                                }
                                rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                                        PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                                        return PagingListScreen$lambda$33$lambda$21$lambda$20;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                Function1 function12022 = (Function1) rememberedValue9;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1475152909);
                                if (z5) {
                                }
                                startRestartGroup.endReplaceGroup();
                                CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$222, function11822, onClickBack, function11922, function0822, fillMaxWidth$default22, false, false, function12022, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                if (PagingListScreen$lambda$8(mutableState2)) {
                                }
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion22, m7774constructorimpl), startRestartGroup, 0);
                                Modifier pullRefresh$default22 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance52, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22, false, 2, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22);
                                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                if (z) {
                                }
                                function18 = function16;
                                composer2 = startRestartGroup;
                                mutableState3 = mutableState;
                                PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY22, boxScopeInstance22.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function19 = function18;
                                l3 = l5;
                                function110 = function115;
                                function04 = function06;
                                l4 = l6;
                                function111 = function116;
                                function112 = function117;
                                function05 = function07;
                                z8 = z5;
                                i27 = i34;
                                i28 = i35;
                                function22 = function23;
                                function113 = function17;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i15 = i6 & 16384;
                            if (i15 != 0) {
                            }
                            i16 = i6 & 32768;
                            if (i16 == 0) {
                            }
                            i17 = i6 & 65536;
                            if (i17 == 0) {
                            }
                            i18 = i6 & 131072;
                            if (i18 == 0) {
                            }
                            i19 = i6 & 262144;
                            if (i19 == 0) {
                            }
                            i20 = i6 & 524288;
                            if (i20 == 0) {
                            }
                            i21 = i6 & 1048576;
                            if (i21 == 0) {
                            }
                            i24 = i6 & 2097152;
                            if (i24 == 0) {
                            }
                            int i3322 = i23;
                            i25 = i6 & 4194304;
                            if (i25 == 0) {
                            }
                            if ((i8 & 306783379) == 306783378) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            State collectAsState222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume222 = startRestartGroup.consume(localContext222);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Context context222 = (Context) consume222;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState mutableState4222 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState2 = (MutableState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            boolean PagingListScreen$lambda$5222 = PagingListScreen$lambda$5(mutableState);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance = startRestartGroup.changedInstance(controller);
                            Object rememberedValue10222 = startRestartGroup.rememberedValue();
                            if (changedInstance) {
                            }
                            rememberedValue10222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit PagingListScreen$lambda$11$lambda$10;
                                    PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                                    return PagingListScreen$lambda$11$lambda$10;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10222);
                            startRestartGroup.endReplaceGroup();
                            PullRefreshState m2661rememberPullRefreshStateUuyPYSY222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$5222, (Function0) rememberedValue10222, 0.0f, 0.0f, startRestartGroup, 0, 12);
                            Boolean valueOf322 = Boolean.valueOf(z);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            if ((i8 & 7168) == 2048) {
                            }
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z6) {
                            }
                            rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                            Boolean valueOf2222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                            startRestartGroup.startReplaceGroup(5004770);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                            float f322 = 12;
                            Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f322), 0.0f, Dp.m7774constructorimpl(f322), 0.0f, 10, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy522 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222);
                            Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance522 = ColumnScopeInstance.INSTANCE;
                            String PagingListScreen$lambda$2222 = PagingListScreen$lambda$2(mutableState4222);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance2 = startRestartGroup.changedInstance(controller);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changedInstance2) {
                            }
                            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                                    PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState4222, (String) obj);
                                    return PagingListScreen$lambda$33$lambda$15$lambda$14;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            Function1 function118222 = (Function1) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance3 = startRestartGroup.changedInstance(controller);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changedInstance3) {
                            }
                            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                                    PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState4222, (String) obj);
                                    return PagingListScreen$lambda$33$lambda$17$lambda$16;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                            Function1 function119222 = (Function1) rememberedValue7;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance4 = startRestartGroup.changedInstance(controller);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!changedInstance4) {
                            }
                            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                                    PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState4222);
                                    return PagingListScreen$lambda$33$lambda$19$lambda$18;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                            Function0 function08222 = (Function0) rememberedValue8;
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            if ((234881024 & i12) == 67108864) {
                            }
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (!z7) {
                            }
                            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                                    PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                                    return PagingListScreen$lambda$33$lambda$21$lambda$20;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                            Function1 function120222 = (Function1) rememberedValue9;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1475152909);
                            if (z5) {
                            }
                            startRestartGroup.endReplaceGroup();
                            CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$2222, function118222, onClickBack, function119222, function08222, fillMaxWidth$default222, false, false, function120222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                            Modifier.Companion companion222 = Modifier.INSTANCE;
                            if (PagingListScreen$lambda$8(mutableState2)) {
                            }
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion222, m7774constructorimpl), startRestartGroup, 0);
                            Modifier pullRefresh$default222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance522, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY222, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default222);
                            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                            if (z) {
                            }
                            function18 = function16;
                            composer2 = startRestartGroup;
                            mutableState3 = mutableState;
                            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY222, boxScopeInstance222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function19 = function18;
                            l3 = l5;
                            function110 = function115;
                            function04 = function06;
                            l4 = l6;
                            function111 = function116;
                            function112 = function117;
                            function05 = function07;
                            z8 = z5;
                            i27 = i34;
                            i28 = i35;
                            function22 = function23;
                            function113 = function17;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i14 = i6 & 8192;
                        if (i14 == 0) {
                        }
                        i15 = i6 & 16384;
                        if (i15 != 0) {
                        }
                        i16 = i6 & 32768;
                        if (i16 == 0) {
                        }
                        i17 = i6 & 65536;
                        if (i17 == 0) {
                        }
                        i18 = i6 & 131072;
                        if (i18 == 0) {
                        }
                        i19 = i6 & 262144;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 524288;
                        if (i20 == 0) {
                        }
                        i21 = i6 & 1048576;
                        if (i21 == 0) {
                        }
                        i24 = i6 & 2097152;
                        if (i24 == 0) {
                        }
                        int i33222 = i23;
                        i25 = i6 & 4194304;
                        if (i25 == 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        State collectAsState2222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2222 = startRestartGroup.consume(localContext2222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context2222 = (Context) consume2222;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState42222 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState2 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        boolean PagingListScreen$lambda$52222 = PagingListScreen$lambda$5(mutableState);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance = startRestartGroup.changedInstance(controller);
                        Object rememberedValue102222 = startRestartGroup.rememberedValue();
                        if (changedInstance) {
                        }
                        rememberedValue102222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit PagingListScreen$lambda$11$lambda$10;
                                PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                                return PagingListScreen$lambda$11$lambda$10;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue102222);
                        startRestartGroup.endReplaceGroup();
                        PullRefreshState m2661rememberPullRefreshStateUuyPYSY2222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$52222, (Function0) rememberedValue102222, 0.0f, 0.0f, startRestartGroup, 0, 12);
                        Boolean valueOf3222 = Boolean.valueOf(z);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        if ((i8 & 7168) == 2048) {
                        }
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z6) {
                        }
                        rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf3222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                        Boolean valueOf22222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                        startRestartGroup.startReplaceGroup(5004770);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                        float f3222 = 12;
                        Modifier m1520paddingqDBjuR0$default2222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3222), 0.0f, Dp.m7774constructorimpl(f3222), 0.0f, 10, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy5222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222);
                        Function0<ComposeUiNode> constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance5222 = ColumnScopeInstance.INSTANCE;
                        String PagingListScreen$lambda$22222 = PagingListScreen$lambda$2(mutableState42222);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance2 = startRestartGroup.changedInstance(controller);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                                PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState42222, (String) obj);
                                return PagingListScreen$lambda$33$lambda$15$lambda$14;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        Function1 function1182222 = (Function1) rememberedValue6;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance3 = startRestartGroup.changedInstance(controller);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changedInstance3) {
                        }
                        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                                PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState42222, (String) obj);
                                return PagingListScreen$lambda$33$lambda$17$lambda$16;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                        Function1 function1192222 = (Function1) rememberedValue7;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance4 = startRestartGroup.changedInstance(controller);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changedInstance4) {
                        }
                        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                                PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState42222);
                                return PagingListScreen$lambda$33$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        Function0 function082222 = (Function0) rememberedValue8;
                        startRestartGroup.endReplaceGroup();
                        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        if ((234881024 & i12) == 67108864) {
                        }
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!z7) {
                        }
                        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                                PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                                return PagingListScreen$lambda$33$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                        Function1 function1202222 = (Function1) rememberedValue9;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1475152909);
                        if (z5) {
                        }
                        startRestartGroup.endReplaceGroup();
                        CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$22222, function1182222, onClickBack, function1192222, function082222, fillMaxWidth$default2222, false, false, function1202222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                        Modifier.Companion companion2222 = Modifier.INSTANCE;
                        if (PagingListScreen$lambda$8(mutableState2)) {
                        }
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion2222, m7774constructorimpl), startRestartGroup, 0);
                        Modifier pullRefresh$default2222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance5222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2222, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2222);
                        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                        if (z) {
                        }
                        function18 = function16;
                        composer2 = startRestartGroup;
                        mutableState3 = mutableState;
                        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY2222, boxScopeInstance2222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function19 = function18;
                        l3 = l5;
                        function110 = function115;
                        function04 = function06;
                        l4 = l6;
                        function111 = function116;
                        function112 = function117;
                        function05 = function07;
                        z8 = z5;
                        i27 = i34;
                        i28 = i35;
                        function22 = function23;
                        function113 = function17;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i7 |= i29;
                    i8 = i7;
                    i9 = i6 & 1024;
                    if (i9 != 0) {
                    }
                    i11 = i6 & 2048;
                    if (i11 != 0) {
                    }
                    i12 = i10;
                    i13 = i6 & 4096;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 8192;
                    if (i14 == 0) {
                    }
                    i15 = i6 & 16384;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 32768;
                    if (i16 == 0) {
                    }
                    i17 = i6 & 65536;
                    if (i17 == 0) {
                    }
                    i18 = i6 & 131072;
                    if (i18 == 0) {
                    }
                    i19 = i6 & 262144;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 524288;
                    if (i20 == 0) {
                    }
                    i21 = i6 & 1048576;
                    if (i21 == 0) {
                    }
                    i24 = i6 & 2097152;
                    if (i24 == 0) {
                    }
                    int i332222 = i23;
                    i25 = i6 & 4194304;
                    if (i25 == 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    State collectAsState22222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                    ProvidableCompositionLocal<Context> localContext22222 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22222 = startRestartGroup.consume(localContext22222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context22222 = (Context) consume22222;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState422222 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState2 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    boolean PagingListScreen$lambda$522222 = PagingListScreen$lambda$5(mutableState);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = startRestartGroup.changedInstance(controller);
                    Object rememberedValue1022222 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    rememberedValue1022222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit PagingListScreen$lambda$11$lambda$10;
                            PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                            return PagingListScreen$lambda$11$lambda$10;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue1022222);
                    startRestartGroup.endReplaceGroup();
                    PullRefreshState m2661rememberPullRefreshStateUuyPYSY22222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$522222, (Function0) rememberedValue1022222, 0.0f, 0.0f, startRestartGroup, 0, 12);
                    Boolean valueOf32222 = Boolean.valueOf(z);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    if ((i8 & 7168) == 2048) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf32222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                    Boolean valueOf222222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                    float f32222 = 12;
                    Modifier m1520paddingqDBjuR0$default22222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32222), 0.0f, Dp.m7774constructorimpl(f32222), 0.0f, 10, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy52222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap62222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22222);
                    Function0<ComposeUiNode> constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy52222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance52222 = ColumnScopeInstance.INSTANCE;
                    String PagingListScreen$lambda$222222 = PagingListScreen$lambda$2(mutableState422222);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance2 = startRestartGroup.changedInstance(controller);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                            PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState422222, (String) obj);
                            return PagingListScreen$lambda$33$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    Function1 function11822222 = (Function1) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance3 = startRestartGroup.changedInstance(controller);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                            PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState422222, (String) obj);
                            return PagingListScreen$lambda$33$lambda$17$lambda$16;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    Function1 function11922222 = (Function1) rememberedValue7;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance4 = startRestartGroup.changedInstance(controller);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                            PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState422222);
                            return PagingListScreen$lambda$33$lambda$19$lambda$18;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    Function0 function0822222 = (Function0) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    if ((234881024 & i12) == 67108864) {
                    }
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!z7) {
                    }
                    rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                            PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                            return PagingListScreen$lambda$33$lambda$21$lambda$20;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                    Function1 function12022222 = (Function1) rememberedValue9;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1475152909);
                    if (z5) {
                    }
                    startRestartGroup.endReplaceGroup();
                    CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$222222, function11822222, onClickBack, function11922222, function0822222, fillMaxWidth$default22222, false, false, function12022222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                    Modifier.Companion companion22222 = Modifier.INSTANCE;
                    if (PagingListScreen$lambda$8(mutableState2)) {
                    }
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion22222, m7774constructorimpl), startRestartGroup, 0);
                    Modifier pullRefresh$default22222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance52222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22222, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22222);
                    Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                    if (z) {
                    }
                    function18 = function16;
                    composer2 = startRestartGroup;
                    mutableState3 = mutableState;
                    PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY22222, boxScopeInstance22222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function19 = function18;
                    l3 = l5;
                    function110 = function115;
                    function04 = function06;
                    l4 = l6;
                    function111 = function116;
                    function112 = function117;
                    function05 = function07;
                    z8 = z5;
                    i27 = i34;
                    i28 = i35;
                    function22 = function23;
                    function113 = function17;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 |= i30;
                if ((i6 & 512) != 0) {
                }
                i7 |= i29;
                i8 = i7;
                i9 = i6 & 1024;
                if (i9 != 0) {
                }
                i11 = i6 & 2048;
                if (i11 != 0) {
                }
                i12 = i10;
                i13 = i6 & 4096;
                if (i13 != 0) {
                }
                i14 = i6 & 8192;
                if (i14 == 0) {
                }
                i15 = i6 & 16384;
                if (i15 != 0) {
                }
                i16 = i6 & 32768;
                if (i16 == 0) {
                }
                i17 = i6 & 65536;
                if (i17 == 0) {
                }
                i18 = i6 & 131072;
                if (i18 == 0) {
                }
                i19 = i6 & 262144;
                if (i19 == 0) {
                }
                i20 = i6 & 524288;
                if (i20 == 0) {
                }
                i21 = i6 & 1048576;
                if (i21 == 0) {
                }
                i24 = i6 & 2097152;
                if (i24 == 0) {
                }
                int i3322222 = i23;
                i25 = i6 & 4194304;
                if (i25 == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                State collectAsState222222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
                ProvidableCompositionLocal<Context> localContext222222 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222222 = startRestartGroup.consume(localContext222222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context222222 = (Context) consume222222;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState4222222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                boolean PagingListScreen$lambda$5222222 = PagingListScreen$lambda$5(mutableState);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(controller);
                Object rememberedValue10222222 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                rememberedValue10222222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit PagingListScreen$lambda$11$lambda$10;
                        PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                        return PagingListScreen$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10222222);
                startRestartGroup.endReplaceGroup();
                PullRefreshState m2661rememberPullRefreshStateUuyPYSY222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$5222222, (Function0) rememberedValue10222222, 0.0f, 0.0f, startRestartGroup, 0, 12);
                Boolean valueOf322222 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((i8 & 7168) == 2048) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z6) {
                }
                rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf322222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
                Boolean valueOf2222222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
                float f322222 = 12;
                Modifier m1520paddingqDBjuR0$default222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f322222), 0.0f, Dp.m7774constructorimpl(f322222), 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy522222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap622222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier622222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222222);
                Function0<ComposeUiNode> constructor622222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy522222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier622222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance522222 = ColumnScopeInstance.INSTANCE;
                String PagingListScreen$lambda$2222222 = PagingListScreen$lambda$2(mutableState4222222);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance2 = startRestartGroup.changedInstance(controller);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                        PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState4222222, (String) obj);
                        return PagingListScreen$lambda$33$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                Function1 function118222222 = (Function1) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance3 = startRestartGroup.changedInstance(controller);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                        PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState4222222, (String) obj);
                        return PagingListScreen$lambda$33$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
                Function1 function119222222 = (Function1) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance4 = startRestartGroup.changedInstance(controller);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                        PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState4222222);
                        return PagingListScreen$lambda$33$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                Function0 function08222222 = (Function0) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((234881024 & i12) == 67108864) {
                }
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                        PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                        return PagingListScreen$lambda$33$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
                Function1 function120222222 = (Function1) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1475152909);
                if (z5) {
                }
                startRestartGroup.endReplaceGroup();
                CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$2222222, function118222222, onClickBack, function119222222, function08222222, fillMaxWidth$default222222, false, false, function120222222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
                Modifier.Companion companion222222 = Modifier.INSTANCE;
                if (PagingListScreen$lambda$8(mutableState2)) {
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion222222, m7774constructorimpl), startRestartGroup, 0);
                Modifier pullRefresh$default222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance522222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY222222, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default222222);
                Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                if (z) {
                }
                function18 = function16;
                composer2 = startRestartGroup;
                mutableState3 = mutableState;
                PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY222222, boxScopeInstance222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                function19 = function18;
                l3 = l5;
                function110 = function115;
                function04 = function06;
                l4 = l6;
                function111 = function116;
                function112 = function117;
                function05 = function07;
                z8 = z5;
                i27 = i34;
                i28 = i35;
                function22 = function23;
                function113 = function17;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 |= i31;
            if ((i6 & 256) == 0) {
            }
            i7 |= i30;
            if ((i6 & 512) != 0) {
            }
            i7 |= i29;
            i8 = i7;
            i9 = i6 & 1024;
            if (i9 != 0) {
            }
            i11 = i6 & 2048;
            if (i11 != 0) {
            }
            i12 = i10;
            i13 = i6 & 4096;
            if (i13 != 0) {
            }
            i14 = i6 & 8192;
            if (i14 == 0) {
            }
            i15 = i6 & 16384;
            if (i15 != 0) {
            }
            i16 = i6 & 32768;
            if (i16 == 0) {
            }
            i17 = i6 & 65536;
            if (i17 == 0) {
            }
            i18 = i6 & 131072;
            if (i18 == 0) {
            }
            i19 = i6 & 262144;
            if (i19 == 0) {
            }
            i20 = i6 & 524288;
            if (i20 == 0) {
            }
            i21 = i6 & 1048576;
            if (i21 == 0) {
            }
            i24 = i6 & 2097152;
            if (i24 == 0) {
            }
            int i33222222 = i23;
            i25 = i6 & 4194304;
            if (i25 == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState2222222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
            ProvidableCompositionLocal<Context> localContext2222222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222222 = startRestartGroup.consume(localContext2222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2222222 = (Context) consume2222222;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState42222222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            boolean PagingListScreen$lambda$52222222 = PagingListScreen$lambda$5(mutableState);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue102222222 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            rememberedValue102222222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit PagingListScreen$lambda$11$lambda$10;
                    PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                    return PagingListScreen$lambda$11$lambda$10;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue102222222);
            startRestartGroup.endReplaceGroup();
            PullRefreshState m2661rememberPullRefreshStateUuyPYSY2222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$52222222, (Function0) rememberedValue102222222, 0.0f, 0.0f, startRestartGroup, 0, 12);
            Boolean valueOf3222222 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i8 & 7168) == 2048) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z6) {
            }
            rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
            Boolean valueOf22222222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
            float f3222222 = 12;
            Modifier m1520paddingqDBjuR0$default2222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3222222), 0.0f, Dp.m7774constructorimpl(f3222222), 0.0f, 10, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy5222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier6222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222222);
            Function0<ComposeUiNode> constructor6222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy5222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance5222222 = ColumnScopeInstance.INSTANCE;
            String PagingListScreen$lambda$22222222 = PagingListScreen$lambda$2(mutableState42222222);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance2 = startRestartGroup.changedInstance(controller);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                    PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState42222222, (String) obj);
                    return PagingListScreen$lambda$33$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            Function1 function1182222222 = (Function1) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance3 = startRestartGroup.changedInstance(controller);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                    PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState42222222, (String) obj);
                    return PagingListScreen$lambda$33$lambda$17$lambda$16;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            Function1 function1192222222 = (Function1) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance4 = startRestartGroup.changedInstance(controller);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                    PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState42222222);
                    return PagingListScreen$lambda$33$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            Function0 function082222222 = (Function0) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((234881024 & i12) == 67108864) {
            }
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!z7) {
            }
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                    PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                    return PagingListScreen$lambda$33$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            Function1 function1202222222 = (Function1) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1475152909);
            if (z5) {
            }
            startRestartGroup.endReplaceGroup();
            CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$22222222, function1182222222, onClickBack, function1192222222, function082222222, fillMaxWidth$default2222222, false, false, function1202222222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
            Modifier.Companion companion2222222 = Modifier.INSTANCE;
            if (PagingListScreen$lambda$8(mutableState2)) {
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion2222222, m7774constructorimpl), startRestartGroup, 0);
            Modifier pullRefresh$default2222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance5222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2222222, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2222222);
            Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
            if (z) {
            }
            function18 = function16;
            composer2 = startRestartGroup;
            mutableState3 = mutableState;
            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY2222222, boxScopeInstance2222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            function19 = function18;
            l3 = l5;
            function110 = function115;
            function04 = function06;
            l4 = l6;
            function111 = function116;
            function112 = function117;
            function05 = function07;
            z8 = z5;
            i27 = i34;
            i28 = i35;
            function22 = function23;
            function113 = function17;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 |= i32;
        if ((i6 & 128) != 0) {
        }
        i7 |= i31;
        if ((i6 & 256) == 0) {
        }
        i7 |= i30;
        if ((i6 & 512) != 0) {
        }
        i7 |= i29;
        i8 = i7;
        i9 = i6 & 1024;
        if (i9 != 0) {
        }
        i11 = i6 & 2048;
        if (i11 != 0) {
        }
        i12 = i10;
        i13 = i6 & 4096;
        if (i13 != 0) {
        }
        i14 = i6 & 8192;
        if (i14 == 0) {
        }
        i15 = i6 & 16384;
        if (i15 != 0) {
        }
        i16 = i6 & 32768;
        if (i16 == 0) {
        }
        i17 = i6 & 65536;
        if (i17 == 0) {
        }
        i18 = i6 & 131072;
        if (i18 == 0) {
        }
        i19 = i6 & 262144;
        if (i19 == 0) {
        }
        i20 = i6 & 524288;
        if (i20 == 0) {
        }
        i21 = i6 & 1048576;
        if (i21 == 0) {
        }
        i24 = i6 & 2097152;
        if (i24 == 0) {
        }
        int i332222222 = i23;
        i25 = i6 & 4194304;
        if (i25 == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState22222222 = SnapshotStateKt.collectAsState(controller.getCanRetry(), null, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Context> localContext22222222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222222 = startRestartGroup.consume(localContext22222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22222222 = (Context) consume22222222;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState422222222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        boolean PagingListScreen$lambda$522222222 = PagingListScreen$lambda$5(mutableState);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(controller);
        Object rememberedValue1022222222 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        rememberedValue1022222222 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit PagingListScreen$lambda$11$lambda$10;
                PagingListScreen$lambda$11$lambda$10 = PagingListScreenKt.PagingListScreen$lambda$11$lambda$10(BasePagingController.this, mutableState);
                return PagingListScreen$lambda$11$lambda$10;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue1022222222);
        startRestartGroup.endReplaceGroup();
        PullRefreshState m2661rememberPullRefreshStateUuyPYSY22222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(PagingListScreen$lambda$522222222, (Function0) rememberedValue1022222222, 0.0f, 0.0f, startRestartGroup, 0, 12);
        Boolean valueOf32222222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i8 & 7168) == 2048) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue4 = (Function2) new PagingListScreenKt$PagingListScreen$1$1(z, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i8 >> 9) & 14);
        Boolean valueOf222222222 = Boolean.valueOf(PagingListScreen$lambda$5(mutableState));
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
        float f32222222 = 12;
        Modifier m1520paddingqDBjuR0$default22222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32222222), 0.0f, Dp.m7774constructorimpl(f32222222), 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy52222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap62222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier62222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22222222);
        Function0<ComposeUiNode> constructor62222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy52222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier62222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance52222222 = ColumnScopeInstance.INSTANCE;
        String PagingListScreen$lambda$222222222 = PagingListScreen$lambda$2(mutableState422222222);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance2 = startRestartGroup.changedInstance(controller);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit PagingListScreen$lambda$33$lambda$15$lambda$14;
                PagingListScreen$lambda$33$lambda$15$lambda$14 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController.this, mutableState422222222, (String) obj);
                return PagingListScreen$lambda$33$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        Function1 function11822222222 = (Function1) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance3 = startRestartGroup.changedInstance(controller);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit PagingListScreen$lambda$33$lambda$17$lambda$16;
                PagingListScreen$lambda$33$lambda$17$lambda$16 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController.this, mutableState422222222, (String) obj);
                return PagingListScreen$lambda$33$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        Function1 function11922222222 = (Function1) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance4 = startRestartGroup.changedInstance(controller);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit PagingListScreen$lambda$33$lambda$19$lambda$18;
                PagingListScreen$lambda$33$lambda$19$lambda$18 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController.this, mutableState422222222);
                return PagingListScreen$lambda$33$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        Function0 function0822222222 = (Function0) rememberedValue8;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default22222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((234881024 & i12) == 67108864) {
        }
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!z7) {
        }
        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.PagingListScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit PagingListScreen$lambda$33$lambda$21$lambda$20;
                PagingListScreen$lambda$33$lambda$21$lambda$20 = PagingListScreenKt.PagingListScreen$lambda$33$lambda$21$lambda$20(Function1.this, mutableState2, ((Boolean) obj).booleanValue());
                return PagingListScreen$lambda$33$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        Function1 function12022222222 = (Function1) rememberedValue9;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1475152909);
        if (z5) {
        }
        startRestartGroup.endReplaceGroup();
        CustomSearchBarKt.CustomSearchBar(PagingListScreen$lambda$222222222, function11822222222, onClickBack, function11922222222, function0822222222, fillMaxWidth$default22222222, false, false, function12022222222, function03, startRestartGroup, ((i8 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 192);
        Modifier.Companion companion22222222 = Modifier.INSTANCE;
        if (PagingListScreen$lambda$8(mutableState2)) {
        }
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion22222222, m7774constructorimpl), startRestartGroup, 0);
        Modifier pullRefresh$default22222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance52222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22222222, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22222222);
        Function0<ComposeUiNode> constructor222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
        if (z) {
        }
        function18 = function16;
        composer2 = startRestartGroup;
        mutableState3 = mutableState;
        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(PagingListScreen$lambda$5(mutableState3), m2661rememberPullRefreshStateUuyPYSY22222222, boxScopeInstance22222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, PullRefreshState.$stable << 3, 32);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function19 = function18;
        l3 = l5;
        function110 = function115;
        function04 = function06;
        l4 = l6;
        function111 = function116;
        function112 = function117;
        function05 = function07;
        z8 = z5;
        i27 = i34;
        i28 = i35;
        function22 = function23;
        function113 = function17;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final String PagingListScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PagingListScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PagingListScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean PagingListScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PagingListScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$11$lambda$10(BasePagingController basePagingController, MutableState mutableState) {
        PagingListScreen$lambda$6(mutableState, true);
        basePagingController.refresh();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$15$lambda$14(BasePagingController basePagingController, MutableState mutableState, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        mutableState.setValue(newValue);
        basePagingController.performSearch(newValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$17$lambda$16(BasePagingController basePagingController, MutableState mutableState, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        mutableState.setValue(searchQuery);
        basePagingController.performSearch(searchQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$19$lambda$18(BasePagingController basePagingController, MutableState mutableState) {
        mutableState.setValue("");
        basePagingController.resetSearchState();
        basePagingController.performSearch("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$21$lambda$20(Function1 function1, MutableState mutableState, boolean z) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        PagingListScreen$lambda$9(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$24$lambda$23(Context context) {
        FragmentManager supportFragmentManager;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            SearchBottomSheetFragment.INSTANCE.showDialog(supportFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$32$lambda$28$lambda$27$lambda$26(BasePagingController basePagingController) {
        basePagingController.retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagingListScreen$lambda$33$lambda$32$lambda$31$lambda$30(boolean z, boolean z2, BasePagingController basePagingController) {
        if (z && !z2) {
            Log.d("PagingListScreen", "onLoadMore triggered, calling controller.loadNextPage()");
            basePagingController.loadNextPage();
        }
        return Unit.INSTANCE;
    }

    private static final boolean PagingListScreen$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
