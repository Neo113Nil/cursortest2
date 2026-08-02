package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.Locale;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.FormatHelper;
import org.betup.utils.PicassoHelper;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class InfoDialog extends BaseDialog implements View.OnClickListener {
    private Builder builder;

    @BindView(R.id.desc)
    TextView descView;

    @BindView(R.id.icon)
    ImageView iconView;

    @BindView(R.id.money)
    TextView money;

    @BindView(R.id.ok)
    TextView ok;

    @BindView(R.id.secondButton)
    TextView secondButton;

    @BindView(R.id.social)
    View social;

    @BindView(R.id.subtitle)
    TextView subtitleView;

    @BindView(R.id.thirdButton)
    TextView thirdButton;

    @BindView(R.id.title)
    TextView titleView;

    @BindView(R.id.xp)
    TextView xp;

    public enum ButtonColor {
        GREEN,
        GRAY
    }

    private InfoDialog(Context context, Builder builder) {
        super(context);
        this.builder = builder;
        this.layout = R.layout.dialog_info;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.bind(this);
        if (this.builder.dismissListener != null) {
            setOnDismissListener(this.builder.dismissListener);
        }
        this.titleView.setText(this.builder.title);
        if (this.builder.subtitle != null) {
            this.subtitleView.setText(this.builder.subtitle);
        } else {
            this.subtitleView.setVisibility(8);
        }
        if (this.builder.iconUrl != null) {
            PicassoHelper.with(getContext()).setImageUrl(this.builder.iconUrl).setImageView(this.iconView).load();
        } else if (this.builder.iconRes != 0) {
            this.iconView.setImageResource(this.builder.iconRes);
        } else {
            this.iconView.setVisibility(8);
        }
        if (this.builder.titleColor != 0) {
            this.titleView.setTextColor(ContextCompat.getColor(getContext(), this.builder.titleColor));
        }
        if (this.builder.desc != null) {
            this.descView.setText(this.builder.desc);
        } else {
            this.descView.setVisibility(8);
        }
        int i = this.builder.money;
        int i2 = R.string.you_have_earned;
        if (i > 0) {
            Log.d("MONEY", "INSIDE = " + this.builder.money);
            int pixelsFromDp = DimensionsUtil.getPixelsFromDp(getContext(), 24);
            String string = getContext().getString(R.string.you_have_earned);
            String format = String.format(Locale.getDefault(), "%s $ %s", string, FormatHelper.getTextFormattedMoney(this.builder.money));
            SpannableString spannableString = new SpannableString(format);
            Drawable drawable = this.context.getResources().getDrawable(R.drawable.betcoin);
            drawable.setBounds(0, 0, pixelsFromDp, pixelsFromDp);
            spannableString.setSpan(new ImageSpan(drawable, 0), string.length() + 1, string.length() + 2, 17);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.colorAccent)), string.length() + 3, format.length(), 33);
            this.money.setText(spannableString);
        } else {
            this.money.setVisibility(8);
        }
        if (this.builder.exp > 0) {
            Locale locale = Locale.getDefault();
            Context context = getContext();
            if (this.builder.money > 0) {
                i2 = R.string.and_have_received;
            }
            this.xp.setText(Html.fromHtml(String.format(locale, "%s <font color='#%s'>%s XP</font> ", context.getString(i2), String.format(Locale.getDefault(), "%X", Integer.valueOf(ContextCompat.getColor(getContext(), R.color.colorAccent))).substring(2), FormatHelper.getExpFormatted(this.builder.exp))));
        } else {
            this.xp.setVisibility(8);
        }
        if (this.builder.social == null) {
            this.social.setVisibility(8);
        }
        this.ok.setOnClickListener(this);
        if (this.builder.firstButtonTitle != null) {
            this.ok.setText(this.builder.firstButtonTitle);
        }
        if (this.builder.secondButtonTitle != null || this.builder.onSecondButtonClickListener != null) {
            if (this.builder.secondButtonTitle != null) {
                this.secondButton.setText(this.builder.secondButtonTitle);
            }
            this.secondButton.setOnClickListener(this);
        } else {
            this.secondButton.setVisibility(8);
        }
        if (this.builder.thirdButtonTitle != null || this.builder.onThirdButtonClickListener != null) {
            if (this.builder.secondButtonTitle != null) {
                this.thirdButton.setText(this.builder.thirdButtonTitle);
            }
            this.thirdButton.setOnClickListener(this);
        } else {
            this.thirdButton.setVisibility(8);
        }
        applyColor(this.ok, this.builder.firstButtonColor);
        applyColor(this.secondButton, this.builder.secondButtonColor);
        applyColor(this.thirdButton, this.builder.thirdButtonColor);
    }

    /* renamed from: org.betup.ui.dialogs.InfoDialog$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$dialogs$InfoDialog$ButtonColor;

        static {
            int[] iArr = new int[ButtonColor.values().length];
            $SwitchMap$org$betup$ui$dialogs$InfoDialog$ButtonColor = iArr;
            try {
                iArr[ButtonColor.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private void applyColor(View view, ButtonColor buttonColor) {
        Log.d("PHOTOTEST", "APPLYING COLOR " + buttonColor);
        if (AnonymousClass1.$SwitchMap$org$betup$ui$dialogs$InfoDialog$ButtonColor[buttonColor.ordinal()] == 1) {
            view.setBackgroundResource(R.drawable.dialog_ok_selector);
        } else {
            view.setBackgroundResource(R.drawable.gray_button_selector);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.ok) {
            if (this.builder.onFirstButtonClickListener != null) {
                this.builder.onFirstButtonClickListener.onClick(this);
            }
            if (this.builder.dismissButton[0]) {
                dismiss();
                return;
            }
            return;
        }
        if (id == R.id.secondButton) {
            if (this.builder.onSecondButtonClickListener != null) {
                this.builder.onSecondButtonClickListener.onClick(this);
            }
            if (this.builder.dismissButton[1]) {
                dismiss();
                return;
            }
            return;
        }
        if (id != R.id.thirdButton) {
            return;
        }
        if (this.builder.onThirdButtonClickListener != null) {
            this.builder.onThirdButtonClickListener.onClick(this);
        }
        if (this.builder.dismissButton[2]) {
            dismiss();
        }
    }

    @OnClick({R.id.facebook})
    public void shareFacebookClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.FACEBOOK).setMsg(this.builder.social));
    }

    @OnClick({R.id.vk})
    public void shareVKClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.VK).setMsg(this.builder.social));
    }

    @OnClick({R.id.email})
    public void shareEmailClick() {
        dismiss();
        EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.OTHER).setMsg(this.builder.social));
    }

    public static class Builder {
        private boolean allowDismiss;
        private Context context;
        private String desc;
        private DialogInterface.OnDismissListener dismissListener;
        private long exp;
        private String firstButtonTitle;
        private int iconRes;
        private String iconUrl;
        private int money;
        private OnDialogButtonClickListener onFirstButtonClickListener;
        private OnDialogButtonClickListener onSecondButtonClickListener;
        private OnDialogButtonClickListener onThirdButtonClickListener;
        private String secondButtonTitle;
        private String social;
        private String subtitle;
        private String thirdButtonTitle;
        private String title;
        private int titleColor;
        private ButtonColor firstButtonColor = ButtonColor.GREEN;
        private ButtonColor secondButtonColor = ButtonColor.GRAY;
        private ButtonColor thirdButtonColor = ButtonColor.GRAY;
        private boolean[] dismissButton = new boolean[3];

        public Builder(Context context) {
            this.context = context;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder titleColor(int titleColor) {
            this.titleColor = titleColor;
            return this;
        }

        public Builder firstButtonTitle(String firstButtonTitle) {
            this.firstButtonTitle = firstButtonTitle;
            return this;
        }

        public Builder secondButtonTitle(String secondButtonTitle) {
            this.secondButtonTitle = secondButtonTitle;
            return this;
        }

        public Builder thirdButtonTitle(String thirdButtonTitle) {
            this.thirdButtonTitle = thirdButtonTitle;
            return this;
        }

        public Builder allowDismiss(boolean allowDismiss) {
            this.allowDismiss = allowDismiss;
            return this;
        }

        public Builder money(int money) {
            this.money = money;
            return this;
        }

        public Builder social(String social) {
            this.social = social;
            return this;
        }

        public Builder exp(long exp) {
            this.exp = exp;
            return this;
        }

        public Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder icon(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder icon(int iconRes) {
            this.iconRes = iconRes;
            return this;
        }

        public Builder onFirstButtonClick(OnDialogButtonClickListener onClickListener) {
            this.onFirstButtonClickListener = onClickListener;
            return this;
        }

        public Builder onSecondButtonClick(OnDialogButtonClickListener onClickListener) {
            this.onSecondButtonClickListener = onClickListener;
            return this;
        }

        public Builder onThirdButtonClick(OnDialogButtonClickListener onClickListener) {
            this.onThirdButtonClickListener = onClickListener;
            return this;
        }

        public Builder dismissOnFirstButtonClick(boolean dismissButton) {
            this.dismissButton[0] = dismissButton;
            return this;
        }

        public Builder dismissOnSecondButtonClick(boolean dismissButton) {
            this.dismissButton[1] = dismissButton;
            return this;
        }

        public Builder dismissListener(DialogInterface.OnDismissListener dismissListener) {
            this.dismissListener = dismissListener;
            return this;
        }

        public Builder dismissOnThirdButtonClick(boolean dismissButton) {
            this.dismissButton[1] = dismissButton;
            return this;
        }

        public Builder firstButtonColor(ButtonColor buttonColor) {
            this.firstButtonColor = buttonColor;
            return this;
        }

        public Builder secondButtonColor(ButtonColor buttonColor) {
            this.secondButtonColor = buttonColor;
            return this;
        }

        public Builder thirdButtonColor(ButtonColor buttonColor) {
            this.thirdButtonColor = buttonColor;
            return this;
        }

        public InfoDialog build() {
            return new InfoDialog(this.context, this);
        }
    }
}
