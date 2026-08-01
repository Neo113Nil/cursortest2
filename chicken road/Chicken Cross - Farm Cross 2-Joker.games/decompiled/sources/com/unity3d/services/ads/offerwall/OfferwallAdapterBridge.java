package com.unity3d.services.ads.offerwall;

import com.ironsource.C4593pg;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: OfferwallAdapterBridge.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR.\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "_offerwallEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "offerwallEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getOfferwallEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "placementsMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", C4593pg.b, "isConnected", "", "isAdReady", "placementName", "loadAd", "", "showAd", "tapjoyPlacementListener", "Ljava/lang/reflect/InvocationHandler;", "getPlacementName", "placementObj", "getPlacement", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferwallAdapterBridge {
    private final MutableSharedFlow<OfferwallEventData> _offerwallEventFlow;
    private final SharedFlow<OfferwallEventData> offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final CoroutineScope scope;

    public OfferwallAdapterBridge(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        MutableSharedFlow<OfferwallEventData> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._offerwallEventFlow = MutableSharedFlow$default;
        this.offerwallEventFlow = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.placementsMap = new HashMap<>();
    }

    public final SharedFlow<OfferwallEventData> getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod(C4593pg.b, new Class[0]).invoke(null, new Object[0]);
            return str == null ? "0.0.0" : str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", new Class[0]).invoke(null, new Object[0]);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isAdReady(String placementName) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Object placement = getPlacement(placementName);
        Method declaredMethod = (placement == null || (cls = placement.getClass()) == null) ? null : cls.getDeclaredMethod("isContentReady", new Class[0]);
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(placement, new Object[0]) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void loadAd(String placementName) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        Method declaredMethod = (placement == null || (cls = placement.getClass()) == null) ? null : cls.getDeclaredMethod("requestContent", new Class[0]);
        if (declaredMethod != null) {
            declaredMethod.invoke(placement, new Object[0]);
        }
    }

    public final void showAd(String placementName) {
        Class<?> cls;
        Class<?> cls2;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Object obj = this.placementsMap.get(placementName);
        Method method = null;
        Method declaredMethod = (obj == null || (cls2 = obj.getClass()) == null) ? null : cls2.getDeclaredMethod("isContentAvailable", new Class[0]);
        Boolean bool = (Boolean) (declaredMethod != null ? declaredMethod.invoke(obj, new Object[0]) : null);
        if (bool != null ? bool.booleanValue() : false) {
            if (obj != null && (cls = obj.getClass()) != null) {
                method = cls.getDeclaredMethod("showContent", new Class[0]);
            }
            if (method != null) {
                method.invoke(obj, new Object[0]);
            }
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new OfferwallAdapterBridge$showAd$1(this, placementName, null), 3, null);
        }
        this.placementsMap.remove(placementName);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new InvocationHandler() { // from class: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$$ExternalSyntheticLambda0
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object tapjoyPlacementListener$lambda$0;
                tapjoyPlacementListener$lambda$0 = OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge.this, obj, method, objArr);
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
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge offerwallAdapterBridge, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        String placementName = offerwallAdapterBridge.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        BuildersKt__Builders_commonKt.launch$default(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(offerwallAdapterBridge, placementName, null), 3, null);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        String placementName2 = offerwallAdapterBridge.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        BuildersKt__Builders_commonKt.launch$default(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(offerwallAdapterBridge, placementName2, null), 3, null);
                        break;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        String placementName3 = offerwallAdapterBridge.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        BuildersKt__Builders_commonKt.launch$default(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(offerwallAdapterBridge, placementName3, null), 3, null);
                        break;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object obj5 = objArr[0];
                        Intrinsics.checkNotNull(obj5);
                        String placementName4 = offerwallAdapterBridge.getPlacementName(obj5);
                        Boolean bool = (Boolean) obj5.getClass().getDeclaredMethod("isContentAvailable", new Class[0]).invoke(obj5, new Object[0]);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + booleanValue);
                        BuildersKt__Builders_commonKt.launch$default(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(booleanValue, offerwallAdapterBridge, placementName4, null), 3, null);
                        break;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj6 = objArr[0];
                        Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                        String placementName5 = offerwallAdapterBridge.getPlacementName(obj6);
                        offerwallAdapterBridge.placementsMap.remove(placementName5 == null ? "" : placementName5);
                        Object obj7 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj7.getClass().getField(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE).get(obj7)) + ", errorMessage: " + ((String) obj7.getClass().getField("message").get(obj7)));
                        BuildersKt__Builders_commonKt.launch$default(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(offerwallAdapterBridge, placementName5, null), 3, null);
                        break;
                    }
                    break;
            }
        }
        return null;
    }

    private final String getPlacementName(Object placementObj) {
        return (String) placementObj.getClass().getDeclaredMethod("getName", new Class[0]).invoke(placementObj, new Object[0]);
    }

    private final Object getPlacement(String placementName) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, placementName, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }
}
