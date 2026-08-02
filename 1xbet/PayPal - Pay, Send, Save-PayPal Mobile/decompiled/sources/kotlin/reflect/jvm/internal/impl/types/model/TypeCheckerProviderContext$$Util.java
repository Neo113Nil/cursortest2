package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes5.dex */
public /* synthetic */ class TypeCheckerProviderContext$$Util {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState newTypeCheckerState$default(kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext typeCheckerProviderContext, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return typeCheckerProviderContext.newTypeCheckerState(z, z2, z3);
    }
}
