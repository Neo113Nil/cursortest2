package com.facebook.internal;

/* compiled from: FacebookDialogBase.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 @*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0002@AB\u0017\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\b\u0014\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u000f\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\u001e\u0010!\u001a\u0018\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0017H\u0002J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0014¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020(H\u0004J\u001f\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020.H$J\u0012\u00101\u001a\u0002022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001e\u00103\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0016J&\u00103\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u00106\u001a\u0002022\u0006\u0010\u0010\u001a\u0002072\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000105H$J\u0010\u00108\u001a\u0002022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u00109\u001a\u0002022\u0006\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u001d\u0010;\u001a\u0002022\u0006\u0010$\u001a\u00028\u00002\u0006\u0010'\u001a\u00020(H\u0014¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\u0006\u0010\u0006\u001a\u00020\u0007H\u0004R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u00120\u0018R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0017X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\fR\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase;", "CONTENT", "RESULT", "Lcom/facebook/FacebookDialog;", "activity", "Landroid/app/Activity;", "requestCode", "", "(Landroid/app/Activity;I)V", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "(Lcom/facebook/internal/FragmentWrapper;I)V", "(I)V", "activityContext", "getActivityContext", "()Landroid/app/Activity;", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager$facebook_common_release", "()Lcom/facebook/CallbackManager;", "setCallbackManager$facebook_common_release", "(Lcom/facebook/CallbackManager;)V", "modeHandlers", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "orderedModeHandlers", "getOrderedModeHandlers", "()Ljava/util/List;", "value", "getRequestCode", "()I", "setRequestCode", "requestCodeField", "cachedModeHandlers", "canShow", "", "content", "(Ljava/lang/Object;)Z", "canShowImpl", com.ironsource.X3.a.t, "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createActivityResultContractForShowingDialog", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/facebook/CallbackManager$ActivityResultParameters;", "createAppCallForMode", "Lcom/facebook/internal/AppCall;", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "createBaseAppCall", "memorizeCallbackManager", "", "registerCallback", "callback", "Lcom/facebook/FacebookCallback;", "registerCallbackImpl", "Lcom/facebook/internal/CallbackManagerImpl;", "setCallbackManager", com.ironsource.C3232q2.v, "(Ljava/lang/Object;)V", "showImpl", "(Ljava/lang/Object;Ljava/lang/Object;)V", "startActivityForResult", "intent", "Landroid/content/Intent;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ModeHandler", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FacebookDialogBase<CONTENT, RESULT> implements com.facebook.FacebookDialog<CONTENT, RESULT> {
    private static final java.lang.String TAG = "FacebookDialog";
    private final android.app.Activity activity;
    private com.facebook.CallbackManager callbackManager;
    private final com.facebook.internal.FragmentWrapper fragmentWrapper;
    private java.util.List<? extends com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
    private int requestCodeField;
    public static final java.lang.Object BASE_AUTOMATIC_MODE = new java.lang.Object();

    protected abstract com.facebook.internal.AppCall createBaseAppCall();

    protected abstract java.util.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    protected abstract void registerCallbackImpl(com.facebook.internal.CallbackManagerImpl callbackManager, com.facebook.FacebookCallback<RESULT> callback);

    /* renamed from: getCallbackManager$facebook_common_release, reason: from getter */
    public final com.facebook.CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(com.facebook.CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager(com.facebook.CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    protected FacebookDialogBase(android.app.Activity activity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i;
        this.callbackManager = null;
    }

    protected FacebookDialogBase(com.facebook.internal.FragmentWrapper fragmentWrapper, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i;
        if (fragmentWrapper.getActivity() == null) {
            throw new java.lang.IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }

    protected FacebookDialogBase(int i) {
        this.requestCodeField = i;
        this.activity = null;
        this.fragmentWrapper = null;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(com.facebook.CallbackManager callbackManager, com.facebook.FacebookCallback<RESULT> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(callbackManager instanceof com.facebook.internal.CallbackManagerImpl)) {
            throw new com.facebook.FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        memorizeCallbackManager(callbackManager);
        registerCallbackImpl((com.facebook.internal.CallbackManagerImpl) callbackManager, callback);
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(com.facebook.CallbackManager callbackManager, com.facebook.FacebookCallback<RESULT> callback, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        memorizeCallbackManager(callbackManager);
        setRequestCode(requestCode);
        registerCallback(callbackManager, callback);
    }

    /* renamed from: getRequestCode, reason: from getter */
    public final int getRequestCodeField() {
        return this.requestCodeField;
    }

    public final void setRequestCode(int i) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!(!com.facebook.FacebookSdk.isFacebookRequestCode(i))) {
            throw new java.lang.IllegalArgumentException(("Request code " + i + " cannot be within the range reserved by the Facebook SDK.").toString());
        }
        this.requestCodeField = i;
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    protected boolean canShowImpl(CONTENT content, java.lang.Object mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode == BASE_AUTOMATIC_MODE;
        for (com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (!z) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                    continue;
                }
            }
            if (modeHandler.canShow(content, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    protected final androidx.activity.result.contract.ActivityResultContract<CONTENT, com.facebook.CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(final com.facebook.CallbackManager callbackManager, final java.lang.Object mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        return new androidx.activity.result.contract.ActivityResultContract<CONTENT, com.facebook.CallbackManager.ActivityResultParameters>(this) { // from class: com.facebook.internal.FacebookDialogBase$createActivityResultContractForShowingDialog$1
            final /* synthetic */ com.facebook.internal.FacebookDialogBase<CONTENT, RESULT> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public android.content.Intent createIntent(android.content.Context context, CONTENT content) {
                com.facebook.internal.AppCall createAppCallForMode;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                createAppCallForMode = this.this$0.createAppCallForMode(content, mode);
                android.content.Intent requestIntent = createAppCallForMode == null ? null : createAppCallForMode.getRequestIntent();
                if (requestIntent != null) {
                    createAppCallForMode.setPending();
                    return requestIntent;
                }
                throw new com.facebook.FacebookException("Content " + content + " is not supported");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public com.facebook.CallbackManager.ActivityResultParameters parseResult(int resultCode, android.content.Intent intent) {
                com.facebook.CallbackManager callbackManager2 = callbackManager;
                if (callbackManager2 != null) {
                    callbackManager2.onActivityResult(this.this$0.getRequestCodeField(), resultCode, intent);
                }
                return new com.facebook.CallbackManager.ActivityResultParameters(this.this$0.getRequestCodeField(), resultCode, intent);
            }
        };
    }

    @Override // com.facebook.FacebookDialog
    public androidx.activity.result.contract.ActivityResultContract<CONTENT, com.facebook.CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(com.facebook.CallbackManager callbackManager) {
        return createActivityResultContractForShowingDialog(callbackManager, BASE_AUTOMATIC_MODE);
    }

    protected void showImpl(CONTENT content, java.lang.Object mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        com.facebook.internal.AppCall createAppCallForMode = createAppCallForMode(content, mode);
        if (createAppCallForMode != null) {
            if (getActivityContext() instanceof androidx.activity.result.ActivityResultRegistryOwner) {
                android.content.ComponentCallbacks2 activityContext = getActivityContext();
                if (activityContext == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
                androidx.activity.result.ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.ActivityResultRegistryOwner) activityContext).getActivityResultRegistry();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "registryOwner.activityResultRegistry");
                com.facebook.internal.DialogPresenter.present(createAppCallForMode, activityResultRegistry, this.callbackManager);
                createAppCallForMode.setPending();
                return;
            }
            if (this.fragmentWrapper != null) {
                com.facebook.internal.DialogPresenter dialogPresenter2 = com.facebook.internal.DialogPresenter.INSTANCE;
                com.facebook.internal.DialogPresenter.present(createAppCallForMode, this.fragmentWrapper);
                return;
            } else {
                if (this.activity != null) {
                    com.facebook.internal.DialogPresenter dialogPresenter3 = com.facebook.internal.DialogPresenter.INSTANCE;
                    com.facebook.internal.DialogPresenter.present(createAppCallForMode, this.activity);
                    return;
                }
                return;
            }
        }
        android.util.Log.e(TAG, "No code path should ever result in a null appCall");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!(!com.facebook.FacebookSdk.isDebugEnabled())) {
            throw new java.lang.IllegalStateException("No code path should ever result in a null appCall".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final android.app.Activity getActivityContext() {
        android.app.Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        com.facebook.internal.FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper == null) {
            return null;
        }
        return fragmentWrapper.getActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void startActivityForResult(android.content.Intent intent, int requestCode) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.app.Activity activityContext = getActivityContext();
        if (activityContext instanceof androidx.activity.result.ActivityResultRegistryOwner) {
            com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
            androidx.activity.result.ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.ActivityResultRegistryOwner) activityContext).getActivityResultRegistry();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            com.facebook.internal.DialogPresenter.startActivityForResultWithAndroidX(activityResultRegistry, this.callbackManager, intent, requestCode);
        } else if (activityContext != 0) {
            activityContext.startActivityForResult(intent, requestCode);
        } else {
            com.facebook.internal.FragmentWrapper fragmentWrapper = this.fragmentWrapper;
            if (fragmentWrapper != null) {
                fragmentWrapper.startActivityForResult(intent, requestCode);
            } else {
                str = "Failed to find Activity or Fragment to startActivityForResult ";
                if (str == null) {
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.DEVELOPER_ERRORS;
                    java.lang.String name = getClass().getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
                    companion.log(loggingBehavior, 6, name, str);
                    return;
                }
                return;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.internal.AppCall createAppCallForMode(CONTENT content, java.lang.Object mode) {
        com.facebook.internal.AppCall appCall;
        boolean z = mode == BASE_AUTOMATIC_MODE;
        java.util.Iterator<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler> it = cachedModeHandlers().iterator();
        while (true) {
            if (!it.hasNext()) {
                appCall = null;
                break;
            }
            com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler next = it.next();
            if (!z) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.areObjectsEqual(next.getMode(), mode)) {
                    continue;
                }
            }
            if (next.canShow(content, true)) {
                try {
                    appCall = next.createAppCall(content);
                    break;
                } catch (com.facebook.FacebookException e) {
                    com.facebook.internal.AppCall createBaseAppCall = createBaseAppCall();
                    com.facebook.internal.DialogPresenter dialogPresenter = com.facebook.internal.DialogPresenter.INSTANCE;
                    com.facebook.internal.DialogPresenter.setupAppCallForValidationError(createBaseAppCall, e);
                    appCall = createBaseAppCall;
                }
            }
        }
        if (appCall != null) {
            return appCall;
        }
        com.facebook.internal.AppCall createBaseAppCall2 = createBaseAppCall();
        com.facebook.internal.DialogPresenter dialogPresenter2 = com.facebook.internal.DialogPresenter.INSTANCE;
        com.facebook.internal.DialogPresenter.setupAppCallForCannotShowError(createBaseAppCall2);
        return createBaseAppCall2;
    }

    private final void memorizeCallbackManager(com.facebook.CallbackManager callbackManager) {
        com.facebook.CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            android.util.Log.w(TAG, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    private final java.util.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        java.util.List<? extends com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler> list = this.modeHandlers;
        if (list != null) {
            return list;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: FacebookDialogBase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b¤\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "", "(Lcom/facebook/internal/FacebookDialogBase;)V", com.ironsource.X3.a.t, "getMode", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", "canShow", "", "content", "isBestEffort", "(Ljava/lang/Object;Z)Z", "createAppCall", "Lcom/facebook/internal/AppCall;", "(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public abstract class ModeHandler {
        private java.lang.Object mode;
        final /* synthetic */ com.facebook.internal.FacebookDialogBase<CONTENT, RESULT> this$0;

        public abstract boolean canShow(CONTENT content, boolean isBestEffort);

        public abstract com.facebook.internal.AppCall createAppCall(CONTENT content);

        public ModeHandler(com.facebook.internal.FacebookDialogBase this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.mode = com.facebook.internal.FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }

        public java.lang.Object getMode() {
            return this.mode;
        }

        public void setMode(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.mode = obj;
        }
    }
}
