package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/LifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "Landroid/view/Window;", "getCurrentWindows", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface LifecycleCallback extends android.app.Application.ActivityLifecycleCallbacks {
    java.util.List<android.view.Window> getCurrentWindows();
}
