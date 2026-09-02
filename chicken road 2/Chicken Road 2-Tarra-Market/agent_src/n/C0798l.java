package n;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0798l extends C0797k {
    public C0798l(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // n.C0802p
    public r a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f6159c.consumeDisplayCutout();
        return r.a(null, consumeDisplayCutout);
    }

    @Override // n.C0802p
    public C0788b e() {
        DisplayCutout displayCutout;
        displayCutout = this.f6159c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0788b(displayCutout);
    }

    @Override // n.AbstractC0796j, n.C0802p
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798l)) {
            return false;
        }
        C0798l c0798l = (C0798l) obj;
        return Objects.equals(this.f6159c, c0798l.f6159c) && Objects.equals(this.f6163g, c0798l.f6163g);
    }

    @Override // n.C0802p
    public int hashCode() {
        return this.f6159c.hashCode();
    }
}
