package L4;

import android.content.Context;
import e2.C1930k;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3099a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3101c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3102d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3103e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3104g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3105h;
    public final Object i;

    public n(boolean z3, boolean z5, z zVar, Long l5, Long l6, Long l7, Long l8, Map map) {
        kotlin.jvm.internal.l.f("extras", map);
        this.f3100b = z3;
        this.f3101c = z5;
        this.f3102d = zVar;
        this.f3103e = l5;
        this.f = l6;
        this.f3104g = l7;
        this.f3105h = l8;
        this.i = X3.z.T(map);
    }

    public String toString() {
        switch (this.f3099a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (this.f3100b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f3101c) {
                    arrayList.add("isDirectory");
                }
                Long l5 = (Long) this.f3103e;
                if (l5 != null) {
                    arrayList.add("byteCount=" + l5);
                }
                Long l6 = (Long) this.f;
                if (l6 != null) {
                    arrayList.add("createdAt=" + l6);
                }
                Long l7 = (Long) this.f3104g;
                if (l7 != null) {
                    arrayList.add("lastModifiedAt=" + l7);
                }
                Long l8 = (Long) this.f3105h;
                if (l8 != null) {
                    arrayList.add("lastAccessedAt=" + l8);
                }
                Map map = (Map) this.i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return X3.m.d0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(boolean z3, boolean z5, z zVar, Long l5, Long l6, Long l7, Long l8) {
        this(z3, z5, zVar, l5, l6, l7, l8, X3.w.f6091k);
    }

    public n(Context context, String str, X1.a aVar, C1930k c1930k, ArrayList arrayList, boolean z3, int i, Executor executor, Executor executor2, boolean z5, boolean z6) {
        this.f3102d = aVar;
        this.f3103e = context;
        this.f = str;
        this.f3104g = c1930k;
        this.f3105h = executor;
        this.i = executor2;
        this.f3100b = z5;
        this.f3101c = z6;
    }
}
