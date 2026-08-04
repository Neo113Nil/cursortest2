package p109p;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f15649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1013m0 f15650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityOptions f15652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f15653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15655g;

    public k() {
        this.f15649a = new Intent("android.intent.action.VIEW");
        this.f15650b = new C1013m0(20);
        this.f15654f = 0;
        this.f15655g = true;
    }

    public final l a() {
        Intent intent = this.f15649a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.f15651c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f15655g);
        this.f15650b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f15653e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f15654f);
        int i7 = Build.VERSION.SDK_INT;
        String strA = i.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i7 >= 34) {
            if (this.f15652d == null) {
                this.f15652d = h.a();
            }
            j.a(this.f15652d, false);
        }
        ActivityOptions activityOptions = this.f15652d;
        return new l(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 > 2) {
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }
        this.f15654f = i7;
        Intent intent = this.f15649a;
        if (i7 == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i7 == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public k(q qVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f15649a = intent;
        this.f15650b = new C1013m0(20);
        this.f15654f = 0;
        this.f15655g = true;
        if (qVar != null) {
            intent.setPackage(qVar.f15667d.getPackageName());
            f fVar = qVar.f15666c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }
}
