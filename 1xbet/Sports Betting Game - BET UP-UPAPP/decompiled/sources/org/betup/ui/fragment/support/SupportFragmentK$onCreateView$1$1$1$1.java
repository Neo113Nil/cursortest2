package org.betup.ui.fragment.support;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.State;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.ui.dialogs.SupportTicketDetailDialogFragment;
import org.betup.ui.fragment.support.compose.SupportCallbacks;
import org.betup.ui.fragment.support.compose.SupportUiState;
import org.betup.ui.fragment.support.controller.SupportController;

/* compiled from: SupportFragmentK.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1", f = "SupportFragmentK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SupportFragmentK$onCreateView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<SupportUiState> $uiState$delegate;
    int label;
    final /* synthetic */ SupportFragmentK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportFragmentK$onCreateView$1$1$1$1(SupportFragmentK supportFragmentK, State<SupportUiState> state, Context context, Continuation<? super SupportFragmentK$onCreateView$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = supportFragmentK;
        this.$uiState$delegate = state;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportFragmentK$onCreateView$1$1$1$1(this.this$0, this.$uiState$delegate, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportFragmentK$onCreateView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SupportUiState invoke$lambda$0;
        boolean z;
        SupportTicketDetailDialogFragment supportTicketDetailDialogFragment;
        Dialog dialog;
        SupportUiState invoke$lambda$02;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        invoke$lambda$0 = SupportFragmentK$onCreateView$1$1.invoke$lambda$0(this.$uiState$delegate);
        boolean z2 = false;
        if (invoke$lambda$0.getSelectedTabIndex() == 1) {
            invoke$lambda$02 = SupportFragmentK$onCreateView$1$1.invoke$lambda$0(this.$uiState$delegate);
            if (invoke$lambda$02.getTicketDetailState().getChatId() != null) {
                z = true;
                Fragment findFragmentByTag = this.this$0.getChildFragmentManager().findFragmentByTag("support_ticket_detail_dialog");
                supportTicketDetailDialogFragment = !(findFragmentByTag instanceof SupportTicketDetailDialogFragment) ? (SupportTicketDetailDialogFragment) findFragmentByTag : null;
                if (supportTicketDetailDialogFragment != null && (dialog = supportTicketDetailDialogFragment.getDialog()) != null && dialog.isShowing()) {
                    z2 = true;
                }
                if (z || z2) {
                    if (!z && z2 && supportTicketDetailDialogFragment != null) {
                        supportTicketDetailDialogFragment.dismissAllowingStateLoss();
                    }
                } else {
                    if (this.this$0.getChildFragmentManager().isStateSaved()) {
                        return Unit.INSTANCE;
                    }
                    if (supportTicketDetailDialogFragment != null) {
                        this.this$0.getChildFragmentManager().beginTransaction().remove(supportTicketDetailDialogFragment).commitNowAllowingStateLoss();
                    }
                    SupportTicketDetailDialogFragment.Companion companion = SupportTicketDetailDialogFragment.INSTANCE;
                    SupportController controller = this.this$0.getController();
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$1 supportFragmentK$onCreateView$1$1$1$1$dialog$1 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$1(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$2 supportFragmentK$onCreateView$1$1$1$1$dialog$2 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$2(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$3 supportFragmentK$onCreateView$1$1$1$1$dialog$3 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$3(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$4 supportFragmentK$onCreateView$1$1$1$1$dialog$4 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$4(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$5 supportFragmentK$onCreateView$1$1$1$1$dialog$5 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$5(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$6 supportFragmentK$onCreateView$1$1$1$1$dialog$6 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$6(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$7 supportFragmentK$onCreateView$1$1$1$1$dialog$7 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$7(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$8 supportFragmentK$onCreateView$1$1$1$1$dialog$8 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$8(this.this$0.getController());
                    final SupportFragmentK supportFragmentK = this.this$0;
                    Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$1;
                            invokeSuspend$lambda$1 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$1(SupportFragmentK.this, (String) obj2);
                            return invokeSuspend$lambda$1;
                        }
                    };
                    final SupportFragmentK supportFragmentK2 = this.this$0;
                    Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$2;
                            invokeSuspend$lambda$2 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$2(SupportFragmentK.this, (String) obj2);
                            return invokeSuspend$lambda$2;
                        }
                    };
                    final SupportFragmentK supportFragmentK3 = this.this$0;
                    Function1 function13 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$3;
                            invokeSuspend$lambda$3 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$3(SupportFragmentK.this, (String) obj2);
                            return invokeSuspend$lambda$3;
                        }
                    };
                    final SupportFragmentK supportFragmentK4 = this.this$0;
                    Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit invokeSuspend$lambda$4;
                            invokeSuspend$lambda$4 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$4(SupportFragmentK.this, (String) obj2, (String) obj3);
                            return invokeSuspend$lambda$4;
                        }
                    };
                    final Context context = this.$context;
                    final SupportFragmentK supportFragmentK5 = this.this$0;
                    Function1 function14 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$7;
                            invokeSuspend$lambda$7 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$7(context, supportFragmentK5, (String) obj2);
                            return invokeSuspend$lambda$7;
                        }
                    };
                    final SupportFragmentK supportFragmentK6 = this.this$0;
                    Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invokeSuspend$lambda$8;
                            invokeSuspend$lambda$8 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$8(SupportFragmentK.this);
                            return invokeSuspend$lambda$8;
                        }
                    };
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$15 supportFragmentK$onCreateView$1$1$1$1$dialog$15 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$15(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$16 supportFragmentK$onCreateView$1$1$1$1$dialog$16 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$16(this.this$0.getController());
                    SupportFragmentK$onCreateView$1$1$1$1$dialog$17 supportFragmentK$onCreateView$1$1$1$1$dialog$17 = new SupportFragmentK$onCreateView$1$1$1$1$dialog$17(this.this$0.getController());
                    final Context context2 = this.$context;
                    final SupportFragmentK supportFragmentK7 = this.this$0;
                    Function0 function02 = new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invokeSuspend$lambda$11;
                            invokeSuspend$lambda$11 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$11(context2, supportFragmentK7);
                            return invokeSuspend$lambda$11;
                        }
                    };
                    final Context context3 = this.$context;
                    final SupportFragmentK supportFragmentK8 = this.this$0;
                    SupportTicketDetailDialogFragment newInstance = companion.newInstance(controller, new SupportCallbacks(supportFragmentK$onCreateView$1$1$1$1$dialog$1, supportFragmentK$onCreateView$1$1$1$1$dialog$2, supportFragmentK$onCreateView$1$1$1$1$dialog$3, supportFragmentK$onCreateView$1$1$1$1$dialog$4, supportFragmentK$onCreateView$1$1$1$1$dialog$5, supportFragmentK$onCreateView$1$1$1$1$dialog$6, supportFragmentK$onCreateView$1$1$1$1$dialog$7, supportFragmentK$onCreateView$1$1$1$1$dialog$8, function1, function12, function13, function2, function14, function0, supportFragmentK$onCreateView$1$1$1$1$dialog$15, supportFragmentK$onCreateView$1$1$1$1$dialog$16, supportFragmentK$onCreateView$1$1$1$1$dialog$17, function02, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invokeSuspend$lambda$14;
                            invokeSuspend$lambda$14 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$14(context3, supportFragmentK8);
                            return invokeSuspend$lambda$14;
                        }
                    }));
                    final SupportFragmentK supportFragmentK9 = this.this$0;
                    newInstance.setOnDismissed(new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invokeSuspend$lambda$15;
                            invokeSuspend$lambda$15 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$15(SupportFragmentK.this);
                            return invokeSuspend$lambda$15;
                        }
                    });
                    newInstance.show(this.this$0.getChildFragmentManager(), "support_ticket_detail_dialog");
                }
                return Unit.INSTANCE;
            }
        }
        z = false;
        Fragment findFragmentByTag2 = this.this$0.getChildFragmentManager().findFragmentByTag("support_ticket_detail_dialog");
        if (!(findFragmentByTag2 instanceof SupportTicketDetailDialogFragment)) {
        }
        if (supportTicketDetailDialogFragment != null) {
            z2 = true;
        }
        if (z) {
        }
        if (!z) {
            supportTicketDetailDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(SupportFragmentK supportFragmentK, String str) {
        supportFragmentK.getController().openTicket(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(SupportFragmentK supportFragmentK, String str) {
        supportFragmentK.getController().refreshTicketMessages(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(SupportFragmentK supportFragmentK, String str) {
        supportFragmentK.getController().loadMoreTicketMessages(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(SupportFragmentK supportFragmentK, String str, String str2) {
        supportFragmentK.getController().sendTicketMessage(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$7(Context context, final SupportFragmentK supportFragmentK, final String str) {
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.close_ticket_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokeSuspend$lambda$7$lambda$5;
                invokeSuspend$lambda$7$lambda$5 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$7$lambda$5(SupportFragmentK.this, str);
                return invokeSuspend$lambda$7$lambda$5;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }).show(supportFragmentK.getChildFragmentManager(), "close_ticket_confirmation");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$7$lambda$5(SupportFragmentK supportFragmentK, String str) {
        supportFragmentK.getController().closeTicket(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().openTicket("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$11(Context context, final SupportFragmentK supportFragmentK) {
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.sure_delete_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokeSuspend$lambda$11$lambda$9;
                invokeSuspend$lambda$11$lambda$9 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$11$lambda$9(SupportFragmentK.this);
                return invokeSuspend$lambda$11$lambda$9;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }).show(supportFragmentK.getChildFragmentManager(), "delete_account_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$11$lambda$9(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().deleteAccount();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$14(Context context, final SupportFragmentK supportFragmentK) {
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.cancel_request);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokeSuspend$lambda$14$lambda$12;
                invokeSuspend$lambda$14$lambda$12 = SupportFragmentK$onCreateView$1$1$1$1.invokeSuspend$lambda$14$lambda$12(SupportFragmentK.this);
                return invokeSuspend$lambda$14$lambda$12;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }).show(supportFragmentK.getChildFragmentManager(), "cancel_deletion_request_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$14$lambda$12(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().cancelDeletionRequest();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$15(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().openTicket("");
        return Unit.INSTANCE;
    }
}
