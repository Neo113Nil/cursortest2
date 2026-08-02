package i2;

import A1.X;
import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: i2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1257m extends AbstractC1258n {

    /* renamed from: n, reason: collision with root package name */
    public static final C1257m f13914n = new C1257m("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f13915d;

    /* renamed from: e, reason: collision with root package name */
    public final List f13916e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13917f;

    /* renamed from: g, reason: collision with root package name */
    public final List f13918g;

    /* renamed from: h, reason: collision with root package name */
    public final List f13919h;

    /* renamed from: i, reason: collision with root package name */
    public final List f13920i;
    public final X j;

    /* renamed from: k, reason: collision with root package name */
    public final List f13921k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f13922l;

    /* renamed from: m, reason: collision with root package name */
    public final List f13923m;

    public C1257m(String str, List list, List list2, List list3, List list4, List list5, List list6, X x4, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((C1256l) list2.get(i7)).f13908a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f13915d = Collections.unmodifiableList(arrayList);
        this.f13916e = Collections.unmodifiableList(list2);
        this.f13917f = Collections.unmodifiableList(list3);
        this.f13918g = Collections.unmodifiableList(list4);
        this.f13919h = Collections.unmodifiableList(list5);
        this.f13920i = Collections.unmodifiableList(list6);
        this.j = x4;
        this.f13921k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f13922l = Collections.unmodifiableMap(map);
        this.f13923m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((C1255k) list.get(i7)).f13905a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i9);
                    if (streamKey.f10675b == i7 && streamKey.f10676c == i8) {
                        arrayList.add(obj);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    @Override // b2.InterfaceC0779a
    public final Object a(List list) {
        return new C1257m(this.f13924a, this.f13925b, c(this.f13916e, 0, list), Collections.emptyList(), c(this.f13918g, 1, list), c(this.f13919h, 2, list), Collections.emptyList(), this.j, this.f13921k, this.f13926c, this.f13922l, this.f13923m);
    }
}
