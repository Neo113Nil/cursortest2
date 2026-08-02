package io.objectbox.converter;

import io.objectbox.flatbuffers.a;
import io.objectbox.flatbuffers.e;
import io.objectbox.flatbuffers.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class StringMapConverter implements PropertyConverter<Map<String, String>, byte[]> {
    private static final AtomicReference<f> cachedBuilder = new AtomicReference<>();

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        f andSet = cachedBuilder.getAndSet(null);
        if (andSet == null) {
            andSet = new f(new a(512), 3);
        }
        ArrayList<f.b> arrayList = andSet.b;
        int size = arrayList.size();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Map keys or values must not be null");
            }
            andSet.l(entry.getKey(), entry.getValue());
        }
        andSet.c(size, null);
        ByteBuffer d = andSet.d();
        byte[] bArr = new byte[d.limit()];
        d.get(bArr);
        if (d.limit() <= 262144) {
            andSet.a.b = 0;
            arrayList.clear();
            andSet.c.clear();
            andSet.d.clear();
            cachedBuilder.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Map<String, String> convertToEntityProperty(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        e.C0151e f = e.c(new a(bArr, bArr.length)).f();
        int i = f.d;
        e.d c = f.c();
        e.j jVar = new e.j(f.a, f.b, f.c);
        HashMap hashMap = new HashMap((int) ((i / 0.75d) + 1.0d));
        for (int i2 = 0; i2 < i; i2++) {
            hashMap.put(c.a(i2).toString(), jVar.b(i2).g());
        }
        return hashMap;
    }
}
