package com.facebook.share.internal;

/* compiled from: ShareInternalUtility.kt */
@kotlin.Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0016H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u001e\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020\u0018H\u0007J\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020\u0018H\u0007J\u0018\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0007J\u001c\u0010.\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u001c\u0010/\u001a\u0004\u0018\u00010\u00182\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0014\u00102\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u00103\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J,\u00106\u001a\u0002072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u00108\u001a\u0004\u0018\u00010*H\u0007J\"\u00109\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010<\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010=\u001a\u00020>H\u0007J*\u0010?\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\u0010@\u001a\u0004\u0018\u00010\u00042\u0006\u0010A\u001a\u00020BH\u0007J\u0018\u0010C\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0007J \u0010D\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010E\u001a\u00020FH\u0007J,\u0010D\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\u0010G\u001a\u0004\u0018\u00010B2\b\u0010H\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010D\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\u0010H\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010I\u001a\u00020:2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\u0010@\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010\u0004H\u0002J&\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010Q\u001a\u0004\u0018\u00010\u00142\b\u0010+\u001a\u0004\u0018\u00010RH\u0007J$\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010S\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010RH\u0007J&\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010+\u001a\u0004\u0018\u00010RH\u0007J*\u0010V\u001a\u00020:2\u0006\u0010\b\u001a\u00020\t2\b\u0010W\u001a\u0004\u0018\u00010X2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0007J\u0010\u0010Y\u001a\u00020:2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u000207H\u0007J\u001c\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010]\u001a\u000207H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/facebook/share/internal/ShareInternalUtility;", "", "()V", "MY_STAGING_RESOURCES", "", "STAGING_PARAM", "getAppCallFromActivityResult", "Lcom/facebook/internal/AppCall;", "requestCode", "", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "getAttachment", "Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "callId", "Ljava/util/UUID;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "medium", "Lcom/facebook/share/model/ShareMedia;", "getBackgroundAssetMediaInfo", "Landroid/os/Bundle;", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "appCallId", "getFieldNameAndNamespaceFromFullName", "Landroid/util/Pair;", "fullName", "getMediaInfos", "", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", "getNativeDialogCompletionGesture", "result", "getPhotoUrls", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "getShareDialogPostId", "getShareResultProcessor", "Lcom/facebook/share/internal/ResultProcessor;", "callback", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/share/Sharer$Result;", "getStickerUrl", "getTextureUrlBundle", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "getUriExtension", "getVideoUrl", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "handleActivityResult", "", "resultProcessor", "invokeCallbackWithError", "", "error", "invokeCallbackWithException", "exception", "Ljava/lang/Exception;", "invokeCallbackWithResults", com.facebook.share.internal.ShareConstants.RESULT_POST_ID, "graphResponse", "Lcom/facebook/GraphResponse;", "invokeOnCancelCallback", "invokeOnErrorCallback", "ex", "Lcom/facebook/FacebookException;", com.ironsource.Ve.n, "message", "invokeOnSuccessCallback", "logShareResult", "shareOutcome", "errorMessage", "newUploadStagingResourceWithImageRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "image", "Lcom/facebook/GraphRequest$Callback;", "imageUri", "file", "Ljava/io/File;", "registerSharerCallback", "callbackManager", "Lcom/facebook/CallbackManager;", "registerStaticShareCallback", "removeNamespacesFromOGJsonArray", "Lorg/json/JSONArray;", "jsonArray", "requireNamespace", "removeNamespacesFromOGJsonObject", "Lorg/json/JSONObject;", "jsonObject", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareInternalUtility {
    public static final com.facebook.share.internal.ShareInternalUtility INSTANCE = new com.facebook.share.internal.ShareInternalUtility();
    public static final java.lang.String MY_STAGING_RESOURCES = "me/staging_resources";
    public static final java.lang.String STAGING_PARAM = "file";

    private ShareInternalUtility() {
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeCallbackWithException(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof com.facebook.FacebookException) {
            invokeOnErrorCallback(callback, (com.facebook.FacebookException) exception);
        } else {
            invokeCallbackWithError(callback, kotlin.jvm.internal.Intrinsics.stringPlus("Error preparing share content: ", exception.getLocalizedMessage()));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeCallbackWithError(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, java.lang.String error) {
        invokeOnErrorCallback(callback, error);
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeCallbackWithResults(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, java.lang.String postId, com.facebook.GraphResponse graphResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphResponse, "graphResponse");
        com.facebook.FacebookRequestError error = graphResponse.getError();
        if (error != null) {
            java.lang.String errorMessage = error.getErrorMessage();
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isNullOrEmpty(errorMessage)) {
                errorMessage = "Unexpected error sharing.";
            }
            invokeOnErrorCallback(callback, graphResponse, errorMessage);
            return;
        }
        invokeOnSuccessCallback(callback, postId);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getNativeDialogCompletionGesture(android.os.Bundle result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        if (result.containsKey(com.facebook.internal.NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY)) {
            return result.getString(com.facebook.internal.NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY);
        }
        return result.getString(com.facebook.internal.NativeProtocol.EXTRA_DIALOG_COMPLETION_GESTURE_KEY);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getShareDialogPostId(android.os.Bundle result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        if (result.containsKey(com.facebook.share.internal.ShareConstants.RESULT_POST_ID)) {
            return result.getString(com.facebook.share.internal.ShareConstants.RESULT_POST_ID);
        }
        if (result.containsKey(com.facebook.share.internal.ShareConstants.EXTRA_RESULT_POST_ID)) {
            return result.getString(com.facebook.share.internal.ShareConstants.EXTRA_RESULT_POST_ID);
        }
        return result.getString(com.facebook.share.internal.ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean handleActivityResult(int requestCode, int resultCode, android.content.Intent data, com.facebook.share.internal.ResultProcessor resultProcessor) {
        com.facebook.FacebookException facebookException;
        com.facebook.internal.AppCall appCallFromActivityResult = INSTANCE.getAppCallFromActivityResult(requestCode, resultCode, data);
        if (appCallFromActivityResult == null) {
            return false;
        }
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appCallFromActivityResult.getCallId());
        if (resultProcessor == null) {
            return true;
        }
        android.os.Bundle bundle = null;
        if (data != null) {
            com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
            com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
            facebookException = com.facebook.internal.NativeProtocol.getExceptionFromErrorData(com.facebook.internal.NativeProtocol.getErrorDataFromResultIntent(data));
        } else {
            facebookException = null;
        }
        if (facebookException != null) {
            if (facebookException instanceof com.facebook.FacebookOperationCanceledException) {
                resultProcessor.onCancel(appCallFromActivityResult);
            } else {
                resultProcessor.onError(appCallFromActivityResult, facebookException);
            }
        } else {
            if (data != null) {
                com.facebook.internal.NativeProtocol nativeProtocol3 = com.facebook.internal.NativeProtocol.INSTANCE;
                bundle = com.facebook.internal.NativeProtocol.getSuccessResultsFromIntent(data);
            }
            resultProcessor.onSuccess(appCallFromActivityResult, bundle);
        }
        return true;
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.share.internal.ResultProcessor getShareResultProcessor(final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        return new com.facebook.share.internal.ResultProcessor(callback) { // from class: com.facebook.share.internal.ShareInternalUtility$getShareResultProcessor$1
            final /* synthetic */ com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(callback);
                this.$callback = callback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(com.facebook.internal.AppCall appCall, android.os.Bundle results) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
                if (results != null) {
                    com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                    java.lang.String nativeDialogCompletionGesture = com.facebook.share.internal.ShareInternalUtility.getNativeDialogCompletionGesture(results);
                    if (nativeDialogCompletionGesture == null || kotlin.text.StringsKt.equals("post", nativeDialogCompletionGesture, true)) {
                        com.facebook.share.internal.ShareInternalUtility shareInternalUtility2 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                        com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> facebookCallback = this.$callback;
                        com.facebook.share.internal.ShareInternalUtility shareInternalUtility3 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                        com.facebook.share.internal.ShareInternalUtility.invokeOnSuccessCallback(facebookCallback, com.facebook.share.internal.ShareInternalUtility.getShareDialogPostId(results));
                        return;
                    }
                    if (kotlin.text.StringsKt.equals("cancel", nativeDialogCompletionGesture, true)) {
                        com.facebook.share.internal.ShareInternalUtility shareInternalUtility4 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                        com.facebook.share.internal.ShareInternalUtility.invokeOnCancelCallback(this.$callback);
                    } else {
                        com.facebook.share.internal.ShareInternalUtility shareInternalUtility5 = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                        com.facebook.share.internal.ShareInternalUtility.invokeOnErrorCallback(this.$callback, new com.facebook.FacebookException(com.facebook.internal.NativeProtocol.ERROR_UNKNOWN_ERROR));
                    }
                }
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onCancel(com.facebook.internal.AppCall appCall) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
                com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                com.facebook.share.internal.ShareInternalUtility.invokeOnCancelCallback(this.$callback);
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onError(com.facebook.internal.AppCall appCall, com.facebook.FacebookException error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
                com.facebook.share.internal.ShareInternalUtility.invokeOnErrorCallback(this.$callback, error);
            }
        };
    }

    private final com.facebook.internal.AppCall getAppCallFromActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        java.util.UUID callIdFromIntent = com.facebook.internal.NativeProtocol.getCallIdFromIntent(data);
        if (callIdFromIntent == null) {
            return null;
        }
        return com.facebook.internal.AppCall.INSTANCE.finishPendingCall(callIdFromIntent, requestCode);
    }

    @kotlin.jvm.JvmStatic
    public static final void registerStaticShareCallback(final int requestCode) {
        com.facebook.internal.CallbackManagerImpl.INSTANCE.registerStaticCallback(requestCode, new com.facebook.internal.CallbackManagerImpl.Callback() { // from class: com.facebook.share.internal.ShareInternalUtility$$ExternalSyntheticLambda1
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, android.content.Intent intent) {
                boolean m5259registerStaticShareCallback$lambda0;
                m5259registerStaticShareCallback$lambda0 = com.facebook.share.internal.ShareInternalUtility.m5259registerStaticShareCallback$lambda0(requestCode, i, intent);
                return m5259registerStaticShareCallback$lambda0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerStaticShareCallback$lambda-0, reason: not valid java name */
    public static final boolean m5259registerStaticShareCallback$lambda0(int i, int i2, android.content.Intent intent) {
        return handleActivityResult(i, i2, intent, getShareResultProcessor(null));
    }

    @kotlin.jvm.JvmStatic
    public static final void registerSharerCallback(final int requestCode, com.facebook.CallbackManager callbackManager, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (!(callbackManager instanceof com.facebook.internal.CallbackManagerImpl)) {
            throw new com.facebook.FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.CallbackManagerImpl) callbackManager).registerCallback(requestCode, new com.facebook.internal.CallbackManagerImpl.Callback() { // from class: com.facebook.share.internal.ShareInternalUtility$$ExternalSyntheticLambda0
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, android.content.Intent intent) {
                boolean m5258registerSharerCallback$lambda1;
                m5258registerSharerCallback$lambda1 = com.facebook.share.internal.ShareInternalUtility.m5258registerSharerCallback$lambda1(requestCode, callback, i, intent);
                return m5258registerSharerCallback$lambda1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerSharerCallback$lambda-1, reason: not valid java name */
    public static final boolean m5258registerSharerCallback$lambda1(int i, com.facebook.FacebookCallback facebookCallback, int i2, android.content.Intent intent) {
        return handleActivityResult(i, i2, intent, getShareResultProcessor(facebookCallback));
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getPhotoUrls(com.facebook.share.model.SharePhotoContent photoContent, java.util.UUID appCallId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        java.util.List<com.facebook.share.model.SharePhoto> photos = photoContent == null ? null : photoContent.getPhotos();
        if (photos == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = photos.iterator();
        while (it.hasNext()) {
            com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, (com.facebook.share.model.SharePhoto) it.next());
            if (attachment != null) {
                arrayList.add(attachment);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.facebook.internal.NativeAppCallAttachmentStore.Attachment) it2.next()).getAttachmentUrl());
        }
        java.util.ArrayList arrayList5 = arrayList4;
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(arrayList2);
        return arrayList5;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getVideoUrl(com.facebook.share.model.ShareVideoContent videoContent, java.util.UUID appCallId) {
        com.facebook.share.model.ShareVideo video;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        android.net.Uri localUrl = (videoContent == null || (video = videoContent.getVideo()) == null) ? null : video.getLocalUrl();
        if (localUrl == null) {
            return null;
        }
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.Attachment createAttachment = com.facebook.internal.NativeAppCallAttachmentStore.createAttachment(appCallId, localUrl);
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore2 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(kotlin.collections.CollectionsKt.listOf(createAttachment));
        return createAttachment.getAttachmentUrl();
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<android.os.Bundle> getMediaInfos(com.facebook.share.model.ShareMediaContent mediaContent, java.util.UUID appCallId) {
        android.os.Bundle bundle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        java.util.List<com.facebook.share.model.ShareMedia<?, ?>> media = mediaContent == null ? null : mediaContent.getMedia();
        if (media == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.facebook.share.model.ShareMedia<?, ?> shareMedia : media) {
            com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, shareMedia);
            if (attachment == null) {
                bundle = null;
            } else {
                arrayList.add(attachment);
                bundle = new android.os.Bundle();
                bundle.putString("type", shareMedia.getMediaType().name());
                bundle.putString(com.facebook.share.internal.ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList3;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getTextureUrlBundle(com.facebook.share.model.ShareCameraEffectContent cameraEffectContent, java.util.UUID appCallId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        com.facebook.share.model.CameraEffectTextures textures = cameraEffectContent == null ? null : cameraEffectContent.getTextures();
        if (textures == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : textures.keySet()) {
            com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, textures.getTextureUri(str), textures.getTextureBitmap(str));
            if (attachment != null) {
                arrayList.add(attachment);
                bundle.putString(str, attachment.getAttachmentUrl());
            }
        }
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(arrayList);
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONArray removeNamespacesFromOGJsonArray(org.json.JSONArray jsonArray, boolean requireNamespace) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int length = jsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                java.lang.Object obj = jsonArray.get(i);
                if (obj instanceof org.json.JSONArray) {
                    obj = removeNamespacesFromOGJsonArray((org.json.JSONArray) obj, requireNamespace);
                } else if (obj instanceof org.json.JSONObject) {
                    obj = removeNamespacesFromOGJsonObject((org.json.JSONObject) obj, requireNamespace);
                }
                jSONArray.put(obj);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return jSONArray;
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject removeNamespacesFromOGJsonObject(org.json.JSONObject jsonObject, boolean requireNamespace) {
        if (jsonObject == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONArray names = jsonObject.names();
            if (names == null) {
                return null;
            }
            int length = names.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    java.lang.String key = names.getString(i);
                    java.lang.Object obj = jsonObject.get(key);
                    if (obj instanceof org.json.JSONObject) {
                        obj = removeNamespacesFromOGJsonObject((org.json.JSONObject) obj, true);
                    } else if (obj instanceof org.json.JSONArray) {
                        obj = removeNamespacesFromOGJsonArray((org.json.JSONArray) obj, true);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    android.util.Pair<java.lang.String, java.lang.String> fieldNameAndNamespaceFromFullName = getFieldNameAndNamespaceFromFullName(key);
                    java.lang.String str = (java.lang.String) fieldNameAndNamespaceFromFullName.first;
                    java.lang.String str2 = (java.lang.String) fieldNameAndNamespaceFromFullName.second;
                    if (requireNamespace) {
                        if (str != null && kotlin.jvm.internal.Intrinsics.areEqual(str, com.facebook.devicerequests.internal.DeviceRequestsHelper.SDK_HEADER)) {
                            jSONObject.put(key, obj);
                        } else {
                            if (str != null && !kotlin.jvm.internal.Intrinsics.areEqual(str, "og")) {
                                jSONObject2.put(str2, obj);
                            }
                            jSONObject.put(str2, obj);
                        }
                    } else if (str != null && kotlin.jvm.internal.Intrinsics.areEqual(str, "fb")) {
                        jSONObject.put(key, obj);
                    } else {
                        jSONObject.put(str2, obj);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("data", jSONObject2);
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            throw new com.facebook.FacebookException("Failed to create json object from share content");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.util.Pair<java.lang.String, java.lang.String> getFieldNameAndNamespaceFromFullName(java.lang.String fullName) {
        java.lang.String str;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullName, "fullName");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) fullName, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1 || fullName.length() <= (i = indexOf$default + 1)) {
            str = null;
        } else {
            str = fullName.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            fullName = fullName.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fullName, "(this as java.lang.String).substring(startIndex)");
        }
        return new android.util.Pair<>(str, fullName);
    }

    private final com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(java.util.UUID callId, com.facebook.share.model.ShareMedia<?, ?> medium) {
        android.net.Uri uri;
        android.graphics.Bitmap bitmap;
        if (medium instanceof com.facebook.share.model.SharePhoto) {
            com.facebook.share.model.SharePhoto sharePhoto = (com.facebook.share.model.SharePhoto) medium;
            bitmap = sharePhoto.getBitmap();
            uri = sharePhoto.getImageUrl();
        } else if (medium instanceof com.facebook.share.model.ShareVideo) {
            uri = ((com.facebook.share.model.ShareVideo) medium).getLocalUrl();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return getAttachment(callId, uri, bitmap);
    }

    private final com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(java.util.UUID callId, android.net.Uri uri, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
            return com.facebook.internal.NativeAppCallAttachmentStore.createAttachment(callId, bitmap);
        }
        if (uri == null) {
            return null;
        }
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore2 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        return com.facebook.internal.NativeAppCallAttachmentStore.createAttachment(callId, uri);
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeOnCancelCallback(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        INSTANCE.logShareResult(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, null);
        if (callback == null) {
            return;
        }
        callback.onCancel();
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeOnSuccessCallback(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, java.lang.String postId) {
        INSTANCE.logShareResult(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED, null);
        if (callback == null) {
            return;
        }
        callback.onSuccess(new com.facebook.share.Sharer.Result(postId));
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeOnErrorCallback(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, com.facebook.GraphResponse response, java.lang.String message) {
        INSTANCE.logShareResult("error", message);
        if (callback == null) {
            return;
        }
        callback.onError(new com.facebook.FacebookGraphResponseException(response, message));
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeOnErrorCallback(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, java.lang.String message) {
        INSTANCE.logShareResult("error", message);
        if (callback == null) {
            return;
        }
        callback.onError(new com.facebook.FacebookException(message));
    }

    @kotlin.jvm.JvmStatic
    public static final void invokeOnErrorCallback(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, com.facebook.FacebookException ex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
        INSTANCE.logShareResult("error", ex.getMessage());
        if (callback == null) {
            return;
        }
        callback.onError(ex);
    }

    private final void logShareResult(java.lang.String shareOutcome, java.lang.String errorMessage) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(com.facebook.FacebookSdk.getApplicationContext());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME, shareOutcome);
        if (errorMessage != null) {
            bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, errorMessage);
        }
        internalAppEventsLogger.logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_SHARE_RESULT, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadStagingResourceWithImageRequest(com.facebook.AccessToken accessToken, android.graphics.Bitmap image, com.facebook.GraphRequest.Callback callback) {
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("file", image);
        return new com.facebook.GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadStagingResourceWithImageRequest(com.facebook.AccessToken accessToken, java.io.File file, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException {
        com.facebook.GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(android.os.ParcelFileDescriptor.open(file, 268435456), androidx.media3.common.MimeTypes.IMAGE_PNG);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new com.facebook.GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadStagingResourceWithImageRequest(com.facebook.AccessToken accessToken, android.net.Uri imageUri, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        java.lang.String path = imageUri.getPath();
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isFileUri(imageUri) && path != null) {
            return newUploadStagingResourceWithImageRequest(accessToken, new java.io.File(path), callback);
        }
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        if (!com.facebook.internal.Utility.isContentUri(imageUri)) {
            throw new com.facebook.FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        com.facebook.GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new com.facebook.GraphRequest.ParcelableResourceWithMimeType(imageUri, androidx.media3.common.MimeTypes.IMAGE_PNG);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new com.facebook.GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getStickerUrl(com.facebook.share.model.ShareStoryContent storyContent, java.util.UUID appCallId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        if (storyContent == null || storyContent.getStickerAsset() == null) {
            return null;
        }
        new java.util.ArrayList().add(storyContent.getStickerAsset());
        com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, storyContent.getStickerAsset());
        if (attachment == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.share.internal.ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
        java.lang.String uriExtension = getUriExtension(attachment.getOriginalUri());
        if (uriExtension != null) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, uriExtension);
        }
        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
        com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(kotlin.collections.CollectionsKt.listOf(attachment));
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getBackgroundAssetMediaInfo(com.facebook.share.model.ShareStoryContent storyContent, java.util.UUID appCallId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCallId, "appCallId");
        android.os.Bundle bundle = null;
        if (storyContent != null && storyContent.getBackgroundAsset() != null) {
            com.facebook.share.model.ShareMedia<?, ?> backgroundAsset = storyContent.getBackgroundAsset();
            com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, backgroundAsset);
            if (attachment == null) {
                return null;
            }
            bundle = new android.os.Bundle();
            bundle.putString("type", backgroundAsset.getMediaType().name());
            bundle.putString(com.facebook.share.internal.ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            java.lang.String uriExtension = getUriExtension(attachment.getOriginalUri());
            if (uriExtension != null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, uriExtension);
            }
            com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
            com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(kotlin.collections.CollectionsKt.listOf(attachment));
        }
        return bundle;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUriExtension(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) uri2, '.', 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default == -1) {
            return null;
        }
        java.lang.String substring = uri2.substring(lastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
