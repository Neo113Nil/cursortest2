package org.betup.ui.dialogs;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import java.util.Locale;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public class NotEnoughBetcoinsVideoOfferDialog extends BaseBlurredDialog implements VideoRewardService.VideoRewardServiceClient {
    private Activity activity;
    private long betcoins;

    @BindView(R.id.videoRewardAmount)
    TextView videoRewardAmount;

    @Inject
    VideoRewardService videoRewardService;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_not_enough_betcoins;
    }

    public NotEnoughBetcoinsVideoOfferDialog(Activity context, long betcoins) {
        super(context);
        this.activity = context;
        this.betcoins = betcoins;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        setupTextWithCoins();
        this.videoRewardService.connectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, this);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        this.videoRewardService.redeemReward(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null);
    }

    private void setupTextWithCoins() {
        this.videoRewardAmount.setText(String.format(Locale.getDefault(), "+%d", Long.valueOf(this.betcoins)));
    }

    @OnClick({R.id.close})
    public void onCloseClick() {
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        this.videoRewardService.disconnectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (result == VideoRewardService.RewardedVideoResult.SUCCESS) {
            if (!this.activity.isFinishing()) {
                dismiss();
            }
            RewardReceivedDialog.showDialog(this.activity, (int) amount, getContext().getString(R.string.home_daily_bonus_title), getContext().getString(R.string.home_daily_bonus_got));
            return;
        }
        dismiss();
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        boolean z2 = false;
        try {
            z = this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS);
        } catch (Exception e) {
            Log.e("NotEnoughBetcoins", "Error checking rewarded ad availability", e);
            z = false;
        }
        if (info.isAvailable() && !info.isQuotaExhausted()) {
            z2 = true;
        }
        Log.d("NotEnoughBetcoins", "Video reward updated: backendAvailable=" + z2 + ", adSdkAvailable=" + z + ", amount=" + info.getPrizeAmount());
        if (!z2 || this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS)) {
            return;
        }
        this.videoRewardService.preloadRewarded();
    }
}
