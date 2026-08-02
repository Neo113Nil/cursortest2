package ad;

import Zc.C4900a;
import jd.C7347a;
import kotlin.Metadata;
import kotlin.random.b;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lad/a;", "LZc/a;", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ad.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4997a extends C4900a {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lad/a$a;", "", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ad.a$a, reason: collision with other inner class name */
    private static final class C0706a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0706a f36573a = new C0706a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f36574b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f36574b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f36574b = num2;
        }
    }

    @NotNull
    public final c b() {
        Integer num = C0706a.f36574b;
        return (num == null || num.intValue() >= 34) ? new C7347a() : new b();
    }
}
