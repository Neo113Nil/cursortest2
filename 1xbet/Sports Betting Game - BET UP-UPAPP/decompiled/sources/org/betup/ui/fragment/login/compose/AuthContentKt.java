package org.betup.ui.fragment.login.compose;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
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
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.login.compose.AuthScreen;
import org.betup.ui.fragment.login.controller.AuthController;
import org.betup.utils.SnackbarHelper;

/* compiled from: AuthContent.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"AuthContent", "", "controller", "Lorg/betup/ui/fragment/login/controller/AuthController;", "initialScreen", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", "isAnonymous", "", "onLoginCompleted", "Lkotlin/Function1;", "onEnterAsGuest", "Lkotlin/Function0;", "onPrivacyPolicyClick", "onGoogleSignInRequested", "onVKSignInRequested", "(Lorg/betup/ui/fragment/login/controller/AuthController;Lorg/betup/ui/fragment/login/compose/AuthScreen;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "currentScreen", "isCompletingAuth", "loginEmail", "", "loginPassword", "registrationName", "registrationEmail", "registrationPassword", "registrationConfirmPassword"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$92(AuthController authController, AuthScreen authScreen, boolean z, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Composer composer, int i3) {
        AuthContent(authController, authScreen, z, function1, function0, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthContent(final AuthController controller, AuthScreen authScreen, boolean z, final Function1<? super Boolean, Unit> onLoginCompleted, final Function0<Unit> onEnterAsGuest, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function04;
        int i6;
        final Function0<Unit> function05;
        int i7;
        AuthScreen authScreen2;
        Function0<Unit> function06;
        Function0<Unit> function07;
        boolean changedInstance;
        Object rememberedValue;
        Object rememberedValue2;
        int i8;
        Object rememberedValue3;
        Object rememberedValue4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object rememberedValue5;
        int i9;
        Object rememberedValue6;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        Object rememberedValue7;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        AuthScreen AuthContent$lambda$6;
        AuthScreen authScreen3;
        Function0<Unit> function08;
        Function0<Unit> function09;
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableState mutableState3;
        final MutableState mutableState4;
        int i10;
        Function0<Unit> function010;
        Composer composer2;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final Function0<Unit> function013;
        Composer composer3;
        final Function0<Unit> function014;
        final AuthScreen authScreen4;
        final boolean z3;
        final Function0<Unit> function015;
        final Function0<Unit> function016;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onLoginCompleted, "onLoginCompleted");
        Intrinsics.checkNotNullParameter(onEnterAsGuest, "onEnterAsGuest");
        Composer startRestartGroup = composer.startRestartGroup(-1216722350);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(authScreen) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(onLoginCompleted) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(onEnterAsGuest) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function04 = function0;
                } else {
                    function04 = function0;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function05 = function02;
                } else {
                    function05 = function02;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                }
                if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                    authScreen2 = i11 != 0 ? null : authScreen;
                    boolean z4 = i4 != 0 ? false : z2;
                    if (i5 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda33
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        startRestartGroup.endReplaceGroup();
                        function06 = (Function0) rememberedValue8;
                    } else {
                        function06 = function04;
                    }
                    if (i6 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        startRestartGroup.endReplaceGroup();
                        function05 = (Function0) rememberedValue9;
                    }
                    if (i7 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        startRestartGroup.endReplaceGroup();
                        function07 = (Function0) rememberedValue10;
                    } else {
                        function07 = function03;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1216722350, i3, -1, "org.betup.ui.fragment.login.compose.AuthContent (AuthContent.kt:32)");
                    }
                    State collectAsState = SnapshotStateKt.collectAsState(controller.getCurrentScreen(), null, startRestartGroup, 0, 1);
                    State collectAsState2 = SnapshotStateKt.collectAsState(controller.isCompletingAuth(), null, startRestartGroup, 0, 1);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context = (Context) consume;
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(controller);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function2) new AuthContentKt$AuthContent$4$1(authScreen2, controller, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        i8 = 2;
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    } else {
                        i8 = 2;
                    }
                    final MutableState mutableState5 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    AuthScreen authScreen5 = authScreen2;
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i8, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final MutableState mutableState6 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    final Function0<Unit> function017 = function07;
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        snapshotMutationPolicy = null;
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i8, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        snapshotMutationPolicy = null;
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        i9 = 2;
                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        i9 = 2;
                    }
                    MutableState mutableState8 = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        snapshotMutationPolicy2 = null;
                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i9, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    } else {
                        snapshotMutationPolicy2 = null;
                    }
                    MutableState mutableState9 = (MutableState) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    MutableState mutableState10 = (MutableState) rememberedValue7;
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, snapshotMutationPolicy2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                    AuthContent$lambda$6 = AuthContent$lambda$6(collectAsState);
                    if (AuthContent$lambda$6 instanceof AuthScreen.GuestEntry) {
                        startRestartGroup.startReplaceGroup(123544223);
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean z5 = (57344 & i3) == 16384;
                        Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (z5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AuthContent$lambda$91$lambda$28$lambda$27;
                                    AuthContent$lambda$91$lambda$28$lambda$27 = AuthContentKt.AuthContent$lambda$91$lambda$28$lambda$27(Function0.this);
                                    return AuthContent$lambda$91$lambda$28$lambda$27;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        Function0 function018 = (Function0) rememberedValue11;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance2 = startRestartGroup.changedInstance(controller);
                        Object rememberedValue12 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AuthContent$lambda$91$lambda$30$lambda$29;
                                    AuthContent$lambda$91$lambda$30$lambda$29 = AuthContentKt.AuthContent$lambda$91$lambda$30$lambda$29(AuthController.this);
                                    return AuthContent$lambda$91$lambda$30$lambda$29;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        Function0 function019 = (Function0) rememberedValue12;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance3 = startRestartGroup.changedInstance(controller);
                        Object rememberedValue13 = startRestartGroup.rememberedValue();
                        if (changedInstance3 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AuthContent$lambda$91$lambda$32$lambda$31;
                                    AuthContent$lambda$91$lambda$32$lambda$31 = AuthContentKt.AuthContent$lambda$91$lambda$32$lambda$31(AuthController.this);
                                    return AuthContent$lambda$91$lambda$32$lambda$31;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                        }
                        Function0 function020 = (Function0) rememberedValue13;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance4 = startRestartGroup.changedInstance(controller);
                        Object rememberedValue14 = startRestartGroup.rememberedValue();
                        if (changedInstance4 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AuthContent$lambda$91$lambda$34$lambda$33;
                                    AuthContent$lambda$91$lambda$34$lambda$33 = AuthContentKt.AuthContent$lambda$91$lambda$34$lambda$33(AuthController.this);
                                    return AuthContent$lambda$91$lambda$34$lambda$33;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                        }
                        Function0 function021 = (Function0) rememberedValue14;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean z6 = (i3 & 3670016) == 1048576;
                        Object rememberedValue15 = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda27
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AuthContent$lambda$91$lambda$36$lambda$35;
                                    AuthContent$lambda$91$lambda$36$lambda$35 = AuthContentKt.AuthContent$lambda$91$lambda$36$lambda$35(Function0.this);
                                    return AuthContent$lambda$91$lambda$36$lambda$35;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue15);
                        }
                        startRestartGroup.endReplaceGroup();
                        authScreen3 = authScreen5;
                        function010 = function017;
                        GuestEntryScreenKt.GuestEntryScreen(controller, function018, function019, function020, function06, function021, (Function0) rememberedValue15, null, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 57344), 128);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        function09 = function05;
                    } else {
                        Function0<Unit> function022 = function05;
                        authScreen3 = authScreen5;
                        if (AuthContent$lambda$6 instanceof AuthScreen.SignInOptions) {
                            startRestartGroup.startReplaceGroup(124383703);
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changedInstance5 = startRestartGroup.changedInstance(controller);
                            Object rememberedValue16 = startRestartGroup.rememberedValue();
                            if (changedInstance5 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda28
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$38$lambda$37;
                                        AuthContent$lambda$91$lambda$38$lambda$37 = AuthContentKt.AuthContent$lambda$91$lambda$38$lambda$37(AuthController.this);
                                        return AuthContent$lambda$91$lambda$38$lambda$37;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue16);
                            }
                            Function0 function023 = (Function0) rememberedValue16;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changedInstance6 = startRestartGroup.changedInstance(controller) | ((i3 & 7168) == 2048);
                            Object rememberedValue17 = startRestartGroup.rememberedValue();
                            if (changedInstance6 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue17 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda29
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$41$lambda$40;
                                        AuthContent$lambda$91$lambda$41$lambda$40 = AuthContentKt.AuthContent$lambda$91$lambda$41$lambda$40(AuthController.this, onLoginCompleted);
                                        return AuthContent$lambda$91$lambda$41$lambda$40;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue17);
                            }
                            Function0 function024 = (Function0) rememberedValue17;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean z7 = (29360128 & i3) == 8388608;
                            Object rememberedValue18 = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                function012 = function017;
                                rememberedValue18 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda34
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$43$lambda$42;
                                        AuthContent$lambda$91$lambda$43$lambda$42 = AuthContentKt.AuthContent$lambda$91$lambda$43$lambda$42(Function0.this);
                                        return AuthContent$lambda$91$lambda$43$lambda$42;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue18);
                            } else {
                                function012 = function017;
                            }
                            Function0 function025 = (Function0) rememberedValue18;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean z8 = (i3 & 3670016) == 1048576;
                            Object rememberedValue19 = startRestartGroup.rememberedValue();
                            if (z8 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                function013 = function022;
                                rememberedValue19 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda35
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$45$lambda$44;
                                        AuthContent$lambda$91$lambda$45$lambda$44 = AuthContentKt.AuthContent$lambda$91$lambda$45$lambda$44(Function0.this);
                                        return AuthContent$lambda$91$lambda$45$lambda$44;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue19);
                            } else {
                                function013 = function022;
                            }
                            Function0 function026 = (Function0) rememberedValue19;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changedInstance7 = startRestartGroup.changedInstance(controller);
                            Object rememberedValue20 = startRestartGroup.rememberedValue();
                            if (changedInstance7 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue20 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda36
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$47$lambda$46;
                                        AuthContent$lambda$91$lambda$47$lambda$46 = AuthContentKt.AuthContent$lambda$91$lambda$47$lambda$46(AuthController.this);
                                        return AuthContent$lambda$91$lambda$47$lambda$46;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue20);
                            }
                            Function0 function027 = (Function0) rememberedValue20;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changedInstance8 = startRestartGroup.changedInstance(controller);
                            Object rememberedValue21 = startRestartGroup.rememberedValue();
                            if (changedInstance8 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue21 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda37
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AuthContent$lambda$91$lambda$49$lambda$48;
                                        AuthContent$lambda$91$lambda$49$lambda$48 = AuthContentKt.AuthContent$lambda$91$lambda$49$lambda$48(AuthController.this);
                                        return AuthContent$lambda$91$lambda$49$lambda$48;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue21);
                            }
                            startRestartGroup.endReplaceGroup();
                            function08 = function013;
                            composer2 = startRestartGroup;
                            SignInOptionsScreenKt.SignInOptionsScreen(controller, function023, function024, function025, function026, function06, function027, (Function0) rememberedValue21, null, startRestartGroup, i3 & 458766, 256);
                            composer2.endReplaceGroup();
                            function010 = function012;
                        } else {
                            function08 = function022;
                            if (AuthContent$lambda$6 instanceof AuthScreen.Login) {
                                startRestartGroup.startReplaceGroup(125661957);
                                String AuthContent$lambda$10 = AuthContent$lambda$10(mutableState5);
                                String AuthContent$lambda$13 = AuthContent$lambda$13(mutableState6);
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue22 = startRestartGroup.rememberedValue();
                                if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue22 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda38
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$51$lambda$50;
                                            AuthContent$lambda$91$lambda$51$lambda$50 = AuthContentKt.AuthContent$lambda$91$lambda$51$lambda$50(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$51$lambda$50;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue22);
                                }
                                Function1 function1 = (Function1) rememberedValue22;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue23 = startRestartGroup.rememberedValue();
                                if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue23 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$53$lambda$52;
                                            AuthContent$lambda$91$lambda$53$lambda$52 = AuthContentKt.AuthContent$lambda$91$lambda$53$lambda$52(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$53$lambda$52;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue23);
                                }
                                Function1 function12 = (Function1) rememberedValue23;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changedInstance9 = startRestartGroup.changedInstance(controller) | ((i3 & 7168) == 2048);
                                Object rememberedValue24 = startRestartGroup.rememberedValue();
                                if (changedInstance9 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue24 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$56$lambda$55;
                                            AuthContent$lambda$91$lambda$56$lambda$55 = AuthContentKt.AuthContent$lambda$91$lambda$56$lambda$55(AuthController.this, mutableState5, mutableState6, onLoginCompleted);
                                            return AuthContent$lambda$91$lambda$56$lambda$55;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue24);
                                }
                                Function0 function028 = (Function0) rememberedValue24;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1746271574);
                                boolean changedInstance10 = startRestartGroup.changedInstance(controller) | startRestartGroup.changedInstance(context);
                                Object rememberedValue25 = startRestartGroup.rememberedValue();
                                if (changedInstance10 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue25 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$60$lambda$59;
                                            AuthContent$lambda$91$lambda$60$lambda$59 = AuthContentKt.AuthContent$lambda$91$lambda$60$lambda$59(AuthController.this, mutableState5, context);
                                            return AuthContent$lambda$91$lambda$60$lambda$59;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue25);
                                }
                                Function0 function029 = (Function0) rememberedValue25;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance11 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue26 = startRestartGroup.rememberedValue();
                                if (changedInstance11 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue26 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$62$lambda$61;
                                            AuthContent$lambda$91$lambda$62$lambda$61 = AuthContentKt.AuthContent$lambda$91$lambda$62$lambda$61(AuthController.this);
                                            return AuthContent$lambda$91$lambda$62$lambda$61;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue26);
                                }
                                Function0 function030 = (Function0) rememberedValue26;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance12 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue27 = startRestartGroup.rememberedValue();
                                if (changedInstance12 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue27 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$64$lambda$63;
                                            AuthContent$lambda$91$lambda$64$lambda$63 = AuthContentKt.AuthContent$lambda$91$lambda$64$lambda$63(AuthController.this);
                                            return AuthContent$lambda$91$lambda$64$lambda$63;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue27);
                                }
                                startRestartGroup.endReplaceGroup();
                                composer2 = startRestartGroup;
                                LoginScreenKt.LoginScreen(controller, AuthContent$lambda$10, AuthContent$lambda$13, function1, function12, function028, function029, function030, (Function0) rememberedValue27, null, startRestartGroup, (i3 & 14) | 27648, 512);
                                composer2.endReplaceGroup();
                                function010 = function017;
                            } else if (AuthContent$lambda$6 instanceof AuthScreen.SignUpOptions) {
                                startRestartGroup.startReplaceGroup(127201262);
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance13 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue28 = startRestartGroup.rememberedValue();
                                if (changedInstance13 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue28 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$66$lambda$65;
                                            AuthContent$lambda$91$lambda$66$lambda$65 = AuthContentKt.AuthContent$lambda$91$lambda$66$lambda$65(AuthController.this);
                                            return AuthContent$lambda$91$lambda$66$lambda$65;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue28);
                                }
                                Function0 function031 = (Function0) rememberedValue28;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changedInstance14 = startRestartGroup.changedInstance(controller) | ((i3 & 7168) == 2048);
                                Object rememberedValue29 = startRestartGroup.rememberedValue();
                                if (changedInstance14 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue29 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$69$lambda$68;
                                            AuthContent$lambda$91$lambda$69$lambda$68 = AuthContentKt.AuthContent$lambda$91$lambda$69$lambda$68(AuthController.this, onLoginCompleted);
                                            return AuthContent$lambda$91$lambda$69$lambda$68;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue29);
                                }
                                Function0 function032 = (Function0) rememberedValue29;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z9 = (29360128 & i3) == 8388608;
                                Object rememberedValue30 = startRestartGroup.rememberedValue();
                                if (z9 || rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue30 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$71$lambda$70;
                                            AuthContent$lambda$91$lambda$71$lambda$70 = AuthContentKt.AuthContent$lambda$91$lambda$71$lambda$70(Function0.this);
                                            return AuthContent$lambda$91$lambda$71$lambda$70;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue30);
                                }
                                Function0 function033 = (Function0) rememberedValue30;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z10 = (i3 & 3670016) == 1048576;
                                Object rememberedValue31 = startRestartGroup.rememberedValue();
                                if (z10 || rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                    function011 = function08;
                                    rememberedValue31 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$73$lambda$72;
                                            AuthContent$lambda$91$lambda$73$lambda$72 = AuthContentKt.AuthContent$lambda$91$lambda$73$lambda$72(Function0.this);
                                            return AuthContent$lambda$91$lambda$73$lambda$72;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue31);
                                } else {
                                    function011 = function08;
                                }
                                Function0 function034 = (Function0) rememberedValue31;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance15 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue32 = startRestartGroup.rememberedValue();
                                if (changedInstance15 || rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue32 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$75$lambda$74;
                                            AuthContent$lambda$91$lambda$75$lambda$74 = AuthContentKt.AuthContent$lambda$91$lambda$75$lambda$74(AuthController.this);
                                            return AuthContent$lambda$91$lambda$75$lambda$74;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue32);
                                }
                                Function0 function035 = (Function0) rememberedValue32;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance16 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue33 = startRestartGroup.rememberedValue();
                                if (changedInstance16 || rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue33 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$77$lambda$76;
                                            AuthContent$lambda$91$lambda$77$lambda$76 = AuthContentKt.AuthContent$lambda$91$lambda$77$lambda$76(AuthController.this);
                                            return AuthContent$lambda$91$lambda$77$lambda$76;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue33);
                                }
                                startRestartGroup.endReplaceGroup();
                                function09 = function011;
                                SignUpOptionsScreenKt.SignUpOptionsScreen(controller, function031, function032, function033, function034, function06, function035, (Function0) rememberedValue33, null, startRestartGroup, i3 & 458766, 256);
                                startRestartGroup.endReplaceGroup();
                                composer2 = startRestartGroup;
                                function010 = function017;
                            } else {
                                function09 = function08;
                                if (!(AuthContent$lambda$6 instanceof AuthScreen.Registration)) {
                                    startRestartGroup.startReplaceGroup(1666556693);
                                    startRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(128421112);
                                String AuthContent$lambda$16 = AuthContent$lambda$16(mutableState7);
                                String AuthContent$lambda$19 = AuthContent$lambda$19(mutableState8);
                                String AuthContent$lambda$22 = AuthContent$lambda$22(mutableState9);
                                String AuthContent$lambda$25 = AuthContent$lambda$25(mutableState10);
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue34 = startRestartGroup.rememberedValue();
                                if (rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                    mutableState = mutableState7;
                                    rememberedValue34 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$79$lambda$78;
                                            AuthContent$lambda$91$lambda$79$lambda$78 = AuthContentKt.AuthContent$lambda$91$lambda$79$lambda$78(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$79$lambda$78;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue34);
                                } else {
                                    mutableState = mutableState7;
                                }
                                Function1 function13 = (Function1) rememberedValue34;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue35 = startRestartGroup.rememberedValue();
                                if (rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                    mutableState2 = mutableState8;
                                    rememberedValue35 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$81$lambda$80;
                                            AuthContent$lambda$91$lambda$81$lambda$80 = AuthContentKt.AuthContent$lambda$91$lambda$81$lambda$80(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$81$lambda$80;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue35);
                                } else {
                                    mutableState2 = mutableState8;
                                }
                                Function1 function14 = (Function1) rememberedValue35;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue36 = startRestartGroup.rememberedValue();
                                if (rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                    mutableState3 = mutableState9;
                                    rememberedValue36 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$83$lambda$82;
                                            AuthContent$lambda$91$lambda$83$lambda$82 = AuthContentKt.AuthContent$lambda$91$lambda$83$lambda$82(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$83$lambda$82;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue36);
                                } else {
                                    mutableState3 = mutableState9;
                                }
                                Function1 function15 = (Function1) rememberedValue36;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                Object rememberedValue37 = startRestartGroup.rememberedValue();
                                if (rememberedValue37 == Composer.INSTANCE.getEmpty()) {
                                    mutableState4 = mutableState10;
                                    rememberedValue37 = new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda17
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AuthContent$lambda$91$lambda$85$lambda$84;
                                            AuthContent$lambda$91$lambda$85$lambda$84 = AuthContentKt.AuthContent$lambda$91$lambda$85$lambda$84(MutableState.this, (String) obj);
                                            return AuthContent$lambda$91$lambda$85$lambda$84;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue37);
                                } else {
                                    mutableState4 = mutableState10;
                                }
                                Function1 function16 = (Function1) rememberedValue37;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changedInstance17 = startRestartGroup.changedInstance(controller) | ((i3 & 7168) == 2048);
                                Object rememberedValue38 = startRestartGroup.rememberedValue();
                                if (changedInstance17 || rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                    i10 = i3;
                                    final MutableState mutableState11 = mutableState2;
                                    final MutableState mutableState12 = mutableState4;
                                    Object obj = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$88$lambda$87;
                                            AuthContent$lambda$91$lambda$88$lambda$87 = AuthContentKt.AuthContent$lambda$91$lambda$88$lambda$87(AuthController.this, mutableState, mutableState11, mutableState3, mutableState12, onLoginCompleted);
                                            return AuthContent$lambda$91$lambda$88$lambda$87;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(obj);
                                    rememberedValue38 = obj;
                                } else {
                                    i10 = i3;
                                }
                                Function0 function036 = (Function0) rememberedValue38;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changedInstance18 = startRestartGroup.changedInstance(controller);
                                Object rememberedValue39 = startRestartGroup.rememberedValue();
                                if (changedInstance18 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue39 = new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit AuthContent$lambda$91$lambda$90$lambda$89;
                                            AuthContent$lambda$91$lambda$90$lambda$89 = AuthContentKt.AuthContent$lambda$91$lambda$90$lambda$89(AuthController.this);
                                            return AuthContent$lambda$91$lambda$90$lambda$89;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue39);
                                }
                                startRestartGroup.endReplaceGroup();
                                function010 = function017;
                                composer2 = startRestartGroup;
                                RegistrationScreenKt.RegistrationScreen(controller, z4, AuthContent$lambda$16, AuthContent$lambda$19, AuthContent$lambda$22, AuthContent$lambda$25, function13, function14, function15, function16, function036, (Function0) rememberedValue39, null, composer2, (i10 & 14) | 920125440 | ((i10 >> 3) & 112), 0, 4096);
                                composer2.endReplaceGroup();
                            }
                        }
                        function09 = function08;
                    }
                    composer3 = composer2;
                    AuthCompletingOverlayKt.AuthCompletingOverlay(AuthContent$lambda$7(collectAsState2), null, composer3, 0, 2);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function014 = function09;
                    authScreen4 = authScreen3;
                    z3 = z4;
                    function015 = function06;
                    function016 = function010;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    authScreen4 = authScreen;
                    z3 = z2;
                    function015 = function04;
                    function014 = function05;
                    composer3 = startRestartGroup;
                    function016 = function03;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit AuthContent$lambda$92;
                            AuthContent$lambda$92 = AuthContentKt.AuthContent$lambda$92(AuthController.this, authScreen4, z3, onLoginCompleted, onEnterAsGuest, function015, function014, function016, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return AuthContent$lambda$92;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState3 = SnapshotStateKt.collectAsState(controller.getCurrentScreen(), null, startRestartGroup, 0, 1);
            State collectAsState22 = SnapshotStateKt.collectAsState(controller.isCompletingAuth(), null, startRestartGroup, 0, 1);
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2 = (Context) consume2;
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(controller);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = (Function2) new AuthContentKt$AuthContent$4$1(authScreen2, controller, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState52 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            AuthScreen authScreen52 = authScreen2;
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState62 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            final Function0 function0172 = function07;
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState72 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState82 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState92 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState102 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, snapshotMutationPolicy2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            AuthContent$lambda$6 = AuthContent$lambda$6(collectAsState3);
            if (AuthContent$lambda$6 instanceof AuthScreen.GuestEntry) {
            }
            composer3 = composer2;
            AuthCompletingOverlayKt.AuthCompletingOverlay(AuthContent$lambda$7(collectAsState22), null, composer3, 0, 2);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            function014 = function09;
            authScreen4 = authScreen3;
            z3 = z4;
            function015 = function06;
            function016 = function010;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState32 = SnapshotStateKt.collectAsState(controller.getCurrentScreen(), null, startRestartGroup, 0, 1);
        State collectAsState222 = SnapshotStateKt.collectAsState(controller.isCompletingAuth(), null, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22 = (Context) consume22;
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(controller);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function2) new AuthContentKt$AuthContent$4$1(authScreen2, controller, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState522 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        AuthScreen authScreen522 = authScreen2;
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState622 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        final Function0 function01722 = function07;
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState722 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState822 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState922 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState1022 = (MutableState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, snapshotMutationPolicy2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        AuthContent$lambda$6 = AuthContent$lambda$6(collectAsState32);
        if (AuthContent$lambda$6 instanceof AuthScreen.GuestEntry) {
        }
        composer3 = composer2;
        AuthCompletingOverlayKt.AuthCompletingOverlay(AuthContent$lambda$7(collectAsState222), null, composer3, 0, 2);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        function014 = function09;
        authScreen4 = authScreen3;
        z3 = z4;
        function015 = function06;
        function016 = function010;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final String AuthContent$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AuthContent$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AuthContent$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AuthContent$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AuthContent$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AuthContent$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$28$lambda$27(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$30$lambda$29(AuthController authController) {
        authController.navigateTo(AuthScreen.SignInOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$32$lambda$31(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignUpOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$34$lambda$33(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.Login.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$36$lambda$35(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$38$lambda$37(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.Login.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$41$lambda$40(AuthController authController, final Function1 function1) {
        authController.signInWithFacebook(new Function2() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit AuthContent$lambda$91$lambda$41$lambda$40$lambda$39;
                AuthContent$lambda$91$lambda$41$lambda$40$lambda$39 = AuthContentKt.AuthContent$lambda$91$lambda$41$lambda$40$lambda$39(Function1.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                return AuthContent$lambda$91$lambda$41$lambda$40$lambda$39;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$41$lambda$40$lambda$39(Function1 function1, boolean z, boolean z2) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$43$lambda$42(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$45$lambda$44(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$47$lambda$46(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.GuestEntry.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$49$lambda$48(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignUpOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$51$lambda$50(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$53$lambda$52(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$56$lambda$55(AuthController authController, MutableState mutableState, MutableState mutableState2, final Function1 function1) {
        authController.signInWithEmail(AuthContent$lambda$10(mutableState), AuthContent$lambda$13(mutableState2), new Function0() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit AuthContent$lambda$91$lambda$56$lambda$55$lambda$54;
                AuthContent$lambda$91$lambda$56$lambda$55$lambda$54 = AuthContentKt.AuthContent$lambda$91$lambda$56$lambda$55$lambda$54(Function1.this);
                return AuthContent$lambda$91$lambda$56$lambda$55$lambda$54;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$56$lambda$55$lambda$54(Function1 function1) {
        function1.invoke(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$60$lambda$59(AuthController authController, MutableState mutableState, final Context context) {
        authController.resetPassword(AuthContent$lambda$10(mutableState), new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AuthContent$lambda$91$lambda$60$lambda$59$lambda$57;
                AuthContent$lambda$91$lambda$60$lambda$59$lambda$57 = AuthContentKt.AuthContent$lambda$91$lambda$60$lambda$59$lambda$57(context, (String) obj);
                return AuthContent$lambda$91$lambda$60$lambda$59$lambda$57;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AuthContent$lambda$91$lambda$60$lambda$59$lambda$58;
                AuthContent$lambda$91$lambda$60$lambda$59$lambda$58 = AuthContentKt.AuthContent$lambda$91$lambda$60$lambda$59$lambda$58(context, (String) obj);
                return AuthContent$lambda$91$lambda$60$lambda$59$lambda$58;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$60$lambda$59$lambda$57(Context context, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarHelper.showShort(context, message);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$60$lambda$59$lambda$58(Context context, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        SnackbarHelper.showShort(context, errorMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$62$lambda$61(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignUpOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$64$lambda$63(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignInOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$66$lambda$65(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.Registration.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$69$lambda$68(AuthController authController, final Function1 function1) {
        authController.signInWithFacebook(new Function2() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit AuthContent$lambda$91$lambda$69$lambda$68$lambda$67;
                AuthContent$lambda$91$lambda$69$lambda$68$lambda$67 = AuthContentKt.AuthContent$lambda$91$lambda$69$lambda$68$lambda$67(Function1.this, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                return AuthContent$lambda$91$lambda$69$lambda$68$lambda$67;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$69$lambda$68$lambda$67(Function1 function1, boolean z, boolean z2) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$71$lambda$70(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$73$lambda$72(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$75$lambda$74(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.GuestEntry.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$77$lambda$76(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignInOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$79$lambda$78(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$81$lambda$80(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$83$lambda$82(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$85$lambda$84(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$88$lambda$87(AuthController authController, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, final Function1 function1) {
        authController.registerWithEmail(AuthContent$lambda$16(mutableState), AuthContent$lambda$19(mutableState2), AuthContent$lambda$22(mutableState3), AuthContent$lambda$25(mutableState4), new Function1() { // from class: org.betup.ui.fragment.login.compose.AuthContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AuthContent$lambda$91$lambda$88$lambda$87$lambda$86;
                AuthContent$lambda$91$lambda$88$lambda$87$lambda$86 = AuthContentKt.AuthContent$lambda$91$lambda$88$lambda$87$lambda$86(Function1.this, ((Boolean) obj).booleanValue());
                return AuthContent$lambda$91$lambda$88$lambda$87$lambda$86;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$88$lambda$87$lambda$86(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthContent$lambda$91$lambda$90$lambda$89(AuthController authController) {
        authController.clearErrors();
        authController.navigateTo(AuthScreen.SignUpOptions.INSTANCE);
        return Unit.INSTANCE;
    }

    private static final AuthScreen AuthContent$lambda$6(State<? extends AuthScreen> state) {
        return state.getValue();
    }

    private static final boolean AuthContent$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
