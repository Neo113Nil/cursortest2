package V4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f28069a;

    u(@NonNull ViewGroup viewGroup) {
        this.f28069a = viewGroup.getOverlay();
    }

    public final void a(@NonNull View view) {
        this.f28069a.add(view);
    }

    public final void b(@NonNull View view) {
        this.f28069a.remove(view);
    }
}
