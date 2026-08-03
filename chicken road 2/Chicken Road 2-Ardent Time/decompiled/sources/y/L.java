package y;

/* loaded from: classes.dex */
public class L extends y.K {
    public L(y.Q q2, android.view.WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // y.O
    public y.Q a() {
        android.view.WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f8436c.consumeDisplayCutout();
        return y.Q.a(consumeDisplayCutout, null);
    }

    @Override // y.O
    public y.C1017e e() {
        android.view.DisplayCutout displayCutout;
        displayCutout = this.f8436c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new y.C1017e(displayCutout);
    }

    @Override // y.J, y.O
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.L)) {
            return false;
        }
        y.L l2 = (y.L) obj;
        return java.util.Objects.equals(this.f8436c, l2.f8436c) && java.util.Objects.equals(this.f8440g, l2.f8440g);
    }

    @Override // y.O
    public int hashCode() {
        return this.f8436c.hashCode();
    }
}
