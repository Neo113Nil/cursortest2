package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor;
import org.betup.model.remote.entity.country.CountryModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.utils.SnackbarHelper;

/* compiled from: ChangeCountryDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChangeV7CountryInteractor $changeCountryInteractor;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isSaving$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<CharSequence, Unit> $onShowMessage;
    final /* synthetic */ MutableState<CountryModel> $selectedCountry$delegate;
    final /* synthetic */ UserService $userService;

    /* JADX WARN: Multi-variable type inference failed */
    ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2(Function0<Unit> function0, UserService userService, ChangeV7CountryInteractor changeV7CountryInteractor, Context context, Function1<? super CharSequence, Unit> function1, MutableState<Boolean> mutableState, MutableState<CountryModel> mutableState2, MutableState<String> mutableState3) {
        this.$onDismiss = function0;
        this.$userService = userService;
        this.$changeCountryInteractor = changeV7CountryInteractor;
        this.$context = context;
        this.$onShowMessage = function1;
        this.$isSaving$delegate = mutableState;
        this.$selectedCountry$delegate = mutableState2;
        this.$errorMessage$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(MutableState mutableState, final UserService userService, final Function0 function0, ChangeV7CountryInteractor changeV7CountryInteractor, final MutableState mutableState2, final Context context, final Function1 function1, final MutableState mutableState3) {
        final CountryModel ChangeCountryDialogScreen$lambda$4;
        ChangeCountryDialogScreen$lambda$4 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$4(mutableState);
        if (ChangeCountryDialogScreen$lambda$4 != null) {
            CountryModel country = userService.getShortProfile().getUserModel().getCountry();
            final String iso = country != null ? country.getIso() : null;
            if (ChangeCountryDialogScreen$lambda$4.getIso() == null || !Intrinsics.areEqual(ChangeCountryDialogScreen$lambda$4.getIso(), iso)) {
                ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$11(mutableState2, true);
                BaseCachedSharedInteractor.OnFetchedListener<NewUserInfoModel, String> onFetchedListener = new BaseCachedSharedInteractor.OnFetchedListener<NewUserInfoModel, String>() { // from class: org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2$1$1$1$1$1
                    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                    public void onFetched(FetchedResponseMessage<NewUserInfoModel, String> responseMessage) {
                        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                        ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$11(mutableState2, false);
                        if (responseMessage.getStat() == FetchStat.SUCCESS) {
                            UserService.this.invalidate(UserService.InfoKind.GENERAL);
                            UserService.this.syncProfile(UserService.InfoKind.GENERAL);
                            AnalyticsHelper.INSTANCE.logCountryChanged(iso, ChangeCountryDialogScreen$lambda$4.getIso());
                            String string = context.getString(R.string.changes_applied);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            Function1<CharSequence, Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(string);
                            } else {
                                SnackbarHelper.showShort(context, string);
                            }
                            function0.invoke();
                            return;
                        }
                        mutableState3.setValue(context.getString(R.string.error_occured));
                        String string2 = context.getString(R.string.error_occured);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        Function1<CharSequence, Unit> function13 = function1;
                        if (function13 != null) {
                            function13.invoke(string2);
                        } else {
                            SnackbarHelper.showShort(context, string2);
                        }
                    }
                };
                String iso2 = ChangeCountryDialogScreen$lambda$4.getIso();
                if (iso2 == null) {
                    iso2 = "";
                }
                changeV7CountryInteractor.load(onFetchedListener, iso2);
            } else {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0184, code lost:
    
        if (r0 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        boolean ChangeCountryDialogScreen$lambda$10;
        boolean ChangeCountryDialogScreen$lambda$102;
        CountryModel ChangeCountryDialogScreen$lambda$4;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-299036633, i, -1, "org.betup.ui.dialogs.compose.ChangeCountryDialogScreen.<anonymous>.<anonymous> (ChangeCountryDialogScreen.kt:108)");
        }
        float f = 16;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        final Function0<Unit> function0 = this.$onDismiss;
        final UserService userService = this.$userService;
        final ChangeV7CountryInteractor changeV7CountryInteractor = this.$changeCountryInteractor;
        final Context context = this.$context;
        final Function1<CharSequence, Unit> function1 = this.$onShowMessage;
        final MutableState<Boolean> mutableState = this.$isSaving$delegate;
        final MutableState<CountryModel> mutableState2 = this.$selectedCountry$delegate;
        final MutableState<String> mutableState3 = this.$errorMessage$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        boolean z = true;
        CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, StringResources_androidKt.stringResource(android.R.string.cancel, composer, 6), false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 48, 0, 0, 2097080);
        String stringResource = StringResources_androidKt.stringResource(R.string.ok, composer, 6);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        ChangeCountryDialogScreen$lambda$10 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$10(mutableState);
        if (!ChangeCountryDialogScreen$lambda$10) {
            ChangeCountryDialogScreen$lambda$4 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$4(mutableState2);
        }
        z = false;
        ChangeCountryDialogScreen$lambda$102 = ChangeCountryDialogScreenKt.ChangeCountryDialogScreen$lambda$10(mutableState);
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(userService) | composer.changed(function0) | composer.changedInstance(changeV7CountryInteractor) | composer.changedInstance(context) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2$lambda$1;
                    invoke$lambda$3$lambda$2$lambda$1 = ChangeCountryDialogScreenKt$ChangeCountryDialogScreen$2$2.invoke$lambda$3$lambda$2$lambda$1(MutableState.this, userService, function0, changeV7CountryInteractor, mutableState, context, function1, mutableState3);
                    return invoke$lambda$3$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, true, stringResource, false, false, z, (Function0) rememberedValue, false, false, false, ChangeCountryDialogScreen$lambda$102, false, null, null, false, false, null, null, null, null, null, composer, 48, 0, 0, 2096024);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
