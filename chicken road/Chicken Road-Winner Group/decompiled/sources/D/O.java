package D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class O extends N {
    public O(V v3, WindowInsets windowInsets) {
        super(v3, windowInsets);
    }

    @Override // D.T
    public V a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f212c.consumeDisplayCutout();
        return V.a(consumeDisplayCutout, null);
    }

    @Override // D.T
    public C0004e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f212c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0004e(displayCutout);
    }

    @Override // D.M, D.T
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return Objects.equals(this.f212c, o3.f212c) && Objects.equals(this.f215g, o3.f215g);
    }

    @Override // D.T
    public int hashCode() {
        return this.f212c.hashCode();
    }
}
