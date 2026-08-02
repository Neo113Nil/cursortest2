package com.amplitude.android.plugins;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.amplitude.android.h;
import com.amplitude.android.utilities.f;
import com.amplitude.android.utilities.g;
import com.amplitude.core.platform.k;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

/* loaded from: classes3.dex */
public final class e implements k {
    public static final a Companion = new a();
    public final k.a a = k.a.a;

    public static final class a {
    }

    @DebugMetadata(c = "com.amplitude.android.plugins.AndroidNetworkConnectivityCheckerPlugin$setup$1", f = "AndroidNetworkConnectivityCheckerPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ com.amplitude.core.b a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amplitude.core.b bVar, f fVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.a = bVar;
            this.b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.a, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object systemService;
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            h hVar = this.a.a;
            f fVar = this.b;
            com.amplitude.common.a aVar = fVar.b;
            f.a aVar2 = f.Companion;
            Context context = fVar.a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    systemService = context.getSystemService("connectivity");
                } catch (Throwable th) {
                    aVar.d("Error checking network connectivity: " + th.getMessage());
                    aVar.d(ExceptionsKt.stackTraceToString(th));
                }
                if (systemService instanceof ConnectivityManager) {
                    Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
                    z = false;
                    if (activeNetwork != null) {
                        NetworkCapabilities networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities != null) {
                            if (!networkCapabilities.hasTransport(1)) {
                                if (networkCapabilities.hasTransport(0)) {
                                }
                            }
                        }
                    }
                    hVar.z = Boxing.boxBoolean(!z);
                    return Unit.INSTANCE;
                }
                aVar.c("Service is not an instance of ConnectivityManager. Offline mode is not supported");
            }
            z = true;
            hVar.z = Boxing.boxBoolean(!z);
            return Unit.INSTANCE;
        }
    }

    public static final class c {
        public final /* synthetic */ com.amplitude.core.b a;

        public c(com.amplitude.core.b bVar) {
            this.a = bVar;
        }

        public final void a() {
            com.amplitude.core.b bVar = this.a;
            bVar.i().c("AndroidNetworkListener, onNetworkUnavailable.");
            bVar.a.z = Boolean.TRUE;
        }
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        amplitude.i().c("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        h hVar = amplitude.a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        Context context = hVar.b;
        C1082i.c(amplitude.c, amplitude.f, null, new b(amplitude, new f(context, amplitude.i()), null), 2);
        c cVar = new c(amplitude);
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        com.amplitude.common.a i = amplitude.i();
        g gVar = new g(context, i, cVar);
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            i.c("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new com.amplitude.android.utilities.h(connectivityManager, gVar));
        } catch (Throwable th) {
            i.d("Error starting network listener: " + th.getMessage());
        }
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }
}
