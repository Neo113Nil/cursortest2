package p000;

import java.util.Objects;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0114cu {

    /* JADX INFO: renamed from: a */
    public final String f1453a;

    /* JADX INFO: renamed from: b */
    public final int f1454b;

    /* JADX INFO: renamed from: c */
    public final int f1455c;

    public C0114cu(int i, int i2, String str) {
        this.f1453a = str;
        this.f1454b = i;
        this.f1455c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0114cu)) {
            return false;
        }
        C0114cu c0114cu = (C0114cu) obj;
        return this.f1453a.equals(c0114cu.f1453a) && this.f1454b == c0114cu.f1454b && this.f1455c == c0114cu.f1455c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f1454b);
        Integer numValueOf2 = Integer.valueOf(this.f1455c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f1453a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.f1453a.hashCode()) + " displayWidth=" + this.f1454b + " displayHeight=" + this.f1455c + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
