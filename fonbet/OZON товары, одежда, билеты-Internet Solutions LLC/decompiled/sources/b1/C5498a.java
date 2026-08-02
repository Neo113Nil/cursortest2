package b1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5498a extends AbstractC7737t implements Function2<InterfaceC5518u, Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f55421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5498a(Function2<? super InterfaceC5518u, Object, ? extends List<Object>> function2) {
        super(2);
        this.f55421b = (AbstractC7737t) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5518u interfaceC5518u, Object obj) {
        InterfaceC5518u interfaceC5518u2 = interfaceC5518u;
        List list = (List) this.f55421b.invoke(interfaceC5518u2, obj);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj2 = list.get(i11);
            if (obj2 != null && !interfaceC5518u2.a(obj2)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        List list2 = list;
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
