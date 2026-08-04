package p155w1;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: w1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0980e extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Throwable f17694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HashMap f17695f;

    public C0980e(String str, long j, String str2, String str3, Throwable th, HashMap map) {
        this.f17690a = str;
        this.f17691b = j;
        this.f17692c = str2;
        this.f17693d = str3;
        this.f17694e = th;
        this.f17695f = map;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        C1036t c1036t = H2.a().f17408f;
        String str = this.f17690a;
        long j = this.f17691b;
        String str2 = this.f17692c;
        String str3 = this.f17693d;
        Throwable th = this.f17694e;
        HashMap map = this.f17695f;
        c1036t.getClass();
        c1036t.h(new C1033s(str, j, str2, str3, th, null, map, Collections.emptyList()));
        if (this.f17695f.isEmpty()) {
            synchronized (AbstractC0997i0.class) {
            }
        }
    }
}
