package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
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
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BetGroupCard.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a£\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u001226\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u000f2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010&¨\u0006'"}, d2 = {"BetGroupCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "groupName", "", "bets", "", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyBetOptionModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "isExpanded", "", "selectedBetIds", "", "", "validatingBetIds", "onExpandToggle", "Lkotlin/Function0;", "onBetClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "betTypeId", "betIndex", "isLocked", "betColumnSize", "isInBattle", "compactBattleFlow", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "getDisplayCoefficientForBet", "Lkotlin/Function1;", "", "varietyMinStakeRuleId", "showVarietyMinStakeInfo", "varietyMinStakeBetcoins", "onToggleVarietyMinStakeInfo", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lorg/betup/model/local/entity/OddType;ZLjava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZIZZLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetGroupCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupCard$lambda$10(Modifier modifier, String str, List list, OddType oddType, boolean z, Set set, Set set2, Function0 function0, Function2 function2, boolean z2, int i, boolean z3, boolean z4, Integer num, Function1 function1, String str2, boolean z5, long j, Function0 function02, int i2, int i3, int i4, Composer composer, int i5) {
        BetGroupCard(modifier, str, list, oddType, z, set, set2, function0, function2, z2, i, z3, z4, num, function1, str2, z5, j, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e4  */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetGroupCard(Modifier modifier, final String groupName, final List<MatchVarietyBetOptionModel> bets, final OddType oddType, final boolean z, Set<Long> set, Set<Long> set2, final Function0<Unit> onExpandToggle, final Function2<? super Integer, ? super Integer, Unit> onBetClick, boolean z2, final int i, boolean z3, boolean z4, Integer num, Function1<? super Long, Double> function1, String str, boolean z5, long j, Function0<Unit> function0, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z6;
        int i11;
        long j2;
        int i12;
        boolean z7;
        boolean z8;
        float m7774constructorimpl;
        long sp;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        boolean z9;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean z10;
        Object rememberedValue;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        long j3;
        int i13;
        long j4;
        int i14;
        Object rememberedValue2;
        final Function0<Unit> function02;
        float f;
        Object obj;
        int i15;
        ?? r12;
        Function0<Unit> function03;
        Composer composer2;
        final Modifier modifier2;
        final Set<Long> set3;
        final Set<Long> set4;
        final boolean z11;
        final boolean z12;
        final Integer num2;
        final Function1<? super Long, Double> function12;
        final String str2;
        final boolean z13;
        final long j5;
        final Function0<Unit> function04;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(onExpandToggle, "onExpandToggle");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(-1911109999);
        int i16 = i4 & 1;
        if (i16 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(groupName) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(bets) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i17 = i4 & 32;
        if (i17 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changedInstance(set) ? 131072 : 65536;
        }
        int i18 = i4 & 64;
        if (i18 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changedInstance(set2) ? 1048576 : 524288;
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(onExpandToggle) ? 8388608 : 4194304;
        }
        if ((i4 & 256) != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changedInstance(onBetClick) ? 67108864 : 33554432;
        }
        int i19 = i4 & 512;
        if (i19 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i4 & 1024) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i20 = i4 & 2048;
        if (i20 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(z3) ? 32 : 16;
        }
        int i21 = i6;
        int i22 = i4 & 4096;
        if (i22 != 0) {
            i21 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i21 |= startRestartGroup.changed(z4) ? 256 : 128;
            i7 = i4 & 8192;
            if (i7 == 0) {
                i21 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i21 |= startRestartGroup.changed(num) ? 2048 : 1024;
                i8 = i4 & 16384;
                if (i8 != 0) {
                    i21 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i21 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    i9 = i4 & 32768;
                    if (i9 == 0) {
                        i21 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i21 |= startRestartGroup.changed(str) ? 131072 : 65536;
                    }
                    i10 = i4 & 65536;
                    if (i10 == 0) {
                        i21 |= 1572864;
                        z6 = z5;
                    } else {
                        z6 = z5;
                        if ((i3 & 1572864) == 0) {
                            i21 |= startRestartGroup.changed(z6) ? 1048576 : 524288;
                        }
                    }
                    i11 = i4 & 131072;
                    if (i11 == 0) {
                        i21 |= 12582912;
                        j2 = j;
                    } else {
                        j2 = j;
                        if ((i3 & 12582912) == 0) {
                            i21 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i4 & 262144;
                    if (i12 == 0) {
                        i21 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i21 |= startRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    if ((i5 & 306783379) == 306783378 || (38347923 & i21) != 38347922 || !startRestartGroup.getSkipping()) {
                        Modifier modifier3 = i16 == 0 ? Modifier.INSTANCE : modifier;
                        Set<Long> emptySet = i17 == 0 ? SetsKt.emptySet() : set;
                        Set<Long> emptySet2 = i18 == 0 ? SetsKt.emptySet() : set2;
                        z7 = i19 == 0 ? false : z2;
                        boolean z14 = i20 == 0 ? false : z3;
                        z8 = i22 == 0 ? false : z4;
                        Integer num3 = i7 == 0 ? null : num;
                        Function1<? super Long, Double> function13 = i8 == 0 ? null : function1;
                        String str3 = i9 == 0 ? null : str;
                        boolean z15 = i10 == 0 ? false : z6;
                        long j6 = i11 == 0 ? 0L : j2;
                        Function0<Unit> function05 = i12 == 0 ? null : function0;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1911109999, i5, i21, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCard (BetGroupCard.kt:65)");
                        }
                        if (!z8) {
                            m7774constructorimpl = BattleFlowDimens.INSTANCE.m13149getBetGroupHeaderPaddingD9Ej5fM();
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(12);
                        }
                        float m7774constructorimpl4 = !z ? Dp.m7774constructorimpl(0) : m7774constructorimpl;
                        if (!z8) {
                            sp = BattleFlowDimens.INSTANCE.m13148getBetGroupHeaderFontXSAIIZE();
                        } else {
                            sp = TextUnitKt.getSp(14);
                        }
                        long j7 = sp;
                        if (!z8) {
                            m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13150getBetGroupLockIconD9Ej5fM();
                        } else {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(24);
                        }
                        float f2 = m7774constructorimpl2;
                        if (!z8) {
                            m7774constructorimpl3 = BattleFlowDimens.INSTANCE.m13147getBetGroupCardPaddingHD9Ej5fM();
                        } else {
                            m7774constructorimpl3 = Dp.m7774constructorimpl(4);
                        }
                        z9 = !z15 && j6 > 0;
                        float f3 = m7774constructorimpl;
                        Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), m7774constructorimpl3, 0.0f, 2, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function0<Unit> function06 = function05;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f3, f3, f3, m7774constructorimpl4);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        int i23 = 29360128 & i5;
                        z10 = i23 != 8388608;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z10 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                                    BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0(Function0.this);
                                    return BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(weight$default, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                        FontWeight fontWeight = new FontWeight(500);
                        if (!z7) {
                            j3 = ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor();
                        } else {
                            j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                        }
                        int i24 = i21;
                        Modifier modifier4 = modifier3;
                        TextKt.m2642Text4IGK_g(groupName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j7, fontWeight, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(635047514);
                        if (z7) {
                            i13 = 0;
                        } else {
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_lock_icon, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_lock, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                            i13 = 0;
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z8 ? 6 : 8)), startRestartGroup, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        Painter painterResource = PainterResources_androidKt.painterResource(z ? R.drawable.arrow_down_gold : R.drawable.arrow_up_gold, startRestartGroup, i13);
                        ColorFilter.Companion companion = ColorFilter.INSTANCE;
                        if (!z7) {
                            j4 = ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor();
                        } else {
                            j4 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        }
                        ColorFilter m5209tintxETnrds$default = ColorFilter.Companion.m5209tintxETnrds$default(companion, j4, 0, 2, null);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(5004770);
                        i14 = i23 != 8388608 ? 1 : i13;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (i14 == 0 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                                    BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3(Function0.this);
                                    return BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        ImageKt.Image(painterResource, (String) null, ClickAnimationModifierKt.clickAnimation(companion2, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, m5209tintxETnrds$default, startRestartGroup, 48, 56);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(1999896897);
                        if (z9) {
                            function02 = function06;
                            f = 0.0f;
                            obj = null;
                            i15 = 12;
                            r12 = 1;
                        } else {
                            f = 0.0f;
                            obj = null;
                            r12 = 1;
                            i15 = 12;
                            float f4 = 12;
                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f4), 0.0f, Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(8), 2, null);
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
                            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            PlayerStatsMinStakeBannerKt.VarietyMinStakeInfoInGroup(j6, str3, RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, ((i24 >> 21) & 14) | ((i24 >> 12) & 112), 0);
                            startRestartGroup.startReplaceGroup(-621386519);
                            function02 = function06;
                            if (function02 != null) {
                                Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.button_info, startRestartGroup, 6);
                                String stringResource = StringResources_androidKt.stringResource(R.string.cd_info, startRestartGroup, 6);
                                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24));
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z16 = (i24 & 234881024) == 67108864;
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z16 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BetGroupCard$lambda$9$lambda$8$lambda$7$lambda$6;
                                            BetGroupCard$lambda$9$lambda$8$lambda$7$lambda$6 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$8$lambda$7$lambda$6(Function0.this);
                                            return BetGroupCard$lambda$9$lambda$8$lambda$7$lambda$6;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                ImageKt.Image(painterResource2, stringResource, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue3, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1999944892);
                        if (z) {
                            function03 = function02;
                            composer2 = startRestartGroup;
                        } else {
                            float f5 = i15;
                            DividerKt.m2440DivideroMI9zvI(PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f5)), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), Dp.m7774constructorimpl((float) r12), 0.0f, startRestartGroup, 390, 8);
                            function03 = function02;
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, r12, obj), null, false, ComposableLambdaKt.rememberComposableLambda(1043727155, r12, new BetGroupCardKt$BetGroupCard$1$3(bets, z14, groupName, i, emptySet, emptySet2, oddType, z7, onBetClick, num3, function13), composer2, 54), composer2, 3078, 6);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        set3 = emptySet;
                        set4 = emptySet2;
                        z11 = z7;
                        z12 = z14;
                        num2 = num3;
                        function12 = function13;
                        str2 = str3;
                        z13 = z15;
                        j5 = j6;
                        function04 = function03;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        set3 = set;
                        set4 = set2;
                        z11 = z2;
                        z8 = z4;
                        str2 = str;
                        function04 = function0;
                        composer2 = startRestartGroup;
                        z13 = z6;
                        j5 = j2;
                        z12 = z3;
                        num2 = num;
                        function12 = function1;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final boolean z17 = z8;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit BetGroupCard$lambda$10;
                                BetGroupCard$lambda$10 = BetGroupCardKt.BetGroupCard$lambda$10(Modifier.this, groupName, bets, oddType, z, set3, set4, onExpandToggle, onBetClick, z11, i, z12, z17, num2, function12, str2, z13, j5, function04, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                return BetGroupCard$lambda$10;
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 = i4 & 32768;
                if (i9 == 0) {
                }
                i10 = i4 & 65536;
                if (i10 == 0) {
                }
                i11 = i4 & 131072;
                if (i11 == 0) {
                }
                i12 = i4 & 262144;
                if (i12 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
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
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z8) {
                }
                if (!z) {
                }
                if (!z8) {
                }
                long j72 = sp;
                if (!z8) {
                }
                float f22 = m7774constructorimpl2;
                if (!z8) {
                }
                if (z15) {
                }
                float f32 = m7774constructorimpl;
                Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), m7774constructorimpl3, 0.0f, 2, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                Function0<Unit> function062 = function05;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f32, f32, f32, m7774constructorimpl4);
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                Modifier weight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                startRestartGroup.startReplaceGroup(5004770);
                int i232 = 29360128 & i5;
                if (i232 != 8388608) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z10) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                        BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0(Function0.this);
                        return BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(weight$default2, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight fontWeight2 = new FontWeight(500);
                if (!z7) {
                }
                int i242 = i21;
                Modifier modifier42 = modifier3;
                TextKt.m2642Text4IGK_g(groupName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j72, fontWeight2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(635047514);
                if (z7) {
                }
                startRestartGroup.endReplaceGroup();
                Painter painterResource3 = PainterResources_androidKt.painterResource(z ? R.drawable.arrow_down_gold : R.drawable.arrow_up_gold, startRestartGroup, i13);
                ColorFilter.Companion companion3 = ColorFilter.INSTANCE;
                if (!z7) {
                }
                ColorFilter m5209tintxETnrds$default2 = ColorFilter.Companion.m5209tintxETnrds$default(companion3, j4, 0, 2, null);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                if (i232 != 8388608) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (i14 == 0) {
                }
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                        BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3(Function0.this);
                        return BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                ImageKt.Image(painterResource3, (String) null, ClickAnimationModifierKt.clickAnimation(companion22, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, m5209tintxETnrds$default2, startRestartGroup, 48, 56);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(1999896897);
                if (z9) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1999944892);
                if (z) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                set3 = emptySet;
                set4 = emptySet2;
                z11 = z7;
                z12 = z14;
                num2 = num3;
                function12 = function13;
                str2 = str3;
                z13 = z15;
                j5 = j6;
                function04 = function03;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i4 & 16384;
            if (i8 != 0) {
            }
            i9 = i4 & 32768;
            if (i9 == 0) {
            }
            i10 = i4 & 65536;
            if (i10 == 0) {
            }
            i11 = i4 & 131072;
            if (i11 == 0) {
            }
            i12 = i4 & 262144;
            if (i12 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
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
            if (i12 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z8) {
            }
            if (!z) {
            }
            if (!z8) {
            }
            long j722 = sp;
            if (!z8) {
            }
            float f222 = m7774constructorimpl2;
            if (!z8) {
            }
            if (z15) {
            }
            float f322 = m7774constructorimpl;
            Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), m7774constructorimpl3, 0.0f, 2, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU22);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            Function0<Unit> function0622 = function05;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            Modifier m1519paddingqDBjuR022 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f322, f322, f322, m7774constructorimpl4);
            Alignment.Vertical centerVertically42 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically42, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR022);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            Modifier weight$default22 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            startRestartGroup.startReplaceGroup(5004770);
            int i2322 = 29360128 & i5;
            if (i2322 != 8388608) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z10) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                    BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0(Function0.this);
                    return BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(weight$default22, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight fontWeight22 = new FontWeight(500);
            if (!z7) {
            }
            int i2422 = i21;
            Modifier modifier422 = modifier3;
            TextKt.m2642Text4IGK_g(groupName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j722, fontWeight22, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(635047514);
            if (z7) {
            }
            startRestartGroup.endReplaceGroup();
            Painter painterResource32 = PainterResources_androidKt.painterResource(z ? R.drawable.arrow_down_gold : R.drawable.arrow_up_gold, startRestartGroup, i13);
            ColorFilter.Companion companion32 = ColorFilter.INSTANCE;
            if (!z7) {
            }
            ColorFilter m5209tintxETnrds$default22 = ColorFilter.Companion.m5209tintxETnrds$default(companion32, j4, 0, 2, null);
            Modifier.Companion companion222 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            if (i2322 != 8388608) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (i14 == 0) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                    BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3(Function0.this);
                    return BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(painterResource32, (String) null, ClickAnimationModifierKt.clickAnimation(companion222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, m5209tintxETnrds$default22, startRestartGroup, 48, 56);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1999896897);
            if (z9) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1999944892);
            if (z) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422;
            set3 = emptySet;
            set4 = emptySet2;
            z11 = z7;
            z12 = z14;
            num2 = num3;
            function12 = function13;
            str2 = str3;
            z13 = z15;
            j5 = j6;
            function04 = function03;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i4 & 8192;
        if (i7 == 0) {
        }
        i8 = i4 & 16384;
        if (i8 != 0) {
        }
        i9 = i4 & 32768;
        if (i9 == 0) {
        }
        i10 = i4 & 65536;
        if (i10 == 0) {
        }
        i11 = i4 & 131072;
        if (i11 == 0) {
        }
        i12 = i4 & 262144;
        if (i12 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
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
        if (i12 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z8) {
        }
        if (!z) {
        }
        if (!z8) {
        }
        long j7222 = sp;
        if (!z8) {
        }
        float f2222 = m7774constructorimpl2;
        if (!z8) {
        }
        if (z15) {
        }
        float f3222 = m7774constructorimpl;
        Modifier m1024backgroundbw27NRU222 = BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), m7774constructorimpl3, 0.0f, 2, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU222);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function06222 = function05;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash522);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        Modifier m1519paddingqDBjuR0222 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f3222, f3222, f3222, m7774constructorimpl4);
        Alignment.Vertical centerVertically422 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically422, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        Modifier weight$default222 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        startRestartGroup.startReplaceGroup(5004770);
        int i23222 = 29360128 & i5;
        if (i23222 != 8388608) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z10) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
                BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0(Function0.this);
                return BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(weight$default222, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight fontWeight222 = new FontWeight(500);
        if (!z7) {
        }
        int i24222 = i21;
        Modifier modifier4222 = modifier3;
        TextKt.m2642Text4IGK_g(groupName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j7222, fontWeight222, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(635047514);
        if (z7) {
        }
        startRestartGroup.endReplaceGroup();
        Painter painterResource322 = PainterResources_androidKt.painterResource(z ? R.drawable.arrow_down_gold : R.drawable.arrow_up_gold, startRestartGroup, i13);
        ColorFilter.Companion companion322 = ColorFilter.INSTANCE;
        if (!z7) {
        }
        ColorFilter m5209tintxETnrds$default222 = ColorFilter.Companion.m5209tintxETnrds$default(companion322, j4, 0, 2, null);
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        if (i23222 != 8388608) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (i14 == 0) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupCardKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
                BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3 = BetGroupCardKt.BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3(Function0.this);
                return BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        ImageKt.Image(painterResource322, (String) null, ClickAnimationModifierKt.clickAnimation(companion2222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, m5209tintxETnrds$default222, startRestartGroup, 48, 56);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1999896897);
        if (z9) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1999944892);
        if (z) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222;
        set3 = emptySet;
        set4 = emptySet2;
        z11 = z7;
        z12 = z14;
        num2 = num3;
        function12 = function13;
        str2 = str3;
        z13 = z15;
        j5 = j6;
        function04 = function03;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupCard$lambda$9$lambda$5$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupCard$lambda$9$lambda$5$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupCard$lambda$9$lambda$8$lambda$7$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
