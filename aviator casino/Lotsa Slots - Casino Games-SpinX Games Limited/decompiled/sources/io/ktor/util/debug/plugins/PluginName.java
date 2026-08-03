package io.ktor.util.debug.plugins;

/* compiled from: PluginName.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lio/ktor/util/debug/plugins/PluginName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "pluginName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lio/ktor/util/debug/plugins/PluginName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPluginName", "Key", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PluginName extends kotlin.coroutines.AbstractCoroutineContextElement {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final io.ktor.util.debug.plugins.PluginName.Companion INSTANCE = new io.ktor.util.debug.plugins.PluginName.Companion(null);
    private final java.lang.String pluginName;

    public static /* synthetic */ io.ktor.util.debug.plugins.PluginName copy$default(io.ktor.util.debug.plugins.PluginName pluginName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pluginName.pluginName;
        }
        return pluginName.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    public final io.ktor.util.debug.plugins.PluginName copy(java.lang.String pluginName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return new io.ktor.util.debug.plugins.PluginName(pluginName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.ktor.util.debug.plugins.PluginName) && kotlin.jvm.internal.Intrinsics.areEqual(this.pluginName, ((io.ktor.util.debug.plugins.PluginName) other).pluginName);
    }

    public int hashCode() {
        return this.pluginName.hashCode();
    }

    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginName(java.lang.String pluginName) {
        super(INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.pluginName = pluginName;
    }

    /* compiled from: PluginName.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/debug/plugins/PluginName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/util/debug/plugins/PluginName;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.debug.plugins.PluginName$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<io.ktor.util.debug.plugins.PluginName> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public java.lang.String toString() {
        return "PluginName(" + this.pluginName + ')';
    }
}
