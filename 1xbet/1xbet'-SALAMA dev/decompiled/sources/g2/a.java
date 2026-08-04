package g2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13110f;

    public a(int i7, int i8, ArrayList arrayList, List list, List list2, List list3) {
        this.f13105a = i7;
        this.f13106b = i8;
        this.f13107c = Collections.unmodifiableList(arrayList);
        this.f13108d = Collections.unmodifiableList(list);
        this.f13109e = Collections.unmodifiableList(list2);
        this.f13110f = Collections.unmodifiableList(list3);
    }
}
