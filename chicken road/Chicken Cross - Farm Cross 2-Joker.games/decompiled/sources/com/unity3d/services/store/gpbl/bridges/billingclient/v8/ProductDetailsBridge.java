package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProductDetailsBridge.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "<init>", "(Ljava/lang/Object;)V", "toString", "", "getClassName", InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object internalRef) {
        super(MapsKt.hashMapOf(TuplesKt.to("toString", new Class[0])));
        Intrinsics.checkNotNullParameter(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    public String toString() {
        Object callNonVoidMethod = callNonVoidMethod("toString", this.internalRef, new Object[0]);
        Intrinsics.checkNotNull(callNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) callNonVoidMethod;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS;
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String parseOriginalJson = parseOriginalJson(toString());
            return parseOriginalJson != null ? new JSONObject(parseOriginalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final String parseOriginalJson(String productDetailsString) {
        try {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) productDetailsString, "jsonString='", 0, false, 6, (Object) null) + 12;
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) productDetailsString, "', parsedJson=", 0, false, 6, (Object) null);
            if (1 > indexOf$default || indexOf$default >= indexOf$default2) {
                return null;
            }
            String substring = productDetailsString.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return StringsKt.replace$default(substring, "\\/", "/", false, 4, (Object) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
