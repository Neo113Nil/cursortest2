package U7;

import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import io.sentry.util.l;
import java.util.Timer;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements x.a, l.a {
    public static String a(Class cls, String str) {
        return str + cls;
    }

    public static String b(Object obj, String str) {
        return str + obj;
    }

    @Override // com.google.crypto.tink.internal.x.a
    public S7.q d(G g10) {
        return n.d(g10);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return new Timer(true);
    }
}
