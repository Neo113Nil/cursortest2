package D3;

import D3.a;
import java.io.Closeable;

/* loaded from: classes8.dex */
public interface d extends Closeable {
    c V();

    default boolean moveToNext() {
        a.C0129a c0129a = (a.C0129a) this;
        return c0129a.moveToPosition(c0129a.getPosition() + 1);
    }
}
