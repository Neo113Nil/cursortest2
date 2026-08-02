package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u00107\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001b\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0013HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0081\u0003\u0010F\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\t\u0010K\u001a\u00020\nHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR#\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 ¨\u0006L"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportCallbacks;", "", "onTabSelected", "Lkotlin/Function1;", "", "", "onRefreshFaq", "Lkotlin/Function0;", "onFeedbackTypeSelected", "onFeedbackEmailChanged", "", "onSendFeedback", "onResetFeedbackSuccess", "onRefreshTicketList", "onCreateTicket", "onTicketClick", "onRefreshTicketMessages", "onLoadMoreTicketMessages", "onSendTicketMessage", "Lkotlin/Function2;", "onCloseTicket", "onBackFromTicketDetail", "onRefreshMyData", "onMyDataEmailChanged", "onMyDataMessageChanged", "onDeleteAccount", "onCancelDeletionRequest", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnTabSelected", "()Lkotlin/jvm/functions/Function1;", "getOnRefreshFaq", "()Lkotlin/jvm/functions/Function0;", "getOnFeedbackTypeSelected", "getOnFeedbackEmailChanged", "getOnSendFeedback", "getOnResetFeedbackSuccess", "getOnRefreshTicketList", "getOnCreateTicket", "getOnTicketClick", "getOnRefreshTicketMessages", "getOnLoadMoreTicketMessages", "getOnSendTicketMessage", "()Lkotlin/jvm/functions/Function2;", "getOnCloseTicket", "getOnBackFromTicketDetail", "getOnRefreshMyData", "getOnMyDataEmailChanged", "getOnMyDataMessageChanged", "getOnDeleteAccount", "getOnCancelDeletionRequest", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportCallbacks {
    public static final int $stable = 0;
    private final Function0<Unit> onBackFromTicketDetail;
    private final Function0<Unit> onCancelDeletionRequest;
    private final Function1<String, Unit> onCloseTicket;
    private final Function0<Unit> onCreateTicket;
    private final Function0<Unit> onDeleteAccount;
    private final Function1<String, Unit> onFeedbackEmailChanged;
    private final Function1<Integer, Unit> onFeedbackTypeSelected;
    private final Function1<String, Unit> onLoadMoreTicketMessages;
    private final Function1<String, Unit> onMyDataEmailChanged;
    private final Function1<String, Unit> onMyDataMessageChanged;
    private final Function0<Unit> onRefreshFaq;
    private final Function0<Unit> onRefreshMyData;
    private final Function0<Unit> onRefreshTicketList;
    private final Function1<String, Unit> onRefreshTicketMessages;
    private final Function0<Unit> onResetFeedbackSuccess;
    private final Function1<String, Unit> onSendFeedback;
    private final Function2<String, String, Unit> onSendTicketMessage;
    private final Function1<Integer, Unit> onTabSelected;
    private final Function1<String, Unit> onTicketClick;

    public SupportCallbacks() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final Function1<Integer, Unit> component1() {
        return this.onTabSelected;
    }

    public final Function1<String, Unit> component10() {
        return this.onRefreshTicketMessages;
    }

    public final Function1<String, Unit> component11() {
        return this.onLoadMoreTicketMessages;
    }

    public final Function2<String, String, Unit> component12() {
        return this.onSendTicketMessage;
    }

    public final Function1<String, Unit> component13() {
        return this.onCloseTicket;
    }

    public final Function0<Unit> component14() {
        return this.onBackFromTicketDetail;
    }

    public final Function0<Unit> component15() {
        return this.onRefreshMyData;
    }

    public final Function1<String, Unit> component16() {
        return this.onMyDataEmailChanged;
    }

    public final Function1<String, Unit> component17() {
        return this.onMyDataMessageChanged;
    }

    public final Function0<Unit> component18() {
        return this.onDeleteAccount;
    }

    public final Function0<Unit> component19() {
        return this.onCancelDeletionRequest;
    }

    public final Function0<Unit> component2() {
        return this.onRefreshFaq;
    }

    public final Function1<Integer, Unit> component3() {
        return this.onFeedbackTypeSelected;
    }

    public final Function1<String, Unit> component4() {
        return this.onFeedbackEmailChanged;
    }

    public final Function1<String, Unit> component5() {
        return this.onSendFeedback;
    }

    public final Function0<Unit> component6() {
        return this.onResetFeedbackSuccess;
    }

    public final Function0<Unit> component7() {
        return this.onRefreshTicketList;
    }

    public final Function0<Unit> component8() {
        return this.onCreateTicket;
    }

    public final Function1<String, Unit> component9() {
        return this.onTicketClick;
    }

    public final SupportCallbacks copy(Function1<? super Integer, Unit> onTabSelected, Function0<Unit> onRefreshFaq, Function1<? super Integer, Unit> onFeedbackTypeSelected, Function1<? super String, Unit> onFeedbackEmailChanged, Function1<? super String, Unit> onSendFeedback, Function0<Unit> onResetFeedbackSuccess, Function0<Unit> onRefreshTicketList, Function0<Unit> onCreateTicket, Function1<? super String, Unit> onTicketClick, Function1<? super String, Unit> onRefreshTicketMessages, Function1<? super String, Unit> onLoadMoreTicketMessages, Function2<? super String, ? super String, Unit> onSendTicketMessage, Function1<? super String, Unit> onCloseTicket, Function0<Unit> onBackFromTicketDetail, Function0<Unit> onRefreshMyData, Function1<? super String, Unit> onMyDataEmailChanged, Function1<? super String, Unit> onMyDataMessageChanged, Function0<Unit> onDeleteAccount, Function0<Unit> onCancelDeletionRequest) {
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onRefreshFaq, "onRefreshFaq");
        Intrinsics.checkNotNullParameter(onFeedbackTypeSelected, "onFeedbackTypeSelected");
        Intrinsics.checkNotNullParameter(onFeedbackEmailChanged, "onFeedbackEmailChanged");
        Intrinsics.checkNotNullParameter(onSendFeedback, "onSendFeedback");
        Intrinsics.checkNotNullParameter(onResetFeedbackSuccess, "onResetFeedbackSuccess");
        Intrinsics.checkNotNullParameter(onRefreshTicketList, "onRefreshTicketList");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onTicketClick, "onTicketClick");
        Intrinsics.checkNotNullParameter(onRefreshTicketMessages, "onRefreshTicketMessages");
        Intrinsics.checkNotNullParameter(onLoadMoreTicketMessages, "onLoadMoreTicketMessages");
        Intrinsics.checkNotNullParameter(onSendTicketMessage, "onSendTicketMessage");
        Intrinsics.checkNotNullParameter(onCloseTicket, "onCloseTicket");
        Intrinsics.checkNotNullParameter(onBackFromTicketDetail, "onBackFromTicketDetail");
        Intrinsics.checkNotNullParameter(onRefreshMyData, "onRefreshMyData");
        Intrinsics.checkNotNullParameter(onMyDataEmailChanged, "onMyDataEmailChanged");
        Intrinsics.checkNotNullParameter(onMyDataMessageChanged, "onMyDataMessageChanged");
        Intrinsics.checkNotNullParameter(onDeleteAccount, "onDeleteAccount");
        Intrinsics.checkNotNullParameter(onCancelDeletionRequest, "onCancelDeletionRequest");
        return new SupportCallbacks(onTabSelected, onRefreshFaq, onFeedbackTypeSelected, onFeedbackEmailChanged, onSendFeedback, onResetFeedbackSuccess, onRefreshTicketList, onCreateTicket, onTicketClick, onRefreshTicketMessages, onLoadMoreTicketMessages, onSendTicketMessage, onCloseTicket, onBackFromTicketDetail, onRefreshMyData, onMyDataEmailChanged, onMyDataMessageChanged, onDeleteAccount, onCancelDeletionRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportCallbacks)) {
            return false;
        }
        SupportCallbacks supportCallbacks = (SupportCallbacks) other;
        return Intrinsics.areEqual(this.onTabSelected, supportCallbacks.onTabSelected) && Intrinsics.areEqual(this.onRefreshFaq, supportCallbacks.onRefreshFaq) && Intrinsics.areEqual(this.onFeedbackTypeSelected, supportCallbacks.onFeedbackTypeSelected) && Intrinsics.areEqual(this.onFeedbackEmailChanged, supportCallbacks.onFeedbackEmailChanged) && Intrinsics.areEqual(this.onSendFeedback, supportCallbacks.onSendFeedback) && Intrinsics.areEqual(this.onResetFeedbackSuccess, supportCallbacks.onResetFeedbackSuccess) && Intrinsics.areEqual(this.onRefreshTicketList, supportCallbacks.onRefreshTicketList) && Intrinsics.areEqual(this.onCreateTicket, supportCallbacks.onCreateTicket) && Intrinsics.areEqual(this.onTicketClick, supportCallbacks.onTicketClick) && Intrinsics.areEqual(this.onRefreshTicketMessages, supportCallbacks.onRefreshTicketMessages) && Intrinsics.areEqual(this.onLoadMoreTicketMessages, supportCallbacks.onLoadMoreTicketMessages) && Intrinsics.areEqual(this.onSendTicketMessage, supportCallbacks.onSendTicketMessage) && Intrinsics.areEqual(this.onCloseTicket, supportCallbacks.onCloseTicket) && Intrinsics.areEqual(this.onBackFromTicketDetail, supportCallbacks.onBackFromTicketDetail) && Intrinsics.areEqual(this.onRefreshMyData, supportCallbacks.onRefreshMyData) && Intrinsics.areEqual(this.onMyDataEmailChanged, supportCallbacks.onMyDataEmailChanged) && Intrinsics.areEqual(this.onMyDataMessageChanged, supportCallbacks.onMyDataMessageChanged) && Intrinsics.areEqual(this.onDeleteAccount, supportCallbacks.onDeleteAccount) && Intrinsics.areEqual(this.onCancelDeletionRequest, supportCallbacks.onCancelDeletionRequest);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.onTabSelected.hashCode() * 31) + this.onRefreshFaq.hashCode()) * 31) + this.onFeedbackTypeSelected.hashCode()) * 31) + this.onFeedbackEmailChanged.hashCode()) * 31) + this.onSendFeedback.hashCode()) * 31) + this.onResetFeedbackSuccess.hashCode()) * 31) + this.onRefreshTicketList.hashCode()) * 31) + this.onCreateTicket.hashCode()) * 31) + this.onTicketClick.hashCode()) * 31) + this.onRefreshTicketMessages.hashCode()) * 31) + this.onLoadMoreTicketMessages.hashCode()) * 31) + this.onSendTicketMessage.hashCode()) * 31) + this.onCloseTicket.hashCode()) * 31) + this.onBackFromTicketDetail.hashCode()) * 31) + this.onRefreshMyData.hashCode()) * 31) + this.onMyDataEmailChanged.hashCode()) * 31) + this.onMyDataMessageChanged.hashCode()) * 31) + this.onDeleteAccount.hashCode()) * 31) + this.onCancelDeletionRequest.hashCode();
    }

    public String toString() {
        return "SupportCallbacks(onTabSelected=" + this.onTabSelected + ", onRefreshFaq=" + this.onRefreshFaq + ", onFeedbackTypeSelected=" + this.onFeedbackTypeSelected + ", onFeedbackEmailChanged=" + this.onFeedbackEmailChanged + ", onSendFeedback=" + this.onSendFeedback + ", onResetFeedbackSuccess=" + this.onResetFeedbackSuccess + ", onRefreshTicketList=" + this.onRefreshTicketList + ", onCreateTicket=" + this.onCreateTicket + ", onTicketClick=" + this.onTicketClick + ", onRefreshTicketMessages=" + this.onRefreshTicketMessages + ", onLoadMoreTicketMessages=" + this.onLoadMoreTicketMessages + ", onSendTicketMessage=" + this.onSendTicketMessage + ", onCloseTicket=" + this.onCloseTicket + ", onBackFromTicketDetail=" + this.onBackFromTicketDetail + ", onRefreshMyData=" + this.onRefreshMyData + ", onMyDataEmailChanged=" + this.onMyDataEmailChanged + ", onMyDataMessageChanged=" + this.onMyDataMessageChanged + ", onDeleteAccount=" + this.onDeleteAccount + ", onCancelDeletionRequest=" + this.onCancelDeletionRequest + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportCallbacks(Function1<? super Integer, Unit> onTabSelected, Function0<Unit> onRefreshFaq, Function1<? super Integer, Unit> onFeedbackTypeSelected, Function1<? super String, Unit> onFeedbackEmailChanged, Function1<? super String, Unit> onSendFeedback, Function0<Unit> onResetFeedbackSuccess, Function0<Unit> onRefreshTicketList, Function0<Unit> onCreateTicket, Function1<? super String, Unit> onTicketClick, Function1<? super String, Unit> onRefreshTicketMessages, Function1<? super String, Unit> onLoadMoreTicketMessages, Function2<? super String, ? super String, Unit> onSendTicketMessage, Function1<? super String, Unit> onCloseTicket, Function0<Unit> onBackFromTicketDetail, Function0<Unit> onRefreshMyData, Function1<? super String, Unit> onMyDataEmailChanged, Function1<? super String, Unit> onMyDataMessageChanged, Function0<Unit> onDeleteAccount, Function0<Unit> onCancelDeletionRequest) {
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onRefreshFaq, "onRefreshFaq");
        Intrinsics.checkNotNullParameter(onFeedbackTypeSelected, "onFeedbackTypeSelected");
        Intrinsics.checkNotNullParameter(onFeedbackEmailChanged, "onFeedbackEmailChanged");
        Intrinsics.checkNotNullParameter(onSendFeedback, "onSendFeedback");
        Intrinsics.checkNotNullParameter(onResetFeedbackSuccess, "onResetFeedbackSuccess");
        Intrinsics.checkNotNullParameter(onRefreshTicketList, "onRefreshTicketList");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onTicketClick, "onTicketClick");
        Intrinsics.checkNotNullParameter(onRefreshTicketMessages, "onRefreshTicketMessages");
        Intrinsics.checkNotNullParameter(onLoadMoreTicketMessages, "onLoadMoreTicketMessages");
        Intrinsics.checkNotNullParameter(onSendTicketMessage, "onSendTicketMessage");
        Intrinsics.checkNotNullParameter(onCloseTicket, "onCloseTicket");
        Intrinsics.checkNotNullParameter(onBackFromTicketDetail, "onBackFromTicketDetail");
        Intrinsics.checkNotNullParameter(onRefreshMyData, "onRefreshMyData");
        Intrinsics.checkNotNullParameter(onMyDataEmailChanged, "onMyDataEmailChanged");
        Intrinsics.checkNotNullParameter(onMyDataMessageChanged, "onMyDataMessageChanged");
        Intrinsics.checkNotNullParameter(onDeleteAccount, "onDeleteAccount");
        Intrinsics.checkNotNullParameter(onCancelDeletionRequest, "onCancelDeletionRequest");
        this.onTabSelected = onTabSelected;
        this.onRefreshFaq = onRefreshFaq;
        this.onFeedbackTypeSelected = onFeedbackTypeSelected;
        this.onFeedbackEmailChanged = onFeedbackEmailChanged;
        this.onSendFeedback = onSendFeedback;
        this.onResetFeedbackSuccess = onResetFeedbackSuccess;
        this.onRefreshTicketList = onRefreshTicketList;
        this.onCreateTicket = onCreateTicket;
        this.onTicketClick = onTicketClick;
        this.onRefreshTicketMessages = onRefreshTicketMessages;
        this.onLoadMoreTicketMessages = onLoadMoreTicketMessages;
        this.onSendTicketMessage = onSendTicketMessage;
        this.onCloseTicket = onCloseTicket;
        this.onBackFromTicketDetail = onBackFromTicketDetail;
        this.onRefreshMyData = onRefreshMyData;
        this.onMyDataEmailChanged = onMyDataEmailChanged;
        this.onMyDataMessageChanged = onMyDataMessageChanged;
        this.onDeleteAccount = onDeleteAccount;
        this.onCancelDeletionRequest = onCancelDeletionRequest;
    }

    public /* synthetic */ SupportCallbacks(Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function1 function14, Function0 function02, Function0 function03, Function0 function04, Function1 function15, Function1 function16, Function1 function17, Function2 function2, Function1 function18, Function0 function05, Function0 function06, Function1 function19, Function1 function110, Function0 function07, Function0 function08, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = SupportCallbacks._init_$lambda$0(((Integer) obj).intValue());
                return _init_$lambda$0;
            }
        } : function1, (i & 2) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 4) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$2;
                _init_$lambda$2 = SupportCallbacks._init_$lambda$2(((Integer) obj).intValue());
                return _init_$lambda$2;
            }
        } : function12, (i & 8) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$3;
                _init_$lambda$3 = SupportCallbacks._init_$lambda$3((String) obj);
                return _init_$lambda$3;
            }
        } : function13, (i & 16) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$4;
                _init_$lambda$4 = SupportCallbacks._init_$lambda$4((String) obj);
                return _init_$lambda$4;
            }
        } : function14, (i & 32) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 64) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03, (i & 128) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function04, (i & 256) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$8;
                _init_$lambda$8 = SupportCallbacks._init_$lambda$8((String) obj);
                return _init_$lambda$8;
            }
        } : function15, (i & 512) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$9;
                _init_$lambda$9 = SupportCallbacks._init_$lambda$9((String) obj);
                return _init_$lambda$9;
            }
        } : function16, (i & 1024) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$10;
                _init_$lambda$10 = SupportCallbacks._init_$lambda$10((String) obj);
                return _init_$lambda$10;
            }
        } : function17, (i & 2048) != 0 ? new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit _init_$lambda$11;
                _init_$lambda$11 = SupportCallbacks._init_$lambda$11((String) obj, (String) obj2);
                return _init_$lambda$11;
            }
        } : function2, (i & 4096) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$12;
                _init_$lambda$12 = SupportCallbacks._init_$lambda$12((String) obj);
                return _init_$lambda$12;
            }
        } : function18, (i & 8192) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function05, (i & 16384) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function06, (i & 32768) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$15;
                _init_$lambda$15 = SupportCallbacks._init_$lambda$15((String) obj);
                return _init_$lambda$15;
            }
        } : function19, (i & 65536) != 0 ? new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$16;
                _init_$lambda$16 = SupportCallbacks._init_$lambda$16((String) obj);
                return _init_$lambda$16;
            }
        } : function110, (i & 131072) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function07, (i & 262144) != 0 ? new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportCallbacks$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(int i) {
        return Unit.INSTANCE;
    }

    public final Function1<Integer, Unit> getOnTabSelected() {
        return this.onTabSelected;
    }

    public final Function0<Unit> getOnRefreshFaq() {
        return this.onRefreshFaq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(int i) {
        return Unit.INSTANCE;
    }

    public final Function1<Integer, Unit> getOnFeedbackTypeSelected() {
        return this.onFeedbackTypeSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnFeedbackEmailChanged() {
        return this.onFeedbackEmailChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnSendFeedback() {
        return this.onSendFeedback;
    }

    public final Function0<Unit> getOnResetFeedbackSuccess() {
        return this.onResetFeedbackSuccess;
    }

    public final Function0<Unit> getOnRefreshTicketList() {
        return this.onRefreshTicketList;
    }

    public final Function0<Unit> getOnCreateTicket() {
        return this.onCreateTicket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnTicketClick() {
        return this.onTicketClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnRefreshTicketMessages() {
        return this.onRefreshTicketMessages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$10(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnLoadMoreTicketMessages() {
        return this.onLoadMoreTicketMessages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$11(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    public final Function2<String, String, Unit> getOnSendTicketMessage() {
        return this.onSendTicketMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$12(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnCloseTicket() {
        return this.onCloseTicket;
    }

    public final Function0<Unit> getOnBackFromTicketDetail() {
        return this.onBackFromTicketDetail;
    }

    public final Function0<Unit> getOnRefreshMyData() {
        return this.onRefreshMyData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$15(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnMyDataEmailChanged() {
        return this.onMyDataEmailChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$16(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnMyDataMessageChanged() {
        return this.onMyDataMessageChanged;
    }

    public final Function0<Unit> getOnDeleteAccount() {
        return this.onDeleteAccount;
    }

    public final Function0<Unit> getOnCancelDeletionRequest() {
        return this.onCancelDeletionRequest;
    }
}
