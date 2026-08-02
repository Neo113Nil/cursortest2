package bc;

import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: bc.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5634j {

    /* renamed from: bc.j$a */
    public static class a extends AbstractC5634j {

        /* renamed from: a, reason: collision with root package name */
        private final String f55883a;

        /* renamed from: b, reason: collision with root package name */
        private final InputStream f55884b;

        a(InputStream inputStream, String str) {
            this.f55883a = str;
            this.f55884b = inputStream;
        }

        public final String b() {
            return this.f55883a;
        }

        @NonNull
        public final InputStream c() {
            return this.f55884b;
        }
    }

    @NonNull
    public static a a(@NonNull InputStream inputStream, String str) {
        return new a(inputStream, str);
    }
}
