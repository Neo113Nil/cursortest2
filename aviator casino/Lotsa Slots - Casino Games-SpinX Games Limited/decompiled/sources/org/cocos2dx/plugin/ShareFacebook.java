package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class ShareFacebook implements org.cocos2dx.plugin.InterfaceShare {
    private static final java.lang.String LOG_TAG = "ShareFacebook";
    private static boolean bDebug = true;
    private static org.cocos2dx.plugin.InterfaceShare mAdapter;
    private static android.app.Activity mContext;
    org.cocos2dx.plugin.ShareFacebook.FacebookDialogCallback dialogCallback = new org.cocos2dx.plugin.ShareFacebook.FacebookDialogCallback();

    /* JADX INFO: Access modifiers changed from: private */
    public void FBInviteDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBMessageOpenGraphDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBShareOpenGraphDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
    }

    protected static void LogE(java.lang.String str, java.lang.Exception exc) {
        android.util.Log.e(LOG_TAG, str, exc);
        exc.printStackTrace();
    }

    protected static void LogD(java.lang.String str) {
        if (bDebug) {
            android.util.Log.d(LOG_TAG, str);
        }
    }

    public ShareFacebook(android.content.Context context) {
        mContext = (android.app.Activity) context;
        mAdapter = this;
    }

    @Override // org.cocos2dx.plugin.InterfaceShare
    public void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
        LogD("not supported in Facebook pluign");
    }

    @Override // org.cocos2dx.plugin.InterfaceShare
    public void share(final java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
        LogD("share invoked " + hashtable.toString());
        if (networkReachable()) {
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.ShareFacebook.1
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String str = (java.lang.String) hashtable.get("link");
                    com.facebook.share.model.ShareLinkContent build = new com.facebook.share.model.ShareLinkContent.Builder().setContentUrl(android.net.Uri.parse(str)).build();
                    com.facebook.share.widget.ShareDialog shareDialog = new com.facebook.share.widget.ShareDialog(org.cocos2dx.plugin.ShareFacebook.mContext);
                    shareDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), org.cocos2dx.plugin.ShareFacebook.this.dialogCallback);
                    shareDialog.show(build);
                }
            });
        }
    }

    @Override // org.cocos2dx.plugin.InterfaceShare
    public void setDebugMode(boolean z) {
        bDebug = z;
    }

    @Override // org.cocos2dx.plugin.InterfaceShare
    public java.lang.String getSDKVersion() {
        return "4.1.2";
    }

    @Override // org.cocos2dx.plugin.InterfaceShare
    public java.lang.String getPluginVersion() {
        return "0.3.0";
    }

    private boolean networkReachable() {
        boolean z = false;
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    z = true;
                }
            }
        } catch (java.lang.Exception e) {
            LogE("Fail to check network status", e);
        }
        LogD("NetWork reachable : " + z);
        return z;
    }

    public boolean canPresentDialogWithParams(org.json.JSONObject jSONObject) {
        java.lang.String string;
        try {
            string = jSONObject.getString("dialog");
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        if ("shareLink".equals(string)) {
            return com.facebook.share.widget.ShareDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.ShareLinkContent.class);
        }
        if ("shareOpenGraph".equals(string)) {
            return false;
        }
        if ("sharePhoto".equals(string)) {
            return com.facebook.share.widget.ShareDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.SharePhotoContent.class);
        }
        if ("shareVideo".equals(string)) {
            return com.facebook.share.widget.ShareDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.ShareVideoContent.class);
        }
        if ("apprequests".equals(string)) {
            return true;
        }
        if ("messageLink".equals(string)) {
            return com.facebook.share.widget.MessageDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.ShareLinkContent.class);
        }
        if ("messageOpenGraph".equals(string)) {
            return false;
        }
        if ("messagePhoto".equals(string)) {
            return com.facebook.share.widget.MessageDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.SharePhotoContent.class);
        }
        if ("messageVideo".equals(string)) {
            return com.facebook.share.widget.MessageDialog.canShow((java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>>) com.facebook.share.model.ShareVideoContent.class);
        }
        return false;
    }

    public void dialog(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.ShareFacebook.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.json.JSONObject convertParams = org.cocos2dx.plugin.ShareFacebook.this.convertParams(jSONObject);
                    java.lang.String string = convertParams.getString("dialog");
                    if ("shareLink".equals(string)) {
                        org.cocos2dx.plugin.ShareFacebook.this.FBShareDialog(convertParams);
                    } else if (!"feedDialog".equals(string)) {
                        if ("inviteDialog".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBInviteDialog(convertParams);
                        } else if ("newinviteDialog".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBNewInviteDialog(convertParams);
                        } else if ("inviteByID".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBInviteByID(convertParams);
                        } else if ("sendGift".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBSendGift(convertParams);
                        } else if ("shareOpenGraph".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBShareOpenGraphDialog(convertParams);
                        } else if ("sharePhoto".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBSharePhotoDialog(convertParams);
                        } else if ("apprequests".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.AppRequestDialog(convertParams);
                        } else if ("messageLink".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBMessageDialog(convertParams);
                        } else if ("messageOpenGraph".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBMessageOpenGraphDialog(convertParams);
                        } else if ("messagePhoto".equals(string)) {
                            org.cocos2dx.plugin.ShareFacebook.this.FBMessagePhotoDialog(convertParams);
                        }
                    }
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBSharePhotoDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String string = jSONObject.getString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
        if ("".equals(string)) {
            LogD("Must specify one photo");
            return;
        }
        com.facebook.share.model.SharePhotoContent build = new com.facebook.share.model.SharePhotoContent.Builder().addPhoto(new com.facebook.share.model.SharePhoto.Builder().setImageUrl(android.net.Uri.parse(string)).build()).build();
        com.facebook.share.widget.ShareDialog shareDialog = new com.facebook.share.widget.ShareDialog(mContext);
        shareDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), this.dialogCallback);
        shareDialog.show(build);
    }

    public void appRequest(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.ShareFacebook.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.cocos2dx.plugin.ShareFacebook.this.AppRequestDialog(org.cocos2dx.plugin.ShareFacebook.this.convertParams(jSONObject));
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBNewInviteDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.facebook.share.widget.GameRequestDialog gameRequestDialog = new com.facebook.share.widget.GameRequestDialog(mContext);
        gameRequestDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), new com.facebook.FacebookCallback<com.facebook.share.widget.GameRequestDialog.Result>() { // from class: org.cocos2dx.plugin.ShareFacebook.4
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
            }

            @Override // com.facebook.FacebookCallback
            public void onError(com.facebook.FacebookException facebookException) {
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(com.facebook.share.widget.GameRequestDialog.Result result) {
                org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 0, result.getRequestId() + io.ktor.sse.ServerSentEventKt.SPACE + result.getRequestRecipients());
            }
        });
        gameRequestDialog.show(new com.facebook.share.model.GameRequestContent.Builder().setMessage(jSONObject.getString("message")).setTitle(jSONObject.getString("title")).setFilters(com.facebook.share.model.GameRequestContent.Filters.APP_NON_USERS).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBInviteByID(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.facebook.share.widget.GameRequestDialog gameRequestDialog = new com.facebook.share.widget.GameRequestDialog(mContext);
        gameRequestDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), new com.facebook.FacebookCallback<com.facebook.share.widget.GameRequestDialog.Result>() { // from class: org.cocos2dx.plugin.ShareFacebook.5
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
            }

            @Override // com.facebook.FacebookCallback
            public void onError(com.facebook.FacebookException facebookException) {
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(com.facebook.share.widget.GameRequestDialog.Result result) {
                org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 0, result.getRequestId() + io.ktor.sse.ServerSentEventKt.SPACE + result.getRequestRecipients());
            }
        });
        gameRequestDialog.show(new com.facebook.share.model.GameRequestContent.Builder().setMessage(jSONObject.getString("message")).setTitle(jSONObject.getString("title")).setTo(jSONObject.getString("to")).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBSendGift(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.facebook.share.widget.GameRequestDialog gameRequestDialog = new com.facebook.share.widget.GameRequestDialog(mContext);
        gameRequestDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), new com.facebook.FacebookCallback<com.facebook.share.widget.GameRequestDialog.Result>() { // from class: org.cocos2dx.plugin.ShareFacebook.6
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
            }

            @Override // com.facebook.FacebookCallback
            public void onError(com.facebook.FacebookException facebookException) {
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(com.facebook.share.widget.GameRequestDialog.Result result) {
                org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 0, result.getRequestId() + io.ktor.sse.ServerSentEventKt.SPACE + result.getRequestRecipients());
            }
        });
        gameRequestDialog.show(new com.facebook.share.model.GameRequestContent.Builder().setMessage(jSONObject.getString("message")).setTitle(jSONObject.getString("title")).setTo(jSONObject.getString("to")).setActionType(com.facebook.share.model.GameRequestContent.ActionType.SEND).setObjectId(jSONObject.getString("object")).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AppRequestDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
        new android.os.Bundle();
        java.lang.String safeGetJsonString = safeGetJsonString(jSONObject, "message");
        if (safeGetJsonString == null) {
            org.cocos2dx.plugin.ShareWrapper.onShareResult(mAdapter, 1, "{ \"error_message\" : \" need to add property 'message' \"}");
            return;
        }
        com.facebook.share.model.GameRequestContent build = new com.facebook.share.model.GameRequestContent.Builder().setMessage(safeGetJsonString).setTitle(jSONObject.getString("title")).setFilters(com.facebook.share.model.GameRequestContent.Filters.valueOf(jSONObject.getString(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_FILTERS))).setObjectId(jSONObject.getString("object_id")).setActionType(com.facebook.share.model.GameRequestContent.ActionType.valueOf(jSONObject.getString(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE))).build();
        com.facebook.share.widget.GameRequestDialog gameRequestDialog = new com.facebook.share.widget.GameRequestDialog(mContext);
        gameRequestDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), new com.facebook.FacebookCallback<com.facebook.share.widget.GameRequestDialog.Result>() { // from class: org.cocos2dx.plugin.ShareFacebook.7
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(com.facebook.share.widget.GameRequestDialog.Result result) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("{\"request\":\"");
                stringBuffer.append(result.getRequestId());
                stringBuffer.append("\", \"to\":[");
                java.util.Iterator<java.lang.String> it = result.getRequestRecipients().iterator();
                while (it.hasNext()) {
                    it.next();
                    stringBuffer.append("\"");
                    stringBuffer.append(it.next());
                    stringBuffer.append("\",");
                }
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                stringBuffer.append("]}");
                org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 0, stringBuffer.toString());
            }

            @Override // com.facebook.FacebookCallback
            public void onError(com.facebook.FacebookException facebookException) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("{\"error_message\":\"");
                stringBuffer.append(facebookException.getMessage()).append("\"}");
                org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 1, stringBuffer.toString());
            }
        });
        gameRequestDialog.show(build);
    }

    private java.lang.String safeGetJsonString(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return jSONObject.getString(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBShareDialog(org.json.JSONObject jSONObject) {
        java.lang.String safeGetJsonString = safeGetJsonString(jSONObject, "link");
        if (safeGetJsonString == null) {
            org.cocos2dx.plugin.ShareWrapper.onShareResult(mAdapter, 1, "{ \"error_message\" : \" need to add property 'link' \"}");
            return;
        }
        com.facebook.share.model.ShareLinkContent.Builder builder = new com.facebook.share.model.ShareLinkContent.Builder();
        builder.setContentUrl(android.net.Uri.parse(safeGetJsonString));
        com.facebook.share.widget.ShareDialog shareDialog = new com.facebook.share.widget.ShareDialog(mContext);
        shareDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), this.dialogCallback);
        shareDialog.show(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject convertParams(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            jSONObject2.put(next, jSONObject.getString(next));
        }
        if (jSONObject2.has("title")) {
            jSONObject2.put(com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM, jSONObject2.getString("title"));
        }
        if (jSONObject2.has("site")) {
            jSONObject2.put("name", jSONObject2.getString("site"));
        }
        if (jSONObject2.has("siteUrl") || jSONObject2.has("url")) {
            jSONObject2.put("link", jSONObject2.has("siteUrl") ? jSONObject2.getString("siteUrl") : jSONObject2.getString("url"));
        }
        if (jSONObject2.has("text")) {
            jSONObject2.put("description", jSONObject2.getString("text"));
        }
        if (jSONObject2.has(com.helpshift.proactive.InAppViewConstants.IMAGE_URL) || jSONObject2.has("imagePath")) {
            java.lang.String string = jSONObject2.has(com.helpshift.proactive.InAppViewConstants.IMAGE_URL) ? jSONObject2.getString(com.helpshift.proactive.InAppViewConstants.IMAGE_URL) : jSONObject2.getString("imagePath");
            jSONObject2.put(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, string);
            jSONObject2.put("picture", string);
        }
        if (jSONObject2.has(com.helpshift.HelpshiftEvent.DATA_ACTION_TYPE)) {
            jSONObject2.put(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, jSONObject2.getString(com.helpshift.HelpshiftEvent.DATA_ACTION_TYPE));
        }
        if (jSONObject2.has("previewPropertyName")) {
            jSONObject2.put("preview_property_name", jSONObject2.getString("previewPropertyName"));
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBMessageDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.getString(com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM);
        java.lang.String string = jSONObject.getString("link");
        jSONObject.getString("description");
        jSONObject.getString("picture");
        com.facebook.share.model.ShareLinkContent build = new com.facebook.share.model.ShareLinkContent.Builder().setContentUrl(android.net.Uri.parse(string)).build();
        com.facebook.share.widget.MessageDialog messageDialog = new com.facebook.share.widget.MessageDialog(mContext);
        messageDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), this.dialogCallback);
        messageDialog.show(build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FBMessagePhotoDialog(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String string = jSONObject.getString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
        if ("".equals(string)) {
            LogD("Must specify one photo");
            return;
        }
        com.facebook.share.model.SharePhotoContent build = new com.facebook.share.model.SharePhotoContent.Builder().addPhoto(new com.facebook.share.model.SharePhoto.Builder().setImageUrl(android.net.Uri.parse(string)).build()).build();
        com.facebook.share.widget.MessageDialog messageDialog = new com.facebook.share.widget.MessageDialog(mContext);
        messageDialog.registerCallback(org.cocos2dx.plugin.FacebookWrapper.getCallbackManager(), this.dialogCallback);
        messageDialog.show(build);
    }

    private class FacebookDialogCallback implements com.facebook.FacebookCallback {
        private FacebookDialogCallback() {
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 1, "{ \"error_message\" : \"Cancel\"}");
        }

        @Override // com.facebook.FacebookCallback
        public void onError(com.facebook.FacebookException facebookException) {
            org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 1, "{ \"error_message\" : \"" + facebookException.getMessage() + "\"}");
        }

        @Override // com.facebook.FacebookCallback
        public void onSuccess(java.lang.Object obj) {
            org.cocos2dx.plugin.ShareWrapper.onShareResult(org.cocos2dx.plugin.ShareFacebook.mAdapter, 0, "{\"didComplete\":true}");
        }
    }
}
