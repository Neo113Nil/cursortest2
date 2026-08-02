package c;

import G1.C0145p;
import androidx.lifecycle.InterfaceC0491u;
import r0.AbstractC2346c;

/* renamed from: c.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515B extends AbstractC2346c {
    public final C0145p i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0491u f7301j;

    public C0515B(C0145p c0145p, InterfaceC0491u interfaceC0491u) {
        kotlin.jvm.internal.l.f("callback", c0145p);
        this.i = c0145p;
        this.f7301j = interfaceC0491u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515B)) {
            return false;
        }
        C0515B c0515b = (C0515B) obj;
        return kotlin.jvm.internal.l.a(this.i, c0515b.i) && kotlin.jvm.internal.l.a(this.f7301j, c0515b.f7301j);
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        InterfaceC0491u interfaceC0491u = this.f7301j;
        return hashCode + (interfaceC0491u == null ? 0 : interfaceC0491u.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.i + ", owner=" + this.f7301j + ')';
    }
}
