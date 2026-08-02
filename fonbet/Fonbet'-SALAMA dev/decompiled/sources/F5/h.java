package F5;

import A5.x;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final h f2767d = new h();

    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        if (b7 == Byte.MIN_VALUE) {
            return i.a((ArrayList) e(byteBuffer));
        }
        if (b7 != -127) {
            return super.f(b7, byteBuffer);
        }
        ArrayList arrayList = (ArrayList) e(byteBuffer);
        j jVar = new j();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        jVar.f2781a = str;
        Object obj = arrayList.get(1);
        i a2 = obj == null ? null : i.a((ArrayList) obj);
        if (a2 == null) {
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }
        jVar.f2782b = a2;
        jVar.f2783c = (Boolean) arrayList.get(2);
        Map map = (Map) arrayList.get(3);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }
        jVar.f2784d = map;
        return jVar;
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof i) {
            byteArrayOutputStream.write(128);
            k(byteArrayOutputStream, ((i) obj).b());
            return;
        }
        if (!(obj instanceof j)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(129);
        j jVar = (j) obj;
        jVar.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(jVar.f2781a);
        i iVar = jVar.f2782b;
        arrayList.add(iVar == null ? null : iVar.b());
        arrayList.add(jVar.f2783c);
        arrayList.add(jVar.f2784d);
        k(byteArrayOutputStream, arrayList);
    }
}
