package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class A {
    public static void a(long j, Object obj) {
        AbstractC0678b abstractC0678b = (AbstractC0678b) ((InterfaceC0697v) h0.f9196c.h(j, obj));
        if (abstractC0678b.f9165a) {
            abstractC0678b.f9165a = false;
        }
    }

    public static InterfaceC0697v b(long j, Object obj) {
        InterfaceC0697v interfaceC0697v = (InterfaceC0697v) h0.f9196c.h(j, obj);
        if (((AbstractC0678b) interfaceC0697v).f9165a) {
            return interfaceC0697v;
        }
        S s7 = (S) interfaceC0697v;
        int i7 = s7.f9141c;
        S t7 = s7.t(i7 == 0 ? 10 : i7 * 2);
        h0.o(obj, j, t7);
        return t7;
    }
}
