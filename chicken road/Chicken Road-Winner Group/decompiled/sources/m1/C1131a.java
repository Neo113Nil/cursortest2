package m1;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131a implements InterfaceC1134d {

    /* renamed from: a, reason: collision with root package name */
    public final int f10096a;

    public C1131a(int i3) {
        this.f10096a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1134d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1134d)) {
            return false;
        }
        C1131a c1131a = (C1131a) ((InterfaceC1134d) obj);
        if (this.f10096a != c1131a.f10096a) {
            return false;
        }
        Object obj2 = EnumC1133c.f10098a;
        c1131a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f10096a) + (EnumC1133c.f10098a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f10096a + "intEncoding=" + EnumC1133c.f10098a + ')';
    }
}
