package org.betup.ui.fragment.login.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Patterns;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.auth.GoogleSignInCredentialManagerHelper;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.login.compose.AuthScreen;
import org.betup.utils.FacebookSdkHelper;
import org.betup.utils.FirebaseErrorHandler;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AuthController.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:\u0006\u0098\u0001\u0099\u0001\u009a\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001cJ\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/J\b\u00105\u001a\u00020/H\u0002J\u000e\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020HJ\b\u0010M\u001a\u00020NH\u0002J\u0014\u0010O\u001a\u00020/2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020/0QJ\u0006\u0010R\u001a\u00020/J$\u0010S\u001a\u00020/2\u0006\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020;2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020/0QJ:\u0010W\u001a\u00020/2\u0006\u0010X\u001a\u00020;2\u0006\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020;2\u0006\u0010Y\u001a\u00020;2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0ZJ\u001c\u0010[\u001a\u00020/2\u0006\u0010\\\u001a\u00020\u00152\f\u0010V\u001a\b\u0012\u0004\u0012\u00020/0QJ6\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020\u00192\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020/0QJ0\u0010a\u001a\u00020/2\u0006\u0010^\u001a\u00020\u00192\u0006\u0010b\u001a\u00020;2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_J0\u0010c\u001a\u00020/2\u0006\u0010^\u001a\u00020\u00192\u0006\u0010d\u001a\u00020e2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_J.\u0010f\u001a\u00020/2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020h2\b\u0010j\u001a\u0004\u0018\u00010k2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020/0QJ\u0014\u0010l\u001a\u00020/2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020/0QJ\u000e\u0010m\u001a\u00020/2\u0006\u00100\u001a\u00020\u001cJ\u000e\u0010n\u001a\u00020/2\u0006\u00100\u001a\u00020\u001cJ\u0010\u0010o\u001a\u00020/2\b\u0010^\u001a\u0004\u0018\u00010\u0019J\u000e\u0010p\u001a\u00020/2\u0006\u0010q\u001a\u00020;J(\u0010r\u001a\u00020/2\u0006\u0010^\u001a\u00020\u00192\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_J\u000e\u0010s\u001a\u00020/2\u0006\u00100\u001a\u00020\u001cJ6\u0010t\u001a\u00020/2\u0006\u0010T\u001a\u00020;2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020/0Z2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020/0ZJ\u0006\u0010v\u001a\u00020/J\u0010\u0010w\u001a\u00020x2\u0006\u0010T\u001a\u00020;H\u0002J\u0010\u0010y\u001a\u00020x2\u0006\u0010U\u001a\u00020;H\u0002J\u0010\u0010z\u001a\u00020/2\u0006\u0010{\u001a\u00020;H\u0002J@\u0010|\u001a\u00020/2\u0006\u0010}\u001a\u00020;2\u0006\u0010~\u001a\u00020;2\b\u0010\u007f\u001a\u0004\u0018\u00010;2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010h2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010\u0082\u0001J/\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010}\u001a\u00020;2\u0006\u0010~\u001a\u00020;2\u0007\u0010\u0084\u0001\u001a\u00020;2\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010;H\u0002J\t\u0010\u0086\u0001\u001a\u00020/H\u0002J5\u0010\u0087\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020\u00192\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_H\u0002J-\u0010\u008a\u0001\u001a\u00020/2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_H\u0002J4\u0010\u008d\u0001\u001a\u00020/2\u0007\u0010d\u001a\u00030\u008e\u00012\u0006\u0010}\u001a\u00020;2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00192\f\u0010V\u001a\b\u0012\u0004\u0012\u00020/0QH\u0002J\t\u0010\u0090\u0001\u001a\u00020/H\u0002J!\u0010\u0091\u0001\u001a\u00020/2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020/0_J\u0011\u0010\u0092\u0001\u001a\u00020/2\u0006\u0010{\u001a\u00020;H\u0002J%\u0010\u0093\u0001\u001a\u00020;2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010h2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0003\u0010\u0095\u0001J\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0015J\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u001e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001fR\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001fR\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u001fR\u0016\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001fR\u0016\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001fR\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u001fR\u001e\u0010\u008f\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020/\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u009b\u0001"}, d2 = {"Lorg/betup/ui/fragment/login/controller/AuthController;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "socialConnectionService", "Lorg/betup/services/user/SocialConnectionService;", "getSocialConnectionService", "()Lorg/betup/services/user/SocialConnectionService;", "setSocialConnectionService", "(Lorg/betup/services/user/SocialConnectionService;)V", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "callbackManager", "Lcom/facebook/CallbackManager;", "activityForSocialLogin", "Landroid/app/Activity;", "_isLoadingEmailLogin", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoadingEmailLogin", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoadingRegistration", "isLoadingRegistration", "_isLoadingFacebook", "isLoadingFacebook", "_isLoadingGoogle", "isLoadingGoogle", "_isLoadingVK", "isLoadingVK", "_isLoadingResetPassword", "isLoadingResetPassword", "_isLoadingGuest", "isLoadingGuest", "_isLoading", "isLoading", "setGuestLoading", "", "loading", "_isCompletingAuth", "isCompletingAuth", "beginBackendAuth", "endBackendAuth", "clearAllActionLoading", "_loginError", "Lorg/betup/ui/fragment/login/controller/AuthController$LoginError;", "loginError", "getLoginError", "_emailError", "", "emailError", "getEmailError", "_passwordError", "passwordError", "getPasswordError", "_nameError", "nameError", "getNameError", "_confirmPasswordError", "confirmPasswordError", "getConfirmPasswordError", "_currentScreen", "Lorg/betup/ui/fragment/login/compose/AuthScreen;", "currentScreen", "getCurrentScreen", "navigateTo", "screen", "buildGoogleSignInOptions", "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;", "runAfterClearingGoogleAccountForSignIn", "onReady", "Lkotlin/Function0;", "initialize", "signInWithEmail", "email", "password", "onSuccess", "registerWithEmail", "name", "confirmPassword", "Lkotlin/Function1;", "signInWithGoogle", "googleApiClient", "signInWithGoogleWithCredentialManager", "activity", "Lkotlin/Function2;", "onFallbackToLegacy", "firebaseAuthWithGoogleIdToken", "idToken", "handleGoogleSignInResult", "result", "Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;", "handleFacebookCallback", "requestCode", "", X3.f.f, "data", "Landroid/content/Intent;", "signInWithVK", "setVKLoading", "setGoogleLoading", "setActivityForSocialLogin", "setGoogleSignInError", "message", "tryCredentialManagerAsFallback", "setFacebookLoading", "resetPassword", "onError", "clearErrors", "validateEmail", "Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult;", "validatePassword", "handleLoginError", "errorMessage", "reportAuthFailure", IronSourceConstants.EVENTS_PROVIDER, X3.i.q, "reason", "statusCode", "recordExceptionToCrashlytics", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "reportAuthStage", "outcome", "detail", "clearStaleGoogleAuthState", "firebaseAuthWithGoogle", "acct", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "firebaseAuthWithFacebook", "token", "Lcom/facebook/AccessToken;", "proceedAfterSocialLogin", "Lcom/google/firebase/auth/AuthResult;", "facebookSuccessCallback", "registerFacebookCallbacks", "signInWithFacebook", "handleRegistrationError", "getGoogleSignInErrorMessage", "statusMessage", "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "getGoogleApiClient", "getCallbackManager", "LoginError", "ValidationResult", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthController {
    private static final String TAG = "AuthController";
    private final MutableStateFlow<String> _confirmPasswordError;
    private final MutableStateFlow<AuthScreen> _currentScreen;
    private final MutableStateFlow<String> _emailError;
    private final MutableStateFlow<Boolean> _isCompletingAuth;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingEmailLogin;
    private final MutableStateFlow<Boolean> _isLoadingFacebook;
    private final MutableStateFlow<Boolean> _isLoadingGoogle;
    private final MutableStateFlow<Boolean> _isLoadingGuest;
    private final MutableStateFlow<Boolean> _isLoadingRegistration;
    private final MutableStateFlow<Boolean> _isLoadingResetPassword;
    private final MutableStateFlow<Boolean> _isLoadingVK;
    private final MutableStateFlow<LoginError> _loginError;
    private final MutableStateFlow<String> _nameError;
    private final MutableStateFlow<String> _passwordError;
    private Activity activityForSocialLogin;
    private CallbackManager callbackManager;
    private final StateFlow<String> confirmPasswordError;
    private final Context context;
    private final StateFlow<AuthScreen> currentScreen;
    private final StateFlow<String> emailError;
    private Function1<? super AccessToken, Unit> facebookSuccessCallback;
    private final StateFlow<Boolean> isCompletingAuth;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingEmailLogin;
    private final StateFlow<Boolean> isLoadingFacebook;
    private final StateFlow<Boolean> isLoadingGoogle;
    private final StateFlow<Boolean> isLoadingGuest;
    private final StateFlow<Boolean> isLoadingRegistration;
    private final StateFlow<Boolean> isLoadingResetPassword;
    private final StateFlow<Boolean> isLoadingVK;
    private final StateFlow<LoginError> loginError;
    private final FirebaseAuth mAuth;
    private GoogleApiClient mGoogleApiClient;
    private final StateFlow<String> nameError;
    private final StateFlow<String> passwordError;

    @Inject
    public SocialConnectionService socialConnectionService;

    @Inject
    public UserService userService;
    public static final int $stable = 8;

    @Inject
    public AuthController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        this.mAuth = firebaseAuth;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoadingEmailLogin = MutableStateFlow;
        this.isLoadingEmailLogin = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingRegistration = MutableStateFlow2;
        this.isLoadingRegistration = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingFacebook = MutableStateFlow3;
        this.isLoadingFacebook = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingGoogle = MutableStateFlow4;
        this.isLoadingGoogle = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingVK = MutableStateFlow5;
        this.isLoadingVK = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingResetPassword = MutableStateFlow6;
        this.isLoadingResetPassword = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingGuest = MutableStateFlow7;
        this.isLoadingGuest = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow8;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isCompletingAuth = MutableStateFlow9;
        this.isCompletingAuth = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<LoginError> MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this._loginError = MutableStateFlow10;
        this.loginError = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<String> MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this._emailError = MutableStateFlow11;
        this.emailError = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<String> MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this._passwordError = MutableStateFlow12;
        this.passwordError = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<String> MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this._nameError = MutableStateFlow13;
        this.nameError = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<String> MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this._confirmPasswordError = MutableStateFlow14;
        this.confirmPasswordError = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<AuthScreen> MutableStateFlow15 = StateFlowKt.MutableStateFlow(AuthScreen.GuestEntry.INSTANCE);
        this._currentScreen = MutableStateFlow15;
        this.currentScreen = FlowKt.asStateFlow(MutableStateFlow15);
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final SocialConnectionService getSocialConnectionService() {
        SocialConnectionService socialConnectionService = this.socialConnectionService;
        if (socialConnectionService != null) {
            return socialConnectionService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socialConnectionService");
        return null;
    }

    public final void setSocialConnectionService(SocialConnectionService socialConnectionService) {
        Intrinsics.checkNotNullParameter(socialConnectionService, "<set-?>");
        this.socialConnectionService = socialConnectionService;
    }

    public final StateFlow<Boolean> isLoadingEmailLogin() {
        return this.isLoadingEmailLogin;
    }

    public final StateFlow<Boolean> isLoadingRegistration() {
        return this.isLoadingRegistration;
    }

    public final StateFlow<Boolean> isLoadingFacebook() {
        return this.isLoadingFacebook;
    }

    public final StateFlow<Boolean> isLoadingGoogle() {
        return this.isLoadingGoogle;
    }

    public final StateFlow<Boolean> isLoadingVK() {
        return this.isLoadingVK;
    }

    public final StateFlow<Boolean> isLoadingResetPassword() {
        return this.isLoadingResetPassword;
    }

    public final StateFlow<Boolean> isLoadingGuest() {
        return this.isLoadingGuest;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void setGuestLoading(boolean loading) {
        this._isLoadingGuest.setValue(Boolean.valueOf(loading));
    }

    public final StateFlow<Boolean> isCompletingAuth() {
        return this.isCompletingAuth;
    }

    public final void beginBackendAuth() {
        clearAllActionLoading();
        this._isCompletingAuth.setValue(true);
    }

    public final void endBackendAuth() {
        this._isCompletingAuth.setValue(false);
        clearAllActionLoading();
    }

    private final void clearAllActionLoading() {
        this._isLoadingEmailLogin.setValue(false);
        this._isLoadingRegistration.setValue(false);
        this._isLoadingFacebook.setValue(false);
        this._isLoadingGoogle.setValue(false);
        this._isLoadingVK.setValue(false);
        this._isLoadingGuest.setValue(false);
        this._isLoadingResetPassword.setValue(false);
    }

    public final StateFlow<LoginError> getLoginError() {
        return this.loginError;
    }

    public final StateFlow<String> getEmailError() {
        return this.emailError;
    }

    public final StateFlow<String> getPasswordError() {
        return this.passwordError;
    }

    public final StateFlow<String> getNameError() {
        return this.nameError;
    }

    public final StateFlow<String> getConfirmPasswordError() {
        return this.confirmPasswordError;
    }

    public final StateFlow<AuthScreen> getCurrentScreen() {
        return this.currentScreen;
    }

    public final void navigateTo(AuthScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this._currentScreen.setValue(screen);
    }

    /* compiled from: AuthController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/login/controller/AuthController$LoginError;", "", "emailError", "", "passwordError", "generalError", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmailError", "()Ljava/lang/String;", "getPasswordError", "getGeneralError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoginError {
        public static final int $stable = 0;
        private final String emailError;
        private final String generalError;
        private final String passwordError;

        public LoginError() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ LoginError copy$default(LoginError loginError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginError.emailError;
            }
            if ((i & 2) != 0) {
                str2 = loginError.passwordError;
            }
            if ((i & 4) != 0) {
                str3 = loginError.generalError;
            }
            return loginError.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmailError() {
            return this.emailError;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPasswordError() {
            return this.passwordError;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGeneralError() {
            return this.generalError;
        }

        public final LoginError copy(String emailError, String passwordError, String generalError) {
            return new LoginError(emailError, passwordError, generalError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginError)) {
                return false;
            }
            LoginError loginError = (LoginError) other;
            return Intrinsics.areEqual(this.emailError, loginError.emailError) && Intrinsics.areEqual(this.passwordError, loginError.passwordError) && Intrinsics.areEqual(this.generalError, loginError.generalError);
        }

        public int hashCode() {
            String str = this.emailError;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.passwordError;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.generalError;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "LoginError(emailError=" + this.emailError + ", passwordError=" + this.passwordError + ", generalError=" + this.generalError + ")";
        }

        public LoginError(String str, String str2, String str3) {
            this.emailError = str;
            this.passwordError = str2;
            this.generalError = str3;
        }

        public /* synthetic */ LoginError(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getEmailError() {
            return this.emailError;
        }

        public final String getPasswordError() {
            return this.passwordError;
        }

        public final String getGeneralError() {
            return this.generalError;
        }
    }

    private final GoogleSignInOptions buildGoogleSignInOptions() {
        String string = this.context.getString(R.string.default_web_client_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(string).requestEmail().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final void runAfterClearingGoogleAccountForSignIn(final Function0<Unit> onReady) {
        Intrinsics.checkNotNullParameter(onReady, "onReady");
        try {
            Intrinsics.checkNotNull(GoogleSignIn.getClient(this.context.getApplicationContext(), buildGoogleSignInOptions()).signOut().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthController.runAfterClearingGoogleAccountForSignIn$lambda$0(Function0.this, task);
                }
            }));
        } catch (Exception e) {
            Log.w(TAG, "runAfterClearingGoogleAccountForSignIn: signOut failed, continuing", e);
            onReady.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runAfterClearingGoogleAccountForSignIn$lambda$0(Function0 function0, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
    }

    public final void initialize() {
        this.callbackManager = CallbackManager.Factory.create();
        if (FacebookSdkHelper.ensureInitialized(this.context)) {
            registerFacebookCallbacks();
        } else {
            Log.e(TAG, "Facebook SDK unavailable; Facebook login disabled for this session");
        }
        Log.d(TAG, "=== Initializing GoogleApiClient ===");
        try {
            String string = this.context.getString(R.string.default_web_client_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Log.d(TAG, "Web client ID: " + (string.length() > 0 ? "set (length: " + string.length() + ")" : "empty"));
            GoogleSignInOptions buildGoogleSignInOptions = buildGoogleSignInOptions();
            Log.d(TAG, "GoogleSignInOptions built successfully");
            this.mGoogleApiClient = new GoogleApiClient.Builder(this.context.getApplicationContext()).addApi(Auth.GOOGLE_SIGN_IN_API, buildGoogleSignInOptions).build();
            Log.d(TAG, "GoogleApiClient built successfully");
            GoogleApiClient googleApiClient = this.mGoogleApiClient;
            Log.d(TAG, "GoogleApiClient.isConnected: " + (googleApiClient != null ? Boolean.valueOf(googleApiClient.isConnected()) : null));
        } catch (Exception e) {
            Log.e(TAG, "Error initializing GoogleApiClient", e);
        }
    }

    public final void signInWithEmail(String email, String password, final Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this._isLoadingEmailLogin.setValue(true);
        this._loginError.setValue(null);
        this._emailError.setValue(null);
        this._passwordError.setValue(null);
        ValidationResult validateEmail = validateEmail(email);
        if (validateEmail instanceof ValidationResult.Error) {
            this._emailError.setValue(((ValidationResult.Error) validateEmail).getMessage());
            this._isLoadingEmailLogin.setValue(false);
        } else {
            if (!(validateEmail instanceof ValidationResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ValidationResult validatePassword = validatePassword(password);
            if (validatePassword instanceof ValidationResult.Error) {
                this._passwordError.setValue(((ValidationResult.Error) validatePassword).getMessage());
                this._isLoadingEmailLogin.setValue(false);
            } else {
                if (!(validatePassword instanceof ValidationResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda13
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        AuthController.signInWithEmail$lambda$1(AuthController.this, onSuccess, task);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void signInWithEmail$lambda$1(AuthController authController, Function0 function0, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            authController._isLoadingEmailLogin.setValue(false);
            String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
            reportAuthFailure$default(authController, "email", "firebase_sign_in", messageForError, null, false, 24, null);
            Intrinsics.checkNotNull(messageForError);
            authController.handleLoginError(messageForError);
            return;
        }
        reportAuthStage$default(authController, "email", "firebase_sign_in", "success", null, 8, null);
        authController.clearErrors();
        function0.invoke();
    }

    public final void registerWithEmail(final String name, String email, String password, String confirmPassword, final Function1<? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this._isLoadingRegistration.setValue(true);
        this._loginError.setValue(null);
        this._nameError.setValue(null);
        this._emailError.setValue(null);
        this._passwordError.setValue(null);
        this._confirmPasswordError.setValue(null);
        if (StringsKt.isBlank(name)) {
            this._nameError.setValue(this.context.getString(R.string.name_cannot_be_empty));
            this._isLoadingRegistration.setValue(false);
            return;
        }
        ValidationResult validateEmail = validateEmail(email);
        if (validateEmail instanceof ValidationResult.Error) {
            this._emailError.setValue(((ValidationResult.Error) validateEmail).getMessage());
            this._isLoadingRegistration.setValue(false);
            return;
        }
        if (!(validateEmail instanceof ValidationResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ValidationResult validatePassword = validatePassword(password);
        if (validatePassword instanceof ValidationResult.Error) {
            this._passwordError.setValue(((ValidationResult.Error) validatePassword).getMessage());
            this._isLoadingRegistration.setValue(false);
        } else {
            if (!(validatePassword instanceof ValidationResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!Intrinsics.areEqual(password, confirmPassword)) {
                this._confirmPasswordError.setValue(this.context.getString(R.string.password_do_not_match));
                this._isLoadingRegistration.setValue(false);
            } else if (getUserService().isAnonymous()) {
                getSocialConnectionService().connectEmailToAnonymous(name, email, password, new SocialConnectionService.OnLoginOperationCompletedListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$registerWithEmail$1
                    @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                    public void onLoginOperationCompleted() {
                        AuthController.this.clearErrors();
                        onSuccess.invoke(true);
                    }

                    @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                    public void onLoginOperationFailed(String reason) {
                        MutableStateFlow mutableStateFlow;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        mutableStateFlow = AuthController.this._isLoadingRegistration;
                        mutableStateFlow.setValue(false);
                        AuthController.reportAuthFailure$default(AuthController.this, "email", "anonymous_upgrade_link", reason, null, false, 24, null);
                        AuthController.this.handleRegistrationError(reason);
                    }
                });
            } else {
                this.mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda10
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        AuthController.registerWithEmail$lambda$3(AuthController.this, name, onSuccess, task);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerWithEmail$lambda$3(final AuthController authController, String str, final Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            authController._isLoadingRegistration.setValue(false);
            String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
            reportAuthFailure$default(authController, "email", "firebase_register", messageForError, null, false, 24, null);
            Intrinsics.checkNotNull(messageForError);
            authController.handleRegistrationError(messageForError);
            return;
        }
        FirebaseUser currentUser = authController.mAuth.getCurrentUser();
        if (currentUser == null) {
            authController._isLoadingRegistration.setValue(false);
            reportAuthFailure$default(authController, "email", "firebase_register", authController.context.getString(R.string.auth_failed), null, false, 24, null);
            String string = authController.context.getString(R.string.auth_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            authController.handleRegistrationError(string);
            return;
        }
        UserProfileChangeRequest build = new UserProfileChangeRequest.Builder().setDisplayName(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        currentUser.updateProfile(build).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                AuthController.registerWithEmail$lambda$3$lambda$2(AuthController.this, function1, task2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerWithEmail$lambda$3$lambda$2(AuthController authController, Function1 function1, Task updateTask) {
        Intrinsics.checkNotNullParameter(updateTask, "updateTask");
        if (updateTask.isSuccessful()) {
            authController.clearErrors();
            function1.invoke(false);
            return;
        }
        authController._isLoadingRegistration.setValue(false);
        String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, updateTask);
        reportAuthFailure$default(authController, "email", "firebase_profile_update", messageForError, null, false, 24, null);
        Intrinsics.checkNotNull(messageForError);
        authController.handleRegistrationError(messageForError);
    }

    public final void signInWithGoogle(GoogleApiClient googleApiClient, Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this._isLoadingGoogle.setValue(true);
        this._loginError.setValue(null);
        Intrinsics.checkNotNullExpressionValue(Auth.GoogleSignInApi.getSignInIntent(googleApiClient), "getSignInIntent(...)");
    }

    public final void signInWithGoogleWithCredentialManager(final Activity activity, final Function2<? super Boolean, ? super Boolean, Unit> onSuccess, final Function0<Unit> onFallbackToLegacy) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFallbackToLegacy, "onFallbackToLegacy");
        this._isLoadingGoogle.setValue(true);
        this._loginError.setValue(null);
        reportAuthStage$default(this, "google", "credential_manager", TtmlNode.START, null, 8, null);
        String string = this.context.getString(R.string.default_web_client_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (StringsKt.isBlank(string)) {
            Log.e(TAG, "default_web_client_id is empty - check google-services.json and Firebase Console");
            this._isLoadingGoogle.setValue(false);
            String string2 = this.context.getString(R.string.auth_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            handleLoginError(string2);
            return;
        }
        new GoogleSignInCredentialManagerHelper(this.context).requestGoogleIdToken(activity, string, new Function1() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit signInWithGoogleWithCredentialManager$lambda$4;
                signInWithGoogleWithCredentialManager$lambda$4 = AuthController.signInWithGoogleWithCredentialManager$lambda$4(AuthController.this, activity, onSuccess, onFallbackToLegacy, (String) obj);
                return signInWithGoogleWithCredentialManager$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signInWithGoogleWithCredentialManager$lambda$4(AuthController authController, Activity activity, Function2 function2, Function0 function0, String str) {
        if (str != null) {
            reportAuthStage$default(authController, "google", "credential_manager", "token_received", null, 8, null);
            authController.firebaseAuthWithGoogleIdToken(activity, str, function2);
        } else {
            reportAuthStage$default(authController, "google", "credential_manager", "fallback_to_legacy", null, 8, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void firebaseAuthWithGoogleIdToken(final Activity activity, String idToken, final Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Log.d(TAG, "=== firebaseAuthWithGoogleIdToken (Credential Manager) ===");
        if (getUserService().isAnonymous()) {
            getSocialConnectionService().connectGoogleToAnonymousWithIdToken(activity, idToken, new SocialConnectionService.OnLoginOperationCompletedListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$firebaseAuthWithGoogleIdToken$1
                @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                public void onLoginOperationCompleted() {
                    MutableStateFlow mutableStateFlow;
                    mutableStateFlow = AuthController.this._isLoadingGoogle;
                    mutableStateFlow.setValue(false);
                    AuthController.this.clearErrors();
                    onSuccess.invoke(true, false);
                }

                @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                public void onLoginOperationFailed(String reason) {
                    MutableStateFlow mutableStateFlow;
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    mutableStateFlow = AuthController.this._isLoadingGoogle;
                    mutableStateFlow.setValue(false);
                    AuthController.reportAuthFailure$default(AuthController.this, "google", "anonymous_upgrade_link", reason, null, false, 24, null);
                    AuthController.this.handleLoginError(reason);
                }
            });
            return;
        }
        try {
            AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
            Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
            Log.d(TAG, "Credential created from idToken, signing in with Firebase...");
            Intrinsics.checkNotNull(this.mAuth.signInWithCredential(credential).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthController.firebaseAuthWithGoogleIdToken$lambda$6(AuthController.this, activity, onSuccess, task);
                }
            }));
        } catch (Exception e) {
            Log.e(TAG, "Error in firebaseAuthWithGoogleIdToken", e);
            this._isLoadingGoogle.setValue(false);
            reportAuthFailure$default(this, "google", "credential_manager_firebase_sign_in", e.getMessage(), null, false, 24, null);
            String message = e.getMessage();
            if (message == null) {
                message = this.context.getString(R.string.unknown_error);
                Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
            }
            handleLoginError(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firebaseAuthWithGoogleIdToken$lambda$6(AuthController authController, Activity activity, final Function2 function2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        authController._isLoadingGoogle.setValue(false);
        if (task.isSuccessful()) {
            AdditionalUserInfo additionalUserInfo = ((AuthResult) task.getResult()).getAdditionalUserInfo();
            final boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
            authController.reportAuthStage("google", "firebase_sign_in", "success", "credential_manager");
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            authController.proceedAfterSocialLogin((AuthResult) result, "google", activity, new Function0() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit firebaseAuthWithGoogleIdToken$lambda$6$lambda$5;
                    firebaseAuthWithGoogleIdToken$lambda$6$lambda$5 = AuthController.firebaseAuthWithGoogleIdToken$lambda$6$lambda$5(Function2.this, isNewUser);
                    return firebaseAuthWithGoogleIdToken$lambda$6$lambda$5;
                }
            });
            Log.d(TAG, "signInWithCredential:success (Credential Manager)");
            return;
        }
        Log.e(TAG, "signInWithCredential:failure", task.getException());
        String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
        reportAuthFailure$default(authController, "google", "firebase_sign_in", messageForError, null, false, 24, null);
        Intrinsics.checkNotNull(messageForError);
        authController.handleLoginError(messageForError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseAuthWithGoogleIdToken$lambda$6$lambda$5(Function2 function2, boolean z) {
        function2.invoke(false, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final void handleGoogleSignInResult(Activity activity, GoogleSignInResult result, Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Log.d(TAG, "=== handleGoogleSignInResult called ===");
        Log.d(TAG, "result.isSuccess: " + result.isSuccess());
        Log.d(TAG, "result.status: " + result.getStatus());
        if (result.isSuccess()) {
            GoogleSignInAccount signInAccount = result.getSignInAccount();
            Log.d(TAG, "signInAccount: " + (signInAccount != null ? "not null (id: " + signInAccount.getId() + ")" : AbstractJsonLexerKt.NULL));
            if (signInAccount != null) {
                Log.d(TAG, "Calling firebaseAuthWithGoogle with account");
                reportAuthStage$default(this, "google", "legacy_result", "account_received", null, 8, null);
                firebaseAuthWithGoogle(activity, signInAccount, onSuccess);
            } else {
                Log.e(TAG, "signInAccount is null despite isSuccess=true");
                this._isLoadingGoogle.setValue(false);
                reportAuthFailure$default(this, "google", "legacy_result", this.context.getString(R.string.auth_failed), null, false, 24, null);
                String string = this.context.getString(R.string.auth_failed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                handleLoginError(string);
            }
        } else {
            Log.e(TAG, "Google sign-in failed or cancelled");
            Status status = result.getStatus();
            Log.e(TAG, "Status code: " + (status != null ? Integer.valueOf(status.getStatusCode()) : null));
            Status status2 = result.getStatus();
            Log.e(TAG, "Status message: " + (status2 != null ? status2.getStatusMessage() : null));
            this._isLoadingGoogle.setValue(false);
            Status status3 = result.getStatus();
            String statusMessage = status3 != null ? status3.getStatusMessage() : null;
            Status status4 = result.getStatus();
            reportAuthFailure$default(this, "google", "legacy_result", statusMessage, status4 != null ? Integer.valueOf(status4.getStatusCode()) : null, false, 16, null);
            Status status5 = result.getStatus();
            Integer valueOf = status5 != null ? Integer.valueOf(status5.getStatusCode()) : null;
            Status status6 = result.getStatus();
            setGoogleSignInError(getGoogleSignInErrorMessage(valueOf, status6 != null ? status6.getStatusMessage() : null));
        }
        Log.d(TAG, "=== handleGoogleSignInResult finished ===");
    }

    public final void handleFacebookCallback(int requestCode, int resultCode, Intent data, Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        CallbackManager callbackManager = this.callbackManager;
        if (callbackManager != null) {
            callbackManager.onActivityResult(requestCode, resultCode, data);
        }
    }

    public final void signInWithVK(Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this._isLoadingVK.setValue(true);
        this._loginError.setValue(null);
    }

    public final void setVKLoading(boolean loading) {
        this._isLoadingVK.setValue(Boolean.valueOf(loading));
    }

    public final void setGoogleLoading(boolean loading) {
        this._isLoadingGoogle.setValue(Boolean.valueOf(loading));
    }

    public final void setActivityForSocialLogin(Activity activity) {
        this.activityForSocialLogin = activity;
    }

    public final void setGoogleSignInError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        clearStaleGoogleAuthState();
        this._isLoadingGoogle.setValue(false);
        this._loginError.setValue(new LoginError(null, null, message, 3, null));
    }

    public final void tryCredentialManagerAsFallback(Activity activity, Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Log.d(TAG, "Legacy failed, trying Credential Manager as fallback");
        signInWithGoogleWithCredentialManager(activity, onSuccess, new Function0() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit tryCredentialManagerAsFallback$lambda$7;
                tryCredentialManagerAsFallback$lambda$7 = AuthController.tryCredentialManagerAsFallback$lambda$7(AuthController.this);
                return tryCredentialManagerAsFallback$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryCredentialManagerAsFallback$lambda$7(AuthController authController) {
        authController._isLoadingGoogle.setValue(false);
        reportAuthFailure$default(authController, "google", "credential_manager_fallback", authController.context.getString(R.string.google_sign_in_config_error), null, false, 24, null);
        String string = authController.context.getString(R.string.google_sign_in_config_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        authController.handleLoginError(string);
        return Unit.INSTANCE;
    }

    public final void setFacebookLoading(boolean loading) {
        this._isLoadingFacebook.setValue(Boolean.valueOf(loading));
    }

    public final void resetPassword(final String email, final Function1<? super String, Unit> onSuccess, final Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this._isLoadingResetPassword.setValue(true);
        this._loginError.setValue(null);
        this._emailError.setValue(null);
        ValidationResult validateEmail = validateEmail(email);
        if (validateEmail instanceof ValidationResult.Error) {
            String string = this.context.getString(R.string.password_reset_email_invalid);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this._emailError.setValue(string);
            this._isLoadingResetPassword.setValue(false);
            onError.invoke(string);
            return;
        }
        if (!(validateEmail instanceof ValidationResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        this.mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AuthController.resetPassword$lambda$8(AuthController.this, email, onSuccess, onError, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetPassword$lambda$8(AuthController authController, String str, Function1 function1, Function1 function12, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        authController._isLoadingResetPassword.setValue(false);
        if (task.isSuccessful()) {
            authController.clearErrors();
            String string = authController.context.getString(R.string.password_reset_email_sent, str);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            function1.invoke(string);
            return;
        }
        String string2 = authController.context.getString(R.string.password_reset_error, FirebaseErrorHandler.getMessageForError(authController.context, task));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        reportAuthFailure$default(authController, "email", "password_reset", string2, null, false, 24, null);
        authController.handleLoginError(string2);
        function12.invoke(string2);
    }

    public final void clearErrors() {
        this._loginError.setValue(null);
        this._emailError.setValue(null);
        this._passwordError.setValue(null);
        this._nameError.setValue(null);
        this._confirmPasswordError.setValue(null);
    }

    private final ValidationResult validateEmail(String email) {
        String str = email;
        if (StringsKt.isBlank(str)) {
            String string = this.context.getString(R.string.email_cannot_be_empty);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new ValidationResult.Error(string);
        }
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return ValidationResult.Success.INSTANCE;
        }
        String string2 = this.context.getString(R.string.invalid_email);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new ValidationResult.Error(string2);
    }

    private final ValidationResult validatePassword(String password) {
        if (StringsKt.isBlank(password)) {
            String string = this.context.getString(R.string.password_cannot_be_empty);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new ValidationResult.Error(string);
        }
        if (password.length() >= 6) {
            return ValidationResult.Success.INSTANCE;
        }
        String string2 = this.context.getString(R.string.weak_password);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new ValidationResult.Error(string2);
    }

    /* compiled from: AuthController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Success", VastTagName.ERROR, "Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult$Error;", "Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult$Success;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class ValidationResult {
        public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AuthController.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult$Success;", "Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends ValidationResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1015966104;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
                super(null);
            }
        }

        private ValidationResult() {
        }

        /* compiled from: AuthController.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult$Error;", "Lorg/betup/ui/fragment/login/controller/AuthController$ValidationResult;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends ValidationResult {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoginError(String errorMessage) {
        String str = errorMessage;
        if (StringsKt.contains((CharSequence) str, (CharSequence) "email", true) && (StringsKt.contains((CharSequence) str, (CharSequence) "invalid", true) || StringsKt.contains((CharSequence) str, (CharSequence) "incorrect", true))) {
            this._emailError.setValue(errorMessage);
            return;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "password", true) || StringsKt.contains((CharSequence) str, (CharSequence) "wrong", true)) {
            this._passwordError.setValue(errorMessage);
            return;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "user not found", true) || StringsKt.contains((CharSequence) str, (CharSequence) "no user record", true)) {
            this._emailError.setValue(errorMessage);
            return;
        }
        this._loginError.setValue(new LoginError(null, null, errorMessage, 3, null));
    }

    static /* synthetic */ void reportAuthFailure$default(AuthController authController, String str, String str2, String str3, Integer num, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z = true;
        }
        authController.reportAuthFailure(str, str2, str3, num2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r10 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void reportAuthFailure(String provider, String stage, String reason, Integer statusCode, boolean recordExceptionToCrashlytics) {
        if (reason != null) {
            if (StringsKt.isBlank(reason)) {
                reason = null;
            }
        }
        reason = this.context.getString(R.string.unknown_error);
        Intrinsics.checkNotNullExpressionValue(reason, "getString(...)");
        String str = reason;
        Log.e(TAG, "Auth failure provider=" + provider + " stage=" + stage + " statusCode=" + statusCode + " reason=" + str);
        FirebaseAnalyticsHelper.logAuthFailure(this.context, provider, stage, str, statusCode, recordExceptionToCrashlytics);
    }

    static /* synthetic */ void reportAuthStage$default(AuthController authController, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        authController.reportAuthStage(str, str2, str3, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r6 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void reportAuthStage(String provider, String stage, String outcome, String detail) {
        if (detail != null) {
            if (StringsKt.isBlank(detail)) {
                detail = null;
            }
        }
        detail = "n/a";
        Log.d(TAG, "Auth stage provider=" + provider + " stage=" + stage + " outcome=" + outcome + " detail=" + detail);
        FirebaseAnalyticsHelper.logAuthStage(this.context, provider, stage, outcome, detail);
    }

    private final void clearStaleGoogleAuthState() {
        FirebaseUser currentUser = this.mAuth.getCurrentUser();
        if (currentUser == null || currentUser.isAnonymous()) {
            return;
        }
        Log.d(TAG, "Clearing stale non-anonymous Firebase auth state after Google failure");
        this.mAuth.signOut();
    }

    private final void firebaseAuthWithGoogle(final Activity activity, GoogleSignInAccount acct, final Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Log.d(TAG, "=== firebaseAuthWithGoogle called ===");
        Log.d(TAG, "Account ID: " + acct.getId() + ", isAnonymous: " + getUserService().isAnonymous());
        if (getUserService().isAnonymous()) {
            getSocialConnectionService().connectGoogleToAnonymous(activity, acct, new SocialConnectionService.OnLoginOperationCompletedListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$firebaseAuthWithGoogle$1
                @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                public void onLoginOperationCompleted() {
                    MutableStateFlow mutableStateFlow;
                    mutableStateFlow = AuthController.this._isLoadingGoogle;
                    mutableStateFlow.setValue(false);
                    AuthController.this.clearErrors();
                    onSuccess.invoke(true, false);
                }

                @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                public void onLoginOperationFailed(String reason) {
                    MutableStateFlow mutableStateFlow;
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    mutableStateFlow = AuthController.this._isLoadingGoogle;
                    mutableStateFlow.setValue(false);
                    AuthController.reportAuthFailure$default(AuthController.this, "google", "anonymous_upgrade_link", reason, null, false, 24, null);
                    AuthController.this.handleLoginError(reason);
                }
            });
            return;
        }
        try {
            AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
            Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
            Log.d(TAG, "Credential created, signing in with Firebase...");
            Intrinsics.checkNotNull(this.mAuth.signInWithCredential(credential).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda7
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthController.firebaseAuthWithGoogle$lambda$12(AuthController.this, activity, onSuccess, task);
                }
            }));
        } catch (Exception e) {
            Log.e(TAG, "Error in firebaseAuthWithGoogle", e);
            this._isLoadingGoogle.setValue(false);
            reportAuthFailure$default(this, "google", "legacy_firebase_sign_in", e.getMessage(), null, false, 24, null);
            String message = e.getMessage();
            if (message == null) {
                message = this.context.getString(R.string.unknown_error);
                Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
            }
            handleLoginError(message);
        }
        Log.d(TAG, "=== firebaseAuthWithGoogle finished ===");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firebaseAuthWithGoogle$lambda$12(AuthController authController, Activity activity, final Function2 function2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Log.d(TAG, "Firebase signInWithCredential completed");
        Log.d(TAG, "Task successful: " + task.isSuccessful());
        if (task.isSuccessful()) {
            AdditionalUserInfo additionalUserInfo = ((AuthResult) task.getResult()).getAdditionalUserInfo();
            final boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
            Log.d(TAG, "isNewUser: " + isNewUser);
            authController.reportAuthStage("google", "firebase_sign_in", "success", "legacy");
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            authController.proceedAfterSocialLogin((AuthResult) result, "google", activity, new Function0() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit firebaseAuthWithGoogle$lambda$12$lambda$11;
                    firebaseAuthWithGoogle$lambda$12$lambda$11 = AuthController.firebaseAuthWithGoogle$lambda$12$lambda$11(Function2.this, isNewUser);
                    return firebaseAuthWithGoogle$lambda$12$lambda$11;
                }
            });
            Log.d(TAG, "signInWithCredential:success");
            return;
        }
        authController._isLoadingGoogle.setValue(false);
        Log.e(TAG, "signInWithCredential:failure");
        Exception exception = task.getException();
        if (exception != null) {
            Log.e(TAG, "Exception: " + exception.getMessage(), exception);
        }
        String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
        Log.e(TAG, "Error message: " + messageForError);
        reportAuthFailure$default(authController, "google", "legacy_firebase_sign_in", messageForError, null, false, 24, null);
        Intrinsics.checkNotNull(messageForError);
        authController.handleLoginError(messageForError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseAuthWithGoogle$lambda$12$lambda$11(Function2 function2, boolean z) {
        function2.invoke(false, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final void firebaseAuthWithFacebook(AccessToken token, final Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Log.d(TAG, "handleFacebookAccessToken: " + token + ", isAnonymous: " + getUserService().isAnonymous());
        final Activity activity = null;
        if (getUserService().isAnonymous()) {
            Activity activity2 = this.activityForSocialLogin;
            if (activity2 == null) {
                Context context = this.context;
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
            } else {
                activity = activity2;
            }
            if (activity != null) {
                getSocialConnectionService().connectFBToAnonymous(activity, token, new SocialConnectionService.OnLoginOperationCompletedListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$firebaseAuthWithFacebook$1
                    @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                    public void onLoginOperationCompleted() {
                        MutableStateFlow mutableStateFlow;
                        mutableStateFlow = AuthController.this._isLoadingFacebook;
                        mutableStateFlow.setValue(false);
                        AuthController.this.clearErrors();
                        onSuccess.invoke(true, false);
                    }

                    @Override // org.betup.services.user.SocialConnectionService.OnLoginOperationCompletedListener
                    public void onLoginOperationFailed(String reason) {
                        MutableStateFlow mutableStateFlow;
                        Intrinsics.checkNotNullParameter(reason, "reason");
                        mutableStateFlow = AuthController.this._isLoadingFacebook;
                        mutableStateFlow.setValue(false);
                        AuthController.reportAuthFailure$default(AuthController.this, AccessToken.DEFAULT_GRAPH_DOMAIN, "anonymous_upgrade_link", reason, null, false, 24, null);
                        AuthController.this.handleLoginError(reason);
                    }
                });
                return;
            }
            this._isLoadingFacebook.setValue(false);
            reportAuthFailure$default(this, AccessToken.DEFAULT_GRAPH_DOMAIN, "anonymous_upgrade_link", this.context.getString(R.string.auth_failed), null, false, 24, null);
            String string = this.context.getString(R.string.auth_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            handleLoginError(string);
            return;
        }
        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        Activity activity3 = this.activityForSocialLogin;
        if (activity3 == null) {
            Context context2 = this.context;
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
            }
        } else {
            activity = activity3;
        }
        Task<AuthResult> signInWithCredential = this.mAuth.signInWithCredential(credential);
        Intrinsics.checkNotNullExpressionValue(signInWithCredential, "signInWithCredential(...)");
        if (activity != null) {
            signInWithCredential.addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda14
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthController.firebaseAuthWithFacebook$lambda$14(AuthController.this, activity, onSuccess, task);
                }
            });
        } else {
            signInWithCredential.addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda15
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AuthController.firebaseAuthWithFacebook$lambda$16(AuthController.this, onSuccess, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firebaseAuthWithFacebook$lambda$14(AuthController authController, Activity activity, final Function2 function2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            AdditionalUserInfo additionalUserInfo = ((AuthResult) task.getResult()).getAdditionalUserInfo();
            final boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            authController.proceedAfterSocialLogin((AuthResult) result, AccessToken.DEFAULT_GRAPH_DOMAIN, activity, new Function0() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit firebaseAuthWithFacebook$lambda$14$lambda$13;
                    firebaseAuthWithFacebook$lambda$14$lambda$13 = AuthController.firebaseAuthWithFacebook$lambda$14$lambda$13(Function2.this, isNewUser);
                    return firebaseAuthWithFacebook$lambda$14$lambda$13;
                }
            });
            Log.d(TAG, "signInWithCredential:success");
            return;
        }
        authController._isLoadingFacebook.setValue(false);
        Log.w(TAG, "signInWithCredential:failure", task.getException());
        String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
        reportAuthFailure$default(authController, AccessToken.DEFAULT_GRAPH_DOMAIN, "firebase_sign_in", messageForError, null, false, 24, null);
        Intrinsics.checkNotNull(messageForError);
        authController.handleLoginError(messageForError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseAuthWithFacebook$lambda$14$lambda$13(Function2 function2, boolean z) {
        function2.invoke(false, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void firebaseAuthWithFacebook$lambda$16(AuthController authController, final Function2 function2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            AdditionalUserInfo additionalUserInfo = ((AuthResult) task.getResult()).getAdditionalUserInfo();
            final boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            authController.proceedAfterSocialLogin((AuthResult) result, AccessToken.DEFAULT_GRAPH_DOMAIN, null, new Function0() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit firebaseAuthWithFacebook$lambda$16$lambda$15;
                    firebaseAuthWithFacebook$lambda$16$lambda$15 = AuthController.firebaseAuthWithFacebook$lambda$16$lambda$15(Function2.this, isNewUser);
                    return firebaseAuthWithFacebook$lambda$16$lambda$15;
                }
            });
            Log.d(TAG, "signInWithCredential:success");
            return;
        }
        authController._isLoadingFacebook.setValue(false);
        Log.w(TAG, "signInWithCredential:failure", task.getException());
        String messageForError = FirebaseErrorHandler.getMessageForError(authController.context, task);
        reportAuthFailure$default(authController, AccessToken.DEFAULT_GRAPH_DOMAIN, "firebase_sign_in", messageForError, null, false, 24, null);
        Intrinsics.checkNotNull(messageForError);
        authController.handleLoginError(messageForError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit firebaseAuthWithFacebook$lambda$16$lambda$15(Function2 function2, boolean z) {
        function2.invoke(false, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    static /* synthetic */ void proceedAfterSocialLogin$default(AuthController authController, AuthResult authResult, String str, Activity activity, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            activity = null;
        }
        authController.proceedAfterSocialLogin(authResult, str, activity, function0);
    }

    private final void proceedAfterSocialLogin(AuthResult result, String provider, Activity activity, Function0<Unit> onSuccess) {
        Log.d(TAG, "=== proceedAfterSocialLogin called ===");
        Log.d(TAG, "Provider: " + provider);
        FirebaseUser user = result.getUser();
        Log.d(TAG, "Firebase user UID: " + (user != null ? user.getUid() : null));
        AdditionalUserInfo additionalUserInfo = result.getAdditionalUserInfo();
        boolean isNewUser = additionalUserInfo != null ? additionalUserInfo.isNewUser() : false;
        Log.d(TAG, "Is new user: " + isNewUser);
        int hashCode = provider.hashCode();
        if (hashCode != -1240244679) {
            if (hashCode != 3765) {
                if (hashCode == 497130182 && provider.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                    Log.d(TAG, "Firebase social sign-in succeeded (facebook)");
                }
            } else if (provider.equals("vk")) {
                Log.d(TAG, "Firebase social sign-in succeeded (vk)");
            }
        } else if (provider.equals("google")) {
            Log.d(TAG, "Firebase social sign-in succeeded (google)");
        }
        clearErrors();
        if (isNewUser && activity != null) {
            Log.d(TAG, "Tracking signup analytics for new user");
            FirebaseAnalyticsHelper.trackSignup(activity);
        }
        onSuccess.invoke();
        Log.d(TAG, "=== proceedAfterSocialLogin finished ===");
    }

    private final void registerFacebookCallbacks() {
        if (!FacebookSdkHelper.ensureInitialized(this.context)) {
            Log.e(TAG, "registerFacebookCallbacks: Facebook SDK not ready");
            return;
        }
        LoginManager.INSTANCE.getInstance().logOut();
        this.callbackManager = CallbackManager.Factory.create();
        LoginManager.INSTANCE.getInstance().registerCallback(this.callbackManager, new FacebookCallback<LoginResult>() { // from class: org.betup.ui.fragment.login.controller.AuthController$registerFacebookCallbacks$1
            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(loginResult, "loginResult");
                Log.d("AuthController", "Facebook login SUCCESS!");
                function1 = AuthController.this.facebookSuccessCallback;
                if (function1 != null) {
                    function1.invoke(loginResult.getAccessToken());
                }
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = AuthController.this._isLoadingFacebook;
                mutableStateFlow.setValue(false);
                Log.d("AuthController", "Facebook login CANCEL!");
                AuthController.this.clearErrors();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException exception) {
                MutableStateFlow mutableStateFlow;
                Context context;
                Intrinsics.checkNotNullParameter(exception, "exception");
                mutableStateFlow = AuthController.this._isLoadingFacebook;
                mutableStateFlow.setValue(false);
                Log.d("AuthController", "Facebook login ERROR: " + exception);
                AuthController.reportAuthFailure$default(AuthController.this, AccessToken.DEFAULT_GRAPH_DOMAIN, "sdk_callback", exception.getMessage(), null, false, 24, null);
                AuthController authController = AuthController.this;
                String message = exception.getMessage();
                if (message == null) {
                    context = AuthController.this.context;
                    message = context.getString(R.string.auth_failed);
                    Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                }
                authController.handleLoginError(message);
            }
        });
    }

    public final void signInWithFacebook(final Function2<? super Boolean, ? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (!FacebookSdkHelper.ensureInitialized(this.context)) {
            this._isLoadingFacebook.setValue(false);
            reportAuthFailure(AccessToken.DEFAULT_GRAPH_DOMAIN, "sdk_not_initialized", "Facebook SDK not initialized", null, false);
            this._loginError.setValue(new LoginError(null, null, this.context.getString(R.string.auth_failed), 3, null));
            return;
        }
        this._isLoadingFacebook.setValue(true);
        this._loginError.setValue(null);
        this.facebookSuccessCallback = new Function1() { // from class: org.betup.ui.fragment.login.controller.AuthController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit signInWithFacebook$lambda$17;
                signInWithFacebook$lambda$17 = AuthController.signInWithFacebook$lambda$17(AuthController.this, onSuccess, (AccessToken) obj);
                return signInWithFacebook$lambda$17;
            }
        };
        LoginManager.INSTANCE.getInstance().logOut();
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"email", "public_profile"});
        Context context = this.context;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            this._isLoadingFacebook.setValue(false);
            reportAuthFailure$default(this, AccessToken.DEFAULT_GRAPH_DOMAIN, "sdk_launch", this.context.getString(R.string.auth_failed), null, false, 24, null);
            this._loginError.setValue(new LoginError(null, null, this.context.getString(R.string.auth_failed), 3, null));
            return;
        }
        LoginManager.INSTANCE.getInstance().logInWithReadPermissions(activity, listOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signInWithFacebook$lambda$17(AuthController authController, Function2 function2, AccessToken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        authController.firebaseAuthWithFacebook(it, function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRegistrationError(String errorMessage) {
        handleLoginError(errorMessage);
    }

    private final String getGoogleSignInErrorMessage(Integer statusCode, String statusMessage) {
        if (statusCode != null && statusCode.intValue() == 10) {
            String string = this.context.getString(R.string.google_sign_in_config_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        String str = statusMessage;
        if (str != null && !StringsKt.isBlank(str)) {
            return statusMessage;
        }
        String string2 = this.context.getString(R.string.auth_failed);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* renamed from: getGoogleApiClient, reason: from getter */
    public final GoogleApiClient getMGoogleApiClient() {
        return this.mGoogleApiClient;
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }
}
