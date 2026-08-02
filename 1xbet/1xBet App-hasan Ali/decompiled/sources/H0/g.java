package H0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2074a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2074a == ((g) obj).f2074a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2074a;
    }

    public final String toString() {
        int i = this.f2074a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
