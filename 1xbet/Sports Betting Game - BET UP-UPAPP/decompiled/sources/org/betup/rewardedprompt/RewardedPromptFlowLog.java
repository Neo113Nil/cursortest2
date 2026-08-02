package org.betup.rewardedprompt;

import android.app.Dialog;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.AdMobFullscreenSessionGuard;
import org.betup.utils.DialogManager;
import org.betup.utils.FlashBetImmersiveSessionGuard;
import org.betup.utils.ImmersiveOverlayGate;
import org.betup.utils.PresentationOverlayGate;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptFlowLog.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/rewardedprompt/RewardedPromptFlowLog;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "step", "", "message", "ok", "wait", "stop", "reason", "ui", "overlaySnapshot", "host", "Landroidx/fragment/app/FragmentActivity;", "collectVisibleDialogTags", "", "fragments", "Landroidx/fragment/app/Fragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardedPromptFlowLog {
    public static final int $stable = 0;
    public static final RewardedPromptFlowLog INSTANCE = new RewardedPromptFlowLog();
    public static final String TAG = "RVP_FLOW";

    private RewardedPromptFlowLog() {
    }

    @JvmStatic
    public static final void step(String step, String message) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, ">> [" + step + "] " + message);
    }

    @JvmStatic
    public static final void ok(String step, String message) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(TAG, "OK [" + step + "] " + message);
    }

    @JvmStatic
    public static final void wait(String step, String message) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w(TAG, "WAIT [" + step + "] " + message);
    }

    @JvmStatic
    public static final void stop(String step, String reason) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Log.e(TAG, "STOP [" + step + "] " + reason);
    }

    @JvmStatic
    public static final void ui(String step, String message) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(TAG, "UI [" + step + "] " + message);
    }

    @JvmStatic
    public static final String overlaySnapshot(FragmentActivity host) {
        if (host == null) {
            return "host=null";
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogManager.reconcileTrackedDialogsWith(supportFragmentManager);
        ArrayList arrayList = new ArrayList();
        if (AdMobFullscreenSessionGuard.isActive()) {
            arrayList.add("AdMobFullscreenSessionGuard.active");
        }
        if (PresentationOverlayGate.isActive() || ImmersiveOverlayGate.isActive()) {
            arrayList.add("Immersive/PresentationOverlayGate.active");
        }
        if (FlashBetImmersiveSessionGuard.isActive()) {
            arrayList.add("FlashBetImmersiveSessionGuard.active");
        }
        if (DialogManager.hasTrackedDialogShowing()) {
            arrayList.add("DialogManager.hasTrackedDialogShowing=true");
        }
        RewardedPromptFlowLog rewardedPromptFlowLog = INSTANCE;
        List<Fragment> fragments = host.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        List<String> collectVisibleDialogTags = rewardedPromptFlowLog.collectVisibleDialogTags(fragments);
        if (!collectVisibleDialogTags.isEmpty()) {
            arrayList.add("visibleDialogFragments=" + collectVisibleDialogTags);
        }
        if (arrayList.isEmpty()) {
            return "overlays=CLEAR finishing=" + host.isFinishing() + " destroyed=" + host.isDestroyed();
        }
        return "overlays=BLOCKED reasons=" + arrayList + " finishing=" + host.isFinishing() + " destroyed=" + host.isDestroyed();
    }

    private final List<String> collectVisibleDialogTags(List<? extends Fragment> fragments) {
        Object m10853constructorimpl;
        DialogFragment dialogFragment;
        Dialog dialog;
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragments) {
            if (fragment.isAdded()) {
                if ((fragment instanceof DialogFragment) && (dialog = (dialogFragment = (DialogFragment) fragment).getDialog()) != null && dialog.isShowing()) {
                    String tag = dialogFragment.getTag();
                    if (tag == null) {
                        tag = fragment.getClass().getSimpleName();
                    }
                    Intrinsics.checkNotNull(tag);
                    arrayList.add(tag);
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    RewardedPromptFlowLog rewardedPromptFlowLog = this;
                    m10853constructorimpl = Result.m10853constructorimpl(fragment.getChildFragmentManager().getFragments());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                    m10853constructorimpl = null;
                }
                List<? extends Fragment> list = (List) m10853constructorimpl;
                if (list != null) {
                    arrayList.addAll(collectVisibleDialogTags(list));
                }
            }
        }
        return arrayList;
    }
}
