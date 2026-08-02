package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* renamed from: Ve.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4197e implements Tq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4793yk f30899a;

    public C4197e(C4806z5 resourceManager, InterfaceC4793yk commonRepository) {
        Intrinsics.checkNotNullParameter(resourceManager, "resourceManager");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.f30899a = commonRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        wr wrVar;
        int i11;
        ContentResponse contentResponse;
        if (cVar instanceof wr) {
            wrVar = (wr) cVar;
            int i12 = wrVar.f32395f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wrVar.f32395f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wrVar.f32393d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = wrVar.f32395f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    wrVar.f32395f = 1;
                    obj = ((C4249fm) this.f30899a).e(wrVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                contentResponse = (ContentResponse) obj;
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    return (SPaySdkConfig) ((ContentResponse.Success) contentResponse).getData();
                }
                if (contentResponse instanceof ContentResponse.Failure) {
                    return null;
                }
                throw new Sc.o();
            }
        }
        wrVar = new wr(this, cVar);
        Object obj2 = wrVar.f32393d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = wrVar.f32395f;
        if (i11 != 0) {
        }
        contentResponse = (ContentResponse) obj2;
        if (!(contentResponse instanceof ContentResponse.Success)) {
        }
    }
}
