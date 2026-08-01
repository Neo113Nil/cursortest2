package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryPurchasesParamsBridge.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "queryPurchasesParamsBridgeInternalInstance", "", "<init>", "(Ljava/lang/Object;)V", "getQueryPurchasesParamsBridgeInternalInstance", "()Ljava/lang/Object;", "getClassName", "", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QueryPurchasesParamsBridge extends GenericBridge {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryPurchasesParamsBridgeInternalInstance;

    public final Object getQueryPurchasesParamsBridgeInternalInstance() {
        return this.queryPurchasesParamsBridgeInternalInstance;
    }

    public QueryPurchasesParamsBridge(Object obj) {
        super(MapsKt.hashMapOf(TuplesKt.to("newBuilder", new Class[0])));
        this.queryPurchasesParamsBridgeInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS;
    }

    /* compiled from: QueryPurchasesParamsBridge.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBridge$Companion;", "", "<init>", "()V", "getClassForParams", "Ljava/lang/Class;", "NEW_BUILDER_METHOD", "", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBuilderBridge;", "callNonVoidStaticMethod", "methodName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Class<?> getClassForParams() {
            Class<?> cls = Class.forName(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            return cls;
        }

        public final QueryPurchasesParamsBuilderBridge newBuilder() {
            return new QueryPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private final Object callNonVoidStaticMethod(String methodName) {
            Object invoke = getClassForParams().getMethod(methodName, new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                return invoke;
            }
            throw new IllegalStateException("Static method " + methodName + " returned null");
        }
    }
}
