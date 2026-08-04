package p096n1;

import androidx.work.impl.WorkDatabase;
import p019c5.a;
import p023d1.n;
import p031e1.b;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1050x1 f15337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15339c;

    static {
        n.g("WMFgUpdater");
    }

    public m(WorkDatabase workDatabase, b bVar, C1050x1 c1050x1) {
        this.f15338b = bVar;
        this.f15337a = c1050x1;
        this.f15339c = workDatabase.n();
    }
}
