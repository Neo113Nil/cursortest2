package V80;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import androidx.core.content.pm.f;
import androidx.core.content.pm.i;
import androidx.core.graphics.drawable.IconCompat;
import j.C7232a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28436a;

    public c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28436a = context;
    }

    @Override // V80.b
    public final void a(@NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        i.e(this.f28436a, C7714v.a0(shortcutId));
    }

    @Override // V80.b
    public final void b(@NotNull String shortcutId, int i11, int i12, int i13, int i14, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context context = this.f28436a;
        Drawable a11 = C7232a.a(context, i14);
        Intrinsics.g(a11, "null cannot be cast to non-null type android.graphics.drawable.VectorDrawable");
        VectorDrawable vectorDrawable = (VectorDrawable) a11;
        vectorDrawable.setTint(context.getColor(R.color.black));
        Drawable[] drawableArr = {new a(context.getColor(R.color.white), Math.max(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight()) / 2), vectorDrawable};
        try {
            f.b bVar = new f.b(context, shortcutId);
            bVar.j(context.getString(i11));
            bVar.g(context.getString(i12));
            bVar.c(context.getString(i13));
            bVar.d(IconCompat.e(androidx.core.graphics.drawable.b.b(new LayerDrawable(drawableArr), 0, 0, 7)));
            bVar.e(intent);
            i.d(context, bVar.a());
        } catch (Exception e11) {
            L80.a.b("ShortcutManager", "error creating shortcut e=" + e11);
        }
    }
}
