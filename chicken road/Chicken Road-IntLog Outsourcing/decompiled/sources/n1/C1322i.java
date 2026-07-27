package n1;

import android.os.Looper;

/* renamed from: n1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322i {

    /* renamed from: a, reason: collision with root package name */
    public final A.c f11387a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11388b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1321h f11389c;

    public C1322i(Looper looper, Object obj, String str) {
        this.f11387a = new A.c(looper);
        o1.u.h(obj, "Listener must not be null");
        this.f11388b = obj;
        o1.u.c(str);
        this.f11389c = new C1321h(obj, str);
    }
}
