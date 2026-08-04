package p061i2;

import A1.X;
import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f13920n = new m("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f13924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13926i;
    public final X j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f13927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f13928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f13929m;

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, X x4, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((l) list2.get(i7)).f13914a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f13921d = Collections.unmodifiableList(arrayList);
        this.f13922e = Collections.unmodifiableList(list2);
        this.f13923f = Collections.unmodifiableList(list3);
        this.f13924g = Collections.unmodifiableList(list4);
        this.f13925h = Collections.unmodifiableList(list5);
        this.f13926i = Collections.unmodifiableList(list6);
        this.j = x4;
        this.f13927k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f13928l = Collections.unmodifiableMap(map);
        this.f13929m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((k) list.get(i7)).f13911a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            for (int i9 = 0; i9 < list2.size(); i9++) {
                StreamKey streamKey = (StreamKey) list2.get(i9);
                if (streamKey.f10675b == i7 && streamKey.f10676c == i8) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p012b2.a
    public final Object a(List list) {
        return new m(this.f13930a, this.f13931b, c(this.f13922e, 0, list), Collections.emptyList(), c(this.f13924g, 1, list), c(this.f13925h, 2, list), Collections.emptyList(), this.j, this.f13927k, this.f13932c, this.f13928l, this.f13929m);
    }
}
