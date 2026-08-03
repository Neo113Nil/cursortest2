package com.facebook.login.widget;

/* compiled from: LoginButton.kt */
@kotlin.Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ©\u00012\u00020\u0001:\b©\u0001ª\u0001«\u0001¬\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\b\u0010|\u001a\u00020}H\u0003J\u0006\u0010~\u001a\u00020}J*\u0010\u007f\u001a\u00020}2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0015J\u0007\u0010\u0080\u0001\u001a\u00020}J\u0012\u0010\u0081\u0001\u001a\u00020}2\u0007\u0010\u0082\u0001\u001a\u00020\u000eH\u0003J\u0012\u0010\u0083\u0001\u001a\u00020\t2\u0007\u0010\u0084\u0001\u001a\u00020\tH\u0005J\u0012\u0010\u0085\u0001\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\u000eH\u0003J\t\u0010\u0087\u0001\u001a\u00020}H\u0015J\t\u0010\u0088\u0001\u001a\u00020}H\u0015J\u0013\u0010\u0089\u0001\u001a\u00020}2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0015J6\u0010\u008c\u0001\u001a\u00020}2\u0007\u0010\u008d\u0001\u001a\u00020\"2\u0007\u0010\u008e\u0001\u001a\u00020\t2\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020\tH\u0015J\u001b\u0010\u0092\u0001\u001a\u00020}2\u0007\u0010\u0084\u0001\u001a\u00020\t2\u0007\u0010\u0093\u0001\u001a\u00020\tH\u0015J\u001c\u0010\u0094\u0001\u001a\u00020}2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\tH\u0015J+\u0010\u0098\u0001\u001a\u00020}2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0005J \u0010\u0099\u0001\u001a\u00020}2\u0006\u0010\u001e\u001a\u00020\u001d2\u000f\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u0001J\t\u0010\u009d\u0001\u001a\u00020}H\u0005J\t\u0010\u009e\u0001\u001a\u00020}H\u0005J\t\u0010\u009f\u0001\u001a\u00020}H\u0005J\t\u0010 \u0001\u001a\u00020}H\u0005J%\u0010Z\u001a\u00020}2\u0017\u0010W\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0¡\u0001\"\u0004\u0018\u00010\u000e¢\u0006\u0003\u0010¢\u0001J(\u0010£\u0001\u001a\u00020}2\u0017\u0010W\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0¡\u0001\"\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0003\u0010¢\u0001J\u0017\u0010£\u0001\u001a\u00020}2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0VH\u0007J(\u0010¤\u0001\u001a\u00020}2\u0017\u0010W\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0¡\u0001\"\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0003\u0010¢\u0001J\u0017\u0010¤\u0001\u001a\u00020}2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0VH\u0007J\u0015\u0010¥\u0001\u001a\u00020}2\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001H\u0003J\u000f\u0010¨\u0001\u001a\u00020}2\u0006\u0010\u001e\u001a\u00020\u001dR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\t8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00102\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019R$\u00105\u001a\u0002042\u0006\u0010\u0016\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\t8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010/R \u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010I\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0019\"\u0004\bK\u0010\u001bR(\u0010L\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0019\"\u0004\bN\u0010\u001bR(\u0010O\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u0019\"\u0004\bQ\u0010\u001bR\u0018\u0010R\u001a\u00060SR\u00020\u00008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR0\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0V2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020]X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R$\u0010`\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010e\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bf\u0010bR\u000e\u0010g\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u00020iX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020oX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0010\u0010t\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u00020wX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006\u00ad\u0001"}, d2 = {"Lcom/facebook/login/widget/LoginButton;", "Lcom/facebook/FacebookButtonBase;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleAttr", "defStyleRes", "analyticsButtonCreatedEventName", "", "analyticsButtonTappedEventName", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V", "accessTokenTracker", "Lcom/facebook/AccessTokenTracker;", "androidXLoginCaller", "Landroidx/activity/result/ActivityResultLauncher;", "", "value", "authType", "getAuthType", "()Ljava/lang/String;", "setAuthType", "(Ljava/lang/String;)V", "<set-?>", "Lcom/facebook/CallbackManager;", "callbackManager", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "confirmLogout", "", "customButtonRadius", "", "Ljava/lang/Float;", "customButtonTransparency", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "setDefaultAudience", "(Lcom/facebook/login/DefaultAudience;)V", "defaultRequestCode", "getDefaultRequestCode", "()I", "defaultStyleResource", "getDefaultStyleResource", "loggerID", "getLoggerID", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "setLoginBehavior", "(Lcom/facebook/login/LoginBehavior;)V", "loginButtonContinueLabel", "getLoginButtonContinueLabel", "loginManagerLazy", "Lkotlin/Lazy;", "Lcom/facebook/login/LoginManager;", "getLoginManagerLazy", "()Lkotlin/Lazy;", "setLoginManagerLazy", "(Lkotlin/Lazy;)V", "Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "setLoginTargetApp", "(Lcom/facebook/login/LoginTargetApp;)V", "loginText", "getLoginText", "setLoginText", "logoutText", "getLogoutText", "setLogoutText", "messengerPageId", "getMessengerPageId", "setMessengerPageId", "newLoginClickListener", "Lcom/facebook/login/widget/LoginButton$LoginClickListener;", "getNewLoginClickListener", "()Lcom/facebook/login/widget/LoginButton$LoginClickListener;", "", "permissions", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "properties", "Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;", "getProperties", "()Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;", "resetMessengerState", "getResetMessengerState", "()Z", "setResetMessengerState", "(Z)V", "shouldSkipAccountDeduplication", "getShouldSkipAccountDeduplication", "toolTipChecked", "toolTipDisplayTime", "", "getToolTipDisplayTime", "()J", "setToolTipDisplayTime", "(J)V", "toolTipMode", "Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "getToolTipMode", "()Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "setToolTipMode", "(Lcom/facebook/login/widget/LoginButton$ToolTipMode;)V", "toolTipPopup", "Lcom/facebook/login/widget/ToolTipPopup;", "toolTipStyle", "Lcom/facebook/login/widget/ToolTipPopup$Style;", "getToolTipStyle", "()Lcom/facebook/login/widget/ToolTipPopup$Style;", "setToolTipStyle", "(Lcom/facebook/login/widget/ToolTipPopup$Style;)V", "checkToolTipSettings", "", "clearPermissions", "configureButton", "dismissToolTip", "displayToolTip", "toolTipString", "getLoginButtonWidth", "widthMeasureSpec", "measureButtonWidth", "text", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "onMeasure", "heightMeasureSpec", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "parseLoginButtonAttributes", "registerCallback", "callback", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "setButtonIcon", "setButtonRadius", "setButtonText", "setButtonTransparency", "", "([Ljava/lang/String;)V", "setPublishPermissions", "setReadPermissions", "showToolTipPerSettings", "settings", "Lcom/facebook/internal/FetchedAppSettings;", "unregisterCallback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "LoginButtonProperties", "LoginClickListener", "ToolTipMode", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class LoginButton extends com.facebook.FacebookButtonBase {
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;
    private com.facebook.AccessTokenTracker accessTokenTracker;
    private androidx.activity.result.ActivityResultLauncher<java.util.Collection<java.lang.String>> androidXLoginCaller;
    private com.facebook.CallbackManager callbackManager;
    private boolean confirmLogout;
    private java.lang.Float customButtonRadius;
    private int customButtonTransparency;
    private final java.lang.String loggerID;
    private kotlin.Lazy<? extends com.facebook.login.LoginManager> loginManagerLazy;
    private java.lang.String loginText;
    private java.lang.String logoutText;
    private final com.facebook.login.widget.LoginButton.LoginButtonProperties properties;
    private boolean toolTipChecked;
    private long toolTipDisplayTime;
    private com.facebook.login.widget.LoginButton.ToolTipMode toolTipMode;
    private com.facebook.login.widget.ToolTipPopup toolTipPopup;
    private com.facebook.login.widget.ToolTipPopup.Style toolTipStyle;
    private static final java.lang.String TAG = com.facebook.login.widget.LoginButton.class.getName();

    /* compiled from: LoginButton.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.widget.LoginButton.ToolTipMode.values().length];
            iArr[com.facebook.login.widget.LoginButton.ToolTipMode.AUTOMATIC.ordinal()] = 1;
            iArr[com.facebook.login.widget.LoginButton.ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[com.facebook.login.widget.LoginButton.ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0, reason: not valid java name */
    public static final void m5250onAttachedToWindow$lambda0(com.facebook.CallbackManager.ActivityResultParameters activityResultParameters) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected LoginButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, java.lang.String analyticsButtonCreatedEventName, java.lang.String analyticsButtonTappedEventName) {
        super(context, attributeSet, i, i2, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        this.properties = new com.facebook.login.widget.LoginButton.LoginButtonProperties();
        this.toolTipStyle = com.facebook.login.widget.ToolTipPopup.Style.BLUE;
        this.toolTipMode = com.facebook.login.widget.LoginButton.ToolTipMode.INSTANCE.getDEFAULT();
        this.toolTipDisplayTime = com.facebook.login.widget.ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.loginManagerLazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.facebook.login.LoginManager>() { // from class: com.facebook.login.widget.LoginButton$loginManagerLazy$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.facebook.login.LoginManager invoke() {
                return com.facebook.login.LoginManager.INSTANCE.getInstance();
            }
        });
        this.customButtonTransparency = 255;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.loggerID = uuid;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$ToolTipMode, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) from 0x0032: SPUT (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) (LINE:96) com.facebook.login.widget.LoginButton.ToolTipMode.DEFAULT com.facebook.login.widget.LoginButton$ToolTipMode
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: LoginButton.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "", "stringValue", "", "intValue", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIntValue", "()I", "toString", "AUTOMATIC", "DISPLAY_ALWAYS", "NEVER_DISPLAY", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ToolTipMode {
        AUTOMATIC(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private static final com.facebook.login.widget.LoginButton.ToolTipMode DEFAULT = new com.facebook.login.widget.LoginButton.ToolTipMode(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0);
        private final int intValue;
        private final java.lang.String stringValue;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.login.widget.LoginButton.ToolTipMode.Companion INSTANCE = new com.facebook.login.widget.LoginButton.ToolTipMode.Companion(null);

        private ToolTipMode(java.lang.String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public final int getIntValue() {
            return this.intValue;
        }

        static {
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.stringValue;
        }

        /* compiled from: LoginButton.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/facebook/login/widget/LoginButton$ToolTipMode$Companion;", "", "()V", "DEFAULT", "Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "getDEFAULT", "()Lcom/facebook/login/widget/LoginButton$ToolTipMode;", "fromInt", "enumValue", "", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.login.widget.LoginButton.ToolTipMode getDEFAULT() {
                return com.facebook.login.widget.LoginButton.ToolTipMode.DEFAULT;
            }

            public final com.facebook.login.widget.LoginButton.ToolTipMode fromInt(int enumValue) {
                for (com.facebook.login.widget.LoginButton.ToolTipMode toolTipMode : com.facebook.login.widget.LoginButton.ToolTipMode.values()) {
                    if (toolTipMode.getIntValue() == enumValue) {
                        return toolTipMode;
                    }
                }
                return null;
            }
        }

        public static com.facebook.login.widget.LoginButton.ToolTipMode valueOf(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return (com.facebook.login.widget.LoginButton.ToolTipMode) java.lang.Enum.valueOf(com.facebook.login.widget.LoginButton.ToolTipMode.class, value);
        }

        public static com.facebook.login.widget.LoginButton.ToolTipMode[] values() {
            com.facebook.login.widget.LoginButton.ToolTipMode[] toolTipModeArr = $VALUES;
            return (com.facebook.login.widget.LoginButton.ToolTipMode[]) java.util.Arrays.copyOf(toolTipModeArr, toolTipModeArr.length);
        }
    }

    public final java.lang.String getLoginText() {
        return this.loginText;
    }

    public final void setLoginText(java.lang.String str) {
        this.loginText = str;
        setButtonText();
    }

    public final java.lang.String getLogoutText() {
        return this.logoutText;
    }

    public final void setLogoutText(java.lang.String str) {
        this.logoutText = str;
        setButtonText();
    }

    protected final com.facebook.login.widget.LoginButton.LoginButtonProperties getProperties() {
        return this.properties;
    }

    public final com.facebook.login.widget.ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    public final void setToolTipStyle(com.facebook.login.widget.ToolTipPopup.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "<set-?>");
        this.toolTipStyle = style;
    }

    public final com.facebook.login.widget.LoginButton.ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public final void setToolTipMode(com.facebook.login.widget.LoginButton.ToolTipMode toolTipMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toolTipMode, "<set-?>");
        this.toolTipMode = toolTipMode;
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final void setToolTipDisplayTime(long j) {
        this.toolTipDisplayTime = j;
    }

    protected final kotlin.Lazy<com.facebook.login.LoginManager> getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    protected final void setLoginManagerLazy(kotlin.Lazy<? extends com.facebook.login.LoginManager> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.loginManagerLazy = lazy;
    }

    public final java.lang.String getLoggerID() {
        return this.loggerID;
    }

    public final com.facebook.CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    /* compiled from: LoginButton.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010.\u001a\u00020/R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020%@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)¨\u00060"}, d2 = {"Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;", "", "()V", "authType", "", "getAuthType", "()Ljava/lang/String;", "setAuthType", "(Ljava/lang/String;)V", "defaultAudience", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "setDefaultAudience", "(Lcom/facebook/login/DefaultAudience;)V", "loginBehavior", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "setLoginBehavior", "(Lcom/facebook/login/LoginBehavior;)V", "loginTargetApp", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "setLoginTargetApp", "(Lcom/facebook/login/LoginTargetApp;)V", "messengerPageId", "getMessengerPageId", "setMessengerPageId", "permissions", "", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "resetMessengerState", "", "getResetMessengerState", "()Z", "setResetMessengerState", "(Z)V", "<set-?>", "shouldSkipAccountDeduplication", "getShouldSkipAccountDeduplication", "setShouldSkipAccountDeduplication", "clearPermissions", "", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class LoginButtonProperties {
        private java.lang.String messengerPageId;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        private com.facebook.login.DefaultAudience defaultAudience = com.facebook.login.DefaultAudience.FRIENDS;
        private java.util.List<java.lang.String> permissions = kotlin.collections.CollectionsKt.emptyList();
        private com.facebook.login.LoginBehavior loginBehavior = com.facebook.login.LoginBehavior.NATIVE_WITH_FALLBACK;
        private java.lang.String authType = com.facebook.internal.ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        private com.facebook.login.LoginTargetApp loginTargetApp = com.facebook.login.LoginTargetApp.FACEBOOK;

        public final com.facebook.login.DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final void setDefaultAudience(com.facebook.login.DefaultAudience defaultAudience) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAudience, "<set-?>");
            this.defaultAudience = defaultAudience;
        }

        public final java.util.List<java.lang.String> getPermissions() {
            return this.permissions;
        }

        public final void setPermissions(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.permissions = list;
        }

        public final com.facebook.login.LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final void setLoginBehavior(com.facebook.login.LoginBehavior loginBehavior) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginBehavior, "<set-?>");
            this.loginBehavior = loginBehavior;
        }

        public final java.lang.String getAuthType() {
            return this.authType;
        }

        public final void setAuthType(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authType = str;
        }

        public final com.facebook.login.LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        public final void setLoginTargetApp(com.facebook.login.LoginTargetApp loginTargetApp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginTargetApp, "<set-?>");
            this.loginTargetApp = loginTargetApp;
        }

        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        protected final void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }

        public final java.lang.String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final void setMessengerPageId(java.lang.String str) {
            this.messengerPageId = str;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final void clearPermissions() {
            this.permissions = kotlin.collections.CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(android.content.Context context) {
        this(context, null, 0, 0, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final com.facebook.login.DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    public final void setDefaultAudience(com.facebook.login.DefaultAudience value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.properties.setDefaultAudience(value);
    }

    @kotlin.Deprecated(message = "Use setPermissions instead", replaceWith = @kotlin.ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(java.util.List<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.properties.setPermissions(permissions);
    }

    @kotlin.Deprecated(message = "Use setPermissions instead", replaceWith = @kotlin.ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(java.lang.String... permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.properties.setPermissions(kotlin.collections.CollectionsKt.listOfNotNull(java.util.Arrays.copyOf(permissions, permissions.length)));
    }

    public final void setPermissions(java.lang.String... permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.properties.setPermissions(kotlin.collections.CollectionsKt.listOfNotNull(java.util.Arrays.copyOf(permissions, permissions.length)));
    }

    @kotlin.Deprecated(message = "Use setPermissions instead", replaceWith = @kotlin.ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(java.util.List<java.lang.String> permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.properties.setPermissions(permissions);
    }

    @kotlin.Deprecated(message = "Use setPermissions instead", replaceWith = @kotlin.ReplaceWith(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(java.lang.String... permissions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.properties.setPermissions(kotlin.collections.CollectionsKt.listOfNotNull(java.util.Arrays.copyOf(permissions, permissions.length)));
    }

    public final void clearPermissions() {
        this.properties.clearPermissions();
    }

    public final com.facebook.login.LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    public final void setLoginBehavior(com.facebook.login.LoginBehavior value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.properties.setLoginBehavior(value);
    }

    public final com.facebook.login.LoginTargetApp getLoginTargetApp() {
        return this.properties.getLoginTargetApp();
    }

    public final void setLoginTargetApp(com.facebook.login.LoginTargetApp value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.properties.setLoginTargetApp(value);
    }

    public final java.lang.String getAuthType() {
        return this.properties.getAuthType();
    }

    public final void setAuthType(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.properties.setAuthType(value);
    }

    public final java.lang.String getMessengerPageId() {
        return this.properties.getMessengerPageId();
    }

    public final void setMessengerPageId(java.lang.String str) {
        this.properties.setMessengerPageId(str);
    }

    public final boolean getResetMessengerState() {
        return this.properties.getResetMessengerState();
    }

    public final void setResetMessengerState(boolean z) {
        this.properties.setResetMessengerState(z);
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.getShouldSkipAccountDeduplication();
    }

    public final void dismissToolTip() {
        com.facebook.login.widget.ToolTipPopup toolTipPopup = this.toolTipPopup;
        if (toolTipPopup != null) {
            toolTipPopup.dismiss();
        }
        this.toolTipPopup = null;
    }

    public final void registerCallback(com.facebook.CallbackManager callbackManager, com.facebook.FacebookCallback<com.facebook.login.LoginResult> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.loginManagerLazy.getValue().registerCallback(callbackManager, callback);
        com.facebook.CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            android.util.Log.w(TAG, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void unregisterCallback(com.facebook.CallbackManager callbackManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        this.loginManagerLazy.getValue().unregisterCallback(callbackManager);
    }

    protected final int getLoginButtonContinueLabel() {
        return com.facebook.login.R.string.com_facebook_loginview_log_in_button_continue;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof androidx.activity.result.ActivityResultRegistryOwner) {
                java.lang.Object context = getContext();
                if (context == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                this.androidXLoginCaller = ((androidx.activity.result.ActivityResultRegistryOwner) context).getActivityResultRegistry().register("facebook-login", this.loginManagerLazy.getValue().createLogInActivityResultContract(this.callbackManager, this.loggerID), new androidx.activity.result.ActivityResultCallback() { // from class: com.facebook.login.widget.LoginButton$$ExternalSyntheticLambda2
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        com.facebook.login.widget.LoginButton.m5250onAttachedToWindow$lambda0((com.facebook.CallbackManager.ActivityResultParameters) obj);
                    }
                });
            }
            com.facebook.AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null && accessTokenTracker.getIsTracking()) {
                accessTokenTracker.startTracking();
                setButtonText();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            if (this.toolTipChecked || isInEditMode()) {
                return;
            }
            this.toolTipChecked = true;
            checkToolTipSettings();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void showToolTipPerSettings(com.facebook.internal.FetchedAppSettings settings) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || settings == null) {
            return;
        }
        try {
            if (settings.getNuxEnabled() && getVisibility() == 0) {
                displayToolTip(settings.getNuxContent());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void displayToolTip(java.lang.String toolTipString) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.login.widget.ToolTipPopup toolTipPopup = new com.facebook.login.widget.ToolTipPopup(toolTipString, this);
            toolTipPopup.setStyle(this.toolTipStyle);
            toolTipPopup.setNuxDisplayTime(this.toolTipDisplayTime);
            toolTipPopup.show();
            this.toolTipPopup = toolTipPopup;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void checkToolTipSettings() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int i = com.facebook.login.widget.LoginButton.WhenMappings.$EnumSwitchMapping$0[this.toolTipMode.ordinal()];
            if (i == 1) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                final java.lang.String metadataApplicationId = com.facebook.internal.Utility.getMetadataApplicationId(getContext());
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.login.widget.LoginButton$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.login.widget.LoginButton.m5248checkToolTipSettings$lambda3(metadataApplicationId, this);
                    }
                });
                return;
            }
            if (i != 2) {
                return;
            }
            java.lang.String string = getResources().getString(com.facebook.login.R.string.com_facebook_tooltip_default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_tooltip_default)");
            displayToolTip(string);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkToolTipSettings$lambda-3, reason: not valid java name */
    public static final void m5248checkToolTipSettings$lambda3(java.lang.String appId, final com.facebook.login.widget.LoginButton this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "$appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
        final com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(appId, false);
        this$0.getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facebook.login.widget.LoginButton$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.login.widget.LoginButton.m5249checkToolTipSettings$lambda3$lambda2(com.facebook.login.widget.LoginButton.this, queryAppSettings);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkToolTipSettings$lambda-3$lambda-2, reason: not valid java name */
    public static final void m5249checkToolTipSettings$lambda3$lambda2(com.facebook.login.widget.LoginButton this$0, com.facebook.internal.FetchedAppSettings fetchedAppSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showToolTipPerSettings(fetchedAppSettings);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onLayout(changed, left, top, right, bottom);
            setButtonText();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            androidx.activity.result.ActivityResultLauncher<java.util.Collection<java.lang.String>> activityResultLauncher = this.androidXLoginCaller;
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
            }
            com.facebook.AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null) {
                accessTokenTracker.stopTracking();
            }
            dismissToolTip();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(android.view.View changedView, int visibility) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changedView, "changedView");
            super.onVisibilityChanged(changedView, visibility);
            if (visibility != 0) {
                dismissToolTip();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final java.util.List<java.lang.String> getPermissions() {
        return this.properties.getPermissions();
    }

    public final void setPermissions(java.util.List<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.properties.setPermissions(value);
    }

    @Override // com.facebook.FacebookButtonBase
    protected void configureButton(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            super.configureButton(context, attrs, defStyleAttr, defStyleRes);
            setInternalOnClickListener(getNewLoginClickListener());
            parseLoginButtonAttributes(context, attrs, defStyleAttr, defStyleRes);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.accessTokenTracker = new com.facebook.AccessTokenTracker() { // from class: com.facebook.login.widget.LoginButton$configureButton$1
                    @Override // com.facebook.AccessTokenTracker
                    protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken currentAccessToken) {
                        com.facebook.login.widget.LoginButton.this.setButtonText();
                        com.facebook.login.widget.LoginButton.this.setButtonIcon();
                    }
                };
            }
            setButtonText();
            setButtonRadius();
            setButtonTransparency();
            setButtonIcon();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected com.facebook.login.widget.LoginButton.LoginClickListener getNewLoginClickListener() {
        return new com.facebook.login.widget.LoginButton.LoginClickListener(this);
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultStyleResource() {
        return com.facebook.login.R.style.com_facebook_loginview_default_style;
    }

    protected final void parseLoginButtonAttributes(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            this.toolTipMode = com.facebook.login.widget.LoginButton.ToolTipMode.INSTANCE.getDEFAULT();
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.facebook.login.R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            try {
                this.confirmLogout = obtainStyledAttributes.getBoolean(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(obtainStyledAttributes.getString(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(obtainStyledAttributes.getString(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_logout_text));
                com.facebook.login.widget.LoginButton.ToolTipMode fromInt = com.facebook.login.widget.LoginButton.ToolTipMode.INSTANCE.fromInt(obtainStyledAttributes.getInt(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, com.facebook.login.widget.LoginButton.ToolTipMode.INSTANCE.getDEFAULT().getIntValue()));
                if (fromInt == null) {
                    fromInt = com.facebook.login.widget.LoginButton.ToolTipMode.INSTANCE.getDEFAULT();
                }
                this.toolTipMode = fromInt;
                if (obtainStyledAttributes.hasValue(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.customButtonRadius = java.lang.Float.valueOf(obtainStyledAttributes.getDimension(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, 255);
                this.customButtonTransparency = integer;
                int max = java.lang.Math.max(0, integer);
                this.customButtonTransparency = max;
                this.customButtonTransparency = java.lang.Math.min(255, max);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) java.lang.Math.ceil(java.lang.Math.abs(fontMetrics.top) + java.lang.Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            android.content.res.Resources resources = getResources();
            int loginButtonWidth = getLoginButtonWidth(widthMeasureSpec);
            java.lang.String str = this.logoutText;
            if (str == null) {
                str = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_out_button);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(android.widget.Button.resolveSize(java.lang.Math.max(loginButtonWidth, measureButtonWidth(str)), widthMeasureSpec), compoundPaddingTop);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final int getLoginButtonWidth(int widthMeasureSpec) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            android.content.res.Resources resources = getResources();
            java.lang.String str = this.loginText;
            if (str == null) {
                str = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button_continue);
                int measureButtonWidth = measureButtonWidth(str);
                if (android.widget.Button.resolveSize(measureButtonWidth, widthMeasureSpec) < measureButtonWidth) {
                    str = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final int measureButtonWidth(java.lang.String text) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(text) + getCompoundPaddingRight();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    protected final void setButtonText() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.content.res.Resources resources = getResources();
            if (!isInEditMode() && com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
                java.lang.String str = this.logoutText;
                setText(str == null ? resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_out_button) : str);
                return;
            }
            java.lang.String str2 = this.loginText;
            if (str2 != null) {
                setText(str2);
                return;
            }
            java.lang.String string = resources.getString(getLoginButtonContinueLabel());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && measureButtonWidth(string) > width) {
                string = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonIcon() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonRadius() {
        int stateCount;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.Float f = this.customButtonRadius;
            if (f == null) {
                return;
            }
            float floatValue = f.floatValue();
            android.graphics.drawable.Drawable background = getBackground();
            if (android.os.Build.VERSION.SDK_INT >= 29 && (background instanceof android.graphics.drawable.StateListDrawable) && (stateCount = ((android.graphics.drawable.StateListDrawable) background).getStateCount()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    android.graphics.drawable.Drawable stateDrawable = ((android.graphics.drawable.StateListDrawable) background).getStateDrawable(i);
                    android.graphics.drawable.GradientDrawable gradientDrawable = stateDrawable instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) stateDrawable : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(floatValue);
                    }
                    if (i2 >= stateCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (background instanceof android.graphics.drawable.GradientDrawable) {
                ((android.graphics.drawable.GradientDrawable) background).setCornerRadius(floatValue);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonTransparency() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.customButtonTransparency);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultRequestCode() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* compiled from: LoginButton.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0095\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0004J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0004R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/widget/LoginButton$LoginClickListener;", "Landroid/view/View$OnClickListener;", "(Lcom/facebook/login/widget/LoginButton;)V", "isFamilyLogin", "", "()Z", "loginTargetApp", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "getLoginManager", "Lcom/facebook/login/LoginManager;", "onClick", "", "v", "Landroid/view/View;", "performLogin", "performLogout", "context", "Landroid/content/Context;", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    protected class LoginClickListener implements android.view.View.OnClickListener {
        final /* synthetic */ com.facebook.login.widget.LoginButton this$0;

        protected final boolean isFamilyLogin() {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        public LoginClickListener(com.facebook.login.widget.LoginButton this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View v) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
                    this.this$0.callExternalOnClickListener(v);
                    com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
                    boolean isCurrentAccessTokenActive = com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive();
                    if (isCurrentAccessTokenActive) {
                        android.content.Context context = this.this$0.getContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
                        performLogout(context);
                    } else {
                        performLogin();
                    }
                    com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(this.this$0.getContext());
                    android.os.Bundle bundle = new android.os.Bundle();
                    int i = 0;
                    if (currentAccessToken == null) {
                        i = 1;
                    }
                    bundle.putInt("logging_in", i);
                    bundle.putInt("access_token_expired", isCurrentAccessTokenActive ? 1 : 0);
                    internalAppEventsLogger.logEventImplicitly(com.facebook.internal.AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE, bundle);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        protected final void performLogin() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                com.facebook.login.LoginManager loginManager = getLoginManager();
                androidx.activity.result.ActivityResultLauncher activityResultLauncher = this.this$0.androidXLoginCaller;
                if (activityResultLauncher != null) {
                    com.facebook.login.LoginManager.FacebookLoginActivityResultContract facebookLoginActivityResultContract = (com.facebook.login.LoginManager.FacebookLoginActivityResultContract) activityResultLauncher.getContract();
                    com.facebook.internal.CallbackManagerImpl callbackManager = this.this$0.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new com.facebook.internal.CallbackManagerImpl();
                    }
                    facebookLoginActivityResultContract.setCallbackManager(callbackManager);
                    activityResultLauncher.launch(this.this$0.getProperties().getPermissions());
                    return;
                }
                if (this.this$0.getFragment() != null) {
                    androidx.fragment.app.Fragment fragment = this.this$0.getFragment();
                    if (fragment == null) {
                        return;
                    }
                    com.facebook.login.widget.LoginButton loginButton = this.this$0;
                    loginManager.logIn(fragment, loginButton.getProperties().getPermissions(), loginButton.getLoggerID());
                    return;
                }
                if (this.this$0.getNativeFragment() == null) {
                    loginManager.logIn(this.this$0.getActivity(), this.this$0.getProperties().getPermissions(), this.this$0.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = this.this$0.getNativeFragment();
                if (nativeFragment == null) {
                    return;
                }
                com.facebook.login.widget.LoginButton loginButton2 = this.this$0;
                loginManager.logIn(nativeFragment, loginButton2.getProperties().getPermissions(), loginButton2.getLoggerID());
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }

        protected final void performLogout(android.content.Context context) {
            java.lang.String string;
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                final com.facebook.login.LoginManager loginManager = getLoginManager();
                if (this.this$0.confirmLogout) {
                    java.lang.String string2 = this.this$0.getResources().getString(com.facebook.login.R.string.com_facebook_loginview_log_out_action);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                    java.lang.String string3 = this.this$0.getResources().getString(com.facebook.login.R.string.com_facebook_loginview_cancel_action);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                    com.facebook.Profile currentProfile = com.facebook.Profile.INSTANCE.getCurrentProfile();
                    if ((currentProfile == null ? null : currentProfile.getName()) != null) {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String string4 = this.this$0.getResources().getString(com.facebook.login.R.string.com_facebook_loginview_logged_in_as);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                        string = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{currentProfile.getName()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "java.lang.String.format(format, *args)");
                    } else {
                        string = this.this$0.getResources().getString(com.facebook.login.R.string.com_facebook_loginview_logged_in_using_facebook);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                    }
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
                    builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new android.content.DialogInterface.OnClickListener() { // from class: com.facebook.login.widget.LoginButton$LoginClickListener$$ExternalSyntheticLambda0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                            com.facebook.login.widget.LoginButton.LoginClickListener.m5251performLogout$lambda2(com.facebook.login.LoginManager.this, dialogInterface, i);
                        }
                    }).setNegativeButton(string3, (android.content.DialogInterface.OnClickListener) null);
                    builder.create().show();
                    return;
                }
                loginManager.logOut();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: performLogout$lambda-2, reason: not valid java name */
        public static final void m5251performLogout$lambda2(com.facebook.login.LoginManager loginManager, android.content.DialogInterface dialogInterface, int i) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.widget.LoginButton.LoginClickListener.class)) {
                return;
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginManager, "$loginManager");
                loginManager.logOut();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.widget.LoginButton.LoginClickListener.class);
            }
        }

        protected com.facebook.login.LoginManager getLoginManager() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                com.facebook.login.LoginManager companion = com.facebook.login.LoginManager.INSTANCE.getInstance();
                companion.setDefaultAudience(this.this$0.getDefaultAudience());
                companion.setLoginBehavior(this.this$0.getLoginBehavior());
                companion.setLoginTargetApp(getLoginTargetApp());
                companion.setAuthType(this.this$0.getAuthType());
                companion.setFamilyLogin(isFamilyLogin());
                companion.setShouldSkipAccountDeduplication(this.this$0.getShouldSkipAccountDeduplication());
                companion.setMessengerPageId(this.this$0.getMessengerPageId());
                companion.setResetMessengerState(this.this$0.getResetMessengerState());
                return companion;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        protected final com.facebook.login.LoginTargetApp getLoginTargetApp() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return com.facebook.login.LoginTargetApp.FACEBOOK;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }
}
