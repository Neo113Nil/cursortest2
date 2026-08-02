package io.ktor.util.debug.plugins;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement;", "", "", "pluginName", "handler", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)Lio/ktor/util/debug/plugins/PluginTraceElement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPluginName", "getHandler", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "getEvent", "PluginEvent"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PluginTraceElement {
    private final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent event;
    private final java.lang.String handler;
    private final java.lang.String pluginName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "FINISHED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PluginEvent {
        public static final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent FINISHED;
        public static final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent STARTED;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent[] getHighSpeedVideoSizes;

        private PluginEvent(java.lang.String str, int i) {
        }

        static {
            io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent pluginEvent = new io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent("STARTED", 0);
            STARTED = pluginEvent;
            io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent pluginEvent2 = new io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent("FINISHED", 1);
            FINISHED = pluginEvent2;
            io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent[] pluginEventArr = {pluginEvent, pluginEvent2};
            getHighSpeedVideoSizes = pluginEventArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(pluginEventArr);
        }

        public static io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent valueOf(java.lang.String str) {
            return (io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent) java.lang.Enum.valueOf(io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent.class, str);
        }

        public static io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent[] values() {
            return (io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.enums.EnumEntries<io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public PluginTraceElement(java.lang.String str, java.lang.String str2, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent pluginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginEvent, "");
        this.pluginName = str;
        this.handler = str2;
        this.event = pluginEvent;
    }

    public final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent getEvent() {
        return this.event;
    }

    public final java.lang.String getHandler() {
        return this.handler;
    }

    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PluginTraceElement(pluginName=");
        sb.append(this.pluginName);
        sb.append(", handler=");
        sb.append(this.handler);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.pluginName.hashCode() * 31) + this.handler.hashCode()) * 31) + this.event.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.debug.plugins.PluginTraceElement)) {
            return false;
        }
        io.ktor.util.debug.plugins.PluginTraceElement pluginTraceElement = (io.ktor.util.debug.plugins.PluginTraceElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pluginName, pluginTraceElement.pluginName) && kotlin.jvm.internal.Intrinsics.areEqual(this.handler, pluginTraceElement.handler) && this.event == pluginTraceElement.event;
    }

    public final io.ktor.util.debug.plugins.PluginTraceElement copy(java.lang.String pluginName, java.lang.String handler, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return new io.ktor.util.debug.plugins.PluginTraceElement(pluginName, handler, event);
    }

    /* renamed from: component3, reason: from getter */
    public final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHandler() {
        return this.handler;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    public static /* synthetic */ io.ktor.util.debug.plugins.PluginTraceElement copy$default(io.ktor.util.debug.plugins.PluginTraceElement pluginTraceElement, java.lang.String str, java.lang.String str2, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent pluginEvent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pluginTraceElement.pluginName;
        }
        if ((i & 2) != 0) {
            str2 = pluginTraceElement.handler;
        }
        if ((i & 4) != 0) {
            pluginEvent = pluginTraceElement.event;
        }
        return pluginTraceElement.copy(str, str2, pluginEvent);
    }
}
