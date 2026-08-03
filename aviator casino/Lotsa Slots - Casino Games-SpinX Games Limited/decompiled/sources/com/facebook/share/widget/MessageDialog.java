package com.facebook.share.widget;

/* loaded from: classes2.dex */
public final class MessageDialog extends com.facebook.share.widget.ShareDialog implements com.facebook.share.Sharer {
    private static final int DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    private boolean shouldFailOnDataError;

    public static void show(final android.app.Activity activity, final com.facebook.share.model.ShareContent shareContent) {
        new com.facebook.share.widget.MessageDialog(activity).show(shareContent);
    }

    public static void show(final androidx.fragment.app.Fragment fragment, final com.facebook.share.model.ShareContent shareContent) {
        show(new com.facebook.internal.FragmentWrapper(fragment), shareContent);
    }

    public static void show(final android.app.Fragment fragment, final com.facebook.share.model.ShareContent shareContent) {
        show(new com.facebook.internal.FragmentWrapper(fragment), shareContent);
    }

    private static void show(final com.facebook.internal.FragmentWrapper fragmentWrapper, final com.facebook.share.model.ShareContent shareContent) {
        new com.facebook.share.widget.MessageDialog(fragmentWrapper).show(shareContent);
    }

    public static boolean canShow(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> contentType) {
        com.facebook.internal.DialogFeature feature = getFeature(contentType);
        return feature != null && com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(feature);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageDialog(android.app.Activity activity) {
        super(activity, r0);
        int i = DEFAULT_REQUEST_CODE;
        this.shouldFailOnDataError = false;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(i);
    }

    public MessageDialog(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment));
    }

    public MessageDialog(android.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MessageDialog(com.facebook.internal.FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, r0);
        int i = DEFAULT_REQUEST_CODE;
        this.shouldFailOnDataError = false;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(i);
    }

    MessageDialog(android.app.Activity activity, int requestCode) {
        super(activity, requestCode);
        this.shouldFailOnDataError = false;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(requestCode);
    }

    MessageDialog(androidx.fragment.app.Fragment fragment, int requestCode) {
        this(new com.facebook.internal.FragmentWrapper(fragment), requestCode);
    }

    MessageDialog(android.app.Fragment fragment, int requestCode) {
        this(new com.facebook.internal.FragmentWrapper(fragment), requestCode);
    }

    private MessageDialog(com.facebook.internal.FragmentWrapper fragmentWrapper, int requestCode) {
        super(fragmentWrapper, requestCode);
        this.shouldFailOnDataError = false;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(requestCode);
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(final com.facebook.internal.CallbackManagerImpl callbackManager, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        com.facebook.share.internal.ShareInternalUtility.registerSharerCallback(getRequestCodeField(), callbackManager, callback);
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.share.Sharer
    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.share.Sharer
    public void setShouldFailOnDataError(boolean shouldFailOnDataError) {
        this.shouldFailOnDataError = shouldFailOnDataError;
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    protected com.facebook.internal.AppCall createBaseAppCall() {
        return new com.facebook.internal.AppCall(getRequestCodeField());
    }

    @Override // com.facebook.share.widget.ShareDialog, com.facebook.internal.FacebookDialogBase
    protected java.util.List<com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.facebook.share.widget.MessageDialog.NativeHandler());
        return arrayList;
    }

    private class NativeHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private NativeHandler() {
            super(com.facebook.share.widget.MessageDialog.this);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public /* bridge */ /* synthetic */ boolean canShow(final com.facebook.share.model.ShareContent<?, ?> shareContent, boolean isBestEffort) {
            return canShow2((com.facebook.share.model.ShareContent) shareContent, isBestEffort);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public /* bridge */ /* synthetic */ com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.ShareContent<?, ?> content) {
            return createAppCall2((com.facebook.share.model.ShareContent) content);
        }

        /* renamed from: canShow, reason: avoid collision after fix types in other method */
        public boolean canShow2(final com.facebook.share.model.ShareContent shareContent, boolean isBestEffort) {
            return shareContent != null && com.facebook.share.widget.MessageDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) shareContent.getClass());
        }

        /* renamed from: createAppCall, reason: avoid collision after fix types in other method */
        public com.facebook.internal.AppCall createAppCall2(final com.facebook.share.model.ShareContent content) {
            com.facebook.share.internal.ShareContentValidation.validateForMessage(content);
            final com.facebook.internal.AppCall createBaseAppCall = com.facebook.share.widget.MessageDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = com.facebook.share.widget.MessageDialog.this.getShouldFailOnDataError();
            com.facebook.share.widget.MessageDialog.logDialogShare(com.facebook.share.widget.MessageDialog.this.getActivityContext(), content, createBaseAppCall);
            com.facebook.internal.DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new com.facebook.internal.DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.MessageDialog.NativeHandler.1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getParameters() {
                    return com.facebook.share.internal.NativeDialogParameters.create(createBaseAppCall.getCallId(), (com.facebook.share.model.ShareContent<?, ?>) content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getLegacyParameters() {
                    return com.facebook.share.internal.LegacyNativeDialogParameters.create(createBaseAppCall.getCallId(), (com.facebook.share.model.ShareContent<?, ?>) content, shouldFailOnDataError);
                }
            }, com.facebook.share.widget.MessageDialog.getFeature(content.getClass()));
            return createBaseAppCall;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.internal.DialogFeature getFeature(java.lang.Class<? extends com.facebook.share.model.ShareContent> type) {
        if (com.facebook.share.model.ShareLinkContent.class.isAssignableFrom(type)) {
            return com.facebook.share.internal.MessageDialogFeature.MESSAGE_DIALOG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logDialogShare(android.content.Context context, com.facebook.share.model.ShareContent content, com.facebook.internal.AppCall appCall) {
        java.lang.String str;
        com.facebook.internal.DialogFeature feature = getFeature(content.getClass());
        if (feature == com.facebook.share.internal.MessageDialogFeature.MESSAGE_DIALOG) {
            str = "status";
        } else if (feature == com.facebook.share.internal.MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
            str = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE;
        } else if (feature == com.facebook.share.internal.MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
            str = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE;
        } else {
            str = "unknown";
        }
        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str);
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_UUID, appCall.getCallId().toString());
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID, content.getPageId());
        internalAppEventsLogger.logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_SHARE_MESSENGER_DIALOG_SHOW, bundle);
    }
}
