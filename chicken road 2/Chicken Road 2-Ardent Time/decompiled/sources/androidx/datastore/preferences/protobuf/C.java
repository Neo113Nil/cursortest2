package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class C {
    public static void a(long j2, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC0066b abstractC0066b = (androidx.datastore.preferences.protobuf.AbstractC0066b) ((androidx.datastore.preferences.protobuf.InterfaceC0087x) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj));
        if (abstractC0066b.f2285a) {
            abstractC0066b.f2285a = false;
        }
    }

    public static androidx.datastore.preferences.protobuf.InterfaceC0087x b(long j2, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x = (androidx.datastore.preferences.protobuf.InterfaceC0087x) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj);
        if (((androidx.datastore.preferences.protobuf.AbstractC0066b) interfaceC0087x).f2285a) {
            return interfaceC0087x;
        }
        androidx.datastore.preferences.protobuf.U u2 = (androidx.datastore.preferences.protobuf.U) interfaceC0087x;
        int i2 = u2.f2264c;
        androidx.datastore.preferences.protobuf.U c2 = u2.c(i2 == 0 ? 10 : i2 * 2);
        androidx.datastore.preferences.protobuf.j0.o(obj, j2, c2);
        return c2;
    }
}
