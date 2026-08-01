package com.vungle.ads.internal.load;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11936a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.vungle.ads.internal.downloader.e c;
    public final /* synthetic */ com.vungle.ads.internal.downloader.l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str, c cVar, com.vungle.ads.internal.downloader.l lVar) {
        super(1);
        this.f11936a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AtomicBoolean atomicBoolean;
        Object value = ((Result) obj).getValue();
        atomicBoolean = this.f11936a.l;
        if (atomicBoolean.get()) {
            boolean z = u.f12190a;
            t.a("BaseAdLoader", com.iab.omid.library.vungle.internal.l.a("Template callback ignored after cancel: ").append(this.b).toString());
        } else {
            com.vungle.ads.internal.downloader.e eVar = this.c;
            com.vungle.ads.internal.downloader.l lVar = this.d;
            if (Result.m8086isSuccessimpl(value)) {
                eVar.a((File) value, lVar);
            }
            com.vungle.ads.internal.downloader.e eVar2 = this.c;
            com.vungle.ads.internal.downloader.l lVar2 = this.d;
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
            if (m8082exceptionOrNullimpl != null) {
                eVar2.a(new com.vungle.ads.internal.downloader.c(-1, m8082exceptionOrNullimpl, 1), lVar2);
            }
        }
        return Unit.INSTANCE;
    }
}
