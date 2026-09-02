package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b&\u0018\u0000 :2\u00020\u0001:\u0001AB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001f\u0010 J7\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u0015J\u0019\u0010*\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00102R\u0011\u0010;\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b8\u00102R\u0014\u0010>\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006B"}, d2 = {"Lcom/goldenboot/saga/zone/InternalProvider;", "", "", "name", "Lcom/goldenboot/saga/zone/SystemImpl;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component", "", "clipOrigin", "(I)F", "releaseHeader", "r", "g", "b", "", "connectJob", "(FFF)[F", "v", "peekRevision", "([F)[F", "v0", "v1", "v2", "", "drawField", "(FFF)J", "serializeOffset", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lcom/goldenboot/saga/zone/ContainerSource;", "reduceScope", "(FFFFLcom/goldenboot/saga/zone/InternalProvider;)J", "evictLayout", "growPayload", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "updateTimer", "J", "flushSample", "()J", "injectMetric", "I", "detachStream", "componentCount", "popBlueprint", "()Z", "isWideGamut", "applyTask", "isSrgb", "ActivityMutator", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InternalProvider {
    public static final int clipOrigin = 63;
    public static final int releaseHeader = -1;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final String name;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final long model;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int id;

    public /* synthetic */ InternalProvider(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public boolean applyTask() {
        return false;
    }

    public abstract float clipOrigin(int component);

    public final float[] connectJob(float r, float g, float b) {
        return peekRevision(new float[]{r, g, b});
    }

    /* renamed from: detachStream, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public long drawField(float v0, float v1, float v2) {
        float[] connectJob = connectJob(v0, v1, v2);
        float f = connectJob[0];
        float f2 = connectJob[1];
        return (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        InternalProvider internalProvider = (InternalProvider) other;
        if (this.id == internalProvider.id && Intrinsics.areEqual(this.name, internalProvider.name)) {
            return SystemImpl.updateTimer(this.model, internalProvider.model);
        }
        return false;
    }

    public final float[] evictLayout(float x, float y, float z) {
        float[] fArr = new float[SystemImpl.popBlueprint(this.model)];
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        return growPayload(fArr);
    }

    /* renamed from: flushSample, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    public abstract float[] growPayload(float[] v);

    public int hashCode() {
        return (((this.name.hashCode() * 31) + SystemImpl.drawField(this.model)) * 31) + this.id;
    }

    public final int injectMetric() {
        return SystemImpl.popBlueprint(this.model);
    }

    public abstract float[] peekRevision(float[] v);

    public abstract boolean popBlueprint();

    public long reduceScope(float x, float y, float z, float a, InternalProvider colorSpace) {
        float[] evictLayout = evictLayout(x, y, z);
        return BoxSaver.evictLayout(evictLayout[0], evictLayout[1], evictLayout[2], a, colorSpace);
    }

    public abstract float releaseHeader(int component);

    public float serializeOffset(float v0, float v1, float v2) {
        return connectJob(v0, v1, v2)[2];
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) SystemImpl.connectJob(this.model)) + ')';
    }

    /* renamed from: updateTimer, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ InternalProvider(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private InternalProvider(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private InternalProvider(String str, long j) {
        this(str, j, -1, null);
    }
}
