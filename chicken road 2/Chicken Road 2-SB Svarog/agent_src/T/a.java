package T;

import F.AbstractActivityC0005f;
import F.t;
import android.app.Activity;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Activity f378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f379b;

    /* renamed from: c, reason: collision with root package name */
    public final t f380c;

    public a(int i2, AbstractActivityC0005f abstractActivityC0005f, t tVar) {
        this.f378a = abstractActivityC0005f;
        this.f379b = i2;
        this.f380c = tVar;
        tVar.f114c = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.f378a;
        int i2 = this.f379b;
        View findViewById = activity.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public final void b(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        Activity activity = this.f378a;
        int i3 = this.f379b;
        View findViewById = activity.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }
}
