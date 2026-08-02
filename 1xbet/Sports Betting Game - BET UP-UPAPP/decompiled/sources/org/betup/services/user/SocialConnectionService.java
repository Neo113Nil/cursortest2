package org.betup.services.user;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.R;
import org.betup.model.domain.CredentialsValidationResult;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.model.remote.entity.login.CustomTokenResponseModel;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.user.SocialConnectionService;
import org.betup.utils.FacebookSdkHelper;
import org.betup.utils.FirebaseErrorHandler;
import org.json.JSONObject;

@Singleton
/* loaded from: classes2.dex */
public class SocialConnectionService {
    private OnLoginOperationCompletedListener activeLoginListener;
    private final BetListAppender betListAppender;
    private final Context context;
    private final FirebaseAuth firebaseAuth;
    private final MatchInfoInteractor matchInfoInteractor;
    private final UserService userService;
    private final V7GetCustomTokenInteractor v7GetCustomTokenInteractor;
    private WeakReference<Activity> callingActivity = new WeakReference<>(null);
    private final BaseCachedSharedInteractor.OnFetchedListener<CustomTokenResponseModel, String> firebaseTokenGotListener = new AnonymousClass1();

    public interface OnLoginOperationCompletedListener {
        void onLoginOperationCompleted();

        void onLoginOperationFailed(String reason);
    }

    @Inject
    public SocialConnectionService(Context context, FirebaseAuth firebaseAuth, UserService userService, MatchInfoInteractor matchInfoInteractor, BetListAppender betListAppender, V7GetCustomTokenInteractor v7GetCustomTokenInteractor) {
        this.context = context;
        this.firebaseAuth = firebaseAuth;
        this.userService = userService;
        this.matchInfoInteractor = matchInfoInteractor;
        this.betListAppender = betListAppender;
        this.v7GetCustomTokenInteractor = v7GetCustomTokenInteractor;
    }

    public boolean isConnecting() {
        return this.activeLoginListener != null;
    }

    public CredentialsValidationResult validateCredentials(String email, String password) {
        if (password == null || password.length() < 3) {
            return new CredentialsValidationResult(false, this.context.getString(R.string.password_cannot_be_empty));
        }
        if (email == null || email.length() < 3) {
            return new CredentialsValidationResult(false, this.context.getString(R.string.email_cannot_be_empty));
        }
        return new CredentialsValidationResult(true, null);
    }

