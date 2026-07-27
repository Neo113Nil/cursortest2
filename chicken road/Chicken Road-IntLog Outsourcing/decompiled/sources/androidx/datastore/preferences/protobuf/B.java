package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class B {
    public static void a(long j2, Object obj) {
        AbstractC0207b abstractC0207b = (AbstractC0207b) ((InterfaceC0227w) i0.f4457b.h(j2, obj));
        if (abstractC0207b.f4419a) {
            abstractC0207b.f4419a = false;
        }
    }

    public static InterfaceC0227w b(long j2, Object obj) {
        InterfaceC0227w interfaceC0227w = (InterfaceC0227w) i0.f4457b.h(j2, obj);
        if (((AbstractC0207b) interfaceC0227w).f4419a) {
            return interfaceC0227w;
        }
        T t5 = (T) interfaceC0227w;
        int i2 = t5.f4397c;
        T d6 = t5.d(i2 == 0 ? 10 : i2 * 2);
        i0.o(j2, obj, d6);
        return d6;
    }
}
