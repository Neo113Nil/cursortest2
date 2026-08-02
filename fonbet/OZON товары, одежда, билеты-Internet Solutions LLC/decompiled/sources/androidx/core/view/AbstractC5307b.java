package androidx.core.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5307b {

    /* renamed from: a, reason: collision with root package name */
    private a f42274a;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    @NonNull
    public abstract View c();

    @NonNull
    public View d(@NonNull androidx.appcompat.view.menu.i iVar) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(@NonNull androidx.appcompat.view.menu.q qVar) {
    }

    public boolean g() {
        return false;
    }

    public final void h() {
        this.f42274a = null;
    }

    public void i(a aVar) {
        if (this.f42274a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f42274a = aVar;
    }
}
