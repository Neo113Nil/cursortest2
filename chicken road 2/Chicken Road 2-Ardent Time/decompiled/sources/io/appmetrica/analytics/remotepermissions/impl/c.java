package io.appmetrica.analytics.remotepermissions.impl;

/* loaded from: classes.dex */
public final class c implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.remotepermissions.impl.f fromModel(io.appmetrica.analytics.remotepermissions.impl.a aVar) {
        io.appmetrica.analytics.remotepermissions.impl.f fVar = new io.appmetrica.analytics.remotepermissions.impl.f();
        java.util.Set set = aVar.f7472a;
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(set));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.String) it.next()).getBytes(y1.a.f8486a));
        }
        java.lang.Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f7480a = (byte[][]) array;
        return fVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.remotepermissions.impl.a toModel(io.appmetrica.analytics.remotepermissions.impl.f fVar) {
        java.util.Set set;
        byte[][] bArr = fVar.f7480a;
        if (bArr != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new java.lang.String(bArr2, y1.a.f8486a));
            }
            set = i1.AbstractC0190i.b0(arrayList);
        } else {
            set = i1.C0201t.f3327a;
        }
        return new io.appmetrica.analytics.remotepermissions.impl.a(set);
    }
}
