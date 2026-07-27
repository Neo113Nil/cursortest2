package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC0809 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0770 f2358;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2359;

    public ViewOnLayoutChangeListenerC0809(AbstractC0770 abstractC0770, Object obj) {
        this.f2358 = abstractC0770;
        this.f2359 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList arrayList = new ArrayList();
            this.f2358.mo5338(this.f2359, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            View mo5336 = this.f2358.mo5336(this.f2359);
            if (mo5336 != null && !this.f2358.f2212.f2223) {
                mo5336.removeOnLayoutChangeListener(this);
            }
            this.f2358.m5662(this.f2359, arrayList);
            this.f2358.mo5359(new JSONObject(), (WebView) arrayList.get(0), this.f2359);
        } catch (Throwable th) {
            AbstractC0480.m5464(StringFog.decrypt("ITyG5G+vOCMCJ6vsVK0kIgssmA==\n", "Z0nqiBzMSkY=\n"), StringFog.decrypt("uRAPeyTQiBvcDRNYN4mOAIghFXU4l4Q=\n", "/GJ9FFbw4XU=\n"), th, false);
        }
    }
}
