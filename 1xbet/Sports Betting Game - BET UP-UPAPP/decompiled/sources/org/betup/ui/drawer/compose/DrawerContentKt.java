package org.betup.ui.drawer.compose;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.BadgeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
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
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.logging.type.LogSeverity;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.views.ComposeUtils;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: DrawerContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\f\u001aC\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001a\u001aQ\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0007¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"DrawerContent", "", "userService", "Lorg/betup/services/user/UserService;", "pushStorageProvider", "Lorg/betup/services/push/PushStorageProvider;", "eventsCountUpdateKey", "", "onCloseDrawer", "Lkotlin/Function0;", "onAvatarClick", "onSignUpClick", "(Lorg/betup/services/user/UserService;Lorg/betup/services/push/PushStorageProvider;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProfileSection", "userName", "", "photoUrl", "unreadNotificationsCount", "onNotificationsClick", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MenuItem", "iconRes", "text", "onClick", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DrawerUpgradeButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PrivacyPolicyLink", "DrawerContentForJava", "Lkotlin/jvm/functions/Function0;", "(Lorg/betup/services/user/UserService;Lorg/betup/services/push/PushStorageProvider;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "currentFontSize", "scale", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawerContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$23(UserService userService, PushStorageProvider pushStorageProvider, int i, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i4) {
        DrawerContent(userService, pushStorageProvider, i, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContentForJava$lambda$61(UserService userService, PushStorageProvider pushStorageProvider, int i, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        DrawerContentForJava(userService, pushStorageProvider, i, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerUpgradeButton$lambda$45(Function0 function0, int i, Composer composer, int i2) {
        DrawerUpgradeButton(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuItem$lambda$39(int i, String str, Function0 function0, int i2, Composer composer, int i3) {
        MenuItem(i, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyPolicyLink$lambda$54(Function0 function0, int i, Composer composer, int i2) {
        PrivacyPolicyLink(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileSection$lambda$30(String str, String str2, int i, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        ProfileSection(str, str2, i, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DrawerContent(final UserService userService, PushStorageProvider pushStorageProvider, int i, final Function0<Unit> onCloseDrawer, final Function0<Unit> onAvatarClick, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        PushStorageProvider pushStorageProvider2;
        int i5;
        int i6;
        int i7;
        Function0<Unit> function02;
        PushStorageProvider pushStorageProvider3;
        String name;
        boolean z;
        Object rememberedValue;
        boolean changedInstance;
        DrawerContentKt$DrawerContent$2$1 rememberedValue2;
        int currentCompositeKeyHash;
        PushStorageProvider pushStorageProvider4;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean z2;
        Object rememberedValue3;
        boolean z3;
        Object rememberedValue4;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        boolean z4;
        Object rememberedValue5;
        boolean z5;
        Object rememberedValue6;
        boolean z6;
        Object rememberedValue7;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        final Function0<Unit> function03;
        boolean changedInstance2;
        Object rememberedValue8;
        final Function0<Unit> function04;
        final int i8;
        BaseUserModel userModel;
        BaseUserModel userModel2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onCloseDrawer, "onCloseDrawer");
        Intrinsics.checkNotNullParameter(onAvatarClick, "onAvatarClick");
        Composer startRestartGroup = composer.startRestartGroup(810963784);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(userService) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            pushStorageProvider2 = pushStorageProvider;
            i4 |= startRestartGroup.changedInstance(pushStorageProvider2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(onCloseDrawer) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(onAvatarClick) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function02 = function0;
                    i4 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    if ((i4 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        pushStorageProvider3 = i9 == 0 ? null : pushStorageProvider2;
                        int i10 = i5 == 0 ? 0 : i6;
                        if (i7 != 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda0
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
                            function02 = (Function0) rememberedValue9;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(810963784, i4, -1, "org.betup.ui.drawer.compose.DrawerContent (DrawerContent.kt:71)");
                        }
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context = (Context) consume;
                        ShortUserProfileModel shortProfile = userService.getShortProfile();
                        name = (shortProfile != null || (userModel2 = shortProfile.getUserModel()) == null) ? null : userModel2.getName();
                        startRestartGroup.startReplaceGroup(1947127473);
                        if (name == null) {
                            name = StringResources_androidKt.stringResource(R.string.default_username, startRestartGroup, 6);
                        }
                        startRestartGroup.endReplaceGroup();
                        String photoUrl = (shortProfile != null || (userModel = shortProfile.getUserModel()) == null) ? null : userModel.getPhotoUrl();
                        startRestartGroup.startReplaceGroup(5004770);
                        z = (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = Integer.valueOf(pushStorageProvider3 == null ? pushStorageProvider3.getEventsCount() : 0);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int intValue = ((Number) rememberedValue).intValue();
                        startRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance = startRestartGroup.changedInstance(pushStorageProvider3) | startRestartGroup.changedInstance(userService);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new DrawerContentKt$DrawerContent$2$1(pushStorageProvider3, userService, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                        Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble1.INSTANCE.getBrush(), null, 0.0f, 6, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        pushStorageProvider4 = pushStorageProvider3;
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
                        float f = 24;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function0<Unit> function05 = function02;
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
                        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        int i11 = i4 & 7168;
                        z2 = (i11 != 2048) | ((57344 & i4) != 16384);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4(Function0.this, onCloseDrawer);
                                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        Function0 function06 = (Function0) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        z3 = i11 != 2048;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6(Function0.this);
                                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        Function0 function07 = (Function0) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        boolean z7 = true;
                        ProfileSection(name, photoUrl, intValue, function06, function07, startRestartGroup, 0);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), startRestartGroup, 6);
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                        Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        String stringResource = StringResources_androidKt.stringResource(R.string.search, startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(5004770);
                        z4 = i11 != 2048;
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8(Function0.this);
                                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceGroup();
                        MenuItem(R.drawable.ic_search, stringResource, (Function0) rememberedValue5, startRestartGroup, 6);
                        float f2 = 20;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                        String stringResource2 = StringResources_androidKt.stringResource(R.string.action_settings, startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(5004770);
                        z5 = i11 != 2048;
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10(Function0.this);
                                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        startRestartGroup.endReplaceGroup();
                        MenuItem(R.drawable.new_settings_ic, stringResource2, (Function0) rememberedValue6, startRestartGroup, 6);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                        String stringResource3 = StringResources_androidKt.stringResource(R.string.support, startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(5004770);
                        z6 = i11 != 2048;
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!z6 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12(Function0.this);
                                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        startRestartGroup.endReplaceGroup();
                        MenuItem(R.drawable.support, stringResource3, (Function0) rememberedValue7, startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1168578867);
                        if (userService.isAnonymous()) {
                            function03 = function05;
                        } else {
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean z8 = (i4 & 458752) == 131072;
                            if (i11 != 2048) {
                                z7 = false;
                            }
                            boolean z9 = z7 | z8;
                            Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (z9 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                function03 = function05;
                                rememberedValue10 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit DrawerContent$lambda$22$lambda$21$lambda$18$lambda$17$lambda$16;
                                        DrawerContent$lambda$22$lambda$21$lambda$18$lambda$17$lambda$16 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$18$lambda$17$lambda$16(Function0.this, onCloseDrawer);
                                        return DrawerContent$lambda$22$lambda$21$lambda$18$lambda$17$lambda$16;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            } else {
                                function03 = function05;
                            }
                            startRestartGroup.endReplaceGroup();
                            DrawerUpgradeButton((Function0) rememberedValue10, startRestartGroup, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance2 = startRestartGroup.changedInstance(context);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                                    DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19(context);
                                    return DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        startRestartGroup.endReplaceGroup();
                        PrivacyPolicyLink((Function0) rememberedValue8, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                        i8 = i10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        pushStorageProvider4 = pushStorageProvider2;
                        i8 = i6;
                        function04 = function02;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final PushStorageProvider pushStorageProvider5 = pushStorageProvider4;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DrawerContent$lambda$23;
                                DrawerContent$lambda$23 = DrawerContentKt.DrawerContent$lambda$23(UserService.this, pushStorageProvider5, i8, onCloseDrawer, onAvatarClick, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return DrawerContent$lambda$23;
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((i4 & 74899) == 74898) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context2 = (Context) consume2;
                ShortUserProfileModel shortProfile2 = userService.getShortProfile();
                if (shortProfile2 != null) {
                }
                startRestartGroup.startReplaceGroup(1947127473);
                if (name == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (shortProfile2 != null) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = Integer.valueOf(pushStorageProvider3 == null ? pushStorageProvider3.getEventsCount() : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
                int intValue2 = ((Number) rememberedValue).intValue();
                startRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(pushStorageProvider3) | startRestartGroup.changedInstance(userService);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new DrawerContentKt$DrawerContent$2$1(pushStorageProvider3, userService, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                Modifier background$default2 = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble1.INSTANCE.getBrush(), null, 0.0f, 6, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                pushStorageProvider4 = pushStorageProvider3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                float f3 = 24;
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f3));
                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                Function0<Unit> function052 = function02;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance4, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((57344 & i4) != 16384) {
                }
                int i112 = i4 & 7168;
                z2 = (i112 != 2048) | ((57344 & i4) != 16384);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue3 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                        DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4(Function0.this, onCloseDrawer);
                        return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Function0 function062 = (Function0) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                if (i112 != 2048) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue4 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                        DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6(Function0.this);
                        return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                Function0 function072 = (Function0) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                boolean z72 = true;
                ProfileSection(name, photoUrl, intValue2, function062, function072, startRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), startRestartGroup, 6);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Horizontal start2 = Alignment.INSTANCE.getStart();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                String stringResource4 = StringResources_androidKt.stringResource(R.string.search, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(5004770);
                if (i112 != 2048) {
                }
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue5 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                        DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8(Function0.this);
                        return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceGroup();
                MenuItem(R.drawable.ic_search, stringResource4, (Function0) rememberedValue5, startRestartGroup, 6);
                float f22 = 20;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
                String stringResource22 = StringResources_androidKt.stringResource(R.string.action_settings, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(5004770);
                if (i112 != 2048) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue6 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                        DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10(Function0.this);
                        return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceGroup();
                MenuItem(R.drawable.new_settings_ic, stringResource22, (Function0) rememberedValue6, startRestartGroup, 6);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
                String stringResource32 = StringResources_androidKt.stringResource(R.string.support, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(5004770);
                if (i112 != 2048) {
                }
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!z6) {
                }
                rememberedValue7 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                        DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12(Function0.this);
                        return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
                startRestartGroup.endReplaceGroup();
                MenuItem(R.drawable.support, stringResource32, (Function0) rememberedValue7, startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier weight$default2 = ColumnScope.weight$default(columnScopeInstance4, Modifier.INSTANCE, 1.0f, false, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting()) {
                }
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1168578867);
                if (userService.isAnonymous()) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance2 = startRestartGroup.changedInstance(context2);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue8 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                        DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19(context2);
                        return DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceGroup();
                PrivacyPolicyLink((Function0) rememberedValue8, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
                i8 = i10;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i;
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            function02 = function0;
            if ((i4 & 74899) == 74898) {
            }
            if (i9 == 0) {
            }
            if (i5 == 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context22 = (Context) consume22;
            ShortUserProfileModel shortProfile22 = userService.getShortProfile();
            if (shortProfile22 != null) {
            }
            startRestartGroup.startReplaceGroup(1947127473);
            if (name == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (shortProfile22 != null) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = Integer.valueOf(pushStorageProvider3 == null ? pushStorageProvider3.getEventsCount() : 0);
            startRestartGroup.updateRememberedValue(rememberedValue);
            int intValue22 = ((Number) rememberedValue).intValue();
            startRestartGroup.endReplaceGroup();
            Unit unit22 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(pushStorageProvider3) | startRestartGroup.changedInstance(userService);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new DrawerContentKt$DrawerContent$2$1(pushStorageProvider3, userService, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            Modifier background$default22 = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble1.INSTANCE.getBrush(), null, 0.0f, 6, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default22);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            pushStorageProvider4 = pushStorageProvider3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            float f32 = 24;
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f32));
            Alignment.Horizontal centerHorizontally32 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            Function0<Unit> function0522 = function02;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance42, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((57344 & i4) != 16384) {
            }
            int i1122 = i4 & 7168;
            z2 = (i1122 != 2048) | ((57344 & i4) != 16384);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4(Function0.this, onCloseDrawer);
                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function0 function0622 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            if (i1122 != 2048) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue4 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6(Function0.this);
                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Function0 function0722 = (Function0) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            boolean z722 = true;
            ProfileSection(name, photoUrl, intValue22, function0622, function0722, startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), startRestartGroup, 6);
            Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Horizontal start22 = Alignment.INSTANCE.getStart();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
            String stringResource42 = StringResources_androidKt.stringResource(R.string.search, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            if (i1122 != 2048) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue5 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8(Function0.this);
                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            MenuItem(R.drawable.ic_search, stringResource42, (Function0) rememberedValue5, startRestartGroup, 6);
            float f222 = 20;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), startRestartGroup, 6);
            String stringResource222 = StringResources_androidKt.stringResource(R.string.action_settings, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            if (i1122 != 2048) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue6 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10(Function0.this);
                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            MenuItem(R.drawable.new_settings_ic, stringResource222, (Function0) rememberedValue6, startRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), startRestartGroup, 6);
            String stringResource322 = StringResources_androidKt.stringResource(R.string.support, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(5004770);
            if (i1122 != 2048) {
            }
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!z6) {
            }
            rememberedValue7 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                    DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12(Function0.this);
                    return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            MenuItem(R.drawable.support, stringResource322, (Function0) rememberedValue7, startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier weight$default22 = ColumnScope.weight$default(columnScopeInstance42, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
            Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1168578867);
            if (userService.isAnonymous()) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(context22);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue8 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                    DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19(context22);
                    return DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            PrivacyPolicyLink((Function0) rememberedValue8, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function03;
            i8 = i10;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        pushStorageProvider2 = pushStorageProvider;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((i4 & 74899) == 74898) {
        }
        if (i9 == 0) {
        }
        if (i5 == 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context222 = (Context) consume222;
        ShortUserProfileModel shortProfile222 = userService.getShortProfile();
        if (shortProfile222 != null) {
        }
        startRestartGroup.startReplaceGroup(1947127473);
        if (name == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (shortProfile222 != null) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = Integer.valueOf(pushStorageProvider3 == null ? pushStorageProvider3.getEventsCount() : 0);
        startRestartGroup.updateRememberedValue(rememberedValue);
        int intValue222 = ((Number) rememberedValue).intValue();
        startRestartGroup.endReplaceGroup();
        Unit unit222 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(pushStorageProvider3) | startRestartGroup.changedInstance(userService);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new DrawerContentKt$DrawerContent$2$1(pushStorageProvider3, userService, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
        Modifier background$default222 = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble1.INSTANCE.getBrush(), null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default222);
        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
        pushStorageProvider4 = pushStorageProvider3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        float f322 = 24;
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f322));
        Alignment.Horizontal centerHorizontally322 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy422 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally322, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function05222 = function02;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance422 = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance422, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((57344 & i4) != 16384) {
        }
        int i11222 = i4 & 7168;
        z2 = (i11222 != 2048) | ((57344 & i4) != 16384);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
                DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4(Function0.this, onCloseDrawer);
                return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function0 function06222 = (Function0) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i11222 != 2048) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
                DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6(Function0.this);
                return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        Function0 function07222 = (Function0) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        boolean z7222 = true;
        ProfileSection(name, photoUrl, intValue222, function06222, function07222, startRestartGroup, 0);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), startRestartGroup, 6);
        Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f322), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Horizontal start222 = Alignment.INSTANCE.getStart();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
        String stringResource422 = StringResources_androidKt.stringResource(R.string.search, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(5004770);
        if (i11222 != 2048) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue5 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
                DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8(Function0.this);
                return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        MenuItem(R.drawable.ic_search, stringResource422, (Function0) rememberedValue5, startRestartGroup, 6);
        float f2222 = 20;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222)), startRestartGroup, 6);
        String stringResource2222 = StringResources_androidKt.stringResource(R.string.action_settings, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(5004770);
        if (i11222 != 2048) {
        }
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue6 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
                DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10(Function0.this);
                return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        MenuItem(R.drawable.new_settings_ic, stringResource2222, (Function0) rememberedValue6, startRestartGroup, 6);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222)), startRestartGroup, 6);
        String stringResource3222 = StringResources_androidKt.stringResource(R.string.support, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(5004770);
        if (i11222 != 2048) {
        }
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue7 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
                DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12(Function0.this);
                return DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        MenuItem(R.drawable.support, stringResource3222, (Function0) rememberedValue7, startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier weight$default222 = ColumnScope.weight$default(columnScopeInstance422, Modifier.INSTANCE, 1.0f, false, 2, null);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
        Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5222);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1168578867);
        if (userService.isAnonymous()) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(context222);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue8 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
                DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19 = DrawerContentKt.DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19(context222);
                return DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        PrivacyPolicyLink((Function0) rememberedValue8, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function04 = function03;
        i8 = i10;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$5$lambda$4(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$7$lambda$6(Function0 function0) {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.EVENTS, null));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$9$lambda$8(Function0 function0) {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SEARCH, null));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$11$lambda$10(Function0 function0) {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SETTINGS, null));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13$lambda$12(Function0 function0) {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SUPPORT, null));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$18$lambda$17$lambda$16(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContent$lambda$22$lambda$21$lambda$20$lambda$19(Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ApiConfigResolver.getApiConfig().getPrivacyPolicyUrl())));
        return Unit.INSTANCE;
    }

    private static final void ProfileSection(final String str, final String str2, final int i, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1235350840);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i4 = i3;
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235350840, i4, -1, "org.betup.ui.drawer.compose.ProfileSection (DrawerContent.kt:206)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier clip = ClipKt.clip(boxScopeInstance.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(100)), Alignment.INSTANCE.getCenter()), RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i4 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ProfileSection$lambda$29$lambda$28$lambda$25$lambda$24;
                        ProfileSection$lambda$29$lambda$28$lambda$25$lambda$24 = DrawerContentKt.ProfileSection$lambda$29$lambda$28$lambda$25$lambda$24(Function0.this);
                        return ProfileSection$lambda$29$lambda$28$lambda$25$lambda$24;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(ImageRequests_androidKt.allowHardware(new ImageRequest.Builder((Context) consume).data(str2), false).build(), null, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.mipmap.ic_launcher, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.mipmap.ic_launcher, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f = 8;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 0.0f, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 9, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(1156442761, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$ProfileSection$1$1$3$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BadgedBox, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1156442761, i5, -1, "org.betup.ui.drawer.compose.ProfileSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrawerContent.kt:246)");
                    }
                    if (i > 0) {
                        final int i6 = i;
                        BadgeKt.m2717BadgeeopBjH0(null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(344511441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$ProfileSection$1$1$3$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Badge, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
                                if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(344511441, i7, -1, "org.betup.ui.drawer.compose.ProfileSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrawerContent.kt:248)");
                                }
                                int i8 = i6;
                                TextKt.m2642Text4IGK_g(i8 > 99 ? "99+" : String.valueOf(i8), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 7);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-942301241, true, new DrawerContentKt$ProfileSection$1$1$3$2(i, function02), startRestartGroup, 54), startRestartGroup, 390, 2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(20), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i4 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProfileSection$lambda$30;
                    ProfileSection$lambda$30 = DrawerContentKt.ProfileSection$lambda$30(str, str2, i, function0, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ProfileSection$lambda$30;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileSection$lambda$29$lambda$28$lambda$25$lambda$24(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void MenuItem(final int i, final String str, final Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2143170127);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2143170127, i4, -1, "org.betup.ui.drawer.compose.MenuItem (DrawerContent.kt:299)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            long sp = TextUnitKt.getSp(20);
            int MenuItem$lambda$32 = MenuItem$lambda$32(mutableState);
            if (MenuItem$lambda$32 != 0) {
                if (MenuItem$lambda$32 == 1) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                } else if (MenuItem$lambda$32 == 2) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                } else if (MenuItem$lambda$32 == 3) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                } else if (MenuItem$lambda$32 == 4) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                } else if (MenuItem$lambda$32 == 5) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                } else {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                }
            }
            long j = sp;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MenuItem$lambda$35$lambda$34;
                        MenuItem$lambda$35$lambda$34 = DrawerContentKt.MenuItem$lambda$35$lambda$34(Function0.this);
                        return MenuItem$lambda$35$lambda$34;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue2, 7, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i4 & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0, 2, null), startRestartGroup, 432, 56);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), j, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
            int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MenuItem$lambda$38$lambda$37$lambda$36;
                        MenuItem$lambda$38$lambda$37$lambda$36 = DrawerContentKt.MenuItem$lambda$38$lambda$37$lambda$36(MutableState.this, (TextLayoutResult) obj);
                        return MenuItem$lambda$38$lambda$37$lambda$36;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(str, fillMaxWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle, composer2, ((i4 >> 3) & 14) | 48, 199728, 22524);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuItem$lambda$39;
                    MenuItem$lambda$39 = DrawerContentKt.MenuItem$lambda$39(i, str, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuItem$lambda$39;
                }
            });
        }
    }

    private static final int MenuItem$lambda$32(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void MenuItem$lambda$33(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuItem$lambda$35$lambda$34(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuItem$lambda$38$lambda$37$lambda$36(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) && MenuItem$lambda$32(mutableState) < 6) {
            MenuItem$lambda$33(mutableState, MenuItem$lambda$32(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    private static final void DrawerUpgradeButton(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2117264242);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2117264242, i2, -1, "org.betup.ui.drawer.compose.DrawerUpgradeButton (DrawerContent.kt:350)");
            }
            State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("drawer_upgrade_pulse", startRestartGroup, 6, 0), 1.0f, 1.25f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(700, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerUpgradeButton$lambda$42$lambda$41;
                        DrawerUpgradeButton$lambda$42$lambda$41 = DrawerContentKt.DrawerUpgradeButton$lambda$42$lambda$41(Function0.this);
                        return DrawerUpgradeButton$lambda$42$lambda$41;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7774constructorimpl(24), Dp.m7774constructorimpl(16));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier scale = ScaleKt.scale(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), DrawerUpgradeButton$lambda$40(animateFloat));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, scale);
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
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), true, StringResources_androidKt.stringResource(R.string.upgrade, startRestartGroup, 6), false, false, false, function0, true, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, ((i2 << 18) & 3670016) | 12582966, 0, 0, 2096952);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DrawerUpgradeButton$lambda$45;
                    DrawerUpgradeButton$lambda$45 = DrawerContentKt.DrawerUpgradeButton$lambda$45(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DrawerUpgradeButton$lambda$45;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerUpgradeButton$lambda$42$lambda$41(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void PrivacyPolicyLink(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1639724453);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1639724453, i2, -1, "org.betup.ui.drawer.compose.PrivacyPolicyLink (DrawerContent.kt:389)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            long sp = TextUnitKt.getSp(14);
            int PrivacyPolicyLink$lambda$47 = PrivacyPolicyLink$lambda$47(mutableState);
            if (PrivacyPolicyLink$lambda$47 != 0) {
                if (PrivacyPolicyLink$lambda$47 == 1) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                } else if (PrivacyPolicyLink$lambda$47 == 2) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                } else if (PrivacyPolicyLink$lambda$47 == 3) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                } else if (PrivacyPolicyLink$lambda$47 == 4) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                } else if (PrivacyPolicyLink$lambda$47 == 5) {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                } else {
                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                }
            }
            long j = sp;
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit PrivacyPolicyLink$lambda$53$lambda$50$lambda$49;
                        PrivacyPolicyLink$lambda$53$lambda$50$lambda$49 = DrawerContentKt.PrivacyPolicyLink$lambda$53$lambda$50$lambda$49(Function0.this);
                        return PrivacyPolicyLink$lambda$53$lambda$50$lambda$49;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue2, 7, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.terms_privacy_policy, startRestartGroup, 6);
            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), j, new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773080, (DefaultConstructorMarker) null);
            int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PrivacyPolicyLink$lambda$53$lambda$52$lambda$51;
                        PrivacyPolicyLink$lambda$53$lambda$52$lambda$51 = DrawerContentKt.PrivacyPolicyLink$lambda$53$lambda$52$lambda$51(MutableState.this, (TextLayoutResult) obj);
                        return PrivacyPolicyLink$lambda$53$lambda$52$lambda$51;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(stringResource, m1059clickableXHw0xAI$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle, composer2, 0, 199728, 22524);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrivacyPolicyLink$lambda$54;
                    PrivacyPolicyLink$lambda$54 = DrawerContentKt.PrivacyPolicyLink$lambda$54(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrivacyPolicyLink$lambda$54;
                }
            });
        }
    }

    private static final int PrivacyPolicyLink$lambda$47(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void PrivacyPolicyLink$lambda$48(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyPolicyLink$lambda$53$lambda$50$lambda$49(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyPolicyLink$lambda$53$lambda$52$lambda$51(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) && PrivacyPolicyLink$lambda$47(mutableState) < 6) {
            PrivacyPolicyLink$lambda$48(mutableState, PrivacyPolicyLink$lambda$47(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    public static final void DrawerContentForJava(final UserService userService, final PushStorageProvider pushStorageProvider, final int i, final Function0<Unit> onCloseDrawer, final Function0<Unit> onAvatarClick, final Function0<Unit> onSignUpClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onCloseDrawer, "onCloseDrawer");
        Intrinsics.checkNotNullParameter(onAvatarClick, "onAvatarClick");
        Intrinsics.checkNotNullParameter(onSignUpClick, "onSignUpClick");
        Composer startRestartGroup = composer.startRestartGroup(632823345);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(userService) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(pushStorageProvider) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onCloseDrawer) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onAvatarClick) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(onSignUpClick) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(632823345, i3, -1, "org.betup.ui.drawer.compose.DrawerContentForJava (DrawerContent.kt:442)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(onCloseDrawer);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContentForJava$lambda$56$lambda$55;
                        DrawerContentForJava$lambda$56$lambda$55 = DrawerContentKt.DrawerContentForJava$lambda$56$lambda$55(Function0.this);
                        return DrawerContentForJava$lambda$56$lambda$55;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance2 = startRestartGroup.changedInstance(onAvatarClick);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContentForJava$lambda$58$lambda$57;
                        DrawerContentForJava$lambda$58$lambda$57 = DrawerContentKt.DrawerContentForJava$lambda$58$lambda$57(Function0.this);
                        return DrawerContentForJava$lambda$58$lambda$57;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance3 = startRestartGroup.changedInstance(onSignUpClick);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DrawerContentForJava$lambda$60$lambda$59;
                        DrawerContentForJava$lambda$60$lambda$59 = DrawerContentKt.DrawerContentForJava$lambda$60$lambda$59(Function0.this);
                        return DrawerContentForJava$lambda$60$lambda$59;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            DrawerContent(userService, pushStorageProvider, i, function0, function02, (Function0) rememberedValue3, startRestartGroup, i3 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.drawer.compose.DrawerContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DrawerContentForJava$lambda$61;
                    DrawerContentForJava$lambda$61 = DrawerContentKt.DrawerContentForJava$lambda$61(UserService.this, pushStorageProvider, i, onCloseDrawer, onAvatarClick, onSignUpClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DrawerContentForJava$lambda$61;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContentForJava$lambda$56$lambda$55(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContentForJava$lambda$58$lambda$57(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerContentForJava$lambda$60$lambda$59(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final float DrawerUpgradeButton$lambda$40(State<Float> state) {
        return state.getValue().floatValue();
    }
}
