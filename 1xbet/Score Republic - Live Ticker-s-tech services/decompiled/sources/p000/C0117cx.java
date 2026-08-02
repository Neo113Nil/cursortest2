package p000;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: cx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0117cx implements xg0 {

    /* JADX INFO: renamed from: b */
    public final Object f1477b;

    /* JADX INFO: renamed from: c */
    public final int f1478c;

    /* JADX INFO: renamed from: d */
    public final int f1479d;

    /* JADX INFO: renamed from: e */
    public final Class f1480e;

    /* JADX INFO: renamed from: f */
    public final Class f1481f;

    /* JADX INFO: renamed from: g */
    public final xg0 f1482g;

    /* JADX INFO: renamed from: h */
    public final Map f1483h;

    /* JADX INFO: renamed from: i */
    public final uu0 f1484i;

    /* JADX INFO: renamed from: j */
    public int f1485j;

    public C0117cx(Object obj, xg0 xg0Var, int i, int i2, Map map, Class cls, Class cls2, uu0 uu0Var) {
        o80.m3647h(obj, "Argument must not be null");
        this.f1477b = obj;
        this.f1482g = xg0Var;
        this.f1478c = i;
        this.f1479d = i2;
        o80.m3647h(map, "Argument must not be null");
        this.f1483h = map;
        o80.m3647h(cls, "Resource class must not be null");
        this.f1480e = cls;
        o80.m3647h(cls2, "Transcode class must not be null");
        this.f1481f = cls2;
        o80.m3647h(uu0Var, "Argument must not be null");
        this.f1484i = uu0Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof C0117cx) {
            C0117cx c0117cx = (C0117cx) obj;
            if (this.f1477b.equals(c0117cx.f1477b) && this.f1482g.equals(c0117cx.f1482g) && this.f1479d == c0117cx.f1479d && this.f1478c == c0117cx.f1478c && this.f1483h.equals(c0117cx.f1483h) && this.f1480e.equals(c0117cx.f1480e) && this.f1481f.equals(c0117cx.f1481f) && this.f1484i.equals(c0117cx.f1484i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        if (this.f1485j == 0) {
            int iHashCode = this.f1477b.hashCode();
            this.f1485j = iHashCode;
            int iHashCode2 = ((((this.f1482g.hashCode() + (iHashCode * 31)) * 31) + this.f1478c) * 31) + this.f1479d;
            this.f1485j = iHashCode2;
            int iHashCode3 = this.f1483h.hashCode() + (iHashCode2 * 31);
            this.f1485j = iHashCode3;
            int iHashCode4 = this.f1480e.hashCode() + (iHashCode3 * 31);
            this.f1485j = iHashCode4;
            int iHashCode5 = this.f1481f.hashCode() + (iHashCode4 * 31);
            this.f1485j = iHashCode5;
            this.f1485j = this.f1484i.f7909b.hashCode() + (iHashCode5 * 31);
        }
        return this.f1485j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f1477b + ", width=" + this.f1478c + ", height=" + this.f1479d + ", resourceClass=" + this.f1480e + ", transcodeClass=" + this.f1481f + ", signature=" + this.f1482g + ", hashCode=" + this.f1485j + ", transformations=" + this.f1483h + ", options=" + this.f1484i + '}';
    }
}
