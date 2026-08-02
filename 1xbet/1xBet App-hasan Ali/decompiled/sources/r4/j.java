package r4;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f19144a = new i();

    public static c a(int i, int i5, a aVar) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        int i6 = i5 & 2;
        a aVar2 = a.f19106k;
        if (i6 != 0) {
            aVar = aVar2;
        }
        if (i == -2) {
            if (aVar != aVar2) {
                return new m(1, aVar);
            }
            g.i.getClass();
            return new c(f.f19142b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == aVar2 ? new c(i) : new m(i, aVar) : new c(Integer.MAX_VALUE) : aVar == aVar2 ? new c(0) : new m(1, aVar);
        }
        if (aVar == aVar2) {
            return new m(1, a.f19107l);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
