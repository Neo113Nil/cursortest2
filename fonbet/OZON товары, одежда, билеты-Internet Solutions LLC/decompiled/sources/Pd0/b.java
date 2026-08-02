package Pd0;

import Kd0.f;
import Sd0.c;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Kd0.e f22266a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f22267b;

    public b(@NotNull Kd0.e dependencies, @NotNull j userRoleUseCase, @NotNull d delayedLinkRepository) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(userRoleUseCase, "userRoleUseCase");
        Intrinsics.checkNotNullParameter(delayedLinkRepository, "delayedLinkRepository");
        this.f22266a = dependencies;
        this.f22267b = userRoleUseCase;
    }

    @NotNull
    public final Kd0.f a(@NotNull Kd0.g link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intent intent = link.b();
        if (intent != null) {
            this.f22267b.getClass();
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.d(intent.getStringExtra("TEST_USER"), "ENABLED")) {
                int i11 = f.f22274b;
                f.b(Sd0.a.QA_BUILDS_OR_AUTOTEST);
            }
        }
        List<Sd0.d> libs$ozon_limb_release = this.f22266a.getLibs$ozon_limb_release();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = libs$ozon_limb_release.iterator();
        while (it.hasNext()) {
            Sd0.g sharedOutput = ((Sd0.d) it.next()).getSharedOutput();
            Sd0.f linkHandler = sharedOutput != null ? sharedOutput.getLinkHandler() : null;
            if (linkHandler != null) {
                arrayList.add(linkHandler);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Sd0.f fVar = (Sd0.f) it2.next();
            a aVar = new a(link);
            g gVar = new g();
            int i12 = f.f22274b;
            if (fVar.handle(aVar, gVar) instanceof c.a) {
                return new f.a();
            }
        }
        return new f.b();
    }
}
