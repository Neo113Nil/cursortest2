package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBW\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\f\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011"}, d2 = {"Landroidx/constraintlayout/compose/SwipeMode;", "", "", "name", "", "springMass", "springStiffness", "springDamping", "springThreshold", "Landroidx/constraintlayout/compose/SpringBoundary;", "springBoundary", "maxVelocity", "maxAcceleration", "<init>", "(Ljava/lang/String;FFFFLandroidx/constraintlayout/compose/SpringBoundary;FF)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMaxAcceleration$constraintlayout_compose_release", "()F", "getMaxVelocity$constraintlayout_compose_release", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/constraintlayout/compose/SpringBoundary;", "getSpringBoundary$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/SpringBoundary;", "getSpringDamping$constraintlayout_compose_release", "getSpringMass$constraintlayout_compose_release", "getSpringStiffness$constraintlayout_compose_release", "getSpringThreshold$constraintlayout_compose_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeMode {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.SwipeMode.Companion INSTANCE;
    private static final androidx.constraintlayout.compose.SwipeMode Spring;
    private static final androidx.constraintlayout.compose.SwipeMode Velocity;
    private final float maxAcceleration;
    private final float maxVelocity;
    private final java.lang.String name;
    private final androidx.constraintlayout.compose.SpringBoundary springBoundary;
    private final float springDamping;
    private final float springMass;
    private final float springStiffness;
    private final float springThreshold;

    public SwipeMode(java.lang.String str, float f, float f2, float f3, float f4, androidx.constraintlayout.compose.SpringBoundary springBoundary, float f5, float f6) {
        this.name = str;
        this.springMass = f;
        this.springStiffness = f2;
        this.springDamping = f3;
        this.springThreshold = f4;
        this.springBoundary = springBoundary;
        this.maxVelocity = f5;
        this.maxAcceleration = f6;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: getSpringMass$constraintlayout_compose_release, reason: from getter */
    public final float getSpringMass() {
        return this.springMass;
    }

    /* renamed from: getSpringStiffness$constraintlayout_compose_release, reason: from getter */
    public final float getSpringStiffness() {
        return this.springStiffness;
    }

    /* renamed from: getSpringDamping$constraintlayout_compose_release, reason: from getter */
    public final float getSpringDamping() {
        return this.springDamping;
    }

    /* renamed from: getSpringThreshold$constraintlayout_compose_release, reason: from getter */
    public final float getSpringThreshold() {
        return this.springThreshold;
    }

    public /* synthetic */ SwipeMode(java.lang.String str, float f, float f2, float f3, float f4, androidx.constraintlayout.compose.SpringBoundary springBoundary, float f5, float f6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? 400.0f : f2, (i & 8) != 0 ? 10.0f : f3, (i & 16) != 0 ? 0.01f : f4, (i & 32) != 0 ? androidx.constraintlayout.compose.SpringBoundary.INSTANCE.getOvershoot() : springBoundary, (i & 64) != 0 ? 4.0f : f5, (i & 128) != 0 ? 1.2f : f6);
    }

    /* renamed from: getSpringBoundary$constraintlayout_compose_release, reason: from getter */
    public final androidx.constraintlayout.compose.SpringBoundary getSpringBoundary() {
        return this.springBoundary;
    }

    /* renamed from: getMaxVelocity$constraintlayout_compose_release, reason: from getter */
    public final float getMaxVelocity() {
        return this.maxVelocity;
    }

    /* renamed from: getMaxAcceleration$constraintlayout_compose_release, reason: from getter */
    public final float getMaxAcceleration() {
        return this.maxAcceleration;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/constraintlayout/compose/SwipeMode$Companion;", "", "<init>", "()V", "", "mass", "stiffness", "damping", "threshold", "Landroidx/constraintlayout/compose/SpringBoundary;", "boundary", "Landroidx/constraintlayout/compose/SwipeMode;", "spring", "(FFFFLandroidx/constraintlayout/compose/SpringBoundary;)Landroidx/constraintlayout/compose/SwipeMode;", "maxVelocity", "maxAcceleration", "velocity", "(FF)Landroidx/constraintlayout/compose/SwipeMode;", "Spring", "Landroidx/constraintlayout/compose/SwipeMode;", "getSpring", "()Landroidx/constraintlayout/compose/SwipeMode;", "Velocity", "getVelocity"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.SwipeMode getVelocity() {
            return androidx.constraintlayout.compose.SwipeMode.Velocity;
        }

        public final androidx.constraintlayout.compose.SwipeMode getSpring() {
            return androidx.constraintlayout.compose.SwipeMode.Spring;
        }

        public static /* synthetic */ androidx.constraintlayout.compose.SwipeMode velocity$default(androidx.constraintlayout.compose.SwipeMode.Companion companion, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = 4.0f;
            }
            if ((i & 2) != 0) {
                f2 = 1.2f;
            }
            return companion.velocity(f, f2);
        }

        public final androidx.constraintlayout.compose.SwipeMode velocity(float maxVelocity, float maxAcceleration) {
            return new androidx.constraintlayout.compose.SwipeMode("velocity", 0.0f, 0.0f, 0.0f, 0.0f, null, maxVelocity, maxAcceleration, 62, null);
        }

        public static /* synthetic */ androidx.constraintlayout.compose.SwipeMode spring$default(androidx.constraintlayout.compose.SwipeMode.Companion companion, float f, float f2, float f3, float f4, androidx.constraintlayout.compose.SpringBoundary springBoundary, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                f2 = 400.0f;
            }
            float f5 = f2;
            if ((i & 4) != 0) {
                f3 = 10.0f;
            }
            float f6 = f3;
            if ((i & 8) != 0) {
                f4 = 0.01f;
            }
            float f7 = f4;
            if ((i & 16) != 0) {
                springBoundary = androidx.constraintlayout.compose.SpringBoundary.INSTANCE.getOvershoot();
            }
            return companion.spring(f, f5, f6, f7, springBoundary);
        }

        public final androidx.constraintlayout.compose.SwipeMode spring(float mass, float stiffness, float damping, float threshold, androidx.constraintlayout.compose.SpringBoundary boundary) {
            return new androidx.constraintlayout.compose.SwipeMode("spring", mass, stiffness, damping, threshold, boundary, 0.0f, 0.0f, 192, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.constraintlayout.compose.SwipeMode.Companion companion = new androidx.constraintlayout.compose.SwipeMode.Companion(null);
        INSTANCE = companion;
        Velocity = androidx.constraintlayout.compose.SwipeMode.Companion.velocity$default(companion, 0.0f, 0.0f, 3, null);
        Spring = androidx.constraintlayout.compose.SwipeMode.Companion.spring$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, null, 31, null);
    }
}
