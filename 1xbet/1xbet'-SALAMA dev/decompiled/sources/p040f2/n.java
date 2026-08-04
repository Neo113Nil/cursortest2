package p040f2;

import R4.c;
import U1.a;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import p146u2.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12898b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g2.c f12902f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12905z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f12901e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f12900d = t.m(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12899c = new a();

    public n(g2.c cVar, c cVar2, r rVar) {
        this.f12902f = cVar;
        this.f12898b = cVar2;
        this.f12897a = rVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f12905z) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        l lVar = (l) message.obj;
        long j = lVar.f12890a;
        TreeMap treeMap = this.f12901e;
        long j3 = lVar.f12891b;
        Long l7 = (Long) treeMap.get(Long.valueOf(j3));
        if (l7 == null || l7.longValue() > j) {
            treeMap.put(Long.valueOf(j3), Long.valueOf(j));
        }
        return true;
    }
}
