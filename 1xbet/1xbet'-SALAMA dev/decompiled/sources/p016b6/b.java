package p016b6;

import com.google.protobuf.C;
import com.google.protobuf.InterfaceC0868k0;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f10151d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0868k0 f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f10153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10154c;

    public b(C c3) {
        f.k(c3, "defaultInstance cannot be null");
        this.f10153b = c3;
        this.f10152a = (InterfaceC0868k0) c3.j(7);
        this.f10154c = -1;
    }
}
