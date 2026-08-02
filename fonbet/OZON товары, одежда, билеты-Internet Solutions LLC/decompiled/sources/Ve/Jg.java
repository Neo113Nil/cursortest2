package Ve;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class Jg extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    public final X4.a f29291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jg(X4.a itemViewBinding) {
        super(itemViewBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemViewBinding, "itemViewBinding");
        this.f29291a = itemViewBinding;
    }

    public abstract void e(Object obj);
}
