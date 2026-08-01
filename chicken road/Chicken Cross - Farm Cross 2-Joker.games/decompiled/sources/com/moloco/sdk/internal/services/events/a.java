package com.moloco.sdk.internal.services.events;

import android.net.Uri;
import com.moloco.sdk.UserIntent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.A;
import com.moloco.sdk.internal.services.AbstractC4802c;
import com.moloco.sdk.internal.services.B;
import com.moloco.sdk.internal.services.C4809j;
import com.moloco.sdk.internal.services.E;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.InterfaceC4803d;
import com.moloco.sdk.internal.services.InterfaceC4810k;
import com.moloco.sdk.internal.services.proto.a;
import com.moloco.sdk.internal.services.usertracker.f;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a {
    public static final int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4810k f10788a;
    public final B b;
    public final y c;
    public final F d;
    public final f e;
    public final InterfaceC4803d f;
    public final com.moloco.sdk.internal.services.proto.a g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h;
    public final String i;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", i = {0, 0, 0, 0}, l = {67}, m = "userAdInteractionExt", n = {"this", "interaction", "$this$userAdInteractionExt_u24lambda_u240", "eventTimestamp"}, s = {"L$0", "L$1", "L$3", "J$0"})
    /* renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    public static final class C1501a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10789a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public C1501a(Continuation<? super C1501a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return a.this.a(0L, (a.AbstractC1622a) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", i = {0}, l = {52}, m = "userAdInteractionExtAsQueryParameter", n = {"url"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10790a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.a(0L, (a.AbstractC1622a) null, (String) null, this);
        }
    }

    public a(InterfaceC4810k appInfoService, B networkInfoService, y deviceInfoService, F screenInfoService, f userIdentifierService, InterfaceC4803d adDataService, com.moloco.sdk.internal.services.proto.a encoderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c userEventConfigService, String sdkVersion) {
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        Intrinsics.checkNotNullParameter(userIdentifierService, "userIdentifierService");
        Intrinsics.checkNotNullParameter(adDataService, "adDataService");
        Intrinsics.checkNotNullParameter(encoderService, "encoderService");
        Intrinsics.checkNotNullParameter(userEventConfigService, "userEventConfigService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f10788a = appInfoService;
        this.b = networkInfoService;
        this.c = deviceInfoService;
        this.d = screenInfoService;
        this.e = userIdentifierService;
        this.f = adDataService;
        this.g = encoderService;
        this.h = userEventConfigService;
        this.i = sdkVersion;
    }

    public final InterfaceC4810k b() {
        return this.f10788a;
    }

    public final y c() {
        return this.c;
    }

    public final com.moloco.sdk.internal.services.proto.a d() {
        return this.g;
    }

    public final B e() {
        return this.b;
    }

    public final F f() {
        return this.d;
    }

    public final String g() {
        return this.i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h() {
        return this.h;
    }

    public final f i() {
        return this.e;
    }

    public final InterfaceC4803d a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j2, a.AbstractC1622a abstractC1622a, String str, Continuation<? super String> continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.h.c()) {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.events.b.f10791a, "Event reporting config disabled, UserAdInteractionExt not reporting", false, 4, null);
                        return str;
                    }
                    bVar.f10790a = str;
                    bVar.d = 1;
                    obj = a(j2, abstractC1622a, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) bVar.f10790a;
                    ResultKt.throwOnFailure(obj);
                }
                String uri = Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (String) obj).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return uri;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        String uri2 = Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (String) obj2).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j2, a.AbstractC1622a abstractC1622a, Continuation<? super String> continuation) {
        C1501a c1501a;
        int i;
        UserIntent.UserAdInteractionExt.Builder newBuilder;
        a aVar;
        UserIntent.UserAdInteractionExt.Builder builder;
        a.AbstractC1622a abstractC1622a2;
        UserIntent.UserAdInteractionExt.Builder builder2;
        UserIntent.UserAdInteractionExt.Builder builder3;
        AbstractC4802c a2;
        if (continuation instanceof C1501a) {
            c1501a = (C1501a) continuation;
            int i2 = c1501a.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1501a.i = i2 - Integer.MIN_VALUE;
                Object obj = c1501a.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1501a.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    newBuilder = UserIntent.UserAdInteractionExt.newBuilder();
                    if (this.h.b()) {
                        f fVar = this.e;
                        c1501a.f10789a = this;
                        c1501a.b = abstractC1622a;
                        c1501a.c = newBuilder;
                        c1501a.d = newBuilder;
                        c1501a.e = newBuilder;
                        c1501a.f = j2;
                        c1501a.i = 1;
                        Object b2 = fVar.b(c1501a);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        abstractC1622a2 = abstractC1622a;
                        builder2 = newBuilder;
                        builder3 = builder2;
                        builder = builder3;
                        obj = b2;
                        aVar = this;
                    } else {
                        aVar = this;
                        builder = newBuilder;
                        a2 = aVar.f.a();
                        if (a2 instanceof AbstractC4802c.a) {
                            newBuilder.setAdvertisingId(((AbstractC4802c.a) a2).b());
                        } else if (!(a2 instanceof AbstractC4802c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        newBuilder.setClientTimestamp(j2);
                        Intrinsics.checkNotNull(newBuilder);
                        aVar.a(newBuilder);
                        aVar.a(newBuilder, abstractC1622a, aVar.d.invoke());
                        aVar.a(newBuilder, aVar.f10788a.invoke());
                        aVar.a(newBuilder, aVar.c.invoke());
                        aVar.a(newBuilder, aVar.b.invoke());
                        UserIntent.UserAdInteractionExt build = builder.build();
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.f10791a, "Encoding protobuf UserAdInteractionExt: " + build, false, 4, null);
                        com.moloco.sdk.internal.services.proto.a aVar2 = aVar.g;
                        Intrinsics.checkNotNull(build);
                        String a3 = a.C1502a.a(aVar2, build, 0, 2, null);
                        MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.f10791a, "Successfully built userAdInteractionExt as base64 string: " + a3, false, 4, null);
                        return a3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = c1501a.f;
                    builder2 = (UserIntent.UserAdInteractionExt.Builder) c1501a.e;
                    builder3 = (UserIntent.UserAdInteractionExt.Builder) c1501a.d;
                    builder = (UserIntent.UserAdInteractionExt.Builder) c1501a.c;
                    abstractC1622a2 = (a.AbstractC1622a) c1501a.b;
                    aVar = (a) c1501a.f10789a;
                    ResultKt.throwOnFailure(obj);
                }
                builder2.setMref((String) obj);
                newBuilder = builder3;
                abstractC1622a = abstractC1622a2;
                a2 = aVar.f.a();
                if (a2 instanceof AbstractC4802c.a) {
                }
                newBuilder.setClientTimestamp(j2);
                Intrinsics.checkNotNull(newBuilder);
                aVar.a(newBuilder);
                aVar.a(newBuilder, abstractC1622a, aVar.d.invoke());
                aVar.a(newBuilder, aVar.f10788a.invoke());
                aVar.a(newBuilder, aVar.c.invoke());
                aVar.a(newBuilder, aVar.b.invoke());
                UserIntent.UserAdInteractionExt build2 = builder.build();
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.f10791a, "Encoding protobuf UserAdInteractionExt: " + build2, false, 4, null);
                com.moloco.sdk.internal.services.proto.a aVar22 = aVar.g;
                Intrinsics.checkNotNull(build2);
                String a32 = a.C1502a.a(aVar22, build2, 0, 2, null);
                MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.f10791a, "Successfully built userAdInteractionExt as base64 string: " + a32, false, 4, null);
                return a32;
            }
        }
        c1501a = new C1501a(continuation);
        Object obj2 = c1501a.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1501a.i;
        if (i != 0) {
        }
        builder2.setMref((String) obj2);
        newBuilder = builder3;
        abstractC1622a = abstractC1622a2;
        a2 = aVar.f.a();
        if (a2 instanceof AbstractC4802c.a) {
        }
        newBuilder.setClientTimestamp(j2);
        Intrinsics.checkNotNull(newBuilder);
        aVar.a(newBuilder);
        aVar.a(newBuilder, abstractC1622a, aVar.d.invoke());
        aVar.a(newBuilder, aVar.f10788a.invoke());
        aVar.a(newBuilder, aVar.c.invoke());
        aVar.a(newBuilder, aVar.b.invoke());
        UserIntent.UserAdInteractionExt build22 = builder.build();
        MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.f10791a, "Encoding protobuf UserAdInteractionExt: " + build22, false, 4, null);
        com.moloco.sdk.internal.services.proto.a aVar222 = aVar.g;
        Intrinsics.checkNotNull(build22);
        String a322 = a.C1502a.a(aVar222, build22, 0, 2, null);
        MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.f10791a, "Successfully built userAdInteractionExt as base64 string: " + a322, false, 4, null);
        return a322;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder) {
        UserIntent.UserAdInteractionExt.MolocoSDK.Builder newBuilder = UserIntent.UserAdInteractionExt.MolocoSDK.newBuilder();
        newBuilder.setCoreVer(this.i);
        builder.setSdk(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, x xVar) {
        UserIntent.UserAdInteractionExt.Device.Builder newBuilder = UserIntent.UserAdInteractionExt.Device.newBuilder();
        newBuilder.setOsVer(xVar.x());
        newBuilder.setModel(xVar.v());
        newBuilder.setOs(UserIntent.UserAdInteractionExt.Device.OsType.ANDROID);
        newBuilder.setScreenScale(xVar.y());
        builder.setDevice(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, A a2) {
        UserIntent.UserAdInteractionExt.Network.Builder newBuilder = UserIntent.UserAdInteractionExt.Network.newBuilder();
        if (a2 instanceof A.a) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.CELLULAR);
            newBuilder.setCarrier(((A.a) a2).a());
        } else if (Intrinsics.areEqual(a2, A.b.b)) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.UNKNOWN);
        } else if (Intrinsics.areEqual(a2, A.c.b)) {
            newBuilder.setConnectionType(UserIntent.UserAdInteractionExt.Network.ConnectionType.WIFI);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        builder.setNetwork(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, C4809j c4809j) {
        UserIntent.UserAdInteractionExt.App.Builder newBuilder = UserIntent.UserAdInteractionExt.App.newBuilder();
        newBuilder.setId(c4809j.b());
        newBuilder.setVer(c4809j.c());
        builder.setApp(newBuilder.build());
        return builder;
    }

    public final UserIntent.UserAdInteractionExt.Builder a(UserIntent.UserAdInteractionExt.Builder builder, a.AbstractC1622a abstractC1622a, E e) {
        if (abstractC1622a instanceof a.AbstractC1622a.e) {
            builder.setImpInteraction(UserIntent.UserAdInteractionExt.ImpressionInteraction.newBuilder().build());
        } else if (abstractC1622a instanceof a.AbstractC1622a.d) {
            UserIntent.UserAdInteractionExt.ClickInteraction.Builder newBuilder = UserIntent.UserAdInteractionExt.ClickInteraction.newBuilder();
            a.AbstractC1622a.d dVar = (a.AbstractC1622a.d) abstractC1622a;
            newBuilder.setClickPos(com.moloco.sdk.internal.services.events.b.a(dVar.b()));
            newBuilder.setScreenSize(com.moloco.sdk.internal.services.events.b.a(e));
            a.AbstractC1622a.g d = dVar.d();
            if (d != null) {
                newBuilder.setViewSize(com.moloco.sdk.internal.services.events.b.a(d));
            }
            a.AbstractC1622a.f c = dVar.c();
            if (c != null) {
                newBuilder.setViewPos(com.moloco.sdk.internal.services.events.b.a(c));
            }
            List<a.AbstractC1622a.c> a2 = dVar.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
            for (a.AbstractC1622a.c cVar : a2) {
                UserIntent.UserAdInteractionExt.Button.Builder newBuilder2 = UserIntent.UserAdInteractionExt.Button.newBuilder();
                newBuilder2.setType(com.moloco.sdk.internal.services.events.b.a(cVar.d()));
                newBuilder2.setPos(com.moloco.sdk.internal.services.events.b.a(cVar.e()));
                newBuilder2.setSize(com.moloco.sdk.internal.services.events.b.a(cVar.f()));
                arrayList.add(newBuilder2.build());
            }
            newBuilder.addAllButtons(arrayList);
            builder.setClickInteraction((UserIntent.UserAdInteractionExt.ClickInteraction) newBuilder.build());
        } else if (abstractC1622a instanceof a.AbstractC1622a.b) {
            UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder newBuilder3 = UserIntent.UserAdInteractionExt.AppForegroundingInteraction.newBuilder();
            newBuilder3.setBgTsMs(((a.AbstractC1622a.b) abstractC1622a).b());
            builder.setAppForegroundingInteraction(newBuilder3.build());
        } else if (abstractC1622a instanceof a.AbstractC1622a.C1623a) {
            builder.setAppBackgroundingInteraction(UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.newBuilder().build());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return builder;
    }
}
