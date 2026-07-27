package sg.bigo.ads.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Constructor;
import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* loaded from: classes3.dex */
public class AdActivity extends Activity {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public BaseAdActivityImpl f12684a;

    public void a() {
    }

    public int b() {
        return 0;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.t();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.a(i, i2, intent);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.u();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        Throwable th;
        try {
            Constructor<?> declaredConstructor = Class.forName(getIntent().getStringExtra("impl_clazz")).getDeclaredConstructor(Activity.class);
            declaredConstructor.setAccessible(true);
            this.f12684a = (BaseAdActivityImpl) declaredConstructor.newInstance(this);
            a();
            super.onCreate(bundle);
        } catch (Throwable th2) {
            z = false;
            th = th2;
        }
        try {
            this.f12684a.b = b();
            this.f12684a.v();
        } catch (Throwable th3) {
            th = th3;
            z = true;
            getIntent().putExtra("create_error_flag", true);
            getIntent().putExtra("create_error_msg", Log.getStackTraceString(th));
            if (!z) {
                super.onCreate(bundle);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.w();
                this.f12684a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.x();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.y();
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        BaseAdActivityImpl baseAdActivityImpl;
        return super.onTouchEvent(motionEvent) || ((baseAdActivityImpl = this.f12684a) != null && baseAdActivityImpl.a(motionEvent));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            BaseAdActivityImpl baseAdActivityImpl = this.f12684a;
            if (baseAdActivityImpl != null) {
                baseAdActivityImpl.b(z);
            }
        } catch (Throwable unused) {
        }
    }
}
