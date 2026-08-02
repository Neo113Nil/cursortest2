package B4;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f755a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f756b;

    /* renamed from: c, reason: collision with root package name */
    public c f757c;

    /* renamed from: d, reason: collision with root package name */
    public long f758d;

    public a(String str, boolean z3) {
        l.f("name", str);
        this.f755a = str;
        this.f756b = z3;
        this.f758d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f755a;
    }
}
