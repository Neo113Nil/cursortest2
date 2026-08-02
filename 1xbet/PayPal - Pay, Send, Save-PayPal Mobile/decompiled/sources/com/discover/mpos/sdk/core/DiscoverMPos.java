package com.discover.mpos.sdk.core;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\n\u001a\u0004\u0018\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\f\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011"}, d2 = {"Lcom/discover/mpos/sdk/core/DiscoverMPos;", "", "<init>", "()V", "", "clear", "Lkotlin/Function1;", "Lcom/discover/mpos/sdk/core/initialization/MPosModule;", "", "predicate", "findModule", "(Lkotlin/jvm/functions/Function1;)Lcom/discover/mpos/sdk/core/initialization/MPosModule;", "", "modules", "init", "([Lcom/discover/mpos/sdk/core/initialization/MPosModule;)V", "", "Ljava/util/Set;", "Companion"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DiscoverMPos {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.DiscoverMPos.Companion INSTANCE = new com.discover.mpos.sdk.core.DiscoverMPos.Companion(0);
    private static final com.discover.mpos.sdk.core.debug.Debugger debugger = new com.discover.mpos.sdk.core.debug.Debugger(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private final java.util.Set<com.discover.mpos.sdk.core.initialization.MPosModule> modules = new java.util.LinkedHashSet();

    public final void init(com.discover.mpos.sdk.core.initialization.MPosModule... modules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modules, "");
        kotlin.collections.CollectionsKt.addAll(this.modules, modules);
        for (com.discover.mpos.sdk.core.initialization.MPosModule mPosModule : modules) {
            mPosModule.init();
        }
    }

    public final void clear() {
        this.modules.clear();
    }

    public final com.discover.mpos.sdk.core.initialization.MPosModule findModule(kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.core.initialization.MPosModule, java.lang.Boolean> predicate) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.util.Iterator<T> it = this.modules.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (predicate.invoke(obj).booleanValue()) {
                break;
            }
        }
        return (com.discover.mpos.sdk.core.initialization.MPosModule) obj;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/core/DiscoverMPos$Companion;", "", "<init>", "()V", "Lcom/discover/mpos/sdk/core/debug/Debugger;", "debugger", "Lcom/discover/mpos/sdk/core/debug/Debugger;", "getDebugger", "()Lcom/discover/mpos/sdk/core/debug/Debugger;"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }

        public final com.discover.mpos.sdk.core.debug.Debugger getDebugger() {
            return com.discover.mpos.sdk.core.DiscoverMPos.debugger;
        }
    }
}
