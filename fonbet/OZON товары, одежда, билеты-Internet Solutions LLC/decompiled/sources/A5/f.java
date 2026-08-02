package A5;

import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "awaitStarted")
/* loaded from: classes8.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    AbstractC5434v f419d;

    /* renamed from: e, reason: collision with root package name */
    M f420e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f421f;

    /* renamed from: g, reason: collision with root package name */
    int f422g;

    f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f421f = obj;
        this.f422g |= LinearLayoutManager.INVALID_OFFSET;
        return h.a(null, this);
    }
}
