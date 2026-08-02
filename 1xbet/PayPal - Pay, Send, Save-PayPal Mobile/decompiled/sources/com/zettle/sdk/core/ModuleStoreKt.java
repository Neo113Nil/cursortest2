package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/Module;", "T", "Lcom/zettle/sdk/core/Register;", "require", "(Lcom/zettle/sdk/core/Register;)Lcom/zettle/sdk/core/Module;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ModuleStoreKt {
    public static final /* synthetic */ <T extends com.zettle.sdk.core.Module> T require(com.zettle.sdk.core.Register register) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(register, "");
        com.zettle.sdk.core.ModuleStore moduleStore = register instanceof com.zettle.sdk.core.ModuleStore ? (com.zettle.sdk.core.ModuleStore) register : null;
        if (moduleStore != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            T t = (T) moduleStore.fetch(com.zettle.sdk.core.Module.class);
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (t instanceof com.zettle.sdk.core.Module) {
                return t;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No module found for: ");
            sb.append(com.zettle.sdk.core.Module.class);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        throw new java.lang.IllegalStateException("Register is not implemented correctly.");
    }
}
