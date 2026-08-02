package E5;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f7498a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f7499b;

    /* renamed from: c, reason: collision with root package name */
    private final List<J5.i> f7500c;

    public h(List<J5.i> list) {
        this.f7500c = list;
        this.f7498a = new ArrayList(list.size());
        this.f7499b = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7498a.add(list.get(i11).b().h());
            this.f7499b.add(list.get(i11).c().h());
        }
    }

    public final ArrayList a() {
        return this.f7498a;
    }

    public final List<J5.i> b() {
        return this.f7500c;
    }

    public final ArrayList c() {
        return this.f7499b;
    }
}
