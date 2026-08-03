package com.unity3d.services.ads.offerwall;

/* compiled from: OfferwallAdapterBridge.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR.\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "_offerwallEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "offerwallEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getOfferwallEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "placementsMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getPlacement", "placementName", "getPlacementName", "placementObj", "getVersion", "isAdReady", "", "isConnected", "loadAd", "", "showAd", "tapjoyPlacementListener", "Ljava/lang/reflect/InvocationHandler;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfferwallAdapterBridge {
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.domain.offerwall.OfferwallEventData> _offerwallEventFlow;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.offerwall.OfferwallEventData> offerwallEventFlow;
    private final java.util.HashMap<java.lang.String, java.lang.Object> placementsMap;
    private final kotlinx.coroutines.CoroutineScope scope;

    public OfferwallAdapterBridge(kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.domain.offerwall.OfferwallEventData> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._offerwallEventFlow = MutableSharedFlow$default;
        this.offerwallEventFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.placementsMap = new java.util.HashMap<>();
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.offerwall.OfferwallEventData> getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final java.lang.String getVersion() {
        try {
            java.lang.String str = (java.lang.String) java.lang.Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getVersion", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            return str == null ? "0.0.0" : str;
        } catch (java.lang.Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isConnected() {
        try {
            java.lang.Boolean bool = (java.lang.Boolean) java.lang.Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean isAdReady(java.lang.String placementName) {
        java.lang.Class<?> cls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        java.lang.Object placement = getPlacement(placementName);
        java.lang.reflect.Method declaredMethod = (placement == null || (cls = placement.getClass()) == null) ? null : cls.getDeclaredMethod("isContentReady", new java.lang.Class[0]);
        java.lang.Boolean bool = (java.lang.Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, new java.lang.Object[0]) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void loadAd(java.lang.String placementName) {
        java.lang.Class<?> cls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        java.lang.Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        java.lang.reflect.Method declaredMethod = (placement == null || (cls = placement.getClass()) == null) ? null : cls.getDeclaredMethod("requestContent", new java.lang.Class[0]);
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, new java.lang.Object[0]);
        }
    }

    public final void showAd(java.lang.String placementName) {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        java.lang.Object obj = this.placementsMap.get(placementName);
        java.lang.reflect.Method method = null;
        java.lang.reflect.Method declaredMethod = (obj == null || (cls2 = obj.getClass()) == null) ? null : cls2.getDeclaredMethod("isContentAvailable", new java.lang.Class[0]);
        java.lang.Boolean bool = (java.lang.Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, new java.lang.Object[0]) : null);
        if (bool == null || !bool.booleanValue()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$showAd$1(this, placementName, null), 3, null);
        } else {
            if (obj != null && (cls = obj.getClass()) != null) {
                method = cls.getDeclaredMethod("showContent", new java.lang.Class[0]);
            }
            if (method != null) {
                method.invoke(obj, new java.lang.Object[0]);
            }
        }
        this.placementsMap.remove(placementName);
    }

    private final java.lang.reflect.InvocationHandler tapjoyPlacementListener() {
        return new java.lang.reflect.InvocationHandler() { // from class: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$$ExternalSyntheticLambda0
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                java.lang.Object tapjoyPlacementListener$lambda$0;
                tapjoyPlacementListener$lambda$0 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.this, obj, method, objArr);
                return tapjoyPlacementListener$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final java.lang.Object tapjoyPlacementListener$lambda$0(com.unity3d.services.ads.offerwall.OfferwallAdapterBridge this$0, java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        java.lang.Object obj2 = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "args[0]");
                        java.lang.String placementName = this$0.getPlacementName(obj2);
                        com.unity3d.services.core.log.DeviceLog.debug("Placement content ready: " + placementName);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this$0, placementName, null), 3, null);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        java.lang.Object obj3 = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "args[0]");
                        java.lang.String placementName2 = this$0.getPlacementName(obj3);
                        com.unity3d.services.core.log.DeviceLog.debug("Placement content dismissed: " + placementName2);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this$0, placementName2, null), 3, null);
                        break;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        java.lang.Object obj4 = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "args[0]");
                        java.lang.String placementName3 = this$0.getPlacementName(obj4);
                        com.unity3d.services.core.log.DeviceLog.debug("Placement content shown: " + placementName3);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this$0, placementName3, null), 3, null);
                        break;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        java.lang.Object placementObj = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(placementObj, "placementObj");
                        java.lang.String placementName4 = this$0.getPlacementName(placementObj);
                        java.lang.Boolean bool = (java.lang.Boolean) placementObj.getClass().getDeclaredMethod("isContentAvailable", new java.lang.Class[0]).invoke(placementObj, new java.lang.Object[0]);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        com.unity3d.services.core.log.DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + booleanValue);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1(booleanValue, this$0, placementName4, null), 3, null);
                        break;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        java.lang.Object obj5 = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj5, "args[0]");
                        java.lang.String placementName5 = this$0.getPlacementName(obj5);
                        this$0.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        java.lang.Object obj6 = objArr[1];
                        com.unity3d.services.core.log.DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((java.lang.Integer) obj6.getClass().getField("code").get(obj6)) + ", errorMessage: " + ((java.lang.String) obj6.getClass().getField("message").get(obj6)));
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this$0.scope, null, null, new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$2(this$0, placementName5, null), 3, null);
                        break;
                    }
                    break;
            }
        }
        return null;
    }

    private final java.lang.String getPlacementName(java.lang.Object placementObj) {
        return (java.lang.String) placementObj.getClass().getDeclaredMethod("getName", new java.lang.Class[0]).invoke(placementObj, new java.lang.Object[0]);
    }

    private final java.lang.Object getPlacement(java.lang.String placementName) {
        return java.lang.Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", java.lang.String.class, java.lang.Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, placementName, java.lang.reflect.Proxy.newProxyInstance(java.lang.Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new java.lang.Class[]{java.lang.Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }
}
