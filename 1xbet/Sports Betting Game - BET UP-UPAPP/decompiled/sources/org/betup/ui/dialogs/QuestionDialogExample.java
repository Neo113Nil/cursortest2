package org.betup.ui.dialogs;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.QuestionDialogMessage;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* compiled from: QuestionDialogExample.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0014\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/QuestionDialogExample;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "showSimpleConfirmation", "", "showCloseFragmentConfirmation", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "showLogoutConfirmation", "onLogoutConfirmed", "Lkotlin/Function0;", "showBetConfirmation", "betAmount", "", "onBetConfirmed", "showClearDataConfirmation", "onClearConfirmed", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuestionDialogExample {
    public static final int $stable = 0;
    public static final QuestionDialogExample INSTANCE = new QuestionDialogExample();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCloseFragmentConfirmation$lambda$3() {
    }

    private QuestionDialogExample() {
    }

    public final void showSimpleConfirmation() {
        EventBus.getDefault().post(new QuestionDialogMessage("Are you sure you want to delete this item?", new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showSimpleConfirmation$lambda$0();
            }
        }, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showSimpleConfirmation$lambda$1();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSimpleConfirmation$lambda$0() {
        System.out.println((Object) "User confirmed deletion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSimpleConfirmation$lambda$1() {
        System.out.println((Object) "User cancelled deletion");
    }

    public final void showCloseFragmentConfirmation(final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        EventBus.getDefault().post(new QuestionDialogMessage("You have unsaved changes. Are you sure you want to close?", new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showCloseFragmentConfirmation$lambda$2(Fragment.this);
            }
        }, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showCloseFragmentConfirmation$lambda$3();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCloseFragmentConfirmation$lambda$2(Fragment fragment) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack();
    }

    public final void showLogoutConfirmation(final Function0<Unit> onLogoutConfirmed) {
        Intrinsics.checkNotNullParameter(onLogoutConfirmed, "onLogoutConfirmed");
        EventBus.getDefault().post(new QuestionDialogMessage("Are you sure you want to log out?", new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        }, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showLogoutConfirmation$lambda$5();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLogoutConfirmation$lambda$5() {
        System.out.println((Object) "Logout cancelled");
    }

    public final void showBetConfirmation(double betAmount, final Function0<Unit> onBetConfirmed) {
        Intrinsics.checkNotNullParameter(onBetConfirmed, "onBetConfirmed");
        EventBus.getDefault().post(new QuestionDialogMessage("Are you sure you want to place a bet for $" + betAmount + TypeDescription.Generic.OfWildcardType.SYMBOL, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        }, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showBetConfirmation$lambda$7();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBetConfirmation$lambda$7() {
        System.out.println((Object) "Bet cancelled");
    }

    public final void showClearDataConfirmation(final Function0<Unit> onClearConfirmed) {
        Intrinsics.checkNotNullParameter(onClearConfirmed, "onClearConfirmed");
        EventBus.getDefault().post(new QuestionDialogMessage("This will permanently delete all your data. Are you sure?", new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        }, new Runnable() { // from class: org.betup.ui.dialogs.QuestionDialogExample$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                QuestionDialogExample.showClearDataConfirmation$lambda$9();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showClearDataConfirmation$lambda$9() {
        System.out.println((Object) "Data deletion cancelled");
    }
}
