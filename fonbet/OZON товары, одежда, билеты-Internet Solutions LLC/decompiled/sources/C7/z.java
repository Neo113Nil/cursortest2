package C7;

/* loaded from: classes9.dex */
final class z extends d {
    @Override // C7.d
    public final boolean a() {
        return false;
    }

    @Override // C7.d
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.b() == 0 && !dVar.a();
    }

    public final int hashCode() {
        return -721381028;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=0, allowAssetPackDeletion=false}";
    }
}
