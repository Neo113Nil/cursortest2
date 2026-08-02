package io.objectbox.model;

import io.flutter.embedding.android.KeyboardMap;
import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.h;
import io.objectbox.model.ModelProperty;
import io.objectbox.model.ModelRelation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class ModelEntity extends h {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public ModelEntity get(int i) {
            return get(new ModelEntity(), i);
        }

        public ModelEntity get(ModelEntity modelEntity, int i) {
            return modelEntity.__assign(h.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addFlags(d dVar, long j) {
        throw null;
    }

    public static void addId(d dVar, int i) {
        throw null;
    }

    public static void addLastPropertyId(d dVar, int i) {
        throw null;
    }

    public static void addName(d dVar, int i) {
        throw null;
    }

    public static void addNameSecondary(d dVar, int i) {
        throw null;
    }

    public static void addProperties(d dVar, int i) {
        throw null;
    }

    public static void addRelations(d dVar, int i) {
        throw null;
    }

    public static int createPropertiesVector(d dVar, int[] iArr) {
        int length = iArr.length;
        throw null;
    }

    public static int createRelationsVector(d dVar, int[] iArr) {
        int length = iArr.length;
        throw null;
    }

    public static int endModelEntity(d dVar) {
        throw null;
    }

    public static ModelEntity getRootAsModelEntity(ByteBuffer byteBuffer) {
        return getRootAsModelEntity(byteBuffer, new ModelEntity());
    }

    public static void startModelEntity(d dVar) {
        throw null;
    }

    public static void startPropertiesVector(d dVar, int i) {
        throw null;
    }

    public static void startRelationsVector(d dVar, int i) {
        throw null;
    }

    public ModelEntity __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long flags() {
        if (__offset(14) != 0) {
            return this.bb.getInt(r0 + this.bb_pos) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public IdUid id() {
        return id(new IdUid());
    }

    public IdUid lastPropertyId() {
        return lastPropertyId(new IdUid());
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
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameSecondaryAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public ModelProperty properties(int i) {
        return properties(new ModelProperty(), i);
    }

    public int propertiesLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ModelProperty.Vector propertiesVector() {
        return propertiesVector(new ModelProperty.Vector());
    }

    public ModelRelation relations(int i) {
        return relations(new ModelRelation(), i);
    }

    public int relationsLength() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ModelRelation.Vector relationsVector() {
        return relationsVector(new ModelRelation.Vector());
    }

    public static ModelEntity getRootAsModelEntity(ByteBuffer byteBuffer, ModelEntity modelEntity) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelEntity.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public IdUid id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid lastPropertyId(IdUid idUid) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public ModelProperty properties(ModelProperty modelProperty, int i) {
        int __offset = __offset(8);
        if (__offset == 0) {
            return null;
        }
        return modelProperty.__assign(__indirect((i * 4) + __vector(__offset)), this.bb);
    }

    public ModelProperty.Vector propertiesVector(ModelProperty.Vector vector) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }

    public ModelRelation relations(ModelRelation modelRelation, int i) {
        int __offset = __offset(12);
        if (__offset == 0) {
            return null;
        }
        return modelRelation.__assign(__indirect((i * 4) + __vector(__offset)), this.bb);
    }

    public ModelRelation.Vector relationsVector(ModelRelation.Vector vector) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }
}
