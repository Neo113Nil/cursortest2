package T90;

import Q90.k;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.fintech.settings.models.FeatureFlag;
import ru.ozon.fintech.settings.models.FeatureFlagsRequest;
import ru.ozon.fintech.settings.network.FeaturesNetwork;

/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FeaturesNetwork f26928a;

    public d(@NotNull FeaturesNetwork featuresNetwork) {
        Intrinsics.checkNotNullParameter(featuresNetwork, "featuresNetwork");
        this.f26928a = featuresNetwork;
    }

    @Override // T90.a
    public final boolean a(@NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        return k.c(fintechLibType);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // T90.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, @NotNull FeatureFlagsRequest featureFlagsRequest, @NotNull kotlin.coroutines.jvm.internal.c cVar) throws IllegalStateException {
        c cVar2;
        int i11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f26927f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f26927f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f26925d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f26927f;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f26927f = 1;
                    obj = this.f26928a.getFeatureFlags(str, featureFlagsRequest, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return (Response) obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f26925d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f26927f;
        if (i11 != 0) {
        }
        return (Response) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // T90.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull FeatureFlagsRequest featureFlagsRequest, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        String str2;
        Iterator it;
        Object obj;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f26924g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f26924g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = bVar.f26922e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f26924g;
                if (i11 != 0) {
                    s.b(obj2);
                    String featureNameLike = featureFlagsRequest.getFilterRequest().getFeatureNameLike();
                    bVar.f26921d = featureNameLike;
                    bVar.f26924g = 1;
                    Object featureFlag = this.f26928a.getFeatureFlag(str, featureFlagsRequest, bVar);
                    if (featureFlag == aVar) {
                        return aVar;
                    }
                    obj2 = featureFlag;
                    str2 = featureNameLike;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = bVar.f26921d;
                    s.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.d(((FeatureFlag) obj).getFeatureName(), str2)) {
                        break;
                    }
                }
                return (FeatureFlag) obj;
            }
        }
        bVar = new b(this, cVar);
        Object obj22 = bVar.f26922e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f26924g;
        if (i11 != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        return (FeatureFlag) obj;
    }

    @Override // T90.a
    public final boolean d(@NotNull O30.b fintechLibType, @NotNull String listFlagsString) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(listFlagsString, "listFlagsString");
        return k.d(fintechLibType, listFlagsString);
    }

    @Override // T90.a
    public final boolean e(@NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        return k.e(fintechLibType);
    }
}
