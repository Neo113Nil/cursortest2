package org.betup.ui.common.balance;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.utils.SharedPrefs;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ToolbarBalanceComposeHost.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/common/balance/ToolbarBalanceComposeHost;", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "applicationContext", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/ui/platform/ComposeView;Landroid/content/Context;)V", "uiState", "Landroidx/compose/runtime/MutableState;", "Lorg/betup/ui/common/balance/ToolbarBalanceUiState;", "updateDisplay", "", "newBalance", "", "animationPrevious", X3.a.t, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToolbarBalanceComposeHost {
    public static final int $stable = ComposeView.$stable;
    private final ComposeView composeView;
    private final MutableState<ToolbarBalanceUiState> uiState;

    public ToolbarBalanceComposeHost(ComposeView composeView, Context applicationContext) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.composeView = composeView;
        this.uiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ToolbarBalanceUiState(-1L, -1L, SharedPrefs.getBalanceAnimationMode(applicationContext)), null, 2, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-609773441, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.balance.ToolbarBalanceComposeHost.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-609773441, i, -1, "org.betup.ui.common.balance.ToolbarBalanceComposeHost.<anonymous> (ToolbarBalanceComposeHost.kt:42)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Context context = (Context) consume;
                float dimension = context.getResources().getDimension(R.dimen.font_size_default) / context.getResources().getDisplayMetrics().scaledDensity;
                ToolbarBalanceUiState toolbarBalanceUiState = (ToolbarBalanceUiState) ToolbarBalanceComposeHost.this.uiState.getValue();
                if (toolbarBalanceUiState.getBalance() >= 0) {
                    Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), null, false, 3, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, wrapContentWidth$default);
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
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BalanceAnimatedAmountKt.m12877BalanceAnimatedAmountL10cc54(toolbarBalanceUiState.getBalance(), toolbarBalanceUiState.getAnimationPrevious(), toolbarBalanceUiState.getMode(), null, TextUnitKt.getSp(dimension), composer, 0, 8);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public final void updateDisplay(final long newBalance, final long animationPrevious, final int mode) {
        this.composeView.post(new Runnable() { // from class: org.betup.ui.common.balance.ToolbarBalanceComposeHost$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ToolbarBalanceComposeHost.updateDisplay$lambda$0(ToolbarBalanceComposeHost.this, newBalance, animationPrevious, mode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDisplay$lambda$0(ToolbarBalanceComposeHost toolbarBalanceComposeHost, long j, long j2, int i) {
        toolbarBalanceComposeHost.uiState.setValue(new ToolbarBalanceUiState(j, j2, i));
    }
}
