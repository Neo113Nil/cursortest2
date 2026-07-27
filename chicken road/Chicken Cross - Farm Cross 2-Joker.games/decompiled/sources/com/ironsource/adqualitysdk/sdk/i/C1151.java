package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ףּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1151 extends AbstractC0770 implements InterfaceC0951 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1160 f3297;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3298;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public boolean f3299;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public boolean f3300;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public boolean f3301;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Class f3302;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C0939 f3303;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3296 = StringFog.decrypt("cT8VLFxd/INxOCkkRFDkn0I=\n", "MFxhRSo0iPo=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3295 = StringFog.decrypt("Gr64SS6e+LUKvqAVJIm5uh2goAYrheOiCrW+STSI/PU4tYYPKJv5\n", "edHVZ0fsl9s=\n");

    public C1151(JSONObject jSONObject, C0691 c0691) {
        super(c0691);
        this.f3301 = false;
        this.f3300 = false;
        this.f3299 = false;
        this.f3298 = false;
        C1160 c1160 = new C1160(jSONObject);
        this.f2212 = c1160;
        this.f3297 = c1160;
        AbstractC1145.m5892(new C1243(this));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5897(C1151 c1151, Activity activity) {
        c1151.getClass();
        Class<?> cls = activity.getClass();
        Class cls2 = c1151.f3302;
        if (cls2 != null) {
            return c1151.f3297.f3319 ? cls2.equals(cls) : cls2.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1225 c1225 = new C1225(this, activity, bundle);
        if (this.f3297.f3318) {
            AbstractC1145.m5891(c1225);
        } else {
            AbstractC1145.m5893(c1225);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1266 c1266 = new C1266(this, activity);
        if (this.f3297.f3318) {
            AbstractC1145.m5891(c1266);
        } else {
            AbstractC1145.m5893(c1266);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC1145.m5895(new C1181(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1185 c1185 = new C1185(this, activity);
        if (this.f3297.f3318) {
            AbstractC1145.m5891(c1185);
        } else {
            AbstractC1145.m5893(c1185);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1184 c1184 = new C1184(this, activity, bundle);
        if (this.f3297.f3318) {
            AbstractC1145.m5891(c1184);
        } else {
            AbstractC1145.m5893(c1184);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1145.m5895(new C1197(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1172 c1172 = new C1172(this, activity);
        if (this.f3297.f3318) {
            AbstractC1145.m5891(c1172);
        } else {
            AbstractC1145.m5893(c1172);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ */
    public final void mo5338(Object obj, ArrayList arrayList) {
        Activity activity = (Activity) obj;
        C1160 c1160 = this.f3297;
        AbstractC4297a.m5344(activity, WebView.class, c1160.f3320, c1160.f3321, false, false, null, c1160.f2217, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾒ */
    public final InterfaceC1005 mo5339() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ */
    public final View mo5336(Object obj) {
        return ((Activity) obj).findViewById(R.id.content);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0951
    /* renamed from: ﾇ */
    public final void mo5413(Activity activity) {
        AbstractC1145.m5895(new C1241(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0770
    /* renamed from: ﾇ */
    public final AbstractViewOnLayoutChangeListenerC4320y mo5337() {
        return new C4321z();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0951
    /* renamed from: ﾒ */
    public final void mo5414(Activity activity) {
        AbstractC1145.m5895(new C1242(this, activity));
    }
}
