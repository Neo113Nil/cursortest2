package io.appmetrica.analytics.billing.impl;

import e2.AbstractC0294i;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f5149a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0347b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0346a c0346a) {
        d dVar = new d();
        List list = c0346a.f5147a;
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f5149a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f5158a = (c[]) array;
        dVar.f5159b = c0346a.f5148b;
        return dVar;
    }

    public C0347b(i iVar) {
        this.f5149a = iVar;
    }

    public /* synthetic */ C0347b(i iVar, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0346a toModel(d dVar) {
        c[] cVarArr = dVar.f5158a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f5149a.toModel(cVar));
        }
        return new C0346a(arrayList, dVar.f5159b);
    }
}
