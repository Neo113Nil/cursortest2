package org.betup.ui.dialogs.compose;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.challenges.NewChallengeBetDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetTypeGroupModel;
import org.betup.model.remote.entity.challenges.NewChallengeCountryModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatorModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.challenges.NewChallengeLeagueModel;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.betup.model.remote.entity.challenges.NewChallengeSportModel;
import org.betup.model.remote.entity.challenges.NewChallengeTeamModel;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.utils.BattleDetailsMapper;
import org.betup.utils.BattleShareCaptureAnchor;
import org.betup.utils.ChallengeEffectiveStateResolver;
import org.betup.utils.SharedPrefs;
import org.betup.utils.UiExtensionsKt;

/* compiled from: ChallengePreviewScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aÛ\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00052:\b\u0002\u0010\u0012\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132:\b\u0002\u0010\u0018\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010$\u001a\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005H\u0002\u001a\r\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010$\u001a\r\u0010(\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010$¨\u0006)"}, d2 = {"ChallengePreviewScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "challengeDetails", "Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "oddType", "Lorg/betup/model/local/entity/OddType;", "currentUserId", "", "onDismiss", "Lkotlin/Function0;", "onAcceptChallenge", "onDeclineChallenge", "onCancelChallenge", "isCancelInProgress", "onMatchClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "matchId", "isLive", "onLeagueClick", "leagueId", "onShare", "onRematch", "onHowBattlesDecided", "activity", "Lorg/betup/ui/MainActivity;", "embeddedInPager", "shareCaptureAnchor", "Lorg/betup/utils/BattleShareCaptureAnchor;", "(Landroidx/compose/ui/Modifier;ZLorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;Lorg/betup/model/local/entity/OddType;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/MainActivity;ZLorg/betup/utils/BattleShareCaptureAnchor;Landroidx/compose/runtime/Composer;III)V", "Preview_ChallengePreview_Loading", "(Landroidx/compose/runtime/Composer;I)V", "sampleChallengeDetails", "twoUsers", "Preview_ChallengePreview_OneUser", "Preview_ChallengePreview_TwoUsers", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengePreviewScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengePreviewScreen$lambda$7(Modifier modifier, boolean z, NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, OddType oddType, Long l, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z2, Function2 function2, Function2 function22, Function0 function05, Function0 function06, Function0 function07, MainActivity mainActivity, boolean z3, BattleShareCaptureAnchor battleShareCaptureAnchor, int i, int i2, int i3, Composer composer, int i4) {
        ChallengePreviewScreen(modifier, z, newChallengeDetailsResponseModelP, oddType, l, function0, function02, function03, function04, z2, function2, function22, function05, function06, function07, mainActivity, z3, battleShareCaptureAnchor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_ChallengePreview_Loading$lambda$10(int i, Composer composer, int i2) {
        Preview_ChallengePreview_Loading(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_ChallengePreview_OneUser$lambda$13(int i, Composer composer, int i2) {
        Preview_ChallengePreview_OneUser(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_ChallengePreview_TwoUsers$lambda$16(int i, Composer composer, int i2) {
        Preview_ChallengePreview_TwoUsers(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0649 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0654 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChallengePreviewScreen(Modifier modifier, final boolean z, final NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, final OddType oddType, Long l, final Function0<Unit> onDismiss, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z2, Function2<? super Long, ? super Boolean, Unit> function2, Function2<? super Long, ? super Boolean, Unit> function22, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, MainActivity mainActivity, boolean z3, BattleShareCaptureAnchor battleShareCaptureAnchor, Composer composer, final int i, final int i2, final int i3) {
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
        int i14;
        int i15;
        int i16;
        Long l2;
        boolean z4;
        boolean z5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        List<NewChallengeParticipantModel> emptyList;
        List<NewChallengeBetModel> emptyList2;
        Iterator<NewChallengeParticipantModel> it;
        int i17;
        NewChallengeBetModel newChallengeBetModel;
        String str;
        Integer resolveEffectiveStateInt;
        boolean changedInstance;
        Object rememberedValue;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean changed;
        Object rememberedValue2;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        float m7774constructorimpl4;
        Composer composer2;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        final boolean z9;
        final Function2<? super Long, ? super Boolean, Unit> function23;
        final Function2<? super Long, ? super Boolean, Unit> function24;
        final Function0<Unit> function010;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final MainActivity mainActivity2;
        final boolean z10;
        final BattleShareCaptureAnchor battleShareCaptureAnchor2;
        final Long l3;
        final Modifier modifier2;
        NewChallengeDetailsModel challenge;
        NewChallengeDetailsModel challenge2;
        NewChallengeCreatorModel createdBy;
        NewChallengeMatchModel match;
        Integer participantState;
        NewChallengeDetailsModel challenge3;
        NewChallengeDetailsModel challenge4;
        NewChallengeBetDetailsModel bet;
        NewChallengeDetailsModel challenge5;
        NewChallengeCreatorModel createdBy2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1001584176);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(oddType.ordinal()) ? 2048 : 1024;
        }
        int i19 = i3 & 16;
        if (i19 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(l) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i10 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i10 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
            } else {
                i9 = i2;
                i11 = i3 & 4096;
                if (i11 != 0) {
                    i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i9 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i9 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i9 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                        i13 = i3 & 16384;
                        if (i13 != 0) {
                            i9 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i9 |= startRestartGroup.changedInstance(function06) ? 16384 : 8192;
                            i14 = i3 & 32768;
                            if (i14 == 0) {
                                i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i9 |= startRestartGroup.changedInstance(mainActivity) ? 131072 : 65536;
                            }
                            i15 = i3 & 65536;
                            if (i15 == 0) {
                                i9 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i9 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                            i16 = i3 & 131072;
                            if (i16 == 0) {
                                i9 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i9 |= startRestartGroup.changedInstance(battleShareCaptureAnchor) ? 8388608 : 4194304;
                            }
                            if ((i4 & 302589075) == 302589074 || (4793475 & i9) != 4793474 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i18 == 0 ? Modifier.INSTANCE : modifier;
                                l2 = i19 == 0 ? null : l;
                                Function0<Unit> function013 = i5 == 0 ? null : function0;
                                Function0<Unit> function014 = (i3 & 128) == 0 ? null : function02;
                                Function0<Unit> function015 = i6 == 0 ? null : function03;
                                boolean z11 = i7 == 0 ? false : z2;
                                Function2<? super Long, ? super Boolean, Unit> function25 = i8 == 0 ? null : function2;
                                Function2<? super Long, ? super Boolean, Unit> function26 = (i3 & 2048) == 0 ? null : function22;
                                Function0<Unit> function016 = i11 == 0 ? null : function04;
                                Function0<Unit> function017 = i12 == 0 ? null : function05;
                                Function0<Unit> function018 = i13 == 0 ? null : function06;
                                MainActivity mainActivity3 = i14 == 0 ? null : mainActivity;
                                z4 = i15 == 0 ? false : z3;
                                BattleShareCaptureAnchor battleShareCaptureAnchor3 = i16 == 0 ? null : battleShareCaptureAnchor;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1001584176, i4, i9, "org.betup.ui.dialogs.compose.ChallengePreviewScreen (ChallengePreviewScreen.kt:100)");
                                }
                                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i20 = ((Configuration) consume).screenHeightDp;
                                boolean z12 = i20 >= 740;
                                z5 = i20 >= 680;
                                float m7774constructorimpl5 = Dp.m7774constructorimpl(i20 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                                startRestartGroup.startReplaceGroup(-390491223);
                                if (z4) {
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    BoxKt.Box(ClickableKt.m1057clickableO2vRcR0$default(fillMaxSize$default2, (MutableInteractionSource) rememberedValue3, null, false, null, null, onDismiss, 28, null), startRestartGroup, 0);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier align = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                if (newChallengeDetailsResponseModelP != null || (emptyList = newChallengeDetailsResponseModelP.getParticipantUsers()) == null) {
                                    emptyList = CollectionsKt.emptyList();
                                }
                                if (newChallengeDetailsResponseModelP != null || (emptyList2 = newChallengeDetailsResponseModelP.getBets()) == null) {
                                    emptyList2 = CollectionsKt.emptyList();
                                }
                                Long valueOf = (newChallengeDetailsResponseModelP != null || (createdBy2 = newChallengeDetailsResponseModelP.getCreatedBy()) == null) ? null : Long.valueOf(createdBy2.getId());
                                boolean z13 = emptyList.size() > 1;
                                Integer state = (newChallengeDetailsResponseModelP != null || (challenge5 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge5.getState();
                                Integer participantState2 = newChallengeDetailsResponseModelP == null ? newChallengeDetailsResponseModelP.getParticipantState() : null;
                                it = emptyList.iterator();
                                i17 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        long id = it.next().getId();
                                        if (valueOf == null || id != valueOf.longValue()) {
                                            break;
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        i17 = -1;
                                        break;
                                    }
                                }
                                int i21 = i17;
                                newChallengeBetModel = i21 < 0 ? (NewChallengeBetModel) CollectionsKt.getOrNull(emptyList2, i21) : null;
                                if (newChallengeBetModel != null || (bet = newChallengeBetModel.getBet()) == null || (str = bet.getBetName()) == null || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL) || StringsKt.isBlank(str)) {
                                    str = null;
                                }
                                resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
                                Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
                                Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                                Boolean valueOf2 = Boolean.valueOf(z);
                                Long id2 = (newChallengeDetailsResponseModelP != null || (challenge3 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge3.getId();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf2, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                                int intValue = resolveEffectiveStateInt == null ? resolveEffectiveStateInt.intValue() : 0;
                                z6 = newChallengeDetailsResponseModelP == null && (participantState = newChallengeDetailsResponseModelP.getParticipantState()) != null && participantState.intValue() == 1 && function013 != null;
                                BattleDetailsMapper.AmountDisplay resolveAmountDisplay = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
                                String amountText = resolveAmountDisplay.getAmountText();
                                boolean contains = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                                boolean z14 = (contains || function016 == null || function017 == null) ? false : true;
                                z7 = newChallengeDetailsResponseModelP == null && !z;
                                if (newChallengeDetailsResponseModelP != null && l2 != null) {
                                    createdBy = newChallengeDetailsResponseModelP.getCreatedBy();
                                    if (Intrinsics.areEqual(createdBy == null ? Long.valueOf(createdBy.getId()) : null, l2) && state != null && state.intValue() == 1 && (((match = newChallengeDetailsResponseModelP.getMatch()) == null || !UiExtensionsKt.isStarted(match)) && function015 != null)) {
                                        z8 = true;
                                        BattleResultPalette from = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                                        startRestartGroup.startReplaceGroup(-758081866);
                                        String stringResource = !z6 ? StringResources_androidKt.stringResource(R.string.quiz_potential_prize, startRestartGroup, 6) : null;
                                        startRestartGroup.endReplaceGroup();
                                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localContext);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Context context = (Context) consume2;
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed = startRestartGroup.changed(context);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context));
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
                                        startRestartGroup.endReplaceGroup();
                                        boolean contains2 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                                        int rememberBattleRevealPhase = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains2, startRestartGroup, 0);
                                        float m7774constructorimpl6 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                                        if (z7) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(0);
                                        } else if (z5 && contains2) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(64);
                                        } else if (z5) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(78);
                                        } else if (z12 && contains2) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(72);
                                        } else if (z12) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(88);
                                        } else if (contains2) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(84);
                                        } else {
                                            m7774constructorimpl = Dp.m7774constructorimpl(104);
                                        }
                                        float f = m7774constructorimpl;
                                        if (!z5) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(-66);
                                        } else if (z12) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(-74);
                                        } else {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(-86);
                                        }
                                        float f2 = m7774constructorimpl2;
                                        if (!z5) {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(10);
                                        } else if (z12) {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(12);
                                        } else if (z14 || z7) {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                                        } else {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(14);
                                        }
                                        float f3 = m7774constructorimpl3;
                                        if (!z5) {
                                            m7774constructorimpl4 = Dp.m7774constructorimpl(14);
                                        } else if (z12) {
                                            m7774constructorimpl4 = Dp.m7774constructorimpl(18);
                                        } else {
                                            m7774constructorimpl4 = Dp.m7774constructorimpl(24);
                                        }
                                        float f4 = m7774constructorimpl4;
                                        ProvidedValue<Object> provides = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                                        Long l4 = l2;
                                        Modifier modifier4 = modifier3;
                                        ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$2 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance2, z12, f4, z7, f, battleShareCaptureAnchor3, from, f2, booleanValue, rememberBattleRevealPhase, m7774constructorimpl5, m7774constructorimpl6, f3, amountText, resolveAmountDisplay, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l4, state, intValue, z5, oddType, mainActivity3, onDismiss, contains, z8, z11, function015);
                                        composer2 = startRestartGroup;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$2, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                                        function07 = function013;
                                        function08 = function014;
                                        function09 = function015;
                                        z9 = z11;
                                        function23 = function25;
                                        function24 = function26;
                                        function010 = function016;
                                        function011 = function017;
                                        function012 = function018;
                                        mainActivity2 = mainActivity3;
                                        z10 = z4;
                                        battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                                        l3 = l4;
                                        modifier2 = modifier4;
                                    }
                                }
                                z8 = false;
                                BattleResultPalette from2 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                                startRestartGroup.startReplaceGroup(-758081866);
                                if (!z6) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume22 = startRestartGroup.consume(localContext2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Context context2 = (Context) consume22;
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(context2);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context2));
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                boolean booleanValue2 = ((Boolean) rememberedValue2).booleanValue();
                                startRestartGroup.endReplaceGroup();
                                boolean contains22 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                                int rememberBattleRevealPhase2 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue2 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains22, startRestartGroup, 0);
                                float m7774constructorimpl62 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                                if (z7) {
                                }
                                float f5 = m7774constructorimpl;
                                if (!z5) {
                                }
                                float f22 = m7774constructorimpl2;
                                if (!z5) {
                                }
                                float f32 = m7774constructorimpl3;
                                if (!z5) {
                                }
                                float f42 = m7774constructorimpl4;
                                ProvidedValue<Object> provides2 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                                Long l42 = l2;
                                Modifier modifier42 = modifier3;
                                ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$22 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance2, z12, f42, z7, f5, battleShareCaptureAnchor3, from2, f22, booleanValue2, rememberBattleRevealPhase2, m7774constructorimpl5, m7774constructorimpl62, f32, amountText, resolveAmountDisplay, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l42, state, intValue, z5, oddType, mainActivity3, onDismiss, contains, z8, z11, function015);
                                composer2 = startRestartGroup;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides2, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$22, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                                function07 = function013;
                                function08 = function014;
                                function09 = function015;
                                z9 = z11;
                                function23 = function25;
                                function24 = function26;
                                function010 = function016;
                                function011 = function017;
                                function012 = function018;
                                mainActivity2 = mainActivity3;
                                z10 = z4;
                                battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                                l3 = l42;
                                modifier2 = modifier42;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                l3 = l;
                                function07 = function0;
                                function09 = function03;
                                z9 = z2;
                                function23 = function2;
                                function24 = function22;
                                function010 = function04;
                                function011 = function05;
                                function012 = function06;
                                mainActivity2 = mainActivity;
                                z10 = z3;
                                battleShareCaptureAnchor2 = battleShareCaptureAnchor;
                                composer2 = startRestartGroup;
                                function08 = function02;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ChallengePreviewScreen$lambda$7;
                                        ChallengePreviewScreen$lambda$7 = ChallengePreviewScreenKt.ChallengePreviewScreen$lambda$7(Modifier.this, z, newChallengeDetailsResponseModelP, oddType, l3, onDismiss, function07, function08, function09, z9, function23, function24, function010, function011, function012, mainActivity2, z10, battleShareCaptureAnchor2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return ChallengePreviewScreen$lambda$7;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i3 & 32768;
                        if (i14 == 0) {
                        }
                        i15 = i3 & 65536;
                        if (i15 == 0) {
                        }
                        i16 = i3 & 131072;
                        if (i16 == 0) {
                        }
                        if ((i4 & 302589075) == 302589074) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i202 = ((Configuration) consume3).screenHeightDp;
                        if (i202 >= 740) {
                        }
                        if (i202 >= 680) {
                        }
                        float m7774constructorimpl52 = Dp.m7774constructorimpl(i202 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-390491223);
                        if (z4) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier align2 = boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, align2);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        if (newChallengeDetailsResponseModelP != null) {
                        }
                        emptyList = CollectionsKt.emptyList();
                        if (newChallengeDetailsResponseModelP != null) {
                        }
                        emptyList2 = CollectionsKt.emptyList();
                        if (newChallengeDetailsResponseModelP != null) {
                        }
                        if (emptyList.size() > 1) {
                        }
                        if (newChallengeDetailsResponseModelP != null) {
                        }
                        if (newChallengeDetailsResponseModelP == null) {
                        }
                        it = emptyList.iterator();
                        i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                            }
                            i17++;
                        }
                        int i212 = i17;
                        if (i212 < 0) {
                        }
                        if (newChallengeBetModel != null) {
                        }
                        str = null;
                        resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
                        Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
                        Function1<HapticFeedbackType, Unit> rememberHapticFeedback2 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                        Boolean valueOf22 = Boolean.valueOf(z);
                        if (newChallengeDetailsResponseModelP != null) {
                        }
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf22, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                        if (resolveEffectiveStateInt == null) {
                        }
                        if (newChallengeDetailsResponseModelP == null) {
                        }
                        BattleDetailsMapper.AmountDisplay resolveAmountDisplay2 = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
                        String amountText2 = resolveAmountDisplay2.getAmountText();
                        boolean contains3 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                        if (contains3) {
                        }
                        if (newChallengeDetailsResponseModelP == null) {
                        }
                        if (newChallengeDetailsResponseModelP != null) {
                            createdBy = newChallengeDetailsResponseModelP.getCreatedBy();
                            if (Intrinsics.areEqual(createdBy == null ? Long.valueOf(createdBy.getId()) : null, l2)) {
                                z8 = true;
                                BattleResultPalette from22 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                                startRestartGroup.startReplaceGroup(-758081866);
                                if (!z6) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume222 = startRestartGroup.consume(localContext22);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Context context22 = (Context) consume222;
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(context22);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context22));
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                boolean booleanValue22 = ((Boolean) rememberedValue2).booleanValue();
                                startRestartGroup.endReplaceGroup();
                                boolean contains222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                                int rememberBattleRevealPhase22 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue22 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains222, startRestartGroup, 0);
                                float m7774constructorimpl622 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                                if (z7) {
                                }
                                float f52 = m7774constructorimpl;
                                if (!z5) {
                                }
                                float f222 = m7774constructorimpl2;
                                if (!z5) {
                                }
                                float f322 = m7774constructorimpl3;
                                if (!z5) {
                                }
                                float f422 = m7774constructorimpl4;
                                ProvidedValue<Object> provides22 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                                Long l422 = l2;
                                Modifier modifier422 = modifier3;
                                ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance22, z12, f422, z7, f52, battleShareCaptureAnchor3, from22, f222, booleanValue22, rememberBattleRevealPhase22, m7774constructorimpl52, m7774constructorimpl622, f322, amountText2, resolveAmountDisplay2, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l422, state, intValue, z5, oddType, mainActivity3, onDismiss, contains3, z8, z11, function015);
                                composer2 = startRestartGroup;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides22, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                                function07 = function013;
                                function08 = function014;
                                function09 = function015;
                                z9 = z11;
                                function23 = function25;
                                function24 = function26;
                                function010 = function016;
                                function011 = function017;
                                function012 = function018;
                                mainActivity2 = mainActivity3;
                                z10 = z4;
                                battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                                l3 = l422;
                                modifier2 = modifier422;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                        }
                        z8 = false;
                        BattleResultPalette from222 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                        startRestartGroup.startReplaceGroup(-758081866);
                        if (!z6) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2222 = startRestartGroup.consume(localContext222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Context context222 = (Context) consume2222;
                        startRestartGroup.startReplaceGroup(5004770);
                        changed = startRestartGroup.changed(context222);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context222));
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        boolean booleanValue222 = ((Boolean) rememberedValue2).booleanValue();
                        startRestartGroup.endReplaceGroup();
                        boolean contains2222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                        int rememberBattleRevealPhase222 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue222 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains2222, startRestartGroup, 0);
                        float m7774constructorimpl6222 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                        if (z7) {
                        }
                        float f522 = m7774constructorimpl;
                        if (!z5) {
                        }
                        float f2222 = m7774constructorimpl2;
                        if (!z5) {
                        }
                        float f3222 = m7774constructorimpl3;
                        if (!z5) {
                        }
                        float f4222 = m7774constructorimpl4;
                        ProvidedValue<Object> provides222 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                        Long l4222 = l2;
                        Modifier modifier4222 = modifier3;
                        ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$2222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance22, z12, f4222, z7, f522, battleShareCaptureAnchor3, from222, f2222, booleanValue222, rememberBattleRevealPhase222, m7774constructorimpl52, m7774constructorimpl6222, f3222, amountText2, resolveAmountDisplay2, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l4222, state, intValue, z5, oddType, mainActivity3, onDismiss, contains3, z8, z11, function015);
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides222, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$2222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                        function07 = function013;
                        function08 = function014;
                        function09 = function015;
                        z9 = z11;
                        function23 = function25;
                        function24 = function26;
                        function010 = function016;
                        function011 = function017;
                        function012 = function018;
                        mainActivity2 = mainActivity3;
                        z10 = z4;
                        battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                        l3 = l4222;
                        modifier2 = modifier4222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i3 & 16384;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 32768;
                    if (i14 == 0) {
                    }
                    i15 = i3 & 65536;
                    if (i15 == 0) {
                    }
                    i16 = i3 & 131072;
                    if (i16 == 0) {
                    }
                    if ((i4 & 302589075) == 302589074) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localConfiguration22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i2022 = ((Configuration) consume32).screenHeightDp;
                    if (i2022 >= 740) {
                    }
                    if (i2022 >= 680) {
                    }
                    float m7774constructorimpl522 = Dp.m7774constructorimpl(i2022 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
                    Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-390491223);
                    if (z4) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier align22 = boxScopeInstance32.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, align22);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    emptyList = CollectionsKt.emptyList();
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    emptyList2 = CollectionsKt.emptyList();
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    if (emptyList.size() > 1) {
                    }
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    if (newChallengeDetailsResponseModelP == null) {
                    }
                    it = emptyList.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                        }
                        i17++;
                    }
                    int i2122 = i17;
                    if (i2122 < 0) {
                    }
                    if (newChallengeBetModel != null) {
                    }
                    str = null;
                    resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
                    Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
                    Function1<HapticFeedbackType, Unit> rememberHapticFeedback22 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                    Boolean valueOf222 = Boolean.valueOf(z);
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback22, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf222, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                    if (resolveEffectiveStateInt == null) {
                    }
                    if (newChallengeDetailsResponseModelP == null) {
                    }
                    BattleDetailsMapper.AmountDisplay resolveAmountDisplay22 = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
                    String amountText22 = resolveAmountDisplay22.getAmountText();
                    boolean contains32 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                    if (contains32) {
                    }
                    if (newChallengeDetailsResponseModelP == null) {
                    }
                    if (newChallengeDetailsResponseModelP != null) {
                    }
                    z8 = false;
                    BattleResultPalette from2222 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                    startRestartGroup.startReplaceGroup(-758081866);
                    if (!z6) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22222 = startRestartGroup.consume(localContext2222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context2222 = (Context) consume22222;
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(context2222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context2222));
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    boolean booleanValue2222 = ((Boolean) rememberedValue2).booleanValue();
                    startRestartGroup.endReplaceGroup();
                    boolean contains22222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                    int rememberBattleRevealPhase2222 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue2222 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains22222, startRestartGroup, 0);
                    float m7774constructorimpl62222 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                    if (z7) {
                    }
                    float f5222 = m7774constructorimpl;
                    if (!z5) {
                    }
                    float f22222 = m7774constructorimpl2;
                    if (!z5) {
                    }
                    float f32222 = m7774constructorimpl3;
                    if (!z5) {
                    }
                    float f42222 = m7774constructorimpl4;
                    ProvidedValue<Object> provides2222 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                    Long l42222 = l2;
                    Modifier modifier42222 = modifier3;
                    ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$22222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance222, z12, f42222, z7, f5222, battleShareCaptureAnchor3, from2222, f22222, booleanValue2222, rememberBattleRevealPhase2222, m7774constructorimpl522, m7774constructorimpl62222, f32222, amountText22, resolveAmountDisplay22, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l42222, state, intValue, z5, oddType, mainActivity3, onDismiss, contains32, z8, z11, function015);
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides2222, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$22222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                    function07 = function013;
                    function08 = function014;
                    function09 = function015;
                    z9 = z11;
                    function23 = function25;
                    function24 = function26;
                    function010 = function016;
                    function011 = function017;
                    function012 = function018;
                    mainActivity2 = mainActivity3;
                    z10 = z4;
                    battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                    l3 = l42222;
                    modifier2 = modifier42222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                i13 = i3 & 16384;
                if (i13 != 0) {
                }
                i14 = i3 & 32768;
                if (i14 == 0) {
                }
                i15 = i3 & 65536;
                if (i15 == 0) {
                }
                i16 = i3 & 131072;
                if (i16 == 0) {
                }
                if ((i4 & 302589075) == 302589074) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localConfiguration222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i20222 = ((Configuration) consume322).screenHeightDp;
                if (i20222 >= 740) {
                }
                if (i20222 >= 680) {
                }
                float m7774constructorimpl5222 = Dp.m7774constructorimpl(i20222 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
                Modifier fillMaxSize$default322 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Alignment center222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-390491223);
                if (z4) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier align222 = boxScopeInstance322.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, align222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                if (newChallengeDetailsResponseModelP != null) {
                }
                emptyList = CollectionsKt.emptyList();
                if (newChallengeDetailsResponseModelP != null) {
                }
                emptyList2 = CollectionsKt.emptyList();
                if (newChallengeDetailsResponseModelP != null) {
                }
                if (emptyList.size() > 1) {
                }
                if (newChallengeDetailsResponseModelP != null) {
                }
                if (newChallengeDetailsResponseModelP == null) {
                }
                it = emptyList.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i17++;
                }
                int i21222 = i17;
                if (i21222 < 0) {
                }
                if (newChallengeBetModel != null) {
                }
                str = null;
                resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
                Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
                Function1<HapticFeedbackType, Unit> rememberHapticFeedback222 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                Boolean valueOf2222 = Boolean.valueOf(z);
                if (newChallengeDetailsResponseModelP != null) {
                }
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback222, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2222, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                if (resolveEffectiveStateInt == null) {
                }
                if (newChallengeDetailsResponseModelP == null) {
                }
                BattleDetailsMapper.AmountDisplay resolveAmountDisplay222 = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
                String amountText222 = resolveAmountDisplay222.getAmountText();
                boolean contains322 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                if (contains322) {
                }
                if (newChallengeDetailsResponseModelP == null) {
                }
                if (newChallengeDetailsResponseModelP != null) {
                }
                z8 = false;
                BattleResultPalette from22222 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
                startRestartGroup.startReplaceGroup(-758081866);
                if (!z6) {
                }
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Context> localContext22222 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222222 = startRestartGroup.consume(localContext22222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context22222 = (Context) consume222222;
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(context22222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context22222));
                startRestartGroup.updateRememberedValue(rememberedValue2);
                boolean booleanValue22222 = ((Boolean) rememberedValue2).booleanValue();
                startRestartGroup.endReplaceGroup();
                boolean contains222222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
                int rememberBattleRevealPhase22222 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue22222 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains222222, startRestartGroup, 0);
                float m7774constructorimpl622222 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
                if (z7) {
                }
                float f52222 = m7774constructorimpl;
                if (!z5) {
                }
                float f222222 = m7774constructorimpl2;
                if (!z5) {
                }
                float f322222 = m7774constructorimpl3;
                if (!z5) {
                }
                float f422222 = m7774constructorimpl4;
                ProvidedValue<Object> provides22222 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
                Long l422222 = l2;
                Modifier modifier422222 = modifier3;
                ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$222222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance2222, z12, f422222, z7, f52222, battleShareCaptureAnchor3, from22222, f222222, booleanValue22222, rememberBattleRevealPhase22222, m7774constructorimpl5222, m7774constructorimpl622222, f322222, amountText222, resolveAmountDisplay222, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l422222, state, intValue, z5, oddType, mainActivity3, onDismiss, contains322, z8, z11, function015);
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides22222, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$222222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
                function07 = function013;
                function08 = function014;
                function09 = function015;
                z9 = z11;
                function23 = function25;
                function24 = function26;
                function010 = function016;
                function011 = function017;
                function012 = function018;
                mainActivity2 = mainActivity3;
                z10 = z4;
                battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
                l3 = l422222;
                modifier2 = modifier422222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i10;
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            i13 = i3 & 16384;
            if (i13 != 0) {
            }
            i14 = i3 & 32768;
            if (i14 == 0) {
            }
            i15 = i3 & 65536;
            if (i15 == 0) {
            }
            i16 = i3 & 131072;
            if (i16 == 0) {
            }
            if ((i4 & 302589075) == 302589074) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Configuration> localConfiguration2222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localConfiguration2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i202222 = ((Configuration) consume3222).screenHeightDp;
            if (i202222 >= 740) {
            }
            if (i202222 >= 680) {
            }
            float m7774constructorimpl52222 = Dp.m7774constructorimpl(i202222 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
            Modifier fillMaxSize$default3222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-390491223);
            if (z4) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier align2222 = boxScopeInstance3222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, align2222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            if (newChallengeDetailsResponseModelP != null) {
            }
            emptyList = CollectionsKt.emptyList();
            if (newChallengeDetailsResponseModelP != null) {
            }
            emptyList2 = CollectionsKt.emptyList();
            if (newChallengeDetailsResponseModelP != null) {
            }
            if (emptyList.size() > 1) {
            }
            if (newChallengeDetailsResponseModelP != null) {
            }
            if (newChallengeDetailsResponseModelP == null) {
            }
            it = emptyList.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                }
                i17++;
            }
            int i212222 = i17;
            if (i212222 < 0) {
            }
            if (newChallengeBetModel != null) {
            }
            str = null;
            resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
            Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
            Function1<HapticFeedbackType, Unit> rememberHapticFeedback2222 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
            Boolean valueOf22222 = Boolean.valueOf(z);
            if (newChallengeDetailsResponseModelP != null) {
            }
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback2222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback2222, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22222, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
            if (resolveEffectiveStateInt == null) {
            }
            if (newChallengeDetailsResponseModelP == null) {
            }
            BattleDetailsMapper.AmountDisplay resolveAmountDisplay2222 = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
            String amountText2222 = resolveAmountDisplay2222.getAmountText();
            boolean contains3222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
            if (contains3222) {
            }
            if (newChallengeDetailsResponseModelP == null) {
            }
            if (newChallengeDetailsResponseModelP != null) {
            }
            z8 = false;
            BattleResultPalette from222222 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
            startRestartGroup.startReplaceGroup(-758081866);
            if (!z6) {
            }
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext222222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222222 = startRestartGroup.consume(localContext222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context222222 = (Context) consume2222222;
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(context222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context222222));
            startRestartGroup.updateRememberedValue(rememberedValue2);
            boolean booleanValue222222 = ((Boolean) rememberedValue2).booleanValue();
            startRestartGroup.endReplaceGroup();
            boolean contains2222222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
            int rememberBattleRevealPhase222222 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue222222 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains2222222, startRestartGroup, 0);
            float m7774constructorimpl6222222 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
            if (z7) {
            }
            float f522222 = m7774constructorimpl;
            if (!z5) {
            }
            float f2222222 = m7774constructorimpl2;
            if (!z5) {
            }
            float f3222222 = m7774constructorimpl3;
            if (!z5) {
            }
            float f4222222 = m7774constructorimpl4;
            ProvidedValue<Object> provides222222 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
            Long l4222222 = l2;
            Modifier modifier4222222 = modifier3;
            ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$2222222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance22222, z12, f4222222, z7, f522222, battleShareCaptureAnchor3, from222222, f2222222, booleanValue222222, rememberBattleRevealPhase222222, m7774constructorimpl52222, m7774constructorimpl6222222, f3222222, amountText2222, resolveAmountDisplay2222, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l4222222, state, intValue, z5, oddType, mainActivity3, onDismiss, contains3222, z8, z11, function015);
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides222222, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$2222222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            function07 = function013;
            function08 = function014;
            function09 = function015;
            z9 = z11;
            function23 = function25;
            function24 = function26;
            function010 = function016;
            function011 = function017;
            function012 = function018;
            mainActivity2 = mainActivity3;
            z10 = z4;
            battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
            l3 = l4222222;
            modifier2 = modifier4222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i9 = i10;
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        i13 = i3 & 16384;
        if (i13 != 0) {
        }
        i14 = i3 & 32768;
        if (i14 == 0) {
        }
        i15 = i3 & 65536;
        if (i15 == 0) {
        }
        i16 = i3 & 131072;
        if (i16 == 0) {
        }
        if ((i4 & 302589075) == 302589074) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Configuration> localConfiguration22222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localConfiguration22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i2022222 = ((Configuration) consume32222).screenHeightDp;
        if (i2022222 >= 740) {
        }
        if (i2022222 >= 680) {
        }
        float m7774constructorimpl522222 = Dp.m7774constructorimpl(i2022222 * (!z5 ? 0.92f : z12 ? 0.9f : 0.88f));
        Modifier fillMaxSize$default32222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-390491223);
        if (z4) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier align22222 = boxScopeInstance32222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, align22222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        if (newChallengeDetailsResponseModelP != null) {
        }
        emptyList = CollectionsKt.emptyList();
        if (newChallengeDetailsResponseModelP != null) {
        }
        emptyList2 = CollectionsKt.emptyList();
        if (newChallengeDetailsResponseModelP != null) {
        }
        if (emptyList.size() > 1) {
        }
        if (newChallengeDetailsResponseModelP != null) {
        }
        if (newChallengeDetailsResponseModelP == null) {
        }
        it = emptyList.iterator();
        i17 = 0;
        while (true) {
            if (!it.hasNext()) {
            }
            i17++;
        }
        int i2122222 = i17;
        if (i2122222 < 0) {
        }
        if (newChallengeBetModel != null) {
        }
        str = null;
        resolveEffectiveStateInt = ChallengeEffectiveStateResolver.INSTANCE.resolveEffectiveStateInt(state, participantState2, z13, str == null);
        Log.d("ChallengePreviewScreen", "Challenge " + ((newChallengeDetailsResponseModelP != null || (challenge4 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge4.getId()) + " - globalState: " + state + ", participantState: " + participantState2 + ", effectiveState: " + resolveEffectiveStateInt);
        Function1<HapticFeedbackType, Unit> rememberHapticFeedback22222 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
        Boolean valueOf222222 = Boolean.valueOf(z);
        if (newChallengeDetailsResponseModelP != null) {
        }
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(newChallengeDetailsResponseModelP) | startRestartGroup.changed(resolveEffectiveStateInt) | startRestartGroup.changed(rememberHapticFeedback22222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function2) new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$1$1(z, newChallengeDetailsResponseModelP, resolveEffectiveStateInt, rememberHapticFeedback22222, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222222, id2, resolveEffectiveStateInt, (Function2) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
        if (resolveEffectiveStateInt == null) {
        }
        if (newChallengeDetailsResponseModelP == null) {
        }
        BattleDetailsMapper.AmountDisplay resolveAmountDisplay22222 = BattleDetailsMapper.INSTANCE.resolveAmountDisplay(newChallengeDetailsResponseModelP, intValue, z6);
        String amountText22222 = resolveAmountDisplay22222.getAmountText();
        boolean contains32222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
        if (contains32222) {
        }
        if (newChallengeDetailsResponseModelP == null) {
        }
        if (newChallengeDetailsResponseModelP != null) {
        }
        z8 = false;
        BattleResultPalette from2222222 = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
        startRestartGroup.startReplaceGroup(-758081866);
        if (!z6) {
        }
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Context> localContext2222222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222222 = startRestartGroup.consume(localContext2222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2222222 = (Context) consume22222222;
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(context2222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = Boolean.valueOf(SharedPrefs.areVisualEffectsEnabled(context2222222));
        startRestartGroup.updateRememberedValue(rememberedValue2);
        boolean booleanValue2222222 = ((Boolean) rememberedValue2).booleanValue();
        startRestartGroup.endReplaceGroup();
        boolean contains22222222 = CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6}).contains(Integer.valueOf(intValue));
        int rememberBattleRevealPhase2222222 = BattleResultAnimationsKt.rememberBattleRevealPhase(!booleanValue2222222 && z7, (newChallengeDetailsResponseModelP != null || (challenge2 = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge2.getId(), contains22222222, startRestartGroup, 0);
        float m7774constructorimpl62222222 = Dp.m7774constructorimpl(!z7 ? 2 : 94);
        if (z7) {
        }
        float f5222222 = m7774constructorimpl;
        if (!z5) {
        }
        float f22222222 = m7774constructorimpl2;
        if (!z5) {
        }
        float f32222222 = m7774constructorimpl3;
        if (!z5) {
        }
        float f42222222 = m7774constructorimpl4;
        ProvidedValue<Object> provides2222222 = BattleResultAnimationsKt.getLocalBattleRevealResetKey().provides((newChallengeDetailsResponseModelP != null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null) ? null : challenge.getId());
        Long l42222222 = l2;
        Modifier modifier42222222 = modifier3;
        ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 challengePreviewScreenKt$ChallengePreviewScreen$1$2$22222222 = new ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(boxScopeInstance222222, z12, f42222222, z7, f5222222, battleShareCaptureAnchor3, from2222222, f22222222, booleanValue2222222, rememberBattleRevealPhase2222222, m7774constructorimpl522222, m7774constructorimpl62222222, f32222222, amountText22222, resolveAmountDisplay22222, stringResource, newChallengeDetailsResponseModelP, function013, z14, function016, function017, function018, z, function25, l42222222, state, intValue, z5, oddType, mainActivity3, onDismiss, contains32222, z8, z11, function015);
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) provides2222222, ComposableLambdaKt.rememberComposableLambda(-580854500, true, challengePreviewScreenKt$ChallengePreviewScreen$1$2$22222222, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
        function07 = function013;
        function08 = function014;
        function09 = function015;
        z9 = z11;
        function23 = function25;
        function24 = function26;
        function010 = function016;
        function011 = function017;
        function012 = function018;
        mainActivity2 = mainActivity3;
        z10 = z4;
        battleShareCaptureAnchor2 = battleShareCaptureAnchor3;
        l3 = l42222222;
        modifier2 = modifier42222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void Preview_ChallengePreview_Loading(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(464680287);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(464680287, i, -1, "org.betup.ui.dialogs.compose.Preview_ChallengePreview_Loading (ChallengePreviewScreen.kt:717)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            OddType oddType = OddType.DECIMAL;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ChallengePreviewScreen(fillMaxSize$default, true, null, oddType, null, (Function0) rememberedValue, null, null, null, false, null, null, null, null, null, null, false, null, composer2, 200118, 0, 262096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Preview_ChallengePreview_Loading$lambda$10;
                    Preview_ChallengePreview_Loading$lambda$10 = ChallengePreviewScreenKt.Preview_ChallengePreview_Loading$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return Preview_ChallengePreview_Loading$lambda$10;
                }
            });
        }
    }

    private static final NewChallengeDetailsResponseModelP sampleChallengeDetails(boolean z) {
        NewChallengeParticipantModel copy;
        NewChallengeLeagueModel newChallengeLeagueModel = new NewChallengeLeagueModel(1L, "", "Premier League");
        NewChallengeTeamModel newChallengeTeamModel = new NewChallengeTeamModel(2L, "", "Team B");
        NewChallengeTeamModel newChallengeTeamModel2 = new NewChallengeTeamModel(1L, "", "Team A");
        NewChallengeSportModel newChallengeSportModel = new NewChallengeSportModel(22L, "", "Football", "1 HALF, 2 HALF", null);
        Double valueOf = Double.valueOf(0.0d);
        NewChallengeMatchModel newChallengeMatchModel = new NewChallengeMatchModel(1L, newChallengeLeagueModel, newChallengeTeamModel, newChallengeTeamModel2, newChallengeSportModel, valueOf, valueOf, "2025-09-06T13:00:00.000+00:00", 1, CollectionsKt.emptyList(), null, null, null, null, 8192, null);
        NewChallengeBetModel newChallengeBetModel = new NewChallengeBetModel(1L, new NewChallengeBetDetailsModel(100L, Double.valueOf(1.35d), 3, "Team A", "", 2, false, new NewChallengeBetTypeGroupModel(1L, 1, "Who will win", true, 3, 0L, 0L)));
        NewChallengeCreatorModel newChallengeCreatorModel = new NewChallengeCreatorModel(10L, "User One", "one@example.com", "");
        NewChallengeDetailsModel newChallengeDetailsModel = new NewChallengeDetailsModel(999L, 100L, 0L, Long.valueOf(z ? 200L : 100L), Integer.valueOf(z ? 2 : 1), Integer.valueOf(z ? 2 : 1));
        NewChallengeParticipantModel newChallengeParticipantModel = new NewChallengeParticipantModel(1000L, "User One", "", Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US), Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US), Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US), 0, new NewChallengeCountryModel(254L, "WW", "Worldwide", ""), Double.valueOf(1000.0d), 100L, 1, 200L, 0L, false);
        copy = newChallengeParticipantModel.copy((r32 & 1) != 0 ? newChallengeParticipantModel.id : 1001L, (r32 & 2) != 0 ? newChallengeParticipantModel.name : "User Two", (r32 & 4) != 0 ? newChallengeParticipantModel.photoUrl : null, (r32 & 8) != 0 ? newChallengeParticipantModel.rank : null, (r32 & 16) != 0 ? newChallengeParticipantModel.rankDay : null, (r32 & 32) != 0 ? newChallengeParticipantModel.rankMonth : null, (r32 & 64) != 0 ? newChallengeParticipantModel.referralsCount : null, (r32 & 128) != 0 ? newChallengeParticipantModel.country : null, (r32 & 256) != 0 ? newChallengeParticipantModel.moneyBalance : null, (r32 & 512) != 0 ? newChallengeParticipantModel.experience : null, (r32 & 1024) != 0 ? newChallengeParticipantModel.level : null, (r32 & 2048) != 0 ? newChallengeParticipantModel.expToNextLevel : null, (r32 & 4096) != 0 ? newChallengeParticipantModel.levelStartExp : null, (r32 & 8192) != 0 ? newChallengeParticipantModel.vip : null);
        return new NewChallengeDetailsResponseModelP(newChallengeDetailsModel, newChallengeCreatorModel, newChallengeMatchModel, Integer.valueOf(z ? 2 : 1), z ? CollectionsKt.listOf((Object[]) new NewChallengeParticipantModel[]{newChallengeParticipantModel, copy}) : CollectionsKt.listOf(newChallengeParticipantModel), z ? CollectionsKt.listOf((Object[]) new NewChallengeBetModel[]{newChallengeBetModel, NewChallengeBetModel.copy$default(newChallengeBetModel, 2L, null, 2, null)}) : CollectionsKt.listOf(newChallengeBetModel));
    }

    public static final void Preview_ChallengePreview_OneUser(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(316158900);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(316158900, i, -1, "org.betup.ui.dialogs.compose.Preview_ChallengePreview_OneUser (ChallengePreviewScreen.kt:826)");
            }
            NewChallengeDetailsResponseModelP sampleChallengeDetails = sampleChallengeDetails(false);
            OddType oddType = OddType.DECIMAL;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ChallengePreviewScreen(null, false, sampleChallengeDetails, oddType, null, (Function0) rememberedValue, null, null, null, false, null, null, null, null, null, null, false, null, composer2, 199728, 0, 262097);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Preview_ChallengePreview_OneUser$lambda$13;
                    Preview_ChallengePreview_OneUser$lambda$13 = ChallengePreviewScreenKt.Preview_ChallengePreview_OneUser$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return Preview_ChallengePreview_OneUser$lambda$13;
                }
            });
        }
    }

    public static final void Preview_ChallengePreview_TwoUsers(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(370894665);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(370894665, i, -1, "org.betup.ui.dialogs.compose.Preview_ChallengePreview_TwoUsers (ChallengePreviewScreen.kt:837)");
            }
            NewChallengeDetailsResponseModelP sampleChallengeDetails = sampleChallengeDetails(true);
            OddType oddType = OddType.DECIMAL;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ChallengePreviewScreen(null, false, sampleChallengeDetails, oddType, null, (Function0) rememberedValue, null, null, null, false, null, null, null, null, null, null, false, null, composer2, 199728, 0, 262097);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Preview_ChallengePreview_TwoUsers$lambda$16;
                    Preview_ChallengePreview_TwoUsers$lambda$16 = ChallengePreviewScreenKt.Preview_ChallengePreview_TwoUsers$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return Preview_ChallengePreview_TwoUsers$lambda$16;
                }
            });
        }
    }
}
