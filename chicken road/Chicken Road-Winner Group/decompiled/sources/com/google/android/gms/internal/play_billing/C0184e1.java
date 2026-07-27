package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184e1 implements InterfaceC0231u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0184e1 f2745b = new C0184e1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2746a;

    public /* synthetic */ C0184e1(int i3) {
        this.f2746a = i3;
    }

    public static final C0225s1 c(Object obj, Object obj2) {
        C0225s1 c0225s1 = (C0225s1) obj;
        C0225s1 c0225s12 = (C0225s1) obj2;
        if (!c0225s12.isEmpty()) {
            if (!c0225s1.f2816a) {
                if (c0225s1.isEmpty()) {
                    c0225s1 = new C0225s1();
                } else {
                    C0225s1 c0225s13 = new C0225s1(c0225s1);
                    c0225s13.f2816a = true;
                    c0225s1 = c0225s13;
                }
            }
            c0225s1.b();
            if (!c0225s12.isEmpty()) {
                c0225s1.putAll(c0225s12);
            }
        }
        return c0225s1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0231u1
    public C1 a(Class cls) {
        switch (this.f2746a) {
            case 0:
                if (!AbstractC0190g1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1) AbstractC0190g1.h(cls.asSubclass(AbstractC0190g1.class)).d(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0231u1
    public boolean b(Class cls) {
        switch (this.f2746a) {
            case 0:
                return AbstractC0190g1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
