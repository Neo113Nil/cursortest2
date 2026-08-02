package VL;

import com.google.gson.internal.o;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes7.dex */
public final /* synthetic */ class f implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28458b;

    public /* synthetic */ f(com.google.gson.g gVar, Type type) {
        this.f28457a = 2;
        this.f28458b = gVar;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f28457a) {
            case 0:
                ((Function1) this.f28458b).invoke(obj);
                break;
            default:
                ((Function1) this.f28458b).invoke(obj);
                break;
        }
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return ((com.google.gson.g) this.f28458b).a();
    }

    public /* synthetic */ f(Function1 function1, int i11) {
        this.f28457a = i11;
        this.f28458b = function1;
    }
}
