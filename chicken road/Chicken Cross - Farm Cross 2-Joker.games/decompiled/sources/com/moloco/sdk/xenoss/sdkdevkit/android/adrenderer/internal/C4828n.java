package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4828n implements InterfaceC4827m {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i f11057a;
    public final com.moloco.sdk.internal.error.b b;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", f = "DECLoader.kt", i = {0, 0, 0, 0}, l = {31}, m = "load", n = {"this", "decToLoad", "mtid", "appIconUri"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f11058a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return C4828n.this.a(null, null, this);
        }
    }

    public C4828n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.f11057a = mediaCacheRepository;
        this.b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC4827m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(C4823i c4823i, String str, Continuation<? super C4823i> continuation) {
        a aVar;
        int i;
        String d;
        Object a2;
        C4828n c4828n;
        i.a aVar2;
        C4823i c4823i2;
        C4823i c4823i3 = c4823i;
        String str2 = str;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4824j n = c4823i.n();
                    if (n == null || (d = n.d()) == null) {
                        this.b.a(C4829o.b, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                        C4829o.b("can't precache DEC: appIconUri is null");
                        return c4823i3;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.f11057a;
                    aVar.f11058a = this;
                    aVar.b = c4823i3;
                    aVar.c = str2;
                    aVar.d = d;
                    aVar.g = 1;
                    a2 = iVar.a(d, aVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c4828n = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) aVar.d;
                    str2 = (String) aVar.c;
                    C4823i c4823i4 = (C4823i) aVar.b;
                    C4828n c4828n2 = (C4828n) aVar.f11058a;
                    ResultKt.throwOnFailure(obj);
                    d = str3;
                    c4823i3 = c4823i4;
                    c4828n = c4828n2;
                    a2 = obj;
                }
                aVar2 = (i.a) a2;
                if (aVar2 instanceof i.a.b) {
                    c4828n.b.a(C4829o.f11059a, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                    C4829o.b("dec loading error: " + aVar2 + ": `Not found` for " + d);
                    c4823i2 = null;
                } else {
                    c4823i2 = r8.a((r20 & 1) != 0 ? r8.f10985a : null, (r20 & 2) != 0 ? r8.b : null, (r20 & 4) != 0 ? r8.c : null, (r20 & 8) != 0 ? r8.d : null, (r20 & 16) != 0 ? r8.e : null, (r20 & 32) != 0 ? r8.f : null, (r20 & 64) != 0 ? r8.g : null, (r20 & 128) != 0 ? r8.h : new C4824j(c4823i3.n().f(), ((i.a.b) aVar2).a().getAbsolutePath(), c4823i3.n().e()), (r20 & 256) != 0 ? c4823i3.i : null);
                }
                return c4823i2 != null ? c4823i3 : c4823i2;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        aVar2 = (i.a) a2;
        if (aVar2 instanceof i.a.b) {
        }
        if (c4823i2 != null) {
        }
    }
}
