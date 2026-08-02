package Q5;

import A5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final c f5845d = new c();

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        if (b7 != -127) {
            if (b7 != -126) {
                return super.f(b7, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            a aVar = new a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            aVar.f5843a = bool;
            return aVar;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        e eVar = new e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        eVar.f5848a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        eVar.f5849b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        eVar.f5850c = map;
        return eVar;
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof e) {
            byteArrayOutputStream.write(129);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f5848a);
            arrayList.add(eVar.f5849b);
            arrayList.add(eVar.f5850c);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof a)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(130);
        a aVar = (a) obj;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(aVar.f5843a);
        k(byteArrayOutputStream, arrayList2);
    }
}
