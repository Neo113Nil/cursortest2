package Ql0;

import Nl0.l;
import Ol0.t;
import Ol0.u;
import Za.d;
import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ob.C8684c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yl0.f f23806a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.d f23807b;

    public e(@NotNull Yl0.f initPushClientWithMetadataUseCase, @NotNull Hl0.a rootLogger) {
        Intrinsics.checkNotNullParameter(initPushClientWithMetadataUseCase, "initPushClientWithMetadataUseCase");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f23806a = initPushClientWithMetadataUseCase;
        Intrinsics.checkNotNullParameter(this, "any");
        this.f23807b = d.a.a(rootLogger, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    @Override // Ql0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Xl0.a pushClientParams;
        Object newInstance;
        Yl0.f fVar = this.f23806a;
        Intrinsics.checkNotNullParameter("ru.rustore.sdk.pushclient.project_id", "projectIdKey");
        Intrinsics.checkNotNullParameter("ru.rustore.sdk.pushclient.params_class", "paramsClassKey");
        C8684c c8684c = fVar.f35158a;
        String projectId = c8684c.a("ru.rustore.sdk.pushclient.project_id");
        boolean z11 = false;
        if (projectId == null) {
            fVar.f35160c.info("Auto init RuStorePushClient was skipped");
        } else {
            String a11 = c8684c.a("ru.rustore.sdk.pushclient.params_class");
            l lVar = fVar.f35159b;
            u uVar = lVar.f19642b;
            Application application = uVar.f20525a;
            if (a11 != null) {
                try {
                    newInstance = Class.forName(a11, false, u.class.getClassLoader()).getDeclaredConstructor(Context.class).newInstance(application);
                } catch (Throwable th2) {
                    if (th2 instanceof NoSuchMethodException ? true : th2 instanceof SecurityException) {
                        throw new IllegalStateException(a11.concat(" class must have a once constructor which accepts Context as the only parameter"), th2);
                    }
                    uVar.f20526b.b("Error while trying instantiate class ".concat(a11), th2);
                }
                if (newInstance instanceof Xl0.a) {
                    pushClientParams = (Xl0.a) newInstance;
                    if (pushClientParams == null) {
                        pushClientParams = new u.a(application);
                    }
                    Intrinsics.checkNotNullParameter(projectId, "projectId");
                    Intrinsics.checkNotNullParameter(pushClientParams, "pushClientParams");
                    t tVar = lVar.f19641a;
                    Intrinsics.checkNotNullParameter(projectId, "projectId");
                    Intrinsics.checkNotNullParameter(pushClientParams, "pushClientParams");
                    Dl0.a.c(tVar.f20524a, projectId, Xl0.a.a());
                    z11 = true;
                }
            }
            pushClientParams = null;
            if (pushClientParams == null) {
            }
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(pushClientParams, "pushClientParams");
            t tVar2 = lVar.f19641a;
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(pushClientParams, "pushClientParams");
            Dl0.a.c(tVar2.f20524a, projectId, Xl0.a.a());
            z11 = true;
        }
        this.f23807b.info("Auto init RuStorePushClient is successful = " + z11);
        return z11;
    }
}
