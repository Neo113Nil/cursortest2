package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/ImageSourceConfig;", "", "", "capacity", "", "usageFlags", "defaultDataSpace", "defaultHardwareBufferFormat", "<init>", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", com.visa.cbp.getEncExpo.warmup, "getCapacity", "()I", "Ljava/lang/Long;", "getUsageFlags", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getDefaultDataSpace", "()Ljava/lang/Integer;", "getDefaultHardwareBufferFormat", "", "enableConcurrentOutputs", "Z", "getEnableConcurrentOutputs", "()Z", "setEnableConcurrentOutputs", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageSourceConfig {
    private final int capacity;
    private final java.lang.Integer defaultDataSpace;
    private final java.lang.Integer defaultHardwareBufferFormat;
    private boolean enableConcurrentOutputs;
    private final java.lang.Long usageFlags;

    public ImageSourceConfig(int i, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2) {
        this.capacity = i;
        this.usageFlags = l;
        this.defaultDataSpace = num;
        this.defaultHardwareBufferFormat = num2;
    }

    public /* synthetic */ ImageSourceConfig(int i, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final java.lang.Long getUsageFlags() {
        return this.usageFlags;
    }

    public final java.lang.Integer getDefaultDataSpace() {
        return this.defaultDataSpace;
    }

    public final java.lang.Integer getDefaultHardwareBufferFormat() {
        return this.defaultHardwareBufferFormat;
    }

    public final boolean getEnableConcurrentOutputs() {
        return this.enableConcurrentOutputs;
    }

    public final void setEnableConcurrentOutputs(boolean z) {
        this.enableConcurrentOutputs = z;
    }
}
