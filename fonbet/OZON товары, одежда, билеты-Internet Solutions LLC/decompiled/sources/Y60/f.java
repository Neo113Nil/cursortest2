package Y60;

import Sc.o;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.Moshi;
import e70.InterfaceC6317d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.main.ClientData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;

/* loaded from: classes3.dex */
public final class f extends a<MainData> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f34720c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X60.a f34721d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Z60.a f34722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Moshi moshi, @NotNull X60.a imageDownloader, @NotNull Z60.a localDataSource) {
        super(moshi, MainData.class);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(imageDownloader, "imageDownloader");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.f34720c = moshi;
        this.f34721d = imageDownloader;
        this.f34722e = localDataSource;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:27|28))(2:29|(2:31|(1:33)(1:34))(6:35|19|20|21|22|23))|10|(2:12|(1:14)(2:15|16))|18|19|20|21|22|23))|36|6|(0)(0)|10|(0)|18|19|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r0.printStackTrace();
        r12 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // Y60.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull MainData mainData, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        MainData mainData2;
        f fVar;
        f fVar2;
        InterfaceC6317d interfaceC6317d;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f34719h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f34719h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f34717f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f34719h;
                String str = null;
                if (i11 != 0) {
                    s.b(obj);
                    boolean isOfflineEnabled = mainData.isOfflineEnabled();
                    Z60.a aVar2 = this.f34722e;
                    aVar2.p(isOfflineEnabled);
                    aVar2.g(mainData.getPageLoadedTimeoutMs());
                    String avatarUrl = mainData.getClient().getAvatarUrl();
                    if (avatarUrl == null) {
                        mainData2 = mainData;
                        fVar = this;
                        MainData copy$default = MainData.copy$default(mainData2, ClientData.copy$default(mainData2.getClient(), null, str, false, 5, null), null, null, false, false, 0L, 62, null);
                        fVar.f34722e.e(W60.a.MAIN);
                        String str2 = fVar.f34720c.c(MainData.class).toJson(copy$default);
                        return new InterfaceC6317d.b(str2);
                    }
                    String c11 = a.c(this, avatarUrl, null, 12);
                    eVar.f34715d = this;
                    eVar.f34716e = mainData;
                    eVar.f34719h = 1;
                    obj = this.f34721d.a(c11, avatarUrl, eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    fVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mainData = eVar.f34716e;
                    fVar2 = eVar.f34715d;
                    s.b(obj);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                        throw new o();
                    }
                    str = (String) ((InterfaceC6317d.b) interfaceC6317d).a();
                }
                f fVar3 = fVar2;
                mainData2 = mainData;
                fVar = fVar3;
                MainData copy$default2 = MainData.copy$default(mainData2, ClientData.copy$default(mainData2.getClient(), null, str, false, 5, null), null, null, false, false, 0L, 62, null);
                fVar.f34722e.e(W60.a.MAIN);
                String str22 = fVar.f34720c.c(MainData.class).toJson(copy$default2);
                return new InterfaceC6317d.b(str22);
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f34717f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f34719h;
        String str3 = null;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
        f fVar32 = fVar2;
        mainData2 = mainData;
        fVar = fVar32;
        MainData copy$default22 = MainData.copy$default(mainData2, ClientData.copy$default(mainData2.getClient(), null, str3, false, 5, null), null, null, false, false, 0L, 62, null);
        fVar.f34722e.e(W60.a.MAIN);
        String str222 = fVar.f34720c.c(MainData.class).toJson(copy$default22);
        return new InterfaceC6317d.b(str222);
    }
}
