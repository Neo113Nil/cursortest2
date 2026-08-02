package Ve;

import Sc.r;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;
import sf.InterfaceC9683i;
import spay.seamlessAuth.core.data.network.dto.ExchangeTokenResponseDto;

/* loaded from: classes10.dex */
public final class Ek implements InterfaceC4866h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.h f28938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.K f28939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.M f28940c;

    public Ek(kotlin.coroutines.h hVar, kotlin.jvm.internal.K k11, kotlin.jvm.internal.M m11) {
        this.f28938a = hVar;
        this.f28939b = k11;
        this.f28940c = m11;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(InterfaceC4865g call, IOException e11) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
        String errorMessage = e11.getMessage();
        if (errorMessage == null) {
            errorMessage = "Error message was empty";
        }
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        C4347j5 c4347j5 = new C4347j5();
        r.Companion companion = Sc.r.INSTANCE;
        this.f28938a.resumeWith(c4347j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // We.InterfaceC4866h
    public final void onResponse(InterfaceC4865g call, We.L response) {
        InterfaceC9683i source;
        Charset UTF_8;
        Object a11;
        We.M c11;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        M1.b.i(response);
        kotlin.jvm.internal.M m11 = this.f28940c;
        m11.f71787a = response;
        this.f28939b.f71785a = response.m();
        C4274gi c4274gi = new C4274gi(response, 1);
        Lm0.a.f17149a.e("EVENT!!!_IS_SUCCESS --- " + response.v(), new Object[0]);
        boolean v11 = response.v();
        kotlin.coroutines.h hVar = this.f28938a;
        if (!v11) {
            r.Companion companion = Sc.r.INSTANCE;
            hVar.resumeWith(c4274gi.invoke());
            return;
        }
        We.z r11 = response.r();
        We.M c12 = response.c();
        if (c12 == null || (source = c12.source()) == null) {
            return;
        }
        source.n(Long.MAX_VALUE);
        C9681g f7 = source.f();
        if ("gzip".equalsIgnoreCase(r11.c("Content-Encoding"))) {
            sf.t tVar = new sf.t(f7);
            try {
                f7 = new C9681g();
                f7.y0(tVar);
                tVar.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Vd0.b.a(tVar, th2);
                    throw th3;
                }
            }
        }
        We.C contentType = c12.contentType();
        if (contentType == null || (UTF_8 = contentType.c(StandardCharsets.UTF_8)) == null) {
            UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        }
        String t02 = f7.t0(UTF_8);
        try {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = G9.f29065a.d(t02, ExchangeTokenResponseDto.class);
        } catch (Throwable th4) {
            r.Companion companion3 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th4);
        }
        boolean z11 = a11 instanceof r.b;
        Object obj = z11 ? null : a11;
        if (z11 || obj == null) {
            Log.w("PARSER", "Gson couldn't deserialize " + ExchangeTokenResponseDto.class + " - " + t02 + " \nCause: " + Sc.r.b(a11));
        }
        if (obj == null) {
            hVar.resumeWith(c4274gi.invoke());
            return;
        }
        We.L l11 = (We.L) m11.f71787a;
        if (l11 != null && (c11 = l11.c()) != null) {
            c11.close();
        }
        hVar.resumeWith(new C4353jb(obj));
    }
}
