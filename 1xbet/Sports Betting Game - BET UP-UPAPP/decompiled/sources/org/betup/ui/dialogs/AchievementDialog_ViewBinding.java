package org.betup.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class AchievementDialog_ViewBinding implements Unbinder {
    private AchievementDialog target;
    private View view7f0a02cd;
    private View view7f0a0524;
    private View view7f0a0687;
    private View view7f0a07d2;

    public AchievementDialog_ViewBinding(AchievementDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public AchievementDialog_ViewBinding(final AchievementDialog target, View source) {
        this.target = target;
        target.titleLabel = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'titleLabel'", TextView.class);
        target.subtitleLabel = (TextView) Utils.findRequiredViewAsType(source, R.id.desc, "field 'subtitleLabel'", TextView.class);
        target.iconView = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'iconView'", ImageView.class);
        target.betcoinsLabel = (TextView) Utils.findRequiredViewAsType(source, R.id.betcoins, "field 'betcoinsLabel'", TextView.class);
        target.stars = Utils.findRequiredView(source, R.id.stars, "field 'stars'");
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onOkClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.AchievementDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onOkClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.fb_share, "method 'shareFacebookClick'");
        this.view7f0a02cd = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.AchievementDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareFacebookClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.vk_share, "method 'shareVKClick'");
        this.view7f0a07d2 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.AchievementDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareVKClick();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(source, R.id.share, "method 'shareEmailClick'");
        this.view7f0a0687 = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.AchievementDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.shareEmailClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AchievementDialog achievementDialog = this.target;
        if (achievementDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        achievementDialog.titleLabel = null;
        achievementDialog.subtitleLabel = null;
        achievementDialog.iconView = null;
        achievementDialog.betcoinsLabel = null;
        achievementDialog.stars = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
        this.view7f0a02cd.setOnClickListener(null);
        this.view7f0a02cd = null;
        this.view7f0a07d2.setOnClickListener(null);
        this.view7f0a07d2 = null;
        this.view7f0a0687.setOnClickListener(null);
        this.view7f0a0687 = null;
    }
}
