package io.objectbox.model;

import io.flutter.embedding.android.KeyboardMap;
import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* loaded from: classes3.dex */
public final class HnswParams extends h {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public HnswParams get(int i) {
            return get(new HnswParams(), i);
        }

        public HnswParams get(HnswParams hnswParams, int i) {
            return hnswParams.__assign(h.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addDimensions(d dVar, long j) {
        throw null;
    }

    public static void addDistanceType(d dVar, int i) {
        throw null;
    }

    public static void addFlags(d dVar, long j) {
        throw null;
    }

    public static void addIndexingSearchCount(d dVar, long j) {
        throw null;
    }

    public static void addNeighborsPerNode(d dVar, long j) {
        throw null;
    }

    public static void addReparationBacklinkProbability(d dVar, float f) {
        throw null;
    }

    public static void addVectorCacheHintSizeKb(d dVar, long j) {
        throw null;
    }

    public static int createHnswParams(d dVar, long j, long j2, long j3, long j4, int i, float f, long j5) {
        throw null;
    }

    public static int endHnswParams(d dVar) {
        throw null;
    }

    public static HnswParams getRootAsHnswParams(ByteBuffer byteBuffer) {
        return getRootAsHnswParams(byteBuffer, new HnswParams());
    }

    public static void startHnswParams(d dVar) {
        throw null;
    }

    public HnswParams __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long dimensions() {
        if (__offset(4) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public int distanceType() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos) & UShort.MAX_VALUE;
        }
        return 0;
    }

    public long flags() {
        if (__offset(10) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public long indexingSearchCount() {
        if (__offset(8) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public long neighborsPerNode() {
        if (__offset(6) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public float reparationBacklinkProbability() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public long vectorCacheHintSizeKb() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public static HnswParams getRootAsHnswParams(ByteBuffer byteBuffer, HnswParams hnswParams) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hnswParams.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }
}
