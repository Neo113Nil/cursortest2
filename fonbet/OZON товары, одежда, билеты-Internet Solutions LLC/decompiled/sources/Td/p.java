package Td;

import java.io.IOException;

/* loaded from: classes.dex */
public interface p extends q {

    public interface a extends Cloneable, q {
        p build();

        a q1(d dVar, f fVar) throws IOException;
    }

    void a(e eVar) throws IOException;

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
