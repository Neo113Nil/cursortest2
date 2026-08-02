package r0;

import android.view.KeyEvent;
import kotlin.jvm.internal.l;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2345b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f19083a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2345b) {
            return l.a(this.f19083a, ((C2345b) obj).f19083a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19083a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f19083a + ')';
    }
}
