package P10;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import m10.C8040b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class k extends i.d<i> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8040b f21657a;

    public k(@NotNull C8040b baseComposerItemCallback) {
        Intrinsics.checkNotNullParameter(baseComposerItemCallback, "baseComposerItemCallback");
        this.f21657a = baseComposerItemCallback;
    }

    @Override // androidx.recyclerview.widget.i.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean areContentsTheSame(@NotNull i oldItem, @NotNull i newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        l oldItem2 = oldItem.c();
        l newItem2 = newItem.c();
        this.f21657a.getClass();
        Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
        Intrinsics.checkNotNullParameter(newItem2, "newItem");
        return Intrinsics.d(oldItem2, newItem2);
    }

    @Override // androidx.recyclerview.widget.i.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean areItemsTheSame(@NotNull i oldItem, @NotNull i newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return this.f21657a.areItemsTheSame(oldItem.c(), newItem.c()) && Intrinsics.d(oldItem.c().a(), newItem.c().a());
    }

    @Override // androidx.recyclerview.widget.i.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object getChangePayload(@NotNull i oldItem, @NotNull i newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return this.f21657a.getChangePayload(oldItem.c(), newItem.c());
    }
}
