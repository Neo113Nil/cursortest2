package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1130c0<E> extends AbstractC1170x<E, Set<? extends E>, LinkedHashSet<E>> {
    public final C1128b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130c0(kotlinx.serialization.b<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        kotlinx.serialization.descriptors.f elementDesc = eSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.b = new C1128b0(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object a() {
        return new LinkedHashSet();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final void c(int i, Object obj) {
        Intrinsics.checkNotNullParameter((LinkedHashSet) obj, "<this>");
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashSet((Collection) null);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object j(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w
    public final void k(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }
}
