package com.datadog.android.sessionreplay.internal.recorder.callback;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;", "", "", "Landroid/view/Window;", "windows", "", "onWindowsAdded", "(Ljava/util/List;)V", "onWindowsRemoved"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnWindowRefreshedCallback {
    void onWindowsAdded(java.util.List<? extends android.view.Window> windows);

    void onWindowsRemoved(java.util.List<? extends android.view.Window> windows);
}
