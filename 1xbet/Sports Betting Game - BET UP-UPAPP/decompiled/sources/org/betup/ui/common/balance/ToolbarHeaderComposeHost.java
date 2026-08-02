package org.betup.ui.common.balance;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.AppTopHeaderKt;
import org.betup.ui.common.compose.AppTopHeaderState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ToolbarHeaderComposeHost.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001eJ\u0016\u0010&\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lorg/betup/ui/common/balance/ToolbarHeaderComposeHost;", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "applicationContext", "Landroid/content/Context;", "onProfileClick", "Lkotlin/Function0;", "", "onBalanceClick", "onAddCoinsClick", "onStreakClick", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/ui/platform/ComposeView;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "Lorg/betup/ui/common/compose/AppTopHeaderState;", "uiState", "getUiState", "()Lorg/betup/ui/common/compose/AppTopHeaderState;", "setUiState", "(Lorg/betup/ui/common/compose/AppTopHeaderState;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "balanceFontSp", "", "updateUser", "displayName", "", "photoUrl", "level", "", "streakCount", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "updateBalance", "newBalance", "", "animationPrevious", X3.a.t, "applyStateUpdate", "block", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToolbarHeaderComposeHost {
    public static final int $stable = ComposeView.$stable;
    private final float balanceFontSp;
    private final ComposeView composeView;
    private final Function0<Unit> onAddCoinsClick;
    private final Function0<Unit> onBalanceClick;
    private final Function0<Unit> onProfileClick;
    private final Function0<Unit> onStreakClick;

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final MutableState uiState;

    public ToolbarHeaderComposeHost(ComposeView composeView, Context applicationContext, Function0<Unit> onProfileClick, Function0<Unit> onBalanceClick, Function0<Unit> onAddCoinsClick, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(onProfileClick, "onProfileClick");
        Intrinsics.checkNotNullParameter(onBalanceClick, "onBalanceClick");
        Intrinsics.checkNotNullParameter(onAddCoinsClick, "onAddCoinsClick");
        this.composeView = composeView;
        this.onProfileClick = onProfileClick;
        this.onBalanceClick = onBalanceClick;
        this.onAddCoinsClick = onAddCoinsClick;
        this.onStreakClick = function0;
        this.uiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AppTopHeaderState(null, null, 0, 0L, 0L, 0, null, 127, null), null, 2, null);
        this.balanceFontSp = applicationContext.getResources().getDimension(R.dimen.font_size_default) / applicationContext.getResources().getDisplayMetrics().scaledDensity;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1262684713, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.balance.ToolbarHeaderComposeHost.1
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
                    ComposerKt.traceEventStart(1262684713, i, -1, "org.betup.ui.common.balance.ToolbarHeaderComposeHost.<anonymous> (ToolbarHeaderComposeHost.kt:33)");
                }
                AppTopHeaderKt.AppTopHeader(ToolbarHeaderComposeHost.this.getUiState(), ToolbarHeaderComposeHost.this.onProfileClick, ToolbarHeaderComposeHost.this.onBalanceClick, ToolbarHeaderComposeHost.this.onAddCoinsClick, ToolbarHeaderComposeHost.this.onStreakClick, null, ToolbarHeaderComposeHost.this.balanceFontSp, composer, 0, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public /* synthetic */ ToolbarHeaderComposeHost(ComposeView composeView, Context context, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(composeView, context, function0, function02, function03, (i & 32) != 0 ? null : function04);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AppTopHeaderState getUiState() {
        return (AppTopHeaderState) this.uiState.getValue();
    }

    private final void setUiState(AppTopHeaderState appTopHeaderState) {
        this.uiState.setValue(appTopHeaderState);
    }

    public final void updateUser(final String displayName, final String photoUrl, final int level, final Integer streakCount) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        applyStateUpdate(new Function0() { // from class: org.betup.ui.common.balance.ToolbarHeaderComposeHost$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit updateUser$lambda$0;
                updateUser$lambda$0 = ToolbarHeaderComposeHost.updateUser$lambda$0(ToolbarHeaderComposeHost.this, displayName, photoUrl, level, streakCount);
                return updateUser$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUser$lambda$0(ToolbarHeaderComposeHost toolbarHeaderComposeHost, String str, String str2, int i, Integer num) {
        AppTopHeaderState copy;
        copy = r0.copy((r20 & 1) != 0 ? r0.displayName : str, (r20 & 2) != 0 ? r0.photoUrl : str2, (r20 & 4) != 0 ? r0.level : i, (r20 & 8) != 0 ? r0.balance : 0L, (r20 & 16) != 0 ? r0.balanceAnimationPrevious : 0L, (r20 & 32) != 0 ? r0.balanceAnimationMode : 0, (r20 & 64) != 0 ? toolbarHeaderComposeHost.getUiState().streakCount : num);
        toolbarHeaderComposeHost.setUiState(copy);
        return Unit.INSTANCE;
    }

    public final void updateBalance(final long newBalance, final long animationPrevious, final int mode) {
        applyStateUpdate(new Function0() { // from class: org.betup.ui.common.balance.ToolbarHeaderComposeHost$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit updateBalance$lambda$1;
                updateBalance$lambda$1 = ToolbarHeaderComposeHost.updateBalance$lambda$1(ToolbarHeaderComposeHost.this, newBalance, animationPrevious, mode);
                return updateBalance$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBalance$lambda$1(ToolbarHeaderComposeHost toolbarHeaderComposeHost, long j, long j2, int i) {
        AppTopHeaderState copy;
        copy = r0.copy((r20 & 1) != 0 ? r0.displayName : null, (r20 & 2) != 0 ? r0.photoUrl : null, (r20 & 4) != 0 ? r0.level : 0, (r20 & 8) != 0 ? r0.balance : j, (r20 & 16) != 0 ? r0.balanceAnimationPrevious : j2, (r20 & 32) != 0 ? r0.balanceAnimationMode : i, (r20 & 64) != 0 ? toolbarHeaderComposeHost.getUiState().streakCount : null);
        toolbarHeaderComposeHost.setUiState(copy);
        return Unit.INSTANCE;
    }

    private final void applyStateUpdate(final Function0<Unit> block) {
        if (this.composeView.isAttachedToWindow()) {
            block.invoke();
        } else {
            this.composeView.post(new Runnable() { // from class: org.betup.ui.common.balance.ToolbarHeaderComposeHost$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }
    }
}
