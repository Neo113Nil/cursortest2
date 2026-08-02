package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u0005J\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010#\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0005J\u001d\u0010)\u001a\u00020\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0004¢\u0006\u0004\b+\u0010\u0016R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00100R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u00106\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010-R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "content", "<init>", "(Ljava/lang/String;)V", "getCurrentContent", "()Ljava/lang/String;", "getDebugName", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "()Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "getForcedHeight", "()I", "getForcedWidth", "getLayoutInformation", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "()Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "initialization", "()V", "debugMode", "onDrawDebug", "(I)V", "mode", "onLayoutInformation", "onNewContent", "width", "height", "onNewDimensions", "(II)V", "setCurrentContent", "name", "setDebugName", "information", "setLayoutInformation", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "(Landroidx/compose/runtime/MutableState;)V", "signalUpdate", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getOutputMinFrameDuration", "J", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getInputFormats", "Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EditableJSONLayout implements androidx.constraintlayout.compose.LayoutInformationReceiver {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private androidx.compose.runtime.MutableState<java.lang.Long> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
    private int Camera2StreamConfigurationMap = Integer.MIN_VALUE;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.constraintlayout.compose.MotionLayoutDebugFlags getHighSpeedVideoSizes = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.constraintlayout.compose.LayoutInfoFlags getOutputMinFrameDuration = androidx.constraintlayout.compose.LayoutInfoFlags.NONE;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizesFor = "";

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getInputSizeshNQ4ISI = java.lang.System.nanoTime();

    public EditableJSONLayout(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    protected final void initialization() {
        try {
            onNewContent(this.getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoFpsRanges != null) {
                androidx.constraintlayout.core.state.Registry.getInstance().register(this.getHighSpeedVideoFpsRanges, new androidx.constraintlayout.core.state.RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final void onNewMotionScene(java.lang.String content) {
                        if (content == null) {
                            return;
                        }
                        androidx.constraintlayout.compose.EditableJSONLayout.this.onNewContent(content);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final void onProgress(float progress) {
                        androidx.constraintlayout.compose.EditableJSONLayout.this.onNewProgress(progress);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final void onDimensions(int width, int height) {
                        androidx.constraintlayout.compose.EditableJSONLayout.this.onNewDimensions(width, height);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final java.lang.String currentMotionScene() {
                        java.lang.String str;
                        str = androidx.constraintlayout.compose.EditableJSONLayout.this.getHighSpeedVideoFpsRangesFor;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final java.lang.String currentLayoutInformation() {
                        java.lang.String str;
                        str = androidx.constraintlayout.compose.EditableJSONLayout.this.getHighSpeedVideoSizesFor;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final void setLayoutInformationMode(int mode) {
                        androidx.constraintlayout.compose.EditableJSONLayout.this.onLayoutInformation(mode);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final long getLastModified() {
                        long j;
                        j = androidx.constraintlayout.compose.EditableJSONLayout.this.getInputSizeshNQ4ISI;
                        return j;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public final void setDrawDebug(int debugMode) {
                        androidx.constraintlayout.compose.EditableJSONLayout.this.onDrawDebug(debugMode);
                    }
                });
            }
        } catch (androidx.constraintlayout.core.parser.CLParsingException unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setUpdateFlag(androidx.compose.runtime.MutableState<java.lang.Long> needsUpdate) {
        this.getInputFormats = needsUpdate;
    }

    protected final void signalUpdate() {
        androidx.compose.runtime.MutableState<java.lang.Long> mutableState = this.getInputFormats;
        if (mutableState != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableState);
            androidx.compose.runtime.MutableState<java.lang.Long> mutableState2 = this.getInputFormats;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableState2);
            mutableState.setValue(java.lang.Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }

    public final void setCurrentContent(java.lang.String content) {
        onNewContent(content);
    }

    /* renamed from: getCurrentContent, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setDebugName(java.lang.String name2) {
        this.getHighSpeedVideoFpsRanges = name2;
    }

    /* renamed from: getDebugName, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* renamed from: getForcedDrawDebug, reason: from getter */
    public androidx.constraintlayout.compose.MotionLayoutDebugFlags getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* renamed from: getForcedWidth, reason: from getter */
    public int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* renamed from: getForcedHeight, reason: from getter */
    public int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(java.lang.String information) {
        this.getInputSizeshNQ4ISI = java.lang.System.nanoTime();
        this.getHighSpeedVideoSizesFor = information;
    }

    /* renamed from: getLayoutInformation, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* renamed from: getLayoutInformationMode, reason: from getter */
    public androidx.constraintlayout.compose.LayoutInfoFlags getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    protected void onNewContent(java.lang.String content) {
        androidx.constraintlayout.core.parser.CLObject objectOrNull;
        this.getHighSpeedVideoFpsRangesFor = content;
        try {
            androidx.constraintlayout.core.parser.CLObject parse = androidx.constraintlayout.core.parser.CLParser.parse(content);
            if (parse != null) {
                boolean z = this.getHighSpeedVideoFpsRanges == null;
                if (z && (objectOrNull = parse.getObjectOrNull("Header")) != null) {
                    this.getHighSpeedVideoFpsRanges = objectOrNull.getStringOrNull("exportAs");
                    this.getOutputMinFrameDuration = androidx.constraintlayout.compose.LayoutInfoFlags.BOUNDS;
                }
                if (z) {
                    return;
                }
                signalUpdate();
            }
        } catch (androidx.constraintlayout.core.parser.CLParsingException | java.lang.Exception unused) {
        }
    }

    public final void onNewDimensions(int width, int height) {
        this.getHighResolutionOutputSizeshNQ4ISI = width;
        this.Camera2StreamConfigurationMap = height;
        signalUpdate();
    }

    protected final void onLayoutInformation(int mode) {
        if (mode == androidx.constraintlayout.compose.LayoutInfoFlags.NONE.ordinal()) {
            this.getOutputMinFrameDuration = androidx.constraintlayout.compose.LayoutInfoFlags.NONE;
        } else if (mode == androidx.constraintlayout.compose.LayoutInfoFlags.BOUNDS.ordinal()) {
            this.getOutputMinFrameDuration = androidx.constraintlayout.compose.LayoutInfoFlags.BOUNDS;
        }
        signalUpdate();
    }

    protected final void onDrawDebug(int debugMode) {
        androidx.constraintlayout.compose.MotionLayoutDebugFlags motionLayoutDebugFlags;
        if (debugMode != androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN.ordinal()) {
            if (debugMode == androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE.ordinal()) {
                motionLayoutDebugFlags = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE;
            } else if (debugMode == androidx.constraintlayout.compose.MotionLayoutDebugFlags.SHOW_ALL.ordinal()) {
                motionLayoutDebugFlags = androidx.constraintlayout.compose.MotionLayoutDebugFlags.SHOW_ALL;
            }
            this.getHighSpeedVideoSizes = motionLayoutDebugFlags;
            signalUpdate();
        }
        motionLayoutDebugFlags = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN;
        this.getHighSpeedVideoSizes = motionLayoutDebugFlags;
        signalUpdate();
    }
}
