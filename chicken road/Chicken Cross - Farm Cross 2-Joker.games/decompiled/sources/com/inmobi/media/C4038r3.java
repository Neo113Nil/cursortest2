package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4038r3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final String f7341a;
    public final C3925n3 b;
    public final Yb c;
    public final String d;
    public final F5 e;
    public final Context f;
    public final WeakReference g;
    public final Application h;
    public final G5 i;
    public boolean j;
    public final WeakReference k;
    public final WeakReference l;
    public boolean m;
    public boolean n;

    public C4038r3(String urlToLoad, C3925n3 c3925n3, Context context, C3998pj c3998pj, Ji redirectionValidator, Yb yb, String api) {
        Intrinsics.checkNotNullParameter(urlToLoad, "urlToLoad");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f7341a = urlToLoad;
        this.b = c3925n3;
        this.c = yb;
        this.d = api;
        F5 f5 = new F5();
        this.e = f5;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f = applicationContext;
        boolean z = context instanceof Activity;
        Activity activity = z ? (Activity) context : null;
        this.g = activity != null ? new WeakReference(activity) : null;
        Activity activity2 = z ? (Activity) context : null;
        Application application = activity2 != null ? activity2.getApplication() : null;
        this.h = application;
        this.i = new G5(c3998pj, yb);
        this.k = new WeakReference(c3998pj);
        this.l = new WeakReference(redirectionValidator);
        Intrinsics.checkNotNullParameter(this, "connectionCallback");
        f5.c = this;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public final C3799ik a() {
        return new C3799ik(new C3953o3(this), new C3982p3(), new C4010q3(this));
    }

    public final void b() {
        Object m8079constructorimpl;
        if (this.n) {
            return;
        }
        this.n = true;
        F5 f5 = this.e;
        Context context = this.f;
        f5.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        D5 d5 = f5.b;
        if (d5 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                context.unbindService(d5);
                m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            Result.m8078boximpl(m8079constructorimpl);
        }
        f5.f6549a = null;
        f5.d = null;
        f5.b = null;
        f5.c = null;
        Application application = this.h;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.k.clear();
        this.l.clear();
    }

    public final Context c() {
        WeakReference weakReference = this.g;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? this.f : activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.g;
        Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity2 == null || Intrinsics.areEqual(activity2, activity)) {
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.n || !this.m) {
            return;
        }
        WeakReference weakReference = this.g;
        Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity2 == null || Intrinsics.areEqual(activity2, activity)) {
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession newSession;
        Context c = c();
        C3925n3 c3925n3 = this.b;
        if (c3925n3 != null && (c instanceof Activity)) {
            try {
                builder = a(c3925n3);
            } catch (Error e) {
                String str = "Error while opening partial tab: " + e.getMessage();
                F5 f5 = this.e;
                CustomTabsSession customTabsSession = f5.d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = f5.f6549a;
                    newSession = customTabsClient != null ? customTabsClient.newSession(new E5(f5)) : null;
                    f5.d = newSession;
                    customTabsSession = newSession;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            F5 f52 = this.e;
            CustomTabsSession customTabsSession2 = f52.d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = f52.f6549a;
                newSession = customTabsClient2 != null ? customTabsClient2.newSession(new E5(f52)) : null;
                f52.d = newSession;
                customTabsSession2 = newSession;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        CustomTabsIntent build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        C3998pj c3998pj = (C3998pj) this.k.get();
        Yb yb = this.c;
        Object obj = this.l.get();
        Intrinsics.checkNotNull(obj);
        C5.a(c, build, uri, c3998pj, yb, (Ji) obj, this.d);
    }

    public final CustomTabsIntent.Builder a(C3925n3 c3925n3) {
        Bitmap bitmap;
        F5 f5 = this.e;
        CustomTabsSession customTabsSession = f5.d;
        if (customTabsSession == null) {
            CustomTabsClient customTabsClient = f5.f6549a;
            customTabsSession = customTabsClient != null ? customTabsClient.newSession(new E5(f5)) : null;
            f5.d = customTabsSession;
        }
        CustomTabsIntent.Builder closeButtonPosition = new CustomTabsIntent.Builder(customTabsSession).setCloseButtonPosition(2);
        Intrinsics.checkNotNullExpressionValue(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            Intrinsics.checkNotNull(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (Error e) {
            String str = "Error while setting custom tab intent properties: " + e.getMessage();
        }
        if (c3925n3.b) {
            Context context = this.f;
            int i = R.drawable.im_close_transparent;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(createBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = createBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        C3900m6 h = AbstractC3841k6.h();
        Hg a2 = Ig.a(AbstractC3841k6.g());
        if (a2 != Hg.b && a2 != Hg.d) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (h.b * c3925n3.f7258a)) * h.c), 2);
        } else {
            int i2 = (int) (h.f7240a * c3925n3.f7258a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i2 * h.c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i2);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        String str = "Custom Tabs layout: left=" + i + ", top=" + i2 + ", right=" + i3 + ", bottom=" + i4 + ", state=" + i5;
        C3998pj c3998pj = (C3998pj) this.k.get();
        if (c3998pj != null) {
            Y9 y9 = c3998pj.f7308a.i;
            if (y9 != null) {
                String str2 = Ej.j1;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                ((Z9) y9).a(str2, "onCCTLayout");
            }
            Ej ej = c3998pj.f7308a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", AbstractC3727g4.a(i));
            jSONObject2.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, AbstractC3727g4.a(i2));
            jSONObject2.put("right", AbstractC3727g4.a(i3));
            jSONObject2.put("bottom", AbstractC3727g4.a(i4));
            jSONObject2.put("state", i5);
            Unit unit = Unit.INSTANCE;
            jSONObject.put("layout", jSONObject2);
            ej.b(jSONObject);
        }
    }
}
