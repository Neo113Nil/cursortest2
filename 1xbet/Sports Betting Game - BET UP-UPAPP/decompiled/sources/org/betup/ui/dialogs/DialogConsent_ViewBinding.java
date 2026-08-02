package org.betup.ui.dialogs;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class DialogConsent_ViewBinding implements Unbinder {
    private DialogConsent target;
    private View view7f0a0503;
    private View view7f0a07fc;

    public DialogConsent_ViewBinding(DialogConsent target) {
        this(target, target.getWindow().getDecorView());
    }

    public DialogConsent_ViewBinding(final DialogConsent target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.yes, "method 'onYesClick'");
        this.view7f0a07fc = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogConsent_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onYesClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.no, "method 'onNoClick'");
        this.view7f0a0503 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.DialogConsent_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onNoClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.target == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        this.view7f0a07fc.setOnClickListener(null);
        this.view7f0a07fc = null;
        this.view7f0a0503.setOnClickListener(null);
        this.view7f0a0503 = null;
    }
}
