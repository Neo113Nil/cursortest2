package V;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1602a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1603b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1604c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1605d;

    public Bundle a(String str) {
        if (!this.f1603b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1605d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1605d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1605d;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1605d = null;
        return bundle2;
    }
}
