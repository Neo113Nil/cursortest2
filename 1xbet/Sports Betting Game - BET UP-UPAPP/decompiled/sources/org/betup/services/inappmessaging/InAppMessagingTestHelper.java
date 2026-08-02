package org.betup.services.inappmessaging;

import android.os.Bundle;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.installations.FirebaseInstallations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InAppMessagingTestHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/services/inappmessaging/InAppMessagingTestHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "DEBUG_BUILD_PROPERTY", "logInstallationId", "", "setDebugBuildProperty", "isDebug", "", "setInstallationIdAsProperty", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppMessagingTestHelper {
    public static final int $stable = 0;
    private static final String DEBUG_BUILD_PROPERTY = "is_debug_build";
    public static final InAppMessagingTestHelper INSTANCE = new InAppMessagingTestHelper();
    private static final String TAG = "InAppMessagingTest";

    private InAppMessagingTestHelper() {
    }

    public final void logInstallationId() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.inappmessaging.InAppMessagingTestHelper$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InAppMessagingTestHelper.logInstallationId$lambda$0(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logInstallationId$lambda$0(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            Log.d(TAG, "========================================");
            Log.d(TAG, "Firebase Installation ID (FID): " + str);
            Log.d(TAG, "Copy this ID and use it in Firebase Console");
            Log.d(TAG, "Firebase Console -> In-App Messaging -> Test on device");
            Log.d(TAG, "========================================");
            return;
        }
        Log.e(TAG, "Failed to get Installation ID", task.getException());
    }

    public final void setDebugBuildProperty(boolean isDebug) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(BetUpApp.getContext());
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        String str = isDebug ? "true" : CredentialEntry.FALSE_STRING;
        firebaseAnalytics.setUserProperty(DEBUG_BUILD_PROPERTY, str);
        Log.d(TAG, "========================================");
        Log.d(TAG, "Set user property 'is_debug_build' = ".concat(str));
        Log.d(TAG, "This property may take 5-30 minutes to appear in Firebase Console");
        Log.d(TAG, "To speed up: Navigate through the app to send Analytics events");
        Log.d(TAG, "Then check: Firebase Console -> Analytics -> User Properties");
        Log.d(TAG, "========================================");
        Bundle bundle = new Bundle();
        bundle.putString("debug_build", str);
        firebaseAnalytics.logEvent("debug_build_set", bundle);
    }

    public final void setInstallationIdAsProperty() {
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.services.inappmessaging.InAppMessagingTestHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InAppMessagingTestHelper.setInstallationIdAsProperty$lambda$1(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInstallationIdAsProperty$lambda$1(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(BetUpApp.getContext());
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
            firebaseAnalytics.setUserProperty("device_fid", str);
            Log.d(TAG, "Set user property 'device_fid' = " + str);
            Log.d(TAG, "You can now use this in Firebase Console: User property 'device_fid' equals '" + str + "'");
            return;
        }
        Log.e(TAG, "Failed to set Installation ID as property", task.getException());
    }
}
