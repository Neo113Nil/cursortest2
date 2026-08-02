package org.betup.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes2.dex */
public class MessageSendSuccessfullyDialog_ViewBinding implements Unbinder {
    private MessageSendSuccessfullyDialog target;
    private View view7f0a0524;

    public MessageSendSuccessfullyDialog_ViewBinding(MessageSendSuccessfullyDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public MessageSendSuccessfullyDialog_ViewBinding(final MessageSendSuccessfullyDialog target, View source) {
        this.target = target;
        target.message = (TextView) Utils.findRequiredViewAsType(source, R.id.message_success_send, "field 'message'", TextView.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.ok, "method 'onClick'");
        this.view7f0a0524 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.MessageSendSuccessfullyDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.onClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MessageSendSuccessfullyDialog messageSendSuccessfullyDialog = this.target;
        if (messageSendSuccessfullyDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        messageSendSuccessfullyDialog.message = null;
        this.view7f0a0524.setOnClickListener(null);
        this.view7f0a0524 = null;
    }
}
