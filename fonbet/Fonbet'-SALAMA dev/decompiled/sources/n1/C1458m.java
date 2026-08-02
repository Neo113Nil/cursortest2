package n1;

import androidx.work.impl.WorkDatabase;
import c5.C0820a;
import e1.C0995b;
import w1.C1759x1;

/* renamed from: n1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458m {

    /* renamed from: a, reason: collision with root package name */
    public final C1759x1 f15331a;

    /* renamed from: b, reason: collision with root package name */
    public final C0995b f15332b;

    /* renamed from: c, reason: collision with root package name */
    public final C0820a f15333c;

    static {
        d1.n.g("WMFgUpdater");
    }

    public C1458m(WorkDatabase workDatabase, C0995b c0995b, C1759x1 c1759x1) {
        this.f15332b = c0995b;
        this.f15331a = c1759x1;
        this.f15333c = workDatabase.n();
    }
}
