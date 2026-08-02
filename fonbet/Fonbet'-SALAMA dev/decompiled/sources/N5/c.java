package N5;

import A5.x;
import B3.i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends x {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4784d = new HashMap();

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        ArrayList arrayList;
        switch (b7) {
            case -127:
                return new b((Boolean) f(byteBuffer.get(), byteBuffer), (a) f(byteBuffer.get(), byteBuffer));
            case -126:
                Integer num = (Integer) f(byteBuffer.get(), byteBuffer);
                Object f7 = f(byteBuffer.get(), byteBuffer);
                if (f7 == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (f7 instanceof List) {
                        for (Object obj : (List) f7) {
                            if (obj instanceof String) {
                                arrayList2.add((String) obj);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                return new a(num, arrayList);
            case -125:
                return this.f4784d.get((Integer) f(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num2 = (Integer) f(byteBuffer.get(), byteBuffer);
                return new i(num2.intValue(), (String) f(byteBuffer.get(), byteBuffer));
            default:
                return super.f(b7, byteBuffer);
        }
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            k(byteArrayOutputStream, bVar.f4782a);
            k(byteArrayOutputStream, bVar.f4783b);
            return;
        }
        if (obj instanceof a) {
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            k(byteArrayOutputStream, aVar.f4780a);
            k(byteArrayOutputStream, aVar.f4781b);
            return;
        }
        if (obj instanceof B3.c) {
            byteArrayOutputStream.write(-125);
            k(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            if (!(obj instanceof i)) {
                super.k(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            i iVar = (i) obj;
            k(byteArrayOutputStream, Integer.valueOf(iVar.f1067a));
            k(byteArrayOutputStream, iVar.f1068b);
        }
    }
}
