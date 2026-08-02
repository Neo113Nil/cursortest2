package io.objectbox.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class g {
    protected ByteBuffer bb;
    protected int bb_pos;

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
