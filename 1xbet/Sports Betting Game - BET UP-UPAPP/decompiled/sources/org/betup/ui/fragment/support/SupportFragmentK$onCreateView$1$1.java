package org.betup.ui.fragment.support;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.ui.fragment.support.compose.SupportCallbacks;
import org.betup.ui.fragment.support.compose.SupportScreenKt;
import org.betup.ui.fragment.support.compose.SupportUiState;

/* compiled from: SupportFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SupportFragmentK this$0;

    SupportFragmentK$onCreateView$1$1(SupportFragmentK supportFragmentK) {
        this.this$0 = supportFragmentK;
    }

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
            ComposerKt.traceEventStart(-2022078659, i, -1, "org.betup.ui.fragment.support.SupportFragmentK.onCreateView.<anonymous>.<anonymous> (SupportFragmentK.kt:55)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getUiState(), null, composer, 0, 1);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context context = (Context) consume;
        Integer valueOf = Integer.valueOf(invoke$lambda$0(collectAsState).getSelectedTabIndex());
        String chatId = invoke$lambda$0(collectAsState).getTicketDetailState().getChatId();
        Long valueOf2 = Long.valueOf(invoke$lambda$0(collectAsState).getTicketDetailState().getOpenRequestId());
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(collectAsState) | composer.changedInstance(this.this$0) | composer.changedInstance(context);
        SupportFragmentK supportFragmentK = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function2) new SupportFragmentK$onCreateView$1$1$1$1(supportFragmentK, collectAsState, context, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, chatId, valueOf2, (Function2) rememberedValue, composer, 0);
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(context);
        SupportFragmentK supportFragmentK2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new SupportFragmentK$onCreateView$1$1$2$1(supportFragmentK2, context, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 6);
        SupportUiState invoke$lambda$0 = invoke$lambda$0(collectAsState);
        Object controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(controller);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (KFunction) new SupportFragmentK$onCreateView$1$1$3$1(controller);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) rememberedValue3);
        Object controller2 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(controller2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (KFunction) new SupportFragmentK$onCreateView$1$1$4$1(controller2);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        Function0 function0 = (Function0) ((KFunction) rememberedValue4);
        Object controller3 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(controller3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = (KFunction) new SupportFragmentK$onCreateView$1$1$5$1(controller3);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        Function1 function12 = (Function1) ((KFunction) rememberedValue5);
        Object controller4 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(controller4);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = (KFunction) new SupportFragmentK$onCreateView$1$1$6$1(controller4);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        Function1 function13 = (Function1) ((KFunction) rememberedValue6);
        Object controller5 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(controller5);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = (KFunction) new SupportFragmentK$onCreateView$1$1$7$1(controller5);
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceGroup();
        Function1 function14 = (Function1) ((KFunction) rememberedValue7);
        Object controller6 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(controller6);
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = (KFunction) new SupportFragmentK$onCreateView$1$1$8$1(controller6);
            composer.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceGroup();
        Function0 function02 = (Function0) ((KFunction) rememberedValue8);
        Object controller7 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance8 = composer.changedInstance(controller7);
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = (KFunction) new SupportFragmentK$onCreateView$1$1$9$1(controller7);
            composer.updateRememberedValue(rememberedValue9);
        }
        composer.endReplaceGroup();
        Function0 function03 = (Function0) ((KFunction) rememberedValue9);
        Object controller8 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance9 = composer.changedInstance(controller8);
        Object rememberedValue10 = composer.rememberedValue();
        if (changedInstance9 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = (KFunction) new SupportFragmentK$onCreateView$1$1$10$1(controller8);
            composer.updateRememberedValue(rememberedValue10);
        }
        composer.endReplaceGroup();
        Function0 function04 = (Function0) ((KFunction) rememberedValue10);
        composer.startReplaceGroup(5004770);
        boolean changedInstance10 = composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK3 = this.this$0;
        Object rememberedValue11 = composer.rememberedValue();
        if (changedInstance10 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$12$lambda$11;
                    invoke$lambda$12$lambda$11 = SupportFragmentK$onCreateView$1$1.invoke$lambda$12$lambda$11(SupportFragmentK.this, (String) obj);
                    return invoke$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue11);
        }
        Function1 function15 = (Function1) rememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance11 = composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK4 = this.this$0;
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance11 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$13;
                    invoke$lambda$14$lambda$13 = SupportFragmentK$onCreateView$1$1.invoke$lambda$14$lambda$13(SupportFragmentK.this, (String) obj);
                    return invoke$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue12);
        }
        Function1 function16 = (Function1) rememberedValue12;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance12 = composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK5 = this.this$0;
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance12 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$16$lambda$15;
                    invoke$lambda$16$lambda$15 = SupportFragmentK$onCreateView$1$1.invoke$lambda$16$lambda$15(SupportFragmentK.this, (String) obj);
                    return invoke$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue13);
        }
        Function1 function17 = (Function1) rememberedValue13;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance13 = composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK6 = this.this$0;
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance13 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
            rememberedValue14 = new Function2() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$18$lambda$17;
                    invoke$lambda$18$lambda$17 = SupportFragmentK$onCreateView$1$1.invoke$lambda$18$lambda$17(SupportFragmentK.this, (String) obj, (String) obj2);
                    return invoke$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue14);
        }
        Function2 function2 = (Function2) rememberedValue14;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance14 = composer.changedInstance(context) | composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK7 = this.this$0;
        Object rememberedValue15 = composer.rememberedValue();
        if (changedInstance14 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
            rememberedValue15 = new Function1() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$22$lambda$21;
                    invoke$lambda$22$lambda$21 = SupportFragmentK$onCreateView$1$1.invoke$lambda$22$lambda$21(context, supportFragmentK7, (String) obj);
                    return invoke$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue15);
        }
        Function1 function18 = (Function1) rememberedValue15;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance15 = composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK8 = this.this$0;
        Object rememberedValue16 = composer.rememberedValue();
        if (changedInstance15 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
            rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$24$lambda$23;
                    invoke$lambda$24$lambda$23 = SupportFragmentK$onCreateView$1$1.invoke$lambda$24$lambda$23(SupportFragmentK.this);
                    return invoke$lambda$24$lambda$23;
                }
            };
            composer.updateRememberedValue(rememberedValue16);
        }
        Function0 function05 = (Function0) rememberedValue16;
        composer.endReplaceGroup();
        Object controller9 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance16 = composer.changedInstance(controller9);
        Object rememberedValue17 = composer.rememberedValue();
        if (changedInstance16 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
            rememberedValue17 = (KFunction) new SupportFragmentK$onCreateView$1$1$17$1(controller9);
            composer.updateRememberedValue(rememberedValue17);
        }
        composer.endReplaceGroup();
        Function0 function06 = (Function0) ((KFunction) rememberedValue17);
        Object controller10 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance17 = composer.changedInstance(controller10);
        Object rememberedValue18 = composer.rememberedValue();
        if (changedInstance17 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
            rememberedValue18 = (KFunction) new SupportFragmentK$onCreateView$1$1$18$1(controller10);
            composer.updateRememberedValue(rememberedValue18);
        }
        composer.endReplaceGroup();
        Function1 function19 = (Function1) ((KFunction) rememberedValue18);
        Object controller11 = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance18 = composer.changedInstance(controller11);
        Object rememberedValue19 = composer.rememberedValue();
        if (changedInstance18 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
            rememberedValue19 = (KFunction) new SupportFragmentK$onCreateView$1$1$19$1(controller11);
            composer.updateRememberedValue(rememberedValue19);
        }
        composer.endReplaceGroup();
        Function1 function110 = (Function1) ((KFunction) rememberedValue19);
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance19 = composer.changedInstance(context) | composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK9 = this.this$0;
        Object rememberedValue20 = composer.rememberedValue();
        if (changedInstance19 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
            rememberedValue20 = new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$31$lambda$30;
                    invoke$lambda$31$lambda$30 = SupportFragmentK$onCreateView$1$1.invoke$lambda$31$lambda$30(context, supportFragmentK9);
                    return invoke$lambda$31$lambda$30;
                }
            };
            composer.updateRememberedValue(rememberedValue20);
        }
        Function0 function07 = (Function0) rememberedValue20;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance20 = composer.changedInstance(context) | composer.changedInstance(this.this$0);
        final SupportFragmentK supportFragmentK10 = this.this$0;
        Object rememberedValue21 = composer.rememberedValue();
        if (changedInstance20 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
            rememberedValue21 = new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$35$lambda$34;
                    invoke$lambda$35$lambda$34 = SupportFragmentK$onCreateView$1$1.invoke$lambda$35$lambda$34(context, supportFragmentK10);
                    return invoke$lambda$35$lambda$34;
                }
            };
            composer.updateRememberedValue(rememberedValue21);
        }
        composer.endReplaceGroup();
        SupportScreenKt.SupportScreen(invoke$lambda$0, new SupportCallbacks(function1, function0, function12, function13, function14, function02, function03, function04, function15, function16, function17, function2, function18, function05, function06, function19, function110, function07, (Function0) rememberedValue21), null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(SupportFragmentK supportFragmentK, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        supportFragmentK.getController().openTicket(chatId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(SupportFragmentK supportFragmentK, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        supportFragmentK.getController().refreshTicketMessages(chatId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(SupportFragmentK supportFragmentK, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        supportFragmentK.getController().loadMoreTicketMessages(chatId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(SupportFragmentK supportFragmentK, String chatId, String message) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(message, "message");
        supportFragmentK.getController().sendTicketMessage(chatId, message);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21(Context context, final SupportFragmentK supportFragmentK, final String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.close_ticket_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$22$lambda$21$lambda$19;
                invoke$lambda$22$lambda$21$lambda$19 = SupportFragmentK$onCreateView$1$1.invoke$lambda$22$lambda$21$lambda$19(SupportFragmentK.this, chatId);
                return invoke$lambda$22$lambda$21$lambda$19;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda4
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
    public static final Unit invoke$lambda$22$lambda$21$lambda$19(SupportFragmentK supportFragmentK, String str) {
        supportFragmentK.getController().closeTicket(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().openTicket("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$31$lambda$30(Context context, final SupportFragmentK supportFragmentK) {
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.sure_delete_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$31$lambda$30$lambda$28;
                invoke$lambda$31$lambda$30$lambda$28 = SupportFragmentK$onCreateView$1$1.invoke$lambda$31$lambda$30$lambda$28(SupportFragmentK.this);
                return invoke$lambda$31$lambda$30$lambda$28;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda5
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
    public static final Unit invoke$lambda$31$lambda$30$lambda$28(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().deleteAccount();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$35$lambda$34(Context context, final SupportFragmentK supportFragmentK) {
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = context.getString(R.string.cancel_request);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.newInstance("", string, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$35$lambda$34$lambda$32;
                invoke$lambda$35$lambda$34$lambda$32 = SupportFragmentK$onCreateView$1$1.invoke$lambda$35$lambda$34$lambda$32(SupportFragmentK.this);
                return invoke$lambda$35$lambda$34$lambda$32;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.support.SupportFragmentK$onCreateView$1$1$$ExternalSyntheticLambda7
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
    public static final Unit invoke$lambda$35$lambda$34$lambda$32(SupportFragmentK supportFragmentK) {
        supportFragmentK.getController().cancelDeletionRequest();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportUiState invoke$lambda$0(State<SupportUiState> state) {
        return state.getValue();
    }
}
