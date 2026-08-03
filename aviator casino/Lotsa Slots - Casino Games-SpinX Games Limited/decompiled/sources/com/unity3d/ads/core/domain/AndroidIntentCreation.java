package com.unity3d.ads.core.domain;

/* compiled from: AndroidIntentCreation.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0096\u0002¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidIntentCreation;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "()V", "invoke", "Landroid/content/Intent;", "url", "", "packageName", "action", "extras", "", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidIntentCreation implements com.unity3d.ads.core.domain.IntentCreation {
    @Override // com.unity3d.ads.core.domain.IntentCreation
    public android.content.Intent invoke(java.lang.String url, java.lang.String packageName, java.lang.String action, java.util.Map<java.lang.String, ? extends java.lang.Object> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        android.content.Intent intent = new android.content.Intent();
        if (packageName != null) {
            if (packageName.length() <= 0) {
                packageName = null;
            }
            if (packageName != null) {
                intent.setPackage(packageName);
            }
        }
        if (action != null) {
            if (action.length() <= 0) {
                action = null;
            }
            if (action != null) {
                intent.setAction(action);
            }
        }
        android.net.Uri parse = android.net.Uri.parse(url);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        intent.setData(parse);
        if (extras != null) {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : extras.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.lang.String) {
                    intent.putExtra(key, (java.lang.String) value);
                } else if (value instanceof java.lang.Integer) {
                    intent.putExtra(key, ((java.lang.Number) value).intValue());
                } else if (value instanceof java.lang.Boolean) {
                    intent.putExtra(key, ((java.lang.Boolean) value).booleanValue());
                } else if (value instanceof java.lang.Float) {
                    intent.putExtra(key, ((java.lang.Number) value).floatValue());
                } else if (value instanceof java.lang.Double) {
                    intent.putExtra(key, ((java.lang.Number) value).doubleValue());
                }
            }
        }
        return intent;
    }
}
