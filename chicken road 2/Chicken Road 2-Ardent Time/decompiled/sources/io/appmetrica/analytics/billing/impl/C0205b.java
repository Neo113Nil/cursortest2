package io.appmetrica.analytics.billing.impl;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205b implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.i f3451a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0205b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.d fromModel(io.appmetrica.analytics.billing.impl.C0204a c0204a) {
        io.appmetrica.analytics.billing.impl.d dVar = new io.appmetrica.analytics.billing.impl.d();
        java.util.List list = c0204a.f3449a;
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f3451a.fromModel((io.appmetrica.analytics.billinginterface.internal.BillingInfo) it.next()));
        }
        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.billing.impl.c[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f3462a = (io.appmetrica.analytics.billing.impl.c[]) array;
        dVar.f3463b = c0204a.f3450b;
        return dVar;
    }

    public C0205b(io.appmetrica.analytics.billing.impl.i iVar) {
        this.f3451a = iVar;
    }

    public /* synthetic */ C0205b(io.appmetrica.analytics.billing.impl.i iVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.billing.impl.i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.C0204a toModel(io.appmetrica.analytics.billing.impl.d dVar) {
        io.appmetrica.analytics.billing.impl.c[] cVarArr = dVar.f3462a;
        java.util.ArrayList arrayList = new java.util.ArrayList(cVarArr.length);
        for (io.appmetrica.analytics.billing.impl.c cVar : cVarArr) {
            arrayList.add(this.f3451a.toModel(cVar));
        }
        return new io.appmetrica.analytics.billing.impl.C0204a(arrayList, dVar.f3463b);
    }
}
