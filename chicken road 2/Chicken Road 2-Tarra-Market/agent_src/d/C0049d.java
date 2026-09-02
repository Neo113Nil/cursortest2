package d;

import java.util.Iterator;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049d extends AbstractC0050e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0048c f881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f882b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0051f f883c;

    public C0049d(C0051f c0051f) {
        this.f883c = c0051f;
    }

    @Override // d.AbstractC0050e
    public final void a(C0048c c0048c) {
        C0048c c0048c2 = this.f881a;
        if (c0048c == c0048c2) {
            C0048c c0048c3 = c0048c2.f880d;
            this.f881a = c0048c3;
            this.f882b = c0048c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f882b) {
            return this.f883c.f884a != null;
        }
        C0048c c0048c = this.f881a;
        return (c0048c == null || c0048c.f879c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f882b) {
            this.f882b = false;
            this.f881a = this.f883c.f884a;
        } else {
            C0048c c0048c = this.f881a;
            this.f881a = c0048c != null ? c0048c.f879c : null;
        }
        return this.f881a;
    }
}
