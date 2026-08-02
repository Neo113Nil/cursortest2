package Od0;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Intent f20229a;

        public a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f20229a = intent;
        }

        @Override // Od0.c
        public final Uri a() {
            return this.f20229a.getData();
        }

        @NotNull
        public final Intent b() {
            return this.f20229a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return Intrinsics.d(this.f20229a, ((a) obj).f20229a);
        }

        public final int hashCode() {
            return this.f20229a.hashCode();
        }

        @NotNull
        public final String toString() {
            return a.class.getSimpleName() + "(intent=" + this.f20229a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f20230a;

        public b(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f20230a = uri;
        }

        @Override // Od0.c
        @NotNull
        public final Uri a() {
            return this.f20230a;
        }

        @NotNull
        public final Uri b() {
            return this.f20230a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return Intrinsics.d(this.f20230a, ((b) obj).f20230a);
        }

        public final int hashCode() {
            return this.f20230a.hashCode();
        }

        @NotNull
        public final String toString() {
            return b.class.getSimpleName() + "(uri=" + this.f20230a + ")";
        }
    }

    Uri a();
}
