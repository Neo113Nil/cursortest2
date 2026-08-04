package U5;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: U5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0445l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0445l f6533b = new C0445l(new C0443j(2), C0443j.f6510b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6534a = new ConcurrentHashMap();

    public C0445l(InterfaceC0444k... interfaceC0444kArr) {
        for (InterfaceC0444k interfaceC0444k : interfaceC0444kArr) {
            this.f6534a.put(interfaceC0444k.d(), interfaceC0444k);
        }
    }
}
