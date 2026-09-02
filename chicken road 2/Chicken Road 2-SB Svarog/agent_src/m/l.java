package m;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends k {
    public l(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
    }

    @Override // m.p
    public r a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f869c.consumeDisplayCutout();
        return r.a(null, consumeDisplayCutout);
    }

    @Override // m.p
    public b e() {
        DisplayCutout displayCutout;
        displayCutout = this.f869c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new b(displayCutout);
    }

    @Override // m.j, m.p
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f869c, lVar.f869c) && Objects.equals(this.f873g, lVar.f873g);
    }

    @Override // m.p
    public int hashCode() {
        return this.f869c.hashCode();
    }
}
