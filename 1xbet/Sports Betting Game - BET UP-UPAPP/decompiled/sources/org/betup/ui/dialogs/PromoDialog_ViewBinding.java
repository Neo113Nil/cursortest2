package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class PromoDialog_ViewBinding implements Unbinder {
    private PromoDialog target;
    private View view7f0a00d1;
    private View view7f0a0524;

    public PromoDialog_ViewBinding(PromoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public PromoDialog_ViewBinding(final PromoDialog target, View source) {
        this.target = target;
        target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
        target.msg = (TextView) Utils.findRequiredViewAsType(source, R.id.msg, "field 'msg'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.banner, "field 'banner' and method 'onBannerClick'");
        target.banner = (ImageView) Utils.castView(findRequiredView, R.id.banner, "field 'banner'", ImageView.class);
        this.view7f0a00d1 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.PromoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onBannerClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.PromoDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PromoDialog promoDialog = this.target;
        if (promoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        promoDialog.title = null;
        promoDialog.msg = null;
        promoDialog.banner = null;
        this.view7f0a00d1.setOnClickListener(null);
        this.view7f0a00d1 = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
