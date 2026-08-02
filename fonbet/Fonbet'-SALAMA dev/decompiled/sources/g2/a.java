package g2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13100b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13101c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13102d;

    /* renamed from: e, reason: collision with root package name */
    public final List f13103e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13104f;

    public a(int i7, int i8, ArrayList arrayList, List list, List list2, List list3) {
        this.f13099a = i7;
        this.f13100b = i8;
        this.f13101c = Collections.unmodifiableList(arrayList);
        this.f13102d = Collections.unmodifiableList(list);
        this.f13103e = Collections.unmodifiableList(list2);
        this.f13104f = Collections.unmodifiableList(list3);
    }
}
