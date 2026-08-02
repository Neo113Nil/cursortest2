package org.betup.ui.dialogs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.Map;
import org.betup.R;
import org.betup.utils.PicassoHelper;

/* loaded from: classes2.dex */
public class PromoDialog extends BaseDialog {

    @BindView(R.id.banner)
    ImageView banner;
    private Map<String, String> data;

    @BindView(R.id.msg)
    TextView msg;

    @BindView(R.id.title)
    TextView title;

    public PromoDialog(Context context) {
        super(R.layout.dialog_promo, context);
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.title.setText(this.data.get("title"));
        this.msg.setText(this.data.get("desc"));
        PicassoHelper.with(this.context).setImageUrl(this.data.get("bannerUrl")).setImageView(this.banner).load();
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @OnClick({R.id.banner})
    public void onBannerClick() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.data.get("url")));
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            this.context.startActivity(intent);
        }
    }

    public static PromoDialog showDialog(Context context, Map<String, String> data) {
        PromoDialog promoDialog = new PromoDialog(context);
        promoDialog.data = data;
        promoDialog.show();
        return promoDialog;
    }
}
