package io.ktor.util.debug.plugins;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lio/ktor/util/debug/plugins/PluginsTrace;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "Lio/ktor/util/debug/plugins/PluginTraceElement;", "eventOrder", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/ktor/util/debug/plugins/PluginsTrace;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getEventOrder", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PluginsTrace extends kotlin.coroutines.AbstractCoroutineContextElement {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final io.ktor.util.debug.plugins.PluginsTrace.Companion INSTANCE = new io.ktor.util.debug.plugins.PluginsTrace.Companion(null);
    private final java.util.List<io.ktor.util.debug.plugins.PluginTraceElement> eventOrder;

    public /* synthetic */ PluginsTrace(java.util.ArrayList arrayList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : arrayList);
    }

    public final java.util.List<io.ktor.util.debug.plugins.PluginTraceElement> getEventOrder() {
        return this.eventOrder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginsTrace(java.util.List<io.ktor.util.debug.plugins.PluginTraceElement> list) {
        super(INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.eventOrder = list;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/util/debug/plugins/PluginsTrace$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/util/debug/plugins/PluginsTrace;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.debug.plugins.PluginsTrace$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<io.ktor.util.debug.plugins.PluginsTrace> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PluginsTrace(");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.eventOrder, null, null, null, 0, null, null, 63, null));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.eventOrder.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.ktor.util.debug.plugins.PluginsTrace) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventOrder, ((io.ktor.util.debug.plugins.PluginsTrace) other).eventOrder);
    }

    public final io.ktor.util.debug.plugins.PluginsTrace copy(java.util.List<io.ktor.util.debug.plugins.PluginTraceElement> eventOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventOrder, "");
        return new io.ktor.util.debug.plugins.PluginsTrace(eventOrder);
    }

    public final java.util.List<io.ktor.util.debug.plugins.PluginTraceElement> component1() {
        return this.eventOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.util.debug.plugins.PluginsTrace copy$default(io.ktor.util.debug.plugins.PluginsTrace pluginsTrace, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = pluginsTrace.eventOrder;
        }
        return pluginsTrace.copy(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginsTrace() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
