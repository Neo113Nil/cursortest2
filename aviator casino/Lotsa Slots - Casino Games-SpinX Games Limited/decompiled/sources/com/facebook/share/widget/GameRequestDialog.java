package com.facebook.share.widget;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class GameRequestDialog extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.GameRequestContent, com.facebook.share.widget.GameRequestDialog.Result> {
    private static final int DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    private static final java.lang.String GAME_REQUEST_DIALOG = "apprequests";

    public static boolean canShow() {
        return true;
    }

    public static final class Result {
        java.lang.String requestId;
        java.util.List<java.lang.String> to;

        private Result(android.os.Bundle results) {
            this.requestId = results.getString("request");
            this.to = new java.util.ArrayList();
            while (results.containsKey(java.lang.String.format(com.facebook.share.internal.ShareConstants.WEB_DIALOG_RESULT_PARAM_TO_ARRAY_MEMBER, java.lang.Integer.valueOf(this.to.size())))) {
                java.util.List<java.lang.String> list = this.to;
                list.add(results.getString(java.lang.String.format(com.facebook.share.internal.ShareConstants.WEB_DIALOG_RESULT_PARAM_TO_ARRAY_MEMBER, java.lang.Integer.valueOf(list.size()))));
            }
        }

        public java.lang.String getRequestId() {
            return this.requestId;
        }

        public java.util.List<java.lang.String> getRequestRecipients() {
            return this.to;
        }
    }

    public static void show(final android.app.Activity activity, final com.facebook.share.model.GameRequestContent gameRequestContent) {
        new com.facebook.share.widget.GameRequestDialog(activity).show(gameRequestContent);
    }

    public static void show(final androidx.fragment.app.Fragment fragment, final com.facebook.share.model.GameRequestContent gameRequestContent) {
        show(new com.facebook.internal.FragmentWrapper(fragment), gameRequestContent);
    }

    public static void show(final android.app.Fragment fragment, final com.facebook.share.model.GameRequestContent gameRequestContent) {
        show(new com.facebook.internal.FragmentWrapper(fragment), gameRequestContent);
    }

    private static void show(final com.facebook.internal.FragmentWrapper fragmentWrapper, final com.facebook.share.model.GameRequestContent gameRequestContent) {
        new com.facebook.share.widget.GameRequestDialog(fragmentWrapper).show(gameRequestContent);
    }

    public GameRequestDialog(android.app.Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public GameRequestDialog(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment));
    }

    public GameRequestDialog(android.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment));
    }

    private GameRequestDialog(com.facebook.internal.FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(final com.facebook.internal.CallbackManagerImpl callbackManager, final com.facebook.FacebookCallback<com.facebook.share.widget.GameRequestDialog.Result> callback) {
        final com.facebook.share.internal.ResultProcessor resultProcessor = callback == null ? null : new com.facebook.share.internal.ResultProcessor(callback) { // from class: com.facebook.share.widget.GameRequestDialog.1
            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(com.facebook.internal.AppCall appCall, android.os.Bundle results) {
                if (results != null) {
                    callback.onSuccess(new com.facebook.share.widget.GameRequestDialog.Result(results));
                } else {
                    onCancel(appCall);
                }
            }
        };
        callbackManager.registerCallback(getRequestCodeField(), new com.facebook.internal.CallbackManagerImpl.Callback() { // from class: com.facebook.share.widget.GameRequestDialog.2
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public boolean onActivityResult(int resultCode, android.content.Intent data) {
                return com.facebook.share.internal.ShareInternalUtility.handleActivityResult(com.facebook.share.widget.GameRequestDialog.this.getRequestCodeField(), resultCode, data, resultProcessor);
            }
        });
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected com.facebook.internal.AppCall createBaseAppCall() {
        return new com.facebook.internal.AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected java.util.List<com.facebook.internal.FacebookDialogBase<com.facebook.share.model.GameRequestContent, com.facebook.share.widget.GameRequestDialog.Result>.ModeHandler> getOrderedModeHandlers() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.facebook.share.widget.GameRequestDialog.ChromeCustomTabHandler());
        arrayList.add(new com.facebook.share.widget.GameRequestDialog.WebHandler());
        return arrayList;
    }

    private class ChromeCustomTabHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.GameRequestContent, com.facebook.share.widget.GameRequestDialog.Result>.ModeHandler {
        private ChromeCustomTabHandler() {
            super(com.facebook.share.widget.GameRequestDialog.this);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(final com.facebook.share.model.GameRequestContent content, boolean isBestEffort) {
            return com.facebook.internal.CustomTabUtils.getChromePackage() != null && com.facebook.internal.Validate.hasCustomTabRedirectActivity(com.facebook.share.widget.GameRequestDialog.this.getActivityContext(), com.facebook.internal.CustomTabUtils.getDefaultRedirectURI());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.GameRequestContent content) {
            com.facebook.share.internal.GameRequestValidation.validate(content);
            com.facebook.internal.AppCall createBaseAppCall = com.facebook.share.widget.GameRequestDialog.this.createBaseAppCall();
            android.os.Bundle create = com.facebook.share.internal.WebDialogParameters.create(content);
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
            if (currentAccessToken != null) {
                create.putString("app_id", currentAccessToken.getApplicationId());
            } else {
                create.putString("app_id", com.facebook.FacebookSdk.getApplicationId());
            }
            create.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, com.facebook.internal.CustomTabUtils.getDefaultRedirectURI());
            com.facebook.internal.DialogPresenter.setupAppCallForCustomTabDialog(createBaseAppCall, com.facebook.share.widget.GameRequestDialog.GAME_REQUEST_DIALOG, create);
            return createBaseAppCall;
        }
    }

    private class WebHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.GameRequestContent, com.facebook.share.widget.GameRequestDialog.Result>.ModeHandler {
        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(final com.facebook.share.model.GameRequestContent content, boolean isBestEffort) {
            return true;
        }

        private WebHandler() {
            super(com.facebook.share.widget.GameRequestDialog.this);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.GameRequestContent content) {
            com.facebook.share.internal.GameRequestValidation.validate(content);
            com.facebook.internal.AppCall createBaseAppCall = com.facebook.share.widget.GameRequestDialog.this.createBaseAppCall();
            com.facebook.internal.DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, com.facebook.share.widget.GameRequestDialog.GAME_REQUEST_DIALOG, com.facebook.share.internal.WebDialogParameters.create(content));
            return createBaseAppCall;
        }
    }
}
