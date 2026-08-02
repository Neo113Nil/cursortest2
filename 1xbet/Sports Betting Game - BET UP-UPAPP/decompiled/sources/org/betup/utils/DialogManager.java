package org.betup.utils;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DialogManager.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J\b\u0010\u001f\u001a\u00020\u0011H\u0007J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0019H\u0007J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0014H\u0007J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0014H\u0007J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J \u0010)\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J \u0010)\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J)\u0010*\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050,\"\u00020\u0005H\u0007¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001eH\u0007J\u0018\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0018\u00102\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0018\u00103\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001012\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lorg/betup/utils/DialogManager;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "BETTING_SHEET_DIALOG_TAG", "SELECT_BET_DIALOG_TAG", "CHALLENGE_ACCEPT_DIALOG_TAG", "STACKABLE_OVERLAY_TAGS", "", "STACKABLE_PARENT_DIALOG_TAGS", "WEB_GAME_DIALOG_TAG", "STACKABLE_ON_WEB_GAME_TAGS", "PRIORITY_REWARD_DIALOG_TAGS", "showingDialogs", "Ljava/util/concurrent/ConcurrentHashMap;", "", "onLastTrackedDialogDismissedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/Runnable;", "showDialogSafely", "dialog", "Landroidx/fragment/app/DialogFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "activity", "Landroid/app/Activity;", "onDialogDismissed", "", "hasTrackedDialogShowing", "reconcileTrackedDialogsWith", "rootFragmentManager", "fragmentTreeContainsTaggedDialog", "fm", "registerOnLastTrackedDialogDismissed", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterOnLastTrackedDialogDismissed", "dispatchLastTrackedDialogDismissedIfIdleLocked", "isDialogShowing", "showDialogReplacingPrevious", "dismissDialogsWithTags", "tags", "", "(Landroidx/fragment/app/FragmentManager;[Ljava/lang/String;)V", "clearAll", "shouldDeferDialog", "host", "Landroidx/fragment/app/FragmentActivity;", "canStackOnWebGame", "canStackOnParentDialog", "hostActivity", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DialogManager {
    private static final String TAG = "DialogManager";
    private static final String WEB_GAME_DIALOG_TAG = "WebGameDialogFragment";
    public static final DialogManager INSTANCE = new DialogManager();
    private static final Set<String> STACKABLE_OVERLAY_TAGS = SetsKt.setOf((Object[]) new String[]{"OddsDialog", NotEnoughBetcoinsVideoOfferDialogFragment.TAG});
    private static final String BETTING_SHEET_DIALOG_TAG = "BettingSheetDialog";
    private static final String SELECT_BET_DIALOG_TAG = "selectBetDialog";
    private static final String CHALLENGE_ACCEPT_DIALOG_TAG = "challengeAcceptDialog";
    private static final Set<String> STACKABLE_PARENT_DIALOG_TAGS = SetsKt.setOf((Object[]) new String[]{BETTING_SHEET_DIALOG_TAG, SELECT_BET_DIALOG_TAG, CHALLENGE_ACCEPT_DIALOG_TAG});
    private static final Set<String> STACKABLE_ON_WEB_GAME_TAGS = SetsKt.setOf((Object[]) new String[]{NotEnoughBetcoinsVideoOfferDialogFragment.TAG, VideoRewardCollectDialogHelper.DIALOG_TAG, WebGameWinVideoOfferDialogFragment.TAG});
    private static final Set<String> PRIORITY_REWARD_DIALOG_TAGS = SetsKt.setOf(VideoRewardCollectDialogHelper.DIALOG_TAG);
    private static final ConcurrentHashMap<String, Boolean> showingDialogs = new ConcurrentHashMap<>();
    private static final CopyOnWriteArrayList<Runnable> onLastTrackedDialogDismissedListeners = new CopyOnWriteArrayList<>();
    public static final int $stable = 8;

    private DialogManager() {
    }

    @JvmStatic
    public static final boolean showDialogSafely(final DialogFragment dialog, final FragmentManager fragmentManager, final String tag) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tag, "tag");
        DialogManager dialogManager = INSTANCE;
        FragmentActivity hostActivity = dialogManager.hostActivity(fragmentManager);
        if (hostActivity != null && dialogManager.shouldDeferDialog(hostActivity, tag)) {
            DeferredOverlayQueue.enqueue(hostActivity, new Runnable() { // from class: org.betup.utils.DialogManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DialogManager.showDialogSafely(DialogFragment.this, fragmentManager, tag);
                }
            });
            return false;
        }
        synchronized (dialogManager) {
            FragmentActivity hostActivity2 = dialogManager.hostActivity(fragmentManager);
            if (hostActivity2 != null) {
                FragmentManager supportFragmentManager2 = hostActivity2.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                if (dialogManager.fragmentTreeContainsTaggedDialog(supportFragmentManager2, tag)) {
                    Log.d(TAG, "Dialog with tag '" + tag + "' already in activity fragment tree; skipping");
                    showingDialogs.put(tag, true);
                    return false;
                }
            }
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(tag);
            Fragment fragment = null;
            DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
            if (dialogFragment != null && dialogFragment.isAdded()) {
                Dialog dialog2 = dialogFragment.getDialog();
                Log.d(TAG, "Dialog with tag '" + tag + "' already added (" + ((dialog2 == null || !dialog2.isShowing()) ? "pending show" : VastAttributes.VISIBLE) + "); skipping");
                return false;
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMap = showingDialogs;
            if (Intrinsics.areEqual((Object) concurrentHashMap.get(tag), (Object) true)) {
                FragmentActivity hostActivity3 = dialogManager.hostActivity(fragmentManager);
                if (hostActivity3 != null && (supportFragmentManager = hostActivity3.getSupportFragmentManager()) != null) {
                    fragment = supportFragmentManager.findFragmentByTag(tag);
                }
                if (fragment != null && fragment.isAdded()) {
                    Log.d(TAG, "Dialog with tag '" + tag + "' already on activity FragmentManager; skipping");
                    return false;
                }
                if (dialogFragment != null || fragment != null) {
                    return false;
                }
                Log.d(TAG, "Dialog with tag '" + tag + "' was tracked but not in fragment manager, clearing stale state");
                concurrentHashMap.remove(tag);
            }
            concurrentHashMap.put(tag, true);
            try {
                dialog.show(fragmentManager, tag);
                Log.d(TAG, "Dialog with tag '" + tag + "' shown successfully");
                return true;
            } catch (Exception e) {
                Log.e(TAG, "Failed to show dialog with tag '" + tag + "'", e);
                showingDialogs.remove(tag);
                INSTANCE.dispatchLastTrackedDialogDismissedIfIdleLocked();
                return false;
            }
        }
    }

    @JvmStatic
    public static final boolean showDialogSafely(DialogFragment dialog, Activity activity, String tag) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!(activity instanceof FragmentActivity)) {
            Log.e(TAG, "Activity is not a FragmentActivity");
            return false;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return showDialogSafely(dialog, supportFragmentManager, tag);
    }

    @JvmStatic
    public static final void onDialogDismissed(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        DialogManager dialogManager = INSTANCE;
        synchronized (dialogManager) {
            showingDialogs.remove(tag);
            Log.d(TAG, "Dialog with tag '" + tag + "' dismissed, removed from tracking");
            dialogManager.dispatchLastTrackedDialogDismissedIfIdleLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final boolean hasTrackedDialogShowing() {
        boolean z;
        synchronized (INSTANCE) {
            z = !showingDialogs.isEmpty();
        }
        return z;
    }

    @JvmStatic
    public static final void reconcileTrackedDialogsWith(FragmentManager rootFragmentManager) {
        Intrinsics.checkNotNullParameter(rootFragmentManager, "rootFragmentManager");
        synchronized (INSTANCE) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = showingDialogs;
            if (concurrentHashMap.isEmpty()) {
                return;
            }
            Set<String> keySet = concurrentHashMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            boolean z = false;
            for (String str : CollectionsKt.toList(keySet)) {
                if (!INSTANCE.fragmentTreeContainsTaggedDialog(rootFragmentManager, str)) {
                    showingDialogs.remove(str);
                    Log.d(TAG, "Reconcile: removed stale dialog tracking for tag '" + str + "' (no DialogFragment in tree)");
                    z = true;
                }
            }
            if (z) {
                INSTANCE.dispatchLastTrackedDialogDismissedIfIdleLocked();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean fragmentTreeContainsTaggedDialog(FragmentManager fm, String tag) {
        Object m10853constructorimpl;
        int size = fm.getFragments().size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = fm.getFragments().get(i);
            Intrinsics.checkNotNullExpressionValue(fragment, "get(...)");
            Fragment fragment2 = fragment;
            if (fragment2 instanceof DialogFragment) {
                DialogFragment dialogFragment = (DialogFragment) fragment2;
                if (Intrinsics.areEqual(tag, dialogFragment.getTag()) && dialogFragment.isAdded()) {
                    return true;
                }
            }
            if (fragment2.isAdded()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DialogManager dialogManager = this;
                    m10853constructorimpl = Result.m10853constructorimpl(fragment2.getChildFragmentManager());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                    m10853constructorimpl = null;
                }
                FragmentManager fragmentManager = (FragmentManager) m10853constructorimpl;
                if (fragmentManager != null && fragmentTreeContainsTaggedDialog(fragmentManager, tag)) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final void registerOnLastTrackedDialogDismissed(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        onLastTrackedDialogDismissedListeners.add(listener);
    }

    @JvmStatic
    public static final void unregisterOnLastTrackedDialogDismissed(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        onLastTrackedDialogDismissedListeners.remove(listener);
    }

    private final void dispatchLastTrackedDialogDismissedIfIdleLocked() {
        if (showingDialogs.isEmpty()) {
            Iterator<Runnable> it = onLastTrackedDialogDismissedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                try {
                    it.next().run();
                } catch (Exception e) {
                    Log.e(TAG, "onLastTrackedDialogDismissed listener failed", e);
                }
            }
        }
    }

    @JvmStatic
    public static final boolean isDialogShowing(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Intrinsics.areEqual((Object) showingDialogs.get(tag), (Object) true);
    }

    @JvmStatic
    public static final boolean showDialogReplacingPrevious(final DialogFragment dialog, final FragmentManager fragmentManager, final String tag) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tag, "tag");
        DialogManager dialogManager = INSTANCE;
        FragmentActivity hostActivity = dialogManager.hostActivity(fragmentManager);
        if (hostActivity != null && dialogManager.shouldDeferDialog(hostActivity, tag)) {
            DeferredOverlayQueue.enqueue(hostActivity, new Runnable() { // from class: org.betup.utils.DialogManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DialogManager.showDialogReplacingPrevious(DialogFragment.this, fragmentManager, tag);
                }
            });
            return false;
        }
        synchronized (dialogManager) {
            try {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(tag);
                DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
                if (dialogFragment != null && dialogFragment.isAdded()) {
                    FragmentDialogSafeOps.INSTANCE.dismissAllowingStateLoss(dialogFragment);
                    fragmentManager.executePendingTransactions();
                    showingDialogs.remove(tag);
                    Log.d(TAG, "Dismissed existing dialog with tag '" + tag + "' to show new one");
                }
                showingDialogs.put(tag, true);
                dialog.show(fragmentManager, tag);
                Log.d(TAG, "Dialog with tag '" + tag + "' shown (replacing previous)");
            } catch (Exception e) {
                Log.e(TAG, "Failed to show dialog with tag '" + tag + "'", e);
                showingDialogs.remove(tag);
                INSTANCE.dispatchLastTrackedDialogDismissedIfIdleLocked();
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean showDialogReplacingPrevious(DialogFragment dialog, Activity activity, String tag) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!(activity instanceof FragmentActivity)) {
            Log.e(TAG, "Activity is not a FragmentActivity");
            return false;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return showDialogReplacingPrevious(dialog, supportFragmentManager, tag);
    }

    @JvmStatic
    public static final void dismissDialogsWithTags(FragmentManager fragmentManager, String... tags) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tags, "tags");
        for (String str : tags) {
            try {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
                DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
                if (dialogFragment != null && dialogFragment.isAdded()) {
                    FragmentDialogSafeOps.INSTANCE.dismissAllowingStateLoss(dialogFragment);
                    showingDialogs.remove(str);
                    Log.d(TAG, "Dismissed dialog with tag '" + str + "'");
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to dismiss dialog with tag '" + str + "'", e);
            }
        }
        fragmentManager.executePendingTransactions();
        DialogManager dialogManager = INSTANCE;
        synchronized (dialogManager) {
            dialogManager.dispatchLastTrackedDialogDismissedIfIdleLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void clearAll() {
        DialogManager dialogManager = INSTANCE;
        synchronized (dialogManager) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = showingDialogs;
            boolean isEmpty = concurrentHashMap.isEmpty();
            concurrentHashMap.clear();
            Log.d(TAG, "All dialog tracking cleared");
            if (!isEmpty) {
                dialogManager.dispatchLastTrackedDialogDismissedIfIdleLocked();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean shouldDeferDialog(FragmentActivity host, String tag) {
        if (PresentationOverlayGate.shouldBlockDialog(tag)) {
            return true;
        }
        if (FlashBetImmersiveSessionGuard.isWhitelistedDialogTag(tag) || canStackOnParentDialog(host, tag) || canStackOnWebGame(host, tag)) {
            return false;
        }
        if (PRIORITY_REWARD_DIALOG_TAGS.contains(tag)) {
            return AdMobFullscreenSessionGuard.isActive();
        }
        return ExternalOverlayDeferral.shouldDefer(host);
    }

    private final boolean canStackOnWebGame(FragmentActivity host, String tag) {
        if (!STACKABLE_ON_WEB_GAME_TAGS.contains(tag)) {
            return false;
        }
        FragmentManager supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return fragmentTreeContainsTaggedDialog(supportFragmentManager, "WebGameDialogFragment");
    }

    private final boolean canStackOnParentDialog(FragmentActivity host, String tag) {
        if (!STACKABLE_OVERLAY_TAGS.contains(tag)) {
            return false;
        }
        for (String str : STACKABLE_PARENT_DIALOG_TAGS) {
            FragmentManager supportFragmentManager = host.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (fragmentTreeContainsTaggedDialog(supportFragmentManager, str)) {
                return true;
            }
            synchronized (this) {
                if (Intrinsics.areEqual((Object) showingDialogs.get(str), (Object) true)) {
                    return true;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return false;
    }

    private final FragmentActivity hostActivity(FragmentManager fragmentManager) {
        Object obj;
        FragmentActivity hostActivity;
        Iterator<Fragment> it = fragmentManager.getFragments().iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Fragment next = it.next();
            FragmentActivity activity = next.getActivity();
            if (activity != null) {
                return activity;
            }
            if (next.isAdded()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DialogManager dialogManager = this;
                    obj = Result.m10853constructorimpl(next.getChildFragmentManager());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    obj = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                FragmentManager fragmentManager2 = (FragmentManager) (Result.m10859isFailureimpl(obj) ? null : obj);
                if (fragmentManager2 != null && (hostActivity = hostActivity(fragmentManager2)) != null) {
                    return hostActivity;
                }
            }
        }
    }
}
