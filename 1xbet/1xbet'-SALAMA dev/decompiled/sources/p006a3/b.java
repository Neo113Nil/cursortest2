package p006a3;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    Task beginSignIn(BeginSignInRequest beginSignInRequest);

    Task getSignInIntent(GetSignInIntentRequest getSignInIntentRequest);
}
