package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f"}, d2 = {"Lio/ktor/util/Platform;", "", "<init>", "()V", "Jvm", "Native", "Js", "WasmJs", "JsPlatform", "Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform$Jvm;", "Lio/ktor/util/Platform$Native;", "Lio/ktor/util/Platform$WasmJs;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Platform {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/util/Platform$Jvm;", "Lio/ktor/util/Platform;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Jvm extends io.ktor.util.Platform {
        public static final io.ktor.util.Platform.Jvm INSTANCE = new io.ktor.util.Platform.Jvm();

        public final int hashCode() {
            return 1051825272;
        }

        private Jvm() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Jvm";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.ktor.util.Platform.Jvm)) {
                return false;
            }
            return true;
        }
    }

    private Platform() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/util/Platform$Native;", "Lio/ktor/util/Platform;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Native extends io.ktor.util.Platform {
        public static final io.ktor.util.Platform.Native INSTANCE = new io.ktor.util.Platform.Native();

        public final int hashCode() {
            return -1059277600;
        }

        private Native() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Native";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.ktor.util.Platform.Native)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "component1", "()Lio/ktor/util/Platform$JsPlatform;", "copy", "(Lio/ktor/util/Platform$JsPlatform;)Lio/ktor/util/Platform$Js;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/Platform$JsPlatform;", "getJsPlatform"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Js extends io.ktor.util.Platform {
        private final io.ktor.util.Platform.JsPlatform jsPlatform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Js(io.ktor.util.Platform.JsPlatform jsPlatform) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsPlatform, "");
            this.jsPlatform = jsPlatform;
        }

        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Js(jsPlatform=");
            sb.append(this.jsPlatform);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.jsPlatform.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.util.Platform.Js) && this.jsPlatform == ((io.ktor.util.Platform.Js) other).jsPlatform;
        }

        public final io.ktor.util.Platform.Js copy(io.ktor.util.Platform.JsPlatform jsPlatform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsPlatform, "");
            return new io.ktor.util.Platform.Js(jsPlatform);
        }

        /* renamed from: component1, reason: from getter */
        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public static /* synthetic */ io.ktor.util.Platform.Js copy$default(io.ktor.util.Platform.Js js, io.ktor.util.Platform.JsPlatform jsPlatform, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jsPlatform = js.jsPlatform;
            }
            return js.copy(jsPlatform);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lio/ktor/util/Platform$WasmJs;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "component1", "()Lio/ktor/util/Platform$JsPlatform;", "copy", "(Lio/ktor/util/Platform$JsPlatform;)Lio/ktor/util/Platform$WasmJs;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/Platform$JsPlatform;", "getJsPlatform"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class WasmJs extends io.ktor.util.Platform {
        private final io.ktor.util.Platform.JsPlatform jsPlatform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WasmJs(io.ktor.util.Platform.JsPlatform jsPlatform) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsPlatform, "");
            this.jsPlatform = jsPlatform;
        }

        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WasmJs(jsPlatform=");
            sb.append(this.jsPlatform);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.jsPlatform.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.util.Platform.WasmJs) && this.jsPlatform == ((io.ktor.util.Platform.WasmJs) other).jsPlatform;
        }

        public final io.ktor.util.Platform.WasmJs copy(io.ktor.util.Platform.JsPlatform jsPlatform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsPlatform, "");
            return new io.ktor.util.Platform.WasmJs(jsPlatform);
        }

        /* renamed from: component1, reason: from getter */
        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public static /* synthetic */ io.ktor.util.Platform.WasmJs copy$default(io.ktor.util.Platform.WasmJs wasmJs, io.ktor.util.Platform.JsPlatform jsPlatform, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jsPlatform = wasmJs.jsPlatform;
            }
            return wasmJs.copy(jsPlatform);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lio/ktor/util/Platform$JsPlatform;", "", "<init>", "(Ljava/lang/String;I)V", "Browser", "Node"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class JsPlatform {
        public static final io.ktor.util.Platform.JsPlatform Browser;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final io.ktor.util.Platform.JsPlatform Node;
        private static final /* synthetic */ io.ktor.util.Platform.JsPlatform[] getHighSpeedVideoFpsRangesFor;

        static {
            io.ktor.util.Platform.JsPlatform jsPlatform = new io.ktor.util.Platform.JsPlatform("Browser", 0);
            Browser = jsPlatform;
            io.ktor.util.Platform.JsPlatform jsPlatform2 = new io.ktor.util.Platform.JsPlatform("Node", 1);
            Node = jsPlatform2;
            io.ktor.util.Platform.JsPlatform[] jsPlatformArr = {jsPlatform, jsPlatform2};
            getHighSpeedVideoFpsRangesFor = jsPlatformArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(jsPlatformArr);
        }

        private JsPlatform(java.lang.String str, int i) {
        }

        public static io.ktor.util.Platform.JsPlatform valueOf(java.lang.String str) {
            return (io.ktor.util.Platform.JsPlatform) java.lang.Enum.valueOf(io.ktor.util.Platform.JsPlatform.class, str);
        }

        public static io.ktor.util.Platform.JsPlatform[] values() {
            return (io.ktor.util.Platform.JsPlatform[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static kotlin.enums.EnumEntries<io.ktor.util.Platform.JsPlatform> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public /* synthetic */ Platform(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
