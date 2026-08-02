package Y60;

import Je.k;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.Moshi;
import e70.InterfaceC6317d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import xe.X0;

/* loaded from: classes3.dex */
public final class g extends Y60.a<TransferData> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f34723c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X60.a f34724d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Z60.a f34725e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34726a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC6317d<String, Object> f34727b;

        public a(@NotNull String bankId, @NotNull InterfaceC6317d<String, Object> result) {
            Intrinsics.checkNotNullParameter(bankId, "bankId");
            Intrinsics.checkNotNullParameter(result, "result");
            this.f34726a = bankId;
            this.f34727b = result;
        }

        @NotNull
        public final String a() {
            return this.f34726a;
        }

        @NotNull
        public final InterfaceC6317d<String, Object> b() {
            return this.f34727b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f34726a, aVar.f34726a) && Intrinsics.d(this.f34727b, aVar.f34727b);
        }

        public final int hashCode() {
            return this.f34727b.hashCode() + (this.f34726a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "BankImageDownloadedResult(bankId=" + this.f34726a + ", result=" + this.f34727b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Moshi moshi, @NotNull X60.a imageDownloader, @NotNull Z60.a localDataSource) {
        super(moshi, TransferData.class);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(imageDownloader, "imageDownloader");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.f34723c = moshi;
        this.f34724d = imageDownloader;
        this.f34725e = localDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        r12 = r1.f34725e;
        r13 = r11.getId();
        r4.f34728d = r1;
        r4.f34729e = r0;
        r4.f34730f = r8;
        r4.f34731g = r9;
        r4.f34732h = r10;
        r4.f34733i = r11;
        r4.f34736l = 1;
        r12 = r12.f(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if (r12 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bd, code lost:
    
        r11 = r0;
        r0 = r12;
        r12 = r1;
        r1 = r4;
        r4 = r11;
        r16 = r10;
        r10 = r8;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        if (r12.f34725e.i(r0, r1) == r3) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e0 -> B:37:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0104 -> B:36:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0112 -> B:37:0x010a). Please report as a decompilation issue!!! */
    @Override // Y60.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull TransferData transferData, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        g gVar;
        int i11;
        List arrayList;
        Iterator<BankInfo> it;
        LinkedHashMap linkedHashMap;
        h hVar2;
        g gVar2;
        TransferData transferData2;
        g gVar3;
        TransferData transferData3;
        Iterator<BankInfo> it2;
        BankInfo bankInfo;
        TransferData transferData4;
        Map map;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        String str;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f34736l;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f34736l = i12 - LinearLayoutManager.INVALID_OFFSET;
                gVar = this;
                Object obj = hVar.f34734j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f34736l;
                if (i11 != 0) {
                    s.b(obj);
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    arrayList = new ArrayList();
                    it = transferData.getBanks().iterator();
                    linkedHashMap = linkedHashMap4;
                    hVar2 = hVar;
                    gVar2 = gVar;
                    transferData2 = transferData;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    bankInfo = hVar.f34733i;
                    it2 = hVar.f34732h;
                    arrayList = hVar.f34731g;
                    Map map2 = hVar.f34730f;
                    transferData3 = hVar.f34729e;
                    gVar3 = hVar.f34728d;
                    s.b(obj);
                    LinkedHashMap linkedHashMap5 = map2;
                    String str2 = (String) obj;
                    String c11 = Y60.a.c(gVar3, bankInfo.getLogoUrl(), bankInfo.getId(), 2);
                    if (str2 == null) {
                        arrayList.add(bankInfo);
                        linkedHashMap2 = linkedHashMap5;
                    } else if (str2.equals(c11)) {
                        linkedHashMap5.put(bankInfo.getId(), str2);
                        Unit unit = Unit.f71690a;
                        linkedHashMap2 = linkedHashMap5;
                    } else {
                        hVar.f34728d = gVar3;
                        hVar.f34729e = transferData3;
                        hVar.f34730f = linkedHashMap5;
                        hVar.f34731g = arrayList;
                        hVar.f34732h = it2;
                        hVar.f34733i = bankInfo;
                        hVar.f34736l = 2;
                        linkedHashMap3 = linkedHashMap5;
                    }
                    LinkedHashMap linkedHashMap6 = linkedHashMap2;
                    it = it2;
                    linkedHashMap = linkedHashMap6;
                    hVar2 = hVar;
                    transferData2 = transferData3;
                    gVar2 = gVar3;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return aVar;
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = hVar.f34730f;
                    transferData4 = hVar.f34729e;
                    gVar2 = hVar.f34728d;
                    s.b(obj);
                    for (a aVar2 : (List) obj) {
                        if (aVar2 != null && (aVar2.b() instanceof InterfaceC6317d.b)) {
                            map.put(aVar2.a(), ((InterfaceC6317d.b) aVar2.b()).a());
                        }
                    }
                    List<BankInfo> banks = transferData4.getBanks();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(banks, 10));
                    for (BankInfo bankInfo2 : banks) {
                        arrayList2.add(BankInfo.copy$default(bankInfo2, null, null, null, (String) map.get(bankInfo2.getId()), null, 23, null));
                    }
                    TransferData copy$default = TransferData.copy$default(transferData4, null, arrayList2, null, null, null, false, null, null, null, 509, null);
                    gVar2.f34725e.e(W60.a.TRANSFER);
                    try {
                        str = gVar2.f34723c.c(TransferData.class).toJson(copy$default);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        str = "";
                    }
                    return new InterfaceC6317d.b(str);
                }
                bankInfo = hVar.f34733i;
                it2 = hVar.f34732h;
                arrayList = hVar.f34731g;
                Map map3 = hVar.f34730f;
                transferData3 = hVar.f34729e;
                gVar3 = hVar.f34728d;
                s.b(obj);
                linkedHashMap3 = map3;
                arrayList.add(bankInfo);
                linkedHashMap2 = linkedHashMap3;
                LinkedHashMap linkedHashMap62 = linkedHashMap2;
                it = it2;
                linkedHashMap = linkedHashMap62;
                hVar2 = hVar;
                transferData2 = transferData3;
                gVar2 = gVar3;
                while (true) {
                    if (it.hasNext()) {
                        BankInfo next = it.next();
                        if (next.getLogoUrl() != null) {
                            break;
                        }
                    } else {
                        i iVar = new i(arrayList, k.a(6), gVar2, null);
                        hVar2.f34728d = gVar2;
                        hVar2.f34729e = transferData2;
                        hVar2.f34730f = linkedHashMap;
                        hVar2.f34731g = null;
                        hVar2.f34732h = null;
                        hVar2.f34733i = null;
                        hVar2.f34736l = 3;
                        Object c12 = X0.c(iVar, hVar2);
                        if (c12 != aVar) {
                            transferData4 = transferData2;
                            obj = c12;
                            map = linkedHashMap;
                        }
                    }
                }
                return aVar;
            }
        }
        gVar = this;
        hVar = new h(gVar, cVar);
        Object obj2 = hVar.f34734j;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f34736l;
        if (i11 != 0) {
        }
    }
}
