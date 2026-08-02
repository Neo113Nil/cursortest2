package W;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public interface Z {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Z f32996a = new a();

    final class a implements Z {
        @Override // W.Z
        @NonNull
        public final ArrayList b(@NonNull C.A a11) {
            return new ArrayList();
        }
    }

    default Y.f a(@NonNull C4852x c4852x, @NonNull C.A a11) {
        return null;
    }

    @NonNull
    ArrayList b(@NonNull C.A a11);

    default Y.f c(@NonNull Size size, @NonNull C.A a11) {
        return null;
    }
}
