package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001aA\u0010\f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function1;)V", "commitNow", "now", "transaction", "(Landroidx/fragment/app/FragmentManager;ZZLkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentManagerKt {
    public static final void commit(androidx.fragment.app.FragmentManager fragmentManager, boolean z, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> function1) {
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(androidx.fragment.app.FragmentManager fragmentManager, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void commitNow(androidx.fragment.app.FragmentManager fragmentManager, boolean z, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> function1) {
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(androidx.fragment.app.FragmentManager fragmentManager, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    @kotlin.Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> function1) {
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        function1.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
