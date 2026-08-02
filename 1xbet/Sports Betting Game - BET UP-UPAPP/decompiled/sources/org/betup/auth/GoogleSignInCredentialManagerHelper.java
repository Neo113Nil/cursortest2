package org.betup.auth;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialResponse;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GoogleSignInCredentialManagerHelper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000b0\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/auth/GoogleSignInCredentialManagerHelper;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "credentialManager", "Landroidx/credentials/CredentialManager;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "requestGoogleIdToken", "", "activity", "Landroid/app/Activity;", "webClientId", "", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "idToken", "extractIdToken", "response", "Landroidx/credentials/GetCredentialResponse;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleSignInCredentialManagerHelper {
    private static final String TAG = "GoogleSignInCredentialMgr";
    private final Context context;
    private final CredentialManager credentialManager;
    private final CoroutineScope scope;
    public static final int $stable = 8;

    public GoogleSignInCredentialManagerHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.credentialManager = CredentialManager.INSTANCE.create(context);
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
    }

    public final void requestGoogleIdToken(Activity activity, String webClientId, Function1<? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webClientId, "webClientId");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!StringsKt.isBlank(webClientId)) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new GoogleSignInCredentialManagerHelper$requestGoogleIdToken$1(webClientId, this, onResult, activity, null), 3, null);
        } else {
            Log.w(TAG, "Web client ID is empty, skipping Credential Manager");
            onResult.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractIdToken(GetCredentialResponse response) {
        try {
            return GoogleIdTokenCredential.INSTANCE.createFrom(response.getCredential().getData()).getZzb();
        } catch (Exception e) {
            Log.e(TAG, "Failed to parse Credential Manager response", e);
            return null;
        }
    }
}
