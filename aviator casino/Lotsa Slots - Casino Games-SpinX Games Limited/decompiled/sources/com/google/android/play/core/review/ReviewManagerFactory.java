package com.google.android.play.core.review;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    public static com.google.android.play.core.review.ReviewManager create(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new com.google.android.play.core.review.zzd(new com.google.android.play.core.review.zzi(context));
    }
}
