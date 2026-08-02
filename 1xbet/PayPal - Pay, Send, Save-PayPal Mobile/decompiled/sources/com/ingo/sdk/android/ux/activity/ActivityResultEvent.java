package com.ingo.sdk.android.ux.activity;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/ingo/sdk/android/ux/activity/ActivityResultEvent;", "", "", "requestCode", "resultCode", "Landroid/content/Intent;", "intent", "<init>", "(IILandroid/content/Intent;)V", "component1", "()I", "component2", "component3", "()Landroid/content/Intent;", "copy", "(IILandroid/content/Intent;)Lcom/ingo/sdk/android/ux/activity/ActivityResultEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRequestCode", "getResultCode", "Landroid/content/Intent;", "getIntent"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActivityResultEvent {
    public static final int $stable = 8;
    private final android.content.Intent intent;
    private final int requestCode;
    private final int resultCode;

    public ActivityResultEvent(int i, int i2, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        this.requestCode = i;
        this.resultCode = i2;
        this.intent = intent;
    }

    public final android.content.Intent getIntent() {
        return this.intent;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final java.lang.String toString() {
        int i = this.requestCode;
        int i2 = this.resultCode;
        android.content.Intent intent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResultEvent(requestCode=");
        sb.append(i);
        sb.append(", resultCode=");
        sb.append(i2);
        sb.append(", intent=");
        sb.append(intent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.requestCode) * 31) + java.lang.Integer.hashCode(this.resultCode)) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.android.ux.activity.ActivityResultEvent)) {
            return false;
        }
        com.ingo.sdk.android.ux.activity.ActivityResultEvent activityResultEvent = (com.ingo.sdk.android.ux.activity.ActivityResultEvent) other;
        return this.requestCode == activityResultEvent.requestCode && this.resultCode == activityResultEvent.resultCode && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, activityResultEvent.intent);
    }

    public final com.ingo.sdk.android.ux.activity.ActivityResultEvent copy(int requestCode, int resultCode, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.ingo.sdk.android.ux.activity.ActivityResultEvent(requestCode, resultCode, intent);
    }

    /* renamed from: component3, reason: from getter */
    public final android.content.Intent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component1, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    public static /* synthetic */ com.ingo.sdk.android.ux.activity.ActivityResultEvent copy$default(com.ingo.sdk.android.ux.activity.ActivityResultEvent activityResultEvent, int i, int i2, android.content.Intent intent, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = activityResultEvent.requestCode;
        }
        if ((i3 & 2) != 0) {
            i2 = activityResultEvent.resultCode;
        }
        if ((i3 & 4) != 0) {
            intent = activityResultEvent.intent;
        }
        return activityResultEvent.copy(i, i2, intent);
    }
}
