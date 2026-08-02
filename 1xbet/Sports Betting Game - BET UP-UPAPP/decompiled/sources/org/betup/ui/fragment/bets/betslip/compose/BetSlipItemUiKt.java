package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.google.logging.type.LogSeverity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.fragment.bets.sheet.compose.items.BetInfoRowKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.DateHelper;
import org.betup.utils.UiExtensionsKt;

/* compiled from: BetSlipItemUi.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"BetSlipItemUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "betsModel", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "oddTypeFlow", "Lorg/betup/model/local/entity/OddType;", "onRemoveBet", "Lkotlin/Function1;", "", "onClickItem", "Lkotlin/Function2;", "", "Lorg/betup/model/remote/entity/matches/MatchState;", "shouldShowTrash", "", "betSportType", "", "betSportTypeImage", "score", "isCoefficientUpOrDown", "isInHistory", "useIntrinsicHeight", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZLandroidx/compose/runtime/Composer;III)V", "PreviewBetsLipItemUi", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetSlipItemUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipItemUi$lambda$17(Modifier modifier, BetSlipUiModel betSlipUiModel, OddType oddType, Function1 function1, Function2 function2, boolean z, String str, String str2, String str3, Boolean bool, boolean z2, boolean z3, int i, int i2, int i3, Composer composer, int i4) {
        BetSlipItemUi(modifier, betSlipUiModel, oddType, function1, function2, z, str, str2, str3, bool, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetsLipItemUi$lambda$18(int i, Composer composer, int i2) {
        PreviewBetsLipItemUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipItemUi$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipItemUi$lambda$3$lambda$2(int i, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d9d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0dc6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetSlipItemUi(Modifier modifier, final BetSlipUiModel betsModel, OddType oddType, Function1<? super Long, Unit> function1, Function2<? super Integer, ? super MatchState, Unit> function2, boolean z, String str, String str2, String str3, Boolean bool, boolean z2, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Function1<? super Long, Unit> function12;
        final Function2<? super Integer, ? super MatchState, Unit> function22;
        boolean z4;
        boolean z5;
        float m7774constructorimpl;
        boolean z6;
        boolean z7;
        Modifier fillMaxSize$default;
        int currentCompositeKeyHash;
        String str4;
        Composer m4610constructorimpl;
        boolean z8;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        String str5;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        String varietyName;
        String betTypeGroup;
        Function1<? super Long, Unit> function13;
        final Modifier modifier2;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        final String str6;
        final boolean z9;
        final Function1<? super Long, Unit> function14;
        final Boolean bool2;
        final OddType oddType2;
        final boolean z10;
        final boolean z11;
        final String str7;
        final Function2<? super Integer, ? super MatchState, Unit> function23;
        final String str8;
        String betTypeGroup2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(betsModel, "betsModel");
        Composer startRestartGroup = composer.startRestartGroup(1000003711);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(betsModel) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(str) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(str3) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(bool) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i12 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i12 = i2 | (startRestartGroup.changed(z2) ? 4 : 2);
                } else {
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i12 |= startRestartGroup.changed(z3) ? 32 : 16;
                }
                int i17 = i12;
                if ((i4 & 306783379) == 306783378 || (i17 & 19) != 18 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                    OddType oddType3 = i15 != 0 ? OddType.DECIMAL : oddType;
                    if (i16 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BetSlipItemUi$lambda$1$lambda$0;
                                    BetSlipItemUi$lambda$1$lambda$0 = BetSlipItemUiKt.BetSlipItemUi$lambda$1$lambda$0(((Long) obj).longValue());
                                    return BetSlipItemUi$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function12 = (Function1) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function12 = function1;
                    }
                    if (i5 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BetSlipItemUi$lambda$3$lambda$2;
                                    BetSlipItemUi$lambda$3$lambda$2 = BetSlipItemUiKt.BetSlipItemUi$lambda$3$lambda$2(((Integer) obj).intValue(), (MatchState) obj2);
                                    return BetSlipItemUi$lambda$3$lambda$2;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        function22 = (Function2) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function22 = function2;
                    }
                    z4 = i6 != 0 ? true : z;
                    String str9 = i7 != 0 ? null : str;
                    String str10 = i8 != 0 ? null : str2;
                    String str11 = i9 != 0 ? null : str3;
                    Boolean bool3 = i10 != 0 ? null : bool;
                    boolean z12 = i11 != 0 ? false : z2;
                    z5 = i13 != 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1000003711, i4, i17, "org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUi (BetSlipItemUi.kt:58)");
                    }
                    float f = 2;
                    float m7774constructorimpl2 = Dp.m7774constructorimpl(f);
                    Boolean bool4 = bool3;
                    float m7774constructorimpl3 = Dp.m7774constructorimpl(f);
                    m7774constructorimpl = Dp.m7774constructorimpl(f);
                    OddType oddType4 = oddType3;
                    float f2 = 6;
                    float m7774constructorimpl4 = Dp.m7774constructorimpl(f2);
                    float f3 = 8;
                    float m7774constructorimpl5 = Dp.m7774constructorimpl(f3);
                    float m7774constructorimpl6 = Dp.m7774constructorimpl(f3);
                    z6 = z12;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    if (z5) {
                        z7 = z5;
                        fillMaxSize$default = SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null);
                    } else {
                        z7 = z5;
                        fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    }
                    Modifier then = fillMaxWidth$default.then(fillMaxSize$default);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier3 = companion;
                    str4 = str11;
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
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i18 = i4 & 112;
                    z8 = ((57344 & i4) == 16384) | (i18 == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BetSlipItemUi$lambda$16$lambda$5$lambda$4;
                                BetSlipItemUi$lambda$16$lambda$5$lambda$4 = BetSlipItemUiKt.BetSlipItemUi$lambda$16$lambda$5$lambda$4(Function2.this, betsModel);
                                return BetSlipItemUi$lambda$16$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier subtleClickAnimation = ClickAnimationModifierKt.subtleClickAnimation(fillMaxWidth$default2, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 196614, 0, 1006);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Function2<? super Integer, ? super MatchState, Unit> function24 = function22;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation);
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
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-96371883);
                    str5 = str9;
                    if (str5 != null) {
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, m7774constructorimpl2, 7, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
                        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str10, "", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 21) & 14) | 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        TextKt.m2642Text4IGK_g(" " + str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    String str12 = str10;
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
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(DateHelper.getTime(betsModel.getDateTime()) + " | " + UiExtensionsKt.getFormattedDateWithYear(betsModel.getDateTime()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (z4) {
                        startRestartGroup.startReplaceGroup(-537227311);
                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.trash_icon, startRestartGroup, 6);
                        ColorFilter m5209tintxETnrds$default = ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0, 2, null);
                        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20));
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean z13 = (i18 == 32) | ((i4 & 7168) == 2048);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z13 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetSlipItemUi$lambda$16$lambda$14$lambda$10$lambda$9$lambda$8;
                                    BetSlipItemUi$lambda$16$lambda$14$lambda$10$lambda$9$lambda$8 = BetSlipItemUiKt.BetSlipItemUi$lambda$16$lambda$14$lambda$10$lambda$9$lambda$8(BetSlipUiModel.this, function12);
                                    return BetSlipItemUi$lambda$16$lambda$14$lambda$10$lambda$9$lambda$8;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        ImageKt.Image(painterResource, (String) null, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue4, 7, null), (Alignment) null, (ContentScale) null, 0.0f, m5209tintxETnrds$default, startRestartGroup, 48, 56);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-536676844);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl3), startRestartGroup, 6);
                    TextKt.m2642Text4IGK_g(betsModel.getHomeTeamName() + " - " + betsModel.getAwayTeamName(), GraphicsLayerModifierKt.m5329graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, betsModel.isDeleted() ? 0.5f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, betsModel.isDeleted() ? TextDecoration.INSTANCE.getLineThrough() : null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773080, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                    startRestartGroup.startReplaceGroup(-96275976);
                    if (str4 != null && betsModel.getBetState() != BetState.PENDING) {
                        TextKt.m2642Text4IGK_g(str4, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, ((i4 >> 24) & 14) | 48, 0, 65532);
                    }
                    startRestartGroup.endReplaceGroup();
                    varietyName = betsModel.getVarietyName();
                    if (varietyName != null || StringsKt.isBlank(varietyName)) {
                        varietyName = null;
                    }
                    betTypeGroup = betsModel.getBetTypeGroup();
                    if (betTypeGroup.length() <= 0) {
                        betTypeGroup = null;
                    }
                    boolean z14 = varietyName == null && betTypeGroup != null;
                    if (!z6 && z14) {
                        startRestartGroup.startReplaceGroup(1311254374);
                        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically2, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        function13 = function12;
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
                        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-285225402);
                        if (varietyName != null && betTypeGroup != null) {
                            TextKt.m2642Text4IGK_g(betTypeGroup + ". " + varietyName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function13 = function12;
                        if (z6 && betsModel.getVarietyName() != null && betsModel.getVarietyName().length() > 0) {
                            startRestartGroup.startReplaceGroup(1312248823);
                            TextKt.m2642Text4IGK_g(betsModel.getVarietyName(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1312717791);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    startRestartGroup.startReplaceGroup(-96200404);
                    if (Intrinsics.areEqual(betsModel.getBetName(), "")) {
                        modifier2 = modifier3;
                    } else {
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, m7774constructorimpl4), startRestartGroup, 6);
                        modifier2 = modifier3;
                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        if (z6 && z14) {
                            betTypeGroup2 = "";
                        } else {
                            betTypeGroup2 = betsModel.getBetTypeGroup();
                        }
                        BetInfoRowKt.m13598BetInfoRowTVReaoo(fillMaxWidth$default4, betTypeGroup2, betsModel.getBetName(), betsModel.getGrabbedCoefficient(), oddType4, betsModel.getTextColor(), z6, null, bool4, true, false, 0L, startRestartGroup, ((i4 << 6) & 57344) | 805306368 | ((i17 << 18) & 3670016) | ((i4 >> 3) & 234881024), 0, 3200);
                    }
                    startRestartGroup.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl5), startRestartGroup, 6);
                    SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(1)), 0.0f, 1, null), startRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl6), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-1155706267);
                    if (betsModel.isAvailable() || betsModel.isDeleted()) {
                        Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance.align(boxScopeInstance.matchParentSize(Modifier.INSTANCE), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor6);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash6);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.lock_item, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_lock, startRestartGroup, 6), BoxScopeInstance.INSTANCE.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str5;
                    z9 = z4;
                    function14 = function13;
                    bool2 = bool4;
                    oddType2 = oddType4;
                    z10 = z6;
                    z11 = z7;
                    str7 = str4;
                    function23 = function24;
                    str8 = str12;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    oddType2 = oddType;
                    function14 = function1;
                    function23 = function2;
                    z9 = z;
                    str6 = str;
                    str8 = str2;
                    str7 = str3;
                    bool2 = bool;
                    z10 = z2;
                    z11 = z3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BetSlipItemUi$lambda$17;
                            BetSlipItemUi$lambda$17 = BetSlipItemUiKt.BetSlipItemUi$lambda$17(Modifier.this, betsModel, oddType2, function14, function23, z9, str6, str8, str7, bool2, z10, z11, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return BetSlipItemUi$lambda$17;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i172 = i12;
            if ((i4 & 306783379) == 306783378) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f4 = 2;
            float m7774constructorimpl22 = Dp.m7774constructorimpl(f4);
            Boolean bool42 = bool3;
            float m7774constructorimpl32 = Dp.m7774constructorimpl(f4);
            m7774constructorimpl = Dp.m7774constructorimpl(f4);
            OddType oddType42 = oddType3;
            float f22 = 6;
            float m7774constructorimpl42 = Dp.m7774constructorimpl(f22);
            float f32 = 8;
            float m7774constructorimpl52 = Dp.m7774constructorimpl(f32);
            float m7774constructorimpl62 = Dp.m7774constructorimpl(f32);
            z6 = z12;
            Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            if (z5) {
            }
            Modifier then2 = fillMaxWidth$default5.then(fillMaxSize$default);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier32 = companion;
            str4 = str11;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i182 = i4 & 112;
            z8 = ((57344 & i4) == 16384) | (i182 == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetSlipItemUi$lambda$16$lambda$5$lambda$4;
                    BetSlipItemUi$lambda$16$lambda$5$lambda$4 = BetSlipItemUiKt.BetSlipItemUi$lambda$16$lambda$5$lambda$4(Function2.this, betsModel);
                    return BetSlipItemUi$lambda$16$lambda$5$lambda$4;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier subtleClickAnimation2 = ClickAnimationModifierKt.subtleClickAnimation(fillMaxWidth$default22, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 196614, 0, 1006);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Function2<? super Integer, ? super MatchState, Unit> function242 = function22;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-96371883);
            str5 = str9;
            if (str5 != null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            String str122 = str10;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(DateHelper.getTime(betsModel.getDateTime()) + " | " + UiExtensionsKt.getFormattedDateWithYear(betsModel.getDateTime()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (z4) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl32), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(betsModel.getHomeTeamName() + " - " + betsModel.getAwayTeamName(), GraphicsLayerModifierKt.m5329graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, betsModel.isDeleted() ? 0.5f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, betsModel.isDeleted() ? TextDecoration.INSTANCE.getLineThrough() : null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773080, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
            startRestartGroup.startReplaceGroup(-96275976);
            if (str4 != null) {
                TextKt.m2642Text4IGK_g(str4, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, ((i4 >> 24) & 14) | 48, 0, 65532);
            }
            startRestartGroup.endReplaceGroup();
            varietyName = betsModel.getVarietyName();
            if (varietyName != null) {
            }
            varietyName = null;
            betTypeGroup = betsModel.getBetTypeGroup();
            if (betTypeGroup.length() <= 0) {
            }
            if (varietyName == null) {
            }
            if (!z6) {
            }
            function13 = function12;
            if (z6) {
            }
            startRestartGroup.startReplaceGroup(1312717791);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-96200404);
            if (Intrinsics.areEqual(betsModel.getBetName(), "")) {
            }
            startRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl52), startRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(1)), 0.0f, 1, null), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl62), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1155706267);
            if (betsModel.isAvailable()) {
            }
            Modifier m1025backgroundbw27NRU$default2 = BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance2.align(boxScopeInstance2.matchParentSize(Modifier.INSTANCE), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.lock_item, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_lock, startRestartGroup, 6), BoxScopeInstance.INSTANCE.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            str6 = str5;
            z9 = z4;
            function14 = function13;
            bool2 = bool42;
            oddType2 = oddType42;
            z10 = z6;
            z11 = z7;
            str7 = str4;
            function23 = function242;
            str8 = str122;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i1722 = i12;
        if ((i4 & 306783379) == 306783378) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f42 = 2;
        float m7774constructorimpl222 = Dp.m7774constructorimpl(f42);
        Boolean bool422 = bool3;
        float m7774constructorimpl322 = Dp.m7774constructorimpl(f42);
        m7774constructorimpl = Dp.m7774constructorimpl(f42);
        OddType oddType422 = oddType3;
        float f222 = 6;
        float m7774constructorimpl422 = Dp.m7774constructorimpl(f222);
        float f322 = 8;
        float m7774constructorimpl522 = Dp.m7774constructorimpl(f322);
        float m7774constructorimpl622 = Dp.m7774constructorimpl(f322);
        z6 = z12;
        Modifier fillMaxWidth$default52 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        if (z5) {
        }
        Modifier then22 = fillMaxWidth$default52.then(fillMaxSize$default);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
        Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier322 = companion;
        str4 = str11;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash72);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i1822 = i4 & 112;
        z8 = ((57344 & i4) == 16384) | (i1822 == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetSlipItemUi$lambda$16$lambda$5$lambda$4;
                BetSlipItemUi$lambda$16$lambda$5$lambda$4 = BetSlipItemUiKt.BetSlipItemUi$lambda$16$lambda$5$lambda$4(Function2.this, betsModel);
                return BetSlipItemUi$lambda$16$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier subtleClickAnimation22 = ClickAnimationModifierKt.subtleClickAnimation(fillMaxWidth$default222, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 196614, 0, 1006);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Function2<? super Integer, ? super MatchState, Unit> function2422 = function22;
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-96371883);
        str5 = str9;
        if (str5 != null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default322);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        String str1222 = str10;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash422);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(DateHelper.getTime(betsModel.getDateTime()) + " | " + UiExtensionsKt.getFormattedDateWithYear(betsModel.getDateTime()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        if (z4) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl322), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(betsModel.getHomeTeamName() + " - " + betsModel.getAwayTeamName(), GraphicsLayerModifierKt.m5329graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, betsModel.isDeleted() ? 0.5f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, betsModel.isDeleted() ? TextDecoration.INSTANCE.getLineThrough() : null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773080, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
        startRestartGroup.startReplaceGroup(-96275976);
        if (str4 != null) {
        }
        startRestartGroup.endReplaceGroup();
        varietyName = betsModel.getVarietyName();
        if (varietyName != null) {
        }
        varietyName = null;
        betTypeGroup = betsModel.getBetTypeGroup();
        if (betTypeGroup.length() <= 0) {
        }
        if (varietyName == null) {
        }
        if (!z6) {
        }
        function13 = function12;
        if (z6) {
        }
        startRestartGroup.startReplaceGroup(1312717791);
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-96200404);
        if (Intrinsics.areEqual(betsModel.getBetName(), "")) {
        }
        startRestartGroup.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl522), startRestartGroup, 6);
        SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(1)), 0.0f, 1, null), startRestartGroup, 0);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl622), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-1155706267);
        if (betsModel.isAvailable()) {
        }
        Modifier m1025backgroundbw27NRU$default22 = BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance22.align(boxScopeInstance22.matchParentSize(Modifier.INSTANCE), Alignment.INSTANCE.getCenter()), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default22);
        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash622);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.lock_item, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_lock, startRestartGroup, 6), BoxScopeInstance.INSTANCE.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        str6 = str5;
        z9 = z4;
        function14 = function13;
        bool2 = bool422;
        oddType2 = oddType422;
        z10 = z6;
        z11 = z7;
        str7 = str4;
        function23 = function2422;
        str8 = str1222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipItemUi$lambda$16$lambda$5$lambda$4(Function2 function2, BetSlipUiModel betSlipUiModel) {
        Long matchBetId = betSlipUiModel.getMatchBetId();
        function2.invoke(Integer.valueOf(matchBetId != null ? (int) matchBetId.longValue() : 0), betSlipUiModel.getState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipItemUi$lambda$16$lambda$14$lambda$10$lambda$9$lambda$8(BetSlipUiModel betSlipUiModel, Function1 function1) {
        Long betId = betSlipUiModel.getBetId();
        if (betId != null) {
            function1.invoke(Long.valueOf(betId.longValue()));
        }
        return Unit.INSTANCE;
    }

    public static final void PreviewBetsLipItemUi(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(212120199);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212120199, i, -1, "org.betup.ui.fragment.bets.betslip.compose.PreviewBetsLipItemUi (BetSlipItemUi.kt:297)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipItemUiKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetsLipItemUi$lambda$18;
                    PreviewBetsLipItemUi$lambda$18 = BetSlipItemUiKt.PreviewBetsLipItemUi$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetsLipItemUi$lambda$18;
                }
            });
        }
    }
}
