package p155w1;

import java.util.HashMap;

/* JADX INFO: renamed from: w1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964a extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f17635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17638f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17640y;

    public C0964a(String str, int i7, HashMap map, boolean z4, boolean z7, String str2, long j, long j3) {
        this.f17633a = str;
        this.f17634b = i7;
        this.f17635c = map;
        this.f17636d = z4;
        this.f17637e = z7;
        this.f17638f = str2;
        this.f17639x = j;
        this.f17640y = j3;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        Y1.c(this.f17633a, this.f17634b, this.f17635c, this.f17636d, this.f17637e, this.f17638f, this.f17639x, this.f17640y);
        if (this.f17635c.isEmpty()) {
            if (!this.f17636d) {
                synchronized (AbstractC0997i0.class) {
                }
                return;
            } else if (this.f17637e) {
                synchronized (AbstractC0997i0.class) {
                }
                return;
            } else {
                synchronized (AbstractC0997i0.class) {
                }
                return;
            }
        }
        if (!this.f17636d) {
            synchronized (AbstractC0997i0.class) {
            }
        } else if (this.f17637e) {
            synchronized (AbstractC0997i0.class) {
            }
        }
    }
}
