package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* loaded from: classes10.dex */
public final class Ef {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f28928a;

    public Ef(InterfaceC4524p8 sPayRepository) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        this.f28928a = sPayRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4242ff c4242ff;
        int i11;
        Ef ef2;
        ContentResponse contentResponse;
        if (cVar instanceof C4242ff) {
            c4242ff = (C4242ff) cVar;
            int i12 = c4242ff.f31034g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4242ff.f31034g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4242ff.f31032e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4242ff.f31034g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (sdkAuthRequestBody == null) {
                        return new Sm("Некорректный формат запроса или ответа");
                    }
                    c4242ff.f31031d = this;
                    c4242ff.f31034g = 1;
                    obj = ((C4710vl) this.f28928a).s(sdkAuthRequestBody, c4242ff);
                    if (obj == aVar) {
                        return aVar;
                    }
                    ef2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ef2 = c4242ff.f31031d;
                    Sc.s.b(obj);
                }
                contentResponse = (ContentResponse) obj;
                ef2.getClass();
                if (!(contentResponse instanceof ContentResponse.Failure)) {
                    ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                    ErrorEntity error = failure.getError();
                    return error instanceof ErrorEntity.ApiError ? new Cb(failure.getError()) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new C4761xg() : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new Sm("Системная или внутренняя ошибка") : new Sm("Некорректный формат запроса или ответа");
                }
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new Sc.o();
                }
                Object data = ((ContentResponse.Success) contentResponse).getData();
                Intrinsics.f(data);
                return new C4379k8((SdkAuthResponseBody) data);
            }
        }
        c4242ff = new C4242ff(this, cVar);
        Object obj2 = c4242ff.f31032e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4242ff.f31034g;
        if (i11 != 0) {
        }
        contentResponse = (ContentResponse) obj2;
        ef2.getClass();
        if (!(contentResponse instanceof ContentResponse.Failure)) {
        }
    }
}
