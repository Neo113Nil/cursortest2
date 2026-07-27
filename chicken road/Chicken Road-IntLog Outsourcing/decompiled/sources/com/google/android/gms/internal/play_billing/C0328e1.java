package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328e1 implements InterfaceC0375u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0328e1 f5176b = new C0328e1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5177a;

    public /* synthetic */ C0328e1(int i2) {
        this.f5177a = i2;
    }

    public static final C0369s1 c(Object obj, Object obj2) {
        C0369s1 c0369s1 = (C0369s1) obj;
        C0369s1 c0369s12 = (C0369s1) obj2;
        if (!c0369s12.isEmpty()) {
            if (!c0369s1.f5252a) {
                c0369s1 = c0369s1.c();
            }
            c0369s1.g();
            if (!c0369s12.isEmpty()) {
                c0369s1.putAll(c0369s12);
            }
        }
        return c0369s1;
    }

    public static void d(Object obj) {
        H1 h12 = ((AbstractC0334g1) obj).zzc;
        if (h12.f5060e) {
            h12.f5060e = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0375u1
    public C1 a(Class cls) {
        switch (this.f5177a) {
            case 0:
                if (!AbstractC0334g1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1) AbstractC0334g1.h(cls.asSubclass(AbstractC0334g1.class)).d(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0375u1
    public boolean b(Class cls) {
        switch (this.f5177a) {
            case 0:
                return AbstractC0334g1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
