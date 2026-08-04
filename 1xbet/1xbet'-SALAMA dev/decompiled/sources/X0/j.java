package X0;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class j extends t6.i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                return p044f6.i.f13014a;
            default:
                Context context = (Context) this.f7449b;
                ((p022d0.b) this.f7450c).getClass();
                String strConcat = "FlutterSharedPreferences".concat(".preferences_pb");
                t6.h.e(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
        }
    }
}
