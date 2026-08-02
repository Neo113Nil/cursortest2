package C1;

/* loaded from: classes.dex */
public final class v {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
