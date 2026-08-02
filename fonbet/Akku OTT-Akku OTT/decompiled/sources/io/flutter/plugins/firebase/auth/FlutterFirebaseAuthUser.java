package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.C0323h;
import androidx.media3.common.C0324i;
import androidx.media3.common.C0325j;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.analytics.K;
import androidx.media3.exoplayer.analytics.P;
import com.google.android.exoplayer2.analytics.T;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import dev.fluttercommunity.workmanager.pigeon.q;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;

/* loaded from: classes3.dex */
public class FlutterFirebaseAuthUser implements GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi {
    private Activity activity;

    public static FirebaseUser getCurrentUserFromPigeon(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            firebaseAuth.setTenantId(authPigeonFirebaseApp.getTenantId());
        }
        return firebaseAuth.getCurrentUser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$0(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result result, Boolean bool) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        try {
            result.success(PigeonParser.parseTokenResult((GetTokenResult) Tasks.await(currentUserFromPigeon.getIdToken(bool.booleanValue()))));
        } catch (Exception e) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reload$6(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
            result.error(FlutterFirebaseAuthPluginException.noSuchProvider());
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$11(FirebaseUser firebaseUser, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            firebaseUser.reload().addOnCompleteListener(new q(result, firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$13(FirebaseUser firebaseUser, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            firebaseUser.reload().addOnCompleteListener(new T(result, firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$15(FirebaseUser firebaseUser, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            firebaseUser.reload().addOnCompleteListener(new com.google.gson.internal.a(result, firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result result, FirebaseUser firebaseUser, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$17(FirebaseUser firebaseUser, GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            firebaseUser.reload().addOnCompleteListener(new dev.fluttercommunity.workmanager.pigeon.p(result, firebaseUser));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void delete(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.delete().addOnCompleteListener(new androidx.credentials.playservices.o(voidResult, 4));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void getIdToken(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Boolean bool, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(authPigeonFirebaseApp, result, bool));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithCredential(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        AuthCredential credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.linkWithCredential(credential).addOnCompleteListener(new androidx.core.view.inputmethod.a(result, 4));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithProvider(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            newBuilder.setScopes(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            newBuilder.addCustomParameters(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.startActivityForLinkWithProvider(this.activity, newBuilder.build()).addOnCompleteListener(new u0(result));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithCredential(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        AuthCredential credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.reauthenticateAndRetrieveData(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.l
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithProvider(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            newBuilder.setScopes(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            newBuilder.addCustomParameters(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.startActivityForReauthenticateWithProvider(this.activity, newBuilder.build()).addOnCompleteListener(new h(result));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reload(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.reload().addOnCompleteListener(new K(result, currentUserFromPigeon));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void sendEmailVerification(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @Nullable GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.sendEmailVerification().addOnCompleteListener(new v0(voidResult, 3));
        } else {
            currentUserFromPigeon.sendEmailVerification(PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new C0323h(voidResult));
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void unlink(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.unlink(str).addOnCompleteListener(new androidx.credentials.playservices.n(result, 3));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateEmail(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.updateEmail(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.k
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updateEmail$11(FirebaseUser.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePassword(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.updatePassword(str).addOnCompleteListener(new P(currentUserFromPigeon, result));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePhoneNumber(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) PigeonParser.getCredential(map);
        if (phoneAuthCredential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.updatePhoneNumber(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.j
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updatePhoneNumber$15(FirebaseUser.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateProfile(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.PigeonUserProfile pigeonUserProfile, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        if (pigeonUserProfile.getDisplayNameChanged().booleanValue()) {
            builder.setDisplayName(pigeonUserProfile.getDisplayName());
        }
        if (pigeonUserProfile.getPhotoUrlChanged().booleanValue()) {
            if (pigeonUserProfile.getPhotoUrl() != null) {
                builder.setPhotoUri(Uri.parse(pigeonUserProfile.getPhotoUrl()));
            } else {
                builder.setPhotoUri(null);
            }
        }
        currentUserFromPigeon.updateProfile(builder.build()).addOnCompleteListener(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(currentUserFromPigeon, result));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void verifyBeforeUpdateEmail(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @Nullable GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FirebaseUser currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            voidResult.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.verifyBeforeUpdateEmail(str).addOnCompleteListener(new C0324i(voidResult, 3));
        } else {
            currentUserFromPigeon.verifyBeforeUpdateEmail(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new C0325j(voidResult, 8));
        }
    }
}
