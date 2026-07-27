package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0561i3 implements InterfaceC0586j3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7472a;

    public C0561i3(int i3) {
        this.f7472a = i3;
    }

    public static InterfaceC0586j3 a(InterfaceC0586j3... interfaceC0586j3Arr) {
        return new C0561i3(b(interfaceC0586j3Arr));
    }

    public static int b(InterfaceC0586j3... interfaceC0586j3Arr) {
        int i3 = 0;
        for (InterfaceC0586j3 interfaceC0586j3 : interfaceC0586j3Arr) {
            if (interfaceC0586j3 != null) {
                i3 = interfaceC0586j3.getBytesTruncated() + i3;
            }
        }
        return i3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0586j3
    public final int getBytesTruncated() {
        return this.f7472a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f7472a + '}';
    }
}
