package p;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import w1.C1722m0;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524k {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f15643a;

    /* renamed from: b, reason: collision with root package name */
    public final C1722m0 f15644b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15645c;

    /* renamed from: d, reason: collision with root package name */
    public ActivityOptions f15646d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f15647e;

    /* renamed from: f, reason: collision with root package name */
    public int f15648f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15649g;

    public C1524k() {
        this.f15643a = new Intent("android.intent.action.VIEW");
        this.f15644b = new C1722m0(20);
        this.f15648f = 0;
        this.f15649g = true;
    }

    public final C1525l a() {
        Intent intent = this.f15643a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.f15645c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f15649g);
        this.f15644b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f15647e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f15648f);
        int i7 = Build.VERSION.SDK_INT;
        String a2 = AbstractC1522i.a();
        if (!TextUtils.isEmpty(a2)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a2);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i7 >= 34) {
            if (this.f15646d == null) {
                this.f15646d = AbstractC1521h.a();
            }
            AbstractC1523j.a(this.f15646d, false);
        }
        ActivityOptions activityOptions = this.f15646d;
        return new C1525l(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f15648f = i7;
        Intent intent = this.f15643a;
        if (i7 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i7 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public C1524k(C1530q c1530q) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f15643a = intent;
        this.f15644b = new C1722m0(20);
        this.f15648f = 0;
        this.f15649g = true;
        if (c1530q != null) {
            intent.setPackage(c1530q.f15661d.getPackageName());
            BinderC1519f binderC1519f = c1530q.f15660c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC1519f);
            intent.putExtras(bundle);
        }
    }
}
