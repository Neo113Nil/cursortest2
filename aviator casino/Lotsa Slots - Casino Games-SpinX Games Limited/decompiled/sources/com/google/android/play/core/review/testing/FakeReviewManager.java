package com.google.android.play.core.review.testing;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public class FakeReviewManager implements com.google.android.play.core.review.ReviewManager {
    private final android.content.Context zza;
    private com.google.android.play.core.review.ReviewInfo zzb;

    public FakeReviewManager(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public com.google.android.gms.tasks.Task<java.lang.Void> launchReviewFlow(android.app.Activity activity, com.google.android.play.core.review.ReviewInfo reviewInfo) {
        return reviewInfo != this.zzb ? com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.review.ReviewException(-2)) : com.google.android.gms.tasks.Tasks.forResult(null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public com.google.android.gms.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow() {
        com.google.android.play.core.review.ReviewInfo zzc = com.google.android.play.core.review.ReviewInfo.zzc(android.app.PendingIntent.getBroadcast(this.zza, 0, new android.content.Intent(), android.os.Build.VERSION.SDK_INT >= 23 ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0), false);
        this.zzb = zzc;
        return com.google.android.gms.tasks.Tasks.forResult(zzc);
    }
}
