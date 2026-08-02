package Fl;

import com.google.gson.internal.o;
import com.google.gson.internal.x;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9503b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f9502a = i11;
        this.f9503b = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9502a) {
            case 0:
                ((Function1) this.f9503b).invoke(obj);
                break;
            case 1:
                ((Function1) this.f9503b).invoke(obj);
                break;
            default:
                ((Function1) this.f9503b).invoke(obj);
                break;
        }
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        Class cls = (Class) this.f9503b;
        try {
            return x.f60020a.a(cls);
        } catch (Exception e11) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
        }
    }
}
