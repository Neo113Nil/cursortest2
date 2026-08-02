package io.flutter.plugins.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.u;
import androidx.media3.exoplayer.analytics.C0346b;
import androidx.media3.exoplayer.analytics.C0350d;
import androidx.media3.exoplayer.analytics.C0358h;
import androidx.media3.exoplayer.analytics.C0363j0;
import androidx.media3.exoplayer.analytics.C0365k0;
import com.google.android.exoplayer2.analytics.C0746o;
import com.google.android.exoplayer2.analytics.C0751u;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.source.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011H\u0002J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140!H\u0002J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010(\u001a\u00020\u001eH\u0002J \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0002J$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010&0!H\u0002J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010!H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011H\u0002J\"\u00101\u001a\u0004\u0018\u0001022\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010!H\u0002J2\u00104\u001a\u00020\r2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00112\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0002J8\u00109\u001a\u00020\r\"\u0004\b\u0000\u0010:2\f\u00105\u001a\b\u0012\u0004\u0012\u0002H:0\u00112\u001a\u00106\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H:08\u0012\u0004\u0012\u00020\r07H\u0002J8\u0010;\u001a\u00020\r2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140!2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J,\u0010=\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u00132\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J4\u0010>\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u00132\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J*\u0010?\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J\"\u0010@\u001a\u00020\r2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J*\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u001e2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J8\u0010C\u001a\u00020\r2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010&0!2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J:\u0010E\u001a\u00020\r2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010!2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016J$\u0010F\u001a\u00020\r2\u001a\u00106\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001308\u0012\u0004\u0012\u00020\r07H\u0016J$\u0010G\u001a\u00020\r2\u001a\u00106\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e08\u0012\u0004\u0012\u00020\r07H\u0016J8\u0010H\u001a\u00020\r2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130!2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r08\u0012\u0004\u0012\u00020\r07H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "<init>", "()V", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "initInstance", "", "context", "Landroid/content/Context;", "getPluginConstantsForFirebaseApp", "Lcom/google/android/gms/tasks/Task;", "", "", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "didReinitializeFirebaseCore", "Ljava/lang/Void;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "handleGetSessionId", "", "handleLogEvent", "arguments", "", "handleSetUserId", Constants.USER_ID, "handleSetAnalyticsCollectionEnabled", "enabled", "", "handleSetSessionTimeoutDuration", Constants.MILLISECONDS, "handleSetUserProperty", "name", "value", "handleResetAnalyticsData", "handleSetConsent", "handleSetDefaultEventParameters", Constants.PARAMETERS, "handleGetAppInstanceId", "createBundleFromMap", "Landroid/os/Bundle;", "map", "handleVoidTaskResult", "task", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "handleTypedTaskResult", ExifInterface.GPS_DIRECTION_TRUE, "logEvent", NotificationCompat.CATEGORY_EVENT, "setUserId", "setUserProperty", "setAnalyticsCollectionEnabled", "resetAnalyticsData", "setSessionTimeoutDuration", "timeout", "setConsent", "consent", "setDefaultEventParameters", "getAppInstanceId", "getSessionId", "initiateOnDeviceConversionMeasurement", "firebase_analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, FirebaseAnalyticsHostApi {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;
    private BinaryMessenger messenger;

    private final Bundle createBundleFromMap(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(key, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        arrayList.add(createBundleFromMap((Map) obj));
                    } else if (obj != null) {
                        throw new IllegalArgumentException(u.a("Unsupported value type: ", obj.getClass().getCanonicalName(), " in list at key ", key));
                    }
                }
                bundle.putParcelableArrayList(key, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException(defpackage.g.a("Unsupported value type: ", value.getClass().getCanonicalName()));
                }
                bundle.putParcelable(key, createBundleFromMap((Map) value));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didReinitializeFirebaseCore$lambda$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAppInstanceId$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPluginConstantsForFirebaseApp$lambda$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSessionId$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, function1);
    }

    private final Task<String> handleGetAppInstanceId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.media3.exoplayer.audio.e(2, taskCompletionSource, this));
        Task<String> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetAppInstanceId$lambda$0(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            taskCompletionSource.setResult(Tasks.await(firebaseAnalytics.getAppInstanceId()));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Long> handleGetSessionId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.media3.common.util.a(2, taskCompletionSource, this));
        Task<Long> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSessionId$lambda$0(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            taskCompletionSource.setResult(Tasks.await(firebaseAnalytics.getSessionId()));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleLogEvent(final Map<String, ? extends Object> arguments) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: io.flutter.plugins.firebase.analytics.e
            public final /* synthetic */ FlutterFirebaseAnalyticsPlugin b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleLogEvent$lambda$0(arguments, this.b, taskCompletionSource);
            }
        });
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleLogEvent$lambda$0(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.EVENT_NAME);
            Objects.requireNonNull(obj);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle createBundleFromMap = flutterFirebaseAnalyticsPlugin.createBundleFromMap((Map) map.get(Constants.PARAMETERS));
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.logEvent(str, createBundleFromMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleResetAnalyticsData() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.media3.exoplayer.audio.h(3, this, taskCompletionSource));
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResetAnalyticsData$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.resetAnalyticsData();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetAnalyticsCollectionEnabled(final boolean enabled) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.h
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetAnalyticsCollectionEnabled$lambda$0(FlutterFirebaseAnalyticsPlugin.this, enabled, taskCompletionSource);
            }
        });
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetAnalyticsCollectionEnabled$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setAnalyticsCollectionEnabled(z);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetConsent(Map<String, Boolean> arguments) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(arguments, this, taskCompletionSource, 1));
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetConsent$lambda$0(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            Boolean bool3 = (Boolean) map.get(Constants.AD_PERSONALIZATION_SIGNALS_CONSENT_GRANTED);
            Boolean bool4 = (Boolean) map.get(Constants.AD_USER_DATA_CONSENT_GRANTED);
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED);
            }
            if (bool3 != null) {
                hashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, bool3.booleanValue() ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED);
            }
            if (bool4 != null) {
                hashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, bool4.booleanValue() ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED);
            }
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setConsent(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetDefaultEventParameters(final Map<String, ? extends Object> parameters) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetDefaultEventParameters$lambda$0(FlutterFirebaseAnalyticsPlugin.this, parameters, taskCompletionSource);
            }
        });
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetDefaultEventParameters$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setDefaultEventParameters(flutterFirebaseAnalyticsPlugin.createBundleFromMap(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetSessionTimeoutDuration(final long milliseconds) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.g
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetSessionTimeoutDuration$lambda$0(FlutterFirebaseAnalyticsPlugin.this, milliseconds, taskCompletionSource);
            }
        });
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetSessionTimeoutDuration$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, long j, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setSessionTimeoutDuration(j);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetUserId(String userId) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o(this, userId, taskCompletionSource, 1));
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetUserId$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setUserId(str);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetUserProperty(String name, String value) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(1, this, name, value, taskCompletionSource));
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetUserProperty$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, String str2, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.setUserProperty(str, str2);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final <T> void handleTypedTaskResult(Task<T> task, Function1<? super Result<? extends T>, Unit> callback) {
        String str;
        if (task.isSuccessful()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(task.getResult())));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (str = exception.getMessage()) == null) {
            str = "An unknown error occurred";
        }
        Result.Companion companion2 = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new FlutterError("firebase_analytics", str, null)))));
    }

    private final void handleVoidTaskResult(Task<Void> task, Function1<? super Result<Unit>, Unit> callback) {
        String str;
        if (task.isSuccessful()) {
            Result.Companion companion = Result.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.c(Unit.INSTANCE, callback);
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (str = exception.getMessage()) == null) {
            str = "An unknown error occurred";
        }
        Result.Companion companion2 = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new FlutterError("firebase_analytics", str, null)))));
    }

    private final void initInstance(BinaryMessenger messenger, Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        this.analytics = firebaseAnalytics;
        this.channel = new MethodChannel(messenger, "plugins.flutter.io/firebase_analytics");
        FirebaseAnalyticsHostApi.Companion.setUp$default(FirebaseAnalyticsHostApi.INSTANCE, messenger, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.messenger = messenger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEvent$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetAnalyticsData$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAnalyticsCollectionEnabled$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConsent$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaultEventParameters$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSessionTimeoutDuration$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserId$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserProperty$lambda$0(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, function1);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a(taskCompletionSource, 3));
        Task<Void> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getAppInstanceId(final Function1<? super Result<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleGetAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.analytics.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAnalyticsPlugin.getAppInstanceId$lambda$0(FlutterFirebaseAnalyticsPlugin.this, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(FirebaseApp firebaseApp) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.f
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.getPluginConstantsForFirebaseApp$lambda$0(TaskCompletionSource.this);
            }
        });
        Task<Map<String, Object>> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getSessionId(Function1<? super Result<Long>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleGetSessionId().addOnCompleteListener(new C0346b(2, this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void initiateOnDeviceConversionMeasurement(Map<String, String> arguments, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Result.Companion companion = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new FlutterError("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS.", null)))));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void logEvent(Map<String, ? extends Object> event, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleLogEvent(event).addOnCompleteListener(new androidx.media3.exoplayer.hls.g(this, callback));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        initInstance(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FirebaseAnalyticsHostApi.Companion companion = FirebaseAnalyticsHostApi.INSTANCE;
        Intrinsics.checkNotNull(binaryMessenger);
        FirebaseAnalyticsHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.channel = null;
        this.messenger = null;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void resetAnalyticsData(Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleResetAnalyticsData().addOnCompleteListener(new C0365k0(2, this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setAnalyticsCollectionEnabled(boolean enabled, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetAnalyticsCollectionEnabled(enabled).addOnCompleteListener(new C0350d(this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setConsent(Map<String, Boolean> consent, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetConsent(consent).addOnCompleteListener(new C0363j0(2, this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setDefaultEventParameters(Map<String, ? extends Object> parameters, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetDefaultEventParameters(parameters).addOnCompleteListener(new C0746o(this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setSessionTimeoutDuration(long timeout, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetSessionTimeoutDuration(timeout).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.analytics.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAnalyticsPlugin.setSessionTimeoutDuration$lambda$0(FlutterFirebaseAnalyticsPlugin.this, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserId(String userId, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetUserId(userId).addOnCompleteListener(new C0358h(this, callback));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserProperty(String name, String value, Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        handleSetUserProperty(name, value).addOnCompleteListener(new C0751u(this, callback));
    }
}
