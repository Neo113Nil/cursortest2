package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static void a(long j, Object obj) {
        AbstractC0657b abstractC0657b = (AbstractC0657b) ((InterfaceC0676v) h0.f9196c.h(j, obj));
        if (abstractC0657b.f9165a) {
            abstractC0657b.f9165a = false;
        }
    }

    public static InterfaceC0676v b(long j, Object obj) {
        InterfaceC0676v interfaceC0676v = (InterfaceC0676v) h0.f9196c.h(j, obj);
        if (((AbstractC0657b) interfaceC0676v).f9165a) {
            return interfaceC0676v;
        }
        S s7 = (S) interfaceC0676v;
        int i7 = s7.f9141c;
        S sT = s7.t(i7 == 0 ? 10 : i7 * 2);
        h0.o(obj, j, sT);
        return sT;
    }
}
