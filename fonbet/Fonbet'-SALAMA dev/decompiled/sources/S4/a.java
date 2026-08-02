package S4;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f6318a;

    /* renamed from: b, reason: collision with root package name */
    public final K5.a f6319b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6320c;

    public a(K5.a aVar, Activity activity, Object obj) {
        this.f6318a = activity;
        this.f6319b = aVar;
        this.f6320c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.f6320c.equals(this.f6320c) && aVar.f6319b == this.f6319b && aVar.f6318a == this.f6318a;
    }

    public final int hashCode() {
        return this.f6320c.hashCode();
    }
}
