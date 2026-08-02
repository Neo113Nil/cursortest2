package org.betup.utils;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.games.BaseGameFragment;
import org.betup.games.MiniGameActivity;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.home.HomeFragment;

/* loaded from: classes4.dex */
public final class FragmentTransactionHelper {
    private static final int STACK_LIMIT = 3;
    private FragmentManager fragmentManager;
    private Integer layoutId;

    public enum AnimationType {
        SLIDE,
        FLIP,
        NONE
    }

    public static FragmentTransactionHelper with(FragmentManager fragmentManager) {
        FragmentTransactionHelper fragmentTransactionHelper = new FragmentTransactionHelper();
        fragmentTransactionHelper.fragmentManager = fragmentManager;
        return fragmentTransactionHelper;
    }

    public FragmentTransactionHelper setLayout(int id) {
        this.layoutId = Integer.valueOf(id);
        return this;
    }

    public void clearStack() {
        Log.d("BACKBUTTON", "BACKSTACKSIZE = " + this.fragmentManager.getBackStackEntryCount());
        if (this.fragmentManager.getBackStackEntryCount() > 0) {
            this.fragmentManager.popBackStackImmediate(this.fragmentManager.getBackStackEntryAt(0).getName(), 1);
        }
    }

    public void commit(BaseGameFragment fragment, Context context) {
        commit(fragment, context, AnimationType.SLIDE);
    }

    public void commit(BaseGameFragment fragment, Context context, AnimationType animationType) {
        Log.d("HIGHLIGHTING", getActiveTag() + "   ~   " + fragment.getClass().getName());
        this.fragmentManager.executePendingTransactions();
        if (context instanceof MiniGameActivity) {
            ((MiniGameActivity) context).newInStack();
        }
        Log.d("FRAGMENTTEST", "STACK COUNT = " + this.fragmentManager.getBackStackEntryCount());
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        if (animationType != AnimationType.NONE) {
            int i = AnonymousClass1.$SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType[animationType.ordinal()];
            if (i == 1) {
                beginTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out, R.animator.fade_in, R.animator.fade_out);
            } else if (i == 2) {
                beginTransaction.setCustomAnimations(R.animator.card_flip_right_in, R.animator.card_flip_right_out, R.animator.card_flip_left_in, R.animator.card_flip_left_out);
            }
        }
        Integer num = this.layoutId;
        beginTransaction.replace(num == null ? R.id.container : num.intValue(), fragment, fragment.getClass().getCanonicalName());
        Log.d("FRAGMENTTEST", "ADDING " + fragment.getClass().getName());
        beginTransaction.addToBackStack(fragment.getClass().getCanonicalName());
        beginTransaction.commitAllowingStateLoss();
        this.fragmentManager.executePendingTransactions();
        Log.d("FRAGMENTTEST", "NEW STACK COUNT = " + this.fragmentManager.getBackStackEntryCount());
    }

    /* renamed from: org.betup.utils.FragmentTransactionHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType = iArr;
            try {
                iArr[AnimationType.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType[AnimationType.FLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void commit(BaseFragment fragment, Context context) {
        commit(fragment, context, AnimationType.SLIDE);
    }

    public void commit(BaseFragment fragment, Context context, AnimationType animationType) {
        Log.d("HIGHLIGHTING", getActiveTag() + "   ~   " + fragment.getTitle());
        this.fragmentManager.executePendingTransactions();
        if ((context instanceof MainActivity) && !(fragment instanceof HomeFragment)) {
            ((MainActivity) context).newInStack();
        }
        Log.d("FRAGMENTTEST", "STACK COUNT = " + this.fragmentManager.getBackStackEntryCount());
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        if (animationType != AnimationType.NONE) {
            int i = AnonymousClass1.$SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType[animationType.ordinal()];
            if (i == 1) {
                beginTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out, R.animator.fade_in, R.animator.fade_out);
            } else if (i == 2) {
                beginTransaction.setCustomAnimations(R.animator.card_flip_right_in, R.animator.card_flip_right_out, R.animator.card_flip_left_in, R.animator.card_flip_left_out);
            }
        }
        Integer num = this.layoutId;
        beginTransaction.replace(num == null ? R.id.container : num.intValue(), fragment, fragment.getClass().getCanonicalName());
        Log.d("FRAGMENTTEST", "ADDING " + fragment.getClass().getName());
        if (!(fragment instanceof HomeFragment)) {
            beginTransaction.addToBackStack(fragment.getClass().getCanonicalName());
        }
        beginTransaction.commitAllowingStateLoss();
        this.fragmentManager.executePendingTransactions();
        Log.d("FRAGMENTTEST", "NEW STACK COUNT = " + this.fragmentManager.getBackStackEntryCount());
    }

    public void commitKeepingCurrent(BaseFragment currentFragment, BaseFragment newFragment, Context context, AnimationType animationType) {
        Log.d("FRAGMENTTEST", "commitKeepingCurrent: hide " + (currentFragment != null ? currentFragment.getClass().getSimpleName() : AbstractJsonLexerKt.NULL) + ", add " + newFragment.getClass().getSimpleName());
        this.fragmentManager.executePendingTransactions();
        if (context instanceof MainActivity) {
            ((MainActivity) context).newInStack();
        }
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        if (animationType != AnimationType.NONE) {
            int i = AnonymousClass1.$SwitchMap$org$betup$utils$FragmentTransactionHelper$AnimationType[animationType.ordinal()];
            if (i == 1) {
                beginTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out, R.animator.fade_in, R.animator.fade_out);
            } else if (i == 2) {
                beginTransaction.setCustomAnimations(R.animator.card_flip_right_in, R.animator.card_flip_right_out, R.animator.card_flip_left_in, R.animator.card_flip_left_out);
            }
        }
        if (currentFragment != null) {
            beginTransaction.hide(currentFragment);
        }
        Integer num = this.layoutId;
        beginTransaction.add(num == null ? R.id.container : num.intValue(), newFragment, newFragment.getClass().getCanonicalName());
        beginTransaction.addToBackStack(newFragment.getClass().getCanonicalName());
        beginTransaction.commitAllowingStateLoss();
        this.fragmentManager.executePendingTransactions();
    }

    public String getActiveTag() {
        if (this.fragmentManager.getBackStackEntryCount() == 0) {
            return "";
        }
        return this.fragmentManager.getBackStackEntryAt(r0.getBackStackEntryCount() - 1).getName();
    }
}
