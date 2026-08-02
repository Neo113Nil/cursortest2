package org.betup.ui.fragment.matches.details.compose;

import android.content.Context;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.matches.details.TeamDetailsController;
import org.betup.utils.SnackbarHelper;

/* compiled from: TeamDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.TeamDetailsScreenKt$TeamDetailsScreen$1$1", f = "TeamDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TeamDetailsScreenKt$TeamDetailsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TeamDetailsController $controller;
    final /* synthetic */ State<String> $favoriteError$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TeamDetailsScreenKt$TeamDetailsScreen$1$1(State<String> state, Context context, TeamDetailsController teamDetailsController, Continuation<? super TeamDetailsScreenKt$TeamDetailsScreen$1$1> continuation) {
        super(2, continuation);
        this.$favoriteError$delegate = state;
        this.$context = context;
        this.$controller = teamDetailsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeamDetailsScreenKt$TeamDetailsScreen$1$1(this.$favoriteError$delegate, this.$context, this.$controller, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeamDetailsScreenKt$TeamDetailsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String TeamDetailsScreen$lambda$5;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TeamDetailsScreen$lambda$5 = TeamDetailsScreenKt.TeamDetailsScreen$lambda$5(this.$favoriteError$delegate);
            if (TeamDetailsScreen$lambda$5 != null) {
                Context context = this.$context;
                TeamDetailsController teamDetailsController = this.$controller;
                SnackbarHelper.showShort(context, TeamDetailsScreen$lambda$5);
                teamDetailsController.clearFavoriteError();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
