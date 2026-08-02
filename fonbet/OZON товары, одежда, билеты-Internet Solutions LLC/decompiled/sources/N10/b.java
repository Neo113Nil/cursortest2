package N10;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public interface b<VH extends RecyclerView.C> {
    @NotNull
    l d(int i11);

    @NotNull
    TreeSet e();

    int getItemViewType(int i11);

    void onBindViewHolder(@NotNull VH vh2, int i11);

    @NotNull
    VH onCreateViewHolder(@NotNull ViewGroup viewGroup, int i11);

    void registerAdapterDataObserver(@NotNull RecyclerView.i iVar);

    void unregisterAdapterDataObserver(@NotNull RecyclerView.i iVar);
}
