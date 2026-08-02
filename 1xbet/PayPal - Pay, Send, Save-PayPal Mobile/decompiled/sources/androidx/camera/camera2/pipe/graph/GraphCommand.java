package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand;", "", "Invalidate", "Shutdown", "Stop", "Abort", "RequestProcessor", "Parameters", "Listeners", "Repeat", "Capture", "Trigger", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Abort;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Capture;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Invalidate;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Listeners;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Parameters;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Repeat;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Shutdown;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Stop;", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GraphCommand {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Invalidate;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Invalidate implements androidx.camera.camera2.pipe.graph.GraphCommand {
        public static final androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate INSTANCE = new androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate();

        private Invalidate() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Shutdown;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Shutdown implements androidx.camera.camera2.pipe.graph.GraphCommand {
        public static final androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown INSTANCE = new androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown();

        private Shutdown() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Stop;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Stop implements androidx.camera.camera2.pipe.graph.GraphCommand {
        public static final androidx.camera.camera2.pipe.graph.GraphCommand.Stop INSTANCE = new androidx.camera.camera2.pipe.graph.GraphCommand.Stop();

        private Stop() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Abort;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Abort implements androidx.camera.camera2.pipe.graph.GraphCommand {
        public static final androidx.camera.camera2.pipe.graph.GraphCommand.Abort INSTANCE = new androidx.camera.camera2.pipe.graph.GraphCommand.Abort();

        private Abort() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "old", "new", "<init>", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "getOld", "()Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "getNew"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestProcessor implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final androidx.camera.camera2.pipe.graph.GraphRequestProcessor new;
        private final androidx.camera.camera2.pipe.graph.GraphRequestProcessor old;

        public RequestProcessor(androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor, androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor2) {
            this.old = graphRequestProcessor;
            this.new = graphRequestProcessor2;
        }

        public final androidx.camera.camera2.pipe.graph.GraphRequestProcessor getNew() {
            return this.new;
        }

        public final androidx.camera.camera2.pipe.graph.GraphRequestProcessor getOld() {
            return this.old;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Parameters;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "", "", "graphParameters", "graph3AParameters", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "getGraphParameters", "()Ljava/util/Map;", "getGraph3AParameters"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final java.util.Map<?, java.lang.Object> graph3AParameters;
        private final java.util.Map<?, java.lang.Object> graphParameters;

        public Parameters(java.util.Map<?, ? extends java.lang.Object> map, java.util.Map<?, ? extends java.lang.Object> map2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
            this.graphParameters = map;
            this.graph3AParameters = map2;
        }

        public final java.util.Map<?, java.lang.Object> getGraph3AParameters() {
            return this.graph3AParameters;
        }

        public final java.util.Map<?, java.lang.Object> getGraphParameters() {
            return this.graphParameters;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Listeners;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getListeners", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Listeners implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final java.util.List<androidx.camera.camera2.pipe.Request.Listener> listeners;

        /* JADX WARN: Multi-variable type inference failed */
        public Listeners(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.listeners = list;
        }

        public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> getListeners() {
            return this.listeners;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Repeat;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "Landroidx/camera/camera2/pipe/Request;", "request", "<init>", "(Landroidx/camera/camera2/pipe/Request;)V", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Repeat implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final androidx.camera.camera2.pipe.Request request;

        public Repeat(androidx.camera.camera2.pipe.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.request = request;
        }

        public final androidx.camera.camera2.pipe.Request getRequest() {
            return this.request;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Capture;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "", "Landroidx/camera/camera2/pipe/Request;", "requests", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getRequests", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Capture implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final java.util.List<androidx.camera.camera2.pipe.Request> requests;

        public Capture(java.util.List<androidx.camera.camera2.pipe.Request> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requests = list;
        }

        public final java.util.List<androidx.camera.camera2.pipe.Request> getRequests() {
            return this.requests;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "", "", "triggerParameters", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getTriggerParameters", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Trigger implements androidx.camera.camera2.pipe.graph.GraphCommand {
        private final java.util.Map<?, java.lang.Object> triggerParameters;

        public Trigger(java.util.Map<?, ? extends java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.triggerParameters = map;
        }

        public final java.util.Map<?, java.lang.Object> getTriggerParameters() {
            return this.triggerParameters;
        }
    }
}
