package org.betup.ui.fragment.login;

import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.login.CustomTokenResponseModel;
import org.betup.utils.FirebaseErrorHandler;
import org.betup.utils.SnackbarHelper;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/ui/fragment/login/AuthFragment$firebaseTokenGotListener$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/login/CustomTokenResponseModel;", "", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthFragment$firebaseTokenGotListener$1 implements BaseCachedSharedInteractor.OnFetchedListener<CustomTokenResponseModel, String> {
    final /* synthetic */ AuthFragment this$0;

    AuthFragment$firebaseTokenGotListener$1(AuthFragment authFragment) {
        this.this$0 = authFragment;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<CustomTokenResponseModel, String> responseMessage) {
        FetchStat stat;
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
            this.this$0.isInProgress = false;
            this.this$0.getAuthController().setVKLoading(false);
            AuthFragment authFragment = this.this$0;
            if (responseMessage != null && (stat = responseMessage.getStat()) != null) {
                r0 = stat.name();
            }
            AuthFragment.reportAuthFailure$default(authFragment, "vk", "custom_token_request", r0, null, 8, null);
            SnackbarHelper.showShort(this.this$0.requireContext(), R.string.auth_failed);
            return;
        }
        Log.d("AuthFragment", "FIREBASE VK LISTENER");
        CustomTokenResponseModel model = responseMessage.getModel();
        r0 = model != null ? model.getUid() : null;
        Log.d("AuthFragment", "UID GOT = " + r0);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        if (r0 == null) {
            return;
        }
        Task<AuthResult> signInWithCustomToken = firebaseAuth.signInWithCustomToken(r0);
        FragmentActivity requireActivity = this.this$0.requireActivity();
        final AuthFragment authFragment2 = this.this$0;
        Intrinsics.checkNotNull(signInWithCustomToken.addOnCompleteListener(requireActivity, new OnCompleteListener() { // from class: org.betup.ui.fragment.login.AuthFragment$firebaseTokenGotListener$1$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AuthFragment$firebaseTokenGotListener$1.onFetched$lambda$0(AuthFragment.this, task);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$0(AuthFragment authFragment, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            authFragment.isInProgress = false;
            authFragment.getAuthController().setVKLoading(false);
            Log.w("AuthFragment", "signInWithVK:failed", task.getException());
            AuthFragment.reportAuthFailure$default(authFragment, "vk", "firebase_custom_token_sign_in", FirebaseErrorHandler.getMessageForError(authFragment.requireContext(), task), null, 8, null);
            SnackbarHelper.showShort(authFragment.requireContext(), FirebaseErrorHandler.getMessageForError(authFragment.requireContext(), task));
            return;
        }
        Log.d("AuthFragment", "MAKING LOGIN...");
        authFragment.getAuthController().setVKLoading(false);
        Object result = task.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        authFragment.proceedAfterSocialLogin((AuthResult) result);
    }
}
