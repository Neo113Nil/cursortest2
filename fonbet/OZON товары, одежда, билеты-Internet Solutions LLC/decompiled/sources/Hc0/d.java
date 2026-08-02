package Hc0;

import Sc.InterfaceC4008j;
import Sc.s;
import We.C;
import We.D;
import We.H;
import We.K;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.id.nativeauth.fintech.api.FintechRecoveryCameraApi;
import ru.ozon.id.nativeauth.fintech.api.dto.CameraVideoUploadResponse;
import u2.C9923b;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<FintechRecoveryCameraApi> f10832a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull InterfaceC4008j<? extends FintechRecoveryCameraApi> fintechRecoveryCameraApi) {
        Intrinsics.checkNotNullParameter(fintechRecoveryCameraApi, "fintechRecoveryCameraApi");
        this.f10832a = fintechRecoveryCameraApi;
    }

    public static void a(Uri uri, File file) {
        if (file == null) {
            if (uri != null) {
                try {
                    file = C9923b.a(uri);
                } catch (Exception unused) {
                    return;
                }
            } else {
                file = null;
            }
        }
        if (file != null) {
            file.delete();
        }
    }

    public final Object b(@NotNull j jVar) {
        JSONObject put = new JSONObject().put("filter", new JSONObject().put("featureNameLike", "mob_onboarding_text")).put("page", 0).put("perPage", 1);
        FintechRecoveryCameraApi value = this.f10832a.getValue();
        K.Companion companion = K.INSTANCE;
        String jSONObject = put.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        companion.getClass();
        Object postForCachingTestCookie = value.postForCachingTestCookie(K.Companion.b(jSONObject, null), jVar);
        return postForCachingTestCookie == Wc.a.COROUTINE_SUSPENDED ? postForCachingTestCookie : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull Uri uri, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        File a11;
        d dVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f10823h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f10823h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f10821f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f10823h;
                if (i11 != 0) {
                    s.b(obj);
                    a11 = C9923b.a(uri);
                    D.c.a aVar3 = D.c.f33553c;
                    String name = a11.getName();
                    K.Companion companion = K.INSTANCE;
                    C.f33536g.getClass();
                    C b11 = C.a.b("multipart/form-data");
                    companion.getClass();
                    H a12 = K.Companion.a(a11, b11);
                    aVar3.getClass();
                    D.c b12 = D.c.a.b("image", name, a12);
                    FintechRecoveryCameraApi value = this.f10832a.getValue();
                    aVar.f10819d = this;
                    aVar.f10820e = a11;
                    aVar.f10823h = 1;
                    if (value.uploadPassportPhoto(str, b12, aVar) == aVar2) {
                        return aVar2;
                    }
                    dVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a11 = aVar.f10820e;
                    dVar = aVar.f10819d;
                    s.b(obj);
                }
                dVar.getClass();
                a(null, a11);
                return Unit.f71690a;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f10821f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f10823h;
        if (i11 != 0) {
        }
        dVar.getClass();
        a(null, a11);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull Uri uri, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        File a11;
        d dVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f10828h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f10828h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f10826f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f10828h;
                if (i11 != 0) {
                    s.b(obj);
                    a11 = C9923b.a(uri);
                    D.c.a aVar2 = D.c.f33553c;
                    String name = a11.getName();
                    K.Companion companion = K.INSTANCE;
                    C.f33536g.getClass();
                    C b11 = C.a.b("multipart/form-data");
                    companion.getClass();
                    H a12 = K.Companion.a(a11, b11);
                    aVar2.getClass();
                    D.c b12 = D.c.a.b("image", name, a12);
                    FintechRecoveryCameraApi value = this.f10832a.getValue();
                    bVar.f10824d = this;
                    bVar.f10825e = a11;
                    bVar.f10828h = 1;
                    if (value.uploadSelfiePhoto(str, b12, bVar) == aVar) {
                        return aVar;
                    }
                    dVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a11 = bVar.f10825e;
                    dVar = bVar.f10824d;
                    s.b(obj);
                }
                dVar.getClass();
                a(null, a11);
                return Unit.f71690a;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f10826f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f10828h;
        if (i11 != 0) {
        }
        dVar.getClass();
        a(null, a11);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull Uri uri, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f10831f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f10831f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f10829d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f10831f;
                if (i11 != 0) {
                    s.b(obj);
                    File a11 = C9923b.a(uri);
                    K.Companion companion = K.INSTANCE;
                    C.f33536g.getClass();
                    C b11 = C.a.b("multipart/form-data");
                    companion.getClass();
                    H a12 = K.Companion.a(a11, b11);
                    D.c.a aVar2 = D.c.f33553c;
                    String name = a11.getName();
                    aVar2.getClass();
                    D.c b12 = D.c.a.b("video", name, a12);
                    FintechRecoveryCameraApi value = this.f10832a.getValue();
                    cVar2.f10831f = 1;
                    obj = value.uploadVideo(str, b12, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((CameraVideoUploadResponse) obj).getFileKey();
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f10829d;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f10831f;
        if (i11 != 0) {
        }
        return ((CameraVideoUploadResponse) obj2).getFileKey();
    }
}
