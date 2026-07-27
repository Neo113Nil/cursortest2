package W0;

import android.content.Context;
import b2.AbstractC0279e;
import e1.InterfaceC0410a;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3380a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0410a f3381b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0410a f3382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3383d;

    public b(Context context, InterfaceC0410a interfaceC0410a, InterfaceC0410a interfaceC0410a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f3380a = context;
        if (interfaceC0410a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f3381b = interfaceC0410a;
        if (interfaceC0410a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f3382c = interfaceC0410a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f3383d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3380a.equals(((b) cVar).f3380a)) {
            b bVar = (b) cVar;
            if (this.f3381b.equals(bVar.f3381b) && this.f3382c.equals(bVar.f3382c) && this.f3383d.equals(bVar.f3383d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3380a.hashCode() ^ 1000003) * 1000003) ^ this.f3381b.hashCode()) * 1000003) ^ this.f3382c.hashCode()) * 1000003) ^ this.f3383d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f3380a);
        sb.append(", wallClock=");
        sb.append(this.f3381b);
        sb.append(", monotonicClock=");
        sb.append(this.f3382c);
        sb.append(", backendName=");
        return AbstractC0279e.h(sb, this.f3383d, "}");
    }
}
