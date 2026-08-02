package Ll0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements gb.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f17147a = new ArrayList();

    @Override // gb.a
    public final void a(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this) {
            try {
                Iterator it = this.f17147a.iterator();
                while (it.hasNext()) {
                    ((gb.a) it.next()).a(token);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
