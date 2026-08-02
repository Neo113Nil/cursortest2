package Bl0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2658t extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<C2664z> f3992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2658t(List list) {
        super(0);
        this.f3992b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List<C2664z> list = this.f3992b;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Y(((C2664z) it.next()).f4000a));
        }
        return "Getting first 10 from storage: " + arrayList;
    }
}
