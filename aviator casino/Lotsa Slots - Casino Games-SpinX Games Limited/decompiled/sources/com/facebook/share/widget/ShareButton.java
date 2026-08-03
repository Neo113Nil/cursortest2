package com.facebook.share.widget;

/* loaded from: classes2.dex */
public final class ShareButton extends com.facebook.share.widget.ShareButtonBase {
    public ShareButton(final android.content.Context context) {
        super(context, null, 0, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }

    public ShareButton(final android.content.Context context, final android.util.AttributeSet attrs) {
        super(context, attrs, 0, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }

    public ShareButton(final android.content.Context context, final android.util.AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultStyleResource() {
        return com.facebook.share.R.style.com_facebook_button_share;
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultRequestCode() {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    protected com.facebook.share.widget.ShareDialog getDialog() {
        com.facebook.share.widget.ShareDialog shareDialog;
        if (getFragment() != null) {
            shareDialog = new com.facebook.share.widget.ShareDialog(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            shareDialog = new com.facebook.share.widget.ShareDialog(getNativeFragment(), getRequestCode());
        } else {
            shareDialog = new com.facebook.share.widget.ShareDialog(getActivity(), getRequestCode());
        }
        shareDialog.setCallbackManager(getCallbackManager());
        return shareDialog;
    }

    @Override // com.facebook.share.widget.ShareButtonBase, com.facebook.FacebookButtonBase
    protected void configureButton(final android.content.Context context, final android.util.AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super.configureButton(context, attrs, defStyleAttr, defStyleRes);
        setCompoundDrawablesWithIntrinsicBounds(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }
}
