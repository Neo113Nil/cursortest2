package com.mbridge.msdk.config.dynamic.baseview;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.inter.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ComponentTextView extends TextView implements a, b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f9066a;
    private String b;
    public XMLView xmlView;

    public ComponentTextView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void a() {
        Animator animator = this.f9066a;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e) {
                q0.b("MBTextView", "启动动画失败: " + e.getMessage());
            }
        }
    }

    private void b() {
        Animator animator = this.f9066a;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e) {
                q0.b("MBTextView", "停止动画失败: " + e.getMessage());
            }
        }
    }

    private Map<String, Object> getDataMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("text", getText().toString());
        return hashMap;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(tag), getDataMap());
        return hashMap;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
            a();
        } catch (Exception e) {
            q0.b("MBTextView", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            b();
        } catch (Exception e) {
            q0.b("MBTextView", "onDetachedFromWindow异常: " + e.getMessage());
        }
    }

    public void setOutDataScope(String str) {
        this.b = str;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentTextView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentTextView.this.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf) && valueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            q0.b("MBTextView", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            q0.b("MBTextView", "updateBindData异常: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        f.a(this.xmlView, view.getTag(), dataMap);
    }
}
