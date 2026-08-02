package a3;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.tasks.Task;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0618b {
    Task beginSignIn(BeginSignInRequest beginSignInRequest);

    Task getSignInIntent(GetSignInIntentRequest getSignInIntentRequest);
}
