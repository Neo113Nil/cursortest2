package io.objectbox.model;

import io.flutter.embedding.android.KeyboardMap;
import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.c;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.h;
import io.objectbox.model.ModelEntity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class Model extends h {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public Model get(int i) {
            return get(new Model(), i);
        }

        public Model get(Model model, int i) {
            return model.__assign(h.__indirect(__element(i), this.bb), this.bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addEntities(d dVar, int i) {
        throw null;
    }

    public static void addHash(d dVar, int i) {
        throw null;
    }

    public static void addLastEntityId(d dVar, int i) {
        throw null;
    }

    public static void addLastIndexId(d dVar, int i) {
        throw null;
    }

    public static void addLastRelationId(d dVar, int i) {
        throw null;
    }

    public static void addLastSequenceId(d dVar, int i) {
        throw null;
    }

    public static void addModelVersion(d dVar, long j) {
        throw null;
    }

    public static void addName(d dVar, int i) {
        throw null;
    }

    public static void addVersion(d dVar, long j) {
        throw null;
    }

    public static int createEntitiesVector(d dVar, int[] iArr) {
        int length = iArr.length;
        throw null;
    }

    public static int createHashVector(d dVar, byte[] bArr) {
        throw null;
    }

    public static int endModel(d dVar) {
        throw null;
    }

    public static void finishModelBuffer(d dVar, int i) {
        throw null;
    }

    public static void finishSizePrefixedModelBuffer(d dVar, int i) {
        throw null;
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer) {
        return getRootAsModel(byteBuffer, new Model());
    }

    public static void startEntitiesVector(d dVar, int i) {
        throw null;
    }

    public static void startHashVector(d dVar, int i) {
        throw null;
    }

    public static void startModel(d dVar) {
        throw null;
    }

    public Model __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public ModelEntity entities(int i) {
        return entities(new ModelEntity(), i);
    }

    public int entitiesLength() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ModelEntity.Vector entitiesVector() {
        return entitiesVector(new ModelEntity.Vector());
    }

    public int hash(int i) {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.bb.get(__vector(__offset) + i) & UByte.MAX_VALUE;
        }
        return 0;
    }

    public ByteBuffer hashAsByteBuffer() {
        return __vector_as_bytebuffer(20, 1);
    }

    public ByteBuffer hashInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 20, 1);
    }

    public int hashLength() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public c hashVector() {
        return hashVector(new c());
    }

    public IdUid lastEntityId() {
        return lastEntityId(new IdUid());
    }

    public IdUid lastIndexId() {
        return lastIndexId(new IdUid());
    }

    public IdUid lastRelationId() {
        return lastRelationId(new IdUid());
    }

    public IdUid lastSequenceId() {
        return lastSequenceId(new IdUid());
    }

    public long modelVersion() {
        if (__offset(4) != 0) {
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

    public long version() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public static int createHashVector(d dVar, ByteBuffer byteBuffer) {
        throw null;
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer, Model model) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return model.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public ModelEntity entities(ModelEntity modelEntity, int i) {
        int __offset = __offset(10);
        if (__offset == 0) {
            return null;
        }
        return modelEntity.__assign(__indirect((i * 4) + __vector(__offset)), this.bb);
    }

    public ModelEntity.Vector entitiesVector(ModelEntity.Vector vector) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.bb);
        }
        return null;
    }

    public IdUid lastEntityId(IdUid idUid) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid lastIndexId(IdUid idUid) {
        int __offset = __offset(14);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid lastRelationId(IdUid idUid) {
        int __offset = __offset(18);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public IdUid lastSequenceId(IdUid idUid) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.bb);
        }
        return null;
    }

    public c hashVector(c cVar) {
        int __offset = __offset(20);
        if (__offset == 0) {
            return null;
        }
        cVar.__reset(__vector(__offset), 1, this.bb);
        return cVar;
    }
}
