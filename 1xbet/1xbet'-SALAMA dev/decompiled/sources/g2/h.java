package g2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13151d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f13148a = str;
        this.f13149b = j;
        this.f13150c = Collections.unmodifiableList(arrayList);
        this.f13151d = Collections.unmodifiableList(list);
    }
}
