package org.betup.utils;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InAppReviewHelper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/utils/InAppReviewHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "requestReview", "", "activity", "Landroid/app/Activity;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppReviewHelper {
    public static final int $stable = 0;
    public static final InAppReviewHelper INSTANCE = new InAppReviewHelper();
    private static final String TAG = "InAppReviewHelper";

    private InAppReviewHelper() {
    }

    public final void requestReview(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.d(TAG, "requestReview called, activity=" + Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName());
        final ReviewManager create = ReviewManagerFactory.create(activity.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        Intrinsics.checkNotNullExpressionValue(requestReviewFlow, "requestReviewFlow(...)");
        Log.d(TAG, "requestReviewFlow started");
        requestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.utils.InAppReviewHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InAppReviewHelper.requestReview$lambda$1(ReviewManager.this, activity, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestReview$lambda$1(ReviewManager reviewManager, Activity activity, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Log.d(TAG, "requestReviewFlow success, launching review flow");
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.utils.InAppReviewHelper$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    InAppReviewHelper.requestReview$lambda$1$lambda$0(task2);
                }
            });
        } else {
            Exception exception = task.getException();
            Integer.valueOf(Log.d(TAG, "requestReviewFlow FAILED: " + (exception != null ? exception.getMessage() : null), task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestReview$lambda$1$lambda$0(Task launchTask) {
        Intrinsics.checkNotNullParameter(launchTask, "launchTask");
        boolean isSuccessful = launchTask.isSuccessful();
        Exception exception = launchTask.getException();
        Log.d(TAG, "launchReviewFlow completed, success=" + isSuccessful + ", exception=" + (exception != null ? exception.getMessage() : null));
    }
}
