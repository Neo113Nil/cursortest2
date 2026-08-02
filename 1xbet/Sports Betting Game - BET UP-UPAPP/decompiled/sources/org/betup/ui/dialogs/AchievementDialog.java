package org.betup.ui.dialogs;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.utils.FormatHelper;
import org.betup.utils.PicassoHelper;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class AchievementDialog extends BaseBlurredDialog {
    public static int FIRST_BET_ACHIEVEMENT_ID = 1;

    @BindView(R.id.betcoins)
    TextView betcoinsLabel;
    private String icon;

    @BindView(R.id.icon)
    ImageView iconView;
    private int price;

    @BindView(R.id.stars)
    View stars;
    private String subtitle;

    @BindView(R.id.desc)
    TextView subtitleLabel;
    private String title;

    @BindView(R.id.title)
    TextView titleLabel;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_achievement_new;
    }

    public AchievementDialog(Context context, String title, String subtitle, String icon, int price) {
        super(context);
        this.title = title;
        this.subtitle = subtitle;
        this.icon = icon;
        this.price = price;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PicassoHelper.with(getContext()).setImageUrl(this.icon).setImageView(this.iconView).load();
        this.titleLabel.setText(this.title);
        this.subtitleLabel.setText(this.subtitle);
        this.betcoinsLabel.setText(FormatHelper.getDialogBetcoinsFormated(this.price));
        setupAnimation();
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @OnClick({R.id.fb_share})
    public void shareFacebookClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.FACEBOOK).setMsg(getContext().getString(R.string.achievement_msg)));
    }

    @OnClick({R.id.vk_share})
    public void shareVKClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.VK).setMsg(getContext().getString(R.string.achievement_msg)));
    }

    @OnClick({R.id.share})
    public void shareEmailClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.OTHER).setMsg(getContext().getString(R.string.achievement_msg)));
    }

    private void setupAnimation() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.stars, PropertyValuesHolder.ofFloat("scaleX", 0.25f, 2.5f), PropertyValuesHolder.ofFloat("scaleY", 0.25f, 2.5f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.25f));
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.iconView, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.25f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.25f), PropertyValuesHolder.ofFloat("alpha", 0.75f, 1.0f));
        ofPropertyValuesHolder2.setRepeatMode(2);
        ofPropertyValuesHolder2.setRepeatCount(-1);
        ofPropertyValuesHolder2.setDuration(500L);
        ofPropertyValuesHolder2.start();
    }
}
