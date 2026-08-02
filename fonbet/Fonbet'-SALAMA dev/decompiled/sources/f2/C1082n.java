package f2;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import u2.r;
import v2.t;

/* renamed from: f2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082n implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final r f12891a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.c f12892b;

    /* renamed from: f, reason: collision with root package name */
    public g2.c f12896f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12897x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12898y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12899z;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f12895e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f12894d = t.m(this);

    /* renamed from: c, reason: collision with root package name */
    public final U1.a f12893c = new U1.a();

    public C1082n(g2.c cVar, R4.c cVar2, r rVar) {
        this.f12896f = cVar;
        this.f12892b = cVar2;
        this.f12891a = rVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f12899z) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C1080l c1080l = (C1080l) message.obj;
        long j = c1080l.f12884a;
        TreeMap treeMap = this.f12895e;
        long j3 = c1080l.f12885b;
        Long l7 = (Long) treeMap.get(Long.valueOf(j3));
        if (l7 == null) {
            treeMap.put(Long.valueOf(j3), Long.valueOf(j));
        } else if (l7.longValue() > j) {
            treeMap.put(Long.valueOf(j3), Long.valueOf(j));
        }
        return true;
    }
}
