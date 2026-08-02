package com.google.firebase.storage;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.k f12089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f12091d;

    public /* synthetic */ x(O1.k kVar, Object obj, r rVar, int i7) {
        this.f12088a = i7;
        this.f12089b = kVar;
        this.f12090c = obj;
        this.f12091d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12088a) {
            case 0:
                ((y) this.f12089b.f4974e).a(this.f12090c, this.f12091d);
                break;
            default:
                ((y) this.f12089b.f4974e).a(this.f12090c, this.f12091d);
                break;
        }
    }
}
