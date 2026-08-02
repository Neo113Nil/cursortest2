package org.betup.ui.fragment.matches.compose;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.FavoriteStarButtonKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SportsList.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a×\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aß\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010#\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020\bH\u0007¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"SportsList", "", "sports", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "onLoadMore", "Lkotlin/Function0;", "isLoadingMore", "", "hasMore", "onAddToFavorite", "Lkotlin/Function1;", "onDeleteFromFavorite", "onRowClickOverride", "topPadding", "Landroidx/compose/ui/unit/Dp;", "tourSportId", "", "onTourSportItemBounds", "Landroid/graphics/Rect;", "onTourSportItemId", "onSportScrollComplete", "tourLeagueId", "onTourLeagueItemBounds", "onTourLeagueItemId", "onLeagueScrollComplete", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "onListPositionChanged", "Lkotlin/Function2;", "SportsList-BUBvxpI", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "SportItem", "sport", "isFirstItem", "isFirstLeagueItem", "(Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SportsListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportItem$lambda$24(SportListItemUiModel sportListItemUiModel, Function1 function1, Function1 function12, Function0 function0, Long l, Function1 function13, Function1 function14, boolean z, Long l2, Function1 function15, Function1 function16, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        SportItem(sportListItemUiModel, function1, function12, function0, l, function13, function14, z, l2, function15, function16, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsList_BUBvxpI$lambda$9(List list, Function0 function0, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, float f, Long l, Function1 function14, Function1 function15, Function0 function02, Long l2, Function1 function16, Function1 function17, Function0 function03, int i, int i2, Function2 function2, int i3, int i4, int i5, Composer composer, int i6) {
        m13963SportsListBUBvxpI(list, function0, z, z2, function1, function12, function13, f, l, function14, function15, function02, l2, function16, function17, function03, i, i2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c3  */
    /* renamed from: SportsList-BUBvxpI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13963SportsListBUBvxpI(final List<SportListItemUiModel> sports, final Function0<Unit> onLoadMore, final boolean z, final boolean z2, final Function1<? super SportListItemUiModel, Unit> onAddToFavorite, final Function1<? super SportListItemUiModel, Unit> onDeleteFromFavorite, Function1<? super SportListItemUiModel, Unit> function1, float f, Long l, Function1<? super Rect, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Long l2, Function1<? super Rect, Unit> function14, Function1<? super Long, Unit> function15, Function0<Unit> function02, int i, int i2, Function2<? super Integer, ? super Integer, Unit> function2, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
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
        Function1<? super SportListItemUiModel, Unit> function16;
        Long l3;
        Function1<? super Rect, Unit> function17;
        Function1<? super Long, Unit> function18;
        Long l4;
        Function1<? super Rect, Unit> function19;
        Function1<? super Long, Unit> function110;
        Function0<Unit> function03;
        Function2<? super Integer, ? super Integer, Unit> function22;
        Function0<Unit> function04;
        boolean z3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Function2<? super Integer, ? super Integer, Unit> function23;
        Object obj;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changedInstance2;
        Object rememberedValue4;
        final Long l5;
        final Function1<? super SportListItemUiModel, Unit> function111;
        Function1<? super Rect, Unit> function112;
        Function1<? super Long, Unit> function113;
        final Long l6;
        final Function0<Unit> function05;
        final int i22;
        final int i23;
        final float f2;
        final Function1<? super Rect, Unit> function114;
        final Function2<? super Integer, ? super Integer, Unit> function24;
        final Function1<? super Long, Unit> function115;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(sports, "sports");
        Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
        Intrinsics.checkNotNullParameter(onAddToFavorite, "onAddToFavorite");
        Intrinsics.checkNotNullParameter(onDeleteFromFavorite, "onDeleteFromFavorite");
        Composer startRestartGroup = composer.startRestartGroup(-1960675622);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changedInstance(sports) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(onLoadMore) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i5 & 8) == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i5 & 16) != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i6 |= startRestartGroup.changedInstance(onAddToFavorite) ? 16384 : 8192;
                }
                if ((i5 & 32) != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changedInstance(onDeleteFromFavorite) ? 131072 : 65536;
                }
                i7 = i5 & 64;
                if (i7 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                }
                i8 = i5 & 128;
                if (i8 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i6 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                }
                i9 = i5 & 256;
                if (i9 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i6 |= startRestartGroup.changed(l) ? 67108864 : 33554432;
                }
                i10 = i5 & 512;
                if (i10 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i6 |= startRestartGroup.changedInstance(function12) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i11 = i5 & 1024;
                if (i11 != 0) {
                    i12 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    i12 = i4 | (startRestartGroup.changedInstance(function13) ? 4 : 2);
                } else {
                    i12 = i4;
                }
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i4 & 48) == 0) {
                    i12 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                }
                int i24 = i12;
                i14 = i5 & 4096;
                if (i14 != 0) {
                    i24 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i24 |= startRestartGroup.changed(l2) ? 256 : 128;
                    i15 = i5 & 8192;
                    if (i15 == 0) {
                        i24 |= 3072;
                    } else if ((i4 & 3072) == 0) {
                        i24 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                        i16 = i5 & 16384;
                        if (i16 != 0) {
                            i24 |= 24576;
                        } else if ((i4 & 24576) == 0) {
                            i24 |= startRestartGroup.changedInstance(function15) ? 16384 : 8192;
                            i17 = i5 & 32768;
                            if (i17 == 0) {
                                i24 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i24 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                            }
                            i18 = i5 & 65536;
                            if (i18 == 0) {
                                i24 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i24 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                            }
                            i19 = i5 & 131072;
                            if (i19 == 0) {
                                i24 |= 12582912;
                                i20 = i2;
                            } else {
                                i20 = i2;
                                if ((i4 & 12582912) == 0) {
                                    i24 |= startRestartGroup.changed(i20) ? 8388608 : 4194304;
                                }
                            }
                            i21 = i5 & 262144;
                            if (i21 == 0) {
                                i24 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i24 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                            }
                            if ((i6 & 306783379) != 306783378 && (38347923 & i24) == 38347922 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                function111 = function1;
                                f2 = f;
                                l6 = l;
                                function114 = function12;
                                function115 = function13;
                                function05 = function0;
                                l5 = l2;
                                function113 = function15;
                                function03 = function02;
                                i22 = i;
                                function24 = function2;
                                i23 = i20;
                                function112 = function14;
                            } else {
                                function16 = i7 == 0 ? null : function1;
                                float m7774constructorimpl = i8 == 0 ? Dp.m7774constructorimpl(0) : f;
                                l3 = i9 == 0 ? null : l;
                                function17 = i10 == 0 ? null : function12;
                                function18 = i11 == 0 ? null : function13;
                                Function0<Unit> function06 = i13 == 0 ? null : function0;
                                l4 = i14 == 0 ? null : l2;
                                function19 = i15 == 0 ? null : function14;
                                function110 = i16 == 0 ? null : function15;
                                function03 = i17 == 0 ? null : function02;
                                int i25 = i18 == 0 ? 0 : i;
                                if (i19 != 0) {
                                    i20 = 0;
                                }
                                function22 = i21 == 0 ? null : function2;
                                if (ComposerKt.isTraceInProgress()) {
                                    function04 = function06;
                                } else {
                                    function04 = function06;
                                    ComposerKt.traceEventStart(-1960675622, i6, i24, "org.betup.ui.fragment.matches.compose.SportsList (SportsList.kt:66)");
                                }
                                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i24 >> 18) & 126, 0);
                                int i26 = i25;
                                int i27 = i20;
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                                PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
                                Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
                                startRestartGroup.startReplaceGroup(-1224400529);
                                float f3 = m7774constructorimpl;
                                int i28 = 234881024 & i6;
                                boolean changedInstance3 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i28 != 67108864) | ((1879048192 & i6) != 536870912) | ((i24 & 14) != 4);
                                int i29 = i24 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                                boolean z4 = changedInstance3 | (i29 != 256) | ((i24 & 7168) != 2048) | ((57344 & i24) != 16384);
                                int i30 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                                int i31 = i6 & 7168;
                                int i32 = i24;
                                z3 = z4 | (i30 != 256) | (i31 != 2048);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final Function1<? super SportListItemUiModel, Unit> function116 = function16;
                                    final Long l7 = l3;
                                    final Function1<? super Rect, Unit> function117 = function17;
                                    final Function1<? super Long, Unit> function118 = function18;
                                    final Long l8 = l4;
                                    final Function1<? super Rect, Unit> function119 = function19;
                                    final Function1<? super Long, Unit> function120 = function110;
                                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                                            SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function116, l7, function117, function118, l8, function119, function120, (LazyListScope) obj2);
                                            return SportsList_BUBvxpI$lambda$4$lambda$3;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState, m1513PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
                                Boolean valueOf = Boolean.valueOf(z2);
                                Boolean valueOf2 = Boolean.valueOf(z);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                Function1<? super Rect, Unit> function121 = function17;
                                changed = (i30 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changedInstance(sports) | (i31 != 2048) | ((i6 & 112) != 32);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState, sports, z, z2, onLoadMore, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i30);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | ((i32 & 234881024) != 67108864);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    function23 = function22;
                                    obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState, function23, null);
                                    startRestartGroup.updateRememberedValue(obj);
                                } else {
                                    obj = rememberedValue5;
                                    function23 = function22;
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
                                Boolean valueOf3 = Boolean.valueOf(z);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changedInstance = (i28 != 67108864) | startRestartGroup.changedInstance(sports) | (i30 != 256) | ((i32 & 112) != 32);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                Function2 function25 = (Function2) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                int i33 = i6 & 14;
                                EffectsKt.LaunchedEffect(sports, l3, valueOf3, function25, startRestartGroup, ((i6 >> 21) & 112) | i33 | i30);
                                Boolean valueOf4 = Boolean.valueOf(z);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changedInstance2 = (i29 != 256) | startRestartGroup.changedInstance(sports) | (i30 != 256) | ((i32 & 458752) == 131072);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(sports, l4, valueOf4, (Function2) rememberedValue4, startRestartGroup, i30 | ((i32 >> 3) & 112) | i33);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                l5 = l4;
                                function111 = function16;
                                function112 = function19;
                                function113 = function110;
                                l6 = l3;
                                function05 = function04;
                                i22 = i26;
                                i23 = i27;
                                f2 = f3;
                                function114 = function121;
                                function24 = function23;
                                function115 = function18;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Function1<? super Rect, Unit> function122 = function112;
                                final Function1<? super Long, Unit> function123 = function113;
                                final Function0<Unit> function07 = function03;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        Unit SportsList_BUBvxpI$lambda$9;
                                        SportsList_BUBvxpI$lambda$9 = SportsListKt.SportsList_BUBvxpI$lambda$9(sports, onLoadMore, z, z2, onAddToFavorite, onDeleteFromFavorite, function111, f2, l6, function114, function115, function05, l5, function122, function123, function07, i22, i23, function24, i3, i4, i5, (Composer) obj2, ((Integer) obj3).intValue());
                                        return SportsList_BUBvxpI$lambda$9;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i17 = i5 & 32768;
                        if (i17 == 0) {
                        }
                        i18 = i5 & 65536;
                        if (i18 == 0) {
                        }
                        i19 = i5 & 131072;
                        if (i19 == 0) {
                        }
                        i21 = i5 & 262144;
                        if (i21 == 0) {
                        }
                        if ((i6 & 306783379) != 306783378) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i24 >> 18) & 126, 0);
                        int i262 = i25;
                        int i272 = i20;
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                        PaddingValues m1513PaddingValuesa9UjIt4$default2 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
                        Arrangement.HorizontalOrVertical horizontalOrVertical2 = m1397spacedBy0680j_42;
                        startRestartGroup.startReplaceGroup(-1224400529);
                        float f32 = m7774constructorimpl;
                        int i282 = 234881024 & i6;
                        boolean changedInstance32 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i282 != 67108864) | ((1879048192 & i6) != 536870912) | ((i24 & 14) != 4);
                        int i292 = i24 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                        boolean z42 = changedInstance32 | (i292 != 256) | ((i24 & 7168) != 2048) | ((57344 & i24) != 16384);
                        int i302 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                        int i312 = i6 & 7168;
                        int i322 = i24;
                        z3 = z42 | (i302 != 256) | (i312 != 2048);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        final Function1 function1162 = function16;
                        final Long l72 = l3;
                        final Function1 function1172 = function17;
                        final Function1 function1182 = function18;
                        final Long l82 = l4;
                        final Function1 function1192 = function19;
                        final Function1 function1202 = function110;
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                                SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function1162, l72, function1172, function1182, l82, function1192, function1202, (LazyListScope) obj2);
                                return SportsList_BUBvxpI$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState2, m1513PaddingValuesa9UjIt4$default2, false, horizontalOrVertical2, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
                        Boolean valueOf5 = Boolean.valueOf(z2);
                        Boolean valueOf22 = Boolean.valueOf(z);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        Function1<? super Rect, Unit> function1212 = function17;
                        changed = (i302 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState2) | startRestartGroup.changedInstance(sports) | (i312 != 2048) | ((i6 & 112) != 32);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState2, sports, z, z2, onLoadMore, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState2, valueOf5, valueOf22, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i302);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState2) | ((i322 & 234881024) != 67108864);
                        Object rememberedValue52 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        function23 = function22;
                        obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState2, function23, null);
                        startRestartGroup.updateRememberedValue(obj);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
                        Boolean valueOf32 = Boolean.valueOf(z);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changedInstance = (i282 != 67108864) | startRestartGroup.changedInstance(sports) | (i302 != 256) | ((i322 & 112) != 32);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        Function2 function252 = (Function2) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        int i332 = i6 & 14;
                        EffectsKt.LaunchedEffect(sports, l3, valueOf32, function252, startRestartGroup, ((i6 >> 21) & 112) | i332 | i302);
                        Boolean valueOf42 = Boolean.valueOf(z);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changedInstance2 = (i292 != 256) | startRestartGroup.changedInstance(sports) | (i302 != 256) | ((i322 & 458752) == 131072);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(sports, l4, valueOf42, (Function2) rememberedValue4, startRestartGroup, i302 | ((i322 >> 3) & 112) | i332);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        l5 = l4;
                        function111 = function16;
                        function112 = function19;
                        function113 = function110;
                        l6 = l3;
                        function05 = function04;
                        i22 = i262;
                        i23 = i272;
                        f2 = f32;
                        function114 = function1212;
                        function24 = function23;
                        function115 = function18;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i16 = i5 & 16384;
                    if (i16 != 0) {
                    }
                    i17 = i5 & 32768;
                    if (i17 == 0) {
                    }
                    i18 = i5 & 65536;
                    if (i18 == 0) {
                    }
                    i19 = i5 & 131072;
                    if (i19 == 0) {
                    }
                    i21 = i5 & 262144;
                    if (i21 == 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LazyListState rememberLazyListStateWithoutSavedState22 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i24 >> 18) & 126, 0);
                    int i2622 = i25;
                    int i2722 = i20;
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                    PaddingValues m1513PaddingValuesa9UjIt4$default22 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
                    Arrangement.HorizontalOrVertical horizontalOrVertical22 = m1397spacedBy0680j_422;
                    startRestartGroup.startReplaceGroup(-1224400529);
                    float f322 = m7774constructorimpl;
                    int i2822 = 234881024 & i6;
                    boolean changedInstance322 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i2822 != 67108864) | ((1879048192 & i6) != 536870912) | ((i24 & 14) != 4);
                    int i2922 = i24 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                    boolean z422 = changedInstance322 | (i2922 != 256) | ((i24 & 7168) != 2048) | ((57344 & i24) != 16384);
                    int i3022 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                    int i3122 = i6 & 7168;
                    int i3222 = i24;
                    z3 = z422 | (i3022 != 256) | (i3122 != 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    final Function1 function11622 = function16;
                    final Long l722 = l3;
                    final Function1 function11722 = function17;
                    final Function1 function11822 = function18;
                    final Long l822 = l4;
                    final Function1 function11922 = function19;
                    final Function1 function12022 = function110;
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                            SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function11622, l722, function11722, function11822, l822, function11922, function12022, (LazyListScope) obj2);
                            return SportsList_BUBvxpI$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState22, m1513PaddingValuesa9UjIt4$default22, false, horizontalOrVertical22, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
                    Boolean valueOf52 = Boolean.valueOf(z2);
                    Boolean valueOf222 = Boolean.valueOf(z);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    Function1<? super Rect, Unit> function12122 = function17;
                    changed = (i3022 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState22) | startRestartGroup.changedInstance(sports) | (i3122 != 2048) | ((i6 & 112) != 32);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState22, sports, z, z2, onLoadMore, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState22, valueOf52, valueOf222, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i3022);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState22) | ((i3222 & 234881024) != 67108864);
                    Object rememberedValue522 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    function23 = function22;
                    obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState22, function23, null);
                    startRestartGroup.updateRememberedValue(obj);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
                    Boolean valueOf322 = Boolean.valueOf(z);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance = (i2822 != 67108864) | startRestartGroup.changedInstance(sports) | (i3022 != 256) | ((i3222 & 112) != 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    Function2 function2522 = (Function2) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    int i3322 = i6 & 14;
                    EffectsKt.LaunchedEffect(sports, l3, valueOf322, function2522, startRestartGroup, ((i6 >> 21) & 112) | i3322 | i3022);
                    Boolean valueOf422 = Boolean.valueOf(z);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance2 = (i2922 != 256) | startRestartGroup.changedInstance(sports) | (i3022 != 256) | ((i3222 & 458752) == 131072);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(sports, l4, valueOf422, (Function2) rememberedValue4, startRestartGroup, i3022 | ((i3222 >> 3) & 112) | i3322);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    l5 = l4;
                    function111 = function16;
                    function112 = function19;
                    function113 = function110;
                    l6 = l3;
                    function05 = function04;
                    i22 = i2622;
                    i23 = i2722;
                    f2 = f322;
                    function114 = function12122;
                    function24 = function23;
                    function115 = function18;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i15 = i5 & 8192;
                if (i15 == 0) {
                }
                i16 = i5 & 16384;
                if (i16 != 0) {
                }
                i17 = i5 & 32768;
                if (i17 == 0) {
                }
                i18 = i5 & 65536;
                if (i18 == 0) {
                }
                i19 = i5 & 131072;
                if (i19 == 0) {
                }
                i21 = i5 & 262144;
                if (i21 == 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 != 0) {
                }
                if (i21 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                LazyListState rememberLazyListStateWithoutSavedState222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i24 >> 18) & 126, 0);
                int i26222 = i25;
                int i27222 = i20;
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                PaddingValues m1513PaddingValuesa9UjIt4$default222 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical222 = m1397spacedBy0680j_4222;
                startRestartGroup.startReplaceGroup(-1224400529);
                float f3222 = m7774constructorimpl;
                int i28222 = 234881024 & i6;
                boolean changedInstance3222 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i28222 != 67108864) | ((1879048192 & i6) != 536870912) | ((i24 & 14) != 4);
                int i29222 = i24 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                boolean z4222 = changedInstance3222 | (i29222 != 256) | ((i24 & 7168) != 2048) | ((57344 & i24) != 16384);
                int i30222 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                int i31222 = i6 & 7168;
                int i32222 = i24;
                z3 = z4222 | (i30222 != 256) | (i31222 != 2048);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                final Function1 function116222 = function16;
                final Long l7222 = l3;
                final Function1 function117222 = function17;
                final Function1 function118222 = function18;
                final Long l8222 = l4;
                final Function1 function119222 = function19;
                final Function1 function120222 = function110;
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                        SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function116222, l7222, function117222, function118222, l8222, function119222, function120222, (LazyListScope) obj2);
                        return SportsList_BUBvxpI$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState222, m1513PaddingValuesa9UjIt4$default222, false, horizontalOrVertical222, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
                Boolean valueOf522 = Boolean.valueOf(z2);
                Boolean valueOf2222 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(-1224400529);
                Function1<? super Rect, Unit> function121222 = function17;
                changed = (i30222 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState222) | startRestartGroup.changedInstance(sports) | (i31222 != 2048) | ((i6 & 112) != 32);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState222, sports, z, z2, onLoadMore, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState222, valueOf522, valueOf2222, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i30222);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState222) | ((i32222 & 234881024) != 67108864);
                Object rememberedValue5222 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                function23 = function22;
                obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState222, function23, null);
                startRestartGroup.updateRememberedValue(obj);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
                Boolean valueOf3222 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = (i28222 != 67108864) | startRestartGroup.changedInstance(sports) | (i30222 != 256) | ((i32222 & 112) != 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Function2 function25222 = (Function2) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                int i33222 = i6 & 14;
                EffectsKt.LaunchedEffect(sports, l3, valueOf3222, function25222, startRestartGroup, ((i6 >> 21) & 112) | i33222 | i30222);
                Boolean valueOf4222 = Boolean.valueOf(z);
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance2 = (i29222 != 256) | startRestartGroup.changedInstance(sports) | (i30222 != 256) | ((i32222 & 458752) == 131072);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(sports, l4, valueOf4222, (Function2) rememberedValue4, startRestartGroup, i30222 | ((i32222 >> 3) & 112) | i33222);
                if (ComposerKt.isTraceInProgress()) {
                }
                l5 = l4;
                function111 = function16;
                function112 = function19;
                function113 = function110;
                l6 = l3;
                function05 = function04;
                i22 = i26222;
                i23 = i27222;
                f2 = f3222;
                function114 = function121222;
                function24 = function23;
                function115 = function18;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i5 & 16) != 0) {
            }
            if ((i5 & 32) != 0) {
            }
            i7 = i5 & 64;
            if (i7 != 0) {
            }
            i8 = i5 & 128;
            if (i8 != 0) {
            }
            i9 = i5 & 256;
            if (i9 != 0) {
            }
            i10 = i5 & 512;
            if (i10 != 0) {
            }
            i11 = i5 & 1024;
            if (i11 != 0) {
            }
            i13 = i5 & 2048;
            if (i13 != 0) {
            }
            int i242 = i12;
            i14 = i5 & 4096;
            if (i14 != 0) {
            }
            i15 = i5 & 8192;
            if (i15 == 0) {
            }
            i16 = i5 & 16384;
            if (i16 != 0) {
            }
            i17 = i5 & 32768;
            if (i17 == 0) {
            }
            i18 = i5 & 65536;
            if (i18 == 0) {
            }
            i19 = i5 & 131072;
            if (i19 == 0) {
            }
            i21 = i5 & 262144;
            if (i21 == 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 != 0) {
            }
            if (i21 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState rememberLazyListStateWithoutSavedState2222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i242 >> 18) & 126, 0);
            int i262222 = i25;
            int i272222 = i20;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            PaddingValues m1513PaddingValuesa9UjIt4$default2222 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical2222 = m1397spacedBy0680j_42222;
            startRestartGroup.startReplaceGroup(-1224400529);
            float f32222 = m7774constructorimpl;
            int i282222 = 234881024 & i6;
            boolean changedInstance32222 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i282222 != 67108864) | ((1879048192 & i6) != 536870912) | ((i242 & 14) != 4);
            int i292222 = i242 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            boolean z42222 = changedInstance32222 | (i292222 != 256) | ((i242 & 7168) != 2048) | ((57344 & i242) != 16384);
            int i302222 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            int i312222 = i6 & 7168;
            int i322222 = i242;
            z3 = z42222 | (i302222 != 256) | (i312222 != 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            final Function1 function1162222 = function16;
            final Long l72222 = l3;
            final Function1 function1172222 = function17;
            final Function1 function1182222 = function18;
            final Long l82222 = l4;
            final Function1 function1192222 = function19;
            final Function1 function1202222 = function110;
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                    SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function1162222, l72222, function1172222, function1182222, l82222, function1192222, function1202222, (LazyListScope) obj2);
                    return SportsList_BUBvxpI$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState2222, m1513PaddingValuesa9UjIt4$default2222, false, horizontalOrVertical2222, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
            Boolean valueOf5222 = Boolean.valueOf(z2);
            Boolean valueOf22222 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1224400529);
            Function1<? super Rect, Unit> function1212222 = function17;
            changed = (i302222 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState2222) | startRestartGroup.changedInstance(sports) | (i312222 != 2048) | ((i6 & 112) != 32);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState2222, sports, z, z2, onLoadMore, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState2222, valueOf5222, valueOf22222, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i302222);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState2222) | ((i322222 & 234881024) != 67108864);
            Object rememberedValue52222 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            function23 = function22;
            obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState2222, function23, null);
            startRestartGroup.updateRememberedValue(obj);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
            Boolean valueOf32222 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance = (i282222 != 67108864) | startRestartGroup.changedInstance(sports) | (i302222 != 256) | ((i322222 & 112) != 32);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function2 function252222 = (Function2) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            int i332222 = i6 & 14;
            EffectsKt.LaunchedEffect(sports, l3, valueOf32222, function252222, startRestartGroup, ((i6 >> 21) & 112) | i332222 | i302222);
            Boolean valueOf42222 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance2 = (i292222 != 256) | startRestartGroup.changedInstance(sports) | (i302222 != 256) | ((i322222 & 458752) == 131072);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(sports, l4, valueOf42222, (Function2) rememberedValue4, startRestartGroup, i302222 | ((i322222 >> 3) & 112) | i332222);
            if (ComposerKt.isTraceInProgress()) {
            }
            l5 = l4;
            function111 = function16;
            function112 = function19;
            function113 = function110;
            l6 = l3;
            function05 = function04;
            i22 = i262222;
            i23 = i272222;
            f2 = f32222;
            function114 = function1212222;
            function24 = function23;
            function115 = function18;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) != 0) {
        }
        i7 = i5 & 64;
        if (i7 != 0) {
        }
        i8 = i5 & 128;
        if (i8 != 0) {
        }
        i9 = i5 & 256;
        if (i9 != 0) {
        }
        i10 = i5 & 512;
        if (i10 != 0) {
        }
        i11 = i5 & 1024;
        if (i11 != 0) {
        }
        i13 = i5 & 2048;
        if (i13 != 0) {
        }
        int i2422 = i12;
        i14 = i5 & 4096;
        if (i14 != 0) {
        }
        i15 = i5 & 8192;
        if (i15 == 0) {
        }
        i16 = i5 & 16384;
        if (i16 != 0) {
        }
        i17 = i5 & 32768;
        if (i17 == 0) {
        }
        i18 = i5 & 65536;
        if (i18 == 0) {
        }
        i19 = i5 & 131072;
        if (i19 == 0) {
        }
        i21 = i5 & 262144;
        if (i21 == 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 != 0) {
        }
        if (i21 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyListState rememberLazyListStateWithoutSavedState22222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(i25, i20, startRestartGroup, (i2422 >> 18) & 126, 0);
        int i2622222 = i25;
        int i2722222 = i20;
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        PaddingValues m1513PaddingValuesa9UjIt4$default22222 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
        Arrangement.HorizontalOrVertical horizontalOrVertical22222 = m1397spacedBy0680j_422222;
        startRestartGroup.startReplaceGroup(-1224400529);
        float f322222 = m7774constructorimpl;
        int i2822222 = 234881024 & i6;
        boolean changedInstance322222 = ((458752 & i6) != 131072) | startRestartGroup.changedInstance(sports) | ((i6 & 57344) != 16384) | ((3670016 & i6) != 1048576) | (i2822222 != 67108864) | ((1879048192 & i6) != 536870912) | ((i2422 & 14) != 4);
        int i2922222 = i2422 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        boolean z422222 = changedInstance322222 | (i2922222 != 256) | ((i2422 & 7168) != 2048) | ((57344 & i2422) != 16384);
        int i3022222 = i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        int i3122222 = i6 & 7168;
        int i3222222 = i2422;
        z3 = z422222 | (i3022222 != 256) | (i3122222 != 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        final Function1 function11622222 = function16;
        final Long l722222 = l3;
        final Function1 function11722222 = function17;
        final Function1 function11822222 = function18;
        final Long l822222 = l4;
        final Function1 function11922222 = function19;
        final Function1 function12022222 = function110;
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit SportsList_BUBvxpI$lambda$4$lambda$3;
                SportsList_BUBvxpI$lambda$4$lambda$3 = SportsListKt.SportsList_BUBvxpI$lambda$4$lambda$3(sports, z, z2, onAddToFavorite, onDeleteFromFavorite, function11622222, l722222, function11722222, function11822222, l822222, function11922222, function12022222, (LazyListScope) obj2);
                return SportsList_BUBvxpI$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        LazyDslKt.LazyColumn(null, rememberLazyListStateWithoutSavedState22222, m1513PaddingValuesa9UjIt4$default22222, false, horizontalOrVertical22222, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24576, 489);
        Boolean valueOf52222 = Boolean.valueOf(z2);
        Boolean valueOf222222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(-1224400529);
        Function1<? super Rect, Unit> function12122222 = function17;
        changed = (i3022222 != 256) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState22222) | startRestartGroup.changedInstance(sports) | (i3122222 != 2048) | ((i6 & 112) != 32);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function2) new SportsListKt$SportsList$2$1(rememberLazyListStateWithoutSavedState22222, sports, z, z2, onLoadMore, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState22222, valueOf52222, valueOf222222, (Function2) rememberedValue2, startRestartGroup, ((i6 >> 6) & 112) | i3022222);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(rememberLazyListStateWithoutSavedState22222) | ((i3222222 & 234881024) != 67108864);
        Object rememberedValue522222 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        function23 = function22;
        obj = (Function2) new SportsListKt$SportsList$3$1(rememberLazyListStateWithoutSavedState22222, function23, null);
        startRestartGroup.updateRememberedValue(obj);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, startRestartGroup, 0);
        Boolean valueOf322222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = (i2822222 != 67108864) | startRestartGroup.changedInstance(sports) | (i3022222 != 256) | ((i3222222 & 112) != 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = (Function2) new SportsListKt$SportsList$4$1(l3, sports, z, function04, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function2 function2522222 = (Function2) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        int i3322222 = i6 & 14;
        EffectsKt.LaunchedEffect(sports, l3, valueOf322222, function2522222, startRestartGroup, ((i6 >> 21) & 112) | i3322222 | i3022222);
        Boolean valueOf422222 = Boolean.valueOf(z);
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance2 = (i2922222 != 256) | startRestartGroup.changedInstance(sports) | (i3022222 != 256) | ((i3222222 & 458752) == 131072);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue4 = (Function2) new SportsListKt$SportsList$5$1(l4, sports, z, function03, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(sports, l4, valueOf422222, (Function2) rememberedValue4, startRestartGroup, i3022222 | ((i3222222 >> 3) & 112) | i3322222);
        if (ComposerKt.isTraceInProgress()) {
        }
        l5 = l4;
        function111 = function16;
        function112 = function19;
        function113 = function110;
        l6 = l3;
        function05 = function04;
        i22 = i2622222;
        i23 = i2722222;
        f2 = f322222;
        function114 = function12122222;
        function24 = function23;
        function115 = function18;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SportItem(final SportListItemUiModel sport, final Function1<? super SportListItemUiModel, Unit> onAddToFavorite, final Function1<? super SportListItemUiModel, Unit> onDeleteFromFavorite, Function0<Unit> function0, Long l, Function1<? super Rect, Unit> function1, Function1<? super Long, Unit> function12, boolean z, Long l2, Function1<? super Rect, Unit> function13, Function1<? super Long, Unit> function14, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function1<? super Rect, Unit> function15;
        Function1<? super Long, Unit> function16;
        boolean z4;
        Function1<? super Rect, Unit> function17;
        Function1<? super Long, Unit> function18;
        boolean z5;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Function0<Unit> function02;
        long j;
        int i13;
        boolean z6;
        Object rememberedValue4;
        final Function0<Unit> function03;
        Modifier clickAnimation;
        boolean changedInstance;
        Object rememberedValue5;
        Modifier modifier;
        long j2;
        Function0<Unit> function04;
        boolean z7;
        int i14;
        int i15;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean z8;
        boolean z9;
        Object rememberedValue6;
        final Long l3;
        final Function1<? super Rect, Unit> function19;
        final Function1<? super Long, Unit> function110;
        final boolean z10;
        final Long l4;
        final Function1<? super Rect, Unit> function111;
        final Function1<? super Long, Unit> function112;
        final boolean z11;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(onAddToFavorite, "onAddToFavorite");
        Intrinsics.checkNotNullParameter(onDeleteFromFavorite, "onDeleteFromFavorite");
        Composer startRestartGroup = composer.startRestartGroup(1710543897);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(sport) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onAddToFavorite) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onDeleteFromFavorite) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(function13) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i10 = i2 | (startRestartGroup.changedInstance(function14) ? 4 : 2);
            } else {
                i10 = i2;
            }
            i11 = i3 & 2048;
            if (i11 == 0) {
                i10 |= 48;
            } else if ((i2 & 48) == 0) {
                i10 |= startRestartGroup.changed(z2) ? 32 : 16;
            }
            i12 = i10;
            if ((i4 & 273220755) == 273220754 || (i12 & 19) != 18 || !startRestartGroup.getSkipping()) {
                Function0<Unit> function05 = i16 == 0 ? null : function0;
                Long l5 = (i3 & 16) == 0 ? null : l;
                function15 = i5 == 0 ? null : function1;
                function16 = i6 == 0 ? null : function12;
                z4 = i7 == 0 ? false : z3;
                Long l6 = (i3 & 256) == 0 ? null : l2;
                function17 = i8 == 0 ? null : function13;
                function18 = i9 == 0 ? null : function14;
                z5 = i11 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1710543897, i4, i12, "org.betup.ui.fragment.matches.compose.SportItem (SportsList.kt:180)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Handler(Looper.getMainLooper());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final Handler handler = (Handler) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new AtomicReference(null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final AtomicReference atomicReference = (AtomicReference) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new AtomicReference(null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final AtomicReference atomicReference2 = (AtomicReference) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                long j3 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                long j4 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                long j5 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                function02 = function05;
                j = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
                float f = 12;
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                startRestartGroup.startReplaceGroup(-1633490746);
                i13 = i4 & 14;
                z6 = ((i4 & 7168) != 2048) | (i13 != 4);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    function03 = function02;
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SportItem$lambda$14$lambda$13;
                            SportItem$lambda$14$lambda$13 = SportsListKt.SportItem$lambda$14$lambda$13(Function0.this, sport);
                            return SportItem$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    function03 = function02;
                }
                startRestartGroup.endReplaceGroup();
                clickAnimation = ClickAnimationModifierKt.clickAnimation(m1024backgroundbw27NRU, (Function0) rememberedValue4, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 48, 3070);
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = ((29360128 & i4) != 8388608) | ((458752 & i4) != 131072) | startRestartGroup.changedInstance(atomicReference) | startRestartGroup.changedInstance(handler) | ((3670016 & i4) != 1048576) | (i13 != 4) | ((i12 & 112) != 32) | ((1879048192 & i4) != 536870912) | startRestartGroup.changedInstance(atomicReference2) | ((i12 & 14) != 4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    int i17 = i4;
                    final boolean z12 = z4;
                    final Function1<? super Rect, Unit> function113 = function15;
                    modifier = clickAnimation;
                    j2 = j;
                    function04 = function03;
                    z7 = true;
                    final boolean z13 = z5;
                    i14 = i13;
                    i15 = i17;
                    final Function1<? super Rect, Unit> function114 = function17;
                    final Function1<? super Long, Unit> function115 = function16;
                    composer2 = startRestartGroup;
                    final Function1<? super Long, Unit> function116 = function18;
                    Object obj = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit SportItem$lambda$18$lambda$17;
                            SportItem$lambda$18$lambda$17 = SportsListKt.SportItem$lambda$18$lambda$17(z12, function113, atomicReference, handler, sport, z13, function114, atomicReference2, function115, function116, (LayoutCoordinates) obj2);
                            return SportItem$lambda$18$lambda$17;
                        }
                    };
                    composer2.updateRememberedValue(obj);
                    rememberedValue5 = obj;
                } else {
                    j2 = j;
                    modifier = clickAnimation;
                    i15 = i4;
                    function04 = function03;
                    i14 = i13;
                    composer2 = startRestartGroup;
                    z7 = true;
                }
                composer2.endReplaceGroup();
                float f2 = 8;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue5), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f3 = 4;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(sport.getPhotoUrl(), null, PaddingKt.m1516padding3ABfNKs(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), Dp.m7774constructorimpl(f3)), null, null, null, null, 0.0f, null, 0, false, composer2, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer2, 6);
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m3621Text4IGK_g(sport.getName(), (Modifier) null, j4, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-464406280);
                if (sport.getMatchLiveCount() <= 0) {
                    long j6 = j2;
                    z8 = false;
                    BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), j6, RoundedCornerShapeKt.getCircleShape()), composer2, 0);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
                    TextKt.m3621Text4IGK_g(String.valueOf(sport.getMatchLiveCount()), (Modifier) null, j6, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
                } else {
                    z8 = false;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-464388472);
                if (sport.getMatchCount() > 0) {
                    TextKt.m3621Text4IGK_g(String.valueOf(sport.getMatchCount()), (Modifier) null, j3, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
                }
                composer2.endReplaceGroup();
                boolean isFavorite = sport.isFavorite();
                composer2.startReplaceGroup(-1746271574);
                int i18 = i15;
                z9 = ((i18 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256 ? z7 : z8) | (i14 != 4 ? z7 : z8) | ((i18 & 112) != 32 ? z7 : z8);
                rememberedValue6 = composer2.rememberedValue();
                if (!z9 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SportItem$lambda$23$lambda$22$lambda$21$lambda$20;
                            SportItem$lambda$23$lambda$22$lambda$21$lambda$20 = SportsListKt.SportItem$lambda$23$lambda$22$lambda$21$lambda$20(SportListItemUiModel.this, onDeleteFromFavorite, onAddToFavorite);
                            return SportItem$lambda$23$lambda$22$lambda$21$lambda$20;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                composer2.endReplaceGroup();
                FavoriteStarButtonKt.m12932FavoriteStarButtonFbr4GWI(isFavorite, (Function0) rememberedValue6, null, false, 0.0f, 0.0f, 0, 0, j3, j5, false, composer2, 0, 0, 1276);
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
                l3 = l5;
                function19 = function15;
                function110 = function16;
                z10 = z4;
                l4 = l6;
                function111 = function17;
                function112 = function18;
                z11 = z5;
            } else {
                startRestartGroup.skipToGroupEnd();
                function04 = function0;
                l3 = l;
                function19 = function1;
                l4 = l2;
                z10 = z3;
                composer2 = startRestartGroup;
                function110 = function12;
                function111 = function13;
                function112 = function14;
                z11 = z2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final Function0<Unit> function06 = function04;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit SportItem$lambda$24;
                        SportItem$lambda$24 = SportsListKt.SportItem$lambda$24(SportListItemUiModel.this, onAddToFavorite, onDeleteFromFavorite, function06, l3, function19, function110, z10, l4, function111, function112, z11, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        return SportItem$lambda$24;
                    }
                });
                return;
            }
            return;
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        i12 = i10;
        if ((i4 & 273220755) == 273220754) {
        }
        if (i16 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final Handler handler2 = (Handler) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final AtomicReference atomicReference3 = (AtomicReference) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        final AtomicReference atomicReference22 = (AtomicReference) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        long j32 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        long j42 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        long j52 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        function02 = function05;
        j = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
        float f4 = 12;
        Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
        startRestartGroup.startReplaceGroup(-1633490746);
        i13 = i4 & 14;
        z6 = ((i4 & 7168) != 2048) | (i13 != 4);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (z6) {
        }
        function03 = function02;
        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit SportItem$lambda$14$lambda$13;
                SportItem$lambda$14$lambda$13 = SportsListKt.SportItem$lambda$14$lambda$13(Function0.this, sport);
                return SportItem$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        clickAnimation = ClickAnimationModifierKt.clickAnimation(m1024backgroundbw27NRU2, (Function0) rememberedValue4, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 48, 3070);
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = ((29360128 & i4) != 8388608) | ((458752 & i4) != 131072) | startRestartGroup.changedInstance(atomicReference3) | startRestartGroup.changedInstance(handler2) | ((3670016 & i4) != 1048576) | (i13 != 4) | ((i12 & 112) != 32) | ((1879048192 & i4) != 536870912) | startRestartGroup.changedInstance(atomicReference22) | ((i12 & 14) != 4);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        int i172 = i4;
        final boolean z122 = z4;
        final Function1 function1132 = function15;
        modifier = clickAnimation;
        j2 = j;
        function04 = function03;
        z7 = true;
        final boolean z132 = z5;
        i14 = i13;
        i15 = i172;
        final Function1 function1142 = function17;
        final Function1 function1152 = function16;
        composer2 = startRestartGroup;
        final Function1 function1162 = function18;
        Object obj2 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                Unit SportItem$lambda$18$lambda$17;
                SportItem$lambda$18$lambda$17 = SportsListKt.SportItem$lambda$18$lambda$17(z122, function1132, atomicReference3, handler2, sport, z132, function1142, atomicReference22, function1152, function1162, (LayoutCoordinates) obj22);
                return SportItem$lambda$18$lambda$17;
            }
        };
        composer2.updateRememberedValue(obj2);
        rememberedValue5 = obj2;
        composer2.endReplaceGroup();
        float f22 = 8;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue5), Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f22));
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(start2, centerVertically3, composer2, 54);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        float f32 = 4;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(sport.getPhotoUrl(), null, PaddingKt.m1516padding3ABfNKs(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), Dp.m7774constructorimpl(f32)), null, null, null, null, 0.0f, null, 0, false, composer2, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer2, 6);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, weight$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TextKt.m3621Text4IGK_g(sport.getName(), (Modifier) null, j42, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), composer2, 6);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer2, 48);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, companion2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        composer2.startReplaceGroup(-464406280);
        if (sport.getMatchLiveCount() <= 0) {
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-464388472);
        if (sport.getMatchCount() > 0) {
        }
        composer2.endReplaceGroup();
        boolean isFavorite2 = sport.isFavorite();
        composer2.startReplaceGroup(-1746271574);
        if (i14 != 4) {
        }
        int i182 = i15;
        z9 = ((i182 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256 ? z7 : z8) | (i14 != 4 ? z7 : z8) | ((i182 & 112) != 32 ? z7 : z8);
        rememberedValue6 = composer2.rememberedValue();
        if (!z9) {
        }
        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit SportItem$lambda$23$lambda$22$lambda$21$lambda$20;
                SportItem$lambda$23$lambda$22$lambda$21$lambda$20 = SportsListKt.SportItem$lambda$23$lambda$22$lambda$21$lambda$20(SportListItemUiModel.this, onDeleteFromFavorite, onAddToFavorite);
                return SportItem$lambda$23$lambda$22$lambda$21$lambda$20;
            }
        };
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceGroup();
        FavoriteStarButtonKt.m12932FavoriteStarButtonFbr4GWI(isFavorite2, (Function0) rememberedValue6, null, false, 0.0f, 0.0f, 0, 0, j32, j52, false, composer2, 0, 0, 1276);
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
        l3 = l5;
        function19 = function15;
        function110 = function16;
        z10 = z4;
        l4 = l6;
        function111 = function17;
        function112 = function18;
        z11 = z5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportItem$lambda$14$lambda$13(Function0 function0, SportListItemUiModel sportListItemUiModel) {
        if (function0 != null) {
            function0.invoke();
        } else {
            sportListItemUiModel.getOnClickItem().invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportItem$lambda$18$lambda$17(boolean z, final Function1 function1, AtomicReference atomicReference, Handler handler, final SportListItemUiModel sportListItemUiModel, boolean z2, final Function1 function12, AtomicReference atomicReference2, final Function1 function13, final Function1 function14, LayoutCoordinates coordinates) {
        String str;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (!z || function1 == null) {
            str = ", bounds=";
        } else {
            long positionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
            int i = (int) (positionInWindow >> 32);
            int i2 = (int) (positionInWindow & 4294967295L);
            final Rect rect = new Rect((int) Float.intBitsToFloat(i), (int) Float.intBitsToFloat(i2), ((int) Float.intBitsToFloat(i)) + ((int) (coordinates.mo6536getSizeYbymL2g() >> 32)), ((int) Float.intBitsToFloat(i2)) + ((int) (coordinates.mo6536getSizeYbymL2g() & 4294967295L)));
            if (Intrinsics.areEqual(rect, atomicReference.get())) {
                str = ", bounds=";
            } else {
                atomicReference.set(rect);
                handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportsListKt.SportItem$lambda$18$lambda$17$lambda$15(Function1.this, rect, function13, sportListItemUiModel);
                    }
                });
                String m4935toStringimpl = Offset.m4935toStringimpl(positionInWindow);
                String m7948toStringimpl = IntSize.m7948toStringimpl(coordinates.mo6536getSizeYbymL2g());
                int id = sportListItemUiModel.getId();
                StringBuilder append = new StringBuilder("SportItem - Reported bounds for first sport item: position=").append(m4935toStringimpl).append(", size=").append(m7948toStringimpl);
                str = ", bounds=";
                Log.d("TourFlow", append.append(str).append(rect).append(", sportId=").append(id).toString());
            }
        }
        if (z2 && function12 != null) {
            long positionInWindow2 = LayoutCoordinatesKt.positionInWindow(coordinates);
            int i3 = (int) (positionInWindow2 >> 32);
            int i4 = (int) (positionInWindow2 & 4294967295L);
            final Rect rect2 = new Rect((int) Float.intBitsToFloat(i3), (int) Float.intBitsToFloat(i4), ((int) Float.intBitsToFloat(i3)) + ((int) (coordinates.mo6536getSizeYbymL2g() >> 32)), ((int) Float.intBitsToFloat(i4)) + ((int) (coordinates.mo6536getSizeYbymL2g() & 4294967295L)));
            if (!Intrinsics.areEqual(rect2, atomicReference2.get())) {
                atomicReference2.set(rect2);
                handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportsListKt.SportItem$lambda$18$lambda$17$lambda$16(Function1.this, rect2, function14, sportListItemUiModel);
                    }
                });
                Log.d("TourFlow", "SportItem - Reported bounds for first league item: position=" + Offset.m4935toStringimpl(positionInWindow2) + ", size=" + IntSize.m7948toStringimpl(coordinates.mo6536getSizeYbymL2g()) + str + rect2 + ", leagueId=" + sportListItemUiModel.getId());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SportItem$lambda$18$lambda$17$lambda$15(Function1 function1, Rect rect, Function1 function12, SportListItemUiModel sportListItemUiModel) {
        function1.invoke(rect);
        if (function12 != null) {
            function12.invoke(Long.valueOf(sportListItemUiModel.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SportItem$lambda$18$lambda$17$lambda$16(Function1 function1, Rect rect, Function1 function12, SportListItemUiModel sportListItemUiModel) {
        function1.invoke(rect);
        if (function12 != null) {
            function12.invoke(Long.valueOf(sportListItemUiModel.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportItem$lambda$23$lambda$22$lambda$21$lambda$20(SportListItemUiModel sportListItemUiModel, Function1 function1, Function1 function12) {
        if (sportListItemUiModel.isFavorite()) {
            function1.invoke(sportListItemUiModel);
        } else {
            function12.invoke(sportListItemUiModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsList_BUBvxpI$lambda$4$lambda$3(final List list, boolean z, boolean z2, final Function1 function1, final Function1 function12, final Function1 function13, final Long l, final Function1 function14, final Function1 function15, final Long l2, final Function1 function16, final Function1 function17, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$SportsList_BUBvxpI$lambda$4$lambda$3$$inlined$itemsIndexed$default$2
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
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$SportsList_BUBvxpI$lambda$4$lambda$3$$inlined$itemsIndexed$default$3
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
                Function0 function0;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final SportListItemUiModel sportListItemUiModel = (SportListItemUiModel) list.get(i);
                composer.startReplaceGroup(628161289);
                Function1 function18 = function1;
                Function1 function19 = function12;
                composer.startReplaceGroup(-1365203992);
                final Function1 function110 = function13;
                if (function110 == null) {
                    function0 = null;
                } else {
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function110) | composer.changed(sportListItemUiModel);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$SportsList$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function110.invoke(sportListItemUiModel);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    function0 = (Function0) rememberedValue;
                }
                composer.endReplaceGroup();
                Long l3 = l;
                Function1 function111 = function14;
                Function1 function112 = function15;
                boolean z3 = i == 0 && l3 != null;
                Long l4 = l2;
                SportsListKt.SportItem(sportListItemUiModel, function18, function19, function0, l3, function111, function112, z3, l4, function16, function17, i == 0 && l4 != null, composer, 0, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z && z2) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$SportsListKt.INSTANCE.getLambda$1248569258$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
