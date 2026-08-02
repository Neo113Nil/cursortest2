package w1;

import java.util.HashMap;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673a extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f17629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17632f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17633x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17634y;

    public C1673a(String str, int i7, HashMap hashMap, boolean z4, boolean z7, String str2, long j, long j3) {
        this.f17627a = str;
        this.f17628b = i7;
        this.f17629c = hashMap;
        this.f17630d = z4;
        this.f17631e = z7;
        this.f17632f = str2;
        this.f17633x = j;
        this.f17634y = j3;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        Y1.c(this.f17627a, this.f17628b, this.f17629c, this.f17630d, this.f17631e, this.f17632f, this.f17633x, this.f17634y);
        if (this.f17629c.isEmpty()) {
            if (!this.f17630d) {
                synchronized (AbstractC1706i0.class) {
                }
                return;
            } else if (this.f17631e) {
                synchronized (AbstractC1706i0.class) {
                }
                return;
            } else {
                synchronized (AbstractC1706i0.class) {
                }
                return;
            }
        }
        if (!this.f17630d) {
            synchronized (AbstractC1706i0.class) {
            }
        } else if (this.f17631e) {
            synchronized (AbstractC1706i0.class) {
            }
        }
    }
}
