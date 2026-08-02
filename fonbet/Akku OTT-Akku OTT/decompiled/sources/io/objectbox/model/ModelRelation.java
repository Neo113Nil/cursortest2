package io.objectbox.model;

import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class ModelRelation extends h {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public ModelRelation get(int i) {
            return get(new ModelRelation(), i);
        }

        public ModelRelation get(ModelRelation modelRelation, int i) {
            return modelRelation.__assign(h.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addId(d dVar, int i) {
        throw null;
    }

    public static void addName(d dVar, int i) {
        throw null;
    }

    public static void addTargetEntityId(d dVar, int i) {
        throw null;
    }

    public static int endModelRelation(d dVar) {
        throw null;
    }

    public static ModelRelation getRootAsModelRelation(ByteBuffer byteBuffer) {
        return getRootAsModelRelation(byteBuffer, new ModelRelation());
    }

    public static void startModelRelation(d dVar) {
        throw null;
    }

    public ModelRelation __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public IdUid id() {
        return id(new IdUid());
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

    public IdUid targetEntityId() {
        return targetEntityId(new IdUid());
    }

    public static ModelRelation getRootAsModelRelation(ByteBuffer byteBuffer, ModelRelation modelRelation) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelRelation.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public IdUid id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid targetEntityId(IdUid idUid) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }
}
