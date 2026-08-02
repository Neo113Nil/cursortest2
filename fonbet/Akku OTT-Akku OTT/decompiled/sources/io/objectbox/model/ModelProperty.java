package io.objectbox.model;

import io.flutter.embedding.android.KeyboardMap;
import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* loaded from: classes3.dex */
public final class ModelProperty extends h {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public ModelProperty get(int i) {
            return get(new ModelProperty(), i);
        }

        public ModelProperty get(ModelProperty modelProperty, int i) {
            return modelProperty.__assign(h.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addFlags(d dVar, long j) {
        throw null;
    }

    public static void addHnswParams(d dVar, int i) {
        throw null;
    }

    public static void addId(d dVar, int i) {
        throw null;
    }

    public static void addIndexId(d dVar, int i) {
        throw null;
    }

    public static void addMaxIndexValueLength(d dVar, long j) {
        throw null;
    }

    public static void addName(d dVar, int i) {
        throw null;
    }

    public static void addNameSecondary(d dVar, int i) {
        throw null;
    }

    public static void addTargetEntity(d dVar, int i) {
        throw null;
    }

    public static void addType(d dVar, int i) {
        throw null;
    }

    public static void addVirtualTarget(d dVar, int i) {
        throw null;
    }

    public static int endModelProperty(d dVar) {
        throw null;
    }

    public static ModelProperty getRootAsModelProperty(ByteBuffer byteBuffer) {
        return getRootAsModelProperty(byteBuffer, new ModelProperty());
    }

    public static void startModelProperty(d dVar) {
        throw null;
    }

    public ModelProperty __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long flags() {
        if (__offset(10) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public HnswParams hnswParams() {
        return hnswParams(new HnswParams());
    }

    public IdUid id() {
        return id(new IdUid());
    }

    public IdUid indexId() {
        return indexId(new IdUid());
    }

    public long maxIndexValueLength() {
        if (__offset(20) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public String name() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public String nameSecondary() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameSecondaryAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public String targetEntity() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer targetEntityAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer targetEntityInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public int type() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getShort(__offset + this.bb_pos) & UShort.MAX_VALUE;
        }
        return 0;
    }

    public String virtualTarget() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer virtualTargetAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer virtualTargetInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public static ModelProperty getRootAsModelProperty(ByteBuffer byteBuffer, ModelProperty modelProperty) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelProperty.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public HnswParams hnswParams(HnswParams hnswParams) {
        int __offset = __offset(22);
        if (__offset != 0) {
            return hnswParams.__assign(__indirect(__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public IdUid id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid indexId(IdUid idUid) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }
}
