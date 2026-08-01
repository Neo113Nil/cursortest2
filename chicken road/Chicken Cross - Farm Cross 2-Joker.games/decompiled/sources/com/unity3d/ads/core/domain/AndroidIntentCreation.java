package com.unity3d.ads.core.domain;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidIntentCreation.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u0096\u0002¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidIntentCreation;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "<init>", "()V", "invoke", "Landroid/content/Intent;", "url", "", "packageName", "action", "extras", "", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidIntentCreation implements IntentCreation {
    @Override // com.unity3d.ads.core.domain.IntentCreation
    public Intent invoke(String url, String packageName, String action, Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent();
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
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        intent.setData(parse);
        if (extras != null) {
            for (Map.Entry<String, ? extends Object> entry : extras.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    intent.putExtra(key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    intent.putExtra(key, ((Number) value).doubleValue());
                }
            }
        }
        return intent;
    }
}
