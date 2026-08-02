package Rd0;

import Qd0.g;
import Sd0.d;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g f25026a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f25027b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0498b f25028c;

    public static final class a extends Vd0.a {
        a() {
        }

        @Override // Vd0.a
        public final ArrayList a(Application context) {
            Td0.a debugHandler;
            Td0.b a11;
            Intrinsics.checkNotNullParameter(context, "context");
            List<d> libs$ozon_limb_release = b.this.f25026a.e().getLibs$ozon_limb_release();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = libs$ozon_limb_release.iterator();
            while (it.hasNext()) {
                Sd0.g sharedOutput = ((d) it.next()).getSharedOutput();
                Td0.d a12 = (sharedOutput == null || (debugHandler = sharedOutput.getDebugHandler()) == null || (a11 = debugHandler.a()) == null) ? null : a11.a(new Rd0.a(context));
                if (a12 != null) {
                    arrayList.add(a12);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: Rd0.b$b, reason: collision with other inner class name */
    public static final class C0498b extends Vd0.b {

        /* renamed from: a, reason: collision with root package name */
        private final a f25030a;

        C0498b(b bVar) {
            this.f25030a = bVar.f25027b;
        }

        @Override // Vd0.b
        public final Vd0.a b() {
            return this.f25030a;
        }
    }

    public b(@NotNull g context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.f25026a = context_receiver_0;
        this.f25027b = new a();
        this.f25028c = new C0498b(this);
    }

    @NotNull
    public final C0498b c() {
        return this.f25028c;
    }
}
