package com.unity3d.services.core.reflection;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLovinCommunicatorBridge.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getClassName", "", AppLovinCommunicatorBridge.SUBSCRIBE, "", "proxy", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "topic", AppLovinCommunicatorBridge.UNSUBSCRIBE, "", "subscriber", "getCommunicatorInstance", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppLovinCommunicatorBridge extends GenericBridge {
    private static final String CLASS_NAME = "com.applovin.communicator.AppLovinCommunicator";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String GET_INSTANCE = "getInstance";
    private static final String SUBSCRIBE = "subscribe";
    private static final String UNSUBSCRIBE = "unsubscribe";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinCommunicatorBridge(Context context) {
        super(INSTANCE.buildFunctionMap(), false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return CLASS_NAME;
    }

    public final Object subscribe(CommunicatorSubscriberProxy proxy, String topic) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return null;
        }
        try {
            Object proxyInstance = proxy.getProxyInstance();
            callVoidMethod(SUBSCRIBE, communicatorInstance, proxyInstance, topic);
            return proxyInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void unsubscribe(Object subscriber, String topic) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return;
        }
        callVoidMethod(UNSUBSCRIBE, communicatorInstance, subscriber, topic);
    }

    private final Object getCommunicatorInstance() {
        return callNonVoidMethod("getInstance", null, this.context);
    }

    /* compiled from: AppLovinCommunicatorBridge.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b0\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge$Companion;", "", "<init>", "()V", "CLASS_NAME", "", "GET_INSTANCE", "SUBSCRIBE", "UNSUBSCRIBE", "buildFunctionMap", "", "", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Class<?>[]> buildFunctionMap() {
            Map<String, Class<?>[]> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("getInstance", new Class[]{Context.class}));
            try {
                Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicatorSubscriber");
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                mutableMapOf.put(AppLovinCommunicatorBridge.SUBSCRIBE, new Class[]{cls, String.class});
                mutableMapOf.put(AppLovinCommunicatorBridge.UNSUBSCRIBE, new Class[]{cls, String.class});
            } catch (ClassNotFoundException unused) {
            }
            return mutableMapOf;
        }
    }
}
