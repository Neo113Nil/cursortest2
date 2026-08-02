package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class InfoDialog_ViewBinding implements Unbinder {
    private InfoDialog target;
    private View view7f0a026d;
    private View view7f0a02c3;
    private View view7f0a07cf;

    public InfoDialog_ViewBinding(InfoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public InfoDialog_ViewBinding(final InfoDialog target, View source) {
        this.target = target;
        target.social = Utils.findRequiredView(source, R.id.social, "field 'social'");
        target.titleView = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'titleView'", TextView.class);
        target.subtitleView = (TextView) Utils.findRequiredViewAsType(source, R.id.subtitle, "field 'subtitleView'", TextView.class);
        target.descView = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'descView'", TextView.class);
        target.iconView = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'iconView'", ImageView.class);
        target.ok = (TextView) Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", TextView.class);
        target.money = (TextView) Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
        target.xp = (TextView) Utils.findRequiredViewAsType(source, R.id.xp, "field 'xp'", TextView.class);
        target.secondButton = (TextView) Utils.findRequiredViewAsType(source, R.id.secondButton, "field 'secondButton'", TextView.class);
        target.thirdButton = (TextView) Utils.findRequiredViewAsType(source, R.id.thirdButton, "field 'thirdButton'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.facebook, "method 'shareFacebookClick'");
        this.view7f0a02c3 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.InfoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareFacebookClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.vk, "method 'shareVKClick'");
        this.view7f0a07cf = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.InfoDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareVKClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.email, "method 'shareEmailClick'");
        this.view7f0a026d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.InfoDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareEmailClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoDialog infoDialog = this.target;
        if (infoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        infoDialog.social = null;
        infoDialog.titleView = null;
        infoDialog.subtitleView = null;
        infoDialog.descView = null;
        infoDialog.iconView = null;
        infoDialog.ok = null;
        infoDialog.money = null;
        infoDialog.xp = null;
        infoDialog.secondButton = null;
        infoDialog.thirdButton = null;
        this.view7f0a02c3.setOnClickListener(null);
        this.view7f0a02c3 = null;
        this.view7f0a07cf.setOnClickListener(null);
        this.view7f0a07cf = null;
        this.view7f0a026d.setOnClickListener(null);
        this.view7f0a026d = null;
    }
}
