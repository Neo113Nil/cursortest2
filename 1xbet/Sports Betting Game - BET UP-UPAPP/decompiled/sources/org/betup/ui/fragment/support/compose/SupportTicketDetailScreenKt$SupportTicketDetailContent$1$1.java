package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportTicketDetailScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1", f = "SupportTicketDetailScreen.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ Function1<String, Unit> $onRefresh;
    final /* synthetic */ SupportTicketDetailState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1(SupportTicketDetailState supportTicketDetailState, Function1<? super String, Unit> function1, String str, Continuation<? super SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1> continuation) {
        super(2, continuation);
        this.$state = supportTicketDetailState;
        this.$onRefresh = function1;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1(this.$state, this.$onRefresh, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L28
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.label = r2
            r3 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L28
            return r0
        L28:
            org.betup.ui.fragment.support.compose.SupportTicketDetailState r6 = r5.$state
            boolean r6 = r6.isLoading()
            if (r6 != 0) goto L1a
            org.betup.ui.fragment.support.compose.SupportTicketDetailState r6 = r5.$state
            boolean r6 = r6.isSending()
            if (r6 != 0) goto L1a
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r6 = r5.$onRefresh
            java.lang.String r1 = r5.$chatId
            r6.invoke(r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
