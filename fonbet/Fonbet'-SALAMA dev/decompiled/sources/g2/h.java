package g2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13145d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f13142a = str;
        this.f13143b = j;
        this.f13144c = Collections.unmodifiableList(arrayList);
        this.f13145d = Collections.unmodifiableList(list);
    }
}
