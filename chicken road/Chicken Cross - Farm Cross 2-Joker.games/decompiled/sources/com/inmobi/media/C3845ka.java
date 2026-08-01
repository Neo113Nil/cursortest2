package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3845ka extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7200a;
    public final /* synthetic */ EnumC3779i b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Ref.ObjectRef f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3845ka(EnumC3779i enumC3779i, Context context, boolean z, String str, Ref.ObjectRef objectRef, Continuation continuation) {
        super(1, continuation);
        this.b = enumC3779i;
        this.c = context;
        this.d = z;
        this.e = str;
        this.f = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ref.ObjectRef objectRef) {
        InMobiSdk.access$onInitCompleted(InMobiSdk.INSTANCE, (Pa) objectRef.element, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Ref.ObjectRef objectRef) {
        InMobiSdk.access$onInitCompleted(InMobiSdk.INSTANCE, (Pa) objectRef.element, "SDK could not be initialized; an unexpected error was encountered.");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3845ka(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3845ka) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runBlocking$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7200a;
        int i2 = 0;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b == EnumC3779i.c) {
                    C3859kn c3859kn = C3859kn.f7207a;
                    C3859kn.c(this.c);
                }
                C3859kn c3859kn2 = C3859kn.f7207a;
                C3859kn.a(this.c);
                if (this.d) {
                    Context context = AbstractC3914mk.f7252a;
                    String primaryAccountId = this.e;
                    Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
                    Context context2 = AbstractC3914mk.f7252a;
                    if (context2 != null) {
                        ConcurrentHashMap concurrentHashMap = Db.b;
                        Cb.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                    }
                }
                Context context3 = AbstractC3914mk.f7252a;
                if (context3 != null) {
                    File file = new File(context3.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                    } else {
                        Intrinsics.checkNotNullExpressionValue("mk", "TAG");
                    }
                }
                Context context4 = this.c;
                this.f7200a = 1;
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C3830jn(context4, null), 1, null);
                if (runBlocking$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte b = AbstractC4027qk.f;
            final Ref.ObjectRef objectRef = this.f;
            byte b2 = ((Pa) objectRef.element).c;
            byte b3 = b;
            if (b2 == 1 && b3 == 1) {
                i2 = 2;
            } else if (b2 == 2 && b3 == 2) {
                i2 = 3;
            } else if (b2 == 1) {
                i2 = 1;
            }
            AbstractC3914mk.j = 2;
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ka$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3845ka.a(Ref.ObjectRef.this);
                }
            });
            C3770hi.f7146a.getClass();
            CoroutineScope coroutineScope = AbstractC3904ma.f;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C3629ci(null), 3, null);
            if (!C3770hi.j.getAndSet(true)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C3741gi(null), 3, null);
            }
            Ta ta = Ta.f6869a;
            LinkedHashMap a2 = Ta.a(((Pa) this.f.element).f, (short) i2);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("SdkInitialized", a2, EnumC3944nm.f7271a);
            InMobiUnifiedIdService.push(D7.b);
        } catch (Exception unused) {
            AbstractC3914mk.c = null;
            AbstractC3914mk.f7252a = null;
            AbstractC3914mk.j = 3;
            final Ref.ObjectRef objectRef2 = this.f;
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ka$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C3845ka.b(Ref.ObjectRef.this);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
