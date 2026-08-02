package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.customtabs.a;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.ExperimentalPendingSession;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AuthTabSession {
    private final a mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;

    @ExperimentalPendingSession
    public static class PendingSession {
        private final AuthTabCallback mCallback;
        private final Executor mExecutor;
        private final PendingIntent mId;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public PendingSession(PendingIntent pendingIntent, Executor executor, AuthTabCallback authTabCallback) {
            this.mId = pendingIntent;
            this.mExecutor = executor;
            this.mCallback = authTabCallback;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public AuthTabCallback getCallback() {
            return this.mCallback;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Executor getExecutor() {
            return this.mExecutor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public PendingIntent getId() {
            return this.mId;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AuthTabSession(a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.mCallback = aVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public PendingIntent getId() {
        return this.mId;
    }
}
