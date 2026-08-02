package com.datadog.android.core.internal.receiver;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Landroid/content/BroadcastReceiver;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/content/Context;", "context", "Landroid/content/IntentFilter;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Landroid/content/Intent;", "registerReceiver", "(Landroid/content/Context;Landroid/content/IntentFilter;)Landroid/content/Intent;", "", "unregisterReceiver", "(Landroid/content/Context;)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ThreadSafeReceiver extends android.content.BroadcastReceiver {
    public static final int RECEIVER_NOT_EXPORTED_COMPAT = 4;
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoSizes;
    private final java.util.concurrent.atomic.AtomicBoolean isRegistered;

    public /* synthetic */ ThreadSafeReceiver(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    public ThreadSafeReceiver(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoSizes = buildSdkVersionProvider;
        this.isRegistered = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* renamed from: isRegistered, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsRegistered() {
        return this.isRegistered;
    }

    public final android.content.Intent registerReceiver(android.content.Context context, android.content.IntentFilter filter) {
        android.content.Intent registerReceiver;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "");
        if (this.getHighSpeedVideoSizes.getIsAtLeastTiramisu()) {
            registerReceiver = context.registerReceiver(this, filter, 4);
        } else if (this.getHighSpeedVideoSizes.getIsAtLeastO()) {
            registerReceiver = context.registerReceiver(this, filter, 4);
        } else {
            registerReceiver = context.registerReceiver(this, filter);
        }
        this.isRegistered.set(true);
        return registerReceiver;
    }

    public final void unregisterReceiver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.isRegistered.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadSafeReceiver() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
