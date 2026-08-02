package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import h5.RunnableC6807e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class v extends M1.b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f45523i = androidx.work.o.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final C f45524a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45525b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.g f45526c;

    /* renamed from: d, reason: collision with root package name */
    private final List<? extends androidx.work.x> f45527d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f45528e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f45529f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45530g;

    /* renamed from: h, reason: collision with root package name */
    private n f45531h;

    public v(@NonNull C c11, String str, @NonNull androidx.work.g gVar, @NonNull List list, int i11) {
        this.f45524a = c11;
        this.f45525b = str;
        this.f45526c = gVar;
        this.f45527d = list;
        this.f45528e = new ArrayList(list.size());
        this.f45529f = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            String a11 = ((androidx.work.x) list.get(i12)).a();
            this.f45528e.add(a11);
            this.f45529f.add(a11);
        }
    }

    @NonNull
    public static HashSet A(@NonNull v vVar) {
        HashSet hashSet = new HashSet();
        vVar.getClass();
        return hashSet;
    }

    @NonNull
    public final androidx.work.r t() {
        if (this.f45530g) {
            androidx.work.o.e().k(f45523i, "Already enqueued work ids (" + TextUtils.join(", ", this.f45528e) + ")");
        } else {
            RunnableC6807e runnableC6807e = new RunnableC6807e(this, new n());
            this.f45524a.p().a(runnableC6807e);
            this.f45531h = runnableC6807e.a();
        }
        return this.f45531h;
    }

    @NonNull
    public final androidx.work.g u() {
        return this.f45526c;
    }

    public final String v() {
        return this.f45525b;
    }

    @NonNull
    public final List<? extends androidx.work.x> w() {
        return this.f45527d;
    }

    @NonNull
    public final C x() {
        return this.f45524a;
    }

    public final boolean y() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f45528e);
        HashSet A11 = A(this);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (A11.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(this.f45528e);
        return false;
    }

    public final void z() {
        this.f45530g = true;
    }

    public v(@NonNull C c11, @NonNull List<? extends androidx.work.x> list) {
        this(c11, null, androidx.work.g.KEEP, list, 0);
    }

    public v(@NonNull C c11, String str, @NonNull androidx.work.g gVar, @NonNull List<? extends androidx.work.x> list) {
        this(c11, str, gVar, list, 0);
    }
}
