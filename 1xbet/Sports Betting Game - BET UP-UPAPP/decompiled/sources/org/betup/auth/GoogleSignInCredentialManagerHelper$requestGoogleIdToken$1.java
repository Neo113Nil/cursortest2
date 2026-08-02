package org.betup.auth;

import android.app.Activity;
import android.util.Log;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: GoogleSignInCredentialManagerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.auth.GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1", f = "GoogleSignInCredentialManagerHelper.kt", i = {}, l = {58, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function1<String, Unit> $onResult;
    final /* synthetic */ String $webClientId;
    int label;
    final /* synthetic */ GoogleSignInCredentialManagerHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1(String str, GoogleSignInCredentialManagerHelper googleSignInCredentialManagerHelper, Function1<? super String, Unit> function1, Activity activity, Continuation<? super GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1> continuation) {
        super(2, continuation);
        this.$webClientId = str;
        this.this$0 = googleSignInCredentialManagerHelper;
        this.$onResult = function1;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1(this.$webClientId, this.this$0, this.$onResult, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String extractIdToken;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (ClearCredentialException e) {
                Log.d("GoogleSignInCredentialMgr", "clearCredentialState before Google sign-in: " + e.getMessage());
            }
        } catch (GetCredentialException e2) {
            Log.d("GoogleSignInCredentialMgr", "Credential Manager GetCredentialException (use legacy): " + e2.getClass().getSimpleName() + " - " + e2.getMessage());
            this.$onResult.invoke(null);
        } catch (Exception e3) {
            Log.d("GoogleSignInCredentialMgr", "Credential Manager failed (use legacy): " + (e3 instanceof CancellationException ? "timed out or cancelled" : e3.getMessage()));
            this.$onResult.invoke(null);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                extractIdToken = this.this$0.extractIdToken((GetCredentialResponse) obj);
                str = extractIdToken;
                if (str != null && !StringsKt.isBlank(str)) {
                    Log.d("GoogleSignInCredentialMgr", "Credential Manager (GetSignInWithGoogleOption): got Google ID token");
                    this.$onResult.invoke(extractIdToken);
                    return Unit.INSTANCE;
                }
                Log.w("GoogleSignInCredentialMgr", "Google ID token is null or empty");
                this.$onResult.invoke(null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        GetCredentialRequest build = new GetCredentialRequest.Builder().addCredentialOption(new GetSignInWithGoogleOption.Builder(this.$webClientId).build()).build();
        this.label = 2;
        obj = TimeoutKt.withTimeout(12000L, new GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1$response$1(this.this$0, this.$activity, build, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        extractIdToken = this.this$0.extractIdToken((GetCredentialResponse) obj);
        str = extractIdToken;
        if (str != null) {
            Log.d("GoogleSignInCredentialMgr", "Credential Manager (GetSignInWithGoogleOption): got Google ID token");
            this.$onResult.invoke(extractIdToken);
            return Unit.INSTANCE;
        }
        Log.w("GoogleSignInCredentialMgr", "Google ID token is null or empty");
        this.$onResult.invoke(null);
        return Unit.INSTANCE;
    }

    /* compiled from: GoogleSignInCredentialManagerHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.auth.GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1$1", f = "GoogleSignInCredentialManagerHelper.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.auth.GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ GoogleSignInCredentialManagerHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GoogleSignInCredentialManagerHelper googleSignInCredentialManagerHelper, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = googleSignInCredentialManagerHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CredentialManager credentialManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                credentialManager = this.this$0.credentialManager;
                this.label = 1;
                if (credentialManager.clearCredentialState(new ClearCredentialStateRequest(null, 1, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
