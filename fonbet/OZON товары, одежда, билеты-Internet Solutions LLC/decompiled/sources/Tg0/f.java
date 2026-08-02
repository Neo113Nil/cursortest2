package Tg0;

import Sc.InterfaceC4008j;
import android.content.Intent;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27175a;

    public f(@NotNull InterfaceC4008j<? extends Sg0.b> powerSettingRepositoryLazy) {
        Intrinsics.checkNotNullParameter(powerSettingRepositoryLazy, "powerSettingRepositoryLazy");
        this.f27175a = powerSettingRepositoryLazy;
    }

    public final Intent a(@NotNull String applicationId, @NotNull Function1<? super Intent, Boolean> predicate) {
        Object obj;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it = ((Sg0.b) this.f27175a.getValue()).a(applicationId).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (predicate.invoke(obj).booleanValue()) {
                break;
            }
        }
        return (Intent) obj;
    }
}
