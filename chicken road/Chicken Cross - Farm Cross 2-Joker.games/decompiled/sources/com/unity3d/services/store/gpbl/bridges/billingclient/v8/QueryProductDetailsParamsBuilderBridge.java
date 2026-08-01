package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryProductDetailsParamsBuilderBridge.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "<init>", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "getClassName", "", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "setProductList", "productList", "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    public final void setBuilderInstance(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(Object builderInstance) {
        super(MapsKt.mapOf(TuplesKt.to("setProductList", new Class[]{List.class}), TuplesKt.to("build", new Class[0])));
        Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_BUILDER;
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List<ProductBridge> productList) {
        Intrinsics.checkNotNullParameter(productList, "productList");
        List<ProductBridge> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getProductInternalInstance());
        }
        Object callNonVoidMethod = callNonVoidMethod("setProductList", this.builderInstance, arrayList);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(...)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
