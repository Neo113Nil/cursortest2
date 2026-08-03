package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: ProductDetailsBridge.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "(Ljava/lang/Object;)V", "getClassName", "", "getOriginalJson", "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductDetailsBridge.TO_STRING_METHOD, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDetailsBridge extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.store.gpbl.BillingOriginalJsonResponse {
    private static final java.lang.String TO_STRING_METHOD = "toString";
    private final java.lang.Object internalRef;

    public java.lang.String toString() {
        java.lang.Object callNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(callNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) callNonVoidMethod;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public org.json.JSONObject getOriginalJson() {
        try {
            java.lang.String parseOriginalJson = parseOriginalJson(toString());
            return parseOriginalJson != null ? new org.json.JSONObject(parseOriginalJson) : new org.json.JSONObject();
        } catch (org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    private final java.lang.String parseOriginalJson(java.lang.String productDetailsString) {
        try {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) productDetailsString, "jsonString='", 0, false, 6, (java.lang.Object) null) + 12;
            int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) productDetailsString, "', parsedJson=", 0, false, 6, (java.lang.Object) null);
            if (1 > indexOf$default || indexOf$default >= indexOf$default2) {
                return null;
            }
            java.lang.String substring = productDetailsString.substring(indexOf$default, indexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return kotlin.text.StringsKt.replace$default(substring, "\\/", com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 4, (java.lang.Object) null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(java.lang.Object internalRef) {
        super(kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(TO_STRING_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalRef, "internalRef");
        this.internalRef = internalRef;
    }
}
