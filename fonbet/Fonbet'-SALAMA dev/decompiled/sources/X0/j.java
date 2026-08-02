package X0;

import android.content.Context;
import d0.C0940b;
import f6.C1116i;
import java.io.File;

/* loaded from: classes.dex */
public final class j extends t6.i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        super(0);
        this.f7448a = i7;
        this.f7449b = obj;
        this.f7450c = obj2;
    }

    @Override // s6.a
    public final Object invoke() {
        switch (this.f7448a) {
            case 0:
                ((Y0.a) ((b) this.f7449b).f7432b).b((i) this.f7450c);
                return C1116i.f13008a;
            default:
                Context context = (Context) this.f7449b;
                ((C0940b) this.f7450c).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                t6.h.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
        }
    }
}
