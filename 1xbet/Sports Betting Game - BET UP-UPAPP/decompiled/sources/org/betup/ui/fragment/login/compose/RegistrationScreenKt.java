package org.betup.ui.fragment.login.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.google.logging.type.LogSeverity;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.login.compose.components.AuthTextFieldKt;
import org.betup.ui.fragment.login.controller.AuthController;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: RegistrationScreen.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002"}, d2 = {"RegistrationScreen", "", "controller", "Lorg/betup/ui/fragment/login/controller/AuthController;", "isAnonymous", "", "name", "", "email", "password", "confirmPassword", "onNameChange", "Lkotlin/Function1;", "onEmailChange", "onPasswordChange", "onConfirmPasswordChange", "onSignInClick", "Lkotlin/Function0;", "onBackClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/login/controller/AuthController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_release", "isLoadingRegistration", "nameError", "emailError", "passwordError", "confirmPasswordError", "loginError", "Lorg/betup/ui/fragment/login/controller/AuthController$LoginError;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegistrationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegistrationScreen$lambda$12(AuthController authController, boolean z, String str, String str2, String str3, String str4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        RegistrationScreen(authController, z, str, str2, str3, str4, function1, function12, function13, function14, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x050a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RegistrationScreen(final AuthController controller, boolean z, final String name, final String email, final String password, final String confirmPassword, final Function1<? super String, Unit> onNameChange, final Function1<? super String, Unit> onEmailChange, final Function1<? super String, Unit> onPasswordChange, final Function1<? super String, Unit> onConfirmPasswordChange, final Function0<Unit> onSignInClick, final Function0<Unit> onBackClick, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        State collectAsState;
        boolean changed;
        RegistrationScreenKt$RegistrationScreen$1$1 rememberedValue;
        Object obj;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Composer composer2;
        boolean z3;
        Object rememberedValue2;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(onNameChange, "onNameChange");
        Intrinsics.checkNotNullParameter(onEmailChange, "onEmailChange");
        Intrinsics.checkNotNullParameter(onPasswordChange, "onPasswordChange");
        Intrinsics.checkNotNullParameter(onConfirmPasswordChange, "onConfirmPasswordChange");
        Intrinsics.checkNotNullParameter(onSignInClick, "onSignInClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(466863096);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changedInstance(controller) ? 4 : 2);
        } else {
            i4 = i;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i13 = i4;
        if ((i3 & 4) != 0) {
            i13 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i13 |= startRestartGroup.changed(name) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i13 |= 3072;
        } else if ((i & 3072) == 0) {
            i13 |= startRestartGroup.changed(email) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i13 |= 24576;
        } else if ((i & 24576) == 0) {
            i13 |= startRestartGroup.changed(password) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                i5 = startRestartGroup.changed(confirmPassword) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i11 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(onNameChange) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i10 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onEmailChange) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i9 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onPasswordChange) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i8 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onConfirmPasswordChange) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (startRestartGroup.changedInstance(onSignInClick) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i6 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i6 |= startRestartGroup.changedInstance(onBackClick) ? 32 : 16;
                            }
                            i7 = i3 & 4096;
                            if (i7 == 0) {
                                i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
                                if ((i13 & 306783379) == 306783378 || (i6 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                                    z2 = i12 != 0 ? false : z;
                                    Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(466863096, i13, i6, "org.betup.ui.fragment.login.compose.RegistrationScreen (RegistrationScreen.kt:57)");
                                    }
                                    collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
                                    State collectAsState2 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
                                    State collectAsState3 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
                                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
                                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
                                    State collectAsState6 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
                                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContext);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Context context = (Context) consume;
                                    AuthController.LoginError RegistrationScreen$lambda$5 = RegistrationScreen$lambda$5(collectAsState6);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changed = startRestartGroup.changed(collectAsState6) | startRestartGroup.changedInstance(context);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        obj = null;
                                        rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState6, context, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        obj = null;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(RegistrationScreen$lambda$5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Modifier modifier4 = modifier3;
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
                                    Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i14 = i6;
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
                                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    float f = 24;
                                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f), 5, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                                    float f2 = 1;
                                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
                                    int i15 = i13 >> 12;
                                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState2) != null, RegistrationScreen$lambda$1(collectAsState2), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i15 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState3) != null, RegistrationScreen$lambda$2(collectAsState3), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState4) != null, RegistrationScreen$lambda$3(collectAsState4), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState5) != null, RegistrationScreen$lambda$4(collectAsState5), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i15 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
                                    float f3 = 32;
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
                                    String stringResource = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
                                    if (!RegistrationScreen$lambda$0(collectAsState) || StringsKt.isBlank(name)) {
                                        composer2 = startRestartGroup;
                                    } else {
                                        composer2 = startRestartGroup;
                                        if (!StringsKt.isBlank(email) && !StringsKt.isBlank(password) && !StringsKt.isBlank(confirmPassword)) {
                                            z3 = true;
                                            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i14 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
                                            String stringResource2 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                                            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                                            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f3), 7, null);
                                            composer2.startReplaceGroup(1849434622);
                                            rememberedValue2 = composer2.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.login.compose.RegistrationScreenKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit unit;
                                                        unit = Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue2);
                                            }
                                            composer2.endReplaceGroup();
                                            TextKt.m2642Text4IGK_g(stringResource2, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default2, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer2, 0, 0, 65532);
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
                                            modifier2 = modifier4;
                                        }
                                    }
                                    z3 = false;
                                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i14 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
                                    String stringResource22 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                                    TextStyle textStyle2 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                                    Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f3), 7, null);
                                    composer2.startReplaceGroup(1849434622);
                                    rememberedValue2 = composer2.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    composer2.endReplaceGroup();
                                    TextKt.m2642Text4IGK_g(stringResource22, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default22, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer2, 0, 0, 65532);
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
                                    modifier2 = modifier4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    z2 = z;
                                    modifier2 = modifier;
                                    composer2 = startRestartGroup;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final boolean z4 = z2;
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.login.compose.RegistrationScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            Unit RegistrationScreen$lambda$12;
                                            RegistrationScreen$lambda$12 = RegistrationScreenKt.RegistrationScreen$lambda$12(AuthController.this, z4, name, email, password, confirmPassword, onNameChange, onEmailChange, onPasswordChange, onConfirmPasswordChange, onSignInClick, onBackClick, modifier2, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                            return RegistrationScreen$lambda$12;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i13 & 306783379) == 306783378) {
                            }
                            if (i12 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
                            State collectAsState22 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
                            State collectAsState32 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
                            State collectAsState42 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
                            State collectAsState52 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
                            State collectAsState62 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localContext2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Context context2 = (Context) consume2;
                            AuthController.LoginError RegistrationScreen$lambda$52 = RegistrationScreen$lambda$5(collectAsState62);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed = startRestartGroup.changed(collectAsState62) | startRestartGroup.changedInstance(context2);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            obj = null;
                            rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState62, context2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(RegistrationScreen$lambda$52, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            Modifier modifier42 = modifier3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            int i142 = i6;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float f4 = 24;
                            Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f4), 5, null);
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default3);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting()) {
                            }
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                            float f22 = 1;
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
                            int i152 = i13 >> 12;
                            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState22) != null, RegistrationScreen$lambda$1(collectAsState22), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i152 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState32) != null, RegistrationScreen$lambda$2(collectAsState32), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState42) != null, RegistrationScreen$lambda$3(collectAsState42), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState52) != null, RegistrationScreen$lambda$4(collectAsState52), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i152 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
                            float f32 = 32;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32)), startRestartGroup, 6);
                            String stringResource3 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
                            if (RegistrationScreen$lambda$0(collectAsState)) {
                            }
                            composer2 = startRestartGroup;
                            z3 = false;
                            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource3, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i142 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer2, 6);
                            String stringResource222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                            TextStyle textStyle22 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                            Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f32), 7, null);
                            composer2.startReplaceGroup(1849434622);
                            rememberedValue2 = composer2.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            TextKt.m2642Text4IGK_g(stringResource222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle22, composer2, 0, 0, 65532);
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
                            modifier2 = modifier42;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 |= i8;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i7 = i3 & 4096;
                        if (i7 == 0) {
                        }
                        if ((i13 & 306783379) == 306783378) {
                        }
                        if (i12 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
                        State collectAsState222 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
                        State collectAsState322 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
                        State collectAsState422 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
                        State collectAsState522 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
                        State collectAsState622 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
                        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localContext22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Context context22 = (Context) consume22;
                        AuthController.LoginError RegistrationScreen$lambda$522 = RegistrationScreen$lambda$5(collectAsState622);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed = startRestartGroup.changed(collectAsState622) | startRestartGroup.changedInstance(context22);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        obj = null;
                        rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState622, context22, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(RegistrationScreen$lambda$522, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier422 = modifier3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
                        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        int i1422 = i6;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                        IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float f42 = 24;
                        Modifier m1520paddingqDBjuR0$default32 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f42), 5, null);
                        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default32);
                        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting()) {
                        }
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                        float f222 = 1;
                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
                        int i1522 = i13 >> 12;
                        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState222) != null, RegistrationScreen$lambda$1(collectAsState222), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i1522 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), startRestartGroup, 6);
                        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState322) != null, RegistrationScreen$lambda$2(collectAsState322), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), startRestartGroup, 6);
                        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState422) != null, RegistrationScreen$lambda$3(collectAsState422), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), startRestartGroup, 6);
                        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState522) != null, RegistrationScreen$lambda$4(collectAsState522), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i1522 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
                        float f322 = 32;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322)), startRestartGroup, 6);
                        String stringResource32 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
                        if (RegistrationScreen$lambda$0(collectAsState)) {
                        }
                        composer2 = startRestartGroup;
                        z3 = false;
                        CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource32, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i1422 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), composer2, 6);
                        String stringResource2222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                        TextStyle textStyle222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                        Modifier m1520paddingqDBjuR0$default2222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f322), 7, null);
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer2.endReplaceGroup();
                        TextKt.m2642Text4IGK_g(stringResource2222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default2222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle222, composer2, 0, 0, 65532);
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
                        modifier2 = modifier422;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 |= i9;
                    if ((i3 & 512) == 0) {
                    }
                    i13 |= i8;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 == 0) {
                    }
                    if ((i13 & 306783379) == 306783378) {
                    }
                    if (i12 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
                    State collectAsState2222 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
                    State collectAsState3222 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
                    State collectAsState4222 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
                    State collectAsState5222 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
                    State collectAsState6222 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
                    ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localContext222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context222 = (Context) consume222;
                    AuthController.LoginError RegistrationScreen$lambda$5222 = RegistrationScreen$lambda$5(collectAsState6222);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(collectAsState6222) | startRestartGroup.changedInstance(context222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    obj = null;
                    rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState6222, context222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(RegistrationScreen$lambda$5222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                    Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier4222 = modifier3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
                    Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i14222 = i6;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                    IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float f422 = 24;
                    Modifier m1520paddingqDBjuR0$default322 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f422), 5, null);
                    Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default322);
                    Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                    float f2222 = 1;
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
                    int i15222 = i13 >> 12;
                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState2222) != null, RegistrationScreen$lambda$1(collectAsState2222), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i15222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422)), startRestartGroup, 6);
                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState3222) != null, RegistrationScreen$lambda$2(collectAsState3222), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422)), startRestartGroup, 6);
                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState4222) != null, RegistrationScreen$lambda$3(collectAsState4222), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422)), startRestartGroup, 6);
                    AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState5222) != null, RegistrationScreen$lambda$4(collectAsState5222), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i15222 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
                    float f3222 = 32;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3222)), startRestartGroup, 6);
                    String stringResource322 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
                    if (RegistrationScreen$lambda$0(collectAsState)) {
                    }
                    composer2 = startRestartGroup;
                    z3 = false;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource322, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i14222 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422)), composer2, 6);
                    String stringResource22222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                    TextStyle textStyle2222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                    Modifier m1520paddingqDBjuR0$default22222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f3222), 7, null);
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer2.endReplaceGroup();
                    TextKt.m2642Text4IGK_g(stringResource22222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default22222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2222, composer2, 0, 0, 65532);
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
                    modifier2 = modifier4222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i13 |= i10;
                if ((i3 & 256) != 0) {
                }
                i13 |= i9;
                if ((i3 & 512) == 0) {
                }
                i13 |= i8;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i7 = i3 & 4096;
                if (i7 == 0) {
                }
                if ((i13 & 306783379) == 306783378) {
                }
                if (i12 != 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
                State collectAsState22222 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
                State collectAsState32222 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
                State collectAsState42222 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
                State collectAsState52222 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
                State collectAsState62222 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
                ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localContext2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context2222 = (Context) consume2222;
                AuthController.LoginError RegistrationScreen$lambda$52222 = RegistrationScreen$lambda$5(collectAsState62222);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(collectAsState62222) | startRestartGroup.changedInstance(context2222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (changed) {
                }
                obj = null;
                rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState62222, context2222, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(RegistrationScreen$lambda$52222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier42222 = modifier3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
                Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                int i142222 = i6;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f4222 = 24;
                Modifier m1520paddingqDBjuR0$default3222 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f4222), 5, null);
                Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default3222);
                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                float f22222 = 1;
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
                int i152222 = i13 >> 12;
                AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState22222) != null, RegistrationScreen$lambda$1(collectAsState22222), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i152222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222)), startRestartGroup, 6);
                AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState32222) != null, RegistrationScreen$lambda$2(collectAsState32222), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222)), startRestartGroup, 6);
                AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState42222) != null, RegistrationScreen$lambda$3(collectAsState42222), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222)), startRestartGroup, 6);
                AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState52222) != null, RegistrationScreen$lambda$4(collectAsState52222), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i152222 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
                float f32222 = 32;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32222)), startRestartGroup, 6);
                String stringResource3222 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
                if (RegistrationScreen$lambda$0(collectAsState)) {
                }
                composer2 = startRestartGroup;
                z3 = false;
                CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource3222, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i142222 << 18) & 3670016) | 12586038, 48, 0, 2093840);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222)), composer2, 6);
                String stringResource222222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
                TextStyle textStyle22222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
                Modifier m1520paddingqDBjuR0$default222222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f32222), 7, null);
                composer2.startReplaceGroup(1849434622);
                rememberedValue2 = composer2.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composer2.endReplaceGroup();
                TextKt.m2642Text4IGK_g(stringResource222222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default222222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle22222, composer2, 0, 0, 65532);
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
                modifier2 = modifier42222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i13 |= i11;
            if ((i3 & 128) == 0) {
            }
            i13 |= i10;
            if ((i3 & 256) != 0) {
            }
            i13 |= i9;
            if ((i3 & 512) == 0) {
            }
            i13 |= i8;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
            }
            if ((i13 & 306783379) == 306783378) {
            }
            if (i12 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
            State collectAsState222222 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
            State collectAsState322222 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
            State collectAsState422222 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
            State collectAsState522222 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
            State collectAsState622222 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
            ProvidableCompositionLocal<Context> localContext22222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localContext22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context22222 = (Context) consume22222;
            AuthController.LoginError RegistrationScreen$lambda$522222 = RegistrationScreen$lambda$5(collectAsState622222);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(collectAsState622222) | startRestartGroup.changedInstance(context22222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changed) {
            }
            obj = null;
            rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState622222, context22222, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(RegistrationScreen$lambda$522222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
            Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier422222 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            Modifier clickAnimation22222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
            Alignment.Vertical centerVertically22222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            int i1422222 = i6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
            IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f42222 = 24;
            Modifier m1520paddingqDBjuR0$default32222 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f42222), 5, null);
            Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default32222);
            Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
            float f222222 = 1;
            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f222222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f222222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
            int i1522222 = i13 >> 12;
            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState222222) != null, RegistrationScreen$lambda$1(collectAsState222222), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i1522222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42222)), startRestartGroup, 6);
            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState322222) != null, RegistrationScreen$lambda$2(collectAsState322222), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42222)), startRestartGroup, 6);
            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState422222) != null, RegistrationScreen$lambda$3(collectAsState422222), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42222)), startRestartGroup, 6);
            AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState522222) != null, RegistrationScreen$lambda$4(collectAsState522222), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i1522222 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
            float f322222 = 32;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322222)), startRestartGroup, 6);
            String stringResource32222 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
            if (RegistrationScreen$lambda$0(collectAsState)) {
            }
            composer2 = startRestartGroup;
            z3 = false;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource32222, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i1422222 << 18) & 3670016) | 12586038, 48, 0, 2093840);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42222)), composer2, 6);
            String stringResource2222222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
            TextStyle textStyle222222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
            Modifier m1520paddingqDBjuR0$default2222222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f322222), 7, null);
            composer2.startReplaceGroup(1849434622);
            rememberedValue2 = composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            composer2.endReplaceGroup();
            TextKt.m2642Text4IGK_g(stringResource2222222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default2222222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle222222, composer2, 0, 0, 65532);
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
            modifier2 = modifier422222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i13 |= i5;
        if ((i3 & 64) != 0) {
        }
        i13 |= i11;
        if ((i3 & 128) == 0) {
        }
        i13 |= i10;
        if ((i3 & 256) != 0) {
        }
        i13 |= i9;
        if ((i3 & 512) == 0) {
        }
        i13 |= i8;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        if (i12 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingRegistration(), null, startRestartGroup, 0, 1);
        State collectAsState2222222 = SnapshotStateKt.collectAsState(controller.getNameError(), null, startRestartGroup, 0, 1);
        State collectAsState3222222 = SnapshotStateKt.collectAsState(controller.getEmailError(), null, startRestartGroup, 0, 1);
        State collectAsState4222222 = SnapshotStateKt.collectAsState(controller.getPasswordError(), null, startRestartGroup, 0, 1);
        State collectAsState5222222 = SnapshotStateKt.collectAsState(controller.getConfirmPasswordError(), null, startRestartGroup, 0, 1);
        State collectAsState6222222 = SnapshotStateKt.collectAsState(controller.getLoginError(), null, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Context> localContext222222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localContext222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context222222 = (Context) consume222222;
        AuthController.LoginError RegistrationScreen$lambda$5222222 = RegistrationScreen$lambda$5(collectAsState6222222);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(collectAsState6222222) | startRestartGroup.changedInstance(context222222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
        }
        obj = null;
        rememberedValue = new RegistrationScreenKt$RegistrationScreen$1$1(collectAsState6222222, context222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(RegistrationScreen$lambda$5222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, obj);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
        Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier4222222 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        Modifier clickAnimation222222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getTopStart()), Dp.m7774constructorimpl(26), Dp.m7774constructorimpl(52), 0.0f, 0.0f, 12, null), onBackClick, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6 & 112, 0, 4094);
        Alignment.Vertical centerVertically222222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        int i14222222 = i6;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222222 = RowScopeInstance.INSTANCE;
        IconKt.m2488Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f422222 = 24;
        Modifier m1520paddingqDBjuR0$default322222 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(64), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(100), 0.0f, Dp.m7774constructorimpl(f422222), 5, null);
        Alignment.Horizontal centerHorizontally222222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default322222);
        Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betup_central_img, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betup_logo, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
        float f2222222 = 1;
        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2222222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.sports_betting, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2222222)), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(60)), startRestartGroup, 6);
        int i15222222 = i13 >> 12;
        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_name, startRestartGroup, 6), name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$1(collectAsState2222222) != null, RegistrationScreen$lambda$1(collectAsState2222222), 0, null, startRestartGroup, ((i13 >> 3) & 112) | 3072 | (i15222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), LogSeverity.WARNING_VALUE);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422222)), startRestartGroup, 6);
        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.email, startRestartGroup, 6), email, onEmailChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RegistrationScreen$lambda$2(collectAsState3222222) != null, RegistrationScreen$lambda$2(collectAsState3222222), KeyboardType.INSTANCE.m7473getEmailPjHm6EE(), null, startRestartGroup, ((i13 >> 6) & 112) | 12585984 | ((i13 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 272);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422222)), startRestartGroup, 6);
        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.password, startRestartGroup, 6), password, onPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$3(collectAsState4222222) != null, RegistrationScreen$lambda$3(collectAsState4222222), 0, null, startRestartGroup, ((i13 >> 9) & 112) | 27648 | ((i13 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), RendererCapabilities.DECODER_SUPPORT_MASK);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422222)), startRestartGroup, 6);
        AuthTextFieldKt.m13890AuthTextFieldjEMA23E(StringResources_androidKt.stringResource(R.string.dialog_hint_retype_pass, startRestartGroup, 6), confirmPassword, onConfirmPasswordChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, RegistrationScreen$lambda$4(collectAsState5222222) != null, RegistrationScreen$lambda$4(collectAsState5222222), 0, null, startRestartGroup, ((i13 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i15222222 & 112) | 27648, RendererCapabilities.DECODER_SUPPORT_MASK);
        float f3222222 = 32;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3222222)), startRestartGroup, 6);
        String stringResource322222 = StringResources_androidKt.stringResource(z2 ? R.string.upgrade : R.string.sign_up, startRestartGroup, 0);
        if (RegistrationScreen$lambda$0(collectAsState)) {
        }
        composer2 = startRestartGroup;
        z3 = false;
        CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, stringResource322222, false, false, z3, onSignInClick, true, false, false, RegistrationScreen$lambda$0(collectAsState), true, null, null, false, false, null, null, null, null, null, composer2, ((i14222222 << 18) & 3670016) | 12586038, 48, 0, 2093840);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422222)), composer2, 6);
        String stringResource22222222 = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer2, 6);
        TextStyle textStyle2222222 = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773116, (DefaultConstructorMarker) null);
        Modifier m1520paddingqDBjuR0$default22222222 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f3222222), 7, null);
        composer2.startReplaceGroup(1849434622);
        rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        composer2.endReplaceGroup();
        TextKt.m2642Text4IGK_g(stringResource22222222, ClickAnimationModifierKt.clickAnimation(m1520paddingqDBjuR0$default22222222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer2, 54, 0, 4094), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2222222, composer2, 0, 0, 65532);
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
        modifier2 = modifier4222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean RegistrationScreen$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String RegistrationScreen$lambda$1(State<String> state) {
        return state.getValue();
    }

    private static final String RegistrationScreen$lambda$2(State<String> state) {
        return state.getValue();
    }

    private static final String RegistrationScreen$lambda$3(State<String> state) {
        return state.getValue();
    }

    private static final String RegistrationScreen$lambda$4(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthController.LoginError RegistrationScreen$lambda$5(State<AuthController.LoginError> state) {
        return state.getValue();
    }
}
