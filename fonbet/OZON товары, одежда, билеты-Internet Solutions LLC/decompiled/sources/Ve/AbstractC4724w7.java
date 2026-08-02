package Ve;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.w7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4724w7 extends androidx.recyclerview.widget.t {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7737t f32346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4724w7(Function1 function1, AbstractC4211ed diffUtilCallback) {
        super(diffUtilCallback);
        Intrinsics.checkNotNullParameter(diffUtilCallback, "diffUtilCallback");
        this.f32346a = (AbstractC7737t) function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        Jg holder = (Jg) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "item");
        holder.e(item);
        holder.itemView.setOnClickListener(new ViewOnClickListenerC4465n7(0, this, item));
    }
}
