package org.betup.ui.fragment.dailybonus;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.bus.DailyBonusButtonUpdate;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyBonusDialogFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020 H\u0002¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0007R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006(²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/dailybonus/DailyBonusDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openWheelOfFortune", "dailyBonusId", "", "winningValue", "dailyBonusBoostMultiplier", "(ILjava/lang/Integer;I)V", "onDailyBonusButtonUpdate", "message", "Lorg/betup/bus/DailyBonusButtonUpdate;", VastTagName.COMPANION, "app_release", "dataC", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "isLoading", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyBonusDialogFragment extends DialogFragment {
    public static final String FRAGMENT_TAG = "DailyBonusDialogFragment";

    @Inject
    public DailyBonusController controller;

    @Inject
    public VideoRewardService videoRewardService;
    public static final int $stable = 8;

    public final DailyBonusController getController() {
        DailyBonusController dailyBonusController = this.controller;
        if (dailyBonusController != null) {
            return dailyBonusController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(DailyBonusController dailyBonusController) {
        Intrinsics.checkNotNullParameter(dailyBonusController, "<set-?>");
        this.controller = dailyBonusController;
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        DailyBonusController controller = getController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.initialize(requireContext);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setDimAmount(0.0f);
        }
        getController().invalidate();
        getController().load();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
            Log.d("DailyBonusDialog", "onStart - Registered EventBus");
        }
        getVideoRewardService().triggerCaching();
        Log.d("DailyBonusDialog", "onStart - Triggered video ad pre-caching for future use");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
            Log.d("DailyBonusDialog", "onStop - Unregistered EventBus");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(486532896, true, new DailyBonusDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    static /* synthetic */ void openWheelOfFortune$default(DailyBonusDialogFragment dailyBonusDialogFragment, int i, Integer num, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        dailyBonusDialogFragment.openWheelOfFortune(i, num, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openWheelOfFortune(int dailyBonusId, Integer winningValue, int dailyBonusBoostMultiplier) {
        Log.d("DailyBonusDialog", "Opening Wheel of Fortune with dailyBonusId: " + dailyBonusId + ", winning value: " + winningValue + ", boost: x" + dailyBonusBoostMultiplier);
        getParentFragmentManager().beginTransaction().remove(this).add(R.id.content, WheelOfFortuneFragment.INSTANCE.newInstance(dailyBonusId, winningValue, dailyBonusBoostMultiplier), "wheel_of_fortune").commitAllowingStateLoss();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onDailyBonusButtonUpdate(DailyBonusButtonUpdate message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("DailyBonusDialog", "DailyBonusButtonUpdate received - refreshing daily bonus list");
        getController().invalidate();
        getController().load();
    }
}
