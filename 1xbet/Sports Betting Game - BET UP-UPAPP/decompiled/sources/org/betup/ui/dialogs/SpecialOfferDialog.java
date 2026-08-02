package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.utils.PicassoHelper;

/* loaded from: classes2.dex */
public class SpecialOfferDialog extends BaseDialog {

    @BindView(R.id.icon)
    ImageView icon;
    private OnOfferAcceptListener listener;
    private String photoUrl;

    @BindView(R.id.progress)
    View progress;

    public interface OnOfferAcceptListener {
        void offerAccepted();
    }

    @OnClick({R.id.container})
    public void onContainerClick() {
        dismiss();
    }

    public SpecialOfferDialog(Context context) {
        super(R.layout.dialog_special_offer, context);
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCanceledOnTouchOutside(true);
        ButterKnife.bind(this);
        this.icon.setImageResource(R.drawable.bet);
        PicassoHelper.with(getContext()).setImageView(this.icon).setImageUrl(this.photoUrl).load();
    }

    public static SpecialOfferDialog newInstance(Context context, String photoUrl, OnOfferAcceptListener listener) {
        SpecialOfferDialog specialOfferDialog = new SpecialOfferDialog(context);
        specialOfferDialog.listener = listener;
        specialOfferDialog.photoUrl = photoUrl;
        specialOfferDialog.show();
        return specialOfferDialog;
    }

    @OnClick({R.id.icon})
    public void onIconClick() {
        OnOfferAcceptListener onOfferAcceptListener = this.listener;
        if (onOfferAcceptListener != null) {
            onOfferAcceptListener.offerAccepted();
        }
    }
}
