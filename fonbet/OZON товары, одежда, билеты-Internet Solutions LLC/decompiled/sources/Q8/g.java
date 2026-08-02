package Q8;

import java.util.List;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final h f23031a;

    /* renamed from: b, reason: collision with root package name */
    private final e<b> f23032b;

    public g(h hVar, P8.a aVar, P8.b bVar) {
        a aVar2 = new a(aVar, bVar, new b());
        this.f23031a = hVar;
        this.f23032b = aVar2;
    }

    public final M8.g a(int i11) {
        List list = (List) M8.b.a().get(Integer.valueOf(i11));
        if (list == null || list.contains("001")) {
            return ((b) ((a) this.f23032b).a(this.f23031a.a(Integer.valueOf(i11)))).b(i11);
        }
        throw new IllegalArgumentException(i11 + " calling code belongs to a geo entity");
    }

    public final M8.g b(String str) {
        if (str.equals("001")) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        return ((b) ((a) this.f23032b).a(this.f23031a.a(str))).c(str);
    }
}
