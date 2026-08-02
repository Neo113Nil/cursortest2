package C;

import a00.C4911f;
import android.content.Context;
import androidx.concurrent.futures.b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.action.ActionHandlerComponent;

/* renamed from: C.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C2699t implements b.c, Vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4241b;

    public /* synthetic */ C2699t(Object obj, Object obj2) {
        this.f4240a = obj;
        this.f4241b = obj2;
    }

    public Tg.a a(C4911f c4911f) {
        Tg.a actionNavigatorFactory$lambda$0;
        actionNavigatorFactory$lambda$0 = ActionHandlerComponent.getActionNavigatorFactory$lambda$0((ComposerNavigator) this.f4240a, (ActionHandlerComponent) this.f4241b, c4911f);
        return actionNavigatorFactory$lambda$0;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        C2703x.b((C2703x) this.f4240a, (Context) this.f4241b, aVar);
        return "CameraX initInternal";
    }
}
