package com.facebook.share.widget;

/* loaded from: classes2.dex */
public final class SendButton extends com.facebook.share.widget.ShareButtonBase {
    public SendButton(final android.content.Context context) {
        super(context, null, 0, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }

    public SendButton(final android.content.Context context, final android.util.AttributeSet attrs) {
        super(context, attrs, 0, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }

    public SendButton(final android.content.Context context, final android.util.AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultStyleResource() {
        return com.facebook.share.R.style.com_facebook_button_send;
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultRequestCode() {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    protected com.facebook.share.widget.ShareDialog getDialog() {
        com.facebook.share.widget.MessageDialog messageDialog;
        if (getFragment() != null) {
            messageDialog = new com.facebook.share.widget.MessageDialog(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            messageDialog = new com.facebook.share.widget.MessageDialog(getNativeFragment(), getRequestCode());
        } else {
            messageDialog = new com.facebook.share.widget.MessageDialog(getActivity(), getRequestCode());
        }
        messageDialog.setCallbackManager(getCallbackManager());
        return messageDialog;
    }
}
