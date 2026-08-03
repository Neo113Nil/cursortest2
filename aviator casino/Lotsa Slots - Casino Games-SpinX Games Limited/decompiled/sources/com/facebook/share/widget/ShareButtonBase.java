package com.facebook.share.widget;

/* loaded from: classes2.dex */
public abstract class ShareButtonBase extends com.facebook.FacebookButtonBase {
    private com.facebook.CallbackManager callbackManager;
    private boolean enabledExplicitlySet;
    private int requestCode;
    private com.facebook.share.model.ShareContent shareContent;

    protected abstract com.facebook.share.widget.ShareDialog getDialog();

    protected ShareButtonBase(final android.content.Context context, final android.util.AttributeSet attrs, final int defStyleAttr, final java.lang.String analyticsButtonCreatedEventName, final java.lang.String analyticsButtonTappedEventName) {
        super(context, attrs, defStyleAttr, 0, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        this.requestCode = 0;
        this.enabledExplicitlySet = false;
        this.requestCode = isInEditMode() ? 0 : getDefaultRequestCode();
        internalSetEnabled(false);
    }

    public com.facebook.share.model.ShareContent getShareContent() {
        return this.shareContent;
    }

    public void setShareContent(final com.facebook.share.model.ShareContent shareContent) {
        this.shareContent = shareContent;
        if (this.enabledExplicitlySet) {
            return;
        }
        internalSetEnabled(canShare());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.enabledExplicitlySet = true;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getRequestCode() {
        return this.requestCode;
    }

    protected void setRequestCode(final int requestCode) {
        if (com.facebook.FacebookSdk.isFacebookRequestCode(requestCode)) {
            throw new java.lang.IllegalArgumentException("Request code " + requestCode + " cannot be within the range reserved by the Facebook SDK.");
        }
        this.requestCode = requestCode;
    }

    public void registerCallback(final com.facebook.CallbackManager callbackManager, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        memorizeCallbackManager(callbackManager);
        com.facebook.share.internal.ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackManager, callback);
    }

    public void registerCallback(final com.facebook.CallbackManager callbackManager, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, final int requestCode) {
        setRequestCode(requestCode);
        registerCallback(callbackManager, callback);
    }

    @Override // com.facebook.FacebookButtonBase
    protected void configureButton(final android.content.Context context, final android.util.AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super.configureButton(context, attrs, defStyleAttr, defStyleRes);
        setInternalOnClickListener(getShareOnClickListener());
    }

    protected boolean canShare() {
        return getDialog().canShow((com.facebook.share.widget.ShareDialog) getShareContent());
    }

    protected android.view.View.OnClickListener getShareOnClickListener() {
        return new android.view.View.OnClickListener() { // from class: com.facebook.share.widget.ShareButtonBase.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    com.facebook.share.widget.ShareButtonBase.this.callExternalOnClickListener(v);
                    com.facebook.share.widget.ShareButtonBase.this.getDialog().show(com.facebook.share.widget.ShareButtonBase.this.getShareContent());
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            }
        };
    }

    private void internalSetEnabled(boolean enabled) {
        setEnabled(enabled);
        this.enabledExplicitlySet = false;
    }

    private void memorizeCallbackManager(com.facebook.CallbackManager callbackManager) {
        com.facebook.CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            android.util.Log.w(com.facebook.share.widget.ShareButtonBase.class.toString(), "You're registering a callback on a Facebook Share Button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    protected com.facebook.CallbackManager getCallbackManager() {
        return this.callbackManager;
    }
}
