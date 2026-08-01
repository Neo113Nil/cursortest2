package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Z extends AbstractC0770 implements X, View.OnLayoutChangeListener {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f143 = StringFog.decrypt("HTB8s8VORQUvLlOz4lh9CCY8YA==\n", "SlkS16o5E2w=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public Y f144;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f145;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public Class f146;

    public Z(JSONObject jSONObject) {
        super(null);
        this.f145 = new WeakHashMap();
        this.f144 = new Y();
        m5340(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            View m5334 = m5334(view, this.f146);
            if (m5334 != null) {
                if (!this.f145.containsKey(m5334)) {
                    this.f145.put(m5334, Boolean.TRUE);
                    m5663(new JSONObject(), (Object) m5334, Integer.toHexString(m5334.hashCode()));
                }
                view.removeOnLayoutChangeListener(this);
            }
        } catch (Throwable th) {
            AbstractC0480.m5464(f143, StringFog.decrypt("KZ4Wmw5WfCRMgwq4HQ96PxivDJUSEXA=\n", "bOxk9Hx2FUo=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo5338(Object obj, ArrayList arrayList) {
        View view = (View) obj;
        Y y = this.f144;
        AbstractC4297a.m5341(view, WebView.class, y.f141, true, false, null, y.f2217, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC1005 mo5339() {
        return this;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5340(JSONObject jSONObject) {
        Y y = new Y(jSONObject);
        this.f2212 = y;
        this.f144 = y;
        try {
            this.f146 = Class.forName(y.f142);
            C1188.m5907().m5909(this);
        } catch (ClassNotFoundException e) {
            AbstractC0544.m5503(f143, StringFog.decrypt("tO3i1xWxgGuC6/XWDv+LIoXwsN0R9IJ2gr/2ygj8zA==\n", "8Z+QuGeR7AI=\n") + y.f142 + StringFog.decrypt("goE=\n", "uKEBV4WSP8w=\n") + e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final View mo5336(Object obj) {
        return (View) obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC4320y mo5337() {
        return new A();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾇ */
    public final void mo5332(View view) {
        View m5334 = m5334(view, this.f146);
        if (m5334 == null || this.f145.remove(m5334) == null) {
            return;
        }
        m5660(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.X
    /* renamed from: ﾒ */
    public final void mo5333(View view) {
        View m5335;
        View m5334 = m5334(view, this.f146);
        if (m5334 != null) {
            if (this.f145.containsKey(m5334)) {
                return;
            }
            this.f145.put(m5334, Boolean.TRUE);
            m5663(new JSONObject(), (Object) m5334, Integer.toHexString(m5334.hashCode()));
            return;
        }
        if (TextUtils.isEmpty(this.f144.f140) || (m5335 = m5335(view, this.f144.f140)) == null) {
            return;
        }
        m5335.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m5334(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View m5334 = m5334(childAt, cls);
            if (m5334 != null) {
                return m5334;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m5335(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View m5335 = m5335(childAt, str);
            if (m5335 != null) {
                return m5335;
            }
        }
        return null;
    }
}
