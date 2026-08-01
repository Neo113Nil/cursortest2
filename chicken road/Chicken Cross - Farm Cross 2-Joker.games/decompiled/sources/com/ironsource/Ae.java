package com.ironsource;

import android.content.Context;
import com.ironsource.Ae;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ae implements Cc {

    /* renamed from: a, reason: collision with root package name */
    public static final Ae f7554a = new Ae();
    private static final De b = new De();

    public static final class a implements InterfaceC4626re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4626re f7555a;

        a(InterfaceC4626re interfaceC4626re) {
            this.f7555a = interfaceC4626re;
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4519le sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            De de = Ae.b;
            final InterfaceC4626re interfaceC4626re = this.f7555a;
            de.c(new Runnable() { // from class: com.ironsource.Ae$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(C4519le.this, interfaceC4626re);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4519le sdkConfig, InterfaceC4626re listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Ae.f7554a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC4626re
        public void a(final C4555ne error, final C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            De de = Ae.b;
            final InterfaceC4626re interfaceC4626re = this.f7555a;
            de.b(new Runnable() { // from class: com.ironsource.Ae$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a.a(InterfaceC4626re.this, error, c4371d9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4626re listener, C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error, c4371d9);
        }
    }

    private Ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4662te initRequest, InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new T9().a(EnumC4644se.LEVEL_PLAY_INIT);
        f7554a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4662te initRequest, InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p g = com.ironsource.mediationsdk.p.g();
        String d = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = g.a(context, d, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new T9().a(EnumC4644se.EXTERNAL_MEDIATION_INIT);
        f7554a.a(context, initRequest, listener, true);
    }

    public final void c(final Context context, final C4662te initRequest, final InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Ae.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.Cc
    public void onInitFailed(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b.c(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Ae.a(IronSourceError.this);
            }
        });
    }

    public final void a(final Context context, final C4662te initRequest, final InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.c(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C4662te c4662te, final InterfaceC4626re interfaceC4626re, boolean z) {
        String f = c4662te.f();
        if (f != null && f.length() > 0) {
            com.ironsource.mediationsdk.p.g().j(c4662te.f());
        } else {
            c4662te = new C4662te(c4662te.d(), com.ironsource.mediationsdk.p.g().i(), CollectionsKt.toMutableList((Collection) c4662te.e()));
        }
        com.ironsource.mediationsdk.p g = com.ironsource.mediationsdk.p.g();
        String d = c4662te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4662te.e().toArray(new IronSource.a[0]);
        final IronSourceError a2 = g.a(context, d, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 != null && a2.getErrorCode() != 2020) {
            if (a2.getErrorCode() == 2040) {
                Te d2 = com.ironsource.mediationsdk.p.g().d();
                if (d2 != null) {
                    a(new C4519le(new C4680ue(d2), null, null, 6, null), interfaceC4626re);
                    return;
                }
            } else if (a2.getErrorCode() == 2030) {
                C4770ze.l.a().d();
                return;
            }
            b.b(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(InterfaceC4626re.this, a2);
                }
            });
            return;
        }
        C4770ze.l.a().a(context, c4662te, new a(interfaceC4626re));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Te serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C4770ze.l.a().a(new C4680ue(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4626re listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        InterfaceC4626re.a(listener, new C4555ne(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C4519le c4519le, final InterfaceC4626re interfaceC4626re) {
        if (!com.ironsource.mediationsdk.p.g().a(false, c4519le.d())) {
            b.b(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(InterfaceC4626re.this);
                }
            });
        } else {
            b.b(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    Ae.a(InterfaceC4626re.this, c4519le);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        InterfaceC4626re.a(listener, new C4555ne(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4626re listener, C4519le sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Cc
    public void a(final Te serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.c(new Runnable() { // from class: com.ironsource.Ae$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ae.b(Te.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        C4770ze.l.a().a(new C4555ne(error));
    }
}
