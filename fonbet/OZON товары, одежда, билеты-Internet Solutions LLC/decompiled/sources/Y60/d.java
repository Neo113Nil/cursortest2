package Y60;

import Sc.o;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.Moshi;
import e70.InterfaceC6317d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomSheet;

/* loaded from: classes3.dex */
public final class d extends a<CbottomData> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f34713c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Z60.a f34714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Moshi moshi, @NotNull Z60.a localDataSource) {
        super(moshi, CbottomData.class);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.f34713c = moshi;
        this.f34714d = localDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:10:0x008c). Please report as a decompilation issue!!! */
    @Override // Y60.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull CbottomData cbottomData, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        d dVar;
        Iterator it;
        CbottomData cbottomData2;
        Collection collection;
        String str;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f34712l;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f34712l = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f34710j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f34712l;
                if (i11 != 0) {
                    s.b(obj);
                    List<CbottomSheet> cBottomSheets = cbottomData.getCBottomSheets();
                    ArrayList arrayList = new ArrayList(C7714v.z(cBottomSheets, 10));
                    dVar = this;
                    it = cBottomSheets.iterator();
                    cbottomData2 = cbottomData;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = cVar2.f34709i;
                    CbottomSheet cbottomSheet = cVar2.f34708h;
                    it = cVar2.f34707g;
                    Collection collection2 = cVar2.f34706f;
                    CbottomData cbottomData3 = cVar2.f34705e;
                    dVar = cVar2.f34704d;
                    s.b(obj);
                    InterfaceC6317d interfaceC6317d = (InterfaceC6317d) obj;
                    CbottomSheet cbottomSheet2 = null;
                    if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                        if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                            throw new o();
                        }
                        cbottomSheet2 = CbottomSheet.copy$default(cbottomSheet, null, (String) ((InterfaceC6317d.b) interfaceC6317d).a(), 1, null);
                    }
                    collection.add(cbottomSheet2);
                    collection = collection2;
                    cbottomData2 = cbottomData3;
                    if (it.hasNext()) {
                        cbottomSheet = (CbottomSheet) it.next();
                        Z60.a aVar2 = dVar.f34714d;
                        String layout = cbottomSheet.getLayout();
                        String type = cbottomSheet.getType();
                        cVar2.f34704d = dVar;
                        cVar2.f34705e = cbottomData2;
                        Collection collection3 = collection;
                        cVar2.f34706f = collection3;
                        cVar2.f34707g = it;
                        cVar2.f34708h = cbottomSheet;
                        cVar2.f34709i = collection3;
                        cVar2.f34712l = 1;
                        Object j11 = aVar2.j(layout, type, cVar2);
                        if (j11 == aVar) {
                            return aVar;
                        }
                        cbottomData3 = cbottomData2;
                        obj = j11;
                        collection2 = collection;
                        InterfaceC6317d interfaceC6317d2 = (InterfaceC6317d) obj;
                        CbottomSheet cbottomSheet22 = null;
                        if (!(interfaceC6317d2 instanceof InterfaceC6317d.a)) {
                        }
                        collection.add(cbottomSheet22);
                        collection = collection2;
                        cbottomData2 = cbottomData3;
                        if (it.hasNext()) {
                            CbottomData copy = cbottomData2.copy(C7714v.I((List) collection));
                            dVar.f34714d.e(W60.a.CBOTTOM);
                            try {
                                str = dVar.f34713c.c(CbottomData.class).toJson(copy);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                                str = "";
                            }
                            return new InterfaceC6317d.b(str);
                        }
                    }
                }
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f34710j;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f34712l;
        if (i11 != 0) {
        }
    }
}
