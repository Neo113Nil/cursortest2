package K00;

import L00.j;
import P00.k;
import a10.C4917e;
import a10.C4919g;
import androidx.recyclerview.widget.m;
import di0.C6201a;
import di0.C6203c;
import java.util.List;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes7.dex */
public final class j<I extends C7854a> extends i<I> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L00.d f14883a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final P00.d f14884b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4917e f14885c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f10.b<I> f14886d;

    public j(@NotNull L00.d callFactory, @NotNull P00.d decoder, @NotNull C4917e redirectController, @NotNull f10.b composerViewItemProcessorFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(redirectController, "redirectController");
        Intrinsics.checkNotNullParameter(composerViewItemProcessorFactory, "composerViewItemProcessorFactory");
        this.f14883a = callFactory;
        this.f14884b = decoder;
        this.f14885c = redirectController;
        this.f14886d = composerViewItemProcessorFactory;
    }

    private final k<I> e(L00.j jVar, L00.i iVar, C4919g c4919g) {
        C6201a beginTrace = C6203c.f61631a.beginTrace(jVar.h().k());
        C6201a.f(beginTrace, EnumC7467b.DECODING_TIME_START, 0L, false, 2);
        k<I> b11 = this.f14884b.b(jVar, this.f14886d.a(iVar));
        S00.a e11 = b11.e();
        if (c4919g == null) {
            c4919g = C4919g.f36200c;
        }
        k<I> a11 = k.a(b11, S00.a.b(e11, 0L, null, c4919g, 15));
        C6201a.f(beginTrace, EnumC7467b.DECODING_TIME_END, 0L, false, 6);
        C6201a.f(beginTrace, EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_START, 0L, false, 6);
        return a11;
    }

    @Override // K00.i
    @NotNull
    public final k<I> a(@NotNull List<T00.i> widgets, L00.i iVar) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        return this.f14884b.d(widgets, this.f14886d.a(iVar));
    }

    @Override // K00.i
    @NotNull
    public final k<I> b(@NotNull L00.c call, L00.i iVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        L00.g c11 = call.c();
        C6203c c6203c = C6203c.f61631a;
        C6201a beginTrace = c6203c.beginTrace(c11.k());
        String h11 = c11.h();
        C4917e c4917e = this.f14885c;
        if (h11 != null) {
            a10.i a11 = c4917e.a(h11, c11.k());
            if (a11 != null) {
                return e(a11.b(), iVar, a11.c());
            }
            C6201a.f(beginTrace, EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_END, 0L, true, 2);
        } else {
            C6201a.f(beginTrace, EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_END, 0L, false, 2);
        }
        L00.j b11 = call.b();
        N00.a e11 = b11.e();
        String requestUuid = c11.k();
        Intrinsics.checkNotNullParameter(e11, "<this>");
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        C6201a beginTrace2 = c6203c.beginTrace(requestUuid);
        C6201a.f(beginTrace2, EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_START, e11.m(), false, 4);
        C6201a.f(beginTrace2, EnumC7467b.NETWORK_REQUEST_PREPARE_TIME_END, e11.l(), false, 4);
        C6201a.f(beginTrace2, EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_START, e11.c(), false, 4);
        C6201a.f(beginTrace2, EnumC7467b.NETWORK_ADDITIONAL_REQUEST_TIME_END, e11.b(), false, 4);
        C6201a.f(beginTrace2, EnumC7467b.CACHE_TIME, 0L, false, 4);
        C6201a.f(beginTrace2, EnumC7467b.PREFETCH_TIME, 0L, false, 4);
        C4919g b12 = c4917e.b(h11, b11);
        C6201a.f(beginTrace, EnumC7467b.NETWORK_CALL_END, 0L, false, 6);
        return e(b11, iVar, b12);
    }

    @Override // K00.i
    @NotNull
    public final k c(@NotNull L00.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return b(this.f14883a.a(request), null);
    }

    @Override // K00.i
    @NotNull
    public final k<I> d(@NotNull String json, L00.i iVar) {
        L00.g gVar;
        Intrinsics.checkNotNullParameter(json, "json");
        j.a aVar = new j.a();
        aVar.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        aVar.f(DiscountCodeResponse.RESULT_OK);
        gVar = L00.g.f16089j;
        aVar.i(gVar);
        aVar.a(json);
        aVar.h(new Object());
        return e(aVar.b(), iVar, null);
    }
}
