package X1;

import I1.AbstractActivityC0027d;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1632a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1633b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1634c;

    public a(int i3, String str, ArrayList arrayList) {
        this.f1632a = i3;
        this.f1634c = str;
        this.f1633b = arrayList;
    }

    public int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0027d abstractActivityC0027d = (AbstractActivityC0027d) this.f1633b;
        int i3 = this.f1632a;
        View findViewById = abstractActivityC0027d.findViewById(i3);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
    }

    public void b(int i3) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0027d abstractActivityC0027d = (AbstractActivityC0027d) this.f1633b;
        int i4 = this.f1632a;
        View findViewById = abstractActivityC0027d.findViewById(i4);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i3) {
            return;
        }
        findViewById.setContentSensitivity(i3);
        findViewById.invalidate();
    }
}
