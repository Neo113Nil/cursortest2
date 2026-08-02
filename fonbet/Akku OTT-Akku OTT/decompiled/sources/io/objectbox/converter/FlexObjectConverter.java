package io.objectbox.converter;

import io.objectbox.flatbuffers.a;
import io.objectbox.flatbuffers.e;
import io.objectbox.flatbuffers.f;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class FlexObjectConverter implements PropertyConverter<Object, byte[]> {
    private static final AtomicReference<f> cachedBuilder = new AtomicReference<>();

    private void addMap(f fVar, String str, Map<Object, Object> map) {
        int size = fVar.b.size();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException("Map keys must not be null");
            }
            checkMapKeyType(key);
            String obj = key.toString();
            if (value == null) {
                fVar.b.add(new f.b(fVar.k(obj), 0, 0, 0L));
            } else if (value instanceof Map) {
                addMap(fVar, obj, (Map) value);
            } else if (value instanceof List) {
                addVector(fVar, obj, (List) value);
            } else if (value instanceof String) {
                fVar.l(obj, (String) value);
            } else if (value instanceof Boolean) {
                fVar.f(obj, ((Boolean) value).booleanValue());
            } else if (value instanceof Byte) {
                fVar.j(obj, ((Byte) value).intValue());
            } else if (value instanceof Short) {
                fVar.j(obj, ((Short) value).intValue());
            } else if (value instanceof Integer) {
                fVar.j(obj, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                fVar.j(obj, ((Long) value).longValue());
            } else if (value instanceof Float) {
                fVar.h(obj, ((Float) value).floatValue());
            } else if (value instanceof Double) {
                fVar.g(obj, ((Double) value).doubleValue());
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException("Map values of this type are not supported: ".concat(value.getClass().getSimpleName()));
                }
                fVar.e(obj, (byte[]) value);
            }
        }
        fVar.c(size, str);
    }

    private void addValue(f fVar, Object obj) {
        if (obj instanceof Map) {
            addMap(fVar, null, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            addVector(fVar, null, (List) obj);
            return;
        }
        if (obj instanceof String) {
            fVar.l(null, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            fVar.f(null, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            fVar.i(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            fVar.i(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Integer) {
            fVar.i(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            fVar.j(null, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            fVar.h(null, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            fVar.g(null, ((Double) obj).doubleValue());
        } else {
            if (!(obj instanceof byte[])) {
                throw new IllegalArgumentException("Values of this type are not supported: ".concat(obj.getClass().getSimpleName()));
            }
            fVar.e(null, (byte[]) obj);
        }
    }

    private void addVector(f fVar, String str, List<Object> list) {
        ArrayList<f.b> arrayList = fVar.b;
        ArrayList<f.b> arrayList2 = fVar.b;
        int size = arrayList.size();
        for (Object obj : list) {
            if (obj == null) {
                arrayList2.add(new f.b(fVar.k(null), 0, 0, 0L));
            } else if (obj instanceof Map) {
                addMap(fVar, null, (Map) obj);
            } else if (obj instanceof List) {
                addVector(fVar, null, (List) obj);
            } else if (obj instanceof String) {
                fVar.l(null, (String) obj);
            } else if (obj instanceof Boolean) {
                fVar.f(null, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                fVar.i(((Byte) obj).intValue());
            } else if (obj instanceof Short) {
                fVar.i(((Short) obj).intValue());
            } else if (obj instanceof Integer) {
                fVar.i(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                fVar.j(null, ((Long) obj).longValue());
            } else if (obj instanceof Float) {
                fVar.h(null, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                fVar.g(null, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw new IllegalArgumentException("List values of this type are not supported: ".concat(obj.getClass().getSimpleName()));
                }
                fVar.e(null, (byte[]) obj);
            }
        }
        f.b b = fVar.b(fVar.k(str), size, arrayList2.size() - size, null);
        while (arrayList2.size() > size) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        arrayList2.add(b);
    }

    private List<Object> buildList(e.j jVar) {
        int i = jVar.d;
        ArrayList arrayList = new ArrayList(i);
        Boolean bool = null;
        for (int i2 = 0; i2 < i; i2++) {
            e.g b = jVar.b(i2);
            int i3 = b.e;
            if (i3 == 0) {
                arrayList.add(null);
            } else if (i3 == 9) {
                arrayList.add(buildMap(b.f()));
            } else if (b.j()) {
                arrayList.add(buildList(b.i()));
            } else {
                int i4 = b.e;
                if (i4 == 5) {
                    arrayList.add(b.g());
                } else if (i4 == 26) {
                    arrayList.add(Boolean.valueOf(b.b()));
                } else if (i4 == 1 || i4 == 6) {
                    if (bool == null) {
                        bool = Boolean.valueOf(shouldRestoreAsLong(b));
                    }
                    if (bool.booleanValue()) {
                        arrayList.add(Long.valueOf(b.e()));
                    } else {
                        arrayList.add(Integer.valueOf(b.d()));
                    }
                } else if (i4 == 3 || i4 == 8) {
                    arrayList.add(Double.valueOf(b.c()));
                } else {
                    if (i4 != 25) {
                        throw new IllegalArgumentException("List values of this type are not supported: ".concat(e.g.class.getSimpleName()));
                    }
                    arrayList.add(b.a().b());
                }
            }
        }
        return arrayList;
    }

    private Map<Object, Object> buildMap(e.C0151e c0151e) {
        int i = c0151e.d;
        e.d c = c0151e.c();
        e.j jVar = new e.j(c0151e.a, c0151e.b, c0151e.c);
        HashMap hashMap = new HashMap((int) ((i / 0.75d) + 1.0d));
        for (int i2 = 0; i2 < i; i2++) {
            Object convertToKey = convertToKey(c.a(i2).toString());
            e.g b = jVar.b(i2);
            int i3 = b.e;
            if (i3 == 0) {
                hashMap.put(convertToKey, null);
            } else if (i3 == 9) {
                hashMap.put(convertToKey, buildMap(b.f()));
            } else if (b.j()) {
                hashMap.put(convertToKey, buildList(b.i()));
            } else {
                int i4 = b.e;
                if (i4 == 5) {
                    hashMap.put(convertToKey, b.g());
                } else if (i4 == 26) {
                    hashMap.put(convertToKey, Boolean.valueOf(b.b()));
                } else if (i4 == 1 || i4 == 6) {
                    if (shouldRestoreAsLong(b)) {
                        hashMap.put(convertToKey, Long.valueOf(b.e()));
                    } else {
                        hashMap.put(convertToKey, Integer.valueOf(b.d()));
                    }
                } else if (i4 == 3 || i4 == 8) {
                    hashMap.put(convertToKey, Double.valueOf(b.c()));
                } else {
                    if (i4 != 25) {
                        throw new IllegalArgumentException("Map values of this type are not supported: ".concat(e.g.class.getSimpleName()));
                    }
                    hashMap.put(convertToKey, b.a().b());
                }
            }
        }
        return hashMap;
    }

    public void checkMapKeyType(Object obj) {
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("Map keys must be String");
        }
    }

    public Object convertToKey(String str) {
        return str;
    }

    public boolean shouldRestoreAsLong(e.g gVar) {
        try {
            Field declaredField = gVar.getClass().getDeclaredField("parentWidth");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(gVar)).intValue() == 8;
        } catch (Exception e) {
            throw new RuntimeException("FlexMapConverter could not determine FlexBuffers integer bit width.", e);
        }
    }

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicReference<f> atomicReference = cachedBuilder;
        f andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new f(new a(512), 3);
        }
        addValue(andSet, obj);
        ByteBuffer d = andSet.d();
        byte[] bArr = new byte[d.limit()];
        d.get(bArr);
        if (d.limit() <= 262144) {
            andSet.a.b = 0;
            andSet.b.clear();
            andSet.c.clear();
            andSet.d.clear();
            atomicReference.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Object convertToEntityProperty(byte[] bArr) {
        e.g c;
        int i;
        if (bArr == null || (i = (c = e.c(new a(bArr, bArr.length))).e) == 0) {
            return null;
        }
        if (i == 9) {
            return buildMap(c.f());
        }
        if (c.j()) {
            return buildList(c.i());
        }
        int i2 = c.e;
        if (i2 == 5) {
            return c.g();
        }
        if (i2 == 26) {
            return Boolean.valueOf(c.b());
        }
        if (i2 == 1 || i2 == 6) {
            return shouldRestoreAsLong(c) ? Long.valueOf(c.e()) : Integer.valueOf(c.d());
        }
        if (i2 == 3 || i2 == 8) {
            return Double.valueOf(c.c());
        }
        if (i2 == 25) {
            return c.a().b();
        }
        throw new IllegalArgumentException("FlexBuffers type is not supported: " + c.e);
    }
}
