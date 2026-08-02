package b6;

import com.google.protobuf.C;
import com.google.protobuf.InterfaceC0912k0;
import p3.f;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0790b {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f10151d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0912k0 f10152a;

    /* renamed from: b, reason: collision with root package name */
    public final C f10153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10154c;

    public C0790b(C c3) {
        f.k(c3, "defaultInstance cannot be null");
        this.f10153b = c3;
        this.f10152a = (InterfaceC0912k0) c3.j(7);
        this.f10154c = -1;
    }
}
