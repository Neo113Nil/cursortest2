package y1;

/* loaded from: classes.dex */
public final class c implements x1.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8495c;

    /* renamed from: d, reason: collision with root package name */
    public final s1.p f8496d;

    public c(java.lang.String input, int i2, int i3, s1.p pVar) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f8493a = input;
        this.f8494b = i2;
        this.f8495c = i3;
        this.f8496d = pVar;
    }

    @Override // x1.c
    public final java.util.Iterator iterator() {
        return new y1.b(this);
    }
}
