package k0;

import D0.m;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782b extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final C0782b f6063a = new C0782b();

    @Override // D0.m
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        Long l2 = null;
        if (b2 == Byte.MIN_VALUE) {
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            C0781a c0781a = new C0781a();
            c0781a.f6061a = (String) arrayList.get(0);
            Object obj = arrayList.get(1);
            if (obj != null) {
                l2 = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            c0781a.f6062b = l2;
            return c0781a;
        }
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        C0783c c0783c = new C0783c();
        c0783c.f6064a = (String) arrayList2.get(0);
        c0783c.f6065b = (String) arrayList2.get(1);
        Object obj2 = arrayList2.get(2);
        if (obj2 != null) {
            l2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        c0783c.f6066c = l2;
        c0783c.f6067d = (Map) arrayList2.get(3);
        c0783c.f6068e = (Boolean) arrayList2.get(4);
        c0783c.f6069f = (Boolean) arrayList2.get(5);
        return c0783c;
    }

    @Override // D0.m
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C0781a) {
            byteArrayOutputStream.write(128);
            C0781a c0781a = (C0781a) obj;
            c0781a.getClass();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(c0781a.f6061a);
            arrayList.add(c0781a.f6062b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof C0783c)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(129);
        C0783c c0783c = (C0783c) obj;
        c0783c.getClass();
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(c0783c.f6064a);
        arrayList2.add(c0783c.f6065b);
        arrayList2.add(c0783c.f6066c);
        arrayList2.add(c0783c.f6067d);
        arrayList2.add(c0783c.f6068e);
        arrayList2.add(c0783c.f6069f);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
