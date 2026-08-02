package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012"}, d2 = {"Lcom/plaid/link/result/LinkResultHandler;", "", "Lkotlin/Function1;", "Lcom/plaid/link/result/LinkSuccess;", "", "onSuccess", "Lcom/plaid/link/result/LinkExit;", "onExit", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onActivityResult", "(IILandroid/content/Intent;)Z", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class LinkResultHandler {
    private final kotlin.jvm.functions.Function1<com.plaid.link.result.LinkExit, kotlin.Unit> onExit;
    private final kotlin.jvm.functions.Function1<com.plaid.link.result.LinkSuccess, kotlin.Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkResultHandler(kotlin.jvm.functions.Function1<? super com.plaid.link.result.LinkSuccess, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.plaid.link.result.LinkExit, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.onSuccess = function1;
        this.onExit = function12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        if (requestCode != 3364) {
            return false;
        }
        com.plaid.link.result.LinkResult parseResult = new com.plaid.link.OpenPlaidLink().parseResult(resultCode, data);
        if (parseResult instanceof com.plaid.link.result.LinkSuccess) {
            this.onSuccess.invoke(parseResult);
            return true;
        }
        if (!(parseResult instanceof com.plaid.link.result.LinkExit)) {
            return true;
        }
        this.onExit.invoke(parseResult);
        return true;
    }
}