    public void connectEmailToAnonymous(final String nickname, String email, String password, final OnLoginOperationCompletedListener onLoginOperationCompletedListener) {
        AuthCredential credential = EmailAuthProvider.getCredential(email, password);
        if (this.firebaseAuth.getCurrentUser() == null) {
            onLoginOperationCompletedListener.onLoginOperationFailed("User is not authenticated");
        } else {
            this.firebaseAuth.getCurrentUser().linkWithCredential(credential).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    SocialConnectionService.this.m12832xcfcf76b9(nickname, onLoginOperationCompletedListener, task);
                }
            });
        }
    }

    /* renamed from: lambda$connectEmailToAnonymous$1$org-betup-services-user-SocialConnectionService, reason: not valid java name */
    /* synthetic */ void m12832xcfcf76b9(String str, final OnLoginOperationCompletedListener onLoginOperationCompletedListener, Task task) {
        if (task.isSuccessful()) {
            UserProfileChangeRequest build = new UserProfileChangeRequest.Builder().setDisplayName(str).build();
            if (this.firebaseAuth.getCurrentUser() != null) {
                this.firebaseAuth.getCurrentUser().updateProfile(build).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        SocialConnectionService.lambda$connectEmailToAnonymous$0(SocialConnectionService.OnLoginOperationCompletedListener.this, task2);
                    }
                });
                return;
            }
            return;
        }
        onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(this.context, task));
    }

    static /* synthetic */ void lambda$connectEmailToAnonymous$0(OnLoginOperationCompletedListener onLoginOperationCompletedListener, Task task) {
        if (task.isSuccessful()) {
            onLoginOperationCompletedListener.onLoginOperationCompleted();
        } else {
            onLoginOperationCompletedListener.onLoginOperationFailed("Failed to update user profile");
        }
    }

    public void connectVKToAnonymous(Activity activity, String email, String accessToken, OnLoginOperationCompletedListener loginListener) {
        if (email == null) {
            email = "anonymous@vk.com";
        }
        this.callingActivity = new WeakReference<>(activity);
        this.activeLoginListener = loginListener;
        Bundle bundle = new Bundle();
        bundle.putString("email", email);
        bundle.putString("type", "vk");
        this.v7GetCustomTokenInteractor.load(this.firebaseTokenGotListener, accessToken, bundle);
    }

    public void connectFBToAnonymous(final Activity activity, final AccessToken token, final OnLoginOperationCompletedListener onLoginOperationCompletedListener) {
        if (!FacebookSdkHelper.ensureInitialized(activity)) {
            onLoginOperationCompletedListener.onLoginOperationFailed(this.context.getString(R.string.auth_failed));
        } else {
            this.firebaseAuth.getCurrentUser().linkWithCredential(FacebookAuthProvider.getCredential(token.getToken())).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    SocialConnectionService.this.m12834x6dde5f02(token, onLoginOperationCompletedListener, activity, task);
                }
            });
        }
    }

    /* renamed from: lambda$connectFBToAnonymous$4$org-betup-services-user-SocialConnectionService, reason: not valid java name */
    /* synthetic */ void m12834x6dde5f02(AccessToken accessToken, final OnLoginOperationCompletedListener onLoginOperationCompletedListener, final Activity activity, final Task task) {
        if (task.isSuccessful()) {
            GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda5
                @Override // com.facebook.GraphRequest.GraphJSONObjectCallback
                public final void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
                    SocialConnectionService.this.m12833x6e54c501(onLoginOperationCompletedListener, activity, task, jSONObject, graphResponse);
                }
            }).executeAsync();
        } else {
            onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
        }
    }

    /* renamed from: lambda$connectFBToAnonymous$3$org-betup-services-user-SocialConnectionService, reason: not valid java name */
    /* synthetic */ void m12833x6e54c501(final OnLoginOperationCompletedListener onLoginOperationCompletedListener, final Activity activity, final Task task, JSONObject jSONObject, GraphResponse graphResponse) {
        Log.v("LoginActivity", graphResponse.toString());
        try {
            UserProfileChangeRequest build = new UserProfileChangeRequest.Builder().setDisplayName(jSONObject.getString("name")).build();
            if (this.firebaseAuth.getCurrentUser() != null) {
                this.firebaseAuth.getCurrentUser().updateProfile(build).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda7
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        SocialConnectionService.lambda$connectFBToAnonymous$2(SocialConnectionService.OnLoginOperationCompletedListener.this, activity, task, task2);
                    }
                });
            }
        } catch (Exception unused) {
            onLoginOperationCompletedListener.onLoginOperationCompleted();
        }
    }

    static /* synthetic */ void lambda$connectFBToAnonymous$2(OnLoginOperationCompletedListener onLoginOperationCompletedListener, Activity activity, Task task, Task task2) {
        if (task2.isSuccessful()) {
            onLoginOperationCompletedListener.onLoginOperationCompleted();
        } else {
            onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
        }
    }

    public void connectGoogleToAnonymous(final Activity activity, final GoogleSignInAccount account, final OnLoginOperationCompletedListener onLoginOperationCompletedListener) {
        if (this.firebaseAuth.getCurrentUser() == null) {
            onLoginOperationCompletedListener.onLoginOperationFailed("No active user");
        } else {
            this.firebaseAuth.getCurrentUser().linkWithCredential(GoogleAuthProvider.getCredential(account.getIdToken(), null)).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    SocialConnectionService.this.m12835x234e8507(account, onLoginOperationCompletedListener, activity, task);
                }
            });
        }
    }

    /* renamed from: lambda$connectGoogleToAnonymous$6$org-betup-services-user-SocialConnectionService, reason: not valid java name */
    /* synthetic */ void m12835x234e8507(GoogleSignInAccount googleSignInAccount, final OnLoginOperationCompletedListener onLoginOperationCompletedListener, final Activity activity, final Task task) {
        if (task.isSuccessful() && this.firebaseAuth.getCurrentUser() != null) {
            UserProfileChangeRequest build = new UserProfileChangeRequest.Builder().setDisplayName(googleSignInAccount.getDisplayName()).setPhotoUri(googleSignInAccount.getPhotoUrl()).build();
            if (this.firebaseAuth.getCurrentUser() != null) {
                this.firebaseAuth.getCurrentUser().updateProfile(build).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda6
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        SocialConnectionService.lambda$connectGoogleToAnonymous$5(SocialConnectionService.OnLoginOperationCompletedListener.this, activity, task, task2);
                    }
                });
                return;
            }
            return;
        }
        onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
    }

    static /* synthetic */ void lambda$connectGoogleToAnonymous$5(OnLoginOperationCompletedListener onLoginOperationCompletedListener, Activity activity, Task task, Task task2) {
        if (task2.isSuccessful()) {
            onLoginOperationCompletedListener.onLoginOperationCompleted();
        } else {
            onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
        }
    }

    public void connectGoogleToAnonymousWithIdToken(final Activity activity, String idToken, final OnLoginOperationCompletedListener onLoginOperationCompletedListener) {
        if (this.firebaseAuth.getCurrentUser() == null) {
            onLoginOperationCompletedListener.onLoginOperationFailed("No active user");
        } else if (idToken == null || idToken.isEmpty()) {
            onLoginOperationCompletedListener.onLoginOperationFailed("Invalid token");
        } else {
            this.firebaseAuth.getCurrentUser().linkWithCredential(GoogleAuthProvider.getCredential(idToken, null)).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    SocialConnectionService.lambda$connectGoogleToAnonymousWithIdToken$7(SocialConnectionService.OnLoginOperationCompletedListener.this, activity, task);
                }
            });
        }
    }

    static /* synthetic */ void lambda$connectGoogleToAnonymousWithIdToken$7(OnLoginOperationCompletedListener onLoginOperationCompletedListener, Activity activity, Task task) {
        if (task.isSuccessful()) {
            onLoginOperationCompletedListener.onLoginOperationCompleted();
        } else {
            onLoginOperationCompletedListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
        }
    }

    /* renamed from: org.betup.services.user.SocialConnectionService$1, reason: invalid class name */
    class AnonymousClass1 implements BaseCachedSharedInteractor.OnFetchedListener<CustomTokenResponseModel, String> {
        AnonymousClass1() {
        }

        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<CustomTokenResponseModel, String> responseMessage) {
            if (responseMessage.getStat() == FetchStat.SUCCESS) {
                String uid = responseMessage.getModel().getUid();
                final Activity activity = (Activity) SocialConnectionService.this.callingActivity.get();
                if (activity == null) {
                    return;
                }
                SocialConnectionService.this.firebaseAuth.signOut();
                SocialConnectionService.this.firebaseAuth.signInWithCustomToken(uid).addOnCompleteListener(activity, new OnCompleteListener() { // from class: org.betup.services.user.SocialConnectionService$1$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        SocialConnectionService.AnonymousClass1.this.m12836xf776357f(activity, task);
                    }
                });
                return;
            }
            if (SocialConnectionService.this.activeLoginListener != null) {
                SocialConnectionService.this.activeLoginListener.onLoginOperationFailed("No activity");
                SocialConnectionService.this.activeLoginListener = null;
            }
        }

        /* renamed from: lambda$onFetched$0$org-betup-services-user-SocialConnectionService$1, reason: not valid java name */
        /* synthetic */ void m12836xf776357f(Activity activity, Task task) {
            if (task.isSuccessful()) {
                if (SocialConnectionService.this.activeLoginListener != null) {
                    SocialConnectionService.this.activeLoginListener.onLoginOperationCompleted();
                }
            } else if (SocialConnectionService.this.activeLoginListener != null) {
                SocialConnectionService.this.activeLoginListener.onLoginOperationFailed(FirebaseErrorHandler.getMessageForError(activity, task));
            }
            SocialConnectionService.this.activeLoginListener = null;
        }
    }

    public void releaseUserCache() {
        this.userService.clearUserInfo();
        this.matchInfoInteractor.invalidate();
        this.betListAppender.clearBets();
    }
}
