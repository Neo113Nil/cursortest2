package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class m implements l {
    public static final int i = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11166a;
    public final ActivityResultLauncher<Intent> b;
    public final CoroutineScope c;
    public final Flow<Boolean> d;
    public final long e;
    public final Function3<String, String, String, Intent> f;
    public final Function2<PackageManager, Intent, Boolean> g;
    public a h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11167a;
        public final Function1<j, Unit> b;
        public final Job c;
        public final Job d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function1<? super j, Unit> onOutcome, Job timeoutJob, Job fgJob) {
            Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            this.f11167a = z;
            this.b = onOutcome;
            this.c = timeoutJob;
            this.d = fgJob;
        }

        public final boolean a() {
            return this.f11167a;
        }

        public final Function1<j, Unit> b() {
            return this.b;
        }

        public final Job c() {
            return this.c;
        }

        public final Job d() {
            return this.d;
        }

        public final boolean e() {
            return this.f11167a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11167a == aVar.f11167a && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        public final Job f() {
            return this.d;
        }

        public final Function1<j, Unit> g() {
            return this.b;
        }

        public final Job h() {
            return this.c;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f11167a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "LaunchState(backgroundedSinceLaunch=" + this.f11167a + ", onOutcome=" + this.b + ", timeoutJob=" + this.c + ", fgJob=" + this.d + ')';
        }

        public final a a(boolean z, Function1<? super j, Unit> onOutcome, Job timeoutJob, Job fgJob) {
            Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            return new a(z, onOutcome, timeoutJob, fgJob);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, boolean z, Function1 function1, Job job, Job job2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f11167a;
            }
            if ((i & 2) != 0) {
                function1 = aVar.b;
            }
            if ((i & 4) != 0) {
                job = aVar.c;
            }
            if ((i & 8) != 0) {
                job2 = aVar.d;
            }
            return aVar.a(z, function1, job, job2);
        }

        public final void a(boolean z) {
            this.f11167a = z;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$fgJob$1", f = "StoreLauncher.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11168a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f11169a;

            public a(m mVar) {
                this.f11169a = mVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                a aVar;
                if (!z && (aVar = this.f11169a.h) != null) {
                    aVar.a(true);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11168a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = m.this.d;
                a aVar = new a(m.this);
                this.f11168a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$timeoutJob$1", f = "StoreLauncher.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11170a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11170a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = m.this.e;
                this.f11170a = 1;
                if (DelayKt.m9571delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m.this.cancel();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j, Function3 function3, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, j, function3, function2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void cancel() {
        Job f;
        Job h;
        a aVar = this.h;
        if (aVar != null && (h = aVar.h()) != null) {
            Job.DefaultImpls.cancel$default(h, (CancellationException) null, 1, (Object) null);
        }
        a aVar2 = this.h;
        if (aVar2 != null && (f = aVar2.f()) != null) {
            Job.DefaultImpls.cancel$default(f, (CancellationException) null, 1, (Object) null);
        }
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, ActivityResultLauncher<Intent> installLauncher, CoroutineScope scope, Flow<Boolean> foregroundFlow, long j, Function3<? super String, ? super String, ? super String, ? extends Intent> intentFactory, Function2<? super PackageManager, ? super Intent, Boolean> canResolve) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(installLauncher, "installLauncher");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(foregroundFlow, "foregroundFlow");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(canResolve, "canResolve");
        this.f11166a = context;
        this.b = installLauncher;
        this.c = scope;
        this.d = foregroundFlow;
        this.e = j;
        this.f = intentFactory;
        this.g = canResolve;
    }

    public static final Intent a(String bundleId, String str, String caller) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        String str2 = "https://play.google.com/d?id=" + bundleId;
        if (str != null) {
            str2 = str2 + "&referrer=" + str;
        }
        Uri parse = Uri.parse(str2);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        intent.setData(parse);
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", caller);
        return intent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j, Function3 function3, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, r7, (i2 & 32) != 0 ? new Function3() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return m.a((String) obj, (String) obj2, (String) obj3);
            }
        } : function3, (i2 & 64) != 0 ? new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(m.a((PackageManager) obj, (Intent) obj2));
            }
        } : function2, null);
        long j2;
        if ((i2 & 16) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j2 = DurationKt.toDuration(60, DurationUnit.SECONDS);
        } else {
            j2 = j;
        }
    }

    public static final boolean a(PackageManager pm, Intent i2) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(i2, "i");
        return i2.resolveActivity(pm) != null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public boolean a(String bundleId, String str, Function1<? super j, Unit> onOutcome) {
        Job launch$default;
        Job launch$default2;
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
        cancel();
        Function3<String, String, String, Intent> function3 = this.f;
        String packageName = this.f11166a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Intent invoke = function3.invoke(bundleId, str, packageName);
        Function2<PackageManager, Intent, Boolean> function2 = this.g;
        PackageManager packageManager = this.f11166a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        if (!function2.invoke(packageManager, invoke).booleanValue()) {
            return false;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new b(null), 3, null);
        launch$default2 = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new c(null), 3, null);
        this.h = new a(false, onOutcome, launch$default2, launch$default);
        this.b.launch(invoke);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void a(int i2) {
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(aVar.h(), (CancellationException) null, 1, (Object) null);
        Job.DefaultImpls.cancel$default(aVar.f(), (CancellationException) null, 1, (Object) null);
        aVar.g().invoke(aVar.e() ? j.a.b : j.c.b);
        this.h = null;
    }
}
