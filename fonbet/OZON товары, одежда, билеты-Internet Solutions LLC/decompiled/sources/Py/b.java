package Py;

import Vh0.a;
import com.google.gson.internal.o;
import com.google.gson.j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.q;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.FavProductButtonPresenter;
import yl0.InterfaceC10919d;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements g, InterfaceC10919d, q, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22723b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f22722a = i11;
        this.f22723b = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f22722a) {
            case 0:
                ((Function1) this.f22723b).invoke(obj);
                break;
            case 1:
                ((Function1) this.f22723b).invoke(obj);
                break;
            default:
                ((Function1) this.f22723b).invoke(obj);
                break;
        }
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        Type type = (Type) this.f22723b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new j("Invalid EnumSet type: " + type.toString());
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ((Function1) this.f22723b).invoke(new a.b(throwable));
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean initSubscribers$lambda$1;
        initSubscribers$lambda$1 = FavProductButtonPresenter.initSubscribers$lambda$1((Function1) this.f22723b, obj);
        return initSubscribers$lambda$1;
    }
}
