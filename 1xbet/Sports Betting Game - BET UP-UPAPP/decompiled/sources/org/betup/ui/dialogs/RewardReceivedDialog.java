package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.FormatHelper;

/* loaded from: classes2.dex */
public class RewardReceivedDialog extends BaseDialog implements VideoRewardService.VideoRewardServiceClient {

    @BindView(R.id.balance)
    TextView betcoins;
    private int bonus;

    @BindView(R.id.desc)
    TextView desc;
    private String descText;

    @BindView(R.id.getDouble)
    View getDouble;
    private boolean isMultiplyBonusAvailable;

    @BindView(R.id.multiplyBetcoinsBonus)
    TextView multiplyBonusBetcoins;

    @BindView(R.id.multiplyBonus)
    View multiplyBonusButton;

    @BindView(R.id.multiplyBonusTitle)
    TextView multiplyBonusTitle;

    @BindView(R.id.title)
    TextView title;
    private String titleText;

    @Inject
    VideoRewardService videoRewardService;

    public interface BonusDialogListener {
        void onOkClick();
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
    }

    public RewardReceivedDialog(Context context) {
        super(R.layout.dialog_daily_store_bonus, context);
    }

    public static RewardReceivedDialog showDialog(Context context, int bonus, String title, String desc, boolean isMultiplyBonusAvailable) {
        RewardReceivedDialog rewardReceivedDialog = new RewardReceivedDialog(context);
        rewardReceivedDialog.bonus = bonus;
        rewardReceivedDialog.titleText = title;
        rewardReceivedDialog.descText = desc;
        rewardReceivedDialog.isMultiplyBonusAvailable = isMultiplyBonusAvailable;
        rewardReceivedDialog.show();
        return rewardReceivedDialog;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        ButterKnife.bind(this);
        this.videoRewardService.connectClient(PromoService.PromoPlacement.DAILY_BONUS, null, this);
        this.betcoins.setText(String.valueOf(this.bonus));
        this.title.setText(this.titleText);
        this.desc.setText(Html.fromHtml(this.descText));
        this.getDouble.setVisibility(8);
        multiplyButtonInit();
    }

    public static RewardReceivedDialog showDialog(Context context, int bonus, String title, String desc) {
        RewardReceivedDialog rewardReceivedDialog = new RewardReceivedDialog(context);
        rewardReceivedDialog.bonus = bonus;
        rewardReceivedDialog.titleText = title;
        rewardReceivedDialog.descText = desc;
        rewardReceivedDialog.show();
        return rewardReceivedDialog;
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    private void multiplyButtonInit() {
        if (this.isMultiplyBonusAvailable) {
            int i = this.bonus;
            this.multiplyBonusTitle.setText(this.context.getString(R.string.multiply_your_bonus, FormatHelper.getFormattedMultiplierCoef(i, i * 3)));
            this.multiplyBonusTitle.setVisibility(0);
            this.multiplyBonusBetcoins.setVisibility(0);
            this.multiplyBonusBetcoins.setText("+".concat(String.valueOf(this.bonus * 2)));
            this.multiplyBonusButton.setVisibility(0);
            this.multiplyBonusButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.RewardReceivedDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RewardReceivedDialog.this.m13122x892093b4(view);
                }
            });
        }
    }

    /* renamed from: lambda$multiplyButtonInit$0$org-betup-ui-dialogs-RewardReceivedDialog, reason: not valid java name */
    /* synthetic */ void m13122x892093b4(View view) {
        this.videoRewardService.redeemReward(PromoService.PromoPlacement.DAILY_BONUS, Long.valueOf(this.bonus), null);
        this.videoRewardService.disconnectClient(PromoService.PromoPlacement.DAILY_BONUS, null);
        super.dismiss();
    }
}
