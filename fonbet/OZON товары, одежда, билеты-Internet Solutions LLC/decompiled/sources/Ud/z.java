package Ud;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends id.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f27622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Object obj, A a11) {
        super(obj);
        this.f27622a = a11;
    }

    @Override // id.c
    protected final boolean beforeChange(kotlin.reflect.m<?> property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.f27622a.j0()) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
