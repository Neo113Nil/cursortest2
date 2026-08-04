package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9558c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f9559d;

    public A(B b7, C c3) {
        this.f9559d = b7;
        this.f9556a = c3;
    }

    public final void b(boolean z4) {
        if (z4 == this.f9557b) {
            return;
        }
        this.f9557b = z4;
        int i7 = z4 ? 1 : -1;
        B b7 = this.f9559d;
        int i8 = b7.f9563c;
        b7.f9563c = i7 + i8;
        if (!b7.f9564d) {
            b7.f9564d = true;
            while (true) {
                try {
                    int i9 = b7.f9563c;
                    if (i8 == i9) {
                        break;
                    }
                    boolean z7 = i8 == 0 && i9 > 0;
                    boolean z8 = i8 > 0 && i9 == 0;
                    if (z7) {
                        b7.e();
                    } else if (z8) {
                        b7.f();
                    }
                    i8 = i9;
                } catch (Throwable th) {
                    b7.f9564d = false;
                    throw th;
                }
            }
            b7.f9564d = false;
        }
        if (this.f9557b) {
            b7.c(this);
        }
    }

    public void c() {
    }

    public boolean d(InterfaceC0724t interfaceC0724t) {
        return false;
    }

    public abstract boolean e();
}
