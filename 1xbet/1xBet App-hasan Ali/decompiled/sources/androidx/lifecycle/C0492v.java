package androidx.lifecycle;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492v {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0487p f7065a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0489s f7066b;

    public final void a(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        EnumC0487p a5 = enumC0486o.a();
        EnumC0487p enumC0487p = this.f7065a;
        kotlin.jvm.internal.l.f("state1", enumC0487p);
        if (a5.compareTo(enumC0487p) < 0) {
            enumC0487p = a5;
        }
        this.f7065a = enumC0487p;
        this.f7066b.h(interfaceC0491u, enumC0486o);
        this.f7065a = a5;
    }
}
