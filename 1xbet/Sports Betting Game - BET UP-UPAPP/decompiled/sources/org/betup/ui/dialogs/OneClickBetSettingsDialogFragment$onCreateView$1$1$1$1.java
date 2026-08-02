package org.betup.ui.dialogs;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;
import org.betup.model.remote.entity.user.OneClickBetSettingsModel;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1", f = "OneClickBetSettingsDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<OneClickBetSettingsModel> $serverSettings$delegate;
    final /* synthetic */ MutableState<Boolean> $settingsLoaded$delegate;
    int label;
    final /* synthetic */ OneClickBetSettingsDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1(OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, MutableState<Boolean> mutableState, MutableState<OneClickBetSettingsModel> mutableState2, Continuation<? super OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oneClickBetSettingsDialogFragment;
        this.$settingsLoaded$delegate = mutableState;
        this.$serverSettings$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1(this.this$0, this.$settingsLoaded$delegate, this.$serverSettings$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        V7OneClickBetSettingsInteractor v7OneClickBetSettingsInteractor = this.this$0.getV7OneClickBetSettingsInteractor();
        final MutableState<Boolean> mutableState = this.$settingsLoaded$delegate;
        final MutableState<OneClickBetSettingsModel> mutableState2 = this.$serverSettings$delegate;
        v7OneClickBetSettingsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<OneClickBetSettingsModel, Void>() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1.1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<OneClickBetSettingsModel, Void> responseMessage) {
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$5(mutableState, true);
                if (responseMessage.getStat() != FetchStat.SUCCESS || responseMessage.getModel() == null) {
                    return;
                }
                mutableState2.setValue(responseMessage.getModel());
            }
        }, null);
        return Unit.INSTANCE;
    }
}
