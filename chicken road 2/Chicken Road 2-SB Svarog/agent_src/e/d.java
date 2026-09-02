package e;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f486c;

    /* renamed from: a, reason: collision with root package name */
    public final Intent f484a = new Intent("android.intent.action.VIEW");

    /* renamed from: b, reason: collision with root package name */
    public final C.b f485b = new C.b(11);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f487d = true;

    public final C.a a() {
        Intent intent = this.f484a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f487d);
        this.f485b.getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i2 = Build.VERSION.SDK_INT;
        String a2 = AbstractC0024b.a();
        if (!TextUtils.isEmpty(a2)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a2);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i2 >= 34) {
            if (this.f486c == null) {
                this.f486c = AbstractC0023a.a();
            }
            c.a(this.f486c, false);
        }
        ActivityOptions activityOptions = this.f486c;
        return new C.a(15, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
