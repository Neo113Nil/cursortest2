package io.objectbox.model;

import io.flutter.embedding.android.KeyboardMap;
import io.objectbox.flatbuffers.b;
import io.objectbox.flatbuffers.d;
import io.objectbox.flatbuffers.g;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class IdUid extends g {

    public static final class Vector extends b {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public IdUid get(int i) {
            return get(new IdUid(), i);
        }

        public IdUid get(IdUid idUid, int i) {
            return idUid.__assign(__element(i), this.bb);
        }
    }

    public static int createIdUid(d dVar, long j, long j2) {
        throw null;
    }

    public IdUid __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long id() {
        return this.bb.getInt(this.bb_pos) & KeyboardMap.kValueMask;
    }

    public long uid() {
        return this.bb.getLong(this.bb_pos + 8);
    }
}
