package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface m {

    public interface a {
        void b(@NonNull g gVar, boolean z11);

        boolean c(@NonNull g gVar);
    }

    void b(g gVar, boolean z11);

    Parcelable c();

    boolean d(i iVar);

    void e(boolean z11);

    boolean f();

    void g(Context context, g gVar);

    int getId();

    void i(a aVar);

    boolean j(i iVar);

    void k(Parcelable parcelable);

    boolean l(q qVar);
}
