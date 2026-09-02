package H0;

/* loaded from: classes.dex */
public final class c extends a1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.c f613a = new H0.c();

    @Override // a1.n
    public final java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
        java.lang.Long l2 = null;
        if (b2 == Byte.MIN_VALUE) {
            java.util.ArrayList arrayList = (java.util.ArrayList) readValue(byteBuffer);
            H0.a aVar = new H0.a();
            aVar.f610a = (java.lang.String) arrayList.get(0);
            java.lang.Object obj = arrayList.get(1);
            if (obj != null) {
                l2 = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            aVar.f611b = l2;
            return aVar;
        }
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) readValue(byteBuffer);
        H0.d dVar = new H0.d();
        dVar.f614a = (java.lang.String) arrayList2.get(0);
        dVar.f615b = (java.lang.String) arrayList2.get(1);
        java.lang.Object obj2 = arrayList2.get(2);
        if (obj2 != null) {
            l2 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
        }
        dVar.f616c = l2;
        dVar.f617d = (java.util.Map) arrayList2.get(3);
        dVar.f618e = (java.lang.Boolean) arrayList2.get(4);
        dVar.f619f = (java.lang.Boolean) arrayList2.get(5);
        return dVar;
    }

    @Override // a1.n
    public final void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
        if (obj instanceof H0.a) {
            byteArrayOutputStream.write(128);
            H0.a aVar = (H0.a) obj;
            aVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(aVar.f610a);
            arrayList.add(aVar.f611b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof H0.d)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(129);
        H0.d dVar = (H0.d) obj;
        dVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(6);
        arrayList2.add(dVar.f614a);
        arrayList2.add(dVar.f615b);
        arrayList2.add(dVar.f616c);
        arrayList2.add(dVar.f617d);
        arrayList2.add(dVar.f618e);
        arrayList2.add(dVar.f619f);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
