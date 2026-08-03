package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0217a3 implements io.appmetrica.analytics.impl.InterfaceC0243b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5453a;

    public C0217a3(int i2) {
        this.f5453a = i2;
    }

    public static io.appmetrica.analytics.impl.InterfaceC0243b3 a(io.appmetrica.analytics.impl.InterfaceC0243b3... interfaceC0243b3Arr) {
        return new io.appmetrica.analytics.impl.C0217a3(b(interfaceC0243b3Arr));
    }

    public static int b(io.appmetrica.analytics.impl.InterfaceC0243b3... interfaceC0243b3Arr) {
        int i2 = 0;
        for (io.appmetrica.analytics.impl.InterfaceC0243b3 interfaceC0243b3 : interfaceC0243b3Arr) {
            if (interfaceC0243b3 != null) {
                i2 = interfaceC0243b3.getBytesTruncated() + i2;
            }
        }
        return i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0243b3
    public final int getBytesTruncated() {
        return this.f5453a;
    }

    public java.lang.String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f5453a + '}';
    }
}
