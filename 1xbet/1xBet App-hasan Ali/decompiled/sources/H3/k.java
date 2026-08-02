package H3;

/* loaded from: classes.dex */
public final class k extends Number {

    /* renamed from: k, reason: collision with root package name */
    public final String f2332k;

    public k(String str) {
        this.f2332k = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f2332k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f2332k.equals(((k) obj).f2332k);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f2332k);
    }

    public final int hashCode() {
        return this.f2332k.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f2332k;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f2332k;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f2332k;
    }
}
