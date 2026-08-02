package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: vk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0806vk {

    /* JADX INFO: renamed from: b */
    public static final C0806vk f8206b = new C0806vk(new nc1(16), wa0.f8471k);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f8207a = new ConcurrentHashMap();

    public C0806vk(InterfaceC0951zh... interfaceC0951zhArr) {
        for (InterfaceC0951zh interfaceC0951zh : interfaceC0951zhArr) {
            this.f8207a.put(interfaceC0951zh.mo3520v(), interfaceC0951zh);
        }
    }
}
