package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class z extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37247a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        static int a() {
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    @Override // android.app.Service
    @NonNull
    public final IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
