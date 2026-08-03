package com.facebook.share.widget;

/* compiled from: ShareDialog.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 12\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00070123456B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0011\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010B\u0017\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0011B\u0017\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0015J \u0010\u001e\u001a\u00020\u00172\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0017H\u0016J*\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010 \u001a\u00020!H\u0002J\u001e\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-H\u0014J\u0010\u0010.\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J \u0010/\u001a\u00020&2\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0018\u001a \u0012\u001c\u0012\u001a0\u001aR\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0019X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/facebook/share/widget/ShareDialog;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "Lcom/facebook/share/Sharer;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "requestCode", "", "(I)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "Landroid/app/Fragment;", "(Landroid/app/Fragment;)V", "(Landroid/app/Activity;I)V", "(Landroidx/fragment/app/Fragment;I)V", "(Landroid/app/Fragment;I)V", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;I)V", "isAutomaticMode", "", "orderedModeHandlers", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "getOrderedModeHandlers", "()Ljava/util/List;", "shouldFailOnDataError", "canShow", "content", com.ironsource.X3.a.t, "Lcom/facebook/share/widget/ShareDialog$Mode;", "createBaseAppCall", "Lcom/facebook/internal/AppCall;", "getShouldFailOnDataError", "logDialogShare", "", "context", "Landroid/content/Context;", "registerCallbackImpl", "callbackManager", "Lcom/facebook/internal/CallbackManagerImpl;", "callback", "Lcom/facebook/FacebookCallback;", "setShouldFailOnDataError", com.ironsource.C3232q2.v, "CameraEffectHandler", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "FeedHandler", "Mode", "NativeHandler", "ShareStoryHandler", "WebShareHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class ShareDialog extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result> implements com.facebook.share.Sharer {
    private static final java.lang.String FEED_DIALOG = "feed";
    private static final java.lang.String WEB_OG_SHARE_DIALOG = "share_open_graph";
    public static final java.lang.String WEB_SHARE_DIALOG = "share";
    private boolean isAutomaticMode;
    private final java.util.List<com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler> orderedModeHandlers;
    private boolean shouldFailOnDataError;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.share.widget.ShareDialog.Companion INSTANCE = new com.facebook.share.widget.ShareDialog.Companion(null);
    private static final java.lang.String TAG = "ShareDialog";
    private static final int DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.share.widget.ShareDialog.Mode.valuesCustom().length];
            iArr[com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC.ordinal()] = 1;
            iArr[com.facebook.share.widget.ShareDialog.Mode.WEB.ordinal()] = 2;
            iArr[com.facebook.share.widget.ShareDialog.Mode.NATIVE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static boolean canShow(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> cls) {
        return INSTANCE.canShow(cls);
    }

    @kotlin.jvm.JvmStatic
    public static void show(android.app.Activity activity, com.facebook.share.model.ShareContent<?, ?> shareContent) {
        INSTANCE.show(activity, shareContent);
    }

    @kotlin.jvm.JvmStatic
    public static void show(android.app.Fragment fragment, com.facebook.share.model.ShareContent<?, ?> shareContent) {
        INSTANCE.show(fragment, shareContent);
    }

    @kotlin.jvm.JvmStatic
    public static void show(androidx.fragment.app.Fragment fragment, com.facebook.share.model.ShareContent<?, ?> shareContent) {
        INSTANCE.show(fragment, shareContent);
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$Mode;", "", "(Ljava/lang/String;I)V", "AUTOMATIC", "NATIVE", "WEB", "FEED", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.share.widget.ShareDialog.Mode[] valuesCustom() {
            com.facebook.share.widget.ShareDialog.Mode[] valuesCustom = values();
            return (com.facebook.share.widget.ShareDialog.Mode[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Activity activity) {
        this(activity, DEFAULT_REQUEST_CODE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public ShareDialog(int i) {
        super(i);
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.CollectionsKt.arrayListOf(new com.facebook.share.widget.ShareDialog.NativeHandler(this), new com.facebook.share.widget.ShareDialog.FeedHandler(this), new com.facebook.share.widget.ShareDialog.WebShareHandler(this), new com.facebook.share.widget.ShareDialog.CameraEffectHandler(this), new com.facebook.share.widget.ShareDialog.ShareStoryHandler(this));
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(i);
    }

    public /* synthetic */ ShareDialog(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DEFAULT_REQUEST_CODE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(androidx.fragment.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment), 0, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment) {
        this(new com.facebook.internal.FragmentWrapper(fragment), 0, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Activity activity, int i) {
        super(activity, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.CollectionsKt.arrayListOf(new com.facebook.share.widget.ShareDialog.NativeHandler(this), new com.facebook.share.widget.ShareDialog.FeedHandler(this), new com.facebook.share.widget.ShareDialog.WebShareHandler(this), new com.facebook.share.widget.ShareDialog.CameraEffectHandler(this), new com.facebook.share.widget.ShareDialog.ShareStoryHandler(this));
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(androidx.fragment.app.Fragment fragment, int i) {
        this(new com.facebook.internal.FragmentWrapper(fragment), i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment, int i) {
        this(new com.facebook.internal.FragmentWrapper(fragment), i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    public /* synthetic */ ShareDialog(com.facebook.internal.FragmentWrapper fragmentWrapper, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentWrapper, (i2 & 2) != 0 ? DEFAULT_REQUEST_CODE : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(com.facebook.internal.FragmentWrapper fragmentWrapper, int i) {
        super(fragmentWrapper, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.CollectionsKt.arrayListOf(new com.facebook.share.widget.ShareDialog.NativeHandler(this), new com.facebook.share.widget.ShareDialog.FeedHandler(this), new com.facebook.share.widget.ShareDialog.WebShareHandler(this), new com.facebook.share.widget.ShareDialog.CameraEffectHandler(this), new com.facebook.share.widget.ShareDialog.ShareStoryHandler(this));
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        com.facebook.share.internal.ShareInternalUtility.registerStaticShareCallback(i);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(com.facebook.internal.CallbackManagerImpl callbackManager, com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.facebook.share.internal.ShareInternalUtility shareInternalUtility = com.facebook.share.internal.ShareInternalUtility.INSTANCE;
        com.facebook.share.internal.ShareInternalUtility.registerSharerCallback(getRequestCodeField(), callbackManager, callback);
    }

    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    public void setShouldFailOnDataError(boolean shouldFailOnDataError) {
        this.shouldFailOnDataError = shouldFailOnDataError;
    }

    public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, com.facebook.share.widget.ShareDialog.Mode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        java.lang.Object obj = mode;
        if (mode == com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC) {
            obj = com.facebook.internal.FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(content, obj);
    }

    public void show(com.facebook.share.model.ShareContent<?, ?> content, com.facebook.share.widget.ShareDialog.Mode mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode == com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC;
        this.isAutomaticMode = z;
        java.lang.Object obj = mode;
        if (z) {
            obj = com.facebook.internal.FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        showImpl(content, obj);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected com.facebook.internal.AppCall createBaseAppCall() {
        return new com.facebook.internal.AppCall(getRequestCodeField(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected java.util.List<com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        return this.orderedModeHandlers;
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u001a0\u0001R\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$NativeHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "(Lcom/facebook/share/widget/ShareDialog;)V", com.ironsource.X3.a.t, "", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "createAppCall", "Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class NativeHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.share.widget.ShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeHandler(com.facebook.share.widget.ShareDialog this$0) {
            super(this$0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.share.widget.ShareDialog.Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public java.lang.Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, boolean isBestEffort) {
            boolean z;
            java.lang.String quote;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            if ((content instanceof com.facebook.share.model.ShareCameraEffectContent) || (content instanceof com.facebook.share.model.ShareStoryContent)) {
                return false;
            }
            if (!isBestEffort) {
                if (content.getShareHashtag() != null) {
                    com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
                    z = com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.share.internal.ShareDialogFeature.HASHTAG);
                } else {
                    z = true;
                }
                if (!(content instanceof com.facebook.share.model.ShareLinkContent) || (quote = ((com.facebook.share.model.ShareLinkContent) content).getQuote()) == null || quote.length() == 0) {
                    if (!z) {
                        return false;
                    }
                } else {
                    if (!z) {
                        return false;
                    }
                    com.facebook.internal.DialogPresenter dialogPresenter2 = com.facebook.internal.DialogPresenter.INSTANCE;
                    if (!com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES)) {
                        return false;
                    }
                }
            }
            return com.facebook.share.widget.ShareDialog.INSTANCE.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.ShareContent<?, ?> content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.widget.ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, com.facebook.share.widget.ShareDialog.Mode.NATIVE);
            com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
            com.facebook.share.internal.ShareContentValidation.validateForNativeShare(content);
            final com.facebook.internal.AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            final boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            com.facebook.internal.DialogFeature feature = com.facebook.share.widget.ShareDialog.INSTANCE.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            com.facebook.internal.DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new com.facebook.internal.DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$NativeHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getParameters() {
                    com.facebook.share.internal.NativeDialogParameters nativeDialogParameters = com.facebook.share.internal.NativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.NativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getLegacyParameters() {
                    com.facebook.share.internal.LegacyNativeDialogParameters legacyNativeDialogParameters = com.facebook.share.internal.LegacyNativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.LegacyNativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u001a0\u0001R\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$WebShareHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "(Lcom/facebook/share/widget/ShareDialog;)V", com.ironsource.X3.a.t, "", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "createAndMapAttachments", "Lcom/facebook/share/model/SharePhotoContent;", "callId", "Ljava/util/UUID;", "createAppCall", "Lcom/facebook/internal/AppCall;", "getActionName", "", "shareContent", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class WebShareHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.share.widget.ShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebShareHandler(com.facebook.share.widget.ShareDialog this$0) {
            super(this$0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.share.widget.ShareDialog.Mode.WEB;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public java.lang.Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, boolean isBestEffort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return com.facebook.share.widget.ShareDialog.INSTANCE.canShowWebCheck(content);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(com.facebook.share.model.ShareContent<?, ?> content) {
            android.os.Bundle create;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.widget.ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, com.facebook.share.widget.ShareDialog.Mode.WEB);
            com.facebook.internal.AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
            com.facebook.share.internal.ShareContentValidation.validateForWebShare(content);
            if (content instanceof com.facebook.share.model.ShareLinkContent) {
                com.facebook.share.internal.WebDialogParameters webDialogParameters = com.facebook.share.internal.WebDialogParameters.INSTANCE;
                create = com.facebook.share.internal.WebDialogParameters.create((com.facebook.share.model.ShareLinkContent) content);
            } else {
                if (!(content instanceof com.facebook.share.model.SharePhotoContent)) {
                    return null;
                }
                com.facebook.share.model.SharePhotoContent createAndMapAttachments = createAndMapAttachments((com.facebook.share.model.SharePhotoContent) content, createBaseAppCall.getCallId());
                com.facebook.share.internal.WebDialogParameters webDialogParameters2 = com.facebook.share.internal.WebDialogParameters.INSTANCE;
                create = com.facebook.share.internal.WebDialogParameters.create(createAndMapAttachments);
            }
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            com.facebook.internal.DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, getActionName(content), create);
            return createBaseAppCall;
        }

        private final java.lang.String getActionName(com.facebook.share.model.ShareContent<?, ?> shareContent) {
            if ((shareContent instanceof com.facebook.share.model.ShareLinkContent) || (shareContent instanceof com.facebook.share.model.SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        private final com.facebook.share.model.SharePhotoContent createAndMapAttachments(com.facebook.share.model.SharePhotoContent content, java.util.UUID callId) {
            com.facebook.share.model.SharePhotoContent.Builder readFrom = new com.facebook.share.model.SharePhotoContent.Builder().readFrom(content);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = content.getPhotos().size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    com.facebook.share.model.SharePhoto sharePhoto = content.getPhotos().get(i);
                    android.graphics.Bitmap bitmap = sharePhoto.getBitmap();
                    if (bitmap != null) {
                        com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
                        com.facebook.internal.NativeAppCallAttachmentStore.Attachment createAttachment = com.facebook.internal.NativeAppCallAttachmentStore.createAttachment(callId, bitmap);
                        sharePhoto = new com.facebook.share.model.SharePhoto.Builder().readFrom(sharePhoto).setImageUrl(android.net.Uri.parse(createAttachment.getAttachmentUrl())).setBitmap(null).build();
                        arrayList2.add(createAttachment);
                    }
                    arrayList.add(sharePhoto);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            readFrom.setPhotos(arrayList);
            com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore2 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
            com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(arrayList2);
            return readFrom.build();
        }
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u001a0\u0001R\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$FeedHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "(Lcom/facebook/share/widget/ShareDialog;)V", com.ironsource.X3.a.t, "", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "createAppCall", "Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class FeedHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.share.widget.ShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedHandler(com.facebook.share.widget.ShareDialog this$0) {
            super(this$0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.share.widget.ShareDialog.Mode.FEED;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public java.lang.Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, boolean isBestEffort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof com.facebook.share.model.ShareLinkContent) || (content instanceof com.facebook.share.internal.ShareFeedContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(com.facebook.share.model.ShareContent<?, ?> content) {
            android.os.Bundle createForFeed;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.widget.ShareDialog shareDialog = this.this$0;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, com.facebook.share.widget.ShareDialog.Mode.FEED);
            com.facebook.internal.AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            if (content instanceof com.facebook.share.model.ShareLinkContent) {
                com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
                com.facebook.share.internal.ShareContentValidation.validateForWebShare(content);
                com.facebook.share.internal.WebDialogParameters webDialogParameters = com.facebook.share.internal.WebDialogParameters.INSTANCE;
                createForFeed = com.facebook.share.internal.WebDialogParameters.createForFeed((com.facebook.share.model.ShareLinkContent) content);
            } else {
                if (!(content instanceof com.facebook.share.internal.ShareFeedContent)) {
                    return null;
                }
                com.facebook.share.internal.WebDialogParameters webDialogParameters2 = com.facebook.share.internal.WebDialogParameters.INSTANCE;
                createForFeed = com.facebook.share.internal.WebDialogParameters.createForFeed((com.facebook.share.internal.ShareFeedContent) content);
            }
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            com.facebook.internal.DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, com.facebook.share.widget.ShareDialog.FEED_DIALOG, createForFeed);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u001a0\u0001R\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$CameraEffectHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "(Lcom/facebook/share/widget/ShareDialog;)V", com.ironsource.X3.a.t, "", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "createAppCall", "Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class CameraEffectHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.share.widget.ShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraEffectHandler(com.facebook.share.widget.ShareDialog this$0) {
            super(this$0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.share.widget.ShareDialog.Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public java.lang.Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, boolean isBestEffort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof com.facebook.share.model.ShareCameraEffectContent) && com.facebook.share.widget.ShareDialog.INSTANCE.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.ShareContent<?, ?> content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
            com.facebook.share.internal.ShareContentValidation.validateForNativeShare(content);
            final com.facebook.internal.AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            final boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            com.facebook.internal.DialogFeature feature = com.facebook.share.widget.ShareDialog.INSTANCE.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            com.facebook.internal.DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new com.facebook.internal.DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$CameraEffectHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getParameters() {
                    com.facebook.share.internal.NativeDialogParameters nativeDialogParameters = com.facebook.share.internal.NativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.NativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getLegacyParameters() {
                    com.facebook.share.internal.LegacyNativeDialogParameters legacyNativeDialogParameters = com.facebook.share.internal.LegacyNativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.LegacyNativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u001a0\u0001R\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0005¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/facebook/share/widget/ShareDialog$ShareStoryHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/Sharer$Result;", "(Lcom/facebook/share/widget/ShareDialog;)V", com.ironsource.X3.a.t, "", "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "createAppCall", "Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class ShareStoryHandler extends com.facebook.internal.FacebookDialogBase<com.facebook.share.model.ShareContent<?, ?>, com.facebook.share.Sharer.Result>.ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.share.widget.ShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareStoryHandler(com.facebook.share.widget.ShareDialog this$0) {
            super(this$0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.share.widget.ShareDialog.Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public java.lang.Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(com.facebook.share.model.ShareContent<?, ?> content, boolean isBestEffort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof com.facebook.share.model.ShareStoryContent) && com.facebook.share.widget.ShareDialog.INSTANCE.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public com.facebook.internal.AppCall createAppCall(final com.facebook.share.model.ShareContent<?, ?> content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            com.facebook.share.internal.ShareContentValidation shareContentValidation = com.facebook.share.internal.ShareContentValidation.INSTANCE;
            com.facebook.share.internal.ShareContentValidation.validateForStoryShare(content);
            final com.facebook.internal.AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            final boolean shouldFailOnDataError = this.this$0.getShouldFailOnDataError();
            com.facebook.internal.DialogFeature feature = com.facebook.share.widget.ShareDialog.INSTANCE.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            com.facebook.internal.DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new com.facebook.internal.DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$ShareStoryHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getParameters() {
                    com.facebook.share.internal.NativeDialogParameters nativeDialogParameters = com.facebook.share.internal.NativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.NativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public android.os.Bundle getLegacyParameters() {
                    com.facebook.share.internal.LegacyNativeDialogParameters legacyNativeDialogParameters = com.facebook.share.internal.LegacyNativeDialogParameters.INSTANCE;
                    return com.facebook.share.internal.LegacyNativeDialogParameters.create(com.facebook.internal.AppCall.this.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return createBaseAppCall;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDialogShare(android.content.Context context, com.facebook.share.model.ShareContent<?, ?> content, com.facebook.share.widget.ShareDialog.Mode mode) {
        java.lang.String str;
        if (this.isAutomaticMode) {
            mode = com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC;
        }
        int i = com.facebook.share.widget.ShareDialog.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        java.lang.String str2 = "unknown";
        if (i == 1) {
            str = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
        } else if (i == 2) {
            str = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB;
        } else {
            str = i != 3 ? "unknown" : "native";
        }
        com.facebook.internal.DialogFeature feature = INSTANCE.getFeature(content.getClass());
        if (feature == com.facebook.share.internal.ShareDialogFeature.SHARE_DIALOG) {
            str2 = "status";
        } else if (feature == com.facebook.share.internal.ShareDialogFeature.PHOTOS) {
            str2 = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO;
        } else if (feature == com.facebook.share.internal.ShareDialogFeature.VIDEO) {
            str2 = "video";
        }
        com.facebook.appevents.InternalAppEventsLogger.Companion companion = com.facebook.appevents.InternalAppEventsLogger.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.appevents.InternalAppEventsLogger createInstance = companion.createInstance(context, com.facebook.FacebookSdk.getApplicationId());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str2);
        createInstance.logEventImplicitly("fb_share_dialog_show", bundle);
    }

    /* compiled from: ShareDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000eH\u0017J \u0010\u0010\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002J \u0010\u0013\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000eH\u0002J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\u0010\r\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000eH\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0017J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0017J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001d2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0017J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/share/widget/ShareDialog$Companion;", "", "()V", "DEFAULT_REQUEST_CODE", "", "FEED_DIALOG", "", "TAG", "kotlin.jvm.PlatformType", "WEB_OG_SHARE_DIALOG", "WEB_SHARE_DIALOG", "canShow", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Ljava/lang/Class;", "Lcom/facebook/share/model/ShareContent;", "canShowNative", "canShowWebCheck", "content", "canShowWebTypeCheck", "getFeature", "Lcom/facebook/internal/DialogFeature;", com.ironsource.C3232q2.v, "", "activity", "Landroid/app/Activity;", "shareContent", "fragment", "Landroid/app/Fragment;", "Landroidx/fragment/app/Fragment;", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public void show(android.app.Activity activity, com.facebook.share.model.ShareContent<?, ?> shareContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            new com.facebook.share.widget.ShareDialog(activity).show(shareContent);
        }

        @kotlin.jvm.JvmStatic
        public void show(androidx.fragment.app.Fragment fragment, com.facebook.share.model.ShareContent<?, ?> shareContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            show(new com.facebook.internal.FragmentWrapper(fragment), shareContent);
        }

        @kotlin.jvm.JvmStatic
        public void show(android.app.Fragment fragment, com.facebook.share.model.ShareContent<?, ?> shareContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareContent, "shareContent");
            show(new com.facebook.internal.FragmentWrapper(fragment), shareContent);
        }

        private final void show(com.facebook.internal.FragmentWrapper fragmentWrapper, com.facebook.share.model.ShareContent<?, ?> shareContent) {
            new com.facebook.share.widget.ShareDialog(fragmentWrapper, 0, 2, null).show(shareContent);
        }

        @kotlin.jvm.JvmStatic
        public boolean canShow(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return canShowWebTypeCheck(contentType) || canShowNative(contentType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean canShowNative(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> contentType) {
            com.facebook.internal.DialogFeature feature = getFeature(contentType);
            if (feature != null) {
                com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
                if (com.facebook.internal.DialogPresenter.canPresentNativeDialogWithFeature(feature)) {
                    return true;
                }
            }
            return false;
        }

        private final boolean canShowWebTypeCheck(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> contentType) {
            return com.facebook.share.model.ShareLinkContent.class.isAssignableFrom(contentType) || (com.facebook.share.model.SharePhotoContent.class.isAssignableFrom(contentType) && com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean canShowWebCheck(com.facebook.share.model.ShareContent<?, ?> content) {
            return canShowWebTypeCheck(content.getClass());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.internal.DialogFeature getFeature(java.lang.Class<? extends com.facebook.share.model.ShareContent<?, ?>> contentType) {
            if (com.facebook.share.model.ShareLinkContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.ShareDialogFeature.SHARE_DIALOG;
            }
            if (com.facebook.share.model.SharePhotoContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.ShareDialogFeature.PHOTOS;
            }
            if (com.facebook.share.model.ShareVideoContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.ShareDialogFeature.VIDEO;
            }
            if (com.facebook.share.model.ShareMediaContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.ShareDialogFeature.MULTIMEDIA;
            }
            if (com.facebook.share.model.ShareCameraEffectContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (com.facebook.share.model.ShareStoryContent.class.isAssignableFrom(contentType)) {
                return com.facebook.share.internal.ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }
    }
}
