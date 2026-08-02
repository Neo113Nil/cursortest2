package org.betup.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FragmentSafeOps.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/utils/FragmentSafeOps;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "mainHandler", "Landroid/os/Handler;", "runAfterFragmentTransactions", "", "host", "Landroidx/fragment/app/FragmentActivity;", "action", "Lkotlin/Function0;", "", "executePendingTransactionsSafely", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FragmentSafeOps {
    private static final String TAG = "FragmentSafeOps";
    public static final FragmentSafeOps INSTANCE = new FragmentSafeOps();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    private FragmentSafeOps() {
    }

    public final boolean runAfterFragmentTransactions(FragmentActivity host, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(action, "action");
        if (host.isFinishing() || host.isDestroyed()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: org.betup.utils.FragmentSafeOps$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        };
        Window window = host.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.post(runnable);
            return true;
        }
        mainHandler.post(runnable);
        return true;
    }

    public final void executePendingTransactionsSafely(final FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (fragmentManager.isDestroyed()) {
            return;
        }
        try {
            fragmentManager.executePendingTransactions();
        } catch (IllegalStateException e) {
            Log.w(TAG, "executePendingTransactions deferred: " + e.getMessage());
            List<Fragment> fragments = fragmentManager.getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Fragment fragment = (Fragment) CollectionsKt.firstOrNull((List) fragments);
            FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
            FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? activity : null;
            if (fragmentActivity == null) {
                return;
            }
            runAfterFragmentTransactions(fragmentActivity, new Function0() { // from class: org.betup.utils.FragmentSafeOps$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit executePendingTransactionsSafely$lambda$2;
                    executePendingTransactionsSafely$lambda$2 = FragmentSafeOps.executePendingTransactionsSafely$lambda$2(FragmentManager.this);
                    return executePendingTransactionsSafely$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executePendingTransactionsSafely$lambda$2(FragmentManager fragmentManager) {
        if (!fragmentManager.isDestroyed()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m10853constructorimpl(Boolean.valueOf(fragmentManager.executePendingTransactions()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }
}
