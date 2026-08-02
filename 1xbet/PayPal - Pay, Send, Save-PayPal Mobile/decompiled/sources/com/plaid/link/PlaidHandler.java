package com.plaid.link;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/plaid/link/PlaidHandler;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "open", "(Landroid/app/Activity;)Z", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "", "submit", "(Lcom/plaid/link/SubmissionData;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PlaidHandler {
    public final boolean open(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return com.plaid.link.Plaid.INSTANCE.openLinkInternal$link_sdk_release(activity);
    }

    public final void submit(com.plaid.link.SubmissionData submissionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submissionData, "");
        com.plaid.link.Plaid.INSTANCE.submitInternal$link_sdk_release(submissionData);
    }

    public final boolean open(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        return com.plaid.link.Plaid.INSTANCE.openLinkInternal$link_sdk_release(fragment);
    }
}
