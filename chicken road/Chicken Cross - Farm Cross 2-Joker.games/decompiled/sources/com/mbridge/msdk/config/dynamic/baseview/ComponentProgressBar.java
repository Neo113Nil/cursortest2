package com.mbridge.msdk.config.dynamic.baseview;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* loaded from: classes6.dex */
public class ComponentProgressBar extends ProgressBar implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9065a;

    public ComponentProgressBar(Context context) {
        super(context);
        this.f9065a = "ComponentProgressBar";
    }

    private static int a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return R.style.Widget.ProgressBar;
        }
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            if (!TextUtils.isEmpty(attributeName) && attributeName.equals("style")) {
                String attributeValue = attributeSet.getAttributeValue(i);
                if (attributeValue.contains("Horizontal")) {
                    return R.style.Widget.ProgressBar.Horizontal;
                }
                if (attributeValue.contains("Large")) {
                    return R.style.Widget.ProgressBar.Large;
                }
                if (attributeValue.contains("Small")) {
                    return R.style.Widget.ProgressBar.Small;
                }
                if (attributeValue.contains("Large.Inverse")) {
                    return R.style.Widget.ProgressBar.Large.Inverse;
                }
                if (attributeValue.contains("Small.Inverse")) {
                    return R.style.Widget.ProgressBar.Small.Inverse;
                }
                if (attributeValue.contains("Inverse")) {
                    return R.style.Widget.ProgressBar.Inverse;
                }
            }
        }
        return R.style.Widget.ProgressBar;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("data"));
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            setProgress(Integer.parseInt(valueOf));
        } catch (Exception e) {
            q0.b("ComponentProgressBar", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            setProgress(Integer.parseInt(String.valueOf(obj)));
        } catch (Throwable th) {
            q0.b("ComponentProgressBar", th.getMessage());
        }
    }

    public ComponentProgressBar(Context context, AttributeSet attributeSet) {
        super(context, null, a(attributeSet));
        this.f9065a = "ComponentProgressBar";
    }
}
