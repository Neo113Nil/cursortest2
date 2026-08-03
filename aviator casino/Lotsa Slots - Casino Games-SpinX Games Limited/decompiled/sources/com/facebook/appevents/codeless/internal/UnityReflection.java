package com.facebook.appevents.codeless.internal;

/* compiled from: UnityReflection.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\f\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/codeless/internal/UnityReflection;", "", "()V", "CAPTURE_VIEW_HIERARCHY_METHOD", "", "EVENT_MAPPING_METHOD", "FB_UNITY_GAME_OBJECT", "TAG", "kotlin.jvm.PlatformType", "UNITY_PLAYER_CLASS", "UNITY_SEND_MESSAGE_METHOD", "unityPlayer", "Ljava/lang/Class;", "captureViewHierarchy", "", "getUnityPlayerClass", "sendEventMapping", "eventMapping", com.ironsource.C3023e8.j, "unityObject", "unityMethod", "message", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UnityReflection {
    private static final java.lang.String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
    private static final java.lang.String EVENT_MAPPING_METHOD = "OnReceiveMapping";
    private static final java.lang.String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
    public static final com.facebook.appevents.codeless.internal.UnityReflection INSTANCE = new com.facebook.appevents.codeless.internal.UnityReflection();
    private static final java.lang.String TAG = com.facebook.appevents.codeless.internal.UnityReflection.class.getCanonicalName();
    private static final java.lang.String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
    private static final java.lang.String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
    private static java.lang.Class<?> unityPlayer;

    private UnityReflection() {
    }

    private final java.lang.Class<?> getUnityPlayerClass() {
        java.lang.Class<?> cls = java.lang.Class.forName("com.unity3d.player.UnityPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    @kotlin.jvm.JvmStatic
    public static final void sendMessage(java.lang.String unityObject, java.lang.String unityMethod, java.lang.String message) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            java.lang.Class<?> cls = unityPlayer;
            if (cls != null) {
                java.lang.reflect.Method method = cls.getMethod(UNITY_SEND_MESSAGE_METHOD, java.lang.String.class, java.lang.String.class, java.lang.String.class);
                java.lang.Class<?> cls2 = unityPlayer;
                if (cls2 != null) {
                    method.invoke(cls2, unityObject, unityMethod, message);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
            throw null;
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Failed to send message to Unity", e);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    @kotlin.jvm.JvmStatic
    public static final void sendEventMapping(java.lang.String eventMapping) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, eventMapping);
    }
}
