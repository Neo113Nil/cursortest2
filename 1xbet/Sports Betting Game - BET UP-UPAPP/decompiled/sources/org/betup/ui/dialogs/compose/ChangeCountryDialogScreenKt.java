package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor;
import org.betup.model.remote.entity.country.CountryModel;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;

/* compiled from: ChangeCountryDialogScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, d2 = {"ChangeCountryDialogScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "userService", "Lorg/betup/services/user/UserService;", "getCountriesInteractor", "Lorg/betup/model/remote/api/rest/country/GetV7CountriesInteractor;", "changeCountryInteractor", "Lorg/betup/model/remote/api/rest/user/ChangeV7CountryInteractor;", "onDismiss", "Lkotlin/Function0;", "onShowMessage", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lorg/betup/services/user/UserService;Lorg/betup/model/remote/api/rest/country/GetV7CountriesInteractor;Lorg/betup/model/remote/api/rest/user/ChangeV7CountryInteractor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "countries", "", "Lorg/betup/model/remote/entity/country/CountryModel;", "selectedCountry", "isLoading", "", "isSaving", "errorMessage", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangeCountryDialogScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeCountryDialogScreen$lambda$17(Modifier modifier, UserService userService, GetV7CountriesInteractor getV7CountriesInteractor, ChangeV7CountryInteractor changeV7CountryInteractor, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        ChangeCountryDialogScreen(modifier, userService, getV7CountriesInteractor, changeV7CountryInteractor, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangeCountryDialogScreen(Modifier modifier, final UserService userService, final GetV7CountriesInteractor getCountriesInteractor, final ChangeV7CountryInteractor changeCountryInteractor, final Function0<Unit> onDismiss, Function1<? super CharSequence, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Function1<? super CharSequence, Unit> function12;
        int i4;
        Modifier modifier3;
        Context context;
        Object rememberedValue;
        MutableState mutableState;
        Object rememberedValue2;
        MutableState mutableState2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        Unit unit;
        boolean changedInstance;
        ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1 rememberedValue6;
        Unit unit2;
        MutableState mutableState3;
        MutableState mutableState4;
        Context context2;
        Modifier modifier4;
        int i5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(getCountriesInteractor, "getCountriesInteractor");
        Intrinsics.checkNotNullParameter(changeCountryInteractor, "changeCountryInteractor");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(2124064511);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(userService) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(getCountriesInteractor) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(changeCountryInteractor) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
            i4 = i3;
            if ((74899 & i4) == 74898 || !startRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                Function1<? super CharSequence, Unit> function13 = i7 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2124064511, i4, -1, "org.betup.ui.dialogs.compose.ChangeCountryDialogScreen (ChangeCountryDialogScreen.kt:54)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                context = (Context) consume;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState2 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState5 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState6 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState7 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = startRestartGroup.changedInstance(getCountriesInteractor) | startRestartGroup.changedInstance(userService) | startRestartGroup.changedInstance(context);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    unit2 = unit;
                    mutableState3 = mutableState2;
                    mutableState4 = mutableState;
                    context2 = context;
                    modifier4 = modifier3;
                    i5 = i4;
                    rememberedValue6 = new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1(getCountriesInteractor, userService, context, mutableState, mutableState3, mutableState5, mutableState7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    unit2 = unit;
                    mutableState3 = mutableState2;
                    mutableState4 = mutableState;
                    context2 = context;
                    modifier4 = modifier3;
                    i5 = i4;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
                float f = 32;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(modifier4, null, false, 3, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i5 >> 9) & 112) | 24576, 108);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
                MutableState mutableState8 = mutableState3;
                Modifier modifier6 = modifier4;
                composer2 = startRestartGroup;
                TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$ChangeCountryDialogScreenKt.INSTANCE.m13288getLambda$281749083$app_release(), ComposableLambdaKt.rememberComposableLambda(1857090790, true, new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1(mutableState5, mutableState7, mutableState4, mutableState8), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-299036633, true, new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2(onDismiss, userService, changeCountryInteractor, context2, function13, mutableState6, mutableState8, mutableState7), composer2, 54), false, true, null, false, composer2, 224694, 192);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function13;
                modifier5 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ChangeCountryDialogScreen$lambda$17;
                        ChangeCountryDialogScreen$lambda$17 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$17(Modifier.this, userService, getCountriesInteractor, changeCountryInteractor, onDismiss, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ChangeCountryDialogScreen$lambda$17;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i3;
        if ((74899 & i4) == 74898) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState52 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState62 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState72 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        unit = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = startRestartGroup.changedInstance(getCountriesInteractor) | startRestartGroup.changedInstance(userService) | startRestartGroup.changedInstance(context);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        unit2 = unit;
        mutableState3 = mutableState2;
        mutableState4 = mutableState;
        context2 = context;
        modifier4 = modifier3;
        i5 = i4;
        rememberedValue6 = new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$1$1(getCountriesInteractor, userService, context, mutableState, mutableState3, mutableState52, mutableState72, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
        float f2 = 32;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(modifier4, null, false, 3, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2));
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i5 >> 9) & 112) | 24576, 108);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
        MutableState mutableState82 = mutableState3;
        Modifier modifier62 = modifier4;
        composer2 = startRestartGroup;
        TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$ChangeCountryDialogScreenKt.INSTANCE.m13288getLambda$281749083$app_release(), ComposableLambdaKt.rememberComposableLambda(1857090790, true, new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$1(mutableState52, mutableState72, mutableState4, mutableState82), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-299036633, true, new ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2(onDismiss, userService, changeCountryInteractor, context2, function13, mutableState62, mutableState82, mutableState72), composer2, 54), false, true, null, false, composer2, 224694, 192);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(65)), composer2, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function13;
        modifier5 = modifier62;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CountryModel> ChangeCountryDialogScreen$lambda$1(MutableState<List<CountryModel>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountryModel ChangeCountryDialogScreen$lambda$4(MutableState<CountryModel> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChangeCountryDialogScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangeCountryDialogScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChangeCountryDialogScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangeCountryDialogScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangeCountryDialogScreen$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
