package M;

import I1.n;
import android.content.Context;
import d2.C0279i;
import g0.C0303b;
import h0.InterfaceC0324a;
import java.io.File;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f955e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        super(0);
        this.f955e = i3;
        this.f = obj;
        this.f956g = obj2;
    }

    @Override // o2.a
    public final Object invoke() {
        switch (this.f955e) {
            case 0:
                Context context = (Context) this.f;
                ((c) this.f956g).getClass();
                String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.j.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            default:
                ((InterfaceC0324a) ((C0303b) this.f).f4955b).b((n) this.f956g);
                return C0279i.f4852a;
        }
    }
}
