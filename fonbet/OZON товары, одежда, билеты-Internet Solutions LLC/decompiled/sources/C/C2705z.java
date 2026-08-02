package C;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: C.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2705z {

    /* renamed from: C.z$a */
    static final class a implements androidx.camera.core.impl.P {

        /* renamed from: a, reason: collision with root package name */
        final List<androidx.camera.core.impl.S> f4281a;

        a(List<androidx.camera.core.impl.S> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f4281a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.P
        public final List<androidx.camera.core.impl.S> a() {
            return this.f4281a;
        }
    }

    @NonNull
    public static androidx.camera.core.impl.P a() {
        return new a(Arrays.asList(new S.a()));
    }
}
