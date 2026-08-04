package C1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements InterfaceC0106l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0104j f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0104j f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0104j f1559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0104j f1560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f1561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f1562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1563h;

    public w() {
        ByteBuffer byteBuffer = InterfaceC0106l.f1502a;
        this.f1561f = byteBuffer;
        this.f1562g = byteBuffer;
        C0104j c0104j = C0104j.f1497e;
        this.f1559d = c0104j;
        this.f1560e = c0104j;
        this.f1557b = c0104j;
        this.f1558c = c0104j;
    }

    @Override // C1.InterfaceC0106l
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f1562g;
        this.f1562g = InterfaceC0106l.f1502a;
        return byteBuffer;
    }

    @Override // C1.InterfaceC0106l
    public final C0104j b(C0104j c0104j) {
        this.f1559d = c0104j;
        this.f1560e = f(c0104j);
        return isActive() ? this.f1560e : C0104j.f1497e;
    }

    @Override // C1.InterfaceC0106l
    public final void d() {
        this.f1563h = true;
        h();
    }

    @Override // C1.InterfaceC0106l
    public boolean e() {
        return this.f1563h && this.f1562g == InterfaceC0106l.f1502a;
    }

    public abstract C0104j f(C0104j c0104j);

    @Override // C1.InterfaceC0106l
    public final void flush() {
        this.f1562g = InterfaceC0106l.f1502a;
        this.f1563h = false;
        this.f1557b = this.f1559d;
        this.f1558c = this.f1560e;
        g();
    }

    @Override // C1.InterfaceC0106l
    public boolean isActive() {
        return this.f1560e != C0104j.f1497e;
    }

    public final ByteBuffer j(int i7) {
        if (this.f1561f.capacity() < i7) {
            this.f1561f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f1561f.clear();
        }
        ByteBuffer byteBuffer = this.f1561f;
        this.f1562g = byteBuffer;
        return byteBuffer;
    }

    @Override // C1.InterfaceC0106l
    public final void reset() {
        flush();
        this.f1561f = InterfaceC0106l.f1502a;
        C0104j c0104j = C0104j.f1497e;
        this.f1559d = c0104j;
        this.f1560e = c0104j;
        this.f1557b = c0104j;
        this.f1558c = c0104j;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
