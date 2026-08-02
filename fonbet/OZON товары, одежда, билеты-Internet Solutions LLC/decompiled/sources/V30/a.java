package V30;

import U7.m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0006\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0006\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"LV30/a;", "Landroidx/lifecycle/z0$b;", "", "Ljava/lang/Class;", "Landroidx/lifecycle/w0;", "LPc/a;", "creators", "<init>", "(Ljava/util/Map;)V", "T", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Ljava/util/Map;", "fintech_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a implements z0.b {

    @NotNull
    private final Map<Class<? extends w0>, Pc.a<w0>> creators;

    public a(@NotNull Map<Class<? extends w0>, Pc.a<w0>> creators) {
        Intrinsics.checkNotNullParameter(creators, "creators");
        this.creators = creators;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Object obj;
        Pc.a aVar;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Iterator<T> it = this.creators.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (modelClass.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (aVar = (Pc.a) entry.getValue()) == null) {
            throw new IllegalArgumentException(m.a(modelClass, "unknown model class "));
        }
        try {
            Object obj2 = aVar.get();
            Intrinsics.g(obj2, "null cannot be cast to non-null type T of ru.ozon.fintech.di.fintech.lifecycle.ViewModelAbstractFactory.create");
            return (T) obj2;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
