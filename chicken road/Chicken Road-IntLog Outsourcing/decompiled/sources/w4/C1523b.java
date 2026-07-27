package w4;

import java.util.Random;
import kotlin.jvm.internal.i;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523b extends AbstractC1522a {

    /* renamed from: c, reason: collision with root package name */
    public final Y4.d f12227c = new Y4.d(3);

    @Override // w4.AbstractC1522a
    public final Random a() {
        Object obj = this.f12227c.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
