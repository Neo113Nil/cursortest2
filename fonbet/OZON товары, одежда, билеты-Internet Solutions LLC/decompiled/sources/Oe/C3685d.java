package Oe;

import Le.InterfaceC3583a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3685d<E> extends AbstractC3693l<Object, List<Object>, ArrayList<Object>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3684c f20285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3685d(@NotNull InterfaceC3583a<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        Me.f elementDesc = element.b();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f20285b = new C3684c(elementDesc);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return this.f20285b;
    }

    @Override // Oe.AbstractC3682a
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
